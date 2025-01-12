package AdminActivities.CommonClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LecturerDataDeleter {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to delete lecturer by lecturerID
    public static boolean deleteLecturer(String lecturerID) {
        String query = "DELETE FROM Lecturer WHERE lecturerID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, lecturerID);

            // Execute the delete
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if deletion was successful, false otherwise

        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false if an error occurs
        }
    }
}
