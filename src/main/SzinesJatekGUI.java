package main;

import javax.swing.JOptionPane;

public class SzinesJatekGUI extends javax.swing.JFrame {

    public SzinesJatekGUI() {
        initComponents();
    }

    String[] oszlop1 = {"p", "p", "p", "-", "-"};
    String[] oszlop2 = {"k", "k", "k", "-", "-"};
    String[] oszlop3 = {"z", "z", "z", "-", "-"};
    String[] oszlop4 = {"-", "-", "-", "-", "-"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMegjelenites = new javax.swing.JPanel();
        lblLepesek = new javax.swing.JLabel();
        lblAktivO1 = new javax.swing.JLabel();
        lblAktivO2 = new javax.swing.JLabel();
        lblAktivO3 = new javax.swing.JLabel();
        lblAktivO4 = new javax.swing.JLabel();
        pnlO1 = new javax.swing.JPanel();
        lblO1S4 = new javax.swing.JLabel();
        lblO1S1 = new javax.swing.JLabel();
        lblO1S2 = new javax.swing.JLabel();
        lblO1S5 = new javax.swing.JLabel();
        lblO1S3 = new javax.swing.JLabel();
        pnlO2 = new javax.swing.JPanel();
        lblO2S2 = new javax.swing.JLabel();
        lblO2S5 = new javax.swing.JLabel();
        lblO2S4 = new javax.swing.JLabel();
        lblO2S1 = new javax.swing.JLabel();
        lblO2S3 = new javax.swing.JLabel();
        pnlO3 = new javax.swing.JPanel();
        lblO3S5 = new javax.swing.JLabel();
        lblO3S4 = new javax.swing.JLabel();
        lblO3S1 = new javax.swing.JLabel();
        lblO3S2 = new javax.swing.JLabel();
        lblO3S3 = new javax.swing.JLabel();
        pnlO4 = new javax.swing.JPanel();
        lblO4S2 = new javax.swing.JLabel();
        lblO4S3 = new javax.swing.JLabel();
        lblO4S1 = new javax.swing.JLabel();
        lblO4S4 = new javax.swing.JLabel();
        lblO4S5 = new javax.swing.JLabel();
        btnKilepes = new javax.swing.JButton();
        btnUjJatek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Színes golyók");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMegjelenites.setBorder(javax.swing.BorderFactory.createTitledBorder("Megjelenítés"));

        lblLepesek.setText("Lépések: 0");

        lblAktivO1.setText("jLabel1");

        lblAktivO2.setText("jLabel1");

        lblAktivO3.setText("jLabel1");

        lblAktivO4.setText("jLabel1");

        pnlO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlO1MouseReleased(evt);
            }
        });

        lblO1S4.setText("jLabel4");

        lblO1S1.setText("jLabel1");

        lblO1S2.setText("jLabel2");

        lblO1S5.setText("jLabel5");

        lblO1S3.setText("jLabel3");

        javax.swing.GroupLayout pnlO1Layout = new javax.swing.GroupLayout(pnlO1);
        pnlO1.setLayout(pnlO1Layout);
        pnlO1Layout.setHorizontalGroup(
            pnlO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblO1S5)
                    .addComponent(lblO1S4)
                    .addComponent(lblO1S3)
                    .addComponent(lblO1S2)
                    .addComponent(lblO1S1))
                .addContainerGap())
        );
        pnlO1Layout.setVerticalGroup(
            pnlO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblO1S1)
                .addGap(18, 18, 18)
                .addComponent(lblO1S2)
                .addGap(18, 18, 18)
                .addComponent(lblO1S3)
                .addGap(18, 18, 18)
                .addComponent(lblO1S4)
                .addGap(18, 18, 18)
                .addComponent(lblO1S5)
                .addContainerGap())
        );

        pnlO2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlO2MouseReleased(evt);
            }
        });

        lblO2S2.setText("jLabel2");

        lblO2S5.setText("jLabel5");

        lblO2S4.setText("jLabel4");

        lblO2S1.setText("jLabel1");

        lblO2S3.setText("jLabel3");

        javax.swing.GroupLayout pnlO2Layout = new javax.swing.GroupLayout(pnlO2);
        pnlO2.setLayout(pnlO2Layout);
        pnlO2Layout.setHorizontalGroup(
            pnlO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblO2S5)
                    .addComponent(lblO2S4)
                    .addComponent(lblO2S3)
                    .addComponent(lblO2S2)
                    .addComponent(lblO2S1))
                .addContainerGap())
        );
        pnlO2Layout.setVerticalGroup(
            pnlO2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblO2S1)
                .addGap(18, 18, 18)
                .addComponent(lblO2S2)
                .addGap(18, 18, 18)
                .addComponent(lblO2S3)
                .addGap(18, 18, 18)
                .addComponent(lblO2S4)
                .addGap(18, 18, 18)
                .addComponent(lblO2S5)
                .addContainerGap())
        );

        pnlO3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlO3MouseReleased(evt);
            }
        });

        lblO3S5.setText("jLabel5");

        lblO3S4.setText("jLabel4");

        lblO3S1.setText("jLabel1");

        lblO3S2.setText("jLabel2");

        lblO3S3.setText("jLabel3");

        javax.swing.GroupLayout pnlO3Layout = new javax.swing.GroupLayout(pnlO3);
        pnlO3.setLayout(pnlO3Layout);
        pnlO3Layout.setHorizontalGroup(
            pnlO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblO3S5)
                    .addComponent(lblO3S4)
                    .addComponent(lblO3S3)
                    .addComponent(lblO3S2)
                    .addComponent(lblO3S1))
                .addContainerGap())
        );
        pnlO3Layout.setVerticalGroup(
            pnlO3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblO3S1)
                .addGap(18, 18, 18)
                .addComponent(lblO3S2)
                .addGap(18, 18, 18)
                .addComponent(lblO3S3)
                .addGap(18, 18, 18)
                .addComponent(lblO3S4)
                .addGap(18, 18, 18)
                .addComponent(lblO3S5)
                .addContainerGap())
        );

        pnlO4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlO4MouseReleased(evt);
            }
        });
        pnlO4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                pnlO4ComponentResized(evt);
            }
        });

        lblO4S2.setText("jLabel2");

        lblO4S3.setText("jLabel3");

        lblO4S1.setText("jLabel1");

        lblO4S4.setText("jLabel4");

        lblO4S5.setText("jLabel5");

        javax.swing.GroupLayout pnlO4Layout = new javax.swing.GroupLayout(pnlO4);
        pnlO4.setLayout(pnlO4Layout);
        pnlO4Layout.setHorizontalGroup(
            pnlO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblO4S5)
                    .addComponent(lblO4S4)
                    .addComponent(lblO4S3)
                    .addComponent(lblO4S2)
                    .addComponent(lblO4S1))
                .addContainerGap())
        );
        pnlO4Layout.setVerticalGroup(
            pnlO4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlO4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblO4S1)
                .addGap(18, 18, 18)
                .addComponent(lblO4S2)
                .addGap(18, 18, 18)
                .addComponent(lblO4S3)
                .addGap(18, 18, 18)
                .addComponent(lblO4S4)
                .addGap(18, 18, 18)
                .addComponent(lblO4S5)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMegjelenitesLayout = new javax.swing.GroupLayout(pnlMegjelenites);
        pnlMegjelenites.setLayout(pnlMegjelenitesLayout);
        pnlMegjelenitesLayout.setHorizontalGroup(
            pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMegjelenitesLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMegjelenitesLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblLepesek))
                    .addGroup(pnlMegjelenitesLayout.createSequentialGroup()
                        .addGroup(pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAktivO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMegjelenitesLayout.createSequentialGroup()
                                .addComponent(pnlO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMegjelenitesLayout.createSequentialGroup()
                                .addComponent(lblAktivO2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAktivO3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAktivO4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(87, 87, 87))
        );
        pnlMegjelenitesLayout.setVerticalGroup(
            pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMegjelenitesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAktivO4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAktivO3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAktivO2)
                        .addComponent(lblAktivO1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pnlMegjelenitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLepesek)
                .addGap(22, 22, 22))
        );

        getContentPane().add(pnlMegjelenites, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 29, -1, -1));

        btnKilepes.setText("Kilépés");
        btnKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKilepesActionPerformed(evt);
            }
        });
        getContentPane().add(btnKilepes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 368, -1, -1));

        btnUjJatek.setText("Új játék");
        getContentPane().add(btnUjJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 368, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlO1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlO1MouseReleased
        lblLepesek.setText("1");
    }//GEN-LAST:event_pnlO1MouseReleased

    private void pnlO2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlO2MouseReleased
        lblLepesek.setText("2");
    }//GEN-LAST:event_pnlO2MouseReleased

    private void pnlO3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlO3MouseReleased
        lblLepesek.setText("3");
    }//GEN-LAST:event_pnlO3MouseReleased

    private void pnlO4ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlO4ComponentResized

    }//GEN-LAST:event_pnlO4ComponentResized

    private void pnlO4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlO4MouseReleased
        lblLepesek.setText("4");
    }//GEN-LAST:event_pnlO4MouseReleased

    private void btnKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKilepesActionPerformed
        kilepes();
    }//GEN-LAST:event_btnKilepesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SzinesJatekGUI().setVisible(true);
            }
        });
    }

    private void kilepes() {
        int gombTipus = JOptionPane.YES_NO_OPTION;
        int valasz = JOptionPane.showConfirmDialog(rootPane, "Biztos kilép?", "Kilépés", gombTipus);
        if (valasz == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKilepes;
    private javax.swing.JButton btnUjJatek;
    private javax.swing.JLabel lblAktivO1;
    private javax.swing.JLabel lblAktivO2;
    private javax.swing.JLabel lblAktivO3;
    private javax.swing.JLabel lblAktivO4;
    private javax.swing.JLabel lblLepesek;
    private javax.swing.JLabel lblO1S1;
    private javax.swing.JLabel lblO1S2;
    private javax.swing.JLabel lblO1S3;
    private javax.swing.JLabel lblO1S4;
    private javax.swing.JLabel lblO1S5;
    private javax.swing.JLabel lblO2S1;
    private javax.swing.JLabel lblO2S2;
    private javax.swing.JLabel lblO2S3;
    private javax.swing.JLabel lblO2S4;
    private javax.swing.JLabel lblO2S5;
    private javax.swing.JLabel lblO3S1;
    private javax.swing.JLabel lblO3S2;
    private javax.swing.JLabel lblO3S3;
    private javax.swing.JLabel lblO3S4;
    private javax.swing.JLabel lblO3S5;
    private javax.swing.JLabel lblO4S1;
    private javax.swing.JLabel lblO4S2;
    private javax.swing.JLabel lblO4S3;
    private javax.swing.JLabel lblO4S4;
    private javax.swing.JLabel lblO4S5;
    private javax.swing.JPanel pnlMegjelenites;
    private javax.swing.JPanel pnlO1;
    private javax.swing.JPanel pnlO2;
    private javax.swing.JPanel pnlO3;
    private javax.swing.JPanel pnlO4;
    // End of variables declaration//GEN-END:variables
}
