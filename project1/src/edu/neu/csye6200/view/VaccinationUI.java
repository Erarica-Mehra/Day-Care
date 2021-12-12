/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.Parent;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.StudentService;
import edu.neu.csye6200.Vaccine;
import edu.neu.csye6200.util.ConversionUtil;
import edu.neu.csye6200.util.ValidationUtil;
import java.io.File;
import java.math.BigInteger;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
public class VaccinationUI extends javax.swing.JFrame {

    private long initialId=0;
    private Student student;
    private  Vaccine vaccine = new Vaccine();
    private List<Vaccine> vacc;
    /**
     * Creates new form Teacher
     */
    public VaccinationUI(Student s) {
        initComponents();
        this.student= s;
        jTextFieldStudentName.setText(student.getFirstName()+" "+student.getLastName());
        jTableStudentVacc.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableStudentVacc.setAutoCreateColumnsFromModel(true);
        
    }
      public VaccinationUI(Student s, List<Vaccine> vacc) {
        initComponents();
        this.student= s;
        jTextFieldStudentName.setText(student.getFirstName()+" "+student.getLastName());
        jTableStudentVacc.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableStudentVacc.setAutoCreateColumnsFromModel(true);
        this.vacc= vacc;
     
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldStudentName = new javax.swing.JTextField();
        jTextFielDosesTaken = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jTextFieldVaccineName = new javax.swing.JTextField();
        jAddVacRectButton = new javax.swing.JButton();
        jLabelPhoneNumber1 = new javax.swing.JLabel();
        jLabelVaccineName = new javax.swing.JLabel();
        jTextFieldLastShotDate = new javax.swing.JTextField();
        jTextFieldTotalDosesTaken = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudentVacc = new javax.swing.JTable();

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
        jLabelStudentTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vacc1.png"))); // NOI18N
        jLabelStudentTitle.setText("Student Vaccination Record");
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
                .addGap(218, 218, 218)
                .addComponent(jLabelStudentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(581, Short.MAX_VALUE))
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFirstName.setText("Student Name");
        jPanel2.add(jLabelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 84, -1));

        jTextFieldStudentName.setToolTipText("Enter Text");
        jTextFieldStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 17, 410, -1));

        jTextFielDosesTaken.setToolTipText("Enter Text");
        jTextFielDosesTaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielDosesTakenActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFielDosesTaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 176, 410, -1));

        jLabelAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAddress.setText("No. Of Doses Taken");
        jPanel2.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabelPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber.setText("Totat Doses");
        jPanel2.add(jLabelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 20));

        jTextFieldVaccineName.setToolTipText("Enter Text");
        jPanel2.add(jTextFieldVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 410, -1));

        jAddVacRectButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAddVacRectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        jAddVacRectButton.setText("Add  Record");
        jAddVacRectButton.setToolTipText("Click to Add Data");
        jAddVacRectButton.setMargin(new java.awt.Insets(0, 2, 0, 8));
        jAddVacRectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAddVacRectButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAddVacRectButtonMouseEntered(evt);
            }
        });
        jAddVacRectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddVacRectButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jAddVacRectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 170, 30));

        jLabelPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPhoneNumber1.setText("Last Shot Date");
        jPanel2.add(jLabelPhoneNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabelVaccineName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelVaccineName.setText("Vaccine Name");
        jPanel2.add(jLabelVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jTextFieldLastShotDate.setToolTipText("Enter Text");
        jTextFieldLastShotDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastShotDateActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldLastShotDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 410, -1));

        jTextFieldTotalDosesTaken.setToolTipText("Enter Text");
        jPanel2.add(jTextFieldTotalDosesTaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 118, 410, -1));

        jButtonSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save1.png"))); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 126, 30));

        jInternalFrame1.setFrameIcon(null);
        jInternalFrame1.setVisible(true);

        jScrollPane1.setAutoscrolls(true);

        jTableStudentVacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "No. Of Doses Taken", "Total Doses", "Last Shot Date", "Next Shot Date", "Vaccinated ?"
            }
        ));
        jScrollPane1.setViewportView(jTableStudentVacc);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //StudentDaoImpl impl = new StudentDaoImpl();
        edu.neu.csye6200.StudentService studentService = new StudentService();
  	//TODO add db integration by importing package/class from backend
   
      //  Student student = new Student();
        //accine= new Vaccine();
        jTextFieldStudentName.setText(student.getFirstName() +" "+student.getLastName());
        java.util.List<Vaccine> list= new ArrayList<>();
        vaccine.setName(jTextFieldVaccineName.getText());
        vaccine.setDosestaken(Integer.parseInt(jTextFielDosesTaken.getText()));
        vaccine.setId(student.getStudentId());
        vaccine.setLastShotDate(ConversionUtil.StringToLocalDate(jTextFieldLastShotDate.getText()));
        vaccine.getNextShotDate();
        vaccine.isVaccinationCompleted();
        student.checkVaccinationRules(vaccine);
        student.getImmunizationRecord().add(vaccine);
      
        System.out.println(vaccine.getName());
        
        try {
            //  s.set(0);
               studentService.registerStudent(student);
            //impl.addStudent(s);
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFielDosesTakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielDosesTakenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielDosesTakenActionPerformed
    
    public void searchTableContents(String searchString) {
        DefaultTableModel currtableModel = (DefaultTableModel) jTableStudentVacc.getModel();
        System.out.println("Started seearching...");
        //To empty the table before search
        Vector originalTableModel = (Vector) ((DefaultTableModel) jTableStudentVacc.getModel()).getDataVector().clone();
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
    
    private void jTextFieldStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentNameActionPerformed
        // TODO add your handling code here:
        //StudentUI s= new StudentUI();
        
    }//GEN-LAST:event_jTextFieldStudentNameActionPerformed

    private void jTextFieldLastShotDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastShotDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastShotDateActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jAddVacRectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddVacRectButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jAddVacRectButtonActionPerformed

    private void jAddVacRectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddVacRectButtonMouseClicked
        // TODO add your handling code here:
        
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTableStudentVacc.getModel();
        model.addRow(new Object[]{jTextFieldStudentName.getText(),jTextFieldVaccineName.getText(),jTextFieldTotalDosesTaken.getText(),
            jTextFielDosesTaken.getText()+1,jTextFieldLastShotDate.getText(),vaccine.getNextShotDate(),vaccine.isVaccinated()});
//        model.addRow(new Object[]{initialId,jTextFieldStudentFirstName.getText(),jTextFieldStudentLastName.getText(),jTextFieldAddress.getText(),jTextFieldRegDate.getText()});
        // jTextFieldStudentDob.getText(),jTextFieldParentFirstName.getText(),jTextFieldParentLastName.getText(),jTextFieldPhoneNumber.getText(),jTextFieldEmail.getText()});

    }//GEN-LAST:event_jAddVacRectButtonMouseClicked

    private void jAddVacRectButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddVacRectButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddVacRectButtonMouseEntered

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
    private javax.swing.JButton jAddVacRectButton;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelPhoneNumber1;
    private javax.swing.JLabel jLabelStudentTitle;
    private javax.swing.JLabel jLabelVaccineName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudentVacc;
    private javax.swing.JTextField jTextFielDosesTaken;
    private javax.swing.JTextField jTextFieldLastShotDate;
    private javax.swing.JTextField jTextFieldStudentName;
    private javax.swing.JTextField jTextFieldTotalDosesTaken;
    private javax.swing.JTextField jTextFieldVaccineName;
    // End of variables declaration//GEN-END:variables
}
