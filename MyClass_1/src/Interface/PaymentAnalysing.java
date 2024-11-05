
package Interface;

import Chart.ModelChart;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.plaf.basic.BasicInternalFrameUI;



public class PaymentAnalysing extends javax.swing.JInternalFrame {
    
        public PaymentAnalysing() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        Run();
        chart1();
        chart2();
        }
  
       private void chart1(){
            Payment pmt = new Payment() ;
            
           chart1.addLegend("Student Who Paid for Each Units", new Color(12,84,175),new Color(0,108,247));
          
           chart1.addData(new ModelChart("Unit01", new double[]{pmt.table1()}));
           chart1.addData(new ModelChart("Unit02", new double[]{pmt.table2()}));
           chart1.addData(new ModelChart("Unit03", new double[]{pmt.table3()}));
           chart1.addData(new ModelChart("Unit04", new double[]{pmt.table4()}));
           chart1.addData(new ModelChart("Unit05", new double[]{pmt.table5()}));
           chart1.addData(new ModelChart("Unit06", new double[]{pmt.table6()}));
           chart1.addData(new ModelChart("Unit07", new double[]{pmt.table7()}));
           chart1.addData(new ModelChart("Unit08", new double[]{pmt.table8()}));
           chart1.addData(new ModelChart("Unit09", new double[]{pmt.table9()}));
           chart1.addData(new ModelChart("Unit10", new double[]{pmt.table10()}));
         
           chart1.start();
       }
       
      private void chart2(){
            Payment pmt = new Payment() ;
            
           LineChart.addLegend("Income of Each Units", new Color(5, 125, 0), new Color(95, 209, 69));
          
           LineChart.addData(new ModelChart("Unit01", new double[]{pmt.table1()*900}));
           LineChart.addData(new ModelChart("Unit02", new double[]{pmt.table2()*900}));
           LineChart.addData(new ModelChart("Unit03", new double[]{pmt.table3()*900}));
           LineChart.addData(new ModelChart("Unit04", new double[]{pmt.table4()*900}));
           LineChart.addData(new ModelChart("Unit05", new double[]{pmt.table5()*1800}));
           LineChart.addData(new ModelChart("Unit06", new double[]{pmt.table6()*650}));
           LineChart.addData(new ModelChart("Unit07", new double[]{pmt.table7()*650}));
           LineChart.addData(new ModelChart("Unit08", new double[]{pmt.table8()*900}));
           LineChart.addData(new ModelChart("Unit09", new double[]{pmt.table9()*900}));
           LineChart.addData(new ModelChart("Unit10", new double[]{pmt.table10()*900}));
           
           LineChart.start();
        }
        
        
       public void Run(){
           
           Payment pmt = new Payment();
           
         double x = 0;
         double y = pmt.table1();
         double z = pmt.table();
         x = (y /z) *100 ;
         
         BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
         double Input = bd.doubleValue();
           
           new Thread(new Runnable() {
            @Override
           public void run() {
               
             for(int i= 0; i<=Input; i++){
                 
           try {
               circleProggressBar1.setValue(i);
               circleProggressBar1.repaint();
               Thread.sleep(30);
           } catch (Exception e) {
           }
       
       }  
          }
       }).start();
           
           n1.setText(Integer.toString(pmt.table()));
           n2.setText(Integer.toString(pmt.table1()));
           n3.setText(Integer.toString(pmt.table() - pmt.table1()));
           rs1.setText("900" + " /=");
           rs2.setText(Integer.toString(pmt.table1()*900) + " /=");
 
       }
       
       
        public void Run1(){
           new Thread(new Runnable() {
            @Override
           public void run() {
               
             for(int i= 0; i<=percentage(); i++){
                 
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
   
    public int table1(){
        
      Payment pmt = new Payment();
      
      int x=0;
      int lesson1 = stl.getSelectedIndex() ;
       
         if(lesson1==0){
           x = pmt.table1(); }
         
         else if(lesson1==1){
           x = pmt.table2(); }
         
         else if(lesson1==2){
           x = pmt.table3(); }
         
         else if(lesson1==3){
           x = pmt.table4(); }
         
         else if(lesson1==4){
           x = pmt.table5(); }
         
         else if(lesson1==5){
           x = pmt.table6(); }
         
         else if(lesson1==6){
           x = pmt.table7(); }
         
         else if(lesson1==7){
           x = pmt.table8(); }
         
         else if(lesson1==8){
           x = pmt.table9(); }
         
         else if(lesson1==9){
           x = pmt.table10(); }
         
      return x;
    }
    
    public int income(){
         int y = 0;
         int lesson1 = stl.getSelectedIndex();
         
             if (lesson1 == 0){ y = 900 ;}
        else if (lesson1 == 1){ y = 900 ;}
        else if (lesson1 == 2){ y = 900 ;}
        else if (lesson1 == 3){ y = 900 ;}
        else if (lesson1 == 4){ y = 1800 ;}
        else if (lesson1 == 5){ y = 650 ;}
        else if (lesson1 == 6){ y = 650 ;}
        else if (lesson1 == 7){ y = 900 ;}
        else if (lesson1 == 8){ y = 900 ;}
        else if (lesson1 == 9){ y = 900 ;}
         
         return y;
    }
    
    public void money(){
        
     Payment pmt = new Payment();
 
          int others ;
          int total1 ;
         
         n1.setText(Integer.toString(pmt.table()));
        
         n2.setText(Integer.toString(table1()));    
         
         others = pmt.table() - table1();
         n3.setText(Integer.toString(others));
         
         rs1.setText(Integer.toString(income()) + " /=");
          
         total1 = income() * table1();
         rs2.setText(Integer.toString(total1) + " /="); 
         
         Run1();
         percentage();
      } 
    
     public double percentage(){
        Payment pmt = new Payment() ;
         double x = 0;
         double y = table1();
         double z = pmt.table();
         x = (y /z) *100 ;
         
         BigDecimal bd = new BigDecimal(x).setScale(2, RoundingMode.HALF_UP);
         double Input = bd.doubleValue();
        
         return Input;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmnt = new javax.swing.JPanel();
        bar1 = new javax.swing.JPanel();
        chart1 = new Chart.Chart1();
        bar2 = new javax.swing.JPanel();
        LineChart = new Chart.LineChart();
        data = new javax.swing.JPanel();
        chart = new javax.swing.JPanel();
        circleProggressBar1 = new Chart.CircleProggressBar();
        jLabel1 = new javax.swing.JLabel();
        stl = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        details = new javax.swing.JPanel();
        nos = new javax.swing.JLabel();
        nops = new javax.swing.JLabel();
        nonps = new javax.swing.JLabel();
        fees = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        rs1 = new javax.swing.JLabel();
        rs2 = new javax.swing.JLabel();
        count = new javax.swing.JButton();

        setBackground(new java.awt.Color(13, 70, 78));
        setPreferredSize(new java.awt.Dimension(1032, 683));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pmnt.setBackground(new java.awt.Color(21, 21, 21));
        pmnt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pmnt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar1.setBackground(new java.awt.Color(51, 51, 51));
        bar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bar1.add(chart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 705, 285));

        pmnt.add(bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 705, 285));

        bar2.setBackground(new java.awt.Color(51, 51, 51));
        bar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bar2.add(LineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 290));

        pmnt.add(bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 705, 290));

        data.setBackground(new java.awt.Color(21, 21, 21));
        data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chart.setBackground(new java.awt.Color(51, 51, 51));
        chart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        circleProggressBar1.setBackground(new java.awt.Color(102, 102, 102));
        circleProggressBar1.setBorder(null);
        circleProggressBar1.setForeground(new java.awt.Color(255, 0, 0));
        chart.add(circleProggressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Unit");
        chart.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        stl.setBackground(new java.awt.Color(0, 0, 0));
        stl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        stl.setForeground(new java.awt.Color(255, 255, 255));
        stl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unit 01", "Unit 02", "Unit 03", "Unit 04", "Unit 05", "Unit 06", "Unit 07", "Unit 08", "Unit 09", "Unit 10" }));
        stl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chart.add(stl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 120, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Percentage of Student Who Paid for ");
        chart.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 240, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Each Unit (Nearly)");
        chart.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, 20));

        data.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 285));

        details.setBackground(new java.awt.Color(51, 51, 51));
        details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nos.setForeground(new java.awt.Color(255, 255, 255));
        nos.setText("Number of Students");
        details.add(nos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        nops.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nops.setForeground(new java.awt.Color(255, 255, 255));
        nops.setText("No. of Paid Students");
        details.add(nops, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        nonps.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nonps.setForeground(new java.awt.Color(255, 255, 255));
        nonps.setText("No. of Unpaid Student");
        details.add(nonps, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        fees.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fees.setForeground(new java.awt.Color(255, 255, 255));
        fees.setText("Fees for Unit");
        details.add(fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        total.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("Income");
        details.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, -1, -1));

        n1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        n1.setForeground(new java.awt.Color(255, 255, 255));
        n1.setText("00");
        details.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 25, 50, -1));

        n2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        n2.setForeground(new java.awt.Color(255, 255, 255));
        n2.setText("00");
        details.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));

        n3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        n3.setForeground(new java.awt.Color(255, 255, 255));
        n3.setText("00");
        details.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 115, 60, -1));

        r1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("Rs.");
        details.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 165, 20, 20));

        r2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("Rs.");
        details.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 205, 20, 20));

        rs1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rs1.setForeground(new java.awt.Color(255, 255, 255));
        rs1.setText("00");
        details.add(rs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 163, 100, -1));

        rs2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        rs2.setForeground(new java.awt.Color(255, 255, 255));
        rs2.setText("00");
        details.add(rs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 202, 100, -1));

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
        details.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 100, 25));

        data.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 290));

        pmnt.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 290, 580));

        getContentPane().add(pmnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
         money();
    }//GEN-LAST:event_countActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Chart.LineChart LineChart;
    private javax.swing.JPanel bar1;
    private javax.swing.JPanel bar2;
    private javax.swing.JPanel chart;
    private Chart.Chart1 chart1;
    private Chart.CircleProggressBar circleProggressBar1;
    private javax.swing.JButton count;
    private javax.swing.JPanel data;
    private javax.swing.JPanel details;
    private javax.swing.JLabel fees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel nonps;
    private javax.swing.JLabel nops;
    private javax.swing.JLabel nos;
    private javax.swing.JPanel pmnt;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel rs1;
    private javax.swing.JLabel rs2;
    private javax.swing.JComboBox<String> stl;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

   
}
