package com.ffg.repository;

import com.ffg.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by connor on 9/8/15.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByEmail(String email);
    public Iterable<User> findByFirstNameAndLastName(String firstname, String lastName);
}
