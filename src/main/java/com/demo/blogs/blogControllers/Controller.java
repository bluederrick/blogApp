package com.demo.blogs.blogControllers;

import com.demo.blogs.ErrorHandlers.ApiError;
import com.demo.blogs.blogDTO.PostValidateDTO;
import com.demo.blogs.blogDTO.UsersValidateDTO;
import com.demo.blogs.blogEntity.Post;
import com.demo.blogs.blogEntity.User;
import com.demo.blogs.blogServices.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")

public class Controller {

    @Autowired
    private Services services;

//   generate a Constructor for service class

    public Controller (Services services) {
        this.services = services;
    }
//    get all blogContents
    @GetMapping("/blogs")
    public String getBlogs(){

        return "hello world";
    }

//    to create new blogPost
@ResponseStatus(HttpStatus.OK)
@PostMapping("/blogPost")
public ResponseEntity<?> createPost (@RequestBody UsersValidateDTO usersValidateDTO , PostValidateDTO postValidateDTO){
   try{
//retrieve all fields
       String email = usersValidateDTO.getUserEmail();

       String isUserExist = services.userAuthPost(email);

        if(isUserExist.isEmpty()) {

            System.out.println("user does not exist");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("user doesn't exist");
        }

            String postTitle = postValidateDTO.getPostTitle();
            String AuthorBy = postValidateDTO.getAuthorBy();
            String postContent = postValidateDTO.getPostContent();


            services.makePostService(postTitle ,AuthorBy,postContent);

            return ResponseEntity.status(HttpStatus.OK).body("post saved successfully");

   }catch(Exception exception){
       ApiError Error = new ApiError("something went wrong" ,500 ,"/users" );

                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Error);
   }


//  validate user inorder to make a BlogPost;

//    if (repository.existsById(id){
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND , "content not found");
//    }
//    repository.save(content);
//}




}


}
//}