package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
//    @OneToMany
//    private Comments comments;

    @Column(nullable = false)
    private String Password;

    @Column(nullable = false ,unique = true)
    private String email;

//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", Password='" + Password + '\'' +
//                ", UserEmail='" + UserEmail + '\'' +
//                '}';
//    }
}
