package com.ms.module.supers.inter.utils;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 字符串加密工具类
 */
public interface IEncryptionUtils extends ISupers {

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
