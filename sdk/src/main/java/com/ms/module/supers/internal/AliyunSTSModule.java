package com.ms.module.supers.internal;

import com.ms.module.supers.inter.aliyun.sts.ISTS;
import com.ms.module.supers.inter.aliyun.sts.ISTSAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;


/**
 * 阿里云 STS 授权
 */
public class AliyunSTSModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.aliyun.STSImpl";

    private ISTS instance;

    @Override
    public ISTS get() {

        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);

        if (instance == null) {
            instance = new ISTSAdapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}