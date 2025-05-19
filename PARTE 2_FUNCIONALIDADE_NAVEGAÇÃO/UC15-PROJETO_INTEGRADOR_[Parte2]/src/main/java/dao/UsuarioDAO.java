package dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.EntityManager;
import modelo.Usuario;
import util.JPAUtil;

public class UsuarioDAO {

    public Usuario autenticar(String login, String senha) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha", Usuario.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            return query.getSingleResult(); // retorna o objeto encontrado
        } catch (NoResultException e) {
            return null; // nenhum usuário encontrado
        } finally {
            em.close();
        }
    }
}
