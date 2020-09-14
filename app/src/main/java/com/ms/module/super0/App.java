package com.ms.module.super0;

import android.app.Application;

import com.ms.module.supers.client.Modules;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 获取日志模块
        Modules.getLogModule();

        // 获取工具类模块
        Modules.getUtilsModule();

        // 阿里云日志模块
        Modules.getAliyuLogModule();

        // 数据模块
        Modules.getDataModule();

        // 获取APP数据
        Modules.getDataModule().getAppData();
    }
}