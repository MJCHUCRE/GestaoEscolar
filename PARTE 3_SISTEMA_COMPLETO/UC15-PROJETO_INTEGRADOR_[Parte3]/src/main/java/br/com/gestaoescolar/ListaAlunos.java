package br.com.gestaoescolar;

import dao.AlunoDAO;
import jakarta.persistence.EntityManager;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListaAlunos extends javax.swing.JFrame {

    public ListaAlunos() {
        initComponents();
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    private void carregarTabelaAlunos(List<modelo.Aluno> lista) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome", "Nascimento", "CPF", "Matrícula"}, 0);

        for (modelo.Aluno aluno : lista) {
            modelo.addRow(new Object[]{
                aluno.getNome(),
                aluno.getNascimento(),
                aluno.getCpf(),
                aluno.getMatricula()
            });
        }

        TbAlunos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAlunos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbAlunos = new javax.swing.JTable();
        BtnSair = new javax.swing.JButton();
        BtnListarAluno = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();
        BtnLancarNotas = new javax.swing.JButton();
        TxtBuscaCadAluno = new javax.swing.JTextField();
        LabelBuscar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelAlunos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelAlunos.setText("ALUNOS");

        TbAlunos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Nascimento", "CPF", "Matrícula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TbAlunos);

        jScrollPane1.setViewportView(jScrollPane2);

        BtnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnSair.setForeground(new java.awt.Color(0, 102, 102));
        BtnSair.setText("Sair");
        BtnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        BtnListarAluno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnListarAluno.setForeground(new java.awt.Color(0, 102, 102));
        BtnListarAluno.setText("Listar Aluno");
        BtnListarAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnListarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarAlunoActionPerformed(evt);
            }
        });

        BtnCadastrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnCadastrar.setForeground(new java.awt.Color(0, 102, 102));
        BtnCadastrar.setText("Cadastrar");
        BtnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarActionPerformed(evt);
            }
        });

        BtnLancarNotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BtnLancarNotas.setForeground(new java.awt.Color(0, 102, 102));
        BtnLancarNotas.setText("Lançar Notas");
        BtnLancarNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLancarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLancarNotasActionPerformed(evt);
            }
        });

        TxtBuscaCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscaCadAlunoActionPerformed(evt);
            }
        });

        LabelBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        LabelBuscar1.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(254, 254, 254)
                            .addComponent(LabelAlunos))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnListarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnLancarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtBuscaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelAlunos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscaCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSair)
                    .addComponent(BtnLancarNotas)
                    .addComponent(BtnCadastrar)
                    .addComponent(BtnListarAluno))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLancarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLancarNotasActionPerformed

        //new GestaoNotas().setVisible(true);
        GestaoNotas tela = new GestaoNotas();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null); // Centraliza
        this.dispose(); // (Opcional) Fecha a janela atual

    }//GEN-LAST:event_BtnLancarNotasActionPerformed

    private void BtnListarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarAlunoActionPerformed

        EntityManager em = util.JPAUtil.getEntityManager();
      AlunoDAO alunoDAO = new AlunoDAO(); // ✅ CERTO

        try {
            List<modelo.Aluno> alunos = alunoDAO.listarTodos();
            carregarTabelaAlunos(alunos);
        } finally {
            em.close();
        }

    }//GEN-LAST:event_BtnListarAlunoActionPerformed

    private void BtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarActionPerformed
        // Fecha a janela atual
        this.dispose();

        // Criar uma nova instância da janela CadastroAlunos e abre a janela CadastroAlunos 
        CadastroAlunos cadastro = new CadastroAlunos();
        cadastro.setVisible(true);


    }//GEN-LAST:event_BtnCadastrarActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        int resposta = javax.swing.JOptionPane.showConfirmDialog(this,
                "Deseja realmente sair?", "Confirmação",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (resposta == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnSairActionPerformed

    private void TxtBuscaCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscaCadAlunoActionPerformed
        // TODO add your handling code here:
        String termo = TxtBuscaCadAluno.getText();
        EntityManager em = util.JPAUtil.getEntityManager();
       AlunoDAO alunoDAO = new AlunoDAO(); // ✅ CERTO

        try {
            List<modelo.Aluno> alunos = alunoDAO.buscarPorNome(termo);
            carregarTabelaAlunos(alunos);
        } finally {
            em.close();
        }
    }//GEN-LAST:event_TxtBuscaCadAlunoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAlunos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnLancarNotas;
    private javax.swing.JButton BtnListarAluno;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel LabelAlunos;
    private javax.swing.JLabel LabelBuscar1;
    private javax.swing.JTable TbAlunos;
    private javax.swing.JTextField TxtBuscaCadAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
