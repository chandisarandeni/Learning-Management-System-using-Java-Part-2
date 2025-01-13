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
import javax.swing.JLabel;

public class TimetableRetriever {
    private Connection connect() {
        Connection conn = null;
        try {
            // Update with your MySQL database details
            String url = "jdbc:mysql://localhost:3306/LMS";
            String user = "root"; // Your MySQL username
            String password = ""; // Your MySQL password
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }

    public void retrieveTimetable(String studentID, JLabel lbl_currentDate, JLabel lbl_startTime, 
                                   JLabel lbl_Subject, JLabel lbl_lectureHall) {
        String query = """
            SELECT 
                t.lectureDate AS currentDate, 
                t.startTime AS startTime, 
                t.subjectName AS Subject, 
                t.hallNumber AS lectureHall
            FROM Timetable t
            JOIN Course c ON t.courseID = c.courseID
            JOIN Student s ON s.courseID = c.courseID
            WHERE s.studentID = ?;
        """;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            if (conn == null) {
                System.out.println("Database connection is null. Check connection details.");
                return;
            }

            stmt.setString(1, studentID);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Populate the labels with timetable information
                lbl_currentDate.setText(rs.getString("currentDate"));
                lbl_startTime.setText(rs.getString("startTime"));
                lbl_Subject.setText(rs.getString("Subject"));
                lbl_lectureHall.setText(rs.getString("lectureHall"));
            } else {
                // If no data is found for the student
                lbl_currentDate.setText("N/A");
                lbl_startTime.setText("N/A");
                lbl_Subject.setText("N/A");
                lbl_lectureHall.setText("N/A");
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
