package com.ms.module.supers.inter.utils;


import com.ms.module.supers.inter.supers.ISupers;

public interface IEncryptionUtils  extends ISupers {

    String encode(String src);

    String decode(String src);

}
