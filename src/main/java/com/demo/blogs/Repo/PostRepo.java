package com.demo.blogs.Repo;

import com.demo.blogs.blogEntity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo  extends JpaRepository<Integer , Post> {
}
