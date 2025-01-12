/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

/**
 *
 * @author chand
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDataDeleter {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to delete a student by their ID
    public static boolean deleteStudent(String studentID) {
        String query = "DELETE FROM Student WHERE studentID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the student ID parameter
            preparedStatement.setString(1, studentID);

            // Execute the delete
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if deletion was successful, false otherwise

        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
}