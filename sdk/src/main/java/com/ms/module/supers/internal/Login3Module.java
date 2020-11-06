package com.ms.module.supers.internal;

import com.ms.module.supers.inter.login3.ILogin3;
import com.ms.module.supers.inter.login3.ILogin3Adapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class Login3Module extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.login3.Login3Impl";

    private ILogin3 instance;

    @Override
    public ILogin3 get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new ILogin3Adapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}