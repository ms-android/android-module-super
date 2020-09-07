package com.ms.module.super0;

import android.app.Application;

import com.ms.module.supers.client.Modules;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();




        Modules.getLogModule();


    }

}
