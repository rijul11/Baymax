/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctors;

import Main.Connector;
import Main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */

public class DoctorHome4 extends javax.swing.JFrame {

    /**
     * Creates new form DoctorHome
     */
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection connection = null;
    public String sendName;
    String findName;
    DefaultTableModel defaultTableModel = new DefaultTableModel();
    DefaultTableModel defaultTableModel2 = new DefaultTableModel();

    public DoctorHome4(String userName) {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        findName = userName;
        Object columns[] = {"PID","Symptom 1", "Symptom 2", "Symptom 3", "Other","Status" };
        defaultTableModel.setColumnIdentifiers(columns);
        jTable1.setModel(defaultTableModel);
        Object columns2[]={"PID","Medicine 1","Medicine 2","Medicine 3","Diagnosis","Dosage"};
        defaultTableModel2.setColumnIdentifiers(columns2);
        jTable2.setModel(defaultTableModel2);
        FillCombo();
    }

    private DoctorHome4() {
        initComponents();
    }
public void FillCombo()
    {
        connection = Connector.ConnectDb();
        try
        {
         String sql="select name from medicine ";
         ps=connection.prepareStatement(sql);
         System.out.println(sql);
         rs=ps.executeQuery(sql);
         
            while(rs.next())
            {
             String c1=rs.getString("name");
             jComboBox1.addItem(c1);
             jComboBox2.addItem(c1);
             jComboBox3.addItem(c1);
            }
            
            
         
        }    
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(null,"uggh");   
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Insert = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mLabel = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 750));
        setPreferredSize(new java.awt.Dimension(1300, 750));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 1170, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Diagnosis :");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 170, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 210, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Prescription :");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 170, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-nil-" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 210, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-nil-" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 210, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-nil-" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 210, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Dosage :");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 170, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 210, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 720, 230));

        Insert.setBackground(new java.awt.Color(0, 153, 153));
        Insert.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Insert.setForeground(new java.awt.Color(51, 51, 51));
        Insert.setText("Update");
        Insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertMouseClicked(evt);
            }
        });
        getContentPane().add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 220, 40));

        jLabel18.setBackground(new java.awt.Color(0, 153, 153));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 50, 70));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Fetch Patient Records");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 260, 30));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Welcome to the Doctor Portal !");
        getContentPane().add(mLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1250, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1240, 200));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton2.setText("Show Prescriptions");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 360, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1240, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\patientsignup.jpeg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1310, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        connection = Connector.ConnectDb();
        int rows = defaultTableModel.getRowCount();
        if(rows>0)
        {
            for(int i = 0;i<rows;i++)
                defaultTableModel.removeRow(0);
        }           
        try 
        {
            String sql = "select PID,s1,s2,s3,other,status from symptom where PID IN (select PID from patient_doctor where DID='"+findName+"') and status='Unresolved';";
            ps=connection.prepareStatement(sql);
            System.out.println(sql);
            rs=ps.executeQuery();
            Object columnData[] = new Object[6];
            int count=0;
            while (rs.next()) 
            {
                columnData[0] =rs.getString("PID");
                columnData[1] = rs.getString("s1");
                columnData[2] = rs.getString("s2");
                columnData[3] = rs.getString("s3");
                columnData[4] = rs.getString("other");
                columnData[5] = rs.getString("status");
                defaultTableModel.addRow(columnData);
                count++;
            }
                        
            
                JOptionPane.showMessageDialog(null, "Patients Awaiting Prescription");
                //loadData();
             
                
                
            }
            
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"There seems to be an error");
                
            }
          
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void InsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertMouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String dPID = (String)jTable1.getValueAt(row,0);
        String ds1 = (String)jTable1.getValueAt(row,1);
        String ds2=(String)jTable1.getValueAt(row,2);
        String ds3 = (String)jTable1.getValueAt(row,3);
        String dother = (String)jTable1.getValueAt(row,4);
        String dstatus=(String)jTable1.getValueAt(row,5);
        String ddiagnosis=jTextField1.getText();
        String dd1=(String)jComboBox1.getSelectedItem(); 
        String dd2=(String)jComboBox2.getSelectedItem(); 
        String dd3=(String)jComboBox3.getSelectedItem(); 
        String ddosage=jTextField2.getText(); 
        
        int rows =defaultTableModel.getRowCount();

        connection = Connector.ConnectDb();
        try 
        {
            String sql = "insert into prescription values ('"+dPID+"','"+findName+"','"+dd1+"','"+dd2+"','"+dd3+"','"+ddiagnosis+"','"+ddosage+"');";
            ps=connection.prepareStatement(sql);
            ps.executeUpdate(sql);
            System.out.println(sql);
            
            String sql2="delete from patient_doctor where PID='"+dPID+"' and DID ='"+findName+"';";
            ps=connection.prepareStatement(sql2);
            ps.executeUpdate(sql2);
            System.out.println(sql2);
            
            String sql3 ="update symptom set status='Resolved' where PID='"+dPID+"' and s1='"+ds1+"' and s2='"+ds2+"' and s3='"+ds3+"' and other ='"+dother+"';";
                      
            ps=connection.prepareStatement(sql3);
            ps.executeUpdate(sql3);
            System.out.println(sql3);
            
            JOptionPane.showMessageDialog(null,"Patient Diagnosed Successfully !");
          if(rows>0)
          {
            for(int i=0;i<rows;i++)
            {
                defaultTableModel.removeRow(0);
            }

          }
          
           String sql4 = "select PID,s1,s2,s3,other,status from symptom where PID=(select PID from patient_doctor where DID='"+findName+"') and status='Unresolved';";
           ps=connection.prepareStatement(sql4);
            System.out.println(sql4);
            rs=ps.executeQuery();
            Object columnData2[] = new Object[6];
            int cnt=0;
            while (rs.next()) {
                columnData2[0] = rs.getString("PID");
                columnData2[1] = rs.getString("s1");
                columnData2[2] = rs.getString("s2");
                columnData2[3] = rs.getString("s3");
                columnData2[4] = rs.getString("other");
                columnData2[5] = rs.getString("status");
                defaultTableModel.addRow(columnData2);
                cnt++;
            }
          
            
            //connection.close();
        }
            catch(Exception e)
            {
          
                 JOptionPane.showMessageDialog(null," Error"); 
                
            }
                                     


    }//GEN-LAST:event_InsertMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
          int rows2 =defaultTableModel2.getRowCount();
            if(rows2>0)
            {
                for(int i=0;i<rows2;i++)
                    {
                        defaultTableModel2.removeRow(0);
                    }

            }
          connection = Connector.ConnectDb();
        try 
        {      
        
            String sql5 = "select PID,d1,d2,d3,diagnosis,dosage from prescription where DID='"+findName+"';";
            ps=connection.prepareStatement(sql5);
            System.out.println(sql5);
            rs=ps.executeQuery();
            Object columnData3[] = new Object[6];
            int ct=0;
            while (rs.next()) {
                columnData3[0] = rs.getString("PID");
                columnData3[1] = rs.getString("d1");
                columnData3[2] = rs.getString("d2");
                columnData3[3] = rs.getString("d3");
                columnData3[4] = rs.getString("diagnosis");
                columnData3[5] = rs.getString("dosage");
                defaultTableModel2.addRow(columnData3);
                ct++;
            }
        }
        
        catch(Exception e)
            {
          
                 JOptionPane.showMessageDialog(null,"Couldnt Connect to the server !"); 
                
            }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(DoctorHome4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorHome4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorHome4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorHome4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorHome4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}