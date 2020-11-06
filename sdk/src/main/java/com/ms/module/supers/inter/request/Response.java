package com.ms.module.supers.inter.request;

public class Response {


    // 请求返回码
    public int code;
    // 响应体
    public String body;
    // 响应消息
    public String message;
    // 异常
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