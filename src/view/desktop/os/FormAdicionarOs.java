/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.desktop.os;

import Outras.GerarPdf;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.fachada.Fachada;
import projeto.modelo.Carrinho;
import projeto.modelo.Endereco;
import projeto.modelo.Entrega;
import projeto.modelo.Funcionario;
import projeto.modelo.Os;

/**
 *
 * @author bboyrap
 */
public class FormAdicionarOs extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormOs
     */
    private Carrinho carrinho;
    private List<Endereco> listaEndereco;
    private List<Funcionario> listaFuncionario;
    Fachada fachada = new Fachada();
    public FormAdicionarOs(Carrinho c) {
        initComponents();
        this.carrinho = c;
    }
    
    public void buscarEndereco(){
        try {
            this.listaEndereco = this.fachada.enderecoBuscar(this.carrinho.getUsuario().getId());
            if (listaEndereco.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Usuário não possui endereços associados, favor inserir um endereço primeiro.");
                dispose();
            }else{
                for (Endereco e : listaEndereco) {
                    jComboBoxLogradouro.addItem(e.getLogradouro());
                    jComboBoxLogradouro.setSelectedIndex(e.getId());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void buscarFuncionario(){
        try {
            this.listaFuncionario = this.fachada.funcionarioEntregador();
            if (listaEndereco.size() == 0) {
                JOptionPane.showMessageDialog(null, "Não existem entregadores cadastrados.");
                dispose();
            }else{
                for (Funcionario f : listaFuncionario) {
                    jComboBoxEntregador.addItem(f.getNome());
                    jComboBoxEntregador.setSelectedIndex(f.getId());
                }
            }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxLogradouro = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEntregador = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Carrinho do usuário:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("fulano");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Selecionar endereço:");

        jComboBoxLogradouro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jComboBoxLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informe o logradouro..." }));
        jComboBoxLogradouro.setToolTipText("Selecione o logradouro para entrega");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Selecionar entregador:");

        jComboBoxEntregador.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jComboBoxEntregador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informe o nome..." }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setToolTipText("");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEntregador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxLogradouro)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Grava a os no sistema e depois gera o pdf.
        try{
            Os os = new Os();
            Entrega entrega = new Entrega();
            //Os
            os.setCarrinho(this.carrinho);

            //Entrega
            entrega.setOs(os);
            //Endereco
            Endereco e = this.listaEndereco.get(jComboBoxEntregador.getSelectedIndex());
            Funcionario f = this.listaFuncionario.get(jComboBoxEntregador.getSelectedIndex());
            entrega.setEndereco(e);
            entrega.setFuncionario(f);
            entrega.setStatus(true);
            entrega.setOs(os);

            //Ordem de serviços
            os.setEntrega(entrega);

            this.fachada.osCadastrar(os);
            
            JOptionPane.showMessageDialog(null, "Ordem de serviço cadastrada no sistema.");
            
            //gerar pdf da ordem
            GerarPdf pdf = new GerarPdf(os);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro desconhecido:\n" + e.getMessage(), "Contate o suporte", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxEntregador;
    private javax.swing.JComboBox jComboBoxLogradouro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
