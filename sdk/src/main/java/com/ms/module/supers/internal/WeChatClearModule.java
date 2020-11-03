package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.utils.IUtils;
import com.ms.module.supers.inter.wechat.IWeChatClear;
import com.ms.module.supers.inter.wechat.IWeChatClearAdapter;

public class WeChatClearModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.wechat.WeChatClearImpl";

    private IWeChatClear clear;

    @Override
    public IWeChatClear get() {
        if (clear == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof IUtils) {
                    clear = (IWeChatClear) o;
                    if (clear != null) {
                        return clear;
                    } else {
                        clear = new IWeChatClearAdapter();
                        return clear;
                    }
                } else {
                    clear = new IWeChatClearAdapter();
                    return clear;
                }
            } else {
                clear = new IWeChatClearAdapter();
            }
        }
        return clear;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
