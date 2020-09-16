package com.ms.module.supers.internal;

import com.ms.module.supers.inter.login3.ILogin3;
import com.ms.module.supers.inter.login3.ILogin3Adapter;
import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.pay.IPay3;
import com.ms.module.supers.inter.pay.IPay3Adapter;

public class Pay3Module extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.pay3.Pay3Impl";

    private IPay3 pay3;

    @Override
    public IPay3 get() {
        if (pay3 == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ILogin3) {
                    pay3 = (IPay3) o;
                    if (pay3 != null) {
                        return pay3;
                    } else {
                        pay3 = new IPay3Adapter();
                        return pay3;
                    }
                }
            } else {
                pay3 = new IPay3Adapter();
                return pay3;
            }
        }
        return pay3;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}