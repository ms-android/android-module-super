package com.ms.module.supers.inter.module;


import com.ms.module.supers.inter.supers.ISupers;

/**
 * 模块接口
 */
public interface Module extends ISupers {

    /**
     * 实例化模块
     *
     * @return
     */
    ISupers get();

    /**
     * 模块名称
     *
     * @return
     */
    String name();

}
