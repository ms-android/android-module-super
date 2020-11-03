package com.ms.module.supers.inter.utils;

import java.io.File;

public interface IFileUtils {

    /**
     * 拷贝文件
     *
     * @param sourcePath
     * @param targerPath
     */
    void copyFile(String sourcePath, String targerPath);

    /**
     * 拷贝文件
     *
     * @param sourceFile
     * @param targerFile
     */
    void copyFile(File sourceFile, File targerFile);

    /**
     * 删除文件
     *
     * @param path
     */
    void deleteFile(String path);

    /**
     * 删除文件
     *
     * @param file
     */
    void deleteFile(File file);


}
