package portaldeacessibilidade;

import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class TesteIshihara extends javax.swing.JFrame {

   
    public TesteIshihara() 
    {
        initComponents();
        showImage(pos);
    }
    int pos =0;
    
    public String[] getImages()
    {

     File file = new File(getClass().getResource("/Imagens").getFile());
     String[] imagesList = file.list();

      return imagesList;
    }
     public void showImage(int index)
    {
        String[] imagesList = getImages();
        String imageName = imagesList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/"+imageName));
        Image image = icon.getImage().getScaledInstance(ImagemIshihara.getWidth(), ImagemIshihara.getHeight(), Image.SCALE_SMOOTH);
        ImagemIshihara.setIcon(new ImageIcon(image));
    }
//    public void maskLetter(JFormattedTextField NumDigitado)
//    {
//        MaskFormatter formatoDois;
//	try {
//                formatoDois = new MaskFormatter("*");
//		formatoDois.setValidCharacters("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
//		formatoDois.install(NumDigitado);
//            }
//        catch (ParseException e) {
//			JOptionPane.showMessageDialog(
//					null,
//					this,
//					"Não foi possivel inserir mask nos campos letras: "
//							+ e.getMessage(), 0);
//		}
//	}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ImagemIshihara = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Numero1 = new javax.swing.JButton();
        Numero2 = new javax.swing.JButton();
        Numero3 = new javax.swing.JButton();
        Numero4 = new javax.swing.JButton();
        Numero5 = new javax.swing.JButton();
        Numero6 = new javax.swing.JButton();
        Numero7 = new javax.swing.JButton();
        Numero8 = new javax.swing.JButton();
        Numero9 = new javax.swing.JButton();
        Numero0 = new javax.swing.JButton();
        Btn_Aceitar = new javax.swing.JButton();
        Btn_Nada = new javax.swing.JButton();
        Btn_Desfazer = new javax.swing.JButton();
        NumDigitado = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        ImagemIshihara.setBackground(new java.awt.Color(0, 0, 0));
        ImagemIshihara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        jPanel1.add(ImagemIshihara);
        ImagemIshihara.setBounds(10, 51, 480, 400);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 480, 400);

        Numero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/1.png"))); // NOI18N
        Numero1.setBorderPainted(false);
        Numero1.setContentAreaFilled(false);
        Numero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/1_Roxo.png"))); // NOI18N
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero1);
        Numero1.setBounds(510, 70, 70, 70);

        Numero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/2.png"))); // NOI18N
        Numero2.setBorderPainted(false);
        Numero2.setContentAreaFilled(false);
        Numero2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/2_Roxo.png"))); // NOI18N
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero2);
        Numero2.setBounds(610, 70, 70, 70);

        Numero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/3.png"))); // NOI18N
        Numero3.setBorderPainted(false);
        Numero3.setContentAreaFilled(false);
        Numero3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/3_Roxo.png"))); // NOI18N
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero3);
        Numero3.setBounds(700, 70, 70, 70);

        Numero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/4.png"))); // NOI18N
        Numero4.setBorderPainted(false);
        Numero4.setContentAreaFilled(false);
        Numero4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/4_Roxo.png"))); // NOI18N
        Numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero4ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero4);
        Numero4.setBounds(510, 160, 70, 70);

        Numero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/5.png"))); // NOI18N
        Numero5.setBorderPainted(false);
        Numero5.setContentAreaFilled(false);
        Numero5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/5_Roxo.png"))); // NOI18N
        Numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero5ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero5);
        Numero5.setBounds(610, 160, 70, 70);

        Numero6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/6.png"))); // NOI18N
        Numero6.setBorderPainted(false);
        Numero6.setContentAreaFilled(false);
        Numero6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/6_Roxo.png"))); // NOI18N
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero6);
        Numero6.setBounds(700, 160, 70, 70);

        Numero7.setBackground(new java.awt.Color(0, 0, 0));
        Numero7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/7.png"))); // NOI18N
        Numero7.setBorderPainted(false);
        Numero7.setContentAreaFilled(false);
        Numero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/7_Roxo.png"))); // NOI18N
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero7);
        Numero7.setBounds(510, 240, 70, 70);

        Numero8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/8.png"))); // NOI18N
        Numero8.setBorderPainted(false);
        Numero8.setContentAreaFilled(false);
        Numero8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/8_Roxo.png"))); // NOI18N
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero8);
        Numero8.setBounds(610, 240, 70, 70);

        Numero9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/9.png"))); // NOI18N
        Numero9.setBorderPainted(false);
        Numero9.setContentAreaFilled(false);
        Numero9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/9_Roxo.png"))); // NOI18N
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero9);
        Numero9.setBounds(700, 240, 70, 70);

        Numero0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/0.png"))); // NOI18N
        Numero0.setBorderPainted(false);
        Numero0.setContentAreaFilled(false);
        Numero0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/0_Roxo.png"))); // NOI18N
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero0);
        Numero0.setBounds(610, 330, 70, 70);

        Btn_Aceitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Aceitar.png"))); // NOI18N
        Btn_Aceitar.setBorderPainted(false);
        Btn_Aceitar.setContentAreaFilled(false);
        Btn_Aceitar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Aceitar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Aceitar_Roxo.png"))); // NOI18N
        Btn_Aceitar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btn_Aceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceitarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Aceitar);
        Btn_Aceitar.setBounds(500, 460, 150, 60);

        Btn_Nada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Nada.png"))); // NOI18N
        Btn_Nada.setBorderPainted(false);
        Btn_Nada.setContentAreaFilled(false);
        Btn_Nada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Nada.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Nada_Roxo.png"))); // NOI18N
        Btn_Nada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(Btn_Nada);
        Btn_Nada.setBounds(640, 460, 150, 60);

        Btn_Desfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Desfazer.png"))); // NOI18N
        Btn_Desfazer.setBorderPainted(false);
        Btn_Desfazer.setContentAreaFilled(false);
        Btn_Desfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Desfazer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/Desfazer_roxo.png"))); // NOI18N
        Btn_Desfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DesfazerActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Desfazer);
        Btn_Desfazer.setBounds(560, 530, 150, 60);

        NumDigitado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NumDigitado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumDigitado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        NumDigitado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NumDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumDigitadoActionPerformed(evt);
            }
        });
        jPanel1.add(NumDigitado);
        NumDigitado.setBounds(620, 400, 60, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/fundo-3d-banner16.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-6, -6, 810, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"1");

    }//GEN-LAST:event_Numero1ActionPerformed

    private void Btn_AceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceitarActionPerformed
        // TODO add your handling code here:
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos  = getImages().length - 1;
        }
        showImage(pos);
    }//GEN-LAST:event_Btn_AceitarActionPerformed

    private void NumDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumDigitadoActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_NumDigitadoActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"2");
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"3");
    }//GEN-LAST:event_Numero3ActionPerformed

    private void Numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero4ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"4");
    }//GEN-LAST:event_Numero4ActionPerformed

    private void Numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero5ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"5");
    }//GEN-LAST:event_Numero5ActionPerformed

    private void Numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero6ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"6");
    }//GEN-LAST:event_Numero6ActionPerformed

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"7");
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero8ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"8");
    }//GEN-LAST:event_Numero8ActionPerformed

    private void Numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero9ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"9");
    }//GEN-LAST:event_Numero9ActionPerformed

    private void Numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero0ActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText(NumDigitado.getText()+"0");
    }//GEN-LAST:event_Numero0ActionPerformed

    private void Btn_DesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DesfazerActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_DesfazerActionPerformed

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
            java.util.logging.Logger.getLogger(TesteIshihara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteIshihara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteIshihara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteIshihara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteIshihara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Btn_Aceitar;
    private javax.swing.JButton Btn_Desfazer;
    private javax.swing.JButton Btn_Nada;
    private javax.swing.JLabel ImagemIshihara;
    private javax.swing.JTextField NumDigitado;
    private javax.swing.JButton Numero0;
    private javax.swing.JButton Numero1;
    private javax.swing.JButton Numero2;
    private javax.swing.JButton Numero3;
    private javax.swing.JButton Numero4;
    private javax.swing.JButton Numero5;
    private javax.swing.JButton Numero6;
    private javax.swing.JButton Numero7;
    private javax.swing.JButton Numero8;
    private javax.swing.JButton Numero9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
