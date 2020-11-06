package com.ms.module.supers.inter.pay;

import com.ms.module.supers.inter.common.ICallBack;

public interface PayCallBack extends ICallBack {

    void onSuccess();

    void onFilure();

    void onStart();

    void onCancel();

}
