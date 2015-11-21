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
                JOptionPane.showMessageDialog(null, "Usuário não possui carrinho.");
            }
            for (Carrinho c : lista) {
                modelo.addRow(new String[]{Integer.toString(c.getId()), 
                        //Integer.toString(this.fachada.quantidadeItemTotal(c.getId())), 
                        Integer.toString(c.getProdutos().size()), 
                        Double.toString(this.fachada.valorTotalCarrinho(c.getId())), 
                        Boolean.toString(c.isStatus())});
            }
            jTableCarrinho.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro primeiro catch:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCarrinho = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonComprar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonFinalizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();

        setTitle("Carrinho");
        setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Carrinhos do usuário"));
        jPanel1.setLayout(null);

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
        jScrollPane2.setViewportView(jTableCarrinho);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 420, 402);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 50, 440, 430);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
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

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(180, 490, 440, 50);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        try {
            // TODO add your handling code here:
            //Se o carrinho existir e ainda estiver em aberto abre o carrinho para adcionar
            //produtos a ele...
            if (this.fachada.carrinhoExiste(this.usuario.getId())) {
                //confirm dialog pls
                
                    Carrinho carrinho = this.fachada.getCarrinho(this.usuario.getId());//com erro
                    carrinho.setUsuario(this.usuario);
                    FormCarrinhoExistente fce = new FormCarrinhoExistente(carrinho);
                    fce.setVisible(true);
                    getDesktopPane().add(fce);
                    dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Não Existe um carrinho em andamento.");
                
                Carrinho carrinho = new Carrinho();
                carrinho.setStatus(true);
                carrinho.setUsuario(this.usuario);
                this.fachada.carrinhoCadastrar(carrinho);
                
                //para pegar o carrinho criado
                carrinho = this.fachada.getCarrinho(this.usuario.getId());
                //passou
                FormCarrinhoExistente fce = new FormCarrinhoExistente(carrinho);
                fce.setVisible(true);
                getDesktopPane().add(fce);
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro segundo catch:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
            try {
                if(jTableCarrinho.getSelectedRow() != -1){
                    Carrinho c = this.lista.get(jTableCarrinho.getSelectedRow());
                    //c.setStatus(false);
                    //this.fachada.carrinhoAlterar(c);
                    
                    FormAdicionarOs fo = new FormAdicionarOs(c);
                    fo.setVisible(true);
                    getDesktopPane().add(fo);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Favor selecionar uma linha.");
                }		
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro terceiro catch." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Erro quarto." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTable jTableCarrinho;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
