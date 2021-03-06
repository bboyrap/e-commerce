/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.categoria;

import javax.swing.JOptionPane;
import projeto.fachada.Fachada;
import projeto.modelo.Categoria;

/**
 *
 * @author bboyrap
 */
public class FormSalvarCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormSalvarCategoria
     */
    private int idCategoria;
    
    public FormSalvarCategoria() {
        this.idCategoria = 0;
        initComponents();
    }

    FormSalvarCategoria(Categoria c) {
        initComponents();
        this.idCategoria = c.getId();
        
        jTextFieldNome.setText(c.getNome());
        if (c.isStatus() == true) {
            jRadioButtonAtivo.isSelected();
        }else{
            jRadioButtonInativo.isSelected();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jRadioButtonAtivo = new javax.swing.JRadioButton();
        jRadioButtonInativo = new javax.swing.JRadioButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria"));

        jLabel1.setText("nome");

        jLabel2.setText("status");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyTyped(evt);
            }
        });

        buttonGroup1.add(jRadioButtonAtivo);
        jRadioButtonAtivo.setSelected(true);
        jRadioButtonAtivo.setText("Ativo");

        buttonGroup1.add(jRadioButtonInativo);
        jRadioButtonInativo.setText("Inativo");

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

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
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonAtivo)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonInativo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonAtivo)
                        .addComponent(jRadioButtonInativo)
                        .addComponent(jButtonCancelar))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 210, 305, 109);

        setBounds(0, 0, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
        try {
            Categoria categoria = new Categoria();
            if (this.idCategoria == 0) {
                categoria.setNome(jTextFieldNome.getText().toUpperCase());

                if(jRadioButtonAtivo.isSelected()){
                    categoria.setStatus(true);
                }else{
                    categoria.setStatus(false);
                }

                Fachada fachada = new Fachada();
                fachada.categoriaCadastrar(categoria);

                JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso!");
                

                FormCategoria fc = new FormCategoria();
                fc.setVisible(true);
                getDesktopPane().add(fc);
                dispose();
                fc.moveToFront();
            }else{
                categoria.setId(this.idCategoria);
                categoria.setNome(jTextFieldNome.getText().toUpperCase());

                if(jRadioButtonAtivo.isSelected()){
                    categoria.setStatus(true);
                }else{
                    categoria.setStatus(false);
                }

                Fachada fachada = new Fachada();
                fachada.categoriaAlterar(categoria);

                JOptionPane.showMessageDialog(null, "Categoria editada com sucesso!");
                

                FormCategoria fc = new FormCategoria();
                fc.setVisible(true);
                this.getDesktopPane().add(fc);
                this.dispose();
                fc.moveToFront();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        try {
            FormCategoria fc = new FormCategoria();
            fc.setVisible(true);
            this.getDesktopPane().add(fc);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyTyped
        // TODO add your handling code here:
        String caracteres="0987654321";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNomeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonAtivo;
    private javax.swing.JRadioButton jRadioButtonInativo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
