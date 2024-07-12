package com.demo.blogs.blogServices;

import com.demo.blogs.Repo.BlogRepo;
import com.demo.blogs.Repo.PostRepo;
import com.demo.blogs.Repo.UserRepo;
import com.demo.blogs.blogEntity.Blog;
import com.demo.blogs.blogEntity.Post;
import com.demo.blogs.blogEntity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Services implements userAuth {


//    private  User  user;
   private  UserRepo userRepo ;
   private BlogRepo blogRepo;
//   private Post post;
   private PostRepo postRepo;


//    validate service before post made
//    @Override
    public String  userAuthPost(String email) {
        Optional<User>  userExist;
        userExist=userRepo.findUserByEmail(email);

                if(userExist.isEmpty()){
                    System.out.print("user not found");
                }
        System.out.println("User granted permission");
                return "User granted successfully";

    }




//     make a new post
    public String  makePostService(String PostTitle ,String AuthorBy,String PostContent){

        Post post =  new Post();

//              set the parameters values
        post.setPostContent(PostContent);
        post.setAuthorBy(AuthorBy);
        post.setPostTitle(PostTitle);
        return  postRepo.save(post);

    }



}
