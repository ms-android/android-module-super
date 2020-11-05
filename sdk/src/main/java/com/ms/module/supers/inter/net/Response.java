package com.ms.module.supers.inter.net;

public class Response {

    // -1 exception
    public int code;
    public String body;
    public String message;
    public Throwable throwable;


    public Response() {

    }

    public Response(int code, String body) {
        this.code = code;
        this.body = body;
    }

    public Response(int code, String body, String message) {
        this.code = code;
        this.body = body;
        this.message = message;
    }

    public Response(int code, String body, String message, Throwable throwable) {
        this.code = code;
        this.body = body;
        this.message = message;
        this.throwable = throwable;
    }
}