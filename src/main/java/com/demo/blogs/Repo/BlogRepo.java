package com.demo.blogs.Repo;

import com.demo.blogs.blogEntity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepo extends JpaRepository<Blog,Long> {

}
