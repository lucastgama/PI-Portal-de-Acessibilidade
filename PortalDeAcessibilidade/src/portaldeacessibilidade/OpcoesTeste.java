
package portaldeacessibilidade;
public class OpcoesTeste extends javax.swing.JFrame {

    public OpcoesTeste() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CaixaDeTestes = new javax.swing.JPanel();
        Holgreen = new javax.swing.JButton();
        Nagel = new javax.swing.JButton();
        Ishihara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaixaDeTestes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Holgreen.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Holgreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Holgreen.setText("Holgreem");
        Holgreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Holgreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HolgreenActionPerformed(evt);
            }
        });

        Nagel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nagel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Nagel.setText("Nagel");
        Nagel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Ishihara.setBackground(new java.awt.Color(0, 0, 0));
        Ishihara.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ishihara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Ishihara.setText("Ishihara");
        Ishihara.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Ishihara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IshiharaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nagel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ishihara, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Holgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(CaixaDeTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Ishihara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Holgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Nagel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CaixaDeTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        setSize(new java.awt.Dimension(1183, 734));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IshiharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IshiharaActionPerformed

//        new TesteIshihara().setVisible(true);
        TesteIshiharaCaixa TelaIshihara = new TesteIshiharaCaixa();
        CaixaDeTestes.add(TelaIshihara);
        TelaIshihara.setVisible(true);
        
    }//GEN-LAST:event_IshiharaActionPerformed

    private void HolgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HolgreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HolgreenActionPerformed

   
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
    private javax.swing.JPanel CaixaDeTestes;
    private javax.swing.JButton Holgreen;
    private javax.swing.JButton Ishihara;
    private javax.swing.JButton Nagel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
