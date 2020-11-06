package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.request.IRequest;
import com.ms.module.supers.inter.request.IRequestAdapter;

/**
 * 请求
 */
public class RequestModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.request.RequestImpl";

    private IRequest instance;


    @Override
    public IRequest get() {
        if (instance != null) {
            return instance;
        }
        instance = instance(CLASSPATH);

        if (instance == null) {
            instance = new IRequestAdapter();
        }
        return instance;
    }
}