package com.ms.module.supers.inter.utils;

import android.content.Context;

import java.io.File;

public interface IAndroidShareUtils {

    void shareFile(Context context, File file);

    void shareFile(Context context, String path);

    void shareFiles(Context context, File... files);

    void shareFiles(Context context, String... paths);

}


