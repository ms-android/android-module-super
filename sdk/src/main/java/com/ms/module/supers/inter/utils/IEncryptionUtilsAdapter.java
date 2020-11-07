package com.ms.module.supers.inter.utils;

public class IEncryptionUtilsAdapter implements IEncryptionUtils {


    @Override
    public IStringUtils getStringUtils() {
        return null;
    }

    @Override
    public IMD5Utils getMD5Utils() {
        return null;
    }

    @Override
    public IRsaUtils getRsaUtils() {
        return null;
    }

    @Override
    public ISHAUtils getSHAUtils() {
        return null;
    }
}
