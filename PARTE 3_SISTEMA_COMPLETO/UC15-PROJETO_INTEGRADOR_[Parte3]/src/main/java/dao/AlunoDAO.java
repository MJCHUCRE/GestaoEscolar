package dao;

import modelo.Aluno;
import util.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;
import modelo.Periodo;

public class AlunoDAO {

    public void cadastrar(Aluno aluno) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao cadastrar aluno: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    public List<Aluno> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("FROM Aluno", Aluno.class).getResultList();
        } finally {
            em.close();
        }
    }

    public List<Aluno> buscarPorNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("FROM Aluno a WHERE LOWER(a.nome) LIKE :nome", Aluno.class)
                    .setParameter("nome", "%" + nome.toLowerCase() + "%")
                    .getResultList();
        } finally {
            em.close();
        }
    }

    /**
     * public List<Aluno> listarTodos() { EntityManager em =
     * JPAUtil.getEntityManager(); try { return em.createQuery("FROM Periodo",
     * Aluno.class).getResultList(); } finally { em.close(); }
    }*
     */
}
