/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Bonus;

import Negocio.Pessoas.Client;
/**
 *
 * @author filipe
 */
public class Bonus_Cliente extends javax.swing.JFrame {
    int xMouse, yMouse;

    /**
     * Creates new form Bonus
     */
    public Bonus_Cliente() {
        initComponents();
    }
    
    public Bonus_Cliente(Client c1) {
        initComponents();
        text_valBonus.setText(Float.toString(c1.Buscar_myBonus().getValue()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        label_nomeRestaurante = new javax.swing.JLabel();
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        label_iconBonus = new javax.swing.JLabel();
        label_bonus = new javax.swing.JLabel();
        label_bonus1 = new javax.swing.JLabel();
        text_valBonus = new javax.swing.JTextField();
        label_sair1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(70, 0, 110));

        label_nomeRestaurante.setBackground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_nomeRestaurante.setForeground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setText("Restaurante Lombinho de Porco II");
        label_nomeRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        barra_ferramentas.setBackground(new java.awt.Color(255, 255, 255));
        barra_ferramentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseDragged(evt);
            }
        });
        barra_ferramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_ferramentasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseReleased(evt);
            }
        });

        panel_fechar.setBackground(new java.awt.Color(255, 255, 255));
        panel_fechar.setPreferredSize(new java.awt.Dimension(30, 30));

        label_fechar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_fechar.setText("X");
        label_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_fecharLayout = new javax.swing.GroupLayout(panel_fechar);
        panel_fechar.setLayout(panel_fecharLayout);
        panel_fecharLayout.setHorizontalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fecharLayout.createSequentialGroup()
                .addComponent(label_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fecharLayout.setVerticalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_minimizar.setBackground(new java.awt.Color(255, 255, 255));

        label_minimizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimizar.setText("-");

        javax.swing.GroupLayout panel_minimizarLayout = new javax.swing.GroupLayout(panel_minimizar);
        panel_minimizar.setLayout(panel_minimizarLayout);
        panel_minimizarLayout.setHorizontalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra_ferramentasLayout = new javax.swing.GroupLayout(barra_ferramentas);
        barra_ferramentas.setLayout(barra_ferramentasLayout);
        barra_ferramentasLayout.setHorizontalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_ferramentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_ferramentasLayout.setVerticalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        label_iconBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-presente-96.png"))); // NOI18N
        label_iconBonus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconBonusMouseClicked(evt);
            }
        });

        label_bonus.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_bonus.setForeground(new java.awt.Color(204, 204, 204));
        label_bonus.setText("Bônus");

        label_bonus1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_bonus1.setForeground(new java.awt.Color(204, 204, 204));
        label_bonus1.setText("Você possui um total de:");

        text_valBonus.setEditable(false);

        label_sair1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_sair1.setForeground(new java.awt.Color(222, 222, 222));
        label_sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-sair-35.png"))); // NOI18N
        label_sair1.setText("Sair");
        label_sair1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_sair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_sair1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_ferramentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_iconBonus)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(label_bonus))))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(label_nomeRestaurante))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_sair1)
                            .addComponent(label_bonus1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_valBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nomeRestaurante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(label_bonus))
                    .addComponent(label_iconBonus))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bonus1)
                    .addComponent(text_valBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_sair1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        Bonus_Cliente.this.dispose();
    }//GEN-LAST:event_label_fecharMouseClicked

    private void barra_ferramentasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_barra_ferramentasMouseDragged

    private void barra_ferramentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra_ferramentasMousePressed

    private void barra_ferramentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_barra_ferramentasMouseReleased

    private void label_iconBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconBonusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_iconBonusMouseClicked

    private void label_sair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sair1MouseClicked
        // TODO add your handling code here:
        Bonus_Cliente.this.dispose();
    }//GEN-LAST:event_label_sair1MouseClicked

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
            java.util.logging.Logger.getLogger(Bonus_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bonus_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bonus_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bonus_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bonus_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_bonus;
    private javax.swing.JLabel label_bonus1;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_iconBonus;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nomeRestaurante;
    private javax.swing.JLabel label_sair1;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JTextField text_valBonus;
    // End of variables declaration//GEN-END:variables
}
