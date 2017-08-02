/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.alcxgas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Alcool x Gasolina
 *
 * @author Aldivan Oliveira
 */
public class CalculadoraFlex extends javax.swing.JFrame {

    /**
     * Criando o método para calcular o combustível
     */
    private void calcular() {
        // Lógica principal
        // A linha abaixo cria variável do tipo real de alta precisão
        double alcool, gasolina;
        // Entrada de Dados
        // A linha abaixo captura que foi digitadona caixa de texto de nome txtAlcool, converte para o tipo de variável, substitui a vírgula pelo ponto e armaneza na variável alcool
        alcool = Double.parseDouble(txtAlcool.getText().replace(",", "."));
        gasolina = Double.parseDouble(txtGasolina.getText().replace(",", "."));

        if (alcool < 0.7 * gasolina) {
            lblResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/ponteiro alcool.png")));
        } else {
            lblResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/ponteiro gasolina.png")));
        }

    }

    public void limpar() {
        txtGasolina.setText("0");
        txtAlcool.setText("0");
        lblResultado.setText("0");
	lblResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/sem ponteiro.jpg")));

    }

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    public CalculadoraFlex() {
        initComponents();
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
        txtAlcool = new javax.swing.JTextField();
        txtGasolina = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblResultados = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();

        setTitle("Álcool x Gasolina");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/2.jpg"))); // NOI18N

        txtAlcool.setText("0");
        txtAlcool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlcoolActionPerformed(evt);
            }
        });

        txtGasolina.setText("0");
        txtGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGasolinaActionPerformed(evt);
            }
        });

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/3031_64x64.png"))); // NOI18N
        btnCalcular.setToolTipText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/limpar.png"))); // NOI18N
        btnLimpar.setToolTipText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel2.setText("ÁLCOOL");

        jLabel3.setText("GASOLINA");

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/sem ponteiro.jpg"))); // NOI18N

        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/senac/icones/sair.png"))); // NOI18N
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2))
                            .addComponent(txtAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(btnCalcular)
                            .addGap(33, 33, 33)
                            .addComponent(btnLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsair))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(lblResultado)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(433, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGasolinaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Chamando o botão Limpar
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtAlcoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlcoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlcoolActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Chamando o método calcular
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        // TODO add your handling code here:
        sair();
    }//GEN-LAST:event_btnsairActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFlex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnsair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JTextField txtAlcool;
    private javax.swing.JTextField txtGasolina;
    // End of variables declaration//GEN-END:variables
}
