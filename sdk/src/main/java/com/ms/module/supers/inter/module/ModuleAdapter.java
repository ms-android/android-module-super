package com.ms.module.supers.inter.module;


import com.ms.module.supers.inter.supers.ISupers;

public class ModuleAdapter implements Module {
    @Override
    public String name() {
        return null;
    }

    @Override
    public ISupers get() {
        return null;
    }

    protected Object loaderClass(String classpath) {

        Class<?> aClass = null;
        try {
            aClass = Class.forName(classpath);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object o = null;
        try {
            if (aClass != null) {
                o = aClass.newInstance();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return o;
    }
}