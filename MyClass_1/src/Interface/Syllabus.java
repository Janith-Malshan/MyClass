
package Interface;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Syllabus extends javax.swing.JInternalFrame {

        Color DefaultColor , ClickedColor; 
    
    public Syllabus() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
     
        DefaultColor = new Color(255,255,255);
        ClickedColor = new Color(0,0,0);
        
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Head = new javax.swing.JLabel();
        U1 = new javax.swing.JLabel();
        U2 = new javax.swing.JLabel();
        U3 = new javax.swing.JLabel();
        U4 = new javax.swing.JLabel();
        U5I = new javax.swing.JLabel();
        U5II = new javax.swing.JLabel();
        U6 = new javax.swing.JLabel();
        U7 = new javax.swing.JLabel();
        U8 = new javax.swing.JLabel();
        U9 = new javax.swing.JLabel();
        U10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 70, 78));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(21, 21, 21));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Head.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        Head.setForeground(new java.awt.Color(255, 255, 255));
        Head.setText("Biology Syllabus");
        jPanel4.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 400, -1));

        U1.setBackground(new java.awt.Color(255, 255, 255));
        U1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U1.setForeground(new java.awt.Color(255, 255, 255));
        U1.setText("Unit 01                 Introduction to Biology");
        U1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U1MousePressed(evt);
            }
        });
        jPanel4.add(U1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 470, -1));

        U2.setBackground(new java.awt.Color(255, 255, 255));
        U2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U2.setForeground(new java.awt.Color(255, 255, 255));
        U2.setText("Unit 02                 Chemical & cellular basis of life");
        U2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U2MousePressed(evt);
            }
        });
        jPanel4.add(U2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        U3.setBackground(new java.awt.Color(255, 255, 255));
        U3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U3.setForeground(new java.awt.Color(255, 255, 255));
        U3.setText("Unit 03                 Evolution and diversity of organisms");
        U3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U3MousePressed(evt);
            }
        });
        jPanel4.add(U3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        U4.setBackground(new java.awt.Color(255, 255, 255));
        U4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U4.setForeground(new java.awt.Color(255, 255, 255));
        U4.setText("Unit 04                 Plant form and function ");
        U4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U4MousePressed(evt);
            }
        });
        jPanel4.add(U4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        U5I.setBackground(new java.awt.Color(255, 255, 255));
        U5I.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U5I.setForeground(new java.awt.Color(255, 255, 255));
        U5I.setText("Unit 05                 Animal form and function - Part I");
        U5I.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U5I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U5IMousePressed(evt);
            }
        });
        jPanel4.add(U5I, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        U5II.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U5II.setForeground(new java.awt.Color(255, 255, 255));
        U5II.setText("Animal form and function - Part II");
        U5II.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U5II.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U5IIMousePressed(evt);
            }
        });
        jPanel4.add(U5II, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 380, -1));

        U6.setBackground(new java.awt.Color(255, 255, 255));
        U6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U6.setForeground(new java.awt.Color(255, 255, 255));
        U6.setText("Unit 06                 Genetics");
        U6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U6MousePressed(evt);
            }
        });
        jPanel4.add(U6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        U7.setBackground(new java.awt.Color(255, 255, 255));
        U7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        U7.setForeground(new java.awt.Color(255, 255, 255));
        U7.setText("Unit 07                 Molecular Biology & Recombinant DNA Technology");
        U7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U7MousePressed(evt);
            }
        });
        jPanel4.add(U7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 770, -1));

        U8.setBackground(new java.awt.Color(255, 255, 255));
        U8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U8.setForeground(new java.awt.Color(255, 255, 255));
        U8.setText("Unit 08                 Environmental Biology");
        U8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U8MousePressed(evt);
            }
        });
        jPanel4.add(U8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        U9.setBackground(new java.awt.Color(255, 255, 255));
        U9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U9.setForeground(new java.awt.Color(255, 255, 255));
        U9.setText("Unit 09                 Microbiology ");
        U9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U9MousePressed(evt);
            }
        });
        jPanel4.add(U9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        U10.setBackground(new java.awt.Color(255, 255, 255));
        U10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        U10.setForeground(new java.awt.Color(255, 255, 255));
        U10.setText("Unit 10                 Applied Biology");
        U10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        U10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                U10MousePressed(evt);
            }
        });
        jPanel4.add(U10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 556, 390, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 860, 600));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void U1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MousePressed
        U1.setForeground(ClickedColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
         try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/14hPdgc67OrM6X57ONexej200EWdvDYFx/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U1MousePressed

    private void U2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U2MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(ClickedColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
          try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1vlVS19k3Cx9oBC3Xmcfe8oqJ-iennokD/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U2MousePressed

    private void U3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U3MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(ClickedColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
         try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1qpE2sL0TgazBEVuzAnQLTyeV8FDvU3_U/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U3MousePressed

    private void U4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U4MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(ClickedColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
          try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1X4AVImoNTk7gYxDmuV4C_bDVTIlkWEPu/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U4MousePressed

    private void U5IMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U5IMousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(ClickedColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
         try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1FTIjS0b6MLWfp0G-zQdLAAX88b4EK1gc/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U5IMousePressed

    private void U6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U6MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(ClickedColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
        try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1xPTSDj8f7Su845d8vEc-mpbcsmuqhSep/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U6MousePressed

    private void U7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U7MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(ClickedColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
        try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/11TCSn4lzyntpDLNWuV7cMC8x_HEvIkmd/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U7MousePressed

    private void U8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U8MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(ClickedColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
        try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1DosMXCm75kF3fF86h3nig4Azbbvlkpgj/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U8MousePressed

    private void U9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U9MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(ClickedColor);
        U10.setForeground(DefaultColor);
        
        try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1c9seRpMaeOkMBBhcscq9uA_Pv7wUVddR/view").toURI());
        }
        catch (Exception e){}  
    }//GEN-LAST:event_U9MousePressed

    private void U10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U10MousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(DefaultColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(ClickedColor);
        
     try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1387zLyurtZJGOfupjlHw8GcJpo8UymMg/view").toURI());
        }
        catch (Exception e){}      
    }//GEN-LAST:event_U10MousePressed

    private void U1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U1MouseClicked

    private void U5IIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U5IIMousePressed
        U1.setForeground(DefaultColor);
        U2.setForeground(DefaultColor);
        U3.setForeground(DefaultColor);
        U4.setForeground(DefaultColor);
        U5I.setForeground(DefaultColor);
        U5II.setForeground(ClickedColor);
        U6.setForeground(DefaultColor);
        U7.setForeground(DefaultColor);
        U8.setForeground(DefaultColor);
        U9.setForeground(DefaultColor);
        U10.setForeground(DefaultColor);
        
        try{
           Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1SFrs5tF9fnfikHJfwvSddmN2lDPpBOsE/view?usp=drivesdk").toURI());
        }
        catch (Exception e){} 
    }//GEN-LAST:event_U5IIMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Head;
    private javax.swing.JLabel U1;
    private javax.swing.JLabel U10;
    private javax.swing.JLabel U2;
    private javax.swing.JLabel U3;
    private javax.swing.JLabel U4;
    private javax.swing.JLabel U5I;
    private javax.swing.JLabel U5II;
    private javax.swing.JLabel U6;
    private javax.swing.JLabel U7;
    private javax.swing.JLabel U8;
    private javax.swing.JLabel U9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
