/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentActivities.CommonClasses;

/**
 *
 * @author chand
 */
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentTimetableLoader {

    public static void loadTimetable(String studentID, JTable tbl_Timetable) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Database connection details
        String user = "root";
        String password = "";

        // Query to fetch timetable details for the student's course
        String query = "SELECT t.lectureDate, t.startTime, t.endTime, t.subjectName, t.hallNumber "
                     + "FROM Timetable t "
                     + "JOIN Student s ON t.courseID = s.courseID "
                     + "WHERE s.studentID = ?";

        DefaultTableModel model = (DefaultTableModel) tbl_Timetable.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID); // Set the studentID parameter

            ResultSet rs = pstmt.executeQuery();

            // Populate the table with retrieved data
            while (rs.next()) {
                String date = rs.getString("lectureDate");
                String startTime = rs.getString("startTime");
                String endTime = rs.getString("endTime");
                String subject = rs.getString("subjectName");
                String hall = rs.getString("hallNumber");

                model.addRow(new Object[]{date, startTime, endTime, subject, hall});
            }

            rs.close();
            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}