package Admins;

import Main.Admin1;
import Main.Main;
import Medicine.AddMedicine;
import Medicine.DeleteMedicine;
import Medicine.SearchMedicine;
import Medicine.UpdateMedicine;
import Medicine.ViewMedicine;
import javax.swing.ImageIcon;

/**
 *
 * @author Sajeeb
 */
public class MedicineManagement extends javax.swing.JFrame {

    public MedicineManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        addMedicine = new javax.swing.JLabel();
        addMedicine2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        updateMedicinen = new javax.swing.JLabel();
        updateMedicine = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        deleteMedicine = new javax.swing.JLabel();
        deleteMedicine2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        viewMedicine = new javax.swing.JLabel();
        viewMedicine2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        searchMedicine = new javax.swing.JLabel();
        searchMedicine2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medicine Management !");
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(java.awt.Color.lightGray);
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 100));

        addMedicine.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        addMedicine.setText("Add New");
        addMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedicineMouseClicked(evt);
            }
        });

        addMedicine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addMedicine2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedicine2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(addMedicine2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(addMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addMedicine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addMedicine)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        updateMedicinen.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        updateMedicinen.setText("Update");
        updateMedicinen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMedicinenMouseClicked(evt);
            }
        });

        updateMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatepatient.png"))); // NOI18N
        updateMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMedicineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(updateMedicine)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateMedicinen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateMedicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateMedicinen)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        deleteMedicine.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        deleteMedicine.setText("Delete ");
        deleteMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMedicineMouseClicked(evt);
            }
        });

        deleteMedicine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/deletepatient.png"))); // NOI18N
        deleteMedicine2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMedicine2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMedicine2))
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteMedicine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteMedicine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 140, 100));

        jPanel8.setBackground(java.awt.Color.lightGray);
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 100));

        viewMedicine.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        viewMedicine.setText("View ");
        viewMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMedicineMouseClicked(evt);
            }
        });

        viewMedicine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/viewpatient.png"))); // NOI18N
        viewMedicine2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMedicine2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(viewMedicine2)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewMedicine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewMedicine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        jPanel7.setBackground(java.awt.Color.lightGray);
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 100));

        searchMedicine.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        searchMedicine.setText("Search ");
        searchMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMedicineMouseClicked(evt);
            }
        });

        searchMedicine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchpatient.png"))); // NOI18N
        searchMedicine2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMedicine2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(searchMedicine2)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchMedicine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setText("Welcome to the Medicine Portal !");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 630, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cross.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\MIT WPU\\Third year\\CN\\project\\medicine_bg.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1300, 800));
        jLabel1.setMinimumSize(new java.awt.Dimension(1300, 800));
        jLabel1.setPreferredSize(new java.awt.Dimension(1300, 800));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicineMouseClicked
        AddMedicine adr = new AddMedicine();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addMedicineMouseClicked

    private void addMedicine2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicine2MouseClicked
        AddMedicine adr = new AddMedicine();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addMedicine2MouseClicked

    private void updateMedicinenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicinenMouseClicked
        UpdateMedicine uReceptionist = new UpdateMedicine();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMedicinenMouseClicked

    private void updateMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicineMouseClicked
        UpdateMedicine uReceptionist = new UpdateMedicine();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMedicineMouseClicked

    private void deleteMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMedicineMouseClicked
        DeleteMedicine dReceptionist = new DeleteMedicine();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteMedicineMouseClicked

    private void deleteMedicine2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMedicine2MouseClicked
        DeleteMedicine dReceptionist = new DeleteMedicine();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteMedicine2MouseClicked

    private void viewMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicineMouseClicked
        ViewMedicine vReceptionist = new ViewMedicine();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewMedicineMouseClicked

    private void viewMedicine2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMedicine2MouseClicked
        ViewMedicine vReceptionist = new ViewMedicine();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewMedicine2MouseClicked

    private void searchMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMedicineMouseClicked
        SearchMedicine sReceptionist = new SearchMedicine();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchMedicineMouseClicked

    private void searchMedicine2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMedicine2MouseClicked
        SearchMedicine sReceptionist = new SearchMedicine();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchMedicine2MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        AdminHome ah=new AdminHome();
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Main hospital = new Main();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MedicineManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addMedicine;
    private javax.swing.JLabel addMedicine2;
    private javax.swing.JLabel deleteMedicine;
    private javax.swing.JLabel deleteMedicine2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel searchMedicine;
    private javax.swing.JLabel searchMedicine2;
    private javax.swing.JLabel updateMedicine;
    private javax.swing.JLabel updateMedicinen;
    private javax.swing.JLabel viewMedicine;
    private javax.swing.JLabel viewMedicine2;
    // End of variables declaration//GEN-END:variables

}
