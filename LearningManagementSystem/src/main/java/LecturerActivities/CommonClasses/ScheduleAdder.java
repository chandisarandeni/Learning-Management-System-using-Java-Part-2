/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturerActivities.CommonClasses;

/**
 *
 * @author chand
 */
import java.sql.*;
import javax.swing.*;

public class ScheduleAdder {

    public static void addSchedule(String courseID, String subjectName, java.util.Date lectureDate, 
                                    String startTime, String endTime, String hallNumber) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "INSERT INTO Timetable (courseID, subjectName, lectureDate, startTime, endTime, hallNumber) "
                     + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            // Set parameters for the query
            pstmt.setString(1, courseID);
            pstmt.setString(2, subjectName);
            pstmt.setDate(3, new java.sql.Date(lectureDate.getTime())); // Convert java.util.Date to java.sql.Date
            pstmt.setString(4, startTime);
            pstmt.setString(5, endTime);
            pstmt.setString(6, hallNumber);

            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Schedule added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add schedule.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding schedule: " + e.getMessage());
        }
    }
}