package com.mycompany.mini.projeto.individual;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaMonitoramento extends javax.swing.JFrame {

    //Variáveis estaticas 
    Boolean lerDados = true;

    Integer contador = 0;

    Integer valorMaximoCpu = 0;
    Integer mediaCpu = 0;
    Integer valorMinimoCpu = 500;
    Integer totalValoresCpu = 0;

    Integer valorMaximoDisco = 0;
    Integer mediaDisco = 0;
    Integer valorMinimoDisco = 500;
    Integer totalValoresDisco = 0;

    Integer valorMaximoRam = 0;
    Integer mediaRam = 0;
    Integer valorMinimoRam = 500;
    Integer totalValoresRam = 0;

    public TelaMonitoramento() {
        //Comando " UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); " 
        //para mudar a cor de fundo da barra de progresso atraves do properties
        // Try catch: Exigido para tratamento de exceções no tratamento de códigos
        //que podem não ser totalmente atendidos e gerarem alguma exceção ou erro.
        //O try consegue recuperar erros que possam ocorrer no código fornecido em seu bloco
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaMonitoramento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaMonitoramento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaMonitoramento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaMonitoramento.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        //Mudando cor de fundo da Tela
        getContentPane().setBackground(Color.DARK_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraProgressoCpu = new javax.swing.JProgressBar();
        barraProgressoRam = new javax.swing.JProgressBar();
        barraProgressoDisco = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoLerDados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblValorMinimoCpu = new javax.swing.JLabel();
        lblValorMediaCpu = new javax.swing.JLabel();
        lblValorMaximoCpu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblValorMinimoDisco = new javax.swing.JLabel();
        lblValorMediaDisco = new javax.swing.JLabel();
        lblValorMaximoDisco = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblValorMinimoRam = new javax.swing.JLabel();
        lblValorMediaRam = new javax.swing.JLabel();
        lblValorMaximoRam = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setLocation(new java.awt.Point(430, 100));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(610, 591));

        barraProgressoCpu.setBackground(new java.awt.Color(0, 0, 0));
        barraProgressoCpu.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        barraProgressoCpu.setForeground(new java.awt.Color(0, 204, 255));
        barraProgressoCpu.setStringPainted(true);

        barraProgressoRam.setBackground(new java.awt.Color(0, 0, 0));
        barraProgressoRam.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        barraProgressoRam.setForeground(new java.awt.Color(0, 204, 255));
        barraProgressoRam.setStringPainted(true);

        barraProgressoDisco.setBackground(new java.awt.Color(0, 0, 0));
        barraProgressoDisco.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        barraProgressoDisco.setForeground(new java.awt.Color(0, 204, 255));
        barraProgressoDisco.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("CPU");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("RAM");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Disco");

        botaoLerDados.setBackground(new java.awt.Color(102, 204, 255));
        botaoLerDados.setText("Ler dados");
        botaoLerDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        botaoLerDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLerDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLerDadosActionPerformed(evt);
            }
        });
        botaoLerDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoLerDadosKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 204, 255));
        jLabel5.setText("Máquina 1");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 255));
        jLabel4.setText("Mínimo:");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Máximo:");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Média:");

        lblValorMinimoCpu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMinimoCpu.setForeground(new java.awt.Color(102, 204, 255));
        lblValorMinimoCpu.setText("...%");

        lblValorMediaCpu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMediaCpu.setForeground(new java.awt.Color(204, 255, 255));
        lblValorMediaCpu.setText("...%");

        lblValorMaximoCpu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMaximoCpu.setForeground(new java.awt.Color(255, 51, 51));
        lblValorMaximoCpu.setText("...%");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Máximo:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Média:");

        lblValorMinimoDisco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMinimoDisco.setForeground(new java.awt.Color(102, 204, 255));
        lblValorMinimoDisco.setText("...%");

        lblValorMediaDisco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMediaDisco.setForeground(new java.awt.Color(204, 255, 255));
        lblValorMediaDisco.setText("...%");

        lblValorMaximoDisco.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMaximoDisco.setForeground(new java.awt.Color(255, 51, 51));
        lblValorMaximoDisco.setText("...%");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 204, 255));
        jLabel10.setText("Mínimo:");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Máximo:");

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Média:");

        lblValorMinimoRam.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMinimoRam.setForeground(new java.awt.Color(102, 204, 255));
        lblValorMinimoRam.setText("...%");

        lblValorMediaRam.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMediaRam.setForeground(new java.awt.Color(204, 255, 255));
        lblValorMediaRam.setText("...%");

        lblValorMaximoRam.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblValorMaximoRam.setForeground(new java.awt.Color(255, 51, 51));
        lblValorMaximoRam.setText("...%");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 204, 255));
        jLabel13.setText("Mínimo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barraProgressoRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraProgressoDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barraProgressoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(botaoLerDados, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(2, 2, 2)
                                .addComponent(lblValorMinimoRam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMediaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMaximoRam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(2, 2, 2)
                                .addComponent(lblValorMinimoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addComponent(lblValorMediaDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMaximoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(lblValorMinimoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMediaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorMaximoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraProgressoCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValorMinimoCpu))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValorMediaCpu)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barraProgressoDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMaximoCpu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMinimoDisco))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMediaDisco))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMaximoDisco)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barraProgressoRam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMinimoRam))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMaximoRam))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValorMediaRam)))
                .addGap(25, 25, 25)
                .addComponent(botaoLerDados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void botaoLerDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLerDadosActionPerformed
        //Simulando dados para os componentes
        Integer dadosCpu = ThreadLocalRandom.current().nextInt(1, 101);
        Integer dadosDisco = ThreadLocalRandom.current().nextInt(1, 101);
        Integer dadosRam = ThreadLocalRandom.current().nextInt(31, 101);

        //Inserindo valores nas barras de progresso
        barraProgressoCpu.setValue(dadosCpu);
        barraProgressoDisco.setValue(dadosDisco);
        barraProgressoRam.setValue(dadosRam);

        //Contador para fazer a divisao e pegar a media dos valores
        contador++;

        //Inserindo valores maximos, minimos e media da *CPU*
        totalValoresCpu += dadosCpu;
        mediaCpu = totalValoresCpu / contador;

        if (dadosCpu > valorMaximoCpu) {
            valorMaximoCpu = dadosCpu;
        }
        if (dadosCpu < valorMinimoCpu) {
            valorMinimoCpu = dadosCpu;
        }

        lblValorMaximoCpu.setText(valorMaximoCpu.toString() + "%");
        lblValorMinimoCpu.setText(valorMinimoCpu.toString() + "%");
        lblValorMediaCpu.setText(mediaCpu.toString() + "%");
        //------------------------------------------------------------------//

        //Inserindo valores maximos, minimos e media do *Disco*
        totalValoresDisco += dadosDisco;
        mediaDisco = totalValoresDisco / contador;

        if (dadosDisco > valorMaximoDisco) {
            valorMaximoDisco = dadosDisco;
        }
        if (dadosDisco < valorMinimoDisco) {
            valorMinimoDisco = dadosDisco;
        }

        lblValorMaximoDisco.setText(valorMaximoDisco.toString() + "%");
        lblValorMinimoDisco.setText(valorMinimoDisco.toString() + "%");
        lblValorMediaDisco.setText(mediaDisco.toString() + "%");
        //------------------------------------------------------------------//

        //Inserindo valores maximos, minimos e media da *RAM*
        totalValoresRam += dadosRam;
        mediaRam = totalValoresRam / contador;

        if (dadosRam > valorMaximoRam) {
            valorMaximoRam = dadosRam;
        }
        if (dadosRam < valorMinimoRam) {
            valorMinimoRam = dadosRam;
        }

        lblValorMaximoRam.setText(valorMaximoRam.toString() + "%");
        lblValorMinimoRam.setText(valorMinimoRam.toString() + "%");
        lblValorMediaRam.setText(mediaRam.toString() + "%");
        //------------------------------------------------------------------//
    }//GEN-LAST:event_botaoLerDadosActionPerformed

    private void botaoLerDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoLerDadosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoLerDadosKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgressoCpu;
    private javax.swing.JProgressBar barraProgressoDisco;
    private javax.swing.JProgressBar barraProgressoRam;
    private javax.swing.JButton botaoLerDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblValorMaximoCpu;
    private javax.swing.JLabel lblValorMaximoDisco;
    private javax.swing.JLabel lblValorMaximoRam;
    private javax.swing.JLabel lblValorMediaCpu;
    private javax.swing.JLabel lblValorMediaDisco;
    private javax.swing.JLabel lblValorMediaRam;
    private javax.swing.JLabel lblValorMinimoCpu;
    private javax.swing.JLabel lblValorMinimoDisco;
    private javax.swing.JLabel lblValorMinimoRam;
    // End of variables declaration//GEN-END:variables
}
