package com.demo.blogs.blogDTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PostValidateDTO {

    private String PostTitle;

    private String AuthorBy;

    private String postContent;

    private LocalDate createAt;

    private LocalDate UpdateAt;


}
