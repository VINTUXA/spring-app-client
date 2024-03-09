package com.example.springappclient.exception;

public class ClientException extends RuntimeException{
    public ClientException(String message){
        super(message);
    }
}
