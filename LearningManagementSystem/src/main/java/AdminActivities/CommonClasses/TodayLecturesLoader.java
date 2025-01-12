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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TodayLecturesLoader {

    public static void loadTodayLectures(JTable table) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT t.subjectName, t.courseID, t.hallNumber " +
                       "FROM Timetable t " +
                       "WHERE t.lectureDate = CURDATE()";

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                String courseID = rs.getString("courseID");
                String hallNumber = rs.getString("hallNumber");

                model.addRow(new Object[]{subjectName, courseID, hallNumber});
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}