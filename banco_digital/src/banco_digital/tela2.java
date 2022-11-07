package banco_digital;
import javax.swing.JOptionPane;

public class tela2 extends javax.swing.JFrame 
{
    public tela2() 
    {
        initComponents();
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltarTela2 = new javax.swing.JButton();
        fecharTela2 = new javax.swing.JButton();
        lblNomeBanco2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSacar = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblEnviar = new javax.swing.JLabel();
        btnSacar = new javax.swing.JButton();
        lblDepositar = new javax.swing.JLabel();
        btnDepositar = new javax.swing.JButton();
        lblUser2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        lblMoeda2 = new javax.swing.JLabel();
        lblSaldoCliente = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        voltarTela2.setBackground(new java.awt.Color(0, 0, 0));
        voltarTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar_16.png"))); // NOI18N
        voltarTela2.setContentAreaFilled(false);
        voltarTela2.setFocusPainted(false);
        voltarTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2ActionPerformed(evt);
            }
        });

        fecharTela2.setBackground(new java.awt.Color(0, 0, 0));
        fecharTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png_16.png"))); // NOI18N
        fecharTela2.setBorderPainted(false);
        fecharTela2.setContentAreaFilled(false);
        fecharTela2.setFocusPainted(false);
        fecharTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTela2ActionPerformed(evt);
            }
        });

        lblNomeBanco2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 68)); // NOI18N
        lblNomeBanco2.setForeground(new java.awt.Color(0, 204, 153));
        lblNomeBanco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeBanco2.setText("BANCO BR");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(56, 340));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 126));

        lblSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblSacar.setForeground(new java.awt.Color(0, 51, 51));
        lblSacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/receber_32.png"))); // NOI18N
        lblSacar.setText("SACAR ");
        lblSacar.setPreferredSize(new java.awt.Dimension(113, 50));

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 204, 153));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnEnviar.setActionCommand("SEGUIR\n");
        btnEnviar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        lblEnviar.setBackground(new java.awt.Color(0, 204, 153));
        lblEnviar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblEnviar.setForeground(new java.awt.Color(0, 51, 51));
        lblEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pay_32.png"))); // NOI18N
        lblEnviar.setText("ENVIAR");

        btnSacar.setBackground(new java.awt.Color(255, 255, 255));
        btnSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        btnSacar.setForeground(new java.awt.Color(0, 204, 153));
        btnSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnSacar.setActionCommand("SEGUIR\n");
        btnSacar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSacar.setContentAreaFilled(false);
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        lblDepositar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblDepositar.setForeground(new java.awt.Color(0, 51, 51));
        lblDepositar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transfer_32.png"))); // NOI18N
        lblDepositar.setText("DEPOSITAR");
        lblDepositar.setPreferredSize(new java.awt.Dimension(113, 50));

        btnDepositar.setBackground(new java.awt.Color(255, 255, 255));
        btnDepositar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(0, 204, 153));
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnDepositar.setActionCommand("SEGUIR\n");
        btnDepositar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSacar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        lblUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userBranco_32.png"))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
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
            .addGap(0, 216, Short.MAX_VALUE)
        );

        lblNomeCliente.setBackground(new java.awt.Color(0, 153, 102));
        lblNomeCliente.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeCliente.setText(" FERNANDO NOGUEIRA SANTOS");

        lblMoeda2.setBackground(new java.awt.Color(0, 153, 102));
        lblMoeda2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblMoeda2.setForeground(new java.awt.Color(0, 0, 0));
        lblMoeda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoeda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coin_32.png"))); // NOI18N

        lblSaldoCliente.setBackground(new java.awt.Color(0, 153, 102));
        lblSaldoCliente.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblSaldoCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoCliente.setText("R$ 10,50");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        lblId.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMoeda2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSaldoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeBanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecharTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecharTela2)
                    .addComponent(voltarTela2)
                    .addComponent(lblNomeBanco2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeCliente)
                        .addGap(18, 18, 18)
                        .addComponent(lblMoeda2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSaldoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void fecharTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTela2ActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_fecharTela2ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        new tela4().setVisible(true);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void voltarTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela2ActionPerformed
        JOptionPane.showMessageDialog(null,"DESEJA SAIR DESSA TELA?","VOLTAR",JOptionPane.QUESTION_MESSAGE); 
        this.dispose();
    }//GEN-LAST:event_voltarTela2ActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        new tela3().setVisible(true);
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        new tela3().setVisible(true);
    }//GEN-LAST:event_btnDepositarActionPerformed

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
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton fecharTela2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDepositar;
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMoeda2;
    private javax.swing.JLabel lblNomeBanco2;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblSacar;
    private javax.swing.JLabel lblSaldoCliente;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JButton voltarTela2;
    // End of variables declaration//GEN-END:variables

    private void setDefaultCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
