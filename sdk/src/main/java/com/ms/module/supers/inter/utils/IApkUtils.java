package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

public interface IApkUtils  extends ISupers {
    String getAppName();

    String getVersionCode();

    String getVersionName();

    boolean isPackageInstalled(String packageName);

    String getMeta(String k);

    boolean isDebug();

    String getPackageName();
}
