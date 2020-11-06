package com.ms.module.supers.internal;


import com.ms.module.supers.inter.data.IData;
import com.ms.module.supers.inter.data.IDataAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * data
 */
public class DataModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.data.DataImpl";
    private IData instance;

    @Override
    public IData get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new IDataAdapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}