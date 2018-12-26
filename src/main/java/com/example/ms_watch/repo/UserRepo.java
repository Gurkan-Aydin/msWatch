package com.example.ms_watch.repo;

import com.example.ms_watch.users.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    @Query("select u from user u where u.id = 5")
    Collection<User> findAllActiveUsers();
}
