package com.demo.blogs.Repo;

import com.demo.blogs.blogEntity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo  extends JpaRepository<Post,Long> {
//    List<Post>findAll();
}
