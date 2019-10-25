package portaldeacessibilidade;

import java.awt.Color;

public class OpcoesTeste extends javax.swing.JFrame {

    public OpcoesTeste() {  
        setExtendedState(OpcoesTeste.MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnIshihara = new javax.swing.JButton();
        btnHolmgreen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jDesktopPane1.setName(""); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        btnIshihara.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIshihara.setText("Ishihara");
        btnIshihara.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIshihara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIshiharaActionPerformed(evt);
            }
        });

        btnHolmgreen.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnHolmgreen.setText("Holmgreen");
        btnHolmgreen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHolmgreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHolmgreenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setText("PORTAL DE ACESSIBILIDADE");

        jDesktopPane1.setLayer(btnIshihara, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnHolmgreen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(btnHolmgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(btnIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(350, 350, 350))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHolmgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        setSize(new java.awt.Dimension(1386, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIshiharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIshiharaActionPerformed
        new TesteIshihara().setVisible(true);
        TesteIshihara TelaIshihara = new TesteIshihara();
        jDesktopPane1.add(TelaIshihara);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaIshihara.setVisible(true);
        
    }//GEN-LAST:event_btnIshiharaActionPerformed

    private void btnHolmgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHolmgreenActionPerformed
        new OpcoesHolmgreen().setVisible(true);
        OpcoesHolmgreen TelaHolmgreen = new OpcoesHolmgreen();
        jDesktopPane1.add(TelaHolmgreen);
        this.setExtendedState(MAXIMIZED_BOTH);
        TelaHolmgreen.setVisible(true);
    }//GEN-LAST:event_btnHolmgreenActionPerformed

   
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
    private javax.swing.JButton btnHolmgreen;
    private javax.swing.JButton btnIshihara;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
