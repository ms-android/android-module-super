package com.ms.module.supers.inter.datapersistence;



import com.ms.module.supers.inter.supers.ISupers;

public interface IDataPersistence extends ISupers {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);

}
