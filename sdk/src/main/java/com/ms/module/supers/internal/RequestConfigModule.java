package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.request.IRequestConfig;
import com.ms.module.supers.inter.request.IRequestConfigAdapter;

/**
 * 请求设置
 */
public class RequestConfigModule extends ModuleAdapter {


    private static final String CLASSPATH = "com.ms.module.impl.request.RequestSettingImpl";

    private IRequestConfig requestSetting;


    @Override
    public IRequestConfig get() {
        if (requestSetting != null) {
            return requestSetting;
        }
        requestSetting = instance(CLASSPATH);
        if (requestSetting == null) {
            requestSetting = new IRequestConfigAdapter();
        }
        return requestSetting;
    }
}