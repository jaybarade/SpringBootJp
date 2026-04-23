package com.jpcode.productlsit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)//already exists
public class CategoryAlreadyExitException  extends  RuntimeException{

    public  CategoryAlreadyExitException( String message){
         super(message);
    }
}
