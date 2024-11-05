
package Interface;

import DatabaseConnection.DBconnect;
import Chart.ModelChart;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;



public class ExamResultsAnalysing extends javax.swing.JInternalFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
 
    
     public ExamResultsAnalysing() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        conn =  DBconnect.connect();
       
           }
     
     
      private void chart1(){
         
            
           chart2.addLegend("Passes Percentage of Students in Each Test", new Color(186, 37, 37), new Color(241, 100, 120));
          
           chart2.addData(new ModelChart("A", new double[]{PA()}));
           chart2.addData(new ModelChart("B", new double[]{PB()}));
           chart2.addData(new ModelChart("C", new double[]{PC()}));
           chart2.addData(new ModelChart("S", new double[]{PS()}));
           chart2.addData(new ModelChart("F", new double[]{PF()}));
          
           chart2.start();
       }
     
      public void data(){
          
             String id1 = idbox.getText();
           
           try {
              String sql = "SELECT * FROM ExamResults WHERE ID = '"+id1+"' " ;
              pst = conn.prepareStatement(sql);
              rs = pst.executeQuery();
              
              if(rs.next()){
                 String t1 = rs.getString("Test01");
                 String t2 = rs.getString("Test02");
                 String t3 = rs.getString("Test03");
                 String t4 = rs.getString("Test04");
                 String t5 = rs.getString("Test05");
                 String t6 = rs.getString("Test06");
                 String t7 = rs.getString("Test07");
                 String t8 = rs.getString("Test08");
                 String t9 = rs.getString("Test09");
                 String t10 = rs.getString("Test10"); 
                 
              
               int r1;
               if(t1.equals("-")){ r1 = 0 ; }
               else{r1 = Integer.parseInt(t1); }
               
                int r2;
               if(t2.equals("-")){ r2 = 0 ; }
               else{r2 = Integer.parseInt(t2); }
               
                int r3;
               if(t3.equals("-")){ r3 = 0 ; }
               else{r3 = Integer.parseInt(t3); }
               
                int r4;
               if(t4.equals("-")){ r4 = 0 ; }
               else{r4 = Integer.parseInt(t4); }
               
                int r5;
               if(t5.equals("-")){ r5 = 0 ; }
               else{r5 = Integer.parseInt(t5); }
               
                int r6;
               if(t6.equals("-")){ r6 = 0 ; }
               else{r6 = Integer.parseInt(t6); }
               
                int r7;
               if(t7.equals("-")){ r7 = 0 ; }
               else{r7 = Integer.parseInt(t7); }
               
                int r8;
               if(t8.equals("-")){ r8 = 0 ; }
               else{r8 = Integer.parseInt(t8); }
               
                int r9;
               if(t9.equals("-")){ r9 = 0 ; }
               else{r9 = Integer.parseInt(t9); }
               
                 int r10;
               if(t10.equals("-")){ r10 = 0 ; }
               else{r10 = Integer.parseInt(t10); } 
               
               
           lineChart.addLegend("Marks Obtained By Children for Each Test", new Color(54, 4, 143), new Color(104, 49, 200));
           lineChart.addData(new ModelChart("Test01", new double[]{r1}));
           lineChart.addData(new ModelChart("Test02", new double[]{r2}));
           lineChart.addData(new ModelChart("Test03", new double[]{r3}));
           lineChart.addData(new ModelChart("Test04", new double[]{r4}));
           lineChart.addData(new ModelChart("Test05", new double[]{r5}));
           lineChart.addData(new ModelChart("Test06", new double[]{r6}));
           lineChart.addData(new ModelChart("Test07", new double[]{r7}));
           lineChart.addData(new ModelChart("Test08", new double[]{r8}));
           lineChart.addData(new ModelChart("Test09", new double[]{r9}));
           lineChart.addData(new ModelChart("Test10", new double[]{r10}));
            
           lineChart.start(); 
           
              }   
            
              else{JOptionPane.showMessageDialog(null, "Insert the ID");}
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
        
          try {
              String sql = "SELECT Name FROM StudentDetails WHERE ID = '"+id1+"' ";
              pst = conn.prepareStatement(sql);
              rs = pst.executeQuery();
              
              if(rs.next()){
              String name1 = rs.getString("Name");
              namebox.setText(name1);
              }
          } catch (Exception e) {
          }
          finally {
                 try {
                     rs.close();
                     pst.close();
                 } catch (Exception e) {
                 }
}
    }
      

         public void RUN1(){
     
          new Thread(new Runnable() {
            @Override
           public void run() {
               
             for(int i= 1; i<=PALL(); i++){
           try {
               circleProggressBar1.setValue(i);
               circleProggressBar1.repaint();
               Thread.sleep(2);
           } catch (Exception e) {
           }
       
       }  
          }
       }).start(); 
         
         }
         
         
     public int results(){
     
        ExamResults er = new ExamResults();
          
         int x=0;
         int test1 = test.getSelectedIndex();
         
            if(test1 == 0){
              x =er.test1();}
     
            else if(test1 == 1){
              x = er.test2();}
     
            else if(test1 == 2){
              x = er.test3();}
     
            else if(test1 == 3){
              x = er.test4();}
            
            else if(test1 == 4){
              x = er.test5();}
            
            else if(test1 == 5){
              x = er.test6();}
            
            else if(test1 == 6){
              x = er.test7();}
            
            else if(test1 == 7){
              x = er.test8();}
            
            else if(test1 == 8){
              x = er.test9();}
            
            else if(test1 == 9){
              x = er.test10();} 
     
     return x;  } 
     
      public int A(){
           ExamResults er = new ExamResults();
           int a = 0;
         if(test.getSelectedIndex()==0){ 
              a = er.T1A(); }
         else if(test.getSelectedIndex()==1){ 
              a = er.T2A(); }
         else if(test.getSelectedIndex()==2){ 
              a = er.T3A(); }
         else if(test.getSelectedIndex()==3){ 
              a = er.T4A(); }
         else if(test.getSelectedIndex()==4){ 
              a = er.T5A(); }
         else if(test.getSelectedIndex()==5){ 
              a = er.T6A(); }
         else if(test.getSelectedIndex()==6){ 
              a = er.T7A(); }
         else if(test.getSelectedIndex()==7){ 
              a = er.T8A(); }
         else if(test.getSelectedIndex()==8){ 
              a = er.T9A(); }
         else if(test.getSelectedIndex()==9){ 
              a = er.T10A(); }  
        
            return a;    } 
      
     public int B(){
           ExamResults er = new ExamResults();
           int a = 0;
         if(test.getSelectedIndex()==0){ 
              a = er.T1B(); }
         else if(test.getSelectedIndex()==1){ 
              a = er.T2B(); }
         else if(test.getSelectedIndex()==2){ 
              a = er.T3B(); }
         else if(test.getSelectedIndex()==3){ 
              a = er.T4B(); }
         else if(test.getSelectedIndex()==4){ 
              a = er.T5B(); }
         else if(test.getSelectedIndex()==5){ 
              a = er.T6B(); }
         else if(test.getSelectedIndex()==6){ 
              a = er.T7B(); }
         else if(test.getSelectedIndex()==7){ 
              a = er.T8B(); }
         else if(test.getSelectedIndex()==8){ 
              a = er.T9B(); }
         else if(test.getSelectedIndex()==9){ 
              a = er.T10B(); } 
        
                return a;    } 
      
      public int C(){
           ExamResults er = new ExamResults();
           int a = 0;
         if(test.getSelectedIndex()==0){ 
              a = er.T1C(); }
         else if(test.getSelectedIndex()==1){ 
              a = er.T2C(); }
         else if(test.getSelectedIndex()==2){ 
              a = er.T3C(); }
         else if(test.getSelectedIndex()==3){ 
              a = er.T4C(); }
         else if(test.getSelectedIndex()==4){ 
              a = er.T5C(); }
         else if(test.getSelectedIndex()==5){ 
              a = er.T6C(); }
         else if(test.getSelectedIndex()==6){ 
              a = er.T7C(); }
         else if(test.getSelectedIndex()==7){ 
              a = er.T8C(); }
         else if(test.getSelectedIndex()==8){ 
              a = er.T9C(); }
         else if(test.getSelectedIndex()==9){ 
              a = er.T10C(); } 
        
                return a;    } 
      
      public int S(){
           ExamResults er = new ExamResults();
           int a = 0;
         if(test.getSelectedIndex()==0){ 
              a = er.T1S(); }
         else if(test.getSelectedIndex()==1){ 
              a = er.T2S(); }
         else if(test.getSelectedIndex()==2){ 
              a = er.T3S(); }
         else if(test.getSelectedIndex()==3){ 
              a = er.T4S(); }
         else if(test.getSelectedIndex()==4){ 
              a = er.T5S(); }
         else if(test.getSelectedIndex()==5){ 
              a = er.T6S(); }
         else if(test.getSelectedIndex()==6){ 
              a = er.T7S(); }
         else if(test.getSelectedIndex()==7){ 
              a = er.T8S(); }
         else if(test.getSelectedIndex()==8){ 
              a = er.T9S(); }
         else if(test.getSelectedIndex()==9){ 
              a = er.T10S(); } 
        
                return a;    } 
      
      public int F(){
           ExamResults er = new ExamResults();
           int a = 0;
         if(test.getSelectedIndex()==0){ 
              a = er.T1F(); }
         else if(test.getSelectedIndex()==1){ 
              a = er.T2F(); }
         else if(test.getSelectedIndex()==2){ 
              a = er.T3F(); }
         else if(test.getSelectedIndex()==3){ 
              a = er.T4F(); }
         else if(test.getSelectedIndex()==4){ 
              a = er.T5F(); }
         else if(test.getSelectedIndex()==5){ 
              a = er.T6F(); }
         else if(test.getSelectedIndex()==6){ 
              a = er.T7F(); }
         else if(test.getSelectedIndex()==7){ 
              a = er.T8F(); }
         else if(test.getSelectedIndex()==8){ 
              a = er.T9F(); }
         else if(test.getSelectedIndex()==9){ 
              a = er.T10F(); } 
        
                return a;    } 
      
      public double PALL(){
          ExamResults er = new ExamResults();
                
        double x = results();
        double y = er.Row();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        int p = (int) Math.round(z);
        return p;
      }
      
      public double PA(){
                
        double x = A();
        double y = results();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        return z;
      }
      
      public double PB(){
                
        double x = B();
        double y = results();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        return z;
      }
      
      public double PC(){
                
        double x = C();
        double y = results();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        return z;
      }
      
      public double PS(){
                
        double x = S();
        double y = results();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        return z;
      }
      
      public double PF(){
                
        double x = F();
        double y = results();
        double z = 0;
        
        BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
        double Input = bd.doubleValue();
        
        z = (x/y) * 100 ;
        return z;
      }
  
     public void RESULTS(){
     
        ExamResults er = new ExamResults();
    
        ts.setText(Integer.toString(er.Row()));
        
        nos.setText(Integer.toString(results()));
        
        na.setText(Integer.toString(A()));
        
        nb.setText(Integer.toString(B()));
        
        nc.setText(Integer.toString(C()));
        
        ns.setText(Integer.toString(S()));
        
        nf.setText(Integer.toString(F()));
        
        chart1();
        RUN1();
    
     }
     
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        exam = new javax.swing.JPanel();
        ABCSF = new javax.swing.JPanel();
        participate = new javax.swing.JPanel();
        circleProggressBar1 = new Chart.CircleProggressBar();
        text = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        test = new javax.swing.JComboBox<>();
        abcsfEnter = new javax.swing.JPanel();
        TS = new javax.swing.JLabel();
        NOS = new javax.swing.JLabel();
        NA = new javax.swing.JLabel();
        NB = new javax.swing.JLabel();
        NC = new javax.swing.JLabel();
        NS = new javax.swing.JLabel();
        NF = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e6 = new javax.swing.JLabel();
        e7 = new javax.swing.JLabel();
        ts = new javax.swing.JLabel();
        nos = new javax.swing.JLabel();
        na = new javax.swing.JLabel();
        nb = new javax.swing.JLabel();
        nc = new javax.swing.JLabel();
        ns = new javax.swing.JLabel();
        nf = new javax.swing.JLabel();
        count = new javax.swing.JButton();
        chart = new javax.swing.JPanel();
        detail = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        namebox = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        studentchart = new javax.swing.JPanel();
        lineChart = new Chart.LineChart();
        results = new javax.swing.JPanel();
        chart2 = new Chart.Chart1();

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        exam.setBackground(new java.awt.Color(21, 21, 21));
        exam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        exam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ABCSF.setBackground(new java.awt.Color(21, 21, 21));
        ABCSF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        participate.setBackground(new java.awt.Color(51, 51, 51));
        participate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        circleProggressBar1.setBackground(new java.awt.Color(102, 102, 102));
        circleProggressBar1.setBorder(null);
        circleProggressBar1.setForeground(new java.awt.Color(255, 0, 0));
        circleProggressBar1.setToolTipText("");
        participate.add(circleProggressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, 130));

        text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("Percentage of Students Sitting for the ");
        participate.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Examination (Nearly)");
        participate.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        text2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setText("Select Test");
        participate.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        test.setBackground(new java.awt.Color(0, 0, 0));
        test.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        test.setForeground(new java.awt.Color(255, 255, 255));
        test.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test 01", "Test 02", "Test 03", "Test 04", "Test 05", "Test 06", "Test 07", "Test 08", "Test 09", "Test 10" }));
        test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                testMousePressed(evt);
            }
        });
        participate.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, -1));

        ABCSF.add(participate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 250));

        abcsfEnter.setBackground(new java.awt.Color(51, 51, 51));
        abcsfEnter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TS.setForeground(new java.awt.Color(255, 255, 255));
        TS.setText("Toatal Student");
        abcsfEnter.add(TS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        NOS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NOS.setForeground(new java.awt.Color(255, 255, 255));
        NOS.setText("Number of Student Sitting for the Exam ");
        abcsfEnter.add(NOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        NA.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NA.setForeground(new java.awt.Color(255, 255, 255));
        NA.setText("Number of Got A's");
        abcsfEnter.add(NA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        NB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NB.setForeground(new java.awt.Color(255, 255, 255));
        NB.setText("Number of Got B's");
        abcsfEnter.add(NB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        NC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NC.setForeground(new java.awt.Color(255, 255, 255));
        NC.setText("Number of Got C's");
        abcsfEnter.add(NC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        NS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NS.setForeground(new java.awt.Color(255, 255, 255));
        NS.setText("Number of Got S's");
        abcsfEnter.add(NS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        NF.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NF.setForeground(new java.awt.Color(255, 255, 255));
        NF.setText("Number of Got F's");
        abcsfEnter.add(NF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        e1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText("=");
        abcsfEnter.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        e2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e2.setForeground(new java.awt.Color(255, 255, 255));
        e2.setText("=");
        abcsfEnter.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        e3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e3.setForeground(new java.awt.Color(255, 255, 255));
        e3.setText("=");
        abcsfEnter.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        e4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e4.setForeground(new java.awt.Color(255, 255, 255));
        e4.setText("=");
        abcsfEnter.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        e5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e5.setForeground(new java.awt.Color(255, 255, 255));
        e5.setText("=");
        abcsfEnter.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        e6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e6.setForeground(new java.awt.Color(255, 255, 255));
        e6.setText("=");
        abcsfEnter.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        e7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        e7.setForeground(new java.awt.Color(255, 255, 255));
        e7.setText("=");
        abcsfEnter.add(e7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 20));

        ts.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ts.setForeground(new java.awt.Color(255, 255, 255));
        ts.setText("00");
        abcsfEnter.add(ts, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        nos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nos.setForeground(new java.awt.Color(255, 255, 255));
        nos.setText("00");
        abcsfEnter.add(nos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        na.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        na.setForeground(new java.awt.Color(255, 255, 255));
        na.setText("00");
        abcsfEnter.add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        nb.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nb.setForeground(new java.awt.Color(255, 255, 255));
        nb.setText("00");
        abcsfEnter.add(nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        nc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nc.setForeground(new java.awt.Color(255, 255, 255));
        nc.setText("00");
        abcsfEnter.add(nc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        ns.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        ns.setForeground(new java.awt.Color(255, 255, 255));
        ns.setText("00");
        abcsfEnter.add(ns, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        nf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        nf.setForeground(new java.awt.Color(255, 255, 255));
        nf.setText("00");
        abcsfEnter.add(nf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        count.setBackground(new java.awt.Color(0, 0, 0));
        count.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        count.setForeground(new java.awt.Color(255, 255, 255));
        count.setText("Count");
        count.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        abcsfEnter.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, 30));

        ABCSF.add(abcsfEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 255, 410, 3250));

        exam.add(ABCSF, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 410, 580));

        chart.setBackground(new java.awt.Color(21, 21, 21));
        chart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detail.setBackground(new java.awt.Color(51, 51, 51));
        detail.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText(" ID");
        detail.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 3, -1, -1));

        idbox.setBackground(new java.awt.Color(0, 0, 0));
        idbox.setForeground(new java.awt.Color(255, 255, 255));
        idbox.setCaretColor(new java.awt.Color(255, 255, 255));
        idbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idboxKeyReleased(evt);
            }
        });
        detail.add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 3, 110, -1));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        detail.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, -1));

        namebox.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        namebox.setForeground(new java.awt.Color(255, 255, 255));
        detail.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 5, 220, 20));

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Refresh.png"))); // NOI18N
        refresh.setToolTipText("Refresh");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        detail.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 3, -1, -1));

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images_Icon/Correct 1.png"))); // NOI18N
        check.setToolTipText("OK");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });
        detail.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        chart.add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 585, 40));

        studentchart.setBackground(new java.awt.Color(51, 51, 51));
        studentchart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        studentchart.add(lineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 260));

        chart.add(studentchart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 590, 260));

        results.setBackground(new java.awt.Color(51, 51, 51));
        results.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        results.add(chart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        chart.add(results, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 590, 270));

        exam.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 585, 580));

        jDesktopPane1.add(exam, java.awt.BorderLayout.CENTER);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        ExamResultsAnalysing era = new ExamResultsAnalysing();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(era).setVisible(true);
         
    }//GEN-LAST:event_refreshMouseClicked

    private void idboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idboxKeyReleased
    
    }//GEN-LAST:event_idboxKeyReleased

    private void testMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testMousePressed
     
    }//GEN-LAST:event_testMousePressed

    private void testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testMouseClicked
     
    }//GEN-LAST:event_testMouseClicked

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        data();
    }//GEN-LAST:event_checkMouseClicked

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        RESULTS();
        
    }//GEN-LAST:event_countActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABCSF;
    private javax.swing.JLabel NA;
    private javax.swing.JLabel NB;
    private javax.swing.JLabel NC;
    private javax.swing.JLabel NF;
    private javax.swing.JLabel NOS;
    private javax.swing.JLabel NS;
    private javax.swing.JLabel TS;
    private javax.swing.JPanel abcsfEnter;
    private javax.swing.JPanel chart;
    private Chart.Chart1 chart2;
    private javax.swing.JLabel check;
    private Chart.CircleProggressBar circleProggressBar1;
    private javax.swing.JButton count;
    private javax.swing.JPanel detail;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JLabel e6;
    private javax.swing.JLabel e7;
    private javax.swing.JPanel exam;
    private javax.swing.JLabel id;
    private javax.swing.JTextField idbox;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private Chart.LineChart lineChart;
    private javax.swing.JLabel na;
    private javax.swing.JLabel name;
    private javax.swing.JLabel namebox;
    private javax.swing.JLabel nb;
    private javax.swing.JLabel nc;
    private javax.swing.JLabel nf;
    private javax.swing.JLabel nos;
    private javax.swing.JLabel ns;
    private javax.swing.JPanel participate;
    private javax.swing.JLabel refresh;
    private javax.swing.JPanel results;
    private javax.swing.JPanel studentchart;
    private javax.swing.JComboBox<String> test;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel ts;
    // End of variables declaration//GEN-END:variables

  
   
}
