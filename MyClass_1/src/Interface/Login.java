
package Interface;

import DatabaseConnection.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JDesktopPane;
import java.awt.Desktop;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        conn =  DBconnect.connect();
        
    }

          public void login(){
          
          String pass = passwordbox2.getText();
          String uname = unbox2.getText();
          
             try{
                String sql = "SELECT * FROM UserNamePassword WHERE [Enter New Password]=? " ;
                pst = conn.prepareStatement(sql);
                pst.setString(1, pass);
                rs = pst.executeQuery();
                  
                if(rs.next()){
                    String username = rs.getString("UserName");
                    if(uname.equals(username)){
                   Menu menu = new Menu();
                   menu.setVisible(true);
                   this.dispose();
                    
                }
                    else{
                    JOptionPane.showMessageDialog(null, "Username and Password Not Correct");
                    }
                }
                else{
                  JOptionPane.showMessageDialog(null, "Username and Password Not Correct");
                }
                
             }
             
             catch(Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } 
             finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
      }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        login = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        passwordbox2 = new javax.swing.JPasswordField();
        unbox2 = new javax.swing.JTextField();
        loginbox = new javax.swing.JButton();
        fpbox = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        cnabox = new javax.swing.JButton();
        exitbox = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showpasswordbox2 = new javax.swing.JCheckBox();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Logo.jpg"))); // NOI18N
        logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        login.setBackground(new java.awt.Color(0, 0, 0,80));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("UserName");
        login.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 97, -1, -1));

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 137, 65, -1));

        passwordbox2.setBackground(new java.awt.Color(0, 0, 0));
        passwordbox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        passwordbox2.setForeground(new java.awt.Color(255, 255, 255));
        passwordbox2.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordbox2ActionPerformed(evt);
            }
        });
        login.add(passwordbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 137, 219, -1));

        unbox2.setBackground(new java.awt.Color(0, 0, 0));
        unbox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        unbox2.setForeground(new java.awt.Color(255, 255, 255));
        unbox2.setCaretColor(new java.awt.Color(255, 255, 255));
        unbox2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        login.add(unbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 97, 219, -1));

        loginbox.setBackground(new java.awt.Color(0, 0, 0));
        loginbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        loginbox.setForeground(new java.awt.Color(255, 255, 255));
        loginbox.setText("Log In");
        loginbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginboxActionPerformed(evt);
            }
        });
        login.add(loginbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 195, -1, -1));

        fpbox.setBackground(new java.awt.Color(0, 0, 0));
        fpbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        fpbox.setForeground(new java.awt.Color(255, 255, 255));
        fpbox.setText("Forgotten Password");
        fpbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fpbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpboxActionPerformed(evt);
            }
        });
        login.add(fpbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 240, -1, -1));

        or.setBackground(new java.awt.Color(0, 0, 0));
        or.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        or.setForeground(new java.awt.Color(255, 255, 255));
        or.setText("OR");
        login.add(or, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 279, 25, 22));

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
        login.add(cnabox, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 319, -1, -1));

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
        login.add(exitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log In");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        showpasswordbox2.setBackground(new java.awt.Color(0, 0, 0,80));
        showpasswordbox2.setForeground(new java.awt.Color(255, 255, 255));
        showpasswordbox2.setText("Show Password");
        showpasswordbox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpasswordbox2.setOpaque(true);
        showpasswordbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordbox2ActionPerformed(evt);
            }
        });
        login.add(showpasswordbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 165, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Image 1_1.png"))); // NOI18N
        login.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        jDesktopPane1.add(login, java.awt.BorderLayout.CENTER);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordbox2ActionPerformed

    private void loginboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginboxActionPerformed
        login();
    }//GEN-LAST:event_loginboxActionPerformed

    private void fpboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpboxActionPerformed

        ForgottenPassword fp = new ForgottenPassword();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fpboxActionPerformed

    private void cnaboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnaboxActionPerformed
        CreateNewAccount cna = new CreateNewAccount();
        cna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cnaboxActionPerformed

    private void exitboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitboxActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitboxActionPerformed

    private void showpasswordbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordbox2ActionPerformed
        if(showpasswordbox2.isSelected())
        passwordbox2.setEchoChar((char)0);
        else
        passwordbox2.setEchoChar('*');
    }//GEN-LAST:event_showpasswordbox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cnabox;
    private javax.swing.JButton exitbox;
    private javax.swing.JButton fpbox;
    private javax.swing.JLabel image;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginbox;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel or;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordbox2;
    private javax.swing.JCheckBox showpasswordbox2;
    private javax.swing.JTextField unbox2;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
