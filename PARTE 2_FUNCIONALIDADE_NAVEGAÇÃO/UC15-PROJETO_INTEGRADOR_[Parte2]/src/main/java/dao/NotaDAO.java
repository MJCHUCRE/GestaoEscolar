package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import modelo.Aluno;
import modelo.Nota;
import util.JPAUtil;

import java.util.List;

public class NotaDAO {

    public void salvar(Nota nota) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(nota);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public List<Nota> buscarPorNomeAluno(String nome) {
    EntityManager em = JPAUtil.getEntityManager();
    try {
        return em.createQuery(
            "SELECT n FROM Nota n WHERE LOWER(n.aluno.nome) LIKE :nome", Nota.class)
            .setParameter("nome", "%" + nome.toLowerCase() + "%")
            .getResultList();
    } finally {
        em.close();
    }
}


    public List<Nota> buscarPorAluno(Aluno aluno) {
        EntityManager em = JPAUtil.getEntityManager();
        TypedQuery<Nota> query = em.createQuery("SELECT n FROM Nota n WHERE n.aluno = :aluno", Nota.class);
        query.setParameter("aluno", aluno);
        return query.getResultList();
    }
}

