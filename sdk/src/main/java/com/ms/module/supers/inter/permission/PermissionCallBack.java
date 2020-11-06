package com.ms.module.supers.inter.permission;

import com.ms.module.supers.inter.common.ICallBack;

public interface PermissionCallBack<SUCCESS, FILURE> extends ICallBack {

    void onSuccess(SUCCESS success);

    void onFailure(FILURE filure);
}
