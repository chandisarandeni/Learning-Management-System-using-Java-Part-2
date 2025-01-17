package AdminActivities.CommonClasses;

import AdminActivities.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {

    private String studentID;

    // Constructor to initialize studentID
    public ReportGenerator(String studentID) {
        this.studentID = studentID;
    }

    public void generateReport() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/LMS?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {

                // Path to the .jrxml report file
                String reportPath = "C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java-Part-2\\LearningManagementSystem\\src\\main\\java\\AdminActivities\\Reports\\StudentResultTemp.jrxml";

                // Compile the report file
                JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

                // Create a parameter map for the report
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("studentID", studentID);  // Use the class-level studentID

                // Fill the report with data from the database
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);

                // Display the report using JasperViewer
                JasperViewer.viewReport(jasperPrint, false);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, "Error generating report: " + e.getMessage(), "Report Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found: " + e.getMessage(), "Driver Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Unexpected Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
