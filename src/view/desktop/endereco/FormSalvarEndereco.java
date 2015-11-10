/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.desktop.endereco;

import View.desktop.usuario.FormUsuario;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.fachada.Fachada;
import projeto.modelo.Endereco;
import projeto.modelo.Usuario;

/**
 *
 * @author bboyrap
 */
public class FormSalvarEndereco extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormSalvarEndereço
     */
    private Usuario usuario;
    private Endereco endereco;

    
    FormSalvarEndereco(Usuario u){
        initComponents();
        this.usuario = u;
        this.endereco = new Endereco();
        this.endereco.setId(0);
        jLabelNomeUsuario.setText(usuario.getNome());
    }
    
    FormSalvarEndereco(Endereco e, Usuario u) {
        initComponents();
        this.usuario = u;
        this.endereco = e;
        
        jLabelNomeUsuario.setText(usuario.getNome() + String.valueOf(this.endereco.getId()));
        
        jTextFieldLogradouro.setText(this.endereco.getLogradouro());
        jFormattedTextFieldCep.setText(this.endereco.getCep());
        jTextFieldBairro.setText(this.endereco.getBairro());
        jTextFieldCidade.setText(this.endereco.getCidade());
        jComboBoxEstado.setSelectedItem(this.endereco.getEstado());
        jTextFieldNumero.setText(String.valueOf(this.endereco.getNumero()));
        jTextFieldComplemento.setText(this.endereco.getComplemento());
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel7.setText("logradouro");

        jLabel8.setText("cep");

        jLabel9.setText("bairro");

        jLabel10.setText("cidade");

        jLabel11.setText("estado");

        jLabel12.setText("número");

        jLabel13.setText("complemento");

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um estado...", "AC ", "AL ", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN ", "RS ", "RO ", "RR ", "SC ", "SP ", "SE ", "TO" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextFieldCep)
                    .addComponent(jTextFieldBairro)
                    .addComponent(jTextFieldCidade)
                    .addComponent(jTextFieldLogradouro)
                    .addComponent(jTextFieldNumero)
                    .addComponent(jTextFieldComplemento)
                    .addComponent(jComboBoxEstado, 0, 163, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        jLabel1.setText("nome");

        jLabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNomeUsuario.setText("nome do fulano");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNomeUsuario)))
        );

        jToolBar1.setRollover(true);

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.setFocusable(false);
        jButtonConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConfirmar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonConfirmar);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setFocusable(false);
        jButtonCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonCancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
            try {
                
                //fazer a busca por email do usuário e retornar o usuário que possui esse email.

                //atribuir esse endereco para esse usuario buscado
                Endereco endereco = new Endereco();
                endereco.setLogradouro(jTextFieldLogradouro.getText());
                endereco.setCep(jFormattedTextFieldCep.getText().replace("-", ""));
                endereco.setBairro(jTextFieldBairro.getText());
                endereco.setCidade(jTextFieldCidade.getText());
                endereco.setEstado(jComboBoxEstado.getSelectedItem().toString());
                endereco.setNumero(Integer.parseInt(jTextFieldNumero.getText()));
                endereco.setComplemento(jTextFieldComplemento.getText());

                endereco.setUsuario(this.usuario);

                Fachada fachada = new Fachada();
                if(this.endereco.getId() > 0){
                    endereco.setId(this.endereco.getId());
                    fachada.enderecoAlterar(endereco);
                }else{
                    fachada.enderecoCadastrar(endereco);
                }

                JOptionPane.showMessageDialog(null, "Endereco correspondente ao usuário salvo com sucesso!");

                
                
                FormEndereco fe = new FormEndereco(this.usuario);
                fe.setVisible(true);
                fe.buscarEndereco();
                this.getDesktopPane().add(fe);
                this.dispose();
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "CadastrarEndereco()");
            }
        

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        try {
            FormEndereco fe = new FormEndereco(this.usuario);
            fe.setVisible(true);
            this.getDesktopPane().add(fe);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido." + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
