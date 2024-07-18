package com.demo.blogs.blogServices;

import com.demo.blogs.Repo.BlogRepo;
import com.demo.blogs.Repo.PostRepo;
import com.demo.blogs.Repo.UserRepo;
import com.demo.blogs.blogDTO.PostValidateDTO;
import com.demo.blogs.blogEntity.Blog;
import com.demo.blogs.blogEntity.Post;
import com.demo.blogs.blogEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services implements userAuth {


//    private  User  user;
   @Autowired
   private UserRepo userRepo ;
   @Autowired
   private BlogRepo blogRepo;
//   @Autowired
   private Post post;
    @Autowired
   private PostRepo postRepo;



//    validate service before post made
    @Override
public String userAuthentification(String email) {
        Optional<User>userExist;
        userExist=userRepo.findUserByEmail(email);

                if(userExist.isEmpty()){
                    System.out.print("user not found");
                    return "user not found";
                }
//        System.out.println("User granted permission");
                return "User granted successfully";
    }

//     make a new post
    public void makePostService( PostValidateDTO postValidateDTO){


        Post post =  new Post();
//              set the parameters values
        post.setPostTitle(postValidateDTO.getPostTitle());
        post.setAuthorBy(postValidateDTO.getAuthorBy());
        post.setPostContent(postValidateDTO.getPostContent());


        System.out.print("derrick");

        System.out.println(post);

//
          postRepo.save(post);

    }
// Get all post from the database;

    public List<User>getAllUsers(){
try {
    return userRepo.findAll();

   }catch(Exception exception){

    return null;

}

    }

}
