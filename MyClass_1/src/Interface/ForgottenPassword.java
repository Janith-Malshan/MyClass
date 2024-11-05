
package Interface;

import DatabaseConnection.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ForgottenPassword extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    
    public ForgottenPassword() {
        initComponents();
        conn =  DBconnect.connect();
    }


    public void reset(){
     
        String uname;
        String pword1;
        String pword2;
        
        uname = unbox.getText();
        pword1 = enpbox.getText();
        pword2 = renpbox.getText();
        
           if(uname.equals("") && pword1.equals("") && pword2.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert the UserName and Password"); 
           }
           
           else{
            
        try {
            if(pword1.equals(pword2)){
                
            String sql = "UPDATE UserNamePassword SET [Enter New Password] = '"+pword1+"'  WHERE UserName = '"+uname+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Your Password is Reset");
            
            }
            else {
            JOptionPane.showMessageDialog(null,"Your UserName or Password are Not Matching");
            }
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }   
        finally {
                 try {
                      pst.close();
                 } catch (Exception e) {
                 }
}
           }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        enpassword = new javax.swing.JLabel();
        enpbox = new javax.swing.JPasswordField();
        unbox = new javax.swing.JTextField();
        resetbox = new javax.swing.JButton();
        renpbox = new javax.swing.JPasswordField();
        renpassword = new javax.swing.JLabel();
        showpasswordbox3 = new javax.swing.JCheckBox();
        backbox = new javax.swing.JButton();
        exitbox = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Logo.jpg"))); // NOI18N
        logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("UserName");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        enpassword.setBackground(new java.awt.Color(0, 0, 0));
        enpassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        enpassword.setForeground(new java.awt.Color(255, 255, 255));
        enpassword.setText("Enter New Password");
        jPanel1.add(enpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        enpbox.setBackground(new java.awt.Color(0, 0, 0));
        enpbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        enpbox.setForeground(new java.awt.Color(255, 255, 255));
        enpbox.setCaretColor(new java.awt.Color(255, 255, 255));
        enpbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enpboxActionPerformed(evt);
            }
        });
        jPanel1.add(enpbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 170, -1));

        unbox.setBackground(new java.awt.Color(0, 0, 0));
        unbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        unbox.setForeground(new java.awt.Color(255, 255, 255));
        unbox.setCaretColor(new java.awt.Color(255, 255, 255));
        unbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unboxActionPerformed(evt);
            }
        });
        jPanel1.add(unbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 170, -1));

        resetbox.setBackground(new java.awt.Color(0, 0, 0));
        resetbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        resetbox.setForeground(new java.awt.Color(255, 255, 255));
        resetbox.setText("Reset");
        resetbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetboxActionPerformed(evt);
            }
        });
        jPanel1.add(resetbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        renpbox.setBackground(new java.awt.Color(0, 0, 0));
        renpbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        renpbox.setForeground(new java.awt.Color(255, 255, 255));
        renpbox.setCaretColor(new java.awt.Color(255, 255, 255));
        renpbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renpboxActionPerformed(evt);
            }
        });
        jPanel1.add(renpbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, -1));

        renpassword.setBackground(new java.awt.Color(0, 0, 0));
        renpassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        renpassword.setForeground(new java.awt.Color(255, 255, 255));
        renpassword.setText("Re Enter New Password");
        jPanel1.add(renpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        showpasswordbox3.setBackground(new java.awt.Color(0, 0, 0,80)
        );
        showpasswordbox3.setForeground(new java.awt.Color(255, 255, 255));
        showpasswordbox3.setText("Show Password");
        showpasswordbox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpasswordbox3.setOpaque(true);
        showpasswordbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordbox3ActionPerformed(evt);
            }
        });
        jPanel1.add(showpasswordbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        backbox.setBackground(new java.awt.Color(0, 0, 0));
        backbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        backbox.setForeground(new java.awt.Color(255, 255, 255));
        backbox.setText("Back");
        backbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backboxActionPerformed(evt);
            }
        });
        jPanel1.add(backbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 30));

        exitbox.setBackground(new java.awt.Color(0, 0, 0));
        exitbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        exitbox.setForeground(new java.awt.Color(255, 255, 255));
        exitbox.setText("Exit");
        exitbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitboxActionPerformed(evt);
            }
        });
        jPanel1.add(exitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 30));

        text1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("Forgotten Password");
        jPanel1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Image 1_1.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enpboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enpboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enpboxActionPerformed

    private void unboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unboxActionPerformed

    private void resetboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetboxActionPerformed
        reset();
    }//GEN-LAST:event_resetboxActionPerformed

    private void renpboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renpboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_renpboxActionPerformed

    private void showpasswordbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordbox3ActionPerformed
        if(showpasswordbox3.isSelected()){
            enpbox.setEchoChar((char)0);
            renpbox.setEchoChar((char)0);}
        else
        enpbox.setEchoChar('*');
    }//GEN-LAST:event_showpasswordbox3ActionPerformed

    private void backboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backboxActionPerformed
        Login lg = new Login ();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backboxActionPerformed

    private void exitboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitboxActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitboxActionPerformed

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
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgottenPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbox;
    private javax.swing.JLabel enpassword;
    private javax.swing.JPasswordField enpbox;
    private javax.swing.JButton exitbox;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel renpassword;
    private javax.swing.JPasswordField renpbox;
    private javax.swing.JButton resetbox;
    private javax.swing.JCheckBox showpasswordbox3;
    private javax.swing.JLabel text1;
    private javax.swing.JTextField unbox;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
