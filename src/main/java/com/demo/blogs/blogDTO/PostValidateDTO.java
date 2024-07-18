package com.demo.blogs.blogDTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class PostValidateDTO {

    private String postTitle;

    private String authorBy;

    private String postContent;

    public PostValidateDTO() {
    }

    public PostValidateDTO(String postTitle, String authorBy, String postContent) {
        this.postTitle = postTitle;
        this.authorBy = authorBy;
        this.postContent = postContent;
    }
    //    private LocalDateTime createAt;

//    private LocalDate UpdateAt;

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getAuthorBy() {
        return authorBy;
    }

    public void setAuthorBy(String authorBy) {
        this.authorBy = authorBy;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    @Override
    public String toString() {
        return "PostValidateDTO{" +
                "postTitle='" + postTitle + '\'' +
                ", authorBy='" + authorBy + '\'' +
                ", postContent='" + postContent + '\'' +
                '}';
    }
}
