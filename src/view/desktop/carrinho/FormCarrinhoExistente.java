/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desktop.carrinho;

import projeto.modelo.Carrinho;
import View.desktop.carrinho.FormCarrinho;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.fachada.Fachada;
import projeto.modelo.Produto;

/**
 *
 * @author ultrabook
 */
public class FormCarrinhoExistente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormNovoCarrinho
     */
private Carrinho carrinho;
private List<Produto> listaProdutos;
Fachada fachada = new Fachada();
    public FormCarrinhoExistente(Carrinho car) {
        this.carrinho = car;
        initComponents();
        jLabelFulano.setText(car.getUsuario().getNome());//nao to conseguindo colocar o nome do individuo na porra do label. wtf
        listarProdutosCarrinho();
    }
    
    private void listarProdutosCarrinho() {
        try {
            this.listaProdutos = this.fachada.carrinhoProdutos(this.carrinho.getId());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Produto, Valor"});
            if (listaProdutos.isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Usuário não possui carrinho.");
                JOptionPane.showMessageDialog(null, "Não existem produtos adicionados ao carrinho..");
            }
            for (Produto p : listaProdutos) {
                modelo.addRow(new String[]{p.getNome(), 
                        Double.toString(p.getValor())});
            }
            jTableProdutosCarrinho.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutosCarrinho = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonAdicionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonRemover = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonConcluir = new javax.swing.JButton();
        jLabelFulano = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("usuário:");

        jTableProdutosCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProdutosCarrinho);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonAdicionar.setText("Adicionar Produtos");
        jButtonAdicionar.setFocusable(false);
        jButtonAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdicionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAdicionar);
        jToolBar1.add(jSeparator1);

        jButtonRemover.setText("Remover Produto");
        jButtonRemover.setFocusable(false);
        jButtonRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonRemover);
        jToolBar1.add(jSeparator2);

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.setFocusable(false);
        jButtonConcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonConcluir);

        jLabelFulano.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelFulano.setText("fulano");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFulano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(702, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelFulano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1200, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        // TODO add your handling code here:
            FormCarrinho fc = new FormCarrinho(this.carrinho.getUsuario());
            fc.setVisible(true);
            getDesktopPane().add(fc);
            dispose();
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        try {
            FormAdicionarProdutos fap = new FormAdicionarProdutos(this.carrinho);
            fap.setVisible(true);
            getDesktopPane().add(fap);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFulano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTableProdutosCarrinho;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    
}
