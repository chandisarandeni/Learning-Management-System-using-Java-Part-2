/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

/**
 *
 * @author chand
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class RecentTimetableLoader {

    public static void loadRecentTimetables(JTable table) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT lectureDate, startTime, endTime, subjectName, hallNumber "
                     + "FROM Timetable "
                     + "ORDER BY lectureDate DESC, startTime DESC "
                     + "LIMIT 10"; // Adjust limit as needed

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String lectureDate = rs.getString("lectureDate");
                String startTime = rs.getString("startTime");
                String endTime = rs.getString("endTime");
                String subjectName = rs.getString("subjectName");
                String hallNumber = rs.getString("hallNumber");

                // Add the data to the table model
                model.addRow(new Object[]{lectureDate, startTime, endTime, subjectName, hallNumber});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading recent timetables: " + e.getMessage());
        }
    }
}