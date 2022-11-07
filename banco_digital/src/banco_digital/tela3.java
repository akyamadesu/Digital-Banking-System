package banco_digital;
import javax.swing.*;


public class tela3 extends javax.swing.JFrame 
{

    public tela3() 
    {
        initComponents();
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        voltarTela2 = new javax.swing.JButton();
        lblNomeBanco2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        fecharTela3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblValorSaqueOuDeposito = new javax.swing.JLabel();
        lblimgMoeda = new javax.swing.JLabel();
        txtValorSaqueOuDeposito = new javax.swing.JTextField();
        btnSacar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtValorSaqueOuDeposito1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblNomeBanco3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        voltarTela2.setBackground(new java.awt.Color(0, 0, 0));
        voltarTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar_16.png"))); // NOI18N
        voltarTela2.setContentAreaFilled(false);
        voltarTela2.setFocusPainted(false);
        voltarTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2ActionPerformed(evt);
            }
        });

        lblNomeBanco2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 68)); // NOI18N
        lblNomeBanco2.setForeground(new java.awt.Color(0, 204, 153));
        lblNomeBanco2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeBanco2.setText("BANCO BR");

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(56, 340));

        fecharTela3.setBackground(new java.awt.Color(0, 0, 0));
        fecharTela3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png_16.png"))); // NOI18N
        fecharTela3.setBorderPainted(false);
        fecharTela3.setContentAreaFilled(false);
        fecharTela3.setFocusPainted(false);
        fecharTela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTela3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecharTela3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(fecharTela3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 126));

        lblValorSaqueOuDeposito.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblValorSaqueOuDeposito.setForeground(new java.awt.Color(0, 51, 51));
        lblValorSaqueOuDeposito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorSaqueOuDeposito.setText(" VALOR");

        lblimgMoeda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimgMoeda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coin_32.png"))); // NOI18N

        txtValorSaqueOuDeposito.setBackground(new java.awt.Color(204, 204, 204));
        txtValorSaqueOuDeposito.setForeground(new java.awt.Color(0, 0, 0));
        txtValorSaqueOuDeposito.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtValorSaqueOuDeposito.setOpaque(true);
        txtValorSaqueOuDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaqueOuDepositoActionPerformed(evt);
            }
        });

        btnSacar.setBackground(new java.awt.Color(0, 0, 0));
        btnSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        btnSacar.setForeground(new java.awt.Color(0, 51, 51));
        btnSacar.setText("SACAR");
        btnSacar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSacar.setContentAreaFilled(false);
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnDepositar.setBackground(new java.awt.Color(0, 0, 0));
        btnDepositar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(0, 51, 51));
        btnDepositar.setText("DEPOSITAR");
        btnDepositar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));

        txtValorSaqueOuDeposito1.setBackground(new java.awt.Color(204, 204, 204));
        txtValorSaqueOuDeposito1.setForeground(new java.awt.Color(0, 0, 0));
        txtValorSaqueOuDeposito1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtValorSaqueOuDeposito1.setOpaque(true);
        txtValorSaqueOuDeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaqueOuDeposito1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorSaqueOuDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblimgMoeda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtValorSaqueOuDeposito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtValorSaqueOuDeposito1))
                        .addGap(50, 50, 50)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblimgMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValorSaqueOuDeposito)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorSaqueOuDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorSaqueOuDeposito1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacar)
                    .addComponent(btnDepositar))
                .addGap(80, 80, 80))
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
            .addGap(0, 267, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblNomeBanco3.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        lblNomeBanco3.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeBanco3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeBanco3.setText("SAQUE E DEPOSITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarTela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeBanco3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNomeBanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltarTela2)
                            .addComponent(lblNomeBanco2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeBanco3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void fecharTela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTela3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecharTela3ActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
       
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void txtValorSaqueOuDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorSaqueOuDepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorSaqueOuDepositoActionPerformed

    private void txtValorSaqueOuDeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorSaqueOuDeposito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorSaqueOuDeposito1ActionPerformed
    
    private void adicionaComponentes(){
        JTextField txtChavePix = new JTextField();
        JLabel lblValor = new JLabel();
        JTextField txtValor = new JTextField();
        JButton btnPagar = new JButton();

        txtChavePix.setVisible(true);
        lblValor.setVisible(true);
        txtValor.setVisible(true);
        btnPagar.setVisible(true);
        
        initComponents();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton fecharTela3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblNomeBanco2;
    private javax.swing.JLabel lblNomeBanco3;
    private javax.swing.JLabel lblValorSaqueOuDeposito;
    private javax.swing.JLabel lblimgMoeda;
    private javax.swing.JTextField txtValorSaqueOuDeposito;
    private javax.swing.JTextField txtValorSaqueOuDeposito1;
    private javax.swing.JButton voltarTela2;
    // End of variables declaration//GEN-END:variables
}
