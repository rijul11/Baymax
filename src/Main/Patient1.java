package Main;


import Patient.AddPatient2;
import Patient.PatientHome3;
//import Patient.AddPatient2;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Statement;


/**
 *
 * @author Sajeeb
 */
public class Patient1 extends javax.swing.JFrame 
{
  
    String username;

    public Patient1() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aUserLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aUserField = new javax.swing.JTextField();
        aPassField = new javax.swing.JPasswordField();
        SignUp = new javax.swing.JButton();
        aLoginBtn = new javax.swing.JButton();
        mLabel = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome Admin !");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 550));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aUserLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        aUserLabel.setText("Patient ID:");
        getContentPane().add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 300, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 310, 40));

        aUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(aUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 310, 30));
        getContentPane().add(aPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 310, 30));

        SignUp.setBackground(new java.awt.Color(0, 204, 204));
        SignUp.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 310, 35));

        aLoginBtn.setBackground(new java.awt.Color(0, 153, 153));
        aLoginBtn.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        aLoginBtn.setText("Login");
        aLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aLoginBtnMouseClicked(evt);
            }
        });
        aLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(aLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 310, 40));

        mLabel.setAlignment(java.awt.Label.CENTER);
        mLabel.setBackground(new java.awt.Color(255, 255, 255));
        mLabel.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        mLabel.setForeground(new java.awt.Color(0, 0, 0));
        mLabel.setText("Patient Login / Sign Up");
        getContentPane().add(mLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 1200, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Haven't made an account yet ?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 310, 40));

        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 550, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\signup.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
String msg="";
    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
      
    }//GEN-LAST:event_SignUpActionPerformed

    private void aLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginBtnActionPerformed
      

    }//GEN-LAST:event_aLoginBtnActionPerformed

    private void aUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aUserFieldActionPerformed

    private void aLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aLoginBtnMouseClicked
        // TODO add your handling code here:
        con = Connector.ConnectDb();
        String user = aUserField.getText();
        String pass = String.valueOf(aPassField.getPassword());

        try 
        
        {
            stmt=con.createStatement();
            String query="select PID, password from patient where PID='" + user + "';";
            rs=stmt.executeQuery(query);

            rs.first();
            if (pass.equals(rs.getString("password"))) {
                PatientHome3 ph = new PatientHome3(user);
                ph.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                
                con.close();
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "PatientID or Password Wrong ! Please Try again !", "Error", JOptionPane.WARNING_MESSAGE);
//              JOptionPane.showMessageDialog(null, "User or Password wrong.");
            }

        } 
        
        catch (HeadlessException | SQLException e) 
        {
//          JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "PatientID  or Password wrong ! ");
        }    
        
        
    }//GEN-LAST:event_aLoginBtnMouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        AddPatient2 ap= new AddPatient2();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Patient1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp;
    private javax.swing.JButton aLoginBtn;
    private javax.swing.JPasswordField aPassField;
    private javax.swing.JTextField aUserField;
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label mLabel;
    // End of variables declaration//GEN-END:variables
}
