/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eheathcaremanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Agha
 */
public class DoctorDataForm extends javax.swing.JFrame {

    /**
     * Creates new form DoctorDataForm
     */
    public DoctorDataForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Back_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ID_TextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name_TextField = new javax.swing.JTextField();
        Specialize_TextField = new javax.swing.JTextField();
        phoneNo_TextField = new javax.swing.JTextField();
        Fee_TextField = new javax.swing.JTextField();
        Time_Starts_TextField = new javax.swing.JTextField();
        Time_Ends_TextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        male_RadioButton = new javax.swing.JRadioButton();
        female_RadioButton = new javax.swing.JRadioButton();
        PassField = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                                                                                                                                                                                HN Health Care Management System");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back_Button.setBackground(new java.awt.Color(153, 0, 0));
        Back_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back_Button.setForeground(new java.awt.Color(255, 255, 255));
        Back_Button.setText("BACK");
        Back_Button.setBorderPainted(false);
        Back_Button.setOpaque(true);
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 110, 40));

        Add_Button.setBackground(new java.awt.Color(153, 0, 0));
        Add_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add_Button.setForeground(new java.awt.Color(255, 255, 255));
        Add_Button.setText("ADD");
        Add_Button.setBorderPainted(false);
        Add_Button.setOpaque(true);
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 630, 110, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Doctor's Information");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 56));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 303, 220, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eheathcaremanagementsystem/upper background.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 280, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ID : ");

        ID_TextField.setForeground(new java.awt.Color(204, 204, 204));
        ID_TextField.setText("Enter id of doctor");
        ID_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ID_TextFieldMouseClicked(evt);
            }
        });
        ID_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ID_TextFieldKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Specialization : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Phone No : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Fee :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Availibilty Time : ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Starts From : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Ends At :");

        name_TextField.setForeground(new java.awt.Color(204, 204, 204));
        name_TextField.setText("Enter name if doctor");
        name_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_TextFieldMouseClicked(evt);
            }
        });

        Specialize_TextField.setForeground(new java.awt.Color(204, 204, 204));
        Specialize_TextField.setText("Enter specialization of doctor");
        Specialize_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Specialize_TextFieldMouseClicked(evt);
            }
        });

        phoneNo_TextField.setForeground(new java.awt.Color(204, 204, 204));
        phoneNo_TextField.setText("Enter phone number of doctor");
        phoneNo_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNo_TextFieldMouseClicked(evt);
            }
        });

        Fee_TextField.setForeground(new java.awt.Color(204, 204, 204));
        Fee_TextField.setText("Enter fee of doctor");
        Fee_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fee_TextFieldMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender :");

        male_RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male_RadioButton);
        male_RadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male_RadioButton.setText("Male");

        female_RadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female_RadioButton);
        female_RadioButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female_RadioButton.setText("Female");

        PassField.setForeground(new java.awt.Color(204, 204, 204));
        PassField.setText("Enter password of doctor");
        PassField.setEchoChar('\u0000');
        PassField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassFieldMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(191, 191, 191))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Time_Starts_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Time_Ends_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addGap(41, 41, 41))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Fee_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(phoneNo_TextField)
                                    .addComponent(Specialize_TextField)
                                    .addComponent(name_TextField)
                                    .addComponent(ID_TextField)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(male_RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(female_RadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male_RadioButton)
                    .addComponent(female_RadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Specialize_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phoneNo_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Fee_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time_Starts_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time_Ends_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 630, 510));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eheathcaremanagementsystem/background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1750, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
        
        AdminMenu am=new AdminMenu();
        am.setVisible(true);
        am.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        // TODO add your handling code here:
        try{
        if(ID_TextField.getText().isEmpty() || name_TextField.getText().isEmpty() || male_RadioButton.getText().isEmpty() || phoneNo_TextField.getText().isEmpty() || Fee_TextField.getText().isEmpty() || Time_Starts_TextField.getText().isEmpty()|| Time_Ends_TextField.getText().isEmpty()|| PassField.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Information Missing");
        }
         else{
        String ids = ID_TextField.getText();
        String name = name_TextField.getText();
        String gender = "";
        if(male_RadioButton.isSelected()){
            gender="male";
        }
        else{
            gender="female";
        }
        String Spec = Specialize_TextField.getText();
        String phoneNo = phoneNo_TextField.getText();
        String fee = Fee_TextField.getText();
        String t1 = Time_Starts_TextField.getText();
        String t2 = Time_Ends_TextField.getText();
        String pass = PassField.getText();
        int fees = Integer.parseInt(fee);
        int stime = Integer.parseInt(t1);
        int etime = Integer.parseInt(t2);
        
        //using business class
        
        Doctor d = new Doctor(ids,name,gender,Spec,phoneNo,fees,stime,etime,pass);
        
        //third layer
        
        DoctorFileHandler df = new DoctorFileHandler();
        df.write(d);
        JOptionPane.showMessageDialog(this, "Doctor information is added successfully");
        
        //Empty tex areas after adding
        
        ID_TextField.setText("");
        name_TextField.setText("");
        Specialize_TextField.setText("");
        phoneNo_TextField.setText("");
        Fee_TextField.setText("");
        Time_Starts_TextField.setText("");
        Time_Ends_TextField.setText("");
        PassField.setText("");
        } 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Information is wrong");
        }
    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void ID_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_TextFieldMouseClicked
        // TODO add your handling code here:
        if(ID_TextField.getText().equals("Enter id of doctor"))
        {
        ID_TextField.setText(null);
        ID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        ID_TextField.setText("");
        }
    }//GEN-LAST:event_ID_TextFieldMouseClicked

    private void name_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_TextFieldMouseClicked
        // TODO add your handling code here:
        if(name_TextField.getText().equals("Enter name if doctor"))
        {
        name_TextField.setText(null);
        name_TextField.setForeground(new java.awt.Color(0, 0, 0));
        name_TextField.setText("");
        }
    }//GEN-LAST:event_name_TextFieldMouseClicked

    private void Specialize_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Specialize_TextFieldMouseClicked
        // TODO add your handling code here:
        if(Specialize_TextField.getText().equals("Enter specialization of doctor"))
        {
        Specialize_TextField.setText(null);
        Specialize_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Specialize_TextField.setText("");
        }
    }//GEN-LAST:event_Specialize_TextFieldMouseClicked

    private void phoneNo_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNo_TextFieldMouseClicked
        // TODO add your handling code here:
        if(phoneNo_TextField.getText().equals("Enter phone number of doctor"))
        {
        phoneNo_TextField.setText(null);
        phoneNo_TextField.setForeground(new java.awt.Color(0, 0, 0));
        phoneNo_TextField.setText("");
        }
    }//GEN-LAST:event_phoneNo_TextFieldMouseClicked

    private void Fee_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fee_TextFieldMouseClicked
        // TODO add your handling code here:
         if(Fee_TextField.getText().equals("Enter fee of doctor"))
        {
        Fee_TextField.setText(null);
        Fee_TextField.setForeground(new java.awt.Color(0, 0, 0));
        Fee_TextField.setText("");
        }
    }//GEN-LAST:event_Fee_TextFieldMouseClicked

    private void ID_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_TextFieldKeyPressed
        // TODO add your handling code here:
        if(ID_TextField.getText().equals("Enter id of doctor"))
        {
        ID_TextField.setText(null);
        ID_TextField.setForeground(new java.awt.Color(0, 0, 0));
        ID_TextField.setText("");
        }
    }//GEN-LAST:event_ID_TextFieldKeyPressed

    private void PassFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassFieldMouseClicked
        // TODO add your handling code here:
        if(PassField.getText().equals("Enter password of doctor"))
        {
        PassField.setEchoChar('*');
        PassField.setText(null);
        PassField.setForeground(new java.awt.Color(0, 0, 0));
        PassField.setText("");
        }
    }//GEN-LAST:event_PassFieldMouseClicked

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
            java.util.logging.Logger.getLogger(DoctorDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Back_Button;
    private javax.swing.JTextField Fee_TextField;
    private javax.swing.JTextField ID_TextField;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JTextField Specialize_TextField;
    private javax.swing.JTextField Time_Ends_TextField;
    private javax.swing.JTextField Time_Starts_TextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton female_RadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton male_RadioButton;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JTextField phoneNo_TextField;
    // End of variables declaration//GEN-END:variables
}
