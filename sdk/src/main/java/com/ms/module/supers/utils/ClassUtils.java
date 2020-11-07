package com.ms.module.supers.utils;

/**
 * 反射实例化工具类
 */
public class ClassUtils {

    public static <T> T instance(String clazz) {
        try {
            Class<?> aClass = Class.forName(clazz);
            return (T) aClass.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
