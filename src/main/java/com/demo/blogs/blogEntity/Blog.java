package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Entity
@Table(name="Blog")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue

    private Integer id;
    private String BlogName ;

    @Column(name="PostContent")
    private String BlogPostContent;

    private LocalDate createOn;

//  private LocalDate modifiedOn;

}
