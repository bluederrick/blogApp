package com.demo.blogs.Utilities;

import org.springframework.beans.factory.annotation.Value;

public interface PostProjection {
    @Value("#{target.Post.size()}")
    Integer getAllPost();


}
