/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.proyect.view;

import ec.edu.espe.proyect.controller.StudentController;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class StudentI extends javax.swing.JFrame {

    StudentController student = new  StudentController();
    
    /**
     * Creates new form Product
     */
    public StudentI() {
        
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        PnlInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCivilSatus = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        PnlButtoms = new javax.swing.JPanel();
        BtmAdd = new javax.swing.JButton();
        BtmDelete = new javax.swing.JButton();
        BtmUpdate = new javax.swing.JButton();
<<<<<<< HEAD:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentWindow.java
        BtmDisplay = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
=======

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");
>>>>>>> db3c26c6ca4e075707af352cd687ce3d08d5c378:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentI.java

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlInput.setForeground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setText("STUDENT INFORMATION ");

        jLabel2.setText("Cedula");

        jLabel3.setText("Names");

        jLabel4.setText("Last Name");

        jLabel5.setText("Phone");

        jLabel6.setText("Civil Status");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        jLabel7.setText("Sex");

        jLabel8.setText("Email");

        javax.swing.GroupLayout PnlInputLayout = new javax.swing.GroupLayout(PnlInput);
        PnlInput.setLayout(PnlInputLayout);
        PnlInputLayout.setHorizontalGroup(
            PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(38, 38, 38)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlInputLayout.createSequentialGroup()
                        .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlInputLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(PnlInputLayout.createSequentialGroup()
                        .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCivilSatus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNames, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        PnlInputLayout.setVerticalGroup(
            PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlInputLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCivilSatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(25, 25, 25)
                .addGroup(PnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        BtmAdd.setText("ADD");
        BtmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmAddActionPerformed(evt);
            }
        });

        BtmDelete.setText("DELETE");
        BtmDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDeleteActionPerformed(evt);
            }
        });

        BtmUpdate.setText("UPDATE");
        BtmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmUpdateActionPerformed(evt);
            }
        });

<<<<<<< HEAD:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentWindow.java
        BtmDisplay.setText("DISPLAY");
        BtmDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmDisplayActionPerformed(evt);
            }
        });

        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

=======
>>>>>>> db3c26c6ca4e075707af352cd687ce3d08d5c378:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentI.java
        javax.swing.GroupLayout PnlButtomsLayout = new javax.swing.GroupLayout(PnlButtoms);
        PnlButtoms.setLayout(PnlButtomsLayout);
        PnlButtomsLayout.setHorizontalGroup(
            PnlButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtomsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtmAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtmDelete)
                .addGap(82, 82, 82)
                .addComponent(BtmUpdate)
<<<<<<< HEAD:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentWindow.java
                .addGap(51, 51, 51)
                .addComponent(BtmDisplay)
                .addGap(29, 29, 29)
                .addComponent(btnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addGap(88, 88, 88))
>>>>>>> db3c26c6ca4e075707af352cd687ce3d08d5c378:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentI.java
        );
        PnlButtomsLayout.setVerticalGroup(
            PnlButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtomsLayout.createSequentialGroup()
<<<<<<< HEAD:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentWindow.java
                .addGap(32, 32, 32)
                .addGroup(PnlButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtmAdd)
                    .addComponent(BtmDelete)
                    .addComponent(BtmUpdate)
                    .addComponent(BtmDisplay)
                    .addComponent(btnback))
=======
                .addGroup(PnlButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlButtomsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtmAdd))
                    .addGroup(PnlButtomsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PnlButtomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtmUpdate)
                            .addComponent(BtmDelete))))
>>>>>>> db3c26c6ca4e075707af352cd687ce3d08d5c378:6.Code/ProyectStudentDataBase/src/ec/edu/espe/proyect/view/StudentI.java
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlButtoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlButtoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmAddActionPerformed
StudentController studentController = new StudentController();       
     Integer cedula , phone;
     String names,lastName,civilStatus,sex,email; 
     
   
    if (txtCedula.getText().length()==0 || txtNames.getText().length() == 0 ||
            txtLastName.getText().length() == 0|| txtCivilSatus.getText().length() == 0 
            || txtPhone.getText().length() == 0 ||txtSex.getText().length() == 0
                    || txtEmail.getText().length() == 0){
       
     JOptionPane.showConfirmDialog(null, "Enter Information" , "OK", JOptionPane.DEFAULT_OPTION);
    BtmAdd.enable(false);
    
    } else{
        BtmAdd.enable(true);
        cedula = Integer.parseInt(this.txtCedula.getText());
        names = this.txtNames.getText();
        lastName = this.txtLastName.getText();
        civilStatus = this.txtCivilSatus.getText();
        phone = Integer.parseInt(this.txtPhone.getText());
        sex =  this.txtSex.getText();
        email = this.txtEmail.getText();
        student.add(cedula, names, lastName, civilStatus, phone, sex,email);
        
    
    }
    
    
    txtCedula.setText("");
    txtNames.setText(""); 
    txtLastName.setText("");
    txtCivilSatus.setText("");
    txtPhone.setText("");
    txtSex.setText("");
    txtEmail.setText("");
        
        
        
     
        
    }//GEN-LAST:event_BtmAddActionPerformed

    private void BtmDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmDeleteActionPerformed
     
        Integer cedulaD = Integer.parseInt(JOptionPane.showInputDialog("Enter Cedula to Delete"));
        student.delete(cedulaD); 
    }//GEN-LAST:event_BtmDeleteActionPerformed

    private void BtmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmUpdateActionPerformed

        Integer cedulaU = Integer.parseInt(JOptionPane.showInputDialog("Enter cedula to update"));
        String namesU = JOptionPane.showInputDialog("Enter ");
        student.update(cedulaU, namesU);
        
    }//GEN-LAST:event_BtmUpdateActionPerformed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        StudenySystem studenySystem = new StudenySystem();
        studenySystem.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(StudentI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtmAdd;
    private javax.swing.JButton BtmDelete;
    private javax.swing.JButton BtmUpdate;
    private javax.swing.JPanel PnlButtoms;
    private javax.swing.JPanel PnlInput;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCivilSatus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}
