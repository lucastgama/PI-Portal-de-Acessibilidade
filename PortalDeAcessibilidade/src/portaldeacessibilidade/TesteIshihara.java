package portaldeacessibilidade;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class TesteIshihara extends javax.swing.JFrame {
    
    ArrayList<Integer> ListNumDigitado = new ArrayList<>();
    int pos = 0;
    int soma = 0;

    public TesteIshihara() 
    {
        initComponents();
        showImage(pos);
        
    }
    
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
        Image image = icon.getImage().getScaledInstance(400,400 , Image.SCALE_SMOOTH);
        ImagemIshihara.setIcon(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ImagemIshihara = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ImagemIshihara.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagemIshihara, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ImagemIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 55, 420, 410);

        Numero1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero1.setText("1");
        Numero1.setBorderPainted(false);
        Numero1.setContentAreaFilled(false);
        Numero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero1.setMaximumSize(new java.awt.Dimension(150, 125));
        Numero1.setMinimumSize(new java.awt.Dimension(150, 125));
        Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero1ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero1);
        Numero1.setBounds(460, 60, 100, 90);

        Numero2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero2.setText("2");
        Numero2.setBorderPainted(false);
        Numero2.setContentAreaFilled(false);
        Numero2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero2);
        Numero2.setBounds(570, 60, 100, 90);

        Numero3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero3.setText("3");
        Numero3.setBorderPainted(false);
        Numero3.setContentAreaFilled(false);
        Numero3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero3);
        Numero3.setBounds(680, 60, 110, 90);

        Numero4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero4.setText("4");
        Numero4.setToolTipText("");
        Numero4.setBorderPainted(false);
        Numero4.setContentAreaFilled(false);
        Numero4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero4ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero4);
        Numero4.setBounds(460, 160, 100, 90);

        Numero5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero5.setText("5");
        Numero5.setToolTipText("");
        Numero5.setBorderPainted(false);
        Numero5.setContentAreaFilled(false);
        Numero5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero5ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero5);
        Numero5.setBounds(570, 160, 100, 90);

        Numero6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero6.setText("6");
        Numero6.setBorderPainted(false);
        Numero6.setContentAreaFilled(false);
        Numero6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero6);
        Numero6.setBounds(680, 160, 110, 90);

        Numero7.setBackground(new java.awt.Color(0, 0, 0));
        Numero7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero7.setText("7");
        Numero7.setBorderPainted(false);
        Numero7.setContentAreaFilled(false);
        Numero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero7);
        Numero7.setBounds(460, 260, 100, 90);

        Numero8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero8.setText("8");
        Numero8.setBorderPainted(false);
        Numero8.setContentAreaFilled(false);
        Numero8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero8);
        Numero8.setBounds(570, 260, 100, 90);

        Numero9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero9.setText("9");
        Numero9.setBorderPainted(false);
        Numero9.setContentAreaFilled(false);
        Numero9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero9);
        Numero9.setBounds(680, 260, 110, 90);

        Numero0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Numero0.setText("0");
        Numero0.setBorderPainted(false);
        Numero0.setContentAreaFilled(false);
        Numero0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });
        jPanel1.add(Numero0);
        Numero0.setBounds(570, 360, 100, 90);

        Btn_Aceitar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Btn_Aceitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Btn_Aceitar.setText("Confirma");
        Btn_Aceitar.setBorderPainted(false);
        Btn_Aceitar.setContentAreaFilled(false);
        Btn_Aceitar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Aceitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Aceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AceitarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Aceitar);
        Btn_Aceitar.setBounds(460, 520, 100, 90);

        Btn_Nada.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Btn_Nada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Btn_Nada.setText("Nada");
        Btn_Nada.setBorderPainted(false);
        Btn_Nada.setContentAreaFilled(false);
        Btn_Nada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Nada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Btn_Nada);
        Btn_Nada.setBounds(690, 520, 100, 90);

        Btn_Desfazer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Btn_Desfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botao/aleatorio.png"))); // NOI18N
        Btn_Desfazer.setText("Apagar");
        Btn_Desfazer.setBorderPainted(false);
        Btn_Desfazer.setContentAreaFilled(false);
        Btn_Desfazer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Desfazer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Desfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DesfazerActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Desfazer);
        Btn_Desfazer.setBounds(580, 520, 100, 90);

        NumDigitado.setEditable(false);
        NumDigitado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NumDigitado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumDigitado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        NumDigitado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NumDigitado.setSelectionEnd(2);
        NumDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumDigitadoActionPerformed(evt);
            }
        });
        NumDigitado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NumDigitadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumDigitadoKeyTyped(evt);
            }
        });
        jPanel1.add(NumDigitado);
        NumDigitado.setBounds(460, 460, 330, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Digite o número que esta sendo exibido");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 0, 430, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
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
        int NumeroDigitadoSalvo = Integer.parseInt(NumDigitado.getText());
        ListNumDigitado.add(NumeroDigitadoSalvo);
        this.soma = this.soma + Integer.parseInt(NumDigitado.getText());
        System.out.println("Lista: " + ListNumDigitado);
        System.out.println("Valor: " + this.soma);
//        for (int i=0; i<25; i++) 
//        {
//        soma += ListNumDigitado.get(i);
//        }
//        System.out.println(soma);
        
        // Faz com que seja trocado as imagens
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos  = getImages().length - 1;
        }
        showImage(pos);
//       Apresenta aproximatamente o grau do usuario
//       if ( Grau >=554 || Grau >= 680 == true){
//           System.out.print("Você não possui daltonismo\n");
//       } else if (Grau >= 553 || Grau <= 212 == true){
//           System.out.print("Voce possui daltonismo\n");
//       } 
//       else if( Grau <= 211){
//           System.out.println("Procure um oftalmologista urgente seu grau de daltonismo e muito alto\n");
//       }
//        JOptionPane.showInputDialog(NumDigitado);
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_AceitarActionPerformed

    private void NumDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumDigitadoActionPerformed
        // TODO add your handling code here
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

    private void NumDigitadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyTyped
        //Comando para que o jTextField so receba numero do painel
        NumDigitado.setEditable(false);
    }//GEN-LAST:event_NumDigitadoKeyTyped

    private void NumDigitadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumDigitadoKeyPressed

    public static void main(String args[]) {
        
        String[] ListaIshihara = new String [25];
    
        for(int i =0; i<ListaIshihara.length; i++)
        {
           // ListaIshihara[i]
        }
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
