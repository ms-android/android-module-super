package com.ms.module.supers.internal;

import com.ms.module.supers.inter.login3.ILogin3;
import com.ms.module.supers.inter.login3.ILogin3Adapter;
import com.ms.module.supers.inter.module.ModuleAdapter;

public class Login3Module extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.login3.Login3Impl";

    private ILogin3 login3;

    @Override
    public ILogin3 get() {
        if (login3 == null) {
            Object o = loaderClass(CLASSPATH);
            if (o != null) {
                if (o instanceof ILogin3) {
                    login3 = (ILogin3) o;
                    if (login3 != null) {
                        return login3;
                    } else {
                        login3 = new ILogin3Adapter();
                        return login3;
                    }
                }
            } else {
                login3 = new ILogin3Adapter();
                return login3;
            }
        }
        return login3;
    }

    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}