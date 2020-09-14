package com.ms.module.supers.inter.log;


import com.ms.module.supers.inter.supers.ISupers;

/**
 * 日志接口
 */
public interface ILog extends ISupers {

    /**
     * 是否发送给阿里云日志
     * @param f
     */

    void setAliyunSend(boolean f);

    /**
     * @param log
     */
    void print(String log);

    /**
     * @param log
     */
    void println(String log);

    /**
     * @param tag
     * @param log
     */
    void i(String tag, String log);

    /**
     * @param tag
     * @param log
     */
    void d(String tag, String log);

    /**
     * @param tag
     * @param log
     */
    void e(String tag, String log);

    /**
     * @param tag
     * @param log
     */
    void xml(String tag, String log);

    /**
     * @param tag
     * @param log
     */
    void json(String tag, String log);
}
