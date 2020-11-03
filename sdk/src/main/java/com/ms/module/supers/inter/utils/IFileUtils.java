package com.ms.module.supers.inter.utils;

import java.io.File;
import java.util.List;

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


    /**
     * 删除文件
     *
     * @param paths
     */
    void deletes(String... paths);

    /**
     * 删除文件
     *
     * @param files
     */
    void deletes(File... files);


    /**
     * 删除文件
     *
     * @param paths
     */
    void deletes(List<String> paths);


    /**
     * @param path
     * @return
     */
    List<String> searchToStrings(String path);

    /**
     * @param path
     * @return
     */
    List<File> searchToFiles(String path);

    /**
     * 搜索文件
     *
     * @param path
     * @param filter
     * @return
     */
    List<String> searchToStrings(String path, String filter);


    /**
     * 搜索文件
     *
     * @param path
     * @param filter
     * @return
     */
    List<File> searchToFiles(String path, String filter);


    /**
     * 获取文件长度
     *
     * @param path
     * @return
     */
    long fileLengnth(String path);

    /**
     * 获取文件长度
     *
     * @param path
     * @return
     */
    long fileLengnths(String... path);

    /**
     * 获取文件长度
     *
     * @param file
     * @return
     */
    long fileLengnth(File file);

    /**
     * 获取文件长度
     *
     * @param file
     * @return
     */
    long fileLengnths(File... file);


    /**
     * 获取文件最后修改时间
     *
     * @param path
     * @return
     */
    long lastModified(String path);

    /**
     * 获取文件最后修改时间
     *
     * @param file
     * @return
     */
    long lastModified(File file);

}
