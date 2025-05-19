package dao;

import modelo.Aluno;
import util.JPAUtil;

import jakarta.persistence.EntityManager;
import java.util.List;

public class AlunoDAO {
    public List<Aluno> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
        } finally {
            em.close();
        }
    }
}

