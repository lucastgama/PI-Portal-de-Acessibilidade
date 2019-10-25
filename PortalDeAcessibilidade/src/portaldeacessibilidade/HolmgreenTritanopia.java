package portaldeacessibilidade;

public class HolmgreenTritanopia extends javax.swing.JFrame {

    public HolmgreenTritanopia() {
        setExtendedState(OpcoesTeste.MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponents();        
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnLã1 = new javax.swing.JButton();
        btnLã2 = new javax.swing.JButton();
        btnLã3 = new javax.swing.JButton();
        btnLã4 = new javax.swing.JButton();
        btnLã5 = new javax.swing.JButton();
        btnLã6 = new javax.swing.JButton();
        btnLã7 = new javax.swing.JButton();
        btnLã8 = new javax.swing.JButton();
        btnLã9 = new javax.swing.JButton();
        txtLã = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(0, 0, 80, 30);

        btnLã1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã1.setText("*imagem lã 1*");
        jPanel1.add(btnLã1);
        btnLã1.setBounds(630, 100, 200, 110);

        btnLã2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã2.setText("*imagem lã 2*");
        jPanel1.add(btnLã2);
        btnLã2.setBounds(870, 100, 200, 110);

        btnLã3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã3.setText("*imagem lã 3*");
        jPanel1.add(btnLã3);
        btnLã3.setBounds(1110, 100, 200, 110);

        btnLã4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã4.setText("*imagem lã 4*");
        jPanel1.add(btnLã4);
        btnLã4.setBounds(630, 250, 200, 110);

        btnLã5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã5.setText("*imagem lã 5*");
        jPanel1.add(btnLã5);
        btnLã5.setBounds(870, 250, 200, 110);

        btnLã6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã6.setText("*imagem lã 6*");
        jPanel1.add(btnLã6);
        btnLã6.setBounds(1110, 250, 200, 110);

        btnLã7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã7.setText("*imagem lã 7*");
        jPanel1.add(btnLã7);
        btnLã7.setBounds(630, 400, 200, 110);

        btnLã8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã8.setText("*imagem lã 8*");
        jPanel1.add(btnLã8);
        btnLã8.setBounds(870, 400, 200, 110);

        btnLã9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã9.setText("*imagem lã 9*");
        jPanel1.add(btnLã9);
        btnLã9.setBounds(1110, 400, 200, 110);

        txtLã.setBackground(new java.awt.Color(231, 231, 231));
        jPanel1.add(txtLã);
        txtLã.setBounds(620, 590, 440, 50);

        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerificar.setText("VERIFICAR");
        jPanel1.add(btnVerificar);
        btnVerificar.setBounds(1110, 530, 200, 110);

        jScrollPane1.setBorder(null);

        jTextPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane1.setText("\tNeste teste, o paciente deverá selecionar as lãs que o mesmo determinar sendo de diferentes tonalidades da cor amarela, clicando sobre os botões das respectivas lãs, ou digitando pelo teclado, da maneira que lhe for de melhor agrado.\n");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 100, 490, 200);

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new OpcoesHolmgreen().setVisible(true);
        OpcoesHolmgreen TelaHolmgreen = new OpcoesHolmgreen();
        jPanel1.add(TelaHolmgreen);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaHolmgreen.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(HolmgreenTritanopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HolmgreenTritanopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HolmgreenTritanopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HolmgreenTritanopia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new HolmgreenTritanopia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLã1;
    private javax.swing.JButton btnLã2;
    private javax.swing.JButton btnLã3;
    private javax.swing.JButton btnLã4;
    private javax.swing.JButton btnLã5;
    private javax.swing.JButton btnLã6;
    private javax.swing.JButton btnLã7;
    private javax.swing.JButton btnLã8;
    private javax.swing.JButton btnLã9;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtLã;
    // End of variables declaration//GEN-END:variables
}
