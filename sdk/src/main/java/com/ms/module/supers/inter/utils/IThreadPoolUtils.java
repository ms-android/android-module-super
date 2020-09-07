package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

public interface IThreadPoolUtils extends ISupers {

    //运行在主线程
    void runOnMainThread(Runnable runnable);

    void runSubThread(Runnable runnable);

    void kill();
}
