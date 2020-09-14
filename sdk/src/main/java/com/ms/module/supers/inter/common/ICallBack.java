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

    /**
     * 成功
     *
     * @param success
     */
    void onSuccess(SUCCESS success);

    /**
     * 失败
     *
     * @param failure
     */
    void onFailure(FAILURE failure);

    /**
     * 取消
     *
     * @param cancel
     */
    void onCancel(CANCEL cancel);

    /**
     * 开始
     *
     * @param start
     */
    void onStart(START start);

    /**
     * 未知
     *
     * @param unknown
     */
    void onUnknown(UNKNOWN unknown);

    /**
     * 异常
     *
     * @param exception
     */
    void onException(EXCEPTION exception);

    /**
     * 变化
     *
     * @param change
     */
    void onChange(CHANGE change);

}