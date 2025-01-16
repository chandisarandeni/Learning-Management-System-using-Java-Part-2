/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LecturerActivities;

import AdminActivities.CommonClasses.CourseIDLoader;
import CommonClasses.ImageResizer;
import LoginFrames.Home;
import StudentActivities.StudentDashboard;
import StudentActivities.StudentViewCourseContent;
import StudentActivities.StudentViewTimetable;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author chand
 */
public class LecturerViewExamination extends javax.swing.JFrame {

    /**
     * Creates new form LecturerViewExamination
     */
    private final DrawerController drawer;
    String lecturerID;

    public LecturerViewExamination(String lecturerID) {
        initComponents();

        this.lecturerID = lecturerID;
        lbl_lecturerID.setText(lecturerID);

        String MenuColored = "src\\main\\java\\StudentActivities\\Icons\\MenuColored.png";
        btn_Menu.setIcon(ImageResizer.resizeImage(MenuColored, 35, 35));

        drawer = Drawer.newDrawer(this)
                .headerHeight(100)
                .space(100)
                .background(new Color(55, 92, 92)) // RGB values for #375C5C
                .backgroundTransparent(0.15f)
                .drawerBackground(new Color(55, 92, 92))
                .addChild(createDrawerItem("Dashboard"))
                .addChild(createDrawerItem("Time Table"))
                .addChild(createDrawerItem("Course Content"))
                .addChild(createDrawerItem("Examination"))
                .addChild(createDrawerItem("Message"))
                .addChild(createDrawerItem("Settings"))
                .space(100)
                .addChild(createDrawerItem("Logout"))
                .build();

        CourseIDLoader.loadCourseIDs(comboBox_courseID);

        lbl_lecturerID.setVisible(false);
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
                LecturerDashboard lecturerDashboard = new LecturerDashboard(lecturerID);
                lecturerDashboard.setVisible(true);
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
                LecturerViewTimetable lecturerViewTimetable = new LecturerViewTimetable(lecturerID);
                lecturerViewTimetable.setVisible(true);
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
                LecturerViewCourseContent lecturerViewCourseContent = new LecturerViewCourseContent(lecturerID);
                lecturerViewCourseContent.setVisible(true);
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
                LecturerViewExamination lectureViewExamination = new LecturerViewExamination(lecturerID);
                lectureViewExamination.setVisible(true);
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
                LecturerViewMessages lecturerViewMessages = new LecturerViewMessages(lecturerID);
                lecturerViewMessages.setVisible(true);
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
                LecturerViewSettings lecturerViewSettings = new LecturerViewSettings(lecturerID);
                lecturerViewSettings.setVisible(true);
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

        jLabel2 = new javax.swing.JLabel();
        lbl_lecturerID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Menu = new javax.swing.JLabel();
        comboBox_courseID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboBox_Subject = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btn_Verify1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_studentMarks = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboBox_studentID = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btn_Verify4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_updateMarks = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        comboBox_SubjectUpdate = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboBox_studentIDUpdate = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 885, 525));
        setMaximumSize(new java.awt.Dimension(885, 525));
        setMinimumSize(new java.awt.Dimension(885, 525));

        jLabel2.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel2.setText("_________________________________________________________");

        lbl_lecturerID.setText("LecturerID");

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        jLabel4.setText("Examination");

        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MenuMouseClicked(evt);
            }
        });

        comboBox_courseID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBox_courseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_courseIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel6.setText(":");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel7.setText(":");

        comboBox_Subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBox_Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_SubjectActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel8.setText("Subject");

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setAlignmentY(0.0F);
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btn_Verify1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify1.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify1.setText("Cancel");
        btn_Verify1.setAlignmentY(0.0F);
        btn_Verify1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Verify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Verify1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel15.setText(":");

        jLabel16.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel16.setText("Marks");

        jLabel9.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel9.setText("Student ID");

        comboBox_studentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBox_studentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_studentIDActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel10.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(btn_Verify1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox_Subject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBox_studentID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15)
                        .addGap(28, 28, 28)
                        .addComponent(txt_studentMarks)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(txt_studentMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btn_Verify1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel5.setText("Course");

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setAlignmentY(0.0F);
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btn_Verify4.setBackground(new java.awt.Color(0, 0, 0));
        btn_Verify4.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        btn_Verify4.setForeground(new java.awt.Color(255, 255, 255));
        btn_Verify4.setText("Cancel");
        btn_Verify4.setAlignmentY(0.0F);
        btn_Verify4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Verify4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Verify4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Verify4ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel17.setText(":");

        jLabel18.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel18.setText("Marks");

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel12.setText(":");

        comboBox_SubjectUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBox_SubjectUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_SubjectUpdateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel13.setText("Subject");

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jLabel14.setText("Student ID");

        comboBox_studentIDUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboBox_studentIDUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_studentIDUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_SubjectUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBox_studentIDUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Verify4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_updateMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_SubjectUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_studentIDUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(txt_updateMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btn_Verify4))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(comboBox_courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_lecturerID)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_lecturerID)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_courseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        btnSubmit.addActionListener(e -> {
            // Get selected values from combo boxes
            String selectedCourseID = (String) comboBox_courseID.getSelectedItem();
            String selectedSubject = (String) comboBox_Subject.getSelectedItem();
            String selectedStudentID = (String) comboBox_studentID.getSelectedItem();

            // Get the entered marks from the text field
            String studentMarksText = txt_studentMarks.getText();

            // Validate and parse marks
            int marks = 0;
            try {
                marks = Integer.parseInt(studentMarksText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid marks.");
                return;
            }

            // Determine grade and GPA points based on marks
            String grade;
            double gpaPoints;

            if (marks > 80) {
                grade = "A+";
                gpaPoints = 4.0;
            } else if (marks > 70) {
                grade = "A";
                gpaPoints = 3.7;
            } else if (marks > 60) {
                grade = "B+";
                gpaPoints = 3.3;
            } else if (marks > 50) {
                grade = "B";
                gpaPoints = 3.0;
            } else if (marks > 40) {
                grade = "C";
                gpaPoints = 2.7;
            } else {
                grade = "F";
                gpaPoints = 0.0;
            }

            String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
            String DB_USER = "root";
            String DB_PASSWORD = "";
            String query = "INSERT INTO Examination (studentID, subjectName, Marks, Grade, GPA_Points) VALUES (?, ?, ?, ?, ?)";

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // Set values for the prepared statement
                preparedStatement.setString(1, selectedStudentID);
                preparedStatement.setString(2, selectedSubject);
                preparedStatement.setInt(3, marks);
                preparedStatement.setString(4, grade);
                preparedStatement.setDouble(5, gpaPoints);

                // Execute the insertion
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Examination data submitted successfully.");
                    comboBox_studentID.setSelectedItem(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to submit examination data.");
                    comboBox_studentID.setSelectedItem(null);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "The data is already submitted");
            }
        });


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btn_Verify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Verify1ActionPerformed
        // TODO add your handling code here:
        LecturerDashboard lecturerDashboard = new LecturerDashboard(lecturerID);
        lecturerDashboard.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_Verify1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnUpdate.addActionListener(e -> {
            String selectedSubject = (String) comboBox_SubjectUpdate.getSelectedItem();
            String selectedStudentID = (String) comboBox_studentIDUpdate.getSelectedItem();
            String updatedMarksText = txt_updateMarks.getText();

            // Validate that subject, student ID, and marks are selected/entered
            if ("--".equals(selectedSubject) || "--".equals(selectedStudentID)) {
                JOptionPane.showMessageDialog(null, "Please select a valid subject and student ID.");
                return;
            }

            // Validate the marks input
            int updatedMarks;
            try {
                updatedMarks = Integer.parseInt(updatedMarksText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid marks.");
                return;
            }

            // Calculate GPA based on updated marks
            String grade = "";
            double gpaPoints = 0.0;

            if (updatedMarks >= 80) {
                grade = "A+";
                gpaPoints = 4.0;
            } else if (updatedMarks >= 70) {
                grade = "A";
                gpaPoints = 4.0;
            } else if (updatedMarks >= 60) {
                grade = "B+";
                gpaPoints = 3.5;
            } else if (updatedMarks >= 50) {
                grade = "B";
                gpaPoints = 3.0;
            } else if (updatedMarks >= 40) {
                grade = "C";
                gpaPoints = 2.0;
            } else {
                grade = "F";
                gpaPoints = 0.0;
            }

            String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
            String DB_USER = "root";
            String DB_PASSWORD = "";
            String updateQuery = "UPDATE Examination SET Marks = ?, Grade = ?, GPA_Points = ? WHERE studentID = ? AND subjectName = ?";

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

                // Set values for the prepared statement
                preparedStatement.setInt(1, updatedMarks);
                preparedStatement.setString(2, grade);
                preparedStatement.setDouble(3, gpaPoints);
                preparedStatement.setString(4, selectedStudentID);
                preparedStatement.setString(5, selectedSubject);

                // Execute the update
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Marks and GPA updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update marks and GPA. Please check the data.");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error occurred while updating marks and GPA.");
            }
        });

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btn_Verify4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Verify4ActionPerformed
        // TODO add your handling code here:
        LecturerDashboard lecturerDashboard = new LecturerDashboard(lecturerID);
        lecturerDashboard.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_Verify4ActionPerformed

    private void comboBox_courseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_courseIDActionPerformed
        comboBox_courseID.addActionListener(e -> {
            String selectedCourseID = (String) comboBox_courseID.getSelectedItem();

            // Clear previous items
            comboBox_Subject.removeAllItems();
            comboBox_SubjectUpdate.removeAllItems();
            comboBox_studentID.removeAllItems();
            comboBox_studentIDUpdate.removeAllItems();

            // Add default placeholder item
            comboBox_Subject.addItem("--");
            comboBox_SubjectUpdate.addItem("--");
            comboBox_studentID.addItem("--");
            comboBox_studentIDUpdate.addItem("--");

            String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
            String DB_USER = "root";
            String DB_PASSWORD = "";

            // Query to get subjects
            String subjectQuery = "SELECT subjectName FROM Subject WHERE courseID = ?";

            // Query to get student IDs
            String studentQuery = "SELECT studentID FROM Student WHERE courseID = ?";

            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

                // Load subjects into both combo boxes
                try (PreparedStatement subjectPreparedStatement = connection.prepareStatement(subjectQuery)) {
                    subjectPreparedStatement.setString(1, selectedCourseID);
                    ResultSet subjectResultSet = subjectPreparedStatement.executeQuery();
                    while (subjectResultSet.next()) {
                        String subjectName = subjectResultSet.getString("subjectName");
                        comboBox_Subject.addItem(subjectName); // Add subject to the first combo box
                        comboBox_SubjectUpdate.addItem(subjectName); // Add subject to the second combo box
                    }
                }

                // Load student IDs into both combo boxes
                try (PreparedStatement studentPreparedStatement = connection.prepareStatement(studentQuery)) {
                    studentPreparedStatement.setString(1, selectedCourseID);
                    ResultSet studentResultSet = studentPreparedStatement.executeQuery();
                    while (studentResultSet.next()) {
                        String studentID = studentResultSet.getString("studentID");
                        comboBox_studentID.addItem(studentID); // Add student ID to the first combo box
                        comboBox_studentIDUpdate.addItem(studentID); // Add student ID to the second combo box
                    }
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error occurred while fetching subjects and student IDs.");
            }
        });


    }//GEN-LAST:event_comboBox_courseIDActionPerformed

    private void comboBox_SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_SubjectActionPerformed
//        // TODO add your handling code here:
//        comboBox_courseID.addActionListener(e -> {
//            String selectedCourseID = (String) comboBox_courseID.getSelectedItem();
//            comboBox_studentID.removeAllItems(); // Clear previous items
//
//            String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
//            String DB_USER = "root";
//            String DB_PASSWORD = "";
//            String query = "SELECT studentID FROM Student WHERE courseID = ?";
//
//            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//
//                preparedStatement.setString(1, selectedCourseID);
//                ResultSet resultSet = preparedStatement.executeQuery();
//
//                while (resultSet.next()) {
//                    comboBox_studentID.addItem(resultSet.getString("studentID"));
//                }
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error occurred while fetching student IDs.");
//            }
//        });

    }//GEN-LAST:event_comboBox_SubjectActionPerformed

    private void comboBox_SubjectUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_SubjectUpdateActionPerformed
//        // TODO add your handling code here:
//        // TODO add your handling code here:
//        comboBox_courseID.addActionListener(e -> {
//            String selectedCourseID = (String) comboBox_courseID.getSelectedItem();
//            comboBox_studentID.removeAllItems(); // Clear previous items
//
//            String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
//            String DB_USER = "root";
//            String DB_PASSWORD = "";
//            String query = "SELECT studentID FROM Student WHERE courseID = ?";
//
//            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(query)) {
//
//                preparedStatement.setString(1, selectedCourseID);
//                ResultSet resultSet = preparedStatement.executeQuery();
//
//                while (resultSet.next()) {
//                    comboBox_studentID.addItem(resultSet.getString("studentID"));
//                }
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(null, "Error occurred while fetching student IDs.");
//            }
//        });
    }//GEN-LAST:event_comboBox_SubjectUpdateActionPerformed

    private void comboBox_studentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_studentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_studentIDActionPerformed

    private void comboBox_studentIDUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_studentIDUpdateActionPerformed
        // TODO add your handling code here:
        comboBox_studentIDUpdate.addActionListener(e -> {
            loadMarks();
        });
        // Method to load marks based on selected student ID and subject
    }//GEN-LAST:event_comboBox_studentIDUpdateActionPerformed

    private void loadMarks() {
        String selectedSubject = (String) comboBox_SubjectUpdate.getSelectedItem();
        String selectedStudentID = (String) comboBox_studentIDUpdate.getSelectedItem();

        // Check if both subject and student ID are selected
        if ("--".equals(selectedSubject) || "--".equals(selectedStudentID)) {
            txt_updateMarks.setText(""); // Clear marks if either is not selected
            return;
        }

        String DB_URL = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String DB_USER = "root";
        String DB_PASSWORD = "";
        String query = "SELECT Marks FROM Examination WHERE studentID = ? AND subjectName = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set parameters for the query
            preparedStatement.setString(1, selectedStudentID);
            preparedStatement.setString(2, selectedSubject);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // If marks are found, set the value in the text field
                int marks = resultSet.getInt("Marks");
                txt_updateMarks.setText(String.valueOf(marks));
            } else {
                // If no marks are found for the selected student and subject
                txt_updateMarks.setText(""); // Clear the text field
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred while fetching marks.");
        }
    }

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
            java.util.logging.Logger.getLogger(LecturerViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerViewExamination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerViewExamination("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel btn_Menu;
    private javax.swing.JButton btn_Verify1;
    private javax.swing.JButton btn_Verify4;
    private javax.swing.JComboBox<String> comboBox_Subject;
    private javax.swing.JComboBox<String> comboBox_SubjectUpdate;
    private javax.swing.JComboBox<String> comboBox_courseID;
    private javax.swing.JComboBox<String> comboBox_studentID;
    private javax.swing.JComboBox<String> comboBox_studentIDUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_lecturerID;
    private javax.swing.JTextField txt_studentMarks;
    private javax.swing.JTextField txt_updateMarks;
    // End of variables declaration//GEN-END:variables
}
