package jp.ac.hal.unityandroidplugin

import android.os.Environment


/**
 * Created by pasuco on 2017/10/10.
 */

fun getFilePath(): String {
    return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).absolutePath
}