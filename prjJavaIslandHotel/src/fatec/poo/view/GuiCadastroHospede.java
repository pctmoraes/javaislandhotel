package fatec.poo.view;
import fatec.poo.model.Hospede;
import fatec.poo.model.Pessoa;
import java.text.DecimalFormat;
import java.util.ArrayList;

//@author paula.moraes

public class GuiCadastroHospede extends javax.swing.JFrame {

    //Creates new form GuiCadastroHospede
     
    public GuiCadastroHospede(ArrayList<Pessoa> c) {
        initComponents();
        cadastro = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngpSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTxDesconto = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rdbFem = new javax.swing.JRadioButton();
        rdbMasc = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Hóspede");

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Telefone");

        jLabel5.setText("Taxa Desconto (%)");

        txtTxDesconto.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtNome.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        btngpSexo.add(rdbFem);
        rdbFem.setText("Feminino");

        btngpSexo.add(rdbMasc);
        rdbMasc.setText("Masculino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbFem)
                    .addComponent(rdbMasc))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rdbFem)
                .addGap(18, 18, 18)
                .addComponent(rdbMasc)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(txtTxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btnInserir)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTxDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        //DecimalFormat df = new DecimalFormat("##0.00");
        int i;
        for (i = 0; i < cadastro.size(); i++)
        {
            if (cadastro.get(i) instanceof Hospede){
                if (((Hospede)cadastro.get(i)).getCpf().equals(txtCPF.getText())){
                    break;
                }
            }   
        }
        
        if (i < cadastro.size())
        {
           posHospede = i; 
        }else
        {
           posHospede = -1;
        }
        
        if (posHospede >= 0)
        {
            txtCPF.setText(((Hospede)cadastro.get(posHospede)).getCpf());
            txtNome.setText(cadastro.get(posHospede).getNome());
            txtEndereco.setText(cadastro.get(posHospede).getEndereco());
            txtTelefone.setText(cadastro.get(posHospede).getTelefone());
            txtTxDesconto.setText(String.valueOf(((Hospede)cadastro.get(posHospede)).getTxDesconto()));
            if (((Hospede)cadastro.get(posHospede)).getSexo() == "F"){
                rdbFem.setEnabled(true);
                rdbFem.setSelected(true);
            }else{
                rdbMasc.setEnabled(true);
                rdbMasc.setSelected(true);
            }
            
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }else
        {
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtNome.requestFocus();
        }
        
        txtCPF.setEnabled(false);
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtTxDesconto.setEnabled(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        p = new Hospede(txtCPF.getText(), txtNome.getText());
        ((Hospede)p).setEndereco(txtEndereco.getText());
        ((Hospede)p).setTelefone(txtTelefone.getText());
        ((Hospede)p).setTxDesconto(Double.parseDouble(txtTxDesconto.getText()));
        if (rdbFem.isSelected()){
            ((Hospede)p).setSexo("F");
        }else{
            ((Hospede)p).setSexo("M");
        }
        cadastro.add(p);
        
        txtCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        txtTxDesconto.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTxDesconto.setEnabled(false);
        txtCPF.requestFocus();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtCPF.setEnabled(false);
        txtNome.setEnabled(false);
        cadastro.get(posHospede).setEndereco(txtEndereco.getText());
        cadastro.get(posHospede).setTelefone(txtTelefone.getText());
        ((Hospede)cadastro.get(posHospede)).setTxDesconto(Double.parseDouble(txtTxDesconto.getText()));
        
        if (rdbFem.isSelected()){
            ((Hospede)cadastro.get(posHospede)).setSexo("F");
        }else{
            ((Hospede)cadastro.get(posHospede)).setSexo("M");
        }
        
        txtCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        txtTxDesconto.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTxDesconto.setEnabled(false);
        txtCPF.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posHospede >= 0){
            cadastro.remove(posHospede);
            posHospede = -1;
        }
        
        txtCPF.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtTelefone.setText(null);
        txtTxDesconto.setText(null);
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTxDesconto.setEnabled(false);
        txtCPF.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup btngpSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdbFem;
    private javax.swing.JRadioButton rdbMasc;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTxDesconto;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Pessoa> cadastro;
    private Pessoa p = null;
    private int posHospede;
}
