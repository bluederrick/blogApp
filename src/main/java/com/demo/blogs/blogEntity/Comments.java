package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table (name="Comments")
public class Comments {
    @Id
    @GeneratedValue

    private Integer id;
    private String Content;

    private String ReplyToCommentID;

    @ManyToOne
    @JoinColumn(name="PostId")
    private Post post;

    @Column(insertable = false)
    private LocalDate createOn;
    @Column(insertable = false)
    private LocalDate ModifiedOn;

}
