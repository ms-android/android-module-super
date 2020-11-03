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


    /**
     * Android 打开文件的工具类
     *
     * @return
     */
    IAndroidOpenFileUtils getAndroidOpenFileUtils();


    /**
     * Android 分享文件的工具类
     *
     * @return
     */
    IAndroidShareUtils getAndroidShareFileUtils();


    /**
     * 字节单位装换工具类
     *
     * @return
     */
    IByteSizeToStringUnitUtils getByteSizeToStringUnitUtils();


    /**
     * 获取保存图片到相册的工具类
     *
     * @return
     */
    IAndroidPhotoAlbumUtils getAndroidPhotoAlbumUtils();


    /**
     * 获取文件工具类
     *
     * @return
     */
    IFileUtils getFileUtils();


}
