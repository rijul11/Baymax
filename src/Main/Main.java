package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Sajeeb
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainF = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        patienIcon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        doctorIcon = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Baymax !");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainF.setName("Welcome To Hospital Management System"); // NOI18N
        MainF.setPreferredSize(new java.awt.Dimension(1200, 800));
        MainF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.lightGray);

        patienIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\download.jpg")); // NOI18N
        patienIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        patienIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patienIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patienIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patienIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
        );

        MainF.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 170));

        jPanel3.setBackground(java.awt.Color.lightGray);

        doctorIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\images.jpg")); // NOI18N
        doctorIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        doctorIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
        );

        MainF.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, 170));

        patientLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        patientLabel.setText("Patient");
        patientLabel.setOpaque(true);
        patientLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientLabelMouseClicked(evt);
            }
        });
        MainF.add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, -1));

        doctorLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        doctorLabel.setText("Doctor");
        doctorLabel.setOpaque(true);
        doctorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLabelMouseClicked(evt);
            }
        });
        MainF.add(doctorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 70, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText(" Login As ...");
        jLabel1.setOpaque(true);
        MainF.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 170, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\adminclipart.png")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        MainF.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 150, 160));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel6.setText("Admin");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        MainF.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, 70, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("BAYMAX (HEALTHCARE PROJECT)");
        jLabel2.setOpaque(true);
        MainF.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 820, 70));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\856273-full-size-baymax-wallpapers-1920x1080-for-windows-10.jpg")); // NOI18N
        BackgroundLabel.setText("jLabel5");
        BackgroundLabel.setMaximumSize(new java.awt.Dimension(1300, 800));
        BackgroundLabel.setMinimumSize(new java.awt.Dimension(1200, 800));
        MainF.add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        jLabel7.setText("jLabel7");
        MainF.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLabelMouseClicked
        Doctor1 doctor = new Doctor1();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorLabelMouseClicked

    private void patienIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patienIconMouseClicked
        Patient1 ad = new Patient1();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_patienIconMouseClicked

    private void doctorIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIconMouseClicked
        Doctor1 doctor = new Doctor1();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_doctorIconMouseClicked

    private void patientLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientLabelMouseClicked
        // TODO add your handling code here:
        Patient1 ad = new Patient1();
        ad.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_patientLabelMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Admin1 a = new Admin1();
        a.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        Admin1 a = new Admin1();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:\
        InputStream music;
    try{
         music=new FileInputStream(new File("C:/Users/admin/Desktop/Baymax/youtube.wav"));

          AudioStream audios=new AudioStream(music);
          AudioPlayer.player.start(audios);
        }
     catch(Exception e){

          JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }   
        
        
        
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JPanel MainF;
    private javax.swing.JLabel doctorIcon;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel patienIcon;
    private javax.swing.JLabel patientLabel;
    // End of variables declaration//GEN-END:variables
}
