package com.ms.module.supers.inter.module;

import com.ms.module.supers.inter.supers.ISupers;

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
        try {
            Class<?> aClass = Class.forName(clazz);
            Object o = aClass.newInstance();
            if (o != null) {
                return (T) o;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}