package com.ms.module.supers.inter.controll;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 模块内部开关控制
 */
public interface IControlSwitch extends ISupers {

    /**
     * 设置日志是否输出
     *
     * @param flag
     */
    void setLogOut(boolean flag);


    /**
     * 获取日志输出状态
     *
     * @return
     */
    boolean getLogOut();

    /**
     * 日志是否发送给阿里云日志
     *
     * @param f
     */

    void setAliyunSend(boolean f);


    /**
     * 是否打印堆栈信息
     *
     * @param flag
     */
    void setPrintStackTrace(boolean flag);

    /**
     * 获取打印堆栈信息
     *
     * @return
     */
    boolean getPrintStackTrace();


    /**
     * 网络请求日志是否输出
     *
     * @param flag
     */
    void setRequestLog(boolean flag);

    /**
     * 获取网络请求日志
     *
     * @return
     */
    boolean getRequestLog();


    /**
     * 设置是否上报给腾讯BUGLY
     *
     * @param flag
     */
    void setTencentBugly(boolean flag);


    /**
     * 获取是否上报给腾讯BUGLY
     *
     * @return
     */
    boolean getTencentBugly();

}