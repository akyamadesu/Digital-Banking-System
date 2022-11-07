package banco_digital;

import javax.swing.JOptionPane;

public class tela4 extends javax.swing.JFrame 
{
    public tela4() 
    {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fecharTela4 = new javax.swing.JButton();
        lblNomeBanco2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        voltarTela2 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblChavePix2 = new javax.swing.JLabel();
        btnMostrarSeuPix = new javax.swing.JButton();
        lblRecebeSeuPix = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        lblValor2 = new javax.swing.JLabel();
        txtChavePix = new javax.swing.JTextField();
        txtValorPix = new javax.swing.JTextField();
        lblSeuPix = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblUser2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        fecharTela4.setBackground(new java.awt.Color(0, 0, 0));
        fecharTela4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png_16.png"))); // NOI18N
        fecharTela4.setBorderPainted(false);
        fecharTela4.setContentAreaFilled(false);
        fecharTela4.setFocusPainted(false);
        fecharTela4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTela4ActionPerformed(evt);
            }
        });

        lblNomeBanco2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 68)); // NOI18N
        lblNomeBanco2.setForeground(new java.awt.Color(0, 204, 153));
        lblNomeBanco2.setText("BANCO BR");

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        voltarTela2.setBackground(new java.awt.Color(0, 0, 0));
        voltarTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar_16.png"))); // NOI18N
        voltarTela2.setContentAreaFilled(false);
        voltarTela2.setFocusPainted(false);
        voltarTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(voltarTela2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(voltarTela2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(55, 340));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 126));

        lblChavePix2.setBackground(new java.awt.Color(0, 204, 153));
        lblChavePix2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        lblChavePix2.setForeground(new java.awt.Color(0, 51, 51));
        lblChavePix2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChavePix2.setText("CHAVE ");

        btnMostrarSeuPix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnMostrarSeuPix.setContentAreaFilled(false);
        btnMostrarSeuPix.setFocusable(false);

        lblRecebeSeuPix.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblRecebeSeuPix.setForeground(new java.awt.Color(0, 51, 51));
        lblRecebeSeuPix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecebeSeuPix.setText("222761");

        btnTransferir.setBackground(new java.awt.Color(255, 255, 255));
        btnTransferir.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(0, 51, 51));
        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        btnTransferir.setContentAreaFilled(false);
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        lblValor2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        lblValor2.setForeground(new java.awt.Color(0, 51, 51));
        lblValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor2.setText(" VALOR");

        txtChavePix.setBackground(new java.awt.Color(204, 204, 204));
        txtChavePix.setForeground(new java.awt.Color(0, 0, 0));
        txtChavePix.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtChavePix.setOpaque(true);
        txtChavePix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChavePixActionPerformed(evt);
            }
        });

        txtValorPix.setBackground(new java.awt.Color(204, 204, 204));
        txtValorPix.setForeground(new java.awt.Color(0, 0, 0));
        txtValorPix.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtValorPix.setOpaque(true);
        txtValorPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorPixActionPerformed(evt);
            }
        });

        lblSeuPix.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblSeuPix.setForeground(new java.awt.Color(0, 51, 51));
        lblSeuPix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeuPix.setText("MINHA CHAVE ");

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeuPix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblChavePix2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtValorPix, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 164, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnMostrarSeuPix, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblRecebeSeuPix, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtChavePix, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChavePix2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(btnTransferir)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorPix, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeuPix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarSeuPix, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRecebeSeuPix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(0, 204, 153));
        jPanel17.setPreferredSize(new java.awt.Dimension(56, 216));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        lblUser2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(255, 255, 255));
        lblUser2.setText("TRANSFERÊNCIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)))
                    .addComponent(lblNomeBanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fecharTela4, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fecharTela4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeBanco2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_voltarTela2ActionPerformed

    private void fecharTela4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTela4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharTela4ActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void txtChavePixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChavePixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChavePixActionPerformed

    private void txtValorPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorPixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorPixActionPerformed

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
            java.util.logging.Logger.getLogger(tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarSeuPix;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton fecharTela4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblChavePix2;
    private javax.swing.JLabel lblNomeBanco2;
    private javax.swing.JLabel lblRecebeSeuPix;
    private javax.swing.JLabel lblSeuPix;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField txtChavePix;
    private javax.swing.JTextField txtValorPix;
    private javax.swing.JButton voltarTela2;
    // End of variables declaration//GEN-END:variables
}
