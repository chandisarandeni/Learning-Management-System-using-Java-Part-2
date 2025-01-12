package AdminActivities.CommonClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LecturerDataRetriever {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to retrieve lecturer data by their ID
    public static String[] getLecturerByID(String lecturerID) {
        String[] lecturerData = new String[6];

        String query = "SELECT lecturerID, lecturerName, lecturerNIC, lecturerContact, lecturerEmail, lecturerAddress FROM Lecturer WHERE lecturerID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, lecturerID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Retrieve data and store it in the array
                    lecturerData[0] = resultSet.getString("lecturerID");
                    lecturerData[1] = resultSet.getString("lecturerName");
                    lecturerData[2] = resultSet.getString("lecturerNIC");
                    lecturerData[3] = resultSet.getString("lecturerContact");
                    lecturerData[4] = resultSet.getString("lecturerEmail");
                    lecturerData[5] = resultSet.getString("lecturerAddress");
                } else {
                    return null; // Return null if no data is found
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lecturerData;
    }
}
