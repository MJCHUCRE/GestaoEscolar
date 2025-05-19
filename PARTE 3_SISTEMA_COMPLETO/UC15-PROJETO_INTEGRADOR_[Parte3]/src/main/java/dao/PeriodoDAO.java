package dao;

import modelo.Periodo;
import util.JPAUtil;

import jakarta.persistence.EntityManager;
import java.util.List;

public class PeriodoDAO {

    public List<Periodo> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT p FROM Periodo p", Periodo.class).getResultList();
        } finally {
            em.close();
        }
    }

}
