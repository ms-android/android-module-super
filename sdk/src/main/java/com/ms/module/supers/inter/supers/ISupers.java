package com.ms.module.supers.inter.supers;

public interface ISupers {

    default void warning(String text) {
        System.out.println(text);
    }
}