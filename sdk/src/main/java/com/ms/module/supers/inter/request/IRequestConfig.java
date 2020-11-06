package com.ms.module.supers.inter.request;

import com.ms.module.supers.inter.supers.ISupers;

public interface IRequestConfig extends ISupers {


    /**
     * 设置连接超时时间
     *
     * @param value
     */
    void setConnectTimeout(int value);

    default int getConnectTimeout() {
        return 10;
    }

    /**
     * 设置读取超时时间
     *
     * @param value
     */
    void setReadTimeout(int value);

    default int getReadTimeout() {
        return 10;
    }

    /**
     * 设置写入超时时间
     *
     * @param value
     */
    void setWriteTimeout(int value);

    default int getWriteTimeout() {
        return 10;
    }

    /**
     * 设置请求日志是否输出
     *
     * @param flag
     */
    void setRequestLogOut(boolean flag);

    boolean getRequestLogOut();

}
