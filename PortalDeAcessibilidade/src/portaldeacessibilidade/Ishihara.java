/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portaldeacessibilidade;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
/**
 *
 * @author Claudinei
 */
public class Ishihara extends javax.swing.JPanel {
    JDesktopPane jDesktopPane;
    ArrayList<Integer> ListNumDigitado = new ArrayList<>();
    int pos = 0;
    int soma = 0;
    int contador = 0;
    /**
     * Creates new form OpcoesTeste3
     */
    public Ishihara(JDesktopPane jDesktop) {
        initComponents();
        this.jDesktopPane = jDesktop;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width,screenSize.height);
        showImage(pos);
        
    }
    
    public String[] getImages() {

     File file = new File(getClass().getResource("/Imagens").getFile());
     String[] imagesList = file.list();

      return imagesList;
    }
    
    public void showImage(int index) {
        String[] imagesList = getImages();
        String imageName = imagesList[index];
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/"+imageName));
        Image image = icon.getImage().getScaledInstance(400,400 , Image.SCALE_SMOOTH);
        
        ImagemIshihara.setIcon(new ImageIcon(image));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        btnVoltar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Teste de Ishihara");
        add(jLabel1);
        jLabel1.setBounds(770, 30, 300, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ImagemIshihara.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ImagemIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ImagemIshihara, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        add(jPanel2);
        jPanel2.setBounds(30, 110, 420, 410);

        Numero1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
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
        add(Numero1);
        Numero1.setBounds(520, 110, 250, 60);

        Numero2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero2.setText("2");
        Numero2.setBorderPainted(false);
        Numero2.setContentAreaFilled(false);
        Numero2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero2ActionPerformed(evt);
            }
        });
        add(Numero2);
        Numero2.setBounds(790, 110, 250, 60);

        Numero3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero3.setText("3");
        Numero3.setBorderPainted(false);
        Numero3.setContentAreaFilled(false);
        Numero3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero3ActionPerformed(evt);
            }
        });
        add(Numero3);
        Numero3.setBounds(1050, 110, 260, 60);

        Numero4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
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
        add(Numero4);
        Numero4.setBounds(520, 210, 250, 60);

        Numero5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
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
        add(Numero5);
        Numero5.setBounds(790, 210, 250, 60);

        Numero6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero6.setText("6");
        Numero6.setBorderPainted(false);
        Numero6.setContentAreaFilled(false);
        Numero6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero6ActionPerformed(evt);
            }
        });
        add(Numero6);
        Numero6.setBounds(1050, 210, 260, 60);

        Numero7.setBackground(new java.awt.Color(0, 0, 0));
        Numero7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero7.setText("7");
        Numero7.setBorderPainted(false);
        Numero7.setContentAreaFilled(false);
        Numero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero7ActionPerformed(evt);
            }
        });
        add(Numero7);
        Numero7.setBounds(520, 300, 250, 60);

        Numero8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero8.setText("8");
        Numero8.setBorderPainted(false);
        Numero8.setContentAreaFilled(false);
        Numero8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero8ActionPerformed(evt);
            }
        });
        add(Numero8);
        Numero8.setBounds(790, 300, 250, 60);

        Numero9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero9.setText("9");
        Numero9.setBorderPainted(false);
        Numero9.setContentAreaFilled(false);
        Numero9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero9ActionPerformed(evt);
            }
        });
        add(Numero9);
        Numero9.setBounds(1050, 300, 260, 60);

        Numero0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Numero0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Numero0.setText("0");
        Numero0.setBorderPainted(false);
        Numero0.setContentAreaFilled(false);
        Numero0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero0ActionPerformed(evt);
            }
        });
        add(Numero0);
        Numero0.setBounds(790, 390, 250, 60);

        Btn_Aceitar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Btn_Aceitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
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
        add(Btn_Aceitar);
        Btn_Aceitar.setBounds(510, 580, 260, 60);

        Btn_Nada.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Btn_Nada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
        Btn_Nada.setText("Nada");
        Btn_Nada.setBorderPainted(false);
        Btn_Nada.setContentAreaFilled(false);
        Btn_Nada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Nada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btn_Nada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NadaActionPerformed(evt);
            }
        });
        add(Btn_Nada);
        Btn_Nada.setBounds(1060, 580, 250, 60);

        Btn_Desfazer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Btn_Desfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/flat-buttons_1_.png"))); // NOI18N
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
        add(Btn_Desfazer);
        Btn_Desfazer.setBounds(790, 580, 250, 60);

        NumDigitado.setEditable(false);
        NumDigitado.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NumDigitado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumDigitado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        NumDigitado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        add(NumDigitado);
        NumDigitado.setBounds(750, 500, 330, 50);

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        add(btnVoltar);
        btnVoltar.setBounds(0, 0, 80, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background.jpg"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1370, 770);
    }// </editor-fold>//GEN-END:initComponents

    private void Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero1ActionPerformed
        NumDigitado.setText(NumDigitado.getText()+"1");
    }//GEN-LAST:event_Numero1ActionPerformed

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

    private void Btn_AceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AceitarActionPerformed
        int NumeroDigitadoSalvo = Integer.parseInt(NumDigitado.getText());
        ListNumDigitado.add(NumeroDigitadoSalvo);
        ListNumDigitado.add(contador++);
        this.soma = this.soma + Integer.parseInt(NumDigitado.getText());
        
       if(contador == 21)
        {
           if(soma <= 512 && soma >= 408)
           {
            jDesktopPane.removeAll();
            IshiharaResultNegativo TelaResNeg = new IshiharaResultNegativo(jDesktopPane);
            jDesktopPane.add(TelaResNeg);
            TelaResNeg.setVisible(true);  
           }
           else if (soma <= 219 && soma >= 282)
           {
            jDesktopPane.removeAll();
            IshiharaResuProtonopia Protonopia = new IshiharaResuProtonopia(jDesktopPane);
            jDesktopPane.add(Protonopia);
            Protonopia.setVisible(true);
           } 
           else if ( soma <= 356 && soma >= 491 )
           {
            jDesktopPane.removeAll();
            IshiharaResuDeuteranopia Deuteranopia = new IshiharaResuDeuteranopia(jDesktopPane);
            jDesktopPane.add(Deuteranopia);
            Deuteranopia.setVisible(true);
           }
           else
           {
            jDesktopPane.removeAll();
            IshiharaResuAcromatico acromatico = new IshiharaResuAcromatico(jDesktopPane);
            jDesktopPane.add(acromatico);
            acromatico.setVisible(true);
           }
        }

        // Faz com que seja trocado as imagens
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos  = getImages().length - 1;
        }
        showImage(pos);
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_AceitarActionPerformed

    private void Btn_DesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DesfazerActionPerformed
        // TODO add your handling code here:
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_DesfazerActionPerformed

    private void NumDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumDigitadoActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_NumDigitadoActionPerformed

    private void NumDigitadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumDigitadoKeyPressed

    private void NumDigitadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumDigitadoKeyTyped
        //Comando para que o jTextField so receba numero do painel
        NumDigitado.setEditable(false);
    }//GEN-LAST:event_NumDigitadoKeyTyped

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        jDesktopPane.removeAll();
        MenuPrincipal TelaTeste = new MenuPrincipal(jDesktopPane);
        TelaTeste.setVisible(true);
        jDesktopPane.add(TelaTeste);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void Btn_NadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NadaActionPerformed
        NumDigitado.setText("0");
        ListNumDigitado.add(contador++);
        int NumeroDigitadoSalvo = Integer.parseInt(NumDigitado.getText());
        ListNumDigitado.add(NumeroDigitadoSalvo);
        this.soma = this.soma + Integer.parseInt(NumDigitado.getText());

        if(contador == 21)
        {
           if(soma <=500 && soma >=396 )
           {
            jDesktopPane.removeAll();
            IshiharaResultNegativo TelaResNeg = new IshiharaResultNegativo(jDesktopPane);
            jDesktopPane.add(TelaResNeg);
            TelaResNeg.setVisible(true);  
           }
           else if (soma <= 207 && soma >=270)
           {
            jDesktopPane.removeAll();
            IshiharaResuProtonopia Protonopia = new IshiharaResuProtonopia(jDesktopPane);
            jDesktopPane.add(Protonopia);
            Protonopia.setVisible(true);
           } 
           else if ( soma <=344 && soma >= 479 )
           {
            jDesktopPane.removeAll();
            IshiharaResuDeuteranopia Deuteranopia = new IshiharaResuDeuteranopia(jDesktopPane);
            jDesktopPane.add(Deuteranopia);
            Deuteranopia.setVisible(true);
           }
           else
           {
            jDesktopPane.removeAll();
            IshiharaResuAcromatico acromatico = new IshiharaResuAcromatico(jDesktopPane);
            jDesktopPane.add(acromatico);
            acromatico.setVisible(true);
           }
        }
        
        // Faz com que seja trocado as imagens
        pos = pos + 1;
        if(pos >= getImages().length)
        {
            pos  = getImages().length - 1;
        }
        showImage(pos);
        NumDigitado.setText("");
    }//GEN-LAST:event_Btn_NadaActionPerformed


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
    private javax.swing.JLabel background;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
