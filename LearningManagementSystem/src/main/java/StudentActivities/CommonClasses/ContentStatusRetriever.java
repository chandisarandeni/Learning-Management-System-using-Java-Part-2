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

public class ContentStatusRetriever {
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

    public void retrieveContentStatus(String studentID, JTable tbl_contentStatus) {
        String query = """
            SELECT 
                s.subjectName AS Subject, 
                s.subjectStatus AS Status
            FROM Subject s
            JOIN Course c ON s.courseID = c.courseID
            JOIN Student st ON st.courseID = c.courseID
            WHERE st.studentID = ?;
        """;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            if (conn == null) {
                System.out.println("Database connection is null. Check connection details.");
                return;
            }

            stmt.setString(1, studentID);
            ResultSet rs = stmt.executeQuery();

            // Populate the JTable
            DefaultTableModel model = (DefaultTableModel) tbl_contentStatus.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("Subject"),
                    rs.getString("Status")
                });
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
