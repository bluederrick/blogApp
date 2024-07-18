package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="BlogPost")

public class Post {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String postTitle;

    private String authorBy;

    private String postContent;

//    @Enumerated(EnumType.STRING)
//    private PostStatus postStatus ;

//    @OneToMany(mappedBy = "post")
//    private List<Comments> comments;

//    @Column(updatable = false)
//    private LocalDate createOn;

//    @Column(insertable = false)
//    private LocalDate modifiedOn;

//    @Column(insertable = false)
//    private LocalDate DeletedOn;

    public Post() {
    }

    public Post(String postTitle, String authorBy, String postContent) {
        this.postTitle = postTitle;
        this.authorBy = authorBy;
        this.postContent = postContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        return "Post{" +
                "id=" + id +
                ", postTitle='" + postTitle + '\'' +
                ", authorBy='" + authorBy + '\'' +
                ", postContent='" + postContent + '\'' +
                '}';
    }
}
