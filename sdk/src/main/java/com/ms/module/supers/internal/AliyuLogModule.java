package com.ms.module.supers.internal;

import com.ms.module.supers.inter.aliyun.log.IAliyuLog;
import com.ms.module.supers.inter.aliyun.log.IAliyuLogAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class AliyuLogModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.aliyun.LogImpl";

    private IAliyuLog instance;

    @Override
    public IAliyuLog get() {

        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IAliyuLogAdapter();
        }

        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}