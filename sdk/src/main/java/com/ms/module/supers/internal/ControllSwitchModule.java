package com.ms.module.supers.internal;

import com.ms.module.supers.inter.controll.IControlSwitch;
import com.ms.module.supers.inter.controll.IControllSwitchAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * 内部开关
 */
public class ControllSwitchModule extends ModuleAdapter {


    private static final String CLASSPATH = "com.ms.module.impl.controllswitch.ControllSwitchImpl";

    IControlSwitch instance;

    @Override
    public IControlSwitch get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IControllSwitchAdapter();
        }

        return instance;
    }


    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
