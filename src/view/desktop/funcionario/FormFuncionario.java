/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.funcionario;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.fachada.Fachada;
import projeto.modelo.Funcionario;

/**
 *
 * @author bboyrap
 */
public class FormFuncionario extends javax.swing.JInternalFrame {
    

    /**
     * Creates new form FormFuncionario
     */
    private List<Funcionario> lista;
    public FormFuncionario() {
        initComponents();
        buscarFuncionario();
    }
    public void buscarFuncionario(){
        try {
            Fachada fachada = new Fachada();
            this.lista = fachada.funcionarioBuscar();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Nome", "Matricula", "Cargo", "Status"});
            System.out.println("01");// <<<=======================================================================
            if (this.lista.isEmpty()) {
                System.out.println("xx");// <<<=======================================================================
                JOptionPane.showMessageDialog(null, "Não existem funcionários cadastrados.");
            }
            System.out.println("02");// <<<=======================================================================
            for (Funcionario f : this.lista) {
                System.out.println("03");// <<<=======================================================================
                //System.out.println(c.getNome());
                
                modelo.addRow(new String[]{ f.getNome(), Integer.toString(f.getMatricula()), f.getCargo(), Boolean.toString(f.isStatus())});
            }
            System.out.println("yy");// <<<=======================================================================
            
            jTable1.setModel(modelo);
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
        jButtonSair = new javax.swing.JButton();

        setTitle("Funcionário");
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionários"));

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(170, 60, 464, 390);

        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/adicionar24.png"))); // NOI18N
        jButtonInserir.setText("Inserir Novo Funcionario");
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

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/alterar.png"))); // NOI18N
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

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/remover24.png"))); // NOI18N
        jButtonRemover.setText("Remover Usuario Selecionado");
        jButtonRemover.setFocusable(false);
        jButtonRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonRemover);
        jToolBar1.add(jSeparator3);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/material/cancelar24.png"))); // NOI18N
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
        jToolBar1.setBounds(170, 450, 464, 70);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirActionPerformed
        // TODO add your handling code here:
        FormSalvarFuncionario fsf = new FormSalvarFuncionario();
        fsf.setVisible(true);
        this.getDesktopPane().add(fsf);
        this.dispose();
    }//GEN-LAST:event_jButtonInserirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        Funcionario f = this.lista.get(jTable1.getSelectedRow());
        FormEditarFuncionario fef = new FormEditarFuncionario(f);
        fef.setVisible(true);
        this.getDesktopPane().add(fef);
        this.dispose();
    }//GEN-LAST:event_jButtonAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
