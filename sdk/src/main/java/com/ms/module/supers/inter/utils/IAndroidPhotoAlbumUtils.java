package com.ms.module.supers.inter.utils;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.File;

public interface IAndroidPhotoAlbumUtils {

    /**
     * 保存图片到 相册 Camera
     *
     * @param context
     * @param bitmap
     * @param name
     */
    void saveBitmap2Gallery(Context context, Bitmap bitmap, String name);

    void saveBitmap2Gallery(Context context, String filePath);

    void saveBitmap2Gallery(Context context, File file);


    void saveVideo2Gallert(Context context, File file);


}
