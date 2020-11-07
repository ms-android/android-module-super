package com.ms.module.supers.inter.module;

import com.ms.module.supers.inter.supers.ISupers;
import com.ms.module.supers.utils.ClassUtils;

/**
 * 模块适配器
 */
public class ModuleAdapter implements Module {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }

    @Override
    public ISupers get() {
        return null;
    }

    public <T> T instance(String clazz) {
        return ClassUtils.instance(clazz);
    }
}