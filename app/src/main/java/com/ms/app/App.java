package com.ms.app;

import android.app.Application;
import android.util.Log;

import com.ms.module.supers.client.ModuleSuperFirmwareInformation;
import com.ms.module.supers.client.Modules;
import com.ms.module.supers.inter.module.Module;

public class App extends Application {


    private static final String TAG = "App";

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

        // 微信清理模块
        Modules.getWeChatClearModule();




    }
}