
package Interface;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import DatabaseConnection.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CreateNewAccount extends javax.swing.JFrame {

     Connection conn = null;
     PreparedStatement pst = null;
    
    public CreateNewAccount() {
        initComponents();
        conn =  DBconnect.connect();
    }

     public void createnewaccount(){
    
        String uname;
        String pword;

        uname = unbox1.getText();
        pword = passwordbox1.getText();
        
        if(uname.equals("") && pword.equals("")) {
            JOptionPane.showMessageDialog(null, "Insert the UserName and Password");
        
        }
        
        else {

        try {
            String sql = "INSERT INTO UserNamePassword (UserName, [Enter New Password])  VALUES('"+uname+"', '"+pword+"' )";

            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Another Password");

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
        password = new javax.swing.JLabel();
        passwordbox1 = new javax.swing.JPasswordField();
        unbox1 = new javax.swing.JTextField();
        cnabox = new javax.swing.JButton();
        showpasswordbox1 = new javax.swing.JCheckBox();
        backbox = new javax.swing.JButton();
        exitbox = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        passwordbox1.setBackground(new java.awt.Color(0, 0, 0));
        passwordbox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        passwordbox1.setForeground(new java.awt.Color(255, 255, 255));
        passwordbox1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(passwordbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, -1));

        unbox1.setBackground(new java.awt.Color(0, 0, 0));
        unbox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        unbox1.setForeground(new java.awt.Color(255, 255, 255));
        unbox1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(unbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 250, -1));

        cnabox.setBackground(new java.awt.Color(0, 0, 0));
        cnabox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cnabox.setForeground(new java.awt.Color(255, 255, 255));
        cnabox.setText("Create New Account");
        cnabox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnabox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnaboxActionPerformed(evt);
            }
        });
        jPanel1.add(cnabox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        showpasswordbox1.setBackground(new java.awt.Color(0, 0, 0,80)
        );
        showpasswordbox1.setForeground(new java.awt.Color(255, 255, 255));
        showpasswordbox1.setText("Show Password");
        showpasswordbox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpasswordbox1.setOpaque(true);
        showpasswordbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordbox1ActionPerformed(evt);
            }
        });
        jPanel1.add(showpasswordbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 236, -1, 18));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create New Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 39));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Image 1_1.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cnaboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnaboxActionPerformed
        createnewaccount();
    }//GEN-LAST:event_cnaboxActionPerformed

    private void showpasswordbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordbox1ActionPerformed
        if(showpasswordbox1.isSelected()){
            passwordbox1.setEchoChar((char)0);}
        else
        passwordbox1.setEchoChar('*');
    }//GEN-LAST:event_showpasswordbox1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbox;
    private javax.swing.JButton cnabox;
    private javax.swing.JButton exitbox;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordbox1;
    private javax.swing.JCheckBox showpasswordbox1;
    private javax.swing.JTextField unbox1;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
