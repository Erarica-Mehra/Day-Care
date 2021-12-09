/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.*;
import edu.neu.csye6200.dao.StudentDaoImpl;
import edu.neu.csye6200.util.ConversionUtil;
import edu.neu.csye6200.util.ValidationUtil;
import java.io.File;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author erruc
 */
public class StudentUI extends javax.swing.JFrame {

    private long initialId=0;
    /**
     * Creates new form Teacher
     */
    public StudentUI() {
        initComponents();
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setAutoCreateColumnsFromModel(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelStudentTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelToolBar = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        JLabelSearch = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jButtonDownload = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldStudentFirstName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldStudentDob = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jAddStudentButton = new javax.swing.JButton();
        jLabelPhoneNumber1 = new javax.swing.JLabel();
        jLabelPhoneNumber2 = new javax.swing.JLabel();
        jLabelPhoneNumber3 = new javax.swing.JLabel();
        jLabelPhoneNumber5 = new javax.swing.JLabel();
        jLabelPhoneNumber6 = new javax.swing.JLabel();
        jTextFieldStudentLastName = new javax.swing.JTextField();
        jTextFieldParentFirstName = new javax.swing.JTextField();
        jTextFieldParentLastName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldRegDate = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(178, 255, 176));

        jLabelStudentTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelStudentTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStudentTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/std1.png"))); // NOI18N
        jLabelStudentTitle.setText("Students Info");
        jLabelStudentTitle.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lmdic1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(392, 392, 392)
                .addComponent(jLabelStudentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelStudentTitle))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanelToolBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelToolBar.setMinimumSize(new java.awt.Dimension(827, 47));
        jPanelToolBar.setOpaque(false);
        jPanelToolBar.setPreferredSize(new java.awt.Dimension(100, 38));

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        JLabelSearch.setText("Search");

        jButtonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload1.png"))); // NOI18N
        jButtonUpload.setText("Upload");
        jButtonUpload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUploadMouseClicked(evt);
            }
        });
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

        jButtonDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download1.png"))); // NOI18N
        jButtonDownload.setText("Download CSV");
        jButtonDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDownloadMouseClicked(evt);
            }
        });

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save1.png"))); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(56, 56, 56)
                .addComponent(jButtonUpload)
                .addGap(48, 48, 48)
                .addComponent(jButtonDownload)
                .addGap(332, 332, 332))
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldSearch)
                    .addComponent(JLabelSearch)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFirstName.setText("First Name");
        jPanel2.add(jLabelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 84, -1));

        jTextFieldStudentFirstName.setToolTipText("Enter Text");
        jTextFieldStudentFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentFirstNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldStudentFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 17, 410, -1));

        jLabelLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLastName.setText("Last Name");
        jPanel2.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 78, -1));

        jTextFieldStudentDob.setToolTipText("Enter Text");
        jTextFieldStudentDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentDobActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldStudentDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 176, 410, -1));

        jLabelAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAddress.setText("Address");
        jPanel2.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 66, -1));

        jLabelPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber.setText("Registration Date");
        jPanel2.add(jLabelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, -1, -1));

        jTextFieldAddress.setToolTipText("Enter Text");
        jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 92, 410, -1));

        jAddStudentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAddStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        jAddStudentButton.setText("Add New Student");
        jAddStudentButton.setToolTipText("Click to Add Data");
        jAddStudentButton.setMargin(new java.awt.Insets(0, 2, 0, 8));
        jAddStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAddStudentButtonMouseClicked(evt);
            }
        });
        jAddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddStudentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jAddStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 166, 30));

        jLabelPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber1.setText("Date of Birth");
        jPanel2.add(jLabelPhoneNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 179, -1, -1));

        jLabelPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber2.setText("Parent First Name");
        jPanel2.add(jLabelPhoneNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

        jLabelPhoneNumber3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber3.setText("Parent Last Name");
        jPanel2.add(jLabelPhoneNumber3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 256, -1, -1));

        jLabelPhoneNumber5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber5.setText("Phone Number");
        jPanel2.add(jLabelPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 311, -1, -1));

        jLabelPhoneNumber6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber6.setText("Email Id");
        jPanel2.add(jLabelPhoneNumber6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 372, -1, -1));

        jTextFieldStudentLastName.setToolTipText("Enter Text");
        jTextFieldStudentLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldStudentLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 57, 410, -1));

        jTextFieldParentFirstName.setToolTipText("Enter Text");
        jTextFieldParentFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParentFirstNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldParentFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 216, 410, -1));

        jTextFieldParentLastName.setToolTipText("Enter Text");
        jTextFieldParentLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldParentLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldParentLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 256, 410, -1));

        jTextFieldEmail.setToolTipText("Enter Text");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 366, 410, -1));

        jTextFieldPhoneNumber.setToolTipText("Enter Text");
        jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumberActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 308, 410, -1));

        jTextFieldRegDate.setToolTipText("Enter Text");
        jPanel2.add(jTextFieldRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 127, 410, 30));

        jInternalFrame1.setVisible(true);

        jScrollPane1.setAutoscrolls(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "FirstName", "LastName", "Address", "Reg. Date", "Student Dob", "Parent FName", "Parent LName", "PhoneNumber", "Email Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Student Id");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("FirstName");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("LastName");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Address");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Reg. Date");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Student Dob");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Parent FName");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Parent LName");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("PhoneNumber");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Email Id");
        }

        jInternalFrame1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1473, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
     	searchTableContents(jTextFieldSearch.getText());   // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jButtonUploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUploadMouseClicked
        System.out.println("Uploading CSV file.");
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    		int returnValue = jfc.showOpenDialog(null);
    		// int returnValue = jfc.showSaveDialog(null);
    		if (returnValue == JFileChooser.APPROVE_OPTION) {
    			File selectedFile = jfc.getSelectedFile();
    			System.out.println(selectedFile.getAbsolutePath());
    			//edu.neu.csye6200.backend.FileUtil.readTextFile(selectedFile.getName());
    		}        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUploadMouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //StudentDaoImpl impl = new StudentDaoImpl();
        edu.neu.csye6200.StudentService studentService = new StudentService();
  	//TODO add db integration by importing package/class from backend
     //   System.out.println("Date:  "+jXDatePicker1.toString());
  	//edu.neu.csye6200.Student s = new edu.neu.csye6200.Student();
        Student s = new Student();
        Parent p= new Parent();
        if(!ValidationUtil.verifyName(jTextFieldStudentFirstName.getText()) && !ValidationUtil.verifyName(jTextFieldStudentLastName.getText())
               && !ValidationUtil.verifyName(jTextFieldParentFirstName.getText()) && !ValidationUtil.verifyName(jTextFieldParentLastName.getName()))
        {
                s.setFirstName(jTextFieldStudentFirstName.getText());
                s.setLastName(jTextFieldStudentLastName.getText());
                p.setFirstName(jTextFieldParentFirstName.getText());
                p.setLastName(jTextFieldParentLastName.getText());

        }
        s.setAddress(jTextFieldAddress.getText());
        if(!ValidationUtil.verifyEmail(jTextFieldEmail.getText())){
            p.setEmail(jTextFieldEmail.getText());
        }
        
        s.setParent(p);
      //  if(ValidationUtil.isValidPhoneNumber(jTextFieldPhoneNumber.getText())){
          //  p.setPhone(jTextFieldPhoneNumber.getText());
       // }
     //   s.setRegistrationDate(ConversionUtil.convertToLocalDateViaInstant(jXDatePicker.getDate()));
     
       /* if(ValidationUtil.isValidPhoneNumber(jTextFieldPhoneNumber.getText())){
              p.setPhone(BigInteger.jTextFieldPhoneNumber.getText()));
        }*/
        System.out.println(s.toString());
        
        try {
            //  s.set(0);
            studentService.registerStudent(s);
            //impl.addStudent(s);
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
                 // TODO add your handling code here:
                   	System.out.println("Uploading CSV file.");
        
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
			//edu.neu.csye6200.backend.FileUtil.readTextFile(selectedFile.getName());
		}
    }//GEN-LAST:event_jButtonUploadActionPerformed

    private void jTextFieldStudentDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStudentDobActionPerformed
    
    public void searchTableContents(String searchString) {
        DefaultTableModel currtableModel = (DefaultTableModel) jTable1.getModel();
        System.out.println("Started seearching...");
        //To empty the table before search
        Vector originalTableModel = (Vector) ((DefaultTableModel) jTable1.getModel()).getDataVector().clone();
        currtableModel.setRowCount(0);
        //To search for contents from original table content
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().contains(searchString)) {
                    //content found so adding to table
                    currtableModel.addRow(rowVector);
                    System.out.println("String Found...");
                    break;
                }
            }

        }
    };
    
    private void jButtonDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDownloadMouseClicked
            	System.out.println("Downloading CSV file.");
        
        JFileChooser chooser = new JFileChooser();
		chooser.setSelectedFile(new File("student.txt")); // user will see this name during download
		if (JFileChooser.APPROVE_OPTION == chooser.showSaveDialog(null)) {
			String home = System.getProperty("user.home");
			File file = new File(home+"/Downloads/students.txt"); 			
		}        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDownloadMouseClicked

    private void jTextFieldStudentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStudentFirstNameActionPerformed

    private void jAddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddStudentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddStudentButtonActionPerformed

    private void jTextFieldStudentLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStudentLastNameActionPerformed

    private void jTextFieldParentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParentFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParentFirstNameActionPerformed

    private void jTextFieldParentLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldParentLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldParentLastNameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

    private void jAddStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddStudentButtonMouseClicked
        // TODO add your handling code here:
        initialId+=1;
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable1.getModel(); 
        model.addRow(new Object[]{initialId,jTextFieldStudentFirstName.getText(),jTextFieldStudentLastName.getText(),jTextFieldAddress.getText(),jTextFieldRegDate.getText(),
        jTextFieldStudentDob.getText(),jTextFieldParentFirstName.getText(),jTextFieldParentLastName.getText(),jTextFieldPhoneNumber.getText(),jTextFieldEmail.getText()}); 
        
    }//GEN-LAST:event_jAddStudentButtonMouseClicked

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

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
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSearch;
    private javax.swing.JButton jAddStudentButton;
    private javax.swing.JButton jButtonDownload;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelPhoneNumber1;
    private javax.swing.JLabel jLabelPhoneNumber2;
    private javax.swing.JLabel jLabelPhoneNumber3;
    private javax.swing.JLabel jLabelPhoneNumber5;
    private javax.swing.JLabel jLabelPhoneNumber6;
    private javax.swing.JLabel jLabelStudentTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldParentFirstName;
    private javax.swing.JTextField jTextFieldParentLastName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldRegDate;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldStudentDob;
    private javax.swing.JTextField jTextFieldStudentFirstName;
    private javax.swing.JTextField jTextFieldStudentLastName;
    // End of variables declaration//GEN-END:variables
}
