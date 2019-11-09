package Doctors;


import Admins.AdminHome;
import Main.Connector;
import Main.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sajeeb
 */
public class viewDoctor extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public viewDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Doctor ID", "Name", "Qualification", "Experience", "Field", "Mobile"};
        defaultTableModel.setColumnIdentifiers(columns);
        rTable.setModel(defaultTableModel);

        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select DID,name,qualification,experience,field,mobile from doctor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[6];
            while (rs.next()) {
                columnData[0] = rs.getString("DID");
                columnData[1] = rs.getString("name");
                columnData[2] = rs.getString("qualification");
                columnData[3] = rs.getString("experience");
                columnData[4] = rs.getString("field");
                columnData[5] = rs.getInt("mobile");
                
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Doctors !");
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("View Doctors");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, -1, 280, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1310, -1));

        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(rTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 940, 390));

        jLabel2.setMaximumSize(new java.awt.Dimension(250, 270));
        jLabel2.setMinimumSize(new java.awt.Dimension(250, 270));
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 270));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 250, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\doctor_bg.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Main hospital = new Main();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        AdminHome ad= new AdminHome();
        ad.setVisible(true);
        dispose();     
        
        
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rTableMouseClicked
        // TODO add your handling code here:
        Icon a=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\1.jpeg");
        Icon b=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\2.jpeg");
        Icon c=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\3.jpeg");
        Icon d=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\4.jpeg");
        Icon e=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\5.jpeg");
        Icon f =new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\6.jpeg");
        Icon g=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\7.jpeg");
        Icon h=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\8.jpeg");
        Icon i=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\9.jpeg");
        Icon j=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\10.jpeg");
        Icon k=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\11.jpeg");
        Icon l=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\12.jpeg");
        Icon m=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\13.jpeg");
        Icon n=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\14.jpeg");
        Icon o=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\15.jpeg");
        Icon p =new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\16.jpeg");
        Icon q=new ImageIcon("C:\\Users\\admin\\Desktop\\Baymax\\Images\\17.jpeg");
        
       
        DefaultTableModel  model=  (DefaultTableModel)rTable.getModel();
        int row = rTable.getSelectedRow();
        
        switch(row)
        {
            case 0:
                    jLabel2.setIcon(a);
                    break;
            case 1:
                    jLabel2.setIcon(b);
                    break;
            case 2:
                    jLabel2.setIcon(c);
                    break;
            case 3:
                    jLabel2.setIcon(d);
                    break;
            case 4:
                    jLabel2.setIcon(e);
                    break;
            case 5:
                    jLabel2.setIcon(f);
                    break;
            case 6:
                    jLabel2.setIcon(g);
                    break;
            case 7:
                    jLabel2.setIcon(h);
                    break;
            case 8:
                    jLabel2.setIcon(i);
                    break;
            case 9:
                    jLabel2.setIcon(j);
                    break;
            case 10:
                    jLabel2.setIcon(k);
                    break;
            case 11:
                    jLabel2.setIcon(l);
                    break;
            case 12:
                    jLabel2.setIcon(m);
                    break;
            case 13:
                    jLabel2.setIcon(n);
                    break;
            case 14:
                    jLabel2.setIcon(o);
                    break;
            case 15:
                    jLabel2.setIcon(p);
                    break;
            case 16:
                    jLabel2.setIcon(q);
                    break;
           
             

}
       
    
    }//GEN-LAST:event_rTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new viewDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable rTable;
    // End of variables declaration//GEN-END:variables
}
