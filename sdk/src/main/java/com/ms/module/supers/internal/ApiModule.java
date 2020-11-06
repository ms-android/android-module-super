package com.ms.module.supers.internal;


import com.ms.module.supers.inter.api.IAPI;
import com.ms.module.supers.inter.api.IAPIAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * API
 */
public class ApiModule extends ModuleAdapter {
    private static final String CLASSPATH = "com.ms.module.impl.api.ApiImpl";
    private IAPI instance;

    @Override
    public IAPI get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IAPIAdapter();
        }

        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}