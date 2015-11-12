/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.carrinho;

import View.desktop.usuario.FormUsuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.fachada.Fachada;
import projeto.modelo.Carrinho;
import projeto.modelo.Os;
import projeto.modelo.Usuario;
import view.desktop.carrinho.FormCarrinhoExistente;
import view.desktop.os.FormAdicionarOs;

/**
 *
 * @author bboyrap
 */
public class FormCarrinho extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCarrinho
     */
    private Usuario usuario;
    private List<Carrinho> lista;
    Fachada fachada = new Fachada();
    
    public FormCarrinho(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        listarCarrinhos();
    }
    
    public void listarCarrinhos(){
        
        try {
            this.lista = this.fachada.carrinhoListar(this.usuario.getId());
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"ID", "Quantidade de Itens", "Valor Total", "Status"});
            
            if (lista.isEmpty()) {
                //JOptionPane.showMessageDialog(null, "Usuário não possui carrinho.");
                JOptionPane.showMessageDialog(null, "Usuário não possui carrinho, favor pressionar o botão [realizar compra] para prosseguir.");
            }
            for (Carrinho c : lista) {
                modelo.addRow(new String[]{Integer.toString(c.getId()), Integer.toString(this.fachada.quantidadeItemTotal(c.getId())), Double.toString(this.fachada.valorTotalCarrinho(c.getId())), Boolean.toString(c.isStatus())});
            }
            jTableCarrinho.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
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

        jToolBar1 = new javax.swing.JToolBar();
        jButtonComprar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonFinalizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarrinho = new javax.swing.JTable();

        setTitle("Carrinho");
        setPreferredSize(new java.awt.Dimension(1200, 650));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonComprar.setText("Realizar Compra");
        jButtonComprar.setFocusable(false);
        jButtonComprar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonComprar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonComprar);
        jToolBar1.add(jSeparator1);

        jButtonFinalizar.setText("Finalizar Carrinho");
        jButtonFinalizar.setFocusable(false);
        jButtonFinalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFinalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonFinalizar);
        jToolBar1.add(jSeparator2);

        jButtonSair.setText("Sair");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSair);

        jTableCarrinho.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinhos do cliente"));
        jTableCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCarrinho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        setBounds(0, 0, 1200, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        try {
            // TODO add your handling code here:
            //Se o carrinho existir e ainda estiver em aberto abre o carrinho para adcionar
            //produtos a ele...
            if (this.fachada.carrinhoExiste(this.usuario.getId())) {
                //confirm dialog pls
                int confirm = JOptionPane.showConfirmDialog(null, "Existe um carrinho em andamento, deseja abri-lo?");
                if (confirm == 0){
                    Carrinho carrinho = this.fachada.getCarrinho(this.usuario.getId());
                    carrinho.setUsuario(this.usuario);
                    FormCarrinhoExistente fce = new FormCarrinhoExistente(carrinho, this.usuario);
                    fce.setVisible(true);
                    getDesktopPane().add(fce);
                    dispose();
                }
            }else{
                
                Carrinho carrinho = new Carrinho();
                carrinho.setStatus(true);
                carrinho.setUsuario(this.usuario);
                this.fachada.carrinhoCadastrar(carrinho);
                
                
                //para pegar o carrinho criado
                carrinho = this.fachada.getCarrinho(this.usuario.getId());
                carrinho.setUsuario(this.usuario);
                FormCarrinhoExistente fce = new FormCarrinhoExistente(carrinho, this.usuario);
                fce.setVisible(true);
                getDesktopPane().add(fce);
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
            try {
                if(jTableCarrinho.getSelectedRow() != -1){
                    Carrinho c = this.lista.get(jTableCarrinho.getSelectedRow());
                    JOptionPane.showMessageDialog(null, c.getId());
                    c.setStatus(false);
                    this.fachada.carrinhoAlterar(c);
                    
                    FormAdicionarOs fo = new FormAdicionarOs(c);
                    fo.setVisible(true);
                    getDesktopPane().add(fo);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Favor selecionar uma linha.");
                }		
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        try {
            FormUsuario fu = new FormUsuario();
            fu.setVisible(true);
            this.getDesktopPane().add(fu);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTableCarrinho;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
