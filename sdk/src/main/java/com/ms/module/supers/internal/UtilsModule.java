package com.ms.module.supers.internal;


import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.utils.IUtils;
import com.ms.module.supers.inter.utils.IUtilsAdapter;

/**
 * 工具类
 */
public class UtilsModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.utils.UtilsImpl";

    private IUtils utils;

    @Override
    public IUtils get() {
        if (utils != null) {
            return utils;
        }
        utils = instance(CLASSPATH);
        if (utils == null) {
            utils = new IUtilsAdapter();
        }
        return utils;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}