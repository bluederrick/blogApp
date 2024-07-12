package com.demo.blogs.ErrorHandlers;

import java.time.LocalDate;
import java.util.Date;

public class ApiError {


    String errorMessage ;

    Integer status ;

    Long timeStamp;

    String path;


//    create a initialize object
    public ApiError(String errorMessage , Integer status , String path ){
    this.status= status  ;
    this.errorMessage=errorMessage;
    this.path=path;
    this.timeStamp= new Date().getTime();
    }
}
