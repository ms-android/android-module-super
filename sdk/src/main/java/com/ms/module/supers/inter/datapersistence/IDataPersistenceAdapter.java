package com.ms.module.supers.inter.datapersistence;

public class IDataPersistenceAdapter implements IDataPersistence {

    @Override
    public IDataPersistence getInstance(String fileName) {
        return null;
    }

    @Override
    public void put(String k, String v) {

    }

    @Override
    public String get(String k) {
        return null;
    }

    @Override
    public void removeKey(String key) {

    }
}
