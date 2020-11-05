package com.ms.module.supers.inter.datapersistence;


import com.ms.module.supers.inter.supers.ISupers;

public interface IDataPersistence extends ISupers {


    /**
     * 获取指定文件的实例
     *
     * @param fileName
     * @return
     */
    IDataPersistence getInstance(String fileName);

    /**
     * 存入指定值
     *
     * @param k
     * @param v
     */
    void put(String k, String v);

    /**
     * 获取指定值
     *
     * @param k
     * @return
     */
    String get(String k);

    /**
     * 删除指定值
     *
     * @param key
     */
    void removeKey(String key);

}
