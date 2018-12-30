package com.example.ms_watch.repo;

import com.example.ms_watch.users.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Collection;


@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE user.id = :id",
            nativeQuery = true)
    Collection<User> findAllActiveUsers(@Param("id") int id);

    /*@Query(value = "SELECT id from user where :userName = user.user_name " +
            "and user.password = :password",
            nativeQuery = true)
    Collection<?> getLogin(@Param("useName") String userName, @Param("password") String password);*/

    @Override
    Iterable<User> findAll();
}
