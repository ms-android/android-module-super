package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.wechat.IWeChatCleanConfig;
import com.ms.module.supers.inter.wechat.IWeChatCleanConfigAdapter;

public class WeChatCleanConfigModule extends ModuleAdapter {
    private static final String CLASSPATH = "com.ms.module.impl.wechat.WeChatClearConfigImpl";

    private IWeChatCleanConfig clearConfig;

    @Override
    public IWeChatCleanConfig get() {
        if (clearConfig != null) {
            return clearConfig;
        }
        clearConfig = instance(CLASSPATH);
        if (clearConfig == null) {
            clearConfig = new IWeChatCleanConfigAdapter();
        }
        return clearConfig;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}