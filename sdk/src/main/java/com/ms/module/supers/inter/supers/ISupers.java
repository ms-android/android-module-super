package com.ms.module.supers.inter.supers;

public interface ISupers {

    /**
     * 警告
     *
     * @param text
     */
    default void warning(String text) {
        System.out.println(text);
    }

    /**
     * 模块名称
     *
     * @return
     */
    default String name() {
        return null;
    }

    /**
     * 发布时间
     *
     * @return
     */
    default String releaseDate() {
        return null;
    }

    /**
     * 发布版本
     *
     * @return
     */
    default String version() {
        return null;
    }

    /**
     * 依赖名称
     *
     * @return
     */
    default String dependencies() {
        return null;
    }


}