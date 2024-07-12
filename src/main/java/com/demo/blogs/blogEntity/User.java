package com.demo.blogs.blogEntity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue

    private Integer id;
//    @OneToMany
//    private Comments comments;


    @Column(nullable = false)
    private String Password;

    @Column(nullable = false , unique = true)
    private String UserEmail;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Password='" + Password + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                '}';
    }
}
