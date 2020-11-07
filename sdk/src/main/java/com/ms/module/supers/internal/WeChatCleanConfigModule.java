package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.wechat.IWeChatClearConfig;
import com.ms.module.supers.inter.wechat.IWeChatClearConfigAdapter;

public class WeChatClearConfigModule extends ModuleAdapter {
    private static final String CLASSPATH = "com.ms.module.impl.wechat.WeChatClearConfigImpl";

    private IWeChatClearConfig clearConfig;

    @Override
    public IWeChatClearConfig get() {
        if (clearConfig != null) {
            return clearConfig;
        }
        clearConfig = instance(CLASSPATH);
        if (clearConfig == null) {
            clearConfig = new IWeChatClearConfigAdapter();
        }
        return clearConfig;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}