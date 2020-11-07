package com.ms.module.supers.inter.utils;

import com.ms.module.supers.inter.supers.ISupers;

/**
 * 加密工具类
 */
public interface IEncryptionUtils extends ISupers {

    IStringUtils getStringUtils();

    IMD5Utils getMD5Utils();

    IRsaUtils getRsaUtils();

    ISHAUtils getSHAUtils();

}
