package AdminActivities.CommonClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LecturerDataUpdater {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to update lecturer information (without address part)
    public static boolean updateLecturer(String lecturerID, String lecturerName, String lecturerNIC, String lecturerContact, String lecturerEmail) {
        String query = "UPDATE Lecturer SET lecturerName = ?, lecturerNIC = ?, lecturerContact = ?, lecturerEmail = ? WHERE lecturerID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the parameters for the prepared statement
            preparedStatement.setString(1, lecturerName);
            preparedStatement.setString(2, lecturerNIC);
            preparedStatement.setString(3, lecturerContact);
            preparedStatement.setString(4, lecturerEmail);
            preparedStatement.setString(5, lecturerID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if the update was successful, false otherwise

        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
}
