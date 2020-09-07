package com.ms.module.supers.inter.utils;



import com.ms.module.supers.inter.supers.ISupers;

public interface IUtils extends ISupers {

    IApkUtils getApkUtils();

    IToastUtils getToastUtils();

    IEncryptionUtils getEncryptionUtils();

    IThreadPoolUtils getThreadPoolUtils();

    IMD5Utils getMd5Utils();

    IGsonUtils getGsonUtils();

    INetWorkUtils getNetWorkUtils();

    IRegexUtils getRegexUtils();

    IResUtils getResUtils();

    ISystemUtils getSystemUtils();

    IPinyinUtils getPinyinUtils();

}
