package com.example.ms_watch.repo;

import com.example.ms_watch.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;


@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM user WHERE user.id = :id",
            nativeQuery = true)
    User findUserById(@Param("id") int id);

    @Query(value = "SELECT * from user u where u.user_name= :userName and u.password = :password",
            nativeQuery = true)
    List<User> getLogin(@Param("userName") String userName, @Param("password") String password );


    @Query(value = "update user set name = :name , last_name = :lastName, user_name = :userName, password = :password, " +
            "birthday = :birthday, open_date = :openDate, email = :email, type_id = :typeId where id = :id",
            nativeQuery = true)
    boolean updateUser(@Param("id") int id, @Param("name") String name, @Param("lastName") String lastName,
                              @Param("userName") String userName, @Param("password") String password,
                              @Param("birthday") SimpleDateFormat birthday, @Param("openDate") LocalDate openDate,
                              @Param("email") String email, @Param("typeId") int typeId);

    @Query(value = "SELECT * FROM user WHERE type_id = 2 or type_id = 3",
            nativeQuery = true)
    List<User> findUsers();

}
