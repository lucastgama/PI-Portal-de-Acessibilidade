
package portaldeacessibilidade;
public class OpcoesTeste extends javax.swing.JFrame {

    public OpcoesTeste() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Holgreen = new javax.swing.JButton();
        Nagel = new javax.swing.JButton();
        Ishihara = new javax.swing.JButton();
        TesteCores = new javax.swing.JLabel();
        Las = new javax.swing.JLabel();
        Anomaloscopio = new javax.swing.JLabel();
        Fundo3D = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        Holgreen.setText("Holgreen");
        jPanel1.add(Holgreen);
        Holgreen.setBounds(228, 119, 75, 80);

        Nagel.setText("Nagel");
        jPanel1.add(Nagel);
        Nagel.setBounds(400, 119, 80, 80);

        Ishihara.setText("Ishihara");
        Ishihara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IshiharaActionPerformed(evt);
            }
        });
        jPanel1.add(Ishihara);
        Ishihara.setBounds(60, 119, 71, 80);

        TesteCores.setBackground(new java.awt.Color(255, 255, 255));
        TesteCores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TesteCores.setForeground(new java.awt.Color(255, 255, 255));
        TesteCores.setText("Teste de cores de Ishihara");
        jPanel1.add(TesteCores);
        TesteCores.setBounds(15, 211, 180, 17);

        Las.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Las.setForeground(new java.awt.Color(255, 255, 255));
        Las.setText("Lãs de Holgreen");
        jPanel1.add(Las);
        Las.setBounds(215, 211, 110, 17);

        Anomaloscopio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Anomaloscopio.setForeground(new java.awt.Color(255, 255, 255));
        Anomaloscopio.setText("Anomaloscópio de Nagel");
        jPanel1.add(Anomaloscopio);
        Anomaloscopio.setBounds(355, 211, 170, 17);

        Fundo3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/fundo-3d-banner16.jpg"))); // NOI18N
        jPanel1.add(Fundo3D);
        Fundo3D.setBounds(0, 0, 535, 352);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IshiharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IshiharaActionPerformed
        // TODO add your handling code here:
        new TesteIshihara().setVisible(true);
    }//GEN-LAST:event_IshiharaActionPerformed

   
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
            java.util.logging.Logger.getLogger(OpcoesTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcoesTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcoesTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcoesTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcoesTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anomaloscopio;
    private javax.swing.JLabel Fundo3D;
    private javax.swing.JButton Holgreen;
    private javax.swing.JButton Ishihara;
    private javax.swing.JLabel Las;
    private javax.swing.JButton Nagel;
    private javax.swing.JLabel TesteCores;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
