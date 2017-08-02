/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jogo.cartas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Sorteio de Cartas
 * @author Aldivan Oliveira
 */
public class SortearCarta extends javax.swing.JFrame {
    public void sortear(){
        String[] naipes = {"Espadas" , "Paus" , "Copas" , "Ouros"};
      String [] faces = {"AZ" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9", "10" , "J" , "Q" , "K"};
      
      // a linha cria um objeto chamado sorteio usando como modelo a classe Random
      Random sorteio = new Random();
      
      // a linha abaixo faz o sortei do índice dos naipes, usando o objetos sortei que atribui o resultado a variável índice_naipes
      // o número 4 gera números aleatórios no intervalo de 0 a 3
     int indice_naipes = sorteio.nextInt(4); 
     
     // a linha abaixo faz o sortei do índice das faces, usando o objetos sorteio que atribui o resultado a variável índice_faces
     // o .length gera números aleatórios no intervalo do tamanho total do array
     int indice_faces = sorteio.nextInt(faces.length);
     
     // as linhas abaixo atribuem o resultado do sorteio ao array correspondente
     String face = faces[indice_faces];
     String naipe = naipes[indice_naipes];
     
     
     // a linha abaixo exibe a carta sorteada
        if (naipe == "Espadas" && face == "AZ" ) {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/A.2.png")));
            
        } else if (naipe == "Espadas" && face == "2") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/2.2.png")));
            
        } else if (naipe == "Espadas" && face == "3") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/3.2.png")));
            
        } else if (naipe == "Espadas" && face == "4") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/4.2.png")));
            
        } else if (naipe == "Espadas" && face == "5") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/5.2.png")));
            
        } else if (naipe == "Espadas" && face == "6") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/6.2.png")));
            
        } else if (naipe == "Espadas" && face == "7") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/7.2.png")));
            
        } else if (naipe == "Espadas" && face == "8") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/8.2.png")));
            
        } else if (naipe == "Espadas" && face == "9") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/9.2.png")));
            
        } else if (naipe == "Espadas" && face == "10") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/10.2.png")));
            
        } else if (naipe == "Espadas" && face == "J") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/J.2.png")));
            
        } else if (naipe == "Espadas" && face == "Q") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/Q.2.png")));
            
        } else if (naipe == "Espadas" && face == "K") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/K.2.png")));
            
        } else if (naipe == "Paus" && face== "AZ") {
            lblResultado.setIcon (new javax.swing.ImageIcon(getClass().getResource("br/com/jogo/icones/A.1.png"))); 
            
        } else if (naipe == "Paus" && face == "2") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/2.1.png")));
            
        } else if (naipe == "Paus" && face == "3") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/3.1.png")));
            
        } else if (naipe == "Paus" && face == "4") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/4.1.png")));
            
        } else if (naipe == "Paus" && face == "5") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/5.1.png")));
            
        } else if (naipe == "Paus" && face == "6") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/6.1.png")));
            
        } else if (naipe == "Paus" && face == "7") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/7.1.png")));
            
        } else if (naipe == "Paus" && face == "8") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/8.1.png")));
            
        } else if (naipe == "Paus" && face == "9") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/9.1.png")));
            
        } else if (naipe == "Paus" && face == "10") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/10.1.png")));
            
        } else if (naipe == "Paus" && face == "J") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/J.1.png")));
            
        } else if (naipe == "Paus" && face == "Q") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/Q.1.png")));
            
        } else if (naipe == "Paus" && face == "K") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/K.1.png")));
            
        } else if (naipe == "Copas" && face== "AZ") {
            lblResultado.setIcon (new javax.swing.ImageIcon(getClass().getResource("br/com/jogo/icones/A.3.png"))); 
            
        } else if (naipe == "Copas" && face == "2") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/2.3.png")));
            
        } else if (naipe == "Copas" && face == "3") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/3.3.png")));
            
        } else if (naipe == "Copas" && face == "4") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/4.3.png")));
            
        } else if (naipe == "Copas" && face == "5") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/5.3.png")));
            
        } else if (naipe == "Copas" && face == "6") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/6.3.png")));
            
        } else if (naipe == "Copas" && face == "7") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/7.3.png")));
            
        } else if (naipe == "Copas" && face == "8") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/8.3.png")));
            
        } else if (naipe == "Copas" && face == "9") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/9.3.png")));
            
        } else if (naipe == "Copas" && face == "10") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/10.3.png")));
            
        } else if (naipe == "Copas" && face == "J") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/J.3.png")));
            
        } else if (naipe == "Copas" && face == "Q") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/Q.3.png")));
            
        } else if (naipe == "Copas" && face == "K") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/K.3.png")));
            
        } else if (naipe == "Ouros" && face== "AZ") {
            lblResultado.setIcon (new javax.swing.ImageIcon(getClass().getResource("br/com/jogo/icones/A.4.png"))); 
            
        } else if (naipe == "Ouros" && face == "2") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/2.4.png")));
            
        } else if (naipe == "Ouros" && face == "3") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/3.4.png")));
            
        } else if (naipe == "Ouros" && face == "4") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/4.4.png")));
            
        } else if (naipe == "Ouros" && face == "5") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/5.4.png")));
            
        } else if (naipe == "Ouros" && face == "6") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/6.4.png")));
            
        } else if (naipe == "Ouros" && face == "7") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/7.4.png")));
            
        } else if (naipe == "Ouros" && face == "8") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/8.4.png")));
            
        } else if (naipe == "Ouros" && face == "9") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/9.4.png")));
            
        } else if (naipe == "Ouros" && face == "10") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/10.4.png")));
            
        } else if (naipe == "Ouros" && face == "J") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/J.4.png")));
            
        } else if (naipe == "Ouros" && face == "Q") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/Q.4.png")));
            
        } else if (naipe == "Ouros" && face == "K") {
            lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/K.4.png")));  
        } 
      
    }

    public SortearCarta() {
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
        btnSortear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setText("Clique para sortear uma carta:");

        btnSortear.setText("$|$|$|$|$|$|$|$");
        btnSortear.setToolTipText("Sortear");
        btnSortear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        jLabel2.setText("Carta sorteada:");

        lblResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/sortear_carta.jpg"))); // NOI18N
        lblResultado.setToolTipText("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jogo/icones/sair.png"))); // NOI18N
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultado)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSortear)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        //Chamando métodos sortear();
        sortear();
    }//GEN-LAST:event_btnSortearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
	int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
	}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SortearCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortearCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortearCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortearCarta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortearCarta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}
