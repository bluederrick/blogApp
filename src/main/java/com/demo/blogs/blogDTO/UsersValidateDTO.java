package com.demo.blogs.blogDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsersValidateDTO {

    private String email;

    private String password;

    @Override
    public String toString() {
        return "UsersValidateDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
