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

public class TimetableSearchByCourse {

    public static void searchTimetableByCourse(JTable table, String courseID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT lectureDate, startTime, endTime, subjectName, hallNumber "
                     + "FROM Timetable "
                     + "WHERE courseID = ?";

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, courseID); // Set the courseID as a parameter in the query
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String lectureDate = rs.getString("lectureDate");
                String startTime = rs.getString("startTime");
                String endTime = rs.getString("endTime");
                String subjectName = rs.getString("subjectName");
                String hallNumber = rs.getString("hallNumber");

                // Add the data to the table model
                model.addRow(new Object[]{lectureDate, startTime, endTime, subjectName, hallNumber});
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading timetable: " + e.getMessage());
        }
    }
}