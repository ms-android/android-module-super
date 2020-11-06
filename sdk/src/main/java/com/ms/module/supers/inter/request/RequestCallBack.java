package com.ms.module.supers.inter.request;

import com.ms.module.supers.inter.common.ICallBack;

public interface RequestCallBack<Response, Throwable> extends ICallBack {

    void onSuccess(Response response);

    void onFilure(Throwable throwable);

}