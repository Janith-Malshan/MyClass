
package Interface;

import DatabaseConnection.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;


public class StudentDetails extends javax.swing.JInternalFrame {
       Connection conn = null;
       PreparedStatement pst = null;
       ResultSet rs = null;
       Color bgcolor;
    
    public StudentDetails() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        conn = DBconnect.connect();
        tableload();
        tablesize();
        
        bgcolor = new Color(21,21,21);
        
        jScrollPane1.getVerticalScrollBar().setBackground(bgcolor);
    }
    private void tablesize(){
        table1.getColumnModel().getColumn(0).setPreferredWidth(60);
        table1.getColumnModel().getColumn(1).setPreferredWidth(220);
        table1.getColumnModel().getColumn(2).setPreferredWidth(150);
        table1.getColumnModel().getColumn(3).setPreferredWidth(220);
        table1.getColumnModel().getColumn(4).setPreferredWidth(70);
        table1.getColumnModel().getColumn(5).setPreferredWidth(200);
        table1.getColumnModel().getColumn(6).setPreferredWidth(100);
    
    }
    
    
    private void tableload(){
       try {
            String sql = "SELECT ID,Name,[ID Card Number],Gmail, [A/L Year], School, District FROM StudentDetails";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
            tablesize();
            
        } catch (Exception e) {
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
    
    
     public void search(){
    
        String srch = searchbox.getText();
        
        try {
            
            String sql = "SELECT * FROM StudentDetails WHERE Name LIKE '%"+srch+"%' OR ID LIKE '%"+srch+"%' OR [A/L Year] LIKE '%"+srch+"%' " ;
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));
                    
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        srch = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 686));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srch.setBackground(new java.awt.Color(51, 51, 51));
        srch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        srch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.setBackground(new java.awt.Color(51, 51, 51));
        searchbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        searchbox.setForeground(new java.awt.Color(255, 255, 255));
        searchbox.setBorder(null);
        searchbox.setCaretColor(new java.awt.Color(255, 255, 255));
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        srch.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 1, 970, 38));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Search.png"))); // NOI18N
        srch.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, -1, -1));

        jPanel1.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        jScrollPane1.setBackground(new java.awt.Color(21, 21, 21));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        table1.setAutoCreateRowSorter(true);
        table1.setBackground(new java.awt.Color(51, 51, 51));
        table1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "IDC Number", "Gmail", "A/L Year", "School", "District"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table1.setDragEnabled(true);
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setRowHeight(35);
        table1.setSelectionBackground(new java.awt.Color(21, 21, 21));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table1.setShowGrid(true);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1020, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
     
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
       
    }//GEN-LAST:event_table1KeyReleased

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        search();
        tablesize();
    }//GEN-LAST:event_searchboxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JPanel srch;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
