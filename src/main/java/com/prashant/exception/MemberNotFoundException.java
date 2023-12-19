package com.prashant.exception;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class MemberNotFoundException extends RuntimeException  {

    public MemberNotFoundException(){
    }
    public MemberNotFoundException(int id){
        super(String.format("Member with Id %d not found", id));
    }
}
