package com.ms.module.supers.inter.utils;

public interface IStringUtils {


    /**
     * 字符串加密
     *
     * @param src
     * @return
     */
    String encode(String src);

    /**
     * 字符串解密
     *
     * @param src
     * @return
     */
    String decode(String src);

}
