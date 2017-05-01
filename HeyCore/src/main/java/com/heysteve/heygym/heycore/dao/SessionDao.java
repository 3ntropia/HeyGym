package com.heysteve.heygym.heycore.dao;

import com.heysteve.heygym.heycore.model.Session;
import com.heysteve.heygym.heycore.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by marti on 1/5/2017.
 */
@Transactional
public interface SessionDao extends CrudRepository<Session, Long> {

    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    public User findByEmail(String email);

}
