/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.categoria;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import projeto.fachada.Fachada;
import projeto.modelo.Categoria;

/**
 *
 * @author bboyrap
 */
public class FormCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCategoria
     */
    private List<Categoria> lista;
    
    public FormCategoria(){
        initComponents();
        buscarCategorias();
    }
    
    public void buscarCategorias(){
        try {
            Fachada fachada = new Fachada();
            this.lista = fachada.categoriaBuscar();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"ID", "Nome", "Status"});
            if (lista.size() == 0) {
                JOptionPane.showMessageDialog(null, "Não existem categorias cadastradas.");
            }
            for (Categoria c : lista) {
                //System.out.println(c.getNome());
                modelo.addRow(new String[]{ Integer.toString(c.getId()), c.getNome(), Boolean.toString(c.isStatus())});
            }
            jTable1.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonInserir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonAlterar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonRemover = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();

        setTitle("Categoria");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonInserir.setText("Inserir Nova Categoria");
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

        jButtonAlterar.setText("Alterar Categoria Selecionada");
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

        jButtonRemover.setText("Remover Categoria Selecionada");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1200, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        
            // TODO add your handling code here:
            FormSalvarCategoria fsc = new FormSalvarCategoria();
            fsc.setVisible(true);
            getDesktopPane().add(fsc);
            dispose();
            //this.buscarCategorias();
        
        
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
        try {
            if (jTable1.getSelectedRow() != -1) {
                Categoria c = this.lista.get(jTable1.getSelectedRow());
                FormSalvarCategoria fsc = new FormSalvarCategoria(c);
                fsc.setVisible(true);
                getDesktopPane().add(fsc);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Favor selecionar uma linha.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
            try {
                if(jTable1.getSelectedRow() != -1){
                    Categoria c = this.lista.get(jTable1.getSelectedRow());
                    Fachada fachada = new Fachada();
                    fachada.categoriaRemover(c);
                    this.buscarCategorias();
                }else{
                    JOptionPane.showMessageDialog(null, "Favor selecionar uma linha.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
            }
            
        
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
