package com.ms.module.supers.internal;

import com.ms.module.supers.inter.mmkv.IMMKV;
import com.ms.module.supers.inter.mmkv.IMMKVAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * mmkv
 */

public class MMKVModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.mmkv.MMKVImpl";

    IMMKV instance;


    @Override
    public IMMKV get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IMMKVAdapter();
        }

        return instance;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
