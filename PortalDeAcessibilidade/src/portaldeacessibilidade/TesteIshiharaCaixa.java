package portaldeacessibilidade;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class TesteIshiharaCaixa extends javax.swing.JInternalFrame {

   ArrayList<Integer> ListNumDigitado = new ArrayList<>(25);
    int pos = 0;
    int soma = 0;

    public TesteIshiharaCaixa() {
        
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
        Btn_Desfazer = new javax.swing.JButton();
        NumDigitado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("Digite o número que esta sendo exibido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(665, Short.MAX_VALUE)
                .addComponent(Btn_Desfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(Numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(110, 110, 110)
                                    .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NumDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(440, 440, 440)
                            .addComponent(Btn_Aceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 520, Short.MAX_VALUE)
                .addComponent(Btn_Desfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)
                            .addComponent(Numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(NumDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addComponent(Btn_Aceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed

        NumDigitado.setText(NumDigitado.getText()+"1");
    }//GEN-LAST:event_Numero1ActionPerformed

    private void Numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero2ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"2");
    }//GEN-LAST:event_Numero2ActionPerformed

    private void Numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero3ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"3");
    }//GEN-LAST:event_Numero3ActionPerformed

    private void Numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero4ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"4");
    }//GEN-LAST:event_Numero4ActionPerformed

    private void Numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero5ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"5");
    }//GEN-LAST:event_Numero5ActionPerformed

    private void Numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero6ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"6");
    }//GEN-LAST:event_Numero6ActionPerformed

    private void Numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero7ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"7");
    }//GEN-LAST:event_Numero7ActionPerformed

    private void Numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero8ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"8");
    }//GEN-LAST:event_Numero8ActionPerformed

    private void Numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero9ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"9");
    }//GEN-LAST:event_Numero9ActionPerformed

    private void Numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero0ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"0");
    }//GEN-LAST:event_Numero0ActionPerformed

    private void Btn_AceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceitarActionPerformed
        int contClick = 0;
        int NumeroDigitadoSalvo = Integer.parseInt(NumDigitado.getText());
        ListNumDigitado.add(NumeroDigitadoSalvo);
        this.soma = this.soma + Integer.parseInt(NumDigitado.getText());
        
        System.out.println("Lista: " + ListNumDigitado);
        System.out.println("Valor: " + this.soma);
        
/////// Faz com que seja trocado as imagens/////////////////////////////////////
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos  = getImages().length - 1;
        }
        showImage(pos);
////////contador para encerrar a soma///////////////////////////////////////////
       contClick = contClick +1;
        System.out.println(contClick);
//       if(contClick ==25 == true )
//       {
//           System.exit(pos);
//       }
////////Apresenta aproximatamente o grau do usuario/////////////////////////////
        if ( soma >=554 || soma >= 680 == true)
        {
            System.out.print("Você não possui daltonismo\n");
        }
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_AceitarActionPerformed

    private void Btn_DesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DesfazerActionPerformed
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_DesfazerActionPerformed

    private void NumDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumDigitadoActionPerformed
    }//GEN-LAST:event_NumDigitadoActionPerformed

    private void NumDigitadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyPressed
    }//GEN-LAST:event_NumDigitadoKeyPressed

    private void NumDigitadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyTyped
        //Comando para que o jTextField so receba numero do painel
        NumDigitado.setEditable(false);
    }//GEN-LAST:event_NumDigitadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Aceitar;
    private javax.swing.JButton Btn_Desfazer;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
