package com.ms.module.supers.internal;

import com.ms.module.supers.inter.exception.IException;
import com.ms.module.supers.inter.exception.IExceptionAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * exception
 */
public class ExceptionModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.exception.ExceptionImpl";

    IException instance;

    @Override
    public IException get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new IExceptionAdapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}