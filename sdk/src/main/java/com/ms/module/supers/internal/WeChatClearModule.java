package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.wechat.IWeChatClear;
import com.ms.module.supers.inter.wechat.IWeChatClearAdapter;

public class WeChatClearModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.wechat.WeChatClearImpl";

    private IWeChatClear instance;

    @Override
    public IWeChatClear get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);
        if (instance == null) {
            instance = new IWeChatClearAdapter();
        }
        return instance;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
