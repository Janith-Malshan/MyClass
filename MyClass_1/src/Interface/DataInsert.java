
package Interface;

import DatabaseConnection.DBconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;



public class DataInsert extends javax.swing.JInternalFrame {
       
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    
 public DataInsert() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        conn =  DBconnect.connect();    
        buttongroup();
        tableload0();
        
 }   
 
 public void search(){
    
     String id = idbox.getText(); 
     
     try {
         String sql = "SELECT * FROM StudentDetails WHERE ID = '"+id+"' " ;
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
 
 public void search1(){
       
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
  
   public void search2(){
        
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
 
    public void tabledata(){
        
       int t = table1.getColumnCount();
       
          if(t==7){
             
        String ID = table1.getValueAt(0, 0).toString();
        String name = table1.getValueAt(0, 1).toString();
        String idc = table1.getValueAt(0, 2).toString();
        String gmail = table1.getValueAt(0, 3).toString();
        String al = table1.getValueAt(0, 4).toString();
        String scl = table1.getValueAt(0, 5).toString();
        String district = table1.getValueAt(0, 6).toString();
        
        idbox.setText(ID);
        namebox.setText(name);
        idcbox.setText(idc);
        gmailbox.setText(gmail);
        albox.setText(al);
        schoolbox.setText(scl);
        districtbox.setText(district);
    }
          else if(t==12){
          
        int r1 = table1.getSelectedColumn();
        int r2 ;
        
        if (r1<2){
            idbox.setText("");
            marksbox.setText("");
            testbox.setSelectedIndex(0);
        } 
        else {
                 
        r2 = r1-1;
        
        String ID = table1.getValueAt(0, 0).toString();
        String marks = table1.getValueAt(0, r1).toString();
        
        idbox1.setText(ID);
        marksbox.setText(marks);
        testbox.setSelectedIndex(r2);
        
        }}
          
          else if(t==13){
          
        int r1 = 0;
        int r2 = table1.getSelectedColumn();
        int r3 ;
        
        if (r2<3){
            idbox.setText("");
            lessonbox.setSelectedIndex(0);
        } 
        else {
                 
        r3 = r2-2;
        
        String ID = table1.getValueAt(r1, 0).toString();
        String lesson = table1.getValueAt(r1, r2).toString();
        String n1;
        
        if (lesson.equals("Yes")){
        yesbox.setSelected(true);}
        else if (lesson.equals("No")){
        nobox.setSelected(true);}
        
        idbox.setText(ID);
        lessonbox.setSelectedIndex(r3);
        
        }}
    }
   
   
   
   
      private void tableload0(){
       try {
            String sql = "SELECT ID,Name,[ID Card Number],Gmail, [A/L Year], School, District FROM StudentDetails WHERE ID = '"+1+"'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        table1.getColumnModel().getColumn(0).setPreferredWidth(60);
        table1.getColumnModel().getColumn(1).setPreferredWidth(220);
        table1.getColumnModel().getColumn(2).setPreferredWidth(150);
        table1.getColumnModel().getColumn(3).setPreferredWidth(220);
        table1.getColumnModel().getColumn(4).setPreferredWidth(70);
        table1.getColumnModel().getColumn(5).setPreferredWidth(200);
        table1.getColumnModel().getColumn(6).setPreferredWidth(100);
           
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
 
 
      private void tableload(){
       try {
            String sql = "SELECT ID,Name,[ID Card Number],Gmail, [A/L Year], School, District FROM StudentDetails WHERE ID = '"+idbox.getText()+"'  ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        table1.getColumnModel().getColumn(0).setPreferredWidth(60);
        table1.getColumnModel().getColumn(1).setPreferredWidth(220);
        table1.getColumnModel().getColumn(2).setPreferredWidth(150);
        table1.getColumnModel().getColumn(3).setPreferredWidth(220);
        table1.getColumnModel().getColumn(4).setPreferredWidth(70);
        table1.getColumnModel().getColumn(5).setPreferredWidth(200);
        table1.getColumnModel().getColumn(6).setPreferredWidth(100);
           
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
      
       public void tableload1(){
        try {
            String sql = "SELECT t.ID, t.Name, ti.Test01, ti.Test02, ti.Test03, ti.Test04, ti.Test05, ti.Test06, ti.Test07, ti.Test08, ti.Test09, ti.Test10  FROM StudentDetails AS t JOIN ExamResults AS ti ON t.ID = ti.ID WHERE t.ID = '"+idbox1.getText()+"'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
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
      
       public void tableload2(){
    
         try {
            String sql = "SELECT t.ID, t.Name, t.Gmail, ti.Lesson01 AS [Les.01], ti.Lesson02 AS [Les.02], ti.Lesson03 AS [Les.03], ti.Lesson04 AS [Les.04], ti.Lesson05 AS [Les.05], ti.Lesson06 AS [Les.06], ti.Lesson07 AS [Les.07], ti.Lesson08 AS [Les.08], ti.Lesson09 AS [Les.09], ti.Lesson10 AS [Les.10] FROM StudentDetails AS t JOIN Payment AS ti ON t.ID = ti.ID WHERE t.ID = '"+idbox2.getText()+"'" ;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
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
       

      public void update(){
    
         String id = idbox.getText();
         String name = namebox.getText();
         String idc  = idcbox.getText();
         String gmail  = gmailbox.getText();
         String al = albox.getText();
         String scl = schoolbox.getText();
         String district = districtbox.getText();
         
         
         try {
            String sql = "UPDATE StudentDetails SET Name='"+name+"' , [ID Card Number]='"+idc+"' , Gmail='"+gmail+"' , [A/L Year]='"+al+"' , School='"+scl+"' , District='"+district+"' WHERE ID='"+id+"' ";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Updated");
        }
         finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
    
    }
     
      public void clear(){
             
        idbox.setText("");
        namebox.setText("");
        idcbox.setText("");
        gmailbox.setText("");
        albox.setText("");
        schoolbox.setText("");
        districtbox.setText("");
    
    }
      
      public void insert(){
      
          String ID;
          String name;
          String idc;
          String gmail;
          String al;
          String scl;
          String district;
          
          ID = idbox.getText();
          name = namebox.getText();
          idc =idcbox.getText();
          gmail = gmailbox.getText();
          al = albox.getText();
          scl = schoolbox.getText();
          district = districtbox.getText();
          
          try {
              
             String sql = "INSERT INTO StudentDetails(ID,Name,[ID Card Number],Gmail,[A/L Year],School, District) VALUES ('"+ID+"' , '"+name+"' , '"+idc+"' , '"+gmail+"' , '"+al+"' , '"+scl+"' , '"+district+"' )";
        
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Inserted!");
            
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
      
      
        public void delete(){
       int check = JOptionPane.showConfirmDialog(null, "Do You Want to Delete This?");
        
        if(check == 0){
           
            String id = idbox.getText();
            
            try {
               String sql = "DELETE FROM StudentDetails WHERE ID='"+id+"' ";
               pst = conn.prepareStatement(sql);
               pst.execute();
               JOptionPane.showMessageDialog(null, "Deleted");
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Can't Deleted");
            }
            finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
            
        }
        clear();
        
        }
        
        
        
         public void insert1(){
    
        String id = idbox1.getText();
        String marks = marksbox.getText();
        int t = testbox.getSelectedIndex();
        int m = 0 ;
        String marks1 = null;
        String marks2 = null;
        String marks3 = null;
        String marks4 = null;
        String marks5 = null;
        String marks6 = null;
        String marks7 = null;
        String marks8 = null;
        String marks9 = null;
        String marks10 = null;
                         
      if(m<t){
          
        
     if(t==1){
     marks1 = marks ;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";  }
    
    else if(t == 2){
     marks2 = marks;
     marks1 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
   
     else if(t == 3){
     marks3 = marks;
     marks2 = "-";
     marks1 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 4){
     marks4 = marks;
     marks2 = "-";
     marks3 = "-";
     marks1 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 5){
     marks5 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks1 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 6){
     marks6 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks1 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 7){
     marks7 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks1 = "-";
     marks8 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 8){
     marks8 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks1 = "-";
     marks9 = "-";
     marks10= "-";   }
     
      else if(t == 9){
     marks9 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks1 = "-";
     marks10= "-";   }
     
      else if(t == 10){
     marks10 = marks;
     marks2 = "-";
     marks3 = "-";
     marks4 = "-";
     marks5 = "-";
     marks6 = "-";
     marks7 = "-";
     marks8 = "-";
     marks9 = "-";
     marks1= "-";   }
     
      try {
           
           String sql = "INSERT INTO ExamResults(ID , Test01, Test02, Test03, Test04, Test05,Test06, Test07, Test08, Test09, Test10) VALUES ('"+id+"' , '"+marks1+"' , '"+marks2+"' , '"+marks3+"', '"+marks4+"', '"+marks5+"', '"+marks6+"', '"+marks7+"', '"+marks8+"', '"+marks9+"', '"+marks10+"')" ; 
           
           pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Inserted!");
            
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
      
      else{
      
          JOptionPane.showMessageDialog(null, "Select the Test");
      }
       
      
       } 
   
  public void update1(){
       
           String id = idbox1.getText();
           String marks = marksbox.getText();
           int t = testbox.getSelectedIndex();
           String marks1 = null;
        
    if(t==1) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test01 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==2) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test02 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==3) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test03 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==4) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test04 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==5) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test05 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==6) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test06 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==7) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test07 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==8) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test08 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==9) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test09 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==10) {
        marks1 = marks;
           
        try {    
            String sql = "UPDATE ExamResults SET Test10 = '"+marks1+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else{
    
        JOptionPane.showMessageDialog(null, "Enter the Test No.");
    }    
    
    
      }
 
   
   
   public void clear1(){
        idbox1.setText("");
        testbox.setSelectedIndex(0);
        marksbox.setText("");
   }
   
   
   public void delete1(){
       
        int check = JOptionPane.showConfirmDialog(null, "Do You Want to Delete This?");
        
        if(check == 0){
           
            String id = idbox1.getText();
            
            try {
               String sql = "DELETE FROM ExamResults WHERE ID='"+id+"' ";
               pst = conn.prepareStatement(sql);
               pst.execute();
               JOptionPane.showMessageDialog(null, "Deleted");
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Can't Deleted");
            }
            finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
            
        }
       
        clear1();

   }
   
   
       public void buttongroup() {
        ButtonGroup pm = new ButtonGroup();
        pm.add(yesbox);
        pm.add(nobox);
        
    }
       
        public void insert2() {
    
        String id = idbox2.getText();
        int t = lessonbox.getSelectedIndex();
        int m = 0 ;
        String rb = null;
       
         String lesson1 = null;
         String lesson2 = null;
         String lesson3 = null;
         String lesson4 = null;
         String lesson5 = null;
         String lesson6 = null;
         String lesson7 = null;
         String lesson8 = null;
         String lesson9 = null;
         String lesson10 = null;
         
     if(yesbox.isSelected()){
         rb = "Yes";
     }
     else if(nobox.isSelected()){
         rb = "No";
     }
        
        if(m<t){
        
            if(t==1){
               lesson1 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
         }
         
            if(t==2){
               lesson2 = rb ;
               lesson1 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
        
            if(t==3){
               lesson3 = rb ;
               lesson2 = "-" ;
               lesson1 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==4){
               lesson4 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson1 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==5){
               lesson5 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson1 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==6){
               lesson6 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson1 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==7){
               lesson7 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson1 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==8){
               lesson8 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson1 = "-" ;
               lesson9 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==9){
               lesson9 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson1 = "-" ;
               lesson10= "-" ;
        
            }
            
            if(t==10){
               lesson10 = rb ;
               lesson2 = "-" ;
               lesson3 = "-" ;
               lesson4 = "-" ;
               lesson5 = "-" ;
               lesson6 = "-" ;
               lesson7 = "-" ;
               lesson8 = "-" ;
               lesson9 = "-" ;
               lesson1 = "-" ;
        
            }
            
        try {
           
           String sql = "INSERT INTO Payment (ID , Lesson01, Lesson02, Lesson03, Lesson04, Lesson05,Lesson06, Lesson07, Lesson08, Lesson09, Lesson10) VALUES ('"+id+"' , '"+lesson1+"' , '"+lesson2+"' , '"+lesson3+"', '"+lesson4+"', '"+lesson5+"', '"+lesson6+"', '"+lesson7+"', '"+lesson8+"', '"+lesson9+"', '"+lesson10+"')" ; 
           
           pst = conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Inserted!");
            
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
        else{
      
          JOptionPane.showMessageDialog(null, "Select the Test");
      } 
    
    }
    
    
    public void update2() {
           String id = idbox2.getText();
            int t = lessonbox.getSelectedIndex();
           String rb = null;
           String lesson = null;
           
           if(yesbox.isSelected()){
              rb = "Yes";
         }
           else if(nobox.isSelected()){
              rb = "No";
         }
           
           
           if(t==1) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson01 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==2) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson02 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==3) {
        lesson = rb;
        
        try {    
            String sql = "UPDATE Payment SET Lesson03 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==4) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson04 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==5) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson05 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==6) {
       lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson06 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==7) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson07 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==8) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson08 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        } 
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==9) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson09 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else if(t==10) {
        lesson = rb;
           
        try {    
            String sql = "UPDATE Payment SET Lesson10 = '"+lesson+"'  WHERE ID='"+id+"' " ; 
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
            }
        catch (Exception e){
         JOptionPane.showMessageDialog(null, "Not Updated");
        }
        finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
        }
        
    else{
    
        JOptionPane.showMessageDialog(null, "Enter the Test No.");
    }    
    
    }
    
    
    public void clear2 () {
    
       idbox2.setText("");
       lessonbox.setSelectedIndex(0);
      
    }
    
    public void delete2() {
    
         int check = JOptionPane.showConfirmDialog(null, "Do You Want to Delete This?");
        
        if(check == 0){
           
            String id = idbox2.getText();
            
            try {
               String sql = "DELETE FROM Payment WHERE ID='"+id+"' ";
               pst = conn.prepareStatement(sql);
               pst.execute();
               JOptionPane.showMessageDialog(null, "Deleted");
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Can't Deleted");
            }
            finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
            
        }
       
        clear2();
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Search = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        all = new javax.swing.JPanel();
        sd = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        school = new javax.swing.JLabel();
        schoolbox = new javax.swing.JTextField();
        gmail = new javax.swing.JLabel();
        gmailbox = new javax.swing.JTextField();
        idc = new javax.swing.JLabel();
        idcbox = new javax.swing.JTextField();
        al = new javax.swing.JLabel();
        albox = new javax.swing.JTextField();
        district = new javax.swing.JLabel();
        districtbox = new javax.swing.JTextField();
        details = new javax.swing.JPanel();
        ibox = new javax.swing.JButton();
        dbox = new javax.swing.JButton();
        cbox = new javax.swing.JButton();
        ubox = new javax.swing.JButton();
        s = new javax.swing.JButton();
        er = new javax.swing.JPanel();
        id1 = new javax.swing.JLabel();
        testno = new javax.swing.JLabel();
        Marks = new javax.swing.JLabel();
        idbox1 = new javax.swing.JTextField();
        testbox = new javax.swing.JComboBox<>();
        marksbox = new javax.swing.JTextField();
        details1 = new javax.swing.JPanel();
        cbox1 = new javax.swing.JButton();
        dbox1 = new javax.swing.JButton();
        ubox1 = new javax.swing.JButton();
        ibox1 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        pmt = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        Lesson = new javax.swing.JLabel();
        Payment = new javax.swing.JLabel();
        idbox2 = new javax.swing.JTextField();
        yesbox = new javax.swing.JRadioButton();
        nobox = new javax.swing.JRadioButton();
        lessonbox = new javax.swing.JComboBox<>();
        details2 = new javax.swing.JPanel();
        updatebox = new javax.swing.JButton();
        insertbox = new javax.swing.JButton();
        deletebox = new javax.swing.JButton();
        clearbox = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        Search.setBackground(new java.awt.Color(17, 70, 96));
        Search.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        Search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchbox.setBackground(new java.awt.Color(0, 0, 0));
        searchbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        searchbox.setForeground(new java.awt.Color(255, 255, 255));
        searchbox.setCaretColor(new java.awt.Color(255, 255, 255));
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        Search.add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, 30));

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 686));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        all.setBackground(new java.awt.Color(21, 21, 21));
        all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sd.setBackground(new java.awt.Color(51, 51, 51));
        sd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        sd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");
        sd.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, -1));

        idbox.setBackground(new java.awt.Color(0, 0, 0));
        idbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        idbox.setForeground(new java.awt.Color(255, 255, 255));
        idbox.setCaretColor(new java.awt.Color(255, 255, 255));
        idbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idboxKeyReleased(evt);
            }
        });
        sd.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, 26));

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        sd.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        namebox.setBackground(new java.awt.Color(0, 0, 0));
        namebox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        namebox.setForeground(new java.awt.Color(255, 255, 255));
        namebox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 26));

        school.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        school.setForeground(new java.awt.Color(255, 255, 255));
        school.setText("School");
        sd.add(school, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        schoolbox.setBackground(new java.awt.Color(0, 0, 0));
        schoolbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        schoolbox.setForeground(new java.awt.Color(255, 255, 255));
        schoolbox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(schoolbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 260, 26));

        gmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        gmail.setForeground(new java.awt.Color(255, 255, 255));
        gmail.setText("Gmail");
        sd.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        gmailbox.setBackground(new java.awt.Color(0, 0, 0));
        gmailbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        gmailbox.setForeground(new java.awt.Color(255, 255, 255));
        gmailbox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(gmailbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 200, 26));

        idc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        idc.setForeground(new java.awt.Color(255, 255, 255));
        idc.setText("IDC Number");
        sd.add(idc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, -1));

        idcbox.setBackground(new java.awt.Color(0, 0, 0));
        idcbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        idcbox.setForeground(new java.awt.Color(255, 255, 255));
        idcbox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(idcbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 170, 26));

        al.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        al.setForeground(new java.awt.Color(255, 255, 255));
        al.setText("A/L Year");
        sd.add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        albox.setBackground(new java.awt.Color(0, 0, 0));
        albox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        albox.setForeground(new java.awt.Color(255, 255, 255));
        albox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(albox, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 80, 26));

        district.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        district.setForeground(new java.awt.Color(255, 255, 255));
        district.setText("District");
        sd.add(district, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        districtbox.setBackground(new java.awt.Color(0, 0, 0));
        districtbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        districtbox.setForeground(new java.awt.Color(255, 255, 255));
        districtbox.setCaretColor(new java.awt.Color(255, 255, 255));
        sd.add(districtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 170, 26));

        details.setBackground(new java.awt.Color(51, 51, 51));
        details.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ibox.setBackground(new java.awt.Color(0, 0, 0));
        ibox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ibox.setForeground(new java.awt.Color(255, 255, 255));
        ibox.setText("Insert");
        ibox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ibox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iboxActionPerformed(evt);
            }
        });
        details.add(ibox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 25));

        dbox.setBackground(new java.awt.Color(0, 0, 0));
        dbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dbox.setForeground(new java.awt.Color(255, 255, 255));
        dbox.setText("Delete");
        dbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dboxActionPerformed(evt);
            }
        });
        details.add(dbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 25));

        cbox.setBackground(new java.awt.Color(0, 0, 0));
        cbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbox.setForeground(new java.awt.Color(255, 255, 255));
        cbox.setText("Clear");
        cbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxActionPerformed(evt);
            }
        });
        details.add(cbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 25));

        ubox.setBackground(new java.awt.Color(0, 0, 0));
        ubox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ubox.setForeground(new java.awt.Color(255, 255, 255));
        ubox.setText("Update");
        ubox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uboxActionPerformed(evt);
            }
        });
        details.add(ubox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 25));

        s.setBackground(new java.awt.Color(0, 0, 0));
        s.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("Search");
        s.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        details.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 25));

        sd.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 120, 690, 60));

        all.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 210));

        er.setBackground(new java.awt.Color(51, 51, 51));
        er.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        er.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id1.setBackground(new java.awt.Color(0, 0, 0));
        id1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID");
        er.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, -1));

        testno.setBackground(new java.awt.Color(0, 0, 0));
        testno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        testno.setForeground(new java.awt.Color(255, 255, 255));
        testno.setText("Test NO.");
        er.add(testno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        Marks.setBackground(new java.awt.Color(0, 0, 0));
        Marks.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Marks.setForeground(new java.awt.Color(255, 255, 255));
        Marks.setText("Marks");
        er.add(Marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        idbox1.setBackground(new java.awt.Color(0, 0, 0));
        idbox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        idbox1.setForeground(new java.awt.Color(255, 255, 255));
        idbox1.setCaretColor(new java.awt.Color(255, 255, 255));
        idbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbox1ActionPerformed(evt);
            }
        });
        er.add(idbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 170, 26));

        testbox.setBackground(new java.awt.Color(0, 0, 0));
        testbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        testbox.setForeground(new java.awt.Color(255, 255, 255));
        testbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        testbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testboxMouseClicked(evt);
            }
        });
        testbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testboxActionPerformed(evt);
            }
        });
        er.add(testbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 170, -1));

        marksbox.setBackground(new java.awt.Color(0, 0, 0));
        marksbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        marksbox.setForeground(new java.awt.Color(255, 255, 255));
        marksbox.setCaretColor(new java.awt.Color(255, 255, 255));
        er.add(marksbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 170, 26));

        details1.setBackground(new java.awt.Color(51, 51, 51));
        details1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        details1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbox1.setBackground(new java.awt.Color(0, 0, 0));
        cbox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cbox1.setForeground(new java.awt.Color(255, 255, 255));
        cbox1.setText("Clear");
        cbox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox1ActionPerformed(evt);
            }
        });
        details1.add(cbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 25));

        dbox1.setBackground(new java.awt.Color(0, 0, 0));
        dbox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        dbox1.setForeground(new java.awt.Color(255, 255, 255));
        dbox1.setText("Delete");
        dbox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbox1ActionPerformed(evt);
            }
        });
        details1.add(dbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 25));

        ubox1.setBackground(new java.awt.Color(0, 0, 0));
        ubox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ubox1.setForeground(new java.awt.Color(255, 255, 255));
        ubox1.setText("Update");
        ubox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubox1ActionPerformed(evt);
            }
        });
        details1.add(ubox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 25));

        ibox1.setBackground(new java.awt.Color(0, 0, 0));
        ibox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ibox1.setForeground(new java.awt.Color(255, 255, 255));
        ibox1.setText("Insert");
        ibox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ibox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibox1ActionPerformed(evt);
            }
        });
        details1.add(ibox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 25));

        s1.setBackground(new java.awt.Color(0, 0, 0));
        s1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("Search");
        s1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        details1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 25));

        er.add(details1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 80, 690, 60));

        all.add(er, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1020, 165));

        pmt.setBackground(new java.awt.Color(51, 51, 51));
        pmt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pmt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");
        pmt.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, -1));

        Lesson.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Lesson.setForeground(new java.awt.Color(255, 255, 255));
        Lesson.setText("Lesson No.");
        pmt.add(Lesson, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        Payment.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Payment.setForeground(new java.awt.Color(255, 255, 255));
        Payment.setText("Payment");
        pmt.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        idbox2.setBackground(new java.awt.Color(0, 0, 0));
        idbox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        idbox2.setForeground(new java.awt.Color(255, 255, 255));
        idbox2.setCaretColor(new java.awt.Color(255, 255, 255));
        idbox2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pmt.add(idbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 170, -1));

        yesbox.setBackground(new java.awt.Color(51, 51, 51));
        yesbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        yesbox.setForeground(new java.awt.Color(255, 255, 255));
        yesbox.setText("Yes");
        yesbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pmt.add(yesbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        nobox.setBackground(new java.awt.Color(51, 51, 51));
        nobox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nobox.setForeground(new java.awt.Color(255, 255, 255));
        nobox.setText("No");
        nobox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pmt.add(nobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        lessonbox.setBackground(new java.awt.Color(0, 0, 0));
        lessonbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lessonbox.setForeground(new java.awt.Color(255, 255, 255));
        lessonbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10" }));
        lessonbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pmt.add(lessonbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 170, -1));

        details2.setBackground(new java.awt.Color(51, 51, 51));
        details2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        details2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updatebox.setBackground(new java.awt.Color(0, 0, 0));
        updatebox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        updatebox.setForeground(new java.awt.Color(255, 255, 255));
        updatebox.setText("Update");
        updatebox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateboxActionPerformed(evt);
            }
        });
        details2.add(updatebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 25));

        insertbox.setBackground(new java.awt.Color(0, 0, 0));
        insertbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        insertbox.setForeground(new java.awt.Color(255, 255, 255));
        insertbox.setText("Insert");
        insertbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertboxActionPerformed(evt);
            }
        });
        details2.add(insertbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 25));

        deletebox.setBackground(new java.awt.Color(0, 0, 0));
        deletebox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        deletebox.setForeground(new java.awt.Color(255, 255, 255));
        deletebox.setText("Delete");
        deletebox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteboxActionPerformed(evt);
            }
        });
        details2.add(deletebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 25));

        clearbox.setBackground(new java.awt.Color(0, 0, 0));
        clearbox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        clearbox.setForeground(new java.awt.Color(255, 255, 255));
        clearbox.setText("Clear");
        clearbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearboxActionPerformed(evt);
            }
        });
        details2.add(clearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 25));

        s2.setBackground(new java.awt.Color(0, 0, 0));
        s2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("Search");
        s2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        details2.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, 25));

        pmt.add(details2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 80, 690, 60));

        all.add(pmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 395, 1020, 165));

        table.setBackground(new java.awt.Color(51, 51, 51));
        table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        table.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

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
                "ID", "Name", "IDC Number", "Gmail", "School", "A/L Year", "District"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table1.setFocusable(false);
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setRowHeight(58);
        table1.setSelectionBackground(new java.awt.Color(21, 21, 21));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
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

        table.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1021, 80));

        all.add(table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1020, 81));

        getContentPane().add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
       
    }//GEN-LAST:event_searchboxKeyReleased

    private void cboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxActionPerformed
        clear();
        tableload();
    }//GEN-LAST:event_cboxActionPerformed

    private void dboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dboxActionPerformed
        delete();
        tableload();
    }//GEN-LAST:event_dboxActionPerformed

    private void iboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iboxActionPerformed
        insert();  
        tableload();
    }//GEN-LAST:event_iboxActionPerformed

    private void uboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uboxActionPerformed
        update();
        tableload();
    }//GEN-LAST:event_uboxActionPerformed

    private void ubox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubox1ActionPerformed
        update1();
        tableload1();
    }//GEN-LAST:event_ubox1ActionPerformed

    private void ibox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibox1ActionPerformed
        insert1();
        tableload1();
    }//GEN-LAST:event_ibox1ActionPerformed

    private void dbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbox1ActionPerformed
        delete1();
        tableload1();
    }//GEN-LAST:event_dbox1ActionPerformed

    private void cbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox1ActionPerformed
        clear1();
        tableload1();
    }//GEN-LAST:event_cbox1ActionPerformed

    private void testboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testboxMouseClicked

    }//GEN-LAST:event_testboxMouseClicked

    private void testboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testboxActionPerformed

    private void updateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateboxActionPerformed
        update2(); 
        tableload2();
    }//GEN-LAST:event_updateboxActionPerformed

    private void insertboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertboxActionPerformed
        insert2();
        tableload2();
    }//GEN-LAST:event_insertboxActionPerformed

    private void deleteboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteboxActionPerformed
        delete2();
        tableload2();
    }//GEN-LAST:event_deleteboxActionPerformed

    private void clearboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearboxActionPerformed
        clear2();
        tableload2();
    }//GEN-LAST:event_clearboxActionPerformed

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
         tabledata();
    }//GEN-LAST:event_table1KeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
         tabledata();
    }//GEN-LAST:event_table1MouseClicked

    private void idbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbox1ActionPerformed

    private void idboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idboxKeyReleased
      //  tabledata();
    }//GEN-LAST:event_idboxKeyReleased

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
       search();
       tableload();
    }//GEN-LAST:event_sActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
       search1();
       tableload1();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        search2();
        tableload2();
    }//GEN-LAST:event_s2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Lesson;
    private javax.swing.JLabel Marks;
    private javax.swing.JLabel Payment;
    private javax.swing.JPanel Search;
    private javax.swing.JLabel al;
    private javax.swing.JTextField albox;
    private javax.swing.JPanel all;
    private javax.swing.JButton cbox;
    private javax.swing.JButton cbox1;
    private javax.swing.JButton clearbox;
    private javax.swing.JButton dbox;
    private javax.swing.JButton dbox1;
    private javax.swing.JButton deletebox;
    private javax.swing.JPanel details;
    private javax.swing.JPanel details1;
    private javax.swing.JPanel details2;
    private javax.swing.JLabel district;
    private javax.swing.JTextField districtbox;
    private javax.swing.JPanel er;
    private javax.swing.JLabel gmail;
    private javax.swing.JTextField gmailbox;
    private javax.swing.JButton ibox;
    private javax.swing.JButton ibox1;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField idbox;
    private javax.swing.JTextField idbox1;
    private javax.swing.JTextField idbox2;
    private javax.swing.JLabel idc;
    private javax.swing.JTextField idcbox;
    private javax.swing.JButton insertbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lessonbox;
    private javax.swing.JTextField marksbox;
    private javax.swing.JLabel name;
    private javax.swing.JTextField namebox;
    private javax.swing.JRadioButton nobox;
    private javax.swing.JPanel pmt;
    private javax.swing.JButton s;
    private javax.swing.JButton s1;
    private javax.swing.JButton s2;
    private javax.swing.JLabel school;
    private javax.swing.JTextField schoolbox;
    private javax.swing.JPanel sd;
    private javax.swing.JTextField searchbox;
    private javax.swing.JPanel table;
    private javax.swing.JTable table1;
    private javax.swing.JComboBox<String> testbox;
    private javax.swing.JLabel testno;
    private javax.swing.JButton ubox;
    private javax.swing.JButton ubox1;
    private javax.swing.JButton updatebox;
    private javax.swing.JRadioButton yesbox;
    // End of variables declaration//GEN-END:variables
}
