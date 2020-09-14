package com.ms.module.supers.inter.utils;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 工具类
 */
public interface IUtils extends ISupers {

    /**
     * APK 工具类
     *
     * @return
     */
    IApkUtils getApkUtils();

    /**
     * 吐司工具类
     *
     * @return
     */
    IToastUtils getToastUtils();

    /**
     * 字符串加密工具类
     *
     * @return
     */
    IEncryptionUtils getEncryptionUtils();

    /**
     * 线程池工具类
     *
     * @return
     */
    IThreadPoolUtils getThreadPoolUtils();

    /**
     * MD5工具类
     *
     * @return
     */
    IMD5Utils getMd5Utils();

    /**
     * Gson工具类
     *
     * @return
     */
    IGsonUtils getGsonUtils();

    /**
     * 网络工具类
     *
     * @return
     */
    INetWorkUtils getNetWorkUtils();

    /**
     * 正则表达式工具类
     *
     * @return
     */
    IRegexUtils getRegexUtils();

    /**
     * 反射资源工具类
     *
     * @return
     */
    IResUtils getResUtils();

    /**
     * 系统工具类
     *
     * @return
     */
    ISystemUtils getSystemUtils();

    /**
     * 拼音工具类
     *
     * @return
     */
    IPinyinUtils getPinyinUtils();
}
