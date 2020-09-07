package com.ms.module.supers.inter.common;


import com.ms.module.supers.inter.supers.ISupers;

// 回调接口
public interface ICallBack<
        SUCCESS,
        FAILURE,
        CANCEL,
        START,
        UNKNOWN,
        EXCEPTION,
        CHANGE
        > extends ISupers {

    void onSuccess(SUCCESS success);

    void onFailure(FAILURE failure);

    void onCancel(CANCEL cancel);

    void onStart(START start);

    void onUnknown(UNKNOWN unknown);

    void onException(EXCEPTION exception);

    void onChange(CHANGE change);

}