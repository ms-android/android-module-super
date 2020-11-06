package com.ms.module.supers.inter.request;


import android.graphics.Bitmap;

import com.ms.module.supers.inter.supers.ISupers;

import java.util.Map;

//
// 网络请求
public interface IRequest extends ISupers {

    /**
     * @param headers
     * @param url
     * @return
     */
    Response get(Map<String, String> headers, String url);

    /**
     * @param headers
     * @param url
     * @param callBack
     */
    void get(Map<String, String> headers, String url, RequestCallBack callBack);

    /**
     * @param headers
     * @param url
     * @param params
     * @return
     */
    Response post(Map<String, String> headers, String url, Map<String, String> params);

    /**
     * @param headers
     * @param url
     * @param params
     * @param callBack
     */
    void post(Map<String, String> headers, String url, Map<String, String> params, RequestCallBack callBack);


    /**
     * @param headers
     * @param url
     * @param body
     * @return
     */
    Response requestBody(
            Map<String, String> headers,
            String url,
            String body
    );


    /**
     * @param headers
     * @param url
     * @param body
     * @param callBack
     */
    void requestBody(
            Map<String, String> headers,
            String url,
            String body,
            RequestCallBack callBack
    );


    /**
     * 下载图片
     *
     * @param url
     * @return
     */
    Bitmap downloadImage(String url);


    /**
     * 异步下载图片
     *
     * @param url
     * @param callBack
     */
    void downloadImage(String url, RequestCallBack<Bitmap, Throwable> callBack);


}