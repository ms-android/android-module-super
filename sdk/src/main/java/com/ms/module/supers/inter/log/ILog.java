package com.ms.module.supers.inter.log;



import com.ms.module.supers.inter.supers.ISupers;

public interface ILog extends ISupers {


    void setAliyunSend(boolean f);

    void print(String log);

    void println(String log);

    void i(String tag, String log);

    void d(String tag, String log);

    void e(String tag, String log);

    void xml(String tag, String log);

    void json(String tag, String log);

}
