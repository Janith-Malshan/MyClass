
package Interface;


import javax.swing.plaf.basic.BasicInternalFrameUI;
import DatabaseConnection.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.ButtonGroup;

public class Payment extends javax.swing.JInternalFrame {
    
      Connection conn = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
      Color bgcolor;
    
    public Payment() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        conn =  DBconnect.connect();
        tablesize();
        tableload();
        
        bgcolor = new Color(21,21,21);
        
        jScrollPane1.getVerticalScrollBar().setBackground(bgcolor);
        
    }
   
    public void tablesize(){
    
        table1.getColumnModel().getColumn(0).setPreferredWidth(60);
        table1.getColumnModel().getColumn(1).setPreferredWidth(220);
        table1.getColumnModel().getColumn(2).setPreferredWidth(220);
        table1.getColumnModel().getColumn(3).setPreferredWidth(52);
        table1.getColumnModel().getColumn(4).setPreferredWidth(52);
        table1.getColumnModel().getColumn(5).setPreferredWidth(52);
        table1.getColumnModel().getColumn(6).setPreferredWidth(52);
        table1.getColumnModel().getColumn(7).setPreferredWidth(52);
        table1.getColumnModel().getColumn(8).setPreferredWidth(52);
        table1.getColumnModel().getColumn(9).setPreferredWidth(52);
        table1.getColumnModel().getColumn(10).setPreferredWidth(52);
        table1.getColumnModel().getColumn(11).setPreferredWidth(52);
        table1.getColumnModel().getColumn(12).setPreferredWidth(52);
    }


    
    public void tableload(){
    
         try {
            String sql = "SELECT t.ID, t.Name, t.Gmail, ti.Lesson01 AS [Les.01], ti.Lesson02 AS [Les.02], ti.Lesson03 AS [Les.03], ti.Lesson04 AS [Les.04], ti.Lesson05 AS [Les.05], ti.Lesson06 AS [Les.06], ti.Lesson07 AS [Les.07], ti.Lesson08 AS [Les.08], ti.Lesson09 AS [Les.09], ti.Lesson10 AS [Les.10] FROM StudentDetails AS t JOIN Payment AS ti ON t.ID = ti.ID" ;
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
            
            String sql = "SELECT t.ID, t.Name, t.Gmail, ti.Lesson01, ti.Lesson02, ti.Lesson03, ti.Lesson04, ti.Lesson05, ti.Lesson06, ti.Lesson07, ti.Lesson08, ti.Lesson09, ti.Lesson10  FROM StudentDetails AS t JOIN Payment AS ti ON t.ID = ti.ID WHERE Name LIKE '%"+srch+"%' OR Gmail LIKE '%"+srch+"%' OR t.ID LIKE '%"+srch+"%' " ;
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
    
    public int table(){
        int r1 ;
        r1 = table1.getRowCount();
       return r1;
    }
    
    
    public int table1(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 3).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table2(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 4).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
   
    public int table3(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 5).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table4(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 6).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table5(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 7).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table6(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 8).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table7(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 9).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table8(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 10).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table9(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 11).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    
    public int table10(){
     
        String lesson2 ; 
          int r1 ;
          int num1 ;
          int num2 = 0;
          
         r1 = table1.getRowCount();
         
            for(int r3=0 ; r3<r1 ; r3++){
                  lesson2 = table1.getValueAt(r3, 12).toString();
               if(lesson2.equals("Yes")){
                  num1 = 1 ;  }
               else{
                  num1 = 0 ;   } 
               num2 = num2 + num1;
              }
            return num2;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        srch = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(17, 70, 96));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 686));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setAutoCreateRowSorter(true);
        table1.setBackground(new java.awt.Color(51, 51, 51));
        table1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gmail", "Le.01", "Le.02", "Le.03", "Le.04", "Le.05", "Le.06", "Le.07", "Le.08", "Le.09", "Le.10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                table1MouseReleased(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1020, 600));

        srch.setBackground(new java.awt.Color(51, 51, 51));
        srch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
      
    }//GEN-LAST:event_table1KeyReleased

    private void table1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseReleased
     
    }//GEN-LAST:event_table1MouseReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
     
    }//GEN-LAST:event_table1MouseClicked

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
       search();
    }//GEN-LAST:event_searchboxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbox;
    private javax.swing.JPanel srch;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables

   
}
