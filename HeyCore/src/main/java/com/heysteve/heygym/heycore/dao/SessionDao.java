package com.heysteve.heygym.heycore.dao;

import com.heysteve.heygym.heycore.model.Session;
import com.heysteve.heygym.heycore.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by marti on 1/5/2017.
 */
@Repository
@Transactional
public class SessionDao {

    // Private fields

    // An EntityManager will be automatically injected from entityManagerFactory
    // setup on DatabaseConfig class.
    @PersistenceContext
    private EntityManager entityManager;

    public void create(Session user) {
        entityManager.persist(user);
        return;
    }

    /**
     * Delete the user from the database.
     */
    public void delete(Session user) {
        if (entityManager.contains(user))
            entityManager.remove(user);
        else
            entityManager.remove(entityManager.merge(user));
        return;
    }

    /**
     * Return all the users stored in the database.
     */
    /*@SuppressWarnings("unchecked")
    public List getAll() {
        return entityManager.createQuery("from Session").getResultList();
    }*/

    /**
     * Return the user having the passed email.
     */
    /*public User getByEmail(String email) {
        return (User) entityManager.createQuery(
                "from User where email = :email")
                .setParameter("email", email)
                .getSingleResult();
    }*/

    /**
     * Return the user having the passed id.
     */
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }

    /**
     * Update the passed user in the database.
     */
    public void update(User user) {
        entityManager.merge(user);
        return;
    }


}
