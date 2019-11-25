
package portaldeacessibilidade;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author Claudinei
 */
public class MenuPrincipal extends javax.swing.JPanel {
    public JDesktopPane jDesktopPane;
    
    /**
     * Creates new form OpcoesTeste3
     */
    public MenuPrincipal(JDesktopPane jDesktop) {
        initComponents();
        this.jDesktopPane = jDesktop;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width,screenSize.height);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnIshihara = new javax.swing.JButton();
        btnHolmgreen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnHolmgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(btnIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(350, 350, 350))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHolmgreen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIshiharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIshiharaActionPerformed
        jDesktopPane.removeAll(); 
        Ishihara TelaIshihara = new Ishihara(jDesktopPane);
        jDesktopPane.add(TelaIshihara);
        TelaIshihara.setVisible(true);
    }//GEN-LAST:event_btnIshiharaActionPerformed

    private void btnHolmgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHolmgreenActionPerformed
        jDesktopPane.removeAll();
        Holmgreen TelaHolmgreen = new Holmgreen(this.jDesktopPane);
        jDesktopPane.add(TelaHolmgreen);
        TelaHolmgreen.setVisible(true);
    }//GEN-LAST:event_btnHolmgreenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHolmgreen;
    private javax.swing.JButton btnIshihara;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
