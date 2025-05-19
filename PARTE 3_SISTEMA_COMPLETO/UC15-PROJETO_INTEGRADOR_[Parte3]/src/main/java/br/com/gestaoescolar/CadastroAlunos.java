package br.com.gestaoescolar;

import dao.AlunoDAO;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modelo.Aluno;

public class CadastroAlunos extends javax.swing.JFrame {

    public CadastroAlunos() {
        initComponents();
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtNascimento = new javax.swing.JTextField();
        LabelCPF = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelNascimento = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        TxtMatricula = new javax.swing.JTextField();
        TxtCPF = new javax.swing.JTextField();
        BtnCadastrar = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO DE ALUNOS");

        TxtNascimento.setToolTipText("Formato esperado: YYYY-MM-DD");

        LabelCPF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelCPF.setText("CPF:");

        LabelNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelNome.setText("Nome:");

        LabelNascimento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelNascimento.setText("Data Nascimento:");

        labelMatricula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelMatricula.setText("Matrícula:");

        TxtCPF.setToolTipText("Formato: xxx.xxx.xxx-xx");

        BtnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnCadastrar.setForeground(new java.awt.Color(0, 102, 102));
        BtnCadastrar.setText("CADASTRAR");
        BtnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnInicio.setForeground(new java.awt.Color(0, 102, 102));
        BtnInicio.setText("INÍCIO");
        BtnInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        BtnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(0, 102, 102));
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(LabelNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNascimento, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(LabelNome))
                            .addComponent(TxtNome))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(LabelNascimento))
                        .addGap(28, 28, 28)
                        .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelCPF)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInicio)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnLimpar))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        TxtNome.setText("");
        TxtNascimento.setText("");
        TxtCPF.setText("");
        TxtMatricula.setText("");
    }


    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        new ListaAlunos().setVisible(true); // Abre a tela ListaAlunos
        this.dispose(); // Fecha a janela atual (opcional)
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        // TODO add your handling code here:

        try {
            String nome = TxtNome.getText();
            String nascimentoStr = TxtNascimento.getText(); // formato: yyyy-MM-dd
            String cpf = TxtCPF.getText();
            String matricula = TxtMatricula.getText();

            if (nome.isEmpty() || nascimentoStr.isEmpty() || cpf.isEmpty() || matricula.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setNascimento(LocalDate.parse(nascimentoStr)); // espera yyyy-MM-dd
            aluno.setCpf(cpf);
            aluno.setMatricula(matricula);

            AlunoDAO dao = new AlunoDAO();
            dao.cadastrar(aluno);

            JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar aluno: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed

        limparCampos();

    }//GEN-LAST:event_BtnLimparActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelNascimento;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JTextField TxtMatricula;
    private javax.swing.JTextField TxtNascimento;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelMatricula;
    // End of variables declaration//GEN-END:variables
}
