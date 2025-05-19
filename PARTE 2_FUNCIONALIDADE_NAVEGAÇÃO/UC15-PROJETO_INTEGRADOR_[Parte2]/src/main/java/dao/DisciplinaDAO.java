package dao;

import modelo.Disciplina;
import util.JPAUtil;

import jakarta.persistence.EntityManager;
import java.util.List;

public class DisciplinaDAO {
    public List<Disciplina> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT d FROM Disciplina d", Disciplina.class).getResultList();
        } finally {
            em.close();
        }
    }
}

