package com.ms.module.supers.inter.module;


import com.ms.module.supers.inter.supers.ISupers;

public interface Module extends ISupers {

    ISupers get();

    String name();

}
