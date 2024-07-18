package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="Blog")

public class Blog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String BlogName ;

    @Column(name="PostContent")
    private String BlogPostContent;

    private LocalDate createOn;

//  private LocalDate modifiedOn;

}
