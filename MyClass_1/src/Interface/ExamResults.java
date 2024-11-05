 
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


public class ExamResults extends javax.swing.JInternalFrame {

      Connection conn = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
      Color bgcolor;
   
    public ExamResults() {
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
        table1.getColumnModel().getColumn(2).setPreferredWidth(74);
        table1.getColumnModel().getColumn(3).setPreferredWidth(74);
        table1.getColumnModel().getColumn(4).setPreferredWidth(74);
        table1.getColumnModel().getColumn(5).setPreferredWidth(74);
        table1.getColumnModel().getColumn(6).setPreferredWidth(74);
        table1.getColumnModel().getColumn(7).setPreferredWidth(74);
        table1.getColumnModel().getColumn(8).setPreferredWidth(74);
        table1.getColumnModel().getColumn(9).setPreferredWidth(74);
        table1.getColumnModel().getColumn(10).setPreferredWidth(74);
        table1.getColumnModel().getColumn(11).setPreferredWidth(74);
    }
    
    public void tableload(){
        try {
            String sql = "SELECT t.ID, t.Name, ti.Test01, ti.Test02, ti.Test03, ti.Test04, ti.Test05, ti.Test06, ti.Test07, ti.Test08, ti.Test09, ti.Test10  FROM StudentDetails AS t JOIN ExamResults AS ti ON t.ID = ti.ID" ;
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
            
            String sql = "SELECT t.ID, t.Name, ti.Test01, ti.Test02, ti.Test03, ti.Test04, ti.Test05, ti.Test06, ti.Test07, ti.Test08, ti.Test09, ti.Test10  FROM StudentDetails AS t JOIN ExamResults AS ti ON t.ID = ti.ID WHERE Name LIKE '%"+srch+"%' OR t.ID LIKE '%"+srch+"%' " ;
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
   
  
    public int Row(){
         int r1 = table1.getRowCount();
      return r1;
    }
    
    public int coloum(){
         int r2 = table1.getColumnCount();
      return r2;
    }
    
  
    public int test1(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0;
         int r8 = 0;
         int r9 = 0;
         int r10 = 0;
         int r11 = 0;
         int r12 = 0;
         
       for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
             
           if(mark.equals("-")){
              r3 = 0; }
           
           else{
              r3 = 1;
             }
           r4 = r4 + r3 ; 
        } 
       return r4;
    }
    
     public int test2(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    } 
     
      public int test3(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
           if(mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
      
       public int test4(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
       
        public int test5(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
           if(mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
        
        public int test6(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
         
          public int test7(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
           if(mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
          
           public int test8(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
           
           public int test9(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
            
             public int test10(){
         int r3 ;
         int r4 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
           if( mark.equals("-")){
              r3 = 0; }
           else{
              r3 = 1; }
           r4 = r4 + r3 ;
        }
      return r4;           
    }
    
     
   public int T1A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T1B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T1C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T1S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T1F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 2).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
       
        public int T2A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T2B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T2C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T2S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T2F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 3).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T3A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T3B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T3C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T3S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T3F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 4).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T4A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T4B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T4C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T4S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T4F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 5).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T5A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T5B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T5C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T5S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T5F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 6).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T6A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T6B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T6C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T6S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T6F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 7).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T7A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T7B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T7C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T7S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T7F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 8).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T8A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T8B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T8C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T8S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T8F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 9).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T9A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T9B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T9C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T9S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T9F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 10).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
        public int T10A(){
      int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=75 && Integer.parseInt(mark)<=100){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
   
    public int T10B(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=65 && Integer.parseInt(mark)<75){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
    
     public int T10C(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=50 && Integer.parseInt(mark)<65){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
     
      public int T10S(){
         int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=35 && Integer.parseInt(mark)<50){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     } 
      
       public int T10F(){
        int r3 ;
         int r4 = 0 ;
         int r6 ;
         int r7 = 0 ;
         
        for(int r5 = 0; r5<table1.getRowCount(); r5++){
             String mark = table1.getValueAt(r5, 11).toString();
          if( mark.equals("-")){ r6 = 0 ; }
           else{
               if (Integer.parseInt(mark)>=0 && Integer.parseInt(mark)<35){ r3 = 1; }
               else{   r3 = 0;  }
                   r4 = r4 + r3; }  r6 = 1 ; r7 = r7 + r6;}
      return r4;     }
       
              
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        srch = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(21, 21, 21));

        table1.setAutoCreateRowSorter(true);
        table1.setBackground(new java.awt.Color(51, 51, 51));
        table1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Test 01", "Test 02", "Test 03", "Test 04", "Test 05", "Test 06", "Test 07", "Test 08", "Test 09", "Test 10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        srch.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 1, 950, 38));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Search.png"))); // NOI18N
        srch.add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 4, -1, -1));

        jPanel1.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       ;
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
