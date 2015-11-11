/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop;

import View.desktop.usuario.*;
import View.desktop.categoria.*;
import View.desktop.funcionario.*;
import View.desktop.produto.*;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.fachada.Fachada;
import projeto.modelo.Carrinho;
import projeto.modelo.Funcionario;

/**
 *
 * @author bboyrap
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */

    private Funcionario funcionario;
    public FormPrincipal(Funcionario funcionario) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.funcionario = funcionario;
        
        Image image = new ImageIcon(this.getClass().getResource("/material/icone.png")).getImage();
        this.setIconImage(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemCategoria = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemOs = new javax.swing.JMenuItem();
        jMenuItemEntrega = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemLimpar = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(0, 0));

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/MenuPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenuMenu.setText("Menu");

        jMenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Usuario.png"))); // NOI18N
        jMenuItemUsuario.setText("Usuário");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemUsuario);

        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Funcionario.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemFuncionario);

        jMenuItemCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Categoria.png"))); // NOI18N
        jMenuItemCategoria.setText("Categoria");
        jMenuItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriaActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemCategoria);

        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Produto.png"))); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemProduto);

        jMenuItemOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Os.png"))); // NOI18N
        jMenuItemOs.setText("Os");
        jMenuMenu.add(jMenuItemOs);

        jMenuItemEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Entrega.png"))); // NOI18N
        jMenuItemEntrega.setText("Entrega");
        jMenuMenu.add(jMenuItemEntrega);

        jMenuBar1.add(jMenuMenu);

        jMenuOpcoes.setText("Opções");

        jMenuItemLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Limpar.png"))); // NOI18N
        jMenuItemLimpar.setText("Limpar Tela");
        jMenuItemLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLimparActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemLimpar);

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Sair.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemSair);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLimparActionPerformed
        // TODO add your handling code here:
        this.limparTelas();
    }//GEN-LAST:event_jMenuItemLimparActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        // TODO add your handling code here:
        //this.limparTelas();
        FormProduto fp = new FormProduto();
        fp.setVisible(true);
        this.jDesktopPane1.add(fp);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriaActionPerformed
        // TODO add your handling code here:
        //this.limparTelas();
        FormCategoria fc = new FormCategoria();
        fc.setVisible(true);
        this.jDesktopPane1.add(fc);
    }//GEN-LAST:event_jMenuItemCategoriaActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        // TODO add your handling code here:
        //this.limparTelas();
        FormFuncionario ff = new FormFuncionario(this.funcionario);
        ff.setVisible(true);
        this.jDesktopPane1.add(ff);
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        // TODO add your handling code here:
        //this.limparTelas();
        FormUsuario fu = new FormUsuario();
        fu.setVisible(true);
        this.jDesktopPane1.add(fu);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    public void limparTelas(){
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCategoria;
    private javax.swing.JMenuItem jMenuItemEntrega;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemLimpar;
    private javax.swing.JMenuItem jMenuItemOs;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenu jMenuOpcoes;
    // End of variables declaration//GEN-END:variables
}
