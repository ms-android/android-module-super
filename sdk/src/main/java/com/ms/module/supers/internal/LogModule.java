package com.ms.module.supers.internal;

import com.ms.module.supers.inter.log.ILog;
import com.ms.module.supers.inter.log.IlogAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * 日志
 */
public class LogModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.log.LogImpl";

    private ILog instance;

    @Override
    public ILog get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IlogAdapter();
        }

        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}