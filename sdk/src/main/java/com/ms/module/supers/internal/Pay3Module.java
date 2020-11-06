package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.pay.IPay3;
import com.ms.module.supers.inter.pay.IPay3Adapter;

public class Pay3Module extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.pay3.Pay3Impl";

    private IPay3 instance;

    @Override
    public IPay3 get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IPay3Adapter();
        }

        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}