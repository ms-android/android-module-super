package com.ms.module.supers.inter.mmkv;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 腾讯的MMKV存储组件
 */
public interface IMMKV extends ISupers {

    void put(String k, String v);

    String get(String k);

    void removeKey(String key);
}
