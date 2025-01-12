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
import java.sql.ResultSet;

public class StudentDataRetriever {

    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Change LMS to your database name
    private static final String DB_USER = "root"; // Replace with your database username
    private static final String DB_PASSWORD = ""; // Replace with your database password

    // Method to retrieve and return specific student data as an array
    public static String[] getStudentByID(String studentID) {
        String[] studentData = new String[6];

        String query = "SELECT studentID, studentName, studentNIC, studentEmail, studentContact, studentAddress FROM Student WHERE studentID = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, studentID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Retrieve data and store in the array
                    studentData[0] = resultSet.getString("studentID");
                    studentData[1] = resultSet.getString("studentName");
                    studentData[2] = resultSet.getString("studentNIC");
                    studentData[3] = resultSet.getString("studentEmail");
                    studentData[4] = resultSet.getString("studentContact");
                    studentData[5] = resultSet.getString("studentAddress");
                } else {
                    return null; // Return null if no data is found
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return studentData;
    }
}
