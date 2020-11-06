package com.ms.module.supers.internal;

import com.ms.module.supers.inter.module.ModuleAdapter;
import com.ms.module.supers.inter.permission.IPermission;
import com.ms.module.supers.inter.permission.IPermissionAdapter;

/**
 * 权限
 */
public class PermissionModule extends ModuleAdapter {

    private static final String CLASSPATH = "com.ms.module.impl.permission.PermissionImpl";

    private IPermission instance;

    @Override
    public IPermission get() {
        if (instance != null) {
            return instance;
        }

        instance = instance(CLASSPATH);


        if (instance == null) {
            instance = new IPermissionAdapter();
        }

        return instance;
    }
}
