/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminActivities;

import AdminActivities.CommonClasses.LecturerRegistration;
import CommonClasses.ImageResizer;
import LoginFrames.Home;
import java.awt.Color;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author chand
 */
public class AdminViewLecturerRegister extends javax.swing.JFrame {

    /**
     * Creates new form AdminViewLecturerRegister
     */
    private final DrawerController drawer;
    public String adminUsername;

    public AdminViewLecturerRegister() {
        initComponents();

        this.adminUsername = adminUsername;
        lbl_adminUsername.setText(adminUsername);

        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

        drawer = Drawer.newDrawer(this)
                .headerHeight(100)
                .space(100)
                .background(new Color(55, 92, 92)) // RGB values for #375C5C
                .backgroundTransparent(0.15f)
                .drawerBackground(new Color(55, 92, 92))
                .addChild(createDrawerItem("Dashboard"))
                .addChild(createDrawerItem("Student"))
                .addChild(createDrawerItem("Lecturer"))
                .addChild(createDrawerItem("Time Table"))
                .addChild(createDrawerItem("Course Content"))
                .addChild(createDrawerItem("Examination"))
                .addChild(createDrawerItem("Message"))
                .addChild(createDrawerItem("Settings"))
                .space(100)
                .addChild(createDrawerItem("Logout"))
                .build();

        // Optionally, display the admin username in the dashboard
        lbl_adminUsername.setText(adminUsername);
    }

    private DrawerItem createDrawerItem(String title) {
        DrawerItem item = new DrawerItem(title)
                .build();

        // Add an action listener to handle item selection
        item.addActionListener(e -> handleDrawerItemSelection(title));

        return item;
    }

    private void handleDrawerItemSelection(String title) {
        switch (title) {
            case "Dashboard":
                AdminDashboard adminDashboard = new AdminDashboard(adminUsername);
                adminDashboard.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Student":
                AdminViewStudent adminViewStudent = new AdminViewStudent(adminUsername);
                adminViewStudent.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Lecturer":
                AdminViewLecturer adminViewLecturer = new AdminViewLecturer(adminUsername);
                adminViewLecturer.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Time Table":
                AdminViewTimetable adminViewTimetable = new AdminViewTimetable();
                adminViewTimetable.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Course Content":
                AdminViewCourseContent adminViewCourseContent = new AdminViewCourseContent(adminUsername);
                adminViewCourseContent.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Examination":
                AdminViewExamination adminViewExamination = new AdminViewExamination(adminUsername);
                adminViewExamination.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Message":
                AdminViewMessage adminViewMessage = new AdminViewMessage(adminUsername);
                adminViewMessage.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Settings":
                AdminViewSettings adminViewSettings = new AdminViewSettings(adminUsername);
                adminViewSettings.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            case "Logout":
                Home home = new Home();
                home.setVisible(true);
                this.hide();
                if (drawer.isShow()) {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.hide();
                } else {
                    Timer timer = new Timer(300, e -> drawer.hide());
                    drawer.show();
                }
                // Already on the Dashboard, do nothing or handle accordingly
                break;
            default:
                // Handle unknown cases
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Menu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_lecturerName = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_lecturerNIC = new javax.swing.JTextField();
        txt_lecturerPassword = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_lecturerContact = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_lecturerEmail = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_lecturerAddress = new javax.swing.JTextField();
        btn_Register = new javax.swing.JButton();
        btn_Verify2 = new javax.swing.JButton();
        lbl_adminUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\chand\\OneDrive\\Desktop\\GitHub Clones\\Learning-Management-System-using-Java\\LearningManagementSystem\\src\\main\\java\\StudentActivities\\Icons\\MenuColored.png")); // NOI18N
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Lecturers");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setText(":");

        jLabel21.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel21.setText("Full Name");

        jLabel22.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel22.setText(":");

        jLabel23.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel23.setText("NIC");

        jLabel25.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel25.setText(":");

        jLabel26.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel26.setText("Password");

        jLabel27.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel27.setText(":");

        jLabel28.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel28.setText("Contact");

        jLabel29.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel29.setText("Email");

        jLabel30.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel30.setText(":");

        jLabel31.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel31.setText("Address");

        jLabel32.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel32.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26)
                    .addComponent(jLabel23)
                    .addComponent(jLabel21)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(txt_lecturerAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(txt_lecturerEmail))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(18, 18, 18)
                            .addComponent(txt_lecturerContact))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(18, 18, 18)
                            .addComponent(txt_lecturerPassword))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(18, 18, 18)
                            .addComponent(txt_lecturerNIC))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txt_lecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lecturerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lecturerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lecturerContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_lecturerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_lecturerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        btn_Register.setBackground(new java.awt.Color(0, 0, 0));
        btn_Register.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Register.setForeground(new java.awt.Color(255, 255, 255));
        btn_Register.setText("Register");
        btn_Register.setAlignmentY(0.0F);
        btn_Register.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        btn_Verify2.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify2.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify2.setText("Cancel");
        btn_Verify2.setAlignmentY(0.0F);
        btn_Verify2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_adminUsername.setText("AdminID");

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(330, 330, 330)
                        .addComponent(lbl_adminUsername)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(168, 168, 168))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_adminUsername))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Verify2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MenuMouseClicked
        // TODO add your handling code here:
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btn_MenuMouseClicked

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // In your form button click event or method
        String lecturerID = LecturerRegistration.generateLecturerID();
        String lecturerName = txt_lecturerName.getText().trim();
        String lecturerNIC = txt_lecturerNIC.getText().trim();
        String lecturerPassword = txt_lecturerPassword.getText().trim();
        String lecturerContact = txt_lecturerContact.getText().trim();
        String lecturerEmail = txt_lecturerEmail.getText().trim();
        String lecturerAddress = txt_lecturerAddress.getText().trim();

        boolean isRegistered = LecturerRegistration.registerLecturer(lecturerID, lecturerName, lecturerNIC, lecturerPassword,
                lecturerContact, lecturerEmail, lecturerAddress);

        if (isRegistered) {
            JOptionPane.showMessageDialog(this, "Lecturer registered successfully! ID: " + lecturerID, "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to register lecturer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewLecturerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewLecturerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton btn_Verify2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_adminUsername;
    private javax.swing.JTextField txt_lecturerAddress;
    private javax.swing.JTextField txt_lecturerContact;
    private javax.swing.JTextField txt_lecturerEmail;
    private javax.swing.JTextField txt_lecturerNIC;
    private javax.swing.JTextField txt_lecturerName;
    private javax.swing.JTextField txt_lecturerPassword;
    // End of variables declaration//GEN-END:variables
}
