/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prj_GUI;

import org.json.simple.JSONArray;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Vector;
import javax.swing.*;
import org.json.simple.JSONObject;

/**
 *
 * @author bgete
 */
public class GUI_From extends javax.swing.JFrame {
 JFrame f;
 
 
    /**
     * Creates new form GUI_From
     */
    public GUI_From() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CropNameTextField = new javax.swing.JTextField();
        CropNameLabel = new javax.swing.JLabel();
        MarketNameTextField = new javax.swing.JTextField();
        MarketNameLabel = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        startDateTextField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        endDateTextField = new javax.swing.JTextField();
        SELECT = new javax.swing.JButton();
        CategoryComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        monthTextField = new javax.swing.JToggleButton();
        PastdaysTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        CropNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CropNameTextFieldActionPerformed(evt);
            }
        });

        CropNameLabel.setText("CropName (產品名稱) ");

        MarketNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketNameTextFieldActionPerformed(evt);
            }
        });

        MarketNameLabel.setText("MarketName (市場名稱)");

        CategoryLabel.setText("Category (農、漁) ");

        startDateLabel.setText("Start Date");

        startDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateTextFieldActionPerformed(evt);
            }
        });

        endDateLabel.setText("End Date");

        endDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateTextFieldActionPerformed(evt);
            }
        });

        SELECT.setText("搜尋");
        SELECT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELECTActionPerformed(evt);
            }
        });

        CategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "農業", "漁業"}));
        CategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ex:  2022-07");

        monthTextField.setText("開啟月份查詢");
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        PastdaysTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastdaysTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Past days");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ex:  2022-01-04 日期輸入單一格即可查詢單日 兩個都輸入則是查詢範圍");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ex:  5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CropNameLabel)
                                    .addComponent(CategoryLabel)
                                    .addComponent(MarketNameLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startDateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CropNameTextField)
                                            .addComponent(MarketNameTextField)
                                            .addComponent(CategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(endDateLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 42, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(SELECT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PastdaysTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CropNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CropNameLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarketNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarketNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel)
                    .addComponent(endDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PastdaysTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(monthTextField))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SELECT)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SELECTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELECTActionPerformed

     // ;        
        try {

            // TODO add your handling code here:
            get();
        } catch (Exception ex) {
            Logger.getLogger(GUI_From.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SELECTActionPerformed

    private void CropNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CropNameTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CropNameTextFieldActionPerformed

    private void MarketNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarketNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarketNameTextFieldActionPerformed

    private void startDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateTextFieldActionPerformed

    private void endDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateTextFieldActionPerformed

    private void CategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryComboBoxActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void PastdaysTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastdaysTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PastdaysTextField1ActionPerformed


//將GUI介面 信息寫進Array以便取用    
public String[] gettext(){
String[] array = new String[7];
array[0] = CropNameTextField.getText();
array[1] = MarketNameTextField.getText();
array[2] = (String)CategoryComboBox.getSelectedItem();;
array[3] = startDateTextField.getText();
array[4] = endDateTextField.getText();
array[5] = String.valueOf(monthTextField.isSelected()) ;
array[6] = PastdaysTextField1.getText();
return array;

}
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
            java.util.logging.Logger.getLogger(GUI_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_From().setVisible(true);
            }
        });
    }
       public void setCropNameTextField(String name) {
         CropNameTextField.setText(name);
    }

  
    public void setMarketNameTextField(String value) { 
        MarketNameTextField.setText(value); 
    }


  
    public void setStartDateTextField(String startDate) {
        startDateTextField.setText(startDate);
    }

    public void setEndDateTextField(String endDate) {
        endDateTextField.setText(endDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryComboBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel CropNameLabel;
    private javax.swing.JTextField CropNameTextField;
    private javax.swing.JLabel MarketNameLabel;
    private javax.swing.JTextField MarketNameTextField;
    private javax.swing.JTextField PastdaysTextField1;
    private javax.swing.JButton SELECT;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField endDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton monthTextField;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField startDateTextField;
    // End of variables declaration//GEN-END:variables
public  HashSet<String> get() throws Exception{
  
        try{
            String[] text = gettext();
            //System.out.println(text[0]);//產品名稱
            //System.out.println(text[1]);//市場名稱
            //System.out.println(text[2]);//農或漁
            //System.out.println(text[3]);//開始時間
            //System.out.println(text[4]);//結束時間
            //System.out.println(text[5]);//是否按下按鈕
            //System.out.println(text[6]);//過去天數
            
            //設定為null理由為當沒有符合以下條件時則會報錯則可以知道目前邏輯沒有照預想走
            PreparedStatement statement = null;
            //第三題 初始值
            double thirdQuestion= 0;
            Connection con = getConnection();
            if (text[2] == "農業"){
                System.out.println(text[2]);
                
                
                //第一題
                if ( text[3].length()!= 0 && text[4].length()!= 0 && text[0].length()!= 0 && text[1].length()!= 0 && text[6].length()== 0&& text[5].equals("false") ){
                    System.out.println("第一題");
                    statement = con.prepareStatement("SELECT CropName,MarketName,AVG(Trans_Quantity),max(Trans_Quantity),min(Trans_Quantity) FROM `agriproductstranstype` where MarketName = '"+text[1]+"' and CropName = '"+text[0]+"' and TransDate >='"+text[3]+"' and TransDate <='"+text[4]+"'");
                //輸入起始時間跟結束時間，顯示這段時間農產品中的"椰子"在"台北二"這個市場中的平均交易量、最大交易量、最低交易量。
                //SELECT TransDate,CropName,MarketName,AVG(Trans_Quantity),max(Trans_Quantity),min(Trans_Quantity) FROM `agriproductstranstype2` where MarketName = "台北二" and CropName = "椰子" and TransDate >='104.01.01' and TransDate <='107.04.12' ;
                }
                
                
                //第二題-農業
                else if( ((text[3].length()!=0) ^ (text[4].length()!=0)) && text[5].equals("false") && text[6].length()== 0){
                    System.out.println("第二題-農業");
                    if ((text[3].length() - text[4].length())>0){
                        statement = con.prepareStatement("SELECT TransDate,sum(Trans_Quantity*Avg_Price) From `agriproductstranstype` where TransDate = '"+text[3]+"';");
                    }
                    else if((text[4].length() - text[3].length())>=0){
                        statement = con.prepareStatement("SELECT TransDate,sum(Trans_Quantity*Avg_Price) From `agriproductstranstype` where TransDate = '"+text[4]+"';");
                    }
                }
                
                
                //第三題
                else if( ((text[3].length()!=0) ^ (text[4].length()!=0)) && text[0].length()!= 0 && text[1].length()!= 0 && text[6].length()!= 0){
                    System.out.println("第三題"); 
                    thirdQuestion = 1 ;
                    String textdata;
                    if ((text[3].length() - text[4].length())>0){
                      textdata = text[3];
                    }else{
                      textdata = text[4];
                   }
                    statement = con.prepareStatement("SELECT Trans_Quantity,TransDate  from `agriproductstranstype` where  TransDate >= date_sub('"+text[3]+"',INTERVAL '"+text[6]+"' DAY) and TransDate <= '"+textdata+"'and MarketName ='"+text[1]+"' and CropName ='"+text[0]+"' ORDER BY TransDate ASC;");
                }
                

                ///第四題
                else if( ((text[3].length()!=0) ^ (text[4].length()!=0)) && text[5].equals("true") && text[6].length()== 0 ){
                  System.out.println("第四題");
                  String textdata;
                    if ((text[3].length() - text[4].length())>0){
                      textdata = text[3];
                    }else{
                      textdata = text[4];
                    }
                //將輸入日期內容轉成Date型態
                    Date StartDate = new SimpleDateFormat("yyyy-MM").parse(textdata);
                //設定年月的形式
                    SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
                    SimpleDateFormat getmonDateFormat = new SimpleDateFormat("MM");
                //轉成年和月
                    String currentYear = getYearFormat.format(StartDate);
                    String currentMon = getmonDateFormat.format(StartDate);
                //SQL語句
                    statement = con.prepareStatement("SELECT CropName, sum(Trans_Quantity) AS total_Quantity FROM  `agriproductstranstype` where month(TransDate)='"+currentMon+"'and year(TransDate)='"+currentYear+"' GROUP BY CropName ORDER BY total_Quantity DESC Limit 10;");
                }
             }
         
             if (text[2]=="漁業"){
                System.out.println(text[2]);
                //第二題-漁業
                if(((text[3].length()!=0) ^ (text[4].length()!=0)) && text[5].equals("false") && text[6].length()== 0){
                    System.out.println("漁第二題");
                    if ((text[3].length() - text[4].length())>0){
                        statement = con.prepareStatement("SELECT TransDate,sum(Trans_Quantity*Avg_Price) From `fisheryproductstranstype` where TransDate = '"+text[3]+"';");
                    }
                    else if((text[4].length() - text[3].length())>=0){
                        statement = con.prepareStatement("SELECT TransDate,sum(Trans_Quantity*Avg_Price) From `fisheryproductstranstype` where TransDate = '"+text[4]+"';");
                    }
                }   
            }
            
             
     
            //以下為資料處理相關       
            //接回SQL語句結果 #executeQuery只能用來查詢
            ResultSet result = statement.executeQuery();
            
            HashSet<String> columns = new HashSet<String>();
            ResultSetMetaData rsmd =result.getMetaData();
            int count = rsmd.getColumnCount();
            
            //取得列的名稱
            for (int x = 1; x <= count; x++) {
	    	columns.add(rsmd.getColumnName(x));
	    }
           int arrayCount=0;
           JSONArray jsonArray = new JSONArray();
           //n 為判斷列數
           int n= 0;
           
           while(result.next()){
                JSONObject obj = new JSONObject();
                n=n+1;
                arrayCount  = result.getMetaData().getColumnCount();
                //System.out.println(arrayCount);
               
               for (int j = 0; j < arrayCount; j++) {
                    obj.put(result.getMetaData().getColumnLabel(j + 1), result.getObject(j + 1));
                    //每筆的值
                    System.out.println(obj); 
                   
               }
               jsonArray.add(obj);
            }       
            System.out.println("jsonArray結果"+jsonArray);

            String[] setColumns = columns.toArray(new String[0]);
            //設定每一個資料的項目
            String [] headings= setColumns;
            //指定要顯示在表格中的資料
            Object[][] data = new String[n][headings.length];
            System.out.println("aaa"+n);
            String [] totalArray= new String[headings.length];
            JSONObject arrayhigh = (JSONObject) jsonArray.get(0);
            double lastStroke=0;
            String transQuantityboolean= "True";
            for (int j = 0; j < n; j++) {
                JSONObject jsb   =(JSONObject)jsonArray.get(j);
                    for (int k = 0; k < headings.length; k++) {              
                        data[j][k]=String.valueOf(jsb.get(headings[k]));
                        if(headings[k].equals("Trans_Quantity")){
                            double jsbDouble =  (double) jsb.get(headings[k]);
                         
                            System.out.println(lastStroke>jsbDouble);
                            System.out.print("s"+lastStroke);
                            System.out.print("a"+jsbDouble);
                            //判斷第三題 只要有一天交易量低於昨天就設成False
                            
                            if(lastStroke>jsbDouble){
                                //System.out.println(lastStroke);
                                //System.out.println(jsbDouble);
                                transQuantityboolean = "False";
                            }
                            
                            //記錄昨天交易量
                            lastStroke=Double.valueOf(jsbDouble);
                        }
                    }     
            }
            //第三題 欄位名稱 和 結果
            String [] headings2={"是否為嚴格遞增"};
            Object[][] data2 ={{transQuantityboolean}};
            javax.swing.JTable table;
            //建立 Table
            //判斷是否為第三題如果是則表不讀取原本的 而是改讀計算結果
            if(thirdQuestion==1){
                table=new javax.swing.JTable(data2,headings2);
            }else{
                table=new javax.swing.JTable(data,headings);
            }
            //Frame 秀出表格
            javax.swing.JFrame MyFrame=new javax.swing.JFrame("農漁表格");
            MyFrame.setSize(500,200);
            MyFrame.setLocation(200,200);
            MyFrame.getContentPane().add(new javax.swing.JScrollPane(table));
            MyFrame.setVisible(true);
            }catch(Exception e){System.out.println(e);}
        return null; 
    }


        //創表格
	public static void creatTable()throws Exception{
		try {
                    Connection con = getConnection();
                    //如果表格不存在則創一個
                    PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS agriproductstranstype(id int NOT NULL AUTO_INCREMENT, "
					+ "TransDate date,"
					+ "CropCode varchar(10),"
					+ "CropName varchar(20),"
					+ "MarketCode int(3),"
					+ "MarketName varchar(10),"
					+ "Avg_Price DOUBLE,"
					+ "Trans_Quantity DOUBLE,"
					+ "PRIMARY KEY(id));");
                    create.executeUpdate();
                    PreparedStatement create2 = con.prepareStatement("CREATE TABLE IF NOT EXISTS fisheryproductstranstype(id int NOT NULL AUTO_INCREMENT, "
					+ "TransDate date,"
					+ "CropCode varchar(10),"
					+ "CropName varchar(20),"
					+ "MarketCode int(3),"
					+ "MarketName varchar(10),"
					+ "Avg_Price DOUBLE,"
					+ "Trans_Quantity DOUBLE,"
					+ "PRIMARY KEY(id));");
                    create2.executeUpdate();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    finally{
			System.out.println("表格已完成");
                    }
	}
	
	
	
	
	public static Connection getConnection() throws Exception{
		try {
                    //SQL 基本設定輸入
                    String driver = "com.mysql.cj.jdbc.Driver";//驅動
                    String url = "jdbc:mysql://localhost:3305/bgete";//路徑
                    String username = "root"; //名稱
                    String password = "z1x2c3";//密碼
                    Class.forName(driver);
                    //SQL參數輸入
                    Connection conn = DriverManager.getConnection(url,username,password);
                    System.out.println("連線成功");
                    return conn;
                    }catch(Exception e){
                        System.out.println(e);
                    }
		return null;	
	}

 

   

   
        
}


