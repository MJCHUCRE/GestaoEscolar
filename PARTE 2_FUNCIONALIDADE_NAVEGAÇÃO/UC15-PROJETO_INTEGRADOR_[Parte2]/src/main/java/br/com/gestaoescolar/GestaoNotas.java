package br.com.gestaoescolar;

import dao.AlunoDAO;
import dao.DisciplinaDAO;
import dao.NotaDAO;
import dao.PeriodoDAO;
import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno;
import modelo.Disciplina;
import modelo.Periodo;
import modelo.Nota;
import java.util.List;
import javax.swing.JOptionPane;

public class GestaoNotas extends javax.swing.JFrame {

    public GestaoNotas() {
        initComponents();
        carregarCombos();
        setLocationRelativeTo(null); // Centraliza a janela na tela
    }

    private void carregarCombos() {
        AlunoDAO alunoDAO = new AlunoDAO();
        DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
        PeriodoDAO periodoDAO = new PeriodoDAO();

        // Limpa os combos antes de popular
        cbAluno.removeAllItems();
        cbDisciplina.removeAllItems();
        cbPeriodo.removeAllItems();

        for (Aluno aluno : alunoDAO.listarTodos()) {
            cbAluno.addItem(aluno);
        }

        for (Disciplina disciplina : disciplinaDAO.listarTodos()) {
            cbDisciplina.addItem(disciplina);
        }

        for (Periodo periodo : periodoDAO.listarTodos()) {
            cbPeriodo.addItem(periodo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelGestaoNotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNotas = new javax.swing.JTable();
        LabelNome = new javax.swing.JLabel();
        LabelPeriodo = new javax.swing.JLabel();
        LabelDisciplina = new javax.swing.JLabel();
        LabelNota = new javax.swing.JLabel();
        TxtNota = new javax.swing.JTextField();
        TxtBusca = new javax.swing.JTextField();
        LabelBuscar = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();
        BtnLancar = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        cbAluno = new javax.swing.JComboBox<>();
        cbDisciplina = new javax.swing.JComboBox<>();
        cbPeriodo = new javax.swing.JComboBox<>();
        BtnListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        LabelGestaoNotas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelGestaoNotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelGestaoNotas.setText("GESTÃO DE NOTAS");

        tabelaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Período", "Disciplina", "Nota", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaNotas);

        LabelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelNome.setText("Aluno:");

        LabelPeriodo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelPeriodo.setText("Período:");

        LabelDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelDisciplina.setText("Disciplina:");

        LabelNota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelNota.setText("Nota:");

        TxtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscaActionPerformed(evt);
            }
        });

        LabelBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LabelBuscar.setText("Buscar:");

        BtnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLimpar.setForeground(new java.awt.Color(0, 102, 102));
        BtnLimpar.setText("LIMPAR");
        BtnLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtnLancar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnLancar.setForeground(new java.awt.Color(0, 102, 102));
        BtnLancar.setText("LANÇAR");
        BtnLancar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLancarActionPerformed(evt);
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

        BtnListar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BtnListar.setForeground(new java.awt.Color(0, 102, 102));
        BtnListar.setText("Listar");
        BtnListar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(LabelGestaoNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelPeriodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(LabelBuscar)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(BtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(BtnLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80)
                                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelDisciplina)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(33, 33, 33)
                                    .addComponent(LabelNota)
                                    .addGap(18, 18, 18)
                                    .addComponent(TxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelGestaoNotas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBuscar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeriodo)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbDisciplina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDisciplina, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnInicio)
                    .addComponent(BtnLancar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarNotas(String nomeAluno) {
        NotaDAO dao = new NotaDAO();
        List<Nota> listaNotas = dao.buscarPorNomeAluno(nomeAluno);

        DefaultTableModel modelo = (DefaultTableModel) tabelaNotas.getModel();
        modelo.setRowCount(0); // limpa a tabela

        for (Nota nota : listaNotas) {
            String status = calcularStatus(nota.getNota());
            Object[] dados = {
                nota.getAluno().getNome(),
                nota.getDisciplina().getNome(),
                nota.getPeriodo().getDescricao(),
                nota.getNota(),
                status
            };
            modelo.addRow(dados);
        }
    }

    private String calcularStatus(BigDecimal valor) {
        if (valor == null) {
            return "Sem nota";
        }
        if (valor.compareTo(new BigDecimal("7.0")) >= 0) {
            return "Aprovado";
        } else if (valor.compareTo(new BigDecimal("4.0")) >= 0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void atualizarTabelaNotas(Aluno alunoSelecionado) {
        NotaDAO dao = new NotaDAO();
        List<Nota> notas = dao.buscarPorAluno(alunoSelecionado);

        DefaultTableModel model = (DefaultTableModel) tabelaNotas.getModel();
        model.setRowCount(0); // limpa

        for (Nota n : notas) {
            model.addRow(new Object[]{
                n.getDisciplina().getNome(),
                n.getPeriodo().getDescricao(),
                n.getNota()
            });
        }
    }


    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        new ListaAlunos().setVisible(true); // Abre a tela ListaAlunos
        this.dispose(); // Fecha a janela atual (opcional)
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLancarActionPerformed

        try {
            Aluno aluno = (Aluno) cbAluno.getSelectedItem();
            Disciplina disciplina = (Disciplina) cbDisciplina.getSelectedItem();
            Periodo periodo = (Periodo) cbPeriodo.getSelectedItem();

            // Convertendo texto da nota para Double
            Double notaValor = Double.parseDouble(TxtNota.getText());

            // Convertendo para BigDecimal (usado no construtor de Nota)
            BigDecimal notaDecimal = BigDecimal.valueOf(notaValor);

            // Lógica automática de status
            String status = notaValor >= 6.0 ? "Aprovado" : "Reprovado";

            // Criando objeto Nota com valores corretos
            Nota nota = new Nota(aluno, disciplina, periodo, notaDecimal, status);

            // Salvando no banco via DAO
            NotaDAO dao = new NotaDAO();
            dao.salvar(nota);

            JOptionPane.showMessageDialog(this, "Nota lançada com sucesso!");
            atualizarTabelaNotas(aluno); // Atualiza a tabela com o aluno selecionado

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor numérico válido para a nota.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao lançar nota: " + e.getMessage());
        }


    }//GEN-LAST:event_BtnLancarActionPerformed

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_BtnListarActionPerformed

    private void TxtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscaActionPerformed

        String nome = TxtBusca.getText();
        buscarNotas(nome);


    }//GEN-LAST:event_TxtBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(GestaoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestaoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestaoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestaoNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestaoNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnLancar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnListar;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelDisciplina;
    private javax.swing.JLabel LabelGestaoNotas;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNota;
    private javax.swing.JLabel LabelPeriodo;
    private javax.swing.JTextField TxtBusca;
    private javax.swing.JTextField TxtNota;
    private javax.swing.JComboBox<Aluno> cbAluno;
    private javax.swing.JComboBox<Disciplina> cbDisciplina;
    private javax.swing.JComboBox<Periodo> cbPeriodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaNotas;
    // End of variables declaration//GEN-END:variables
}
