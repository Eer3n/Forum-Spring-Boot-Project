package com.be.forum.User.Repository;

import com.be.forum.User.Entity.User;
import org.hibernate.annotations.BatchSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Id> {

    @BatchSize(size = 50)
    @Query("select user from User user")
    List<User> findAll();

    @Query("select user from User user where user.Id=:Id")
    User findUserById(@Param("Id") Long Id);

    @Query("select user from User user where user.userName=:userName")
    User findUserByUserName(@Param("UserName") String userName);

    @Query("select user from User user where user.isRegistered=:isRegistered")
    User findAllByIsRegistered(@Param("isRegistered") Boolean isRegistered);

    @Query("select user from User user where user.userName=:userName and user.password=:password")
    User findUserByUserNameAndPassword(@Param("UserName") String UserName, @Param("Password") String password);

    User save(User user);
}