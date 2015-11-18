/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desktop.carrinho;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.fachada.Fachada;
import projeto.modelo.Carrinho;
import projeto.modelo.Produto;
import projeto.modelo.Usuario;

/**
 *
 * @author bboyrap
 */
public class FormAdicionarProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormAdicionarProdutos
     */
    private List<Produto> listaProdutos;
    private List<Produto> listaProdutosAdicionados;
    private Carrinho carrinho;
    Fachada fachada = new Fachada();

    FormAdicionarProdutos(Carrinho carrinho) {
        this.carrinho = carrinho;
        initComponents();
        buscarProdutos();
    }
    public void buscarProdutos(){
        try {
            
            this.listaProdutos = this.fachada.produtoBuscar();
            
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Valor", "Status"});
            
            if (listaProdutos.size() == 0) {
            
                JOptionPane.showMessageDialog(null, "Não existem produtos cadastrados, favor inserir produtos primeiro.");
                dispose();
            }
            for(Produto p : listaProdutos){
                //System.out.println(p.getNome());
            
                modelo.addRow(new String[]{ Integer.toString(p.getId()), p.getNome(), Float.toString(p.getValor()), Boolean.toString(p.isStatus())});
            }
            jTableProdutos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void listarProdutosAdicionados(){
        Produto p = this.listaProdutos.get(jTableProdutos.getSelectedRow());
        
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutosAdicionados.getModel();
        
        modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Valor", "Status"});
        
        modelo.addRow(new String[]{Integer.toString(p.getId()), p.getNome(), Float.toString(p.getValor()), Boolean.toString(p.isStatus())});
        
        jTableProdutosAdicionados.setModel(modelo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProdutosAdicionados = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 650));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProdutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Adicionados"));

        jTableProdutosAdicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableProdutosAdicionados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonAdicionar.setText("<html>\n<center>adicionar</center>\n<center>ao carrinho</center><html>\n\n\n\n");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("<html>\n<center>remover</center>\n<center>do carrinho</center><html>\n\n\n\n");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConcluir)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCancelar))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1200, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        FormCarrinhoExistente fce = new FormCarrinhoExistente(this.carrinho);
        fce.setVisible(true);
        getDesktopPane().add(fce);
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        listarProdutosAdicionados();
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTableProdutosAdicionados.getModel();
        if (jTableProdutosAdicionados.getSelectedRow() != -1) {
            dtm.removeRow(jTableProdutosAdicionados.getSelectedRow());
            jTableProdutosAdicionados.setModel(dtm);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha.");
        }
        
        /*
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRow() >= 0){
            dtm.removeRow(jTable1.getSelectedRow());
            jTable1.setModel(dtm);
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }

        -------------------------------------------------------------------------
        if (JTabela.getSelectedRow() != -1 ) {  
                
              dtm = (DefaulltTableModel) JTabela.getModel();  
              dtm.removeRow (JTabela.getSelectedRow());    
                          
                  } 
        */
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        // TODO add your handling code here:
        //ler todas as linhas da jtable > adicionados e para cada linha inserir no produto.carrrinhos
        try{
            if (jTableProdutosAdicionados.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Favor Selecionar Produtos para adicionar.");
            }else{
                Produto produto = new Produto();
                for (int i = 0; i < jTableProdutosAdicionados.getRowCount(); i++) {
                    JOptionPane.showMessageDialog(null, "entrou 01");
                    Object o = jTableProdutosAdicionados.getValueAt(i, 0);
                    JOptionPane.showMessageDialog(null, "entrou 02");
                    produto.setId(Integer.parseInt(o.toString()));
                    JOptionPane.showMessageDialog(null, "entrou 03");
                    this.listaProdutosAdicionados.add(produto);
                    JOptionPane.showMessageDialog(null, "entrou 04");
                }
                this.carrinho.setProdutos(listaProdutosAdicionados);
                this.fachada.carrinhoCadastrar(this.carrinho);
            
                FormCarrinhoExistente fce = new FormCarrinhoExistente(this.carrinho);
                fce.setVisible(true);
                getDesktopPane().add(fce);
                dispose();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButtonConcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTable jTableProdutosAdicionados;
    // End of variables declaration//GEN-END:variables
}
