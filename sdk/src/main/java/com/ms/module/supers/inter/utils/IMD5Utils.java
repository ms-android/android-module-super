package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

/**
 * md5 工具类
 */
public interface IMD5Utils extends ISupers {
    /**
     * md5 加密
     *
     * @param s
     * @return
     */
    String md5(String s);
}
