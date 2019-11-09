package Main;

import Doctors.DoctorHome4;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Doctor1 extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;
    String userName;

    public Doctor1() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mLabel = new java.awt.Label();
        aUserLabel = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dPassField = new javax.swing.JPasswordField();
        dLoginBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello Doctor !");
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 0, 13, -1));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(0, 153, 153));
        mLabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(255, 255, 255));
        mLabel.setText("Doctor Login ");
        getContentPane().add(mLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 1210, 70));

        aUserLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        aUserLabel.setText("Doctor ID:");
        aUserLabel.setOpaque(true);
        getContentPane().add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 300, 30));

        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(dUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 300, 29));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Password:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 300, 30));
        getContentPane().add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 300, 29));

        dLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        dLoginBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        dLoginBtn.setText("Login");
        dLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 300, 40));

        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 530, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\patientsignup.jpeg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = dUserField.getText();
        String pass = String.valueOf(dPassField.getPassword());

        try {
            String sql = "select DID, password,name from doctor where DID='" + user + "'";
            prp = connection.prepareStatement(sql);
            System.out.println(sql);
            result = prp.executeQuery();
            result.first();
            userName = user;
            if (pass.equals(result.getString("password"))) {
                String name=result.getString("name");
                DoctorHome4 dh = new DoctorHome4(userName);
                dh.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + name, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Doctor ID or password wrong ! Please try again !", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "User or Password wrong.");
        }
    }//GEN-LAST:event_dLoginBtnActionPerformed

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Doctor1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JButton dLoginBtn;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}
