
package Interface;

import Interface.ExamResults;
import Interface.Payment;
import Interface.Syllabus;
import java.awt.Color;


public class Menu extends javax.swing.JFrame {
    Color DefaultColor,ClickedColor;
    
    public Menu() {
        initComponents();
        
        DefaultColor= new Color(51,51,51);
        ClickedColor = new Color(21,21,21);
        
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        headbar = new javax.swing.JPanel();
        exitbox = new javax.swing.JButton();
        minimizebox = new javax.swing.JButton();
        slide = new javax.swing.JPanel();
        acc = new javax.swing.JPanel();
        lwpy = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        py = new javax.swing.JLabel();
        imageAvatar1 = new Others.ImageAvatar();
        dashboard = new javax.swing.JPanel();
        dibox = new Others.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sdbox = new Others.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        erbox = new Others.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pmtbox = new Others.RoundPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        anlsbox = new Others.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sbbox = new Others.RoundPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lgobox = new Others.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Data = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        im1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headbar.setBackground(new java.awt.Color(51, 51, 51));
        headbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        headbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbox.setBackground(new java.awt.Color(102, 102, 102));
        exitbox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        exitbox.setText("X");
        exitbox.setToolTipText("Close");
        exitbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        exitbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitboxMouseExited(evt);
            }
        });
        exitbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitboxActionPerformed(evt);
            }
        });
        headbar.add(exitbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1258, 2, 60, 36));

        minimizebox.setBackground(new java.awt.Color(102, 102, 102));
        minimizebox.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        minimizebox.setText("-");
        minimizebox.setToolTipText("Minimize");
        minimizebox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        minimizebox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeboxMouseExited(evt);
            }
        });
        minimizebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeboxActionPerformed(evt);
            }
        });
        headbar.add(minimizebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 2, 50, 36));

        jPanel1.add(headbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1320, 40));

        slide.setBackground(new java.awt.Color(21, 21, 21));
        slide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc.setBackground(new java.awt.Color(51, 51, 51));
        acc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        acc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lwpy.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lwpy.setForeground(new java.awt.Color(255, 255, 255));
        lwpy.setText("Learn With P.Y.");
        acc.add(lwpy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, 30));

        admin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        acc.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 50, 20));

        py.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        py.setForeground(new java.awt.Color(255, 255, 255));
        py.setText("Pasindu Yasith");
        acc.add(py, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 20));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Logo_1.jpg"))); // NOI18N
        acc.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        slide.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 110));

        dashboard.setBackground(new java.awt.Color(51, 51, 51));
        dashboard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dibox.setBackground(new java.awt.Color(0, 0, 0));
        dibox.setForeground(new java.awt.Color(255, 255, 255));
        dibox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                diboxMousePressed(evt);
            }
        });
        dibox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Insert.png"))); // NOI18N
        dibox.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, 40, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Data Insert");
        dibox.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        dashboard.add(dibox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 50));

        sdbox.setBackground(new java.awt.Color(0, 0, 0));
        sdbox.setForeground(new java.awt.Color(255, 255, 255));
        sdbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sdboxMousePressed(evt);
            }
        });
        sdbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Details.png"))); // NOI18N
        sdbox.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Student Details");
        sdbox.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, -1, -1));

        dashboard.add(sdbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 270, 50));

        erbox.setBackground(new java.awt.Color(0, 0, 0));
        erbox.setForeground(new java.awt.Color(255, 255, 255));
        erbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                erboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                erboxMousePressed(evt);
            }
        });
        erbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Test.png"))); // NOI18N
        erbox.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 5, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Exam Results");
        erbox.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, -1, -1));

        dashboard.add(erbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 270, 50));

        pmtbox.setBackground(new java.awt.Color(0, 0, 0));
        pmtbox.setForeground(new java.awt.Color(255, 255, 255));
        pmtbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pmtboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pmtboxMousePressed(evt);
            }
        });
        pmtbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Payment_1.png"))); // NOI18N
        pmtbox.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 5, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Payment");
        pmtbox.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, -1, -1));

        dashboard.add(pmtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 270, 50));

        anlsbox.setBackground(new java.awt.Color(0, 0, 0));
        anlsbox.setForeground(new java.awt.Color(255, 255, 255));
        anlsbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anlsboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anlsboxMousePressed(evt);
            }
        });
        anlsbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Analysing.png"))); // NOI18N
        anlsbox.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Analysist");
        anlsbox.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, -1, -1));

        dashboard.add(anlsbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 270, 50));

        sbbox.setBackground(new java.awt.Color(0, 0, 0));
        sbbox.setForeground(new java.awt.Color(255, 255, 255));
        sbbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sbboxMousePressed(evt);
            }
        });
        sbbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Syllabus_1.png"))); // NOI18N
        sbbox.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Syllubus");
        sbbox.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 7, -1, -1));

        dashboard.add(sbbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 50));

        lgobox.setBackground(new java.awt.Color(0, 0, 0));
        lgobox.setForeground(new java.awt.Color(255, 255, 255));
        lgobox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgoboxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lgoboxMousePressed(evt);
            }
        });
        lgobox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Log Out");
        lgobox.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 7, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Log Out.png"))); // NOI18N
        lgobox.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5, -1, -1));

        dashboard.add(lgobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 470, 240, 50));

        slide.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 290, 530));

        jPanel1.add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 60, 300, 660));

        Data.setBackground(new java.awt.Color(21, 21, 21));
        Data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(21, 21, 21));

        jPanel2.setBackground(new java.awt.Color(21, 21, 21));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© All Right Reserved");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Try to Learn in a New Way,");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Because It's Easy to Study Smart Not Hard...");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        im1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Image 2.png"))); // NOI18N
        im1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.add(im1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Data.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1020, 650));

        jPanel1.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 1040, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1341, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitboxMouseClicked

    private void exitboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseEntered
        exitbox.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_exitboxMouseEntered

    private void exitboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitboxMouseExited
        exitbox.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_exitboxMouseExited

    private void exitboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitboxActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitboxActionPerformed

    private void diboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diboxMouseClicked
       DataInsert di = new DataInsert();
       jDesktopPane1.removeAll();
       jDesktopPane1.add(di).setVisible(true);
    }//GEN-LAST:event_diboxMouseClicked

    private void diboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diboxMousePressed
        dibox.setBackground(ClickedColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_diboxMousePressed

    private void sdboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdboxMouseClicked
        StudentDetails sd = new StudentDetails();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sd).setVisible(true);
    }//GEN-LAST:event_sdboxMouseClicked

    private void sdboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(ClickedColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_sdboxMousePressed

    private void erboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erboxMouseClicked
        ExamResults er = new ExamResults();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(er).setVisible(true);
    }//GEN-LAST:event_erboxMouseClicked

    private void erboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_erboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(ClickedColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_erboxMousePressed

    private void pmtboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmtboxMouseClicked
        Payment pmt = new Payment();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(pmt).setVisible(true);
    }//GEN-LAST:event_pmtboxMouseClicked

    private void pmtboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmtboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(ClickedColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_pmtboxMousePressed

    private void anlsboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anlsboxMouseClicked
        Analyse anls = new Analyse();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(anls).setVisible(true);
    }//GEN-LAST:event_anlsboxMouseClicked

    private void anlsboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anlsboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(ClickedColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_anlsboxMousePressed

    private void sbboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbboxMouseClicked
        Syllabus sb = new Syllabus();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(sb).setVisible(true);
    }//GEN-LAST:event_sbboxMouseClicked

    private void sbboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(DefaultColor);
        sbbox.setBackground(ClickedColor);
    }//GEN-LAST:event_sbboxMousePressed

    private void lgoboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgoboxMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lgoboxMouseClicked

    private void lgoboxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgoboxMousePressed
        dibox.setBackground(DefaultColor);
        sdbox.setBackground(DefaultColor);
        erbox.setBackground(DefaultColor);
        pmtbox.setBackground(DefaultColor);
        anlsbox.setBackground(DefaultColor);
        lgobox.setBackground(ClickedColor);
        sbbox.setBackground(DefaultColor);
    }//GEN-LAST:event_lgoboxMousePressed

    private void minimizeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeboxActionPerformed
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeboxActionPerformed

    private void minimizeboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeboxMouseExited
         minimizebox.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_minimizeboxMouseExited

    private void minimizeboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeboxMouseEntered
        minimizebox.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_minimizeboxMouseEntered

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Data;
    private javax.swing.JPanel acc;
    private javax.swing.JLabel admin;
    private Others.RoundPanel anlsbox;
    private javax.swing.JPanel dashboard;
    private Others.RoundPanel dibox;
    private Others.RoundPanel erbox;
    private javax.swing.JButton exitbox;
    private javax.swing.JPanel headbar;
    private javax.swing.JLabel im1;
    private Others.ImageAvatar imageAvatar1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private Others.RoundPanel lgobox;
    private javax.swing.JLabel lwpy;
    private javax.swing.JButton minimizebox;
    private Others.RoundPanel pmtbox;
    private javax.swing.JLabel py;
    private Others.RoundPanel sbbox;
    private Others.RoundPanel sdbox;
    private javax.swing.JPanel slide;
    // End of variables declaration//GEN-END:variables
}
