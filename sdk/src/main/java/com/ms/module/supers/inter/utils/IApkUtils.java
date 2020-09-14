package com.ms.module.supers.inter.utils;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * APK工具类
 */
public interface IApkUtils extends ISupers {
    /**
     * 获取APP名称
     *
     * @return
     */
    String getAppName();

    /**
     * 获取版本号
     *
     * @return
     */
    String getVersionCode();

    /**
     * 获取版本名称
     *
     * @return
     */
    String getVersionName();

    /**
     * 检查是否安装了 @param packageName 应用
     *
     * @param packageName
     * @return
     */
    boolean isPackageInstalled(String packageName);

    /**
     * 获取 k 配置信息
     *
     * @param k
     * @return
     */
    String getMeta(String k);

    /**
     * 是否为debug
     *
     * @return
     */
    boolean isDebug();

    /**
     * 获取报名称
     *
     * @return
     */
    String getPackageName();
}
