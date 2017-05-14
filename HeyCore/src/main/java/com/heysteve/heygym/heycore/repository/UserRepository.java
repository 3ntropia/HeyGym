package com.heysteve.heygym.heycore.repository;

import com.heysteve.heygym.heycore.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by marti on 13/5/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findByEmail(String email);
}
