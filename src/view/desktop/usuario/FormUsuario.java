/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.usuario;

import View.desktop.carrinho.FormCarrinho;
import View.desktop.endereco.FormEndereco;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.fachada.Fachada;
import projeto.modelo.Usuario;

/**
 *
 * @author bboyrap
 */
public class FormUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormUsuario
     */
    public FormUsuario() {
        initComponents();
        buscarUsuarios();
    }
    
    private List<Usuario> lista;
    
    public void buscarUsuarios(){
        try {
            Fachada fachada = new Fachada();
            this.lista = fachada.usuarioBuscar();
                DefaultTableModel modelo = new DefaultTableModel();

                modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Email", "CPF", "Status"});

                if (lista.size() == 0) {

                    JOptionPane.showMessageDialog(null, "Não existem usuários cadastrados.");
                }
                for(Usuario u : lista){
                    //System.out.println(p.getNome());

                    modelo.addRow(new String[]{ Integer.toString(u.getId()), u.getNome(), u.getEmail(), u.getCpf(), Boolean.toString(u.isStatus())});
                }
                jTable1.setModel(modelo);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonInserir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonAlterar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonRemover = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonEnderecos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButtonCarrinho = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();

        setTitle("Usuário");
        setPreferredSize(new java.awt.Dimension(1200, 650));
        setVisible(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/plus sign1.png"))); // NOI18N
        jButtonInserir.setText("Inserir Novo Usuario");
        jButtonInserir.setFocusable(false);
        jButtonInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInserir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonInserir);
        jToolBar1.add(jSeparator1);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/exchange1.png"))); // NOI18N
        jButtonAlterar.setText("Alterar Usuario Selecionado");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAlterar);
        jToolBar1.add(jSeparator2);

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/delete25.png"))); // NOI18N
        jButtonRemover.setText("Remover Usuario Selecionado");
        jButtonRemover.setFocusable(false);
        jButtonRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonRemover);
        jToolBar1.add(jSeparator3);

        jButtonEnderecos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/situation.png"))); // NOI18N
        jButtonEnderecos.setText("Gerenciar Endereços");
        jButtonEnderecos.setFocusable(false);
        jButtonEnderecos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEnderecos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEnderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnderecosActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonEnderecos);
        jToolBar1.add(jSeparator4);

        jButtonCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Carrinho.png"))); // NOI18N
        jButtonCarrinho.setText("Gerenciar Carrinhos");
        jButtonCarrinho.setToolTipText("Irá mostrar a lista de carrinhos do usuário.");
        jButtonCarrinho.setFocusable(false);
        jButtonCarrinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCarrinho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrinhoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCarrinho);
        jToolBar1.add(jSeparator5);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/Logou.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(0, 0, 1200, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // TODO add your handling code here:
        try {
            FormSalvarUsuario fsu = new FormSalvarUsuario();
            fsu.setVisible(true);
            this.getDesktopPane().add(fsu);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
            Usuario u = this.lista.get(jTable1.getSelectedRow());
            FormEditarUsuario feu = new FormEditarUsuario(u);
            feu.setVisible(true);
            getDesktopPane().add(feu);
            dispose();

            
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        // TODO add your handling code here:
        try {
            Usuario u = this.lista.get(jTable1.getSelectedRow());
            Fachada fachada = new Fachada();
            fachada.usuarioRemover(u);
            buscarUsuarios();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonEnderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnderecosActionPerformed
        // TODO add your handling code here:
            Usuario u = this.lista.get(jTable1.getSelectedRow());
            FormEndereco fe = new FormEndereco(u);
            fe.setVisible(true);
            this.getDesktopPane().add(fe);
            this.dispose();
    }//GEN-LAST:event_jButtonEnderecosActionPerformed

    private void jButtonCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrinhoActionPerformed
        // TODO add your handling code here:
            Usuario u = this.lista.get(jTable1.getSelectedRow());
            FormCarrinho fc = new FormCarrinho(u);
            fc.setVisible(true);
            this.getDesktopPane().add(fc);
            this.dispose();
    }//GEN-LAST:event_jButtonCarrinhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCarrinho;
    private javax.swing.JButton jButtonEnderecos;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
