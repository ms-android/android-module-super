package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

import java.util.List;
import java.util.Map;

public interface ISystemUtils extends ISupers {

    /**
     * 是否是手机
     *
     * @return
     */
    boolean isMobilePhone();

    /**
     * 获取IP地址
     *
     * @return
     */
    String getIp();

    /**
     * 获取IMEI
     *
     * @return
     */
    String getImei();

    /**
     * 获取AndroidID
     *
     * @return
     */
    String getAndroidId();

    /**
     * 获取MAC地址
     *
     * @return
     */
    String getMac();

    /**
     * 获取IPV6地址
     *
     * @return
     */
    String getIpV6();


    /**
     * 获取用户手机上已经安装的非系统自带APP列表
     *
     * @return
     */
    List<Map<String, String>> getAppList();


    /**
     * 获取正在运行的应用程序
     *
     * @return
     */
    List<Map<String, String>> getRunningProcess();


    /**
     * 获取CPU名称
     *
     * @return
     */
    String getCpuName();

    /**
     * @return
     */
    String printResolution();

    /**
     * CPU架构
     *
     * @return
     */
    String getCpuAbi();

    /**
     * 产品
     *
     * @return
     */
    String getProduct();

    /**
     * 获取系统类型
     *
     * @return
     */
    String getOsType();

    /**
     * 获取系统版本
     *
     * @return
     */
    String getOSVersion();

    /**
     * @return
     */
    String getBrand();

    /**
     * 获取SSID
     *
     * @return
     */
    String getSSID();

    /**
     * 获取语言
     *
     * @return
     */
    String getCurrentLanguage();

    /**
     * 获取时间
     *
     * @return
     */
    String getCurrentTimeZone();

    /**
     * 获取进程名称
     *
     * @return
     */
    String getProcessName();

}
