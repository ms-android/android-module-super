package com.ms.module.supers.inter.utils;

import java.io.File;
import java.util.List;

public class IFileUtilsAdapter implements IFileUtils {

    @Override
    public void copyFile(String sourcePath, String targerPath) {

    }

    @Override
    public void copyFile(File sourceFile, File targerFile) {

    }

    @Override
    public void deleteFile(String path) {

    }

    @Override
    public void deleteFile(File file) {

    }

    @Override
    public void deletes(String... paths) {

    }

    @Override
    public void deletes(File... files) {

    }

    @Override
    public void deletes(List<String> paths) {

    }

    @Override
    public List<String> searchToStrings(String path) {
        return null;
    }

    @Override
    public List<File> searchToFiles(String path) {
        return null;
    }

    @Override
    public List<String> searchToStrings(String path, String filter) {
        return null;
    }

    @Override
    public List<File> searchToFiles(String path, String filter) {
        return null;
    }

    @Override
    public long fileLengnth(String path) {
        return 0;
    }

    @Override
    public long fileLengnths(String... path) {
        return 0;
    }

    @Override
    public long fileLengnth(File file) {
        return 0;
    }

    @Override
    public long fileLengnths(File... file) {
        return 0;
    }

    @Override
    public long lastModified(String path) {
        return 0;
    }

    @Override
    public long lastModified(File file) {
        return 0;
    }
}
