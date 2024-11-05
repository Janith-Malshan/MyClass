
package Interface;

import javax.swing.plaf.ProgressBarUI;
import javax.swing.JDesktopPane;
import java.awt.Desktop;

public class StartedPage extends javax.swing.JFrame {

  
     
    public StartedPage() {
        initComponents();  
    }
    
    public static void main(String args[]) {
      
        StartedPage sp = new StartedPage();
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                sp.setVisible(true);
                
        }
        });
        
      
        try {
            for (int i = 0 ; i <= 100; i++){
               
                Thread.sleep(40);
                sp.progressbar.setValue(i);
                sp.progressvalue.setText(Integer.toString(i)+"%");
            }
        } catch (Exception e) {
        }
        
        
        Login lg = new Login();
        lg.setVisible(true);
        sp.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        progressbar = new javax.swing.JProgressBar();
        progressinglabel = new javax.swing.JLabel();
        progressvalue = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Logo.jpg"))); // NOI18N
        logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progressbar.setBackground(new java.awt.Color(0, 0, 0));
        progressbar.setForeground(new java.awt.Color(51, 51, 51));
        progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 330, 20));

        progressinglabel.setBackground(new java.awt.Color(0, 102, 102));
        progressinglabel.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        progressinglabel.setForeground(new java.awt.Color(255, 255, 255));
        progressinglabel.setText("Progressing...");
        jPanel1.add(progressinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        progressvalue.setBackground(new java.awt.Color(0, 102, 102));
        progressvalue.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        progressvalue.setForeground(new java.awt.Color(255, 255, 255));
        progressvalue.setText("0%");
        jPanel1.add(progressvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 40, 20));

        text1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setText("Welcome To");
        jPanel1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 180, 60));

        text3.setBackground(new java.awt.Color(255, 255, 255));
        text3.setFont(new java.awt.Font("Segoe UI", 1, 45)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setText("Learn With P.Y.");
        jPanel1.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, 330, 50));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Image 1_1.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 350, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel progressinglabel;
    private javax.swing.JLabel progressvalue;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables

    void EXIT_ON_CLOSE(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
