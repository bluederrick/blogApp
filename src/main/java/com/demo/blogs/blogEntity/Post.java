package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="BlogPost")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Post {

@Id
@GeneratedValue
    private Integer id;
    private String PostTitle;

    private String AuthorBy;

    private String postContent;

    @Enumerated(EnumType.STRING)
    private PostStatus postStatus ;

    @OneToMany(mappedBy = "post")
    private List<Comments> comments;

    @Column(updatable = false)
    private LocalDate createOn;

    @Column(insertable = false)
    private LocalDate modifiedOn;

    @Column(insertable = false)
    private LocalDate DeletedOn;

}
