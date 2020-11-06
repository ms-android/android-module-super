package com.ms.module.supers.internal;

import com.ms.module.supers.inter.bugly.ITencentBugly;
import com.ms.module.supers.inter.bugly.ITencentBuglyAdapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

/**
 * 腾讯异常处理模块
 */
public class TencentBuglyModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.bugly.TencentBuglyImpl";

    private ITencentBugly tencentBugly;

    @Override
    public ITencentBugly get() {
        if (tencentBugly != null) {
            return tencentBugly;
        }
        tencentBugly = instance(CLASSPATH);
        if (tencentBugly == null) {
            tencentBugly = new ITencentBuglyAdapter();
        }
        return tencentBugly;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
