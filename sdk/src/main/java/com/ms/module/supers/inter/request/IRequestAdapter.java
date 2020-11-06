package com.ms.module.supers.inter.request;

import android.graphics.Bitmap;

import java.util.Map;

//
// 网络请求
public class IRequestAdapter implements IRequest {


    @Override
    public Response get(Map<String, String> headers, String url) {
        return null;
    }

    @Override
    public void get(Map<String, String> headers, String url, RequestCallBack callBack) {

    }

    @Override
    public Response post(Map<String, String> headers, String url, Map<String, String> params) {
        return null;
    }

    @Override
    public void post(Map<String, String> headers, String url, Map<String, String> params, RequestCallBack callBack) {

    }

    @Override
    public Response requestBody(Map<String, String> headers, String url, String body) {
        return null;
    }

    @Override
    public void requestBody(Map<String, String> headers, String url, String body, RequestCallBack callBack) {

    }

    @Override
    public Bitmap downloadImage(String s) {
        return null;
    }

}