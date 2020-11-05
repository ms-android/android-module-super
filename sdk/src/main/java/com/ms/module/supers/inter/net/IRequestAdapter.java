package com.ms.module.supers.inter.net;

import android.graphics.Bitmap;

import com.ms.module.supers.inter.common.ICallBack;

import java.util.Map;

//
// 网络请求
public class IRequestAdapter implements IRequest {


    @Override
    public Response get(Map<String, String> headers, String url) {
        return null;
    }

    @Override
    public void get(Map<String, String> headers, String url, IRequestCallBack callBack) {

    }

    @Override
    public Response post(Map<String, String> headers, String url, Map<String, String> params) {
        return null;
    }

    @Override
    public void post(Map<String, String> headers, String url, Map<String, String> params, IRequestCallBack callBack) {

    }

    @Override
    public Response requestBody(Map<String, String> headers, String url, String body) {
        return null;
    }

    @Override
    public void requestBody(Map<String, String> headers, String url, String body, IRequestCallBack callBack) {

    }

    @Override
    public Bitmap downloadImage(String s) {
        return null;
    }
}