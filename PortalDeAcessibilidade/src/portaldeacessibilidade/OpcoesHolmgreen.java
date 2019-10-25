package portaldeacessibilidade;

public class OpcoesHolmgreen extends javax.swing.JFrame {

    public OpcoesHolmgreen() {
        setExtendedState(OpcoesTeste.MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponents();  
        jTextPane1.setBorder(null);
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTritanopia = new javax.swing.JButton();
        btnProtanopia = new javax.swing.JButton();
        btnDeuteranopia = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblHolmgreen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        btnTritanopia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTritanopia.setText("TESTE TRITANOPIA ");
        btnTritanopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTritanopiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTritanopia);
        btnTritanopia.setBounds(970, 520, 260, 110);

        btnProtanopia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProtanopia.setText("TESTE PROTANOPIA ");
        btnProtanopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProtanopiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnProtanopia);
        btnProtanopia.setBounds(550, 520, 260, 110);

        btnDeuteranopia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeuteranopia.setText("TESTE DEUTERANOPIA ");
        btnDeuteranopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeuteranopiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeuteranopia);
        btnDeuteranopia.setBounds(130, 520, 260, 110);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(0, 0, 80, 30);

        lblHolmgreen.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        lblHolmgreen.setText("LÃS DE HOLMGREEN");
        jPanel1.add(lblHolmgreen);
        lblHolmgreen.setBounds(360, 60, 650, 90);

        jScrollPane2.setBorder(null);

        jTextPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTextPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane1.setText("  Lãs de Holmgreen (ou Holmgreen) são pequenos feixes de lãs coloridas que são utilizados para diagnóstico do daltonismo. \n\n  A execução desse teste consiste em pedir que o paciente separe uma porção de lãs especialmente pintadas em cores ligeiramente diferentes. \n\n  Esses feixes de lãs devem ser selecionados de uma maneira em que o mesmo corresponda ao gabarito. \n\n  Conforme a distorção das cores pode-se determinar o tipo de daltonismo.\n\n  O paciente deverá realizar os três testes disponíveis para uma melhor eficácia no diagnóstico do mesmo.");
        jTextPane1.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(100, 190, 1160, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new OpcoesTeste().setVisible(true);
        OpcoesTeste TelaTeste = new OpcoesTeste();
        jPanel1.add(TelaTeste);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaTeste.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnDeuteranopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeuteranopiaActionPerformed
        new HolmgreenDeuteranopia().setVisible(true);
        HolmgreenDeuteranopia TelaDeuteranopia = new HolmgreenDeuteranopia();
        jPanel1.add(TelaDeuteranopia);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaDeuteranopia.setVisible(true);
    }//GEN-LAST:event_btnDeuteranopiaActionPerformed

    private void btnProtanopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProtanopiaActionPerformed
        new HolmgreenProtanopia().setVisible(true);
        HolmgreenProtanopia TelaProtanopia = new HolmgreenProtanopia();
        jPanel1.add(TelaProtanopia);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaProtanopia.setVisible(true);
    }//GEN-LAST:event_btnProtanopiaActionPerformed

    private void btnTritanopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTritanopiaActionPerformed
        new HolmgreenTritanopia().setVisible(true);
        HolmgreenTritanopia TelaTritanopia = new HolmgreenTritanopia();
        jPanel1.add(TelaTritanopia);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaTritanopia.setVisible(true);
        
    }//GEN-LAST:event_btnTritanopiaActionPerformed

    public static void main(String args[]) {        
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
            java.util.logging.Logger.getLogger(OpcoesHolmgreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcoesHolmgreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcoesHolmgreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcoesHolmgreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new OpcoesHolmgreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeuteranopia;
    private javax.swing.JButton btnProtanopia;
    private javax.swing.JButton btnTritanopia;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblHolmgreen;
    // End of variables declaration//GEN-END:variables
}
