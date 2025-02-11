/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Conta;

import Negocio.Estruturas.Kitchen;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Order;
import Negocio.Servicos.Order_Item;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author filipe
 */
public class Cozinha extends javax.swing.JFrame {
    int xMouse, yMouse;
    Kitchen cozinha = new Kitchen();
    //Botao de verificacao de estado da tabela
    //false - tabela de pedidos apresenta todos os pedidos
    //true - tabela de pedidos apresenta pedidos abertos apenas
    boolean show_opened = false;    

    /**
     * Creates new form Bonus
     */
    public Cozinha() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) table_pedidos.getModel();
        table_pedidos.setRowSorter(new TableRowSorter(modelo));
        Carregar_Tabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_cardapio1 = new javax.swing.JLabel();
        divisor2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        label_nomeRestaurante = new javax.swing.JLabel();
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_items = new javax.swing.JTable();
        label_pedidos = new javax.swing.JLabel();
        label_items = new javax.swing.JLabel();
        divisor1 = new javax.swing.JPanel();
        icon_cozinha = new javax.swing.JLabel();
        label_cozinha = new javax.swing.JLabel();
        button_fechar = new javax.swing.JButton();
        label_orderselected = new javax.swing.JLabel();
        label_cliente = new javax.swing.JLabel();
        label_pedidoid = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        text_cliente = new javax.swing.JTextField();
        text_Status = new javax.swing.JTextField();
        button_abertos1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_pedidos = new javax.swing.JTable();

        label_cardapio1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_cardapio1.setForeground(new java.awt.Color(204, 204, 204));
        label_cardapio1.setText("Cardápio");

        javax.swing.GroupLayout divisor2Layout = new javax.swing.GroupLayout(divisor2);
        divisor2.setLayout(divisor2Layout);
        divisor2Layout.setHorizontalGroup(
            divisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        divisor2Layout.setVerticalGroup(
            divisor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-select-name-25.png"))); // NOI18N
        jButton2.setText("Pedidos Abertos");
        jButton2.setToolTipText("");

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

        table_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "qntd"
            }
        ));
        jScrollPane2.setViewportView(table_items);

        label_pedidos.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        label_pedidos.setForeground(new java.awt.Color(204, 204, 204));
        label_pedidos.setText("Pedidos :");

        label_items.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        label_items.setForeground(new java.awt.Color(204, 204, 204));
        label_items.setText("Items do Pedido :");

        javax.swing.GroupLayout divisor1Layout = new javax.swing.GroupLayout(divisor1);
        divisor1.setLayout(divisor1Layout);
        divisor1Layout.setHorizontalGroup(
            divisor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        divisor1Layout.setVerticalGroup(
            divisor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        icon_cozinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-fogão-a-gás-96.png"))); // NOI18N

        label_cozinha.setFont(new java.awt.Font("Ubuntu Light", 1, 36)); // NOI18N
        label_cozinha.setForeground(new java.awt.Color(204, 204, 204));
        label_cozinha.setText("Cozinha");

        button_fechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_fechar.setForeground(new java.awt.Color(102, 51, 255));
        button_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-login-arredondado-à-direita-25.png"))); // NOI18N
        button_fechar.setText("Fechar Pedido");
        button_fechar.setToolTipText("");
        button_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_fecharActionPerformed(evt);
            }
        });

        label_orderselected.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        label_orderselected.setForeground(new java.awt.Color(204, 204, 204));
        label_orderselected.setText("Comanda Selecionada");

        label_cliente.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        label_cliente.setForeground(new java.awt.Color(204, 204, 204));
        label_cliente.setText("Cliente :");

        label_pedidoid.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        label_pedidoid.setForeground(new java.awt.Color(204, 204, 204));
        label_pedidoid.setText("Id :");

        label_status.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        label_status.setForeground(new java.awt.Color(204, 204, 204));
        label_status.setText("Status :");

        text_id.setEditable(false);
        text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idActionPerformed(evt);
            }
        });

        text_cliente.setEditable(false);

        text_Status.setEditable(false);

        button_abertos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_abertos1.setForeground(new java.awt.Color(102, 51, 255));
        button_abertos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-select-name-25.png"))); // NOI18N
        button_abertos1.setText("Pedidos Abertos");
        button_abertos1.setToolTipText("");
        button_abertos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_abertos1ActionPerformed(evt);
            }
        });

        table_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Valor", "Status"
            }
        ));
        table_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_pedidos);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_ferramentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_nomeRestaurante)
                .addGap(231, 231, 231))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(label_cliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_cliente))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(label_pedidoid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_id))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(label_status)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_Status))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_orderselected)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(icon_cozinha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_cozinha)))
                                .addGap(0, 48, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_fechar)
                        .addGap(79, 79, 79)))
                .addComponent(divisor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pedidos)
                            .addComponent(label_items))
                        .addGap(189, 189, 189))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(button_abertos1)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nomeRestaurante)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(label_pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_items)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(divisor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon_cozinha)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(label_cozinha)))
                        .addGap(122, 122, 122)
                        .addComponent(label_orderselected)
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_pedidoid)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_cliente)
                            .addComponent(text_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_status)
                            .addComponent(text_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(button_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(button_abertos1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        Cozinha.this.dispose();
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

    private void button_abertos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_abertos1ActionPerformed
        // TODO add your handling code here:
        if(!show_opened)
            show_opened = Carregar_Abertos();
        else{
            Carregar_Tabela();
            show_opened = false;
        }
        
    }//GEN-LAST:event_button_abertos1ActionPerformed

    private void button_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_fecharActionPerformed
        // TODO add your handling code here:
        if(text_Status.getText().equals("Opened")){
            Order pedido = new Order();
            pedido.setId(Integer.parseInt(text_id.getText()));
            pedido.setStatus("Closed");
            pedido.Atualizar();
            JOptionPane.showMessageDialog(null, "Comanda fechada - pedido concluido");
            //Atualizando campos da tela
            DefaultTableModel modelo = (DefaultTableModel) table_items.getModel();
            modelo.setNumRows(0);
            Carregar_Tabela();
        }
        else{
            JOptionPane.showMessageDialog(null, "O pedido já está pronto");
        }
        text_id.setText("");
        text_cliente.setText("");
        text_Status.setText("");
    }//GEN-LAST:event_button_fecharActionPerformed

    private void text_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idActionPerformed

    private void table_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pedidosMouseClicked
        // TODO add your handling code here:
        if(table_pedidos.getSelectedRow() != -1){
            text_id.setText(table_pedidos.getValueAt(table_pedidos.getSelectedRow(), 0).toString());
            text_cliente.setText(table_pedidos.getValueAt(table_pedidos.getSelectedRow(), 1).toString());
            text_Status.setText(table_pedidos.getValueAt(table_pedidos.getSelectedRow(), 3).toString());
            
            Order pedido = new Order();
            pedido.setId(Integer.parseInt(text_id.getText()));
            Carregar_Tabela(pedido);
        }
    }//GEN-LAST:event_table_pedidosMouseClicked
    public boolean Carregar_Abertos(){
        
        DefaultTableModel modelo = (DefaultTableModel) table_pedidos.getModel();
        modelo.setNumRows(0);
        DefaultTableModel modelo1 = (DefaultTableModel) table_items.getModel();
        modelo1.setNumRows(0);
        
        
        for(Order pedido: cozinha.ComandasAbertas("Opened")){
            Client c1 = cozinha.ClientePedido(pedido.getId_conta());            
            modelo.addRow(new Object[]{
                pedido.getId(),
                c1.getName(),
                pedido.getValue(),
                pedido.getStatus(),
            });
        }
        return true;
    }
    
    public void Carregar_Tabela(){
        DefaultTableModel modelo = (DefaultTableModel) table_pedidos.getModel();
        modelo.setNumRows(0);

        for(Order pedido: cozinha.getComandas()){
            Client c1 = cozinha.ClientePedido(pedido.getId_conta());  
            modelo.addRow(new Object[]{
                pedido.getId(),
                c1.getName(),
                pedido.getValue(),
                pedido.getStatus(),
            });
        }
    }
    
    public void Carregar_Tabela(Order pedido){
        DefaultTableModel modelo = (DefaultTableModel) table_items.getModel();
        modelo.setNumRows(0);
        
        for(Order_Item item: cozinha.InfoPedido(pedido).ItensPedido()){
            modelo.addRow(new Object[]{
                item.getItem().getName(),
                item.getQuantity(),
                
            });
        }
    }
    
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
            java.util.logging.Logger.getLogger(Cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cozinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cozinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private javax.swing.JButton button_abertos1;
    private javax.swing.JButton button_fechar;
    private javax.swing.JPanel divisor1;
    private javax.swing.JPanel divisor2;
    private javax.swing.JLabel icon_cozinha;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_cardapio1;
    private javax.swing.JLabel label_cliente;
    private javax.swing.JLabel label_cozinha;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_items;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nomeRestaurante;
    private javax.swing.JLabel label_orderselected;
    private javax.swing.JLabel label_pedidoid;
    private javax.swing.JLabel label_pedidos;
    private javax.swing.JLabel label_status;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JTable table_items;
    private javax.swing.JTable table_pedidos;
    private javax.swing.JTextField text_Status;
    private javax.swing.JTextField text_cliente;
    private javax.swing.JTextField text_id;
    // End of variables declaration//GEN-END:variables
}
