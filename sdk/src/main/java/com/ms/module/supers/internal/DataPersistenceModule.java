package com.ms.module.supers.internal;

import com.ms.module.supers.inter.datapersistence.IDataPersistence;
import com.ms.module.supers.inter.datapersistence.IDataPersistenceAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * 文件data
 */
public class DataPersistenceModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.datapersistence.DataPersistenceImpl";

    IDataPersistence instance;


    @Override
    public IDataPersistence get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new IDataPersistenceAdapter();
        }
        return instance;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
