package modelo;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Disciplina disciplina;

    @ManyToOne
    private Periodo periodo;

    private BigDecimal nota;

    private String status;

    // Construtor vazio
    public Nota() {
    }

    // Construtor com parâmetros
    public Nota(Aluno aluno, Disciplina disciplina, Periodo periodo, BigDecimal nota, String status) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.periodo = periodo;
        this.nota = nota;
        this.status = status;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
