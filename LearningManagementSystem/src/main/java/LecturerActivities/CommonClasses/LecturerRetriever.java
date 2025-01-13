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

public class LecturerRetriever {
    private Connection connect() {
        Connection conn = null;
        try {
            // Update with your MySQL database details
            String url = "jdbc:mysql://localhost:3306/LMS";  // Your database URL
            String user = "root"; // Your MySQL username
            String password = ""; // Your MySQL password
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return conn;
    }

    public void retrieveLecturerData(String lecturerUsername) {
        String query = "SELECT * FROM Lecturer WHERE lecturerUsername = ?";  // Adjust the column name as needed

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            if (conn == null) {
                System.out.println("Database connection is null. Check connection details.");
                return;
            }

            stmt.setString(1, lecturerUsername);  // Set the lecturerUsername to search
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Retrieve data from the ResultSet
                String lecturerID = rs.getString("lecturerID");
                String lecturerName = rs.getString("lecturerName");
                String lecturerNIC = rs.getString("lecturerNIC");
                String lecturerPassword = rs.getString("lecturerPassword");
                String lecturerContact = rs.getString("lecturerContact");
                String lecturerEmail = rs.getString("lecturerEmail");
                String lecturerAddress = rs.getString("lecturerAddress");

                // Print or use the retrieved data as needed
                System.out.println("Lecturer ID: " + lecturerID);
                System.out.println("Lecturer Name: " + lecturerName);
                System.out.println("Lecturer NIC: " + lecturerNIC);
                System.out.println("Lecturer Password: " + lecturerPassword);
                System.out.println("Lecturer Contact: " + lecturerContact);
                System.out.println("Lecturer Email: " + lecturerEmail);
                System.out.println("Lecturer Address: " + lecturerAddress);
            } else {
                System.out.println("Lecturer not found.");
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        }
    }
}
