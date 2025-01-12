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

public class StudentDataUpdater {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to update student information
    public static boolean updateStudent(String studentID, String studentName, String studentNIC, String studentEmail, String studentContact, String studentAddress) {
        String query = "UPDATE Student SET studentName = ?, studentNIC = ?, studentEmail = ?, studentContact = ?, studentAddress = ? WHERE studentID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the parameters for the prepared statement
            preparedStatement.setString(1, studentName);
            preparedStatement.setString(2, studentNIC);
            preparedStatement.setString(3, studentEmail);
            preparedStatement.setString(4, studentContact);
            preparedStatement.setString(5, studentAddress);
            preparedStatement.setString(6, studentID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if the update was successful, false otherwise

        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
}