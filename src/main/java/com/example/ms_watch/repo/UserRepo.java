package com.example.ms_watch.repo;

import com.example.ms_watch.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Collection;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE user.id = :id",
            nativeQuery = true)
    Collection<User> findAllActiveUsers(@Param("id") int id);

    @Query(value = "SELECT * from user  where user_name= :userName and password = :password",
            nativeQuery = true)
    Collection<User>  getLogin(@Param("userName") String userName, @Param("password") String password );



}
