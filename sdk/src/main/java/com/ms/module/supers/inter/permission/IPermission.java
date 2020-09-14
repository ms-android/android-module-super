package com.ms.module.supers.inter.permission;

import androidx.fragment.app.FragmentActivity;

import com.ms.module.supers.inter.common.ICallBack;
import com.ms.module.supers.inter.supers.ISupers;

/**
 * 权限
 */
public interface IPermission extends ISupers {

    /**
     * 申请权限
     *
     * @param activity
     * @param callBack
     * @param pers
     */
    void request(FragmentActivity activity, ICallBack callBack, String... pers);

}