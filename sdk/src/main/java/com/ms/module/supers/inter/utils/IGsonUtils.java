package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

import java.lang.reflect.Type;

/**
 * Gson 工具类
 */

public interface IGsonUtils extends ISupers {
    /**
     * 将对象转化为字符串
     *
     * @param object
     * @return
     */
    String toJson(Object object);

    /**
     * 将字符串解析为对象
     *
     * @param json
     * @param classOfT
     * @param <T>
     * @return
     */
    <T> T fromJson(String json, Class<T> classOfT);

    /**
     * 将字符串解析为对象
     *
     * @param json
     * @param typeOfT
     * @param <T>
     * @return
     */
    <T> T fromJson(String json, Type typeOfT);
}

