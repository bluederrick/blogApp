package com.demo.blogs.blogControllers;

import com.demo.blogs.ErrorHandlers.ApiError;
import com.demo.blogs.blogDTO.PostValidateDTO;
import com.demo.blogs.blogDTO.UsersValidateDTO;
import com.demo.blogs.blogEntity.Post;
import com.demo.blogs.blogEntity.STATUS;
import com.demo.blogs.blogEntity.User;
import com.demo.blogs.blogServices.Services;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")

public class Controller {

    @Autowired
    private  Services services;

//     STATUS status;



//   generate a Constructor for service class

    public Controller (Services services ) {
        this.services = services;
    }


//    save user email on the database
//    @PostMapping("/api/v1/user")
//    public String  saveUser (User user){
//
//       String email = user.getEmail();
//        services.userAdded(email);
//
//         return  "user saved successfully";
//    }
//    get all blogContents
    @GetMapping("/blogs")
    public String getBlogs(){

        return "hello world";
    }

//    to create new blogPost
@ResponseStatus(HttpStatus.OK)
@PostMapping("/blogPost/new")
public ResponseEntity<String> createPost (@RequestBody PostValidateDTO postValidateDTO){

    try{
//
            String postTitle = postValidateDTO.getPostTitle();
            String authorBy = postValidateDTO.getAuthorBy();
            String postContent = postValidateDTO.getPostContent();
        System.out.println(postContent);
//        System.out.println(postTitle);
             services.makePostService(postValidateDTO );
//        System.out.println(newPost);
            return ResponseEntity.status(HttpStatus.OK).body("working well");

   }catch(Exception exception){
       ApiError Error = new ApiError("something went wrong" ,500 ,"/users" );

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("something went wrong");
   }


//  validate user inorder to make a BlogPost;

//    if (repository.existsById(id){
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND , "content not found");
//    }
//    repository.save(content);
//}


}
}