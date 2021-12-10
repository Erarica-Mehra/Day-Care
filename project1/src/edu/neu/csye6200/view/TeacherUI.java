/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.TeacherService;
import edu.neu.csye6200.util.FileUtil;
import edu.neu.csye6200.util.ValidationUtil;
/**
 *
 * @author erruc
 */
public class TeacherUI extends javax.swing.JFrame {

    private long initialId=0;
    //static List<Teacher> teachers = new ArrayList<>();
    /**
     * Creates new form Teacher
     */
    public TeacherUI() {
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
        jLabelTeacherTitle = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelToolBar = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        JLabelSearch = new javax.swing.JLabel();
        jButtonUpload = new javax.swing.JButton();
        jButtonDownload = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabeTeacherlFirstName = new javax.swing.JLabel();
        jTextFieldTeacherFirstName = new javax.swing.JTextField();
        jLabeTeacherlLastName = new javax.swing.JLabel();
        jTextFieldTeacherAnnualReviewDate = new javax.swing.JTextField();
        jLabelJoiningDate = new javax.swing.JLabel();
        jAddTeacherButton = new javax.swing.JButton();
        jLabelAnnualReviewDate = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldTeacherLastName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldJoiningDate = new javax.swing.JTextField();
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

        jLabelTeacherTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelTeacherTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTeacherTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tcher1.png"))); // NOI18N
        jLabelTeacherTitle.setText("Teacher Info");
        jLabelTeacherTitle.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabelLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lmdic1.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addGap(392, 392, 392)
                .addComponent(jLabelTeacherTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTeacherTitle))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
        jButtonUpload.setText("Upload CSV");
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

        jLabeTeacherlFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabeTeacherlFirstName.setText("First Name");
        jPanel2.add(jLabeTeacherlFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 84, -1));

        jTextFieldTeacherFirstName.setToolTipText("Enter Text");
        jTextFieldTeacherFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeacherFirstNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTeacherFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 400, 30));

        jLabeTeacherlLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabeTeacherlLastName.setText("Last Name");
        jPanel2.add(jLabeTeacherlLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 78, -1));

        jTextFieldTeacherAnnualReviewDate.setToolTipText("Enter Text");
        jTextFieldTeacherAnnualReviewDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeacherAnnualReviewDateActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTeacherAnnualReviewDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 232, 400, 30));

        jLabelJoiningDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelJoiningDate.setText("Joining Date");
        jPanel2.add(jLabelJoiningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jAddTeacherButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAddTeacherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
        jAddTeacherButton.setText("Add New Teacher");
        jAddTeacherButton.setToolTipText("Click to Add Data");
        jAddTeacherButton.setMargin(new java.awt.Insets(0, 2, 0, 8));
        jAddTeacherButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAddTeacherButtonMouseClicked(evt);
            }
        });
        jAddTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddTeacherButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jAddTeacherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 166, 30));

        jLabelAnnualReviewDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelAnnualReviewDate.setText("Annual Review Date");
        jPanel2.add(jLabelAnnualReviewDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEmail.setText("Email Id");
        jPanel2.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jTextFieldTeacherLastName.setToolTipText("Enter Text");
        jTextFieldTeacherLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeacherLastNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTeacherLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 400, 30));

        jTextFieldEmail.setToolTipText("Enter Text");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 292, 400, 30));

        jTextFieldJoiningDate.setToolTipText("Enter Text");
        jPanel2.add(jTextFieldJoiningDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 400, 30));

        jInternalFrame1.setVisible(true);

        jScrollPane1.setAutoscrolls(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp Id", "FirstName", "LastName", "Joining Date", "Annual Review Date", "Email Id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
        
    }//GEN-LAST:event_jButtonUploadMouseClicked

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //StudentDaoImpl impl = new StudentDaoImpl();
        TeacherService teacherService = new TeacherService();
  	//TODO add db integration by importing package/class from backend
        Teacher teacher = new Teacher();
 
        if(ValidationUtil.verifyName(jTextFieldTeacherFirstName.getText()) && ValidationUtil.verifyName(jTextFieldTeacherLastName.getText()))
        {
            teacher.setFirstName(jTextFieldTeacherFirstName.getText());
            teacher.setLastName(jTextFieldTeacherLastName.getText());
             
        }
   
        if(ValidationUtil.verifyEmail(jTextFieldEmail.getText())){
            teacher.setEmailID(jTextFieldEmail.getText());
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  	    LocalDate doj = LocalDate.parse(jTextFieldJoiningDate.getText(), formatter);  
  	    LocalDate revDate  = LocalDate.parse(jTextFieldTeacherAnnualReviewDate.getText(), formatter);  
            teacher.setJoiningDate(doj);
            teacher.setAnnualReviewDate(revDate);
            System.out.println(teacher.toString());
        
        try {
           
            teacherService.registerTeacher(teacher);
            
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(TeacherUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
    
    	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int returnValue = jfc.showOpenDialog(null);
		javax.swing.table.DefaultTableModel modelTable = (javax.swing.table.DefaultTableModel)jTable1.getModel();
		// int returnValue = jfc.showSaveDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println("Uploading CSV file from: " + selectedFile.getPath());
			
			if(modelTable.getRowCount() > 0) {
				System.out.println("Recreating Teacher Info table by overriding data");
				modelTable.setRowCount(0);
			}
			
			List<String> teacherRecords = FileUtil.readTextFile(selectedFile.getPath());
			//teacherRecords.forEach(teacher-> teachers.add(TeacherFactory.getInstance().getObject(teacher)));
			teacherRecords.forEach(teacher->{modelTable.addRow(fillTableFromCSV(teacher));});
		
		}
		
    }//GEN-LAST:event_jButtonUploadActionPerformed
    
    //Search in table
    public void searchTableContents(String searchString) {
        DefaultTableModel currtableModel = (DefaultTableModel) jTable1.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(currtableModel);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.toLowerCase()));
        
    };
    
    //Used when csv is uploaded and table is loaded
    public Object[] fillTableFromCSV(String csvRecord) {
    	String[] array = csvRecord.split(",");
    	Object[] data = new Object[array.length];
        for (int i = 0; i < array.length; i++)
            data[i] = array[i];
    	
        return data;
    }
    
    private void jButtonDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDownloadMouseClicked
        
//        JFileChooser chooser = new JFileChooser();
//		chooser.setSelectedFile(new File("teacher.txt")); // user will see this name during download
//		if (JFileChooser.APPROVE_OPTION == chooser.showSaveDialog(null)) {
//			String home = System.getProperty("user.home");
//			File file = new File(home+"/Downloads/teachers.txt");
//			
//			Path originalPath = Paths.get("resources/teachers.txt");
//		    Path copied = Paths.get(home+"/Downloads/teachers.txt");
//		    try {
//		    	System.out.println("Downloading CSV file to " + copied.toString());
//				Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}		
//		}
    	
    	DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    	String pathToDownloads = System.getProperty("user.home");
        FileWriter csv;
		try {
			csv = new FileWriter(new File(pathToDownloads+"/Downloads/teachers.txt"));
			System.out.println("Downloading Teachers Info into CSV at: "+pathToDownloads+"/Downloads/teachers.txt");
			for (int i = 0; i < model.getRowCount(); i++) {
	            for (int j = 0; j < model.getColumnCount(); j++) {
	            	if(j == model.getColumnCount()-1) {
	            		csv.write(model.getValueAt(i, j).toString());
	            	}
	            	else {
	            		csv.write(model.getValueAt(i, j).toString() + ",");
	            	}
	            }
	            csv.write("\n");
	        }
			csv.close();
			
			//TODO add info_dialog to show success
			
			System.out.println("Successfully downloaded teachers.txt CSV file");
		} catch (IOException e) {
			System.out.println("Error in downloading teachers.txt CSV file");
			e.printStackTrace();
		}
		
    }//GEN-LAST:event_jButtonDownloadMouseClicked

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldTeacherLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeacherLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeacherLastNameActionPerformed

    private void jAddTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddTeacherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddTeacherButtonActionPerformed

    private void jAddTeacherButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAddTeacherButtonMouseClicked
        // TODO add your handling code here:
        initialId+=1;
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{initialId,jTextFieldTeacherFirstName.getText(),jTextFieldTeacherLastName.getText(),jTextFieldJoiningDate.getText(),
            jTextFieldTeacherAnnualReviewDate.getText(),jTextFieldEmail.getText()});

    }//GEN-LAST:event_jAddTeacherButtonMouseClicked

    private void jTextFieldTeacherAnnualReviewDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeacherAnnualReviewDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeacherAnnualReviewDateActionPerformed

    private void jTextFieldTeacherFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeacherFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeacherFirstNameActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TeacherUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelSearch;
    private javax.swing.JButton jAddTeacherButton;
    private javax.swing.JButton jButtonDownload;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpload;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabeTeacherlFirstName;
    private javax.swing.JLabel jLabeTeacherlLastName;
    private javax.swing.JLabel jLabelAnnualReviewDate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelJoiningDate;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelTeacherTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldJoiningDate;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldTeacherAnnualReviewDate;
    private javax.swing.JTextField jTextFieldTeacherFirstName;
    private javax.swing.JTextField jTextFieldTeacherLastName;
    // End of variables declaration//GEN-END:variables
}
