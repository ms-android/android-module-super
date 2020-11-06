package com.ms.module.supers.internal;

import com.ms.module.supers.inter.common.ICommon;
import com.ms.module.supers.inter.common.ICommonAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * COMMON
 */
public class CommonModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.common.CommonImpl";

    private ICommon instance;


    @Override
    public ICommon get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new ICommonAdapter();
        }

        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}