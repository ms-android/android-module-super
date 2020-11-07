package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.wechat.IWeChatClean;
import com.ms.module.supers.inter.wechat.IWeChatCleanAdapter;

public class WeChatCleanModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.wechat.WeChatClearImpl";

    private IWeChatClean instance;

    @Override
    public IWeChatClean get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new IWeChatCleanAdapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
