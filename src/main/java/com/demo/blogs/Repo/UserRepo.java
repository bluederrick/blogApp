package com.demo.blogs.Repo;

import com.demo.blogs.blogEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<Integer , User> {

//    create custom method to find UserByEmail;

    Optional<User>findUserByEmail(String  email);
}
