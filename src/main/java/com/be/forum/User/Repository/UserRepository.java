package com.be.forum.User.Repository;

import com.be.forum.User.Entity.User;
import org.hibernate.annotations.BatchSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Query("select user from User user where user.Id =:Id")
    User findUserById(@Param("Id") Long Id);

    User findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);

    @BatchSize(size = 50)
    @Query("select user from User user")
    List<User> findAll();
}