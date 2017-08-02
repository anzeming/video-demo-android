package com.wilddog.demo.utils;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;

import java.io.File;

/**
 * Created by fly on 17-8-2.
 */

public class ExtractVideoInfoUtil {
    private MediaMetadataRetriever mMetadataRetriever;
    private long fileLength = 0;//毫秒
    public ExtractVideoInfoUtil(String path) {
        if (TextUtils.isEmpty(path)) {
            throw new RuntimeException("path must be not null !");
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException("path file   not exists !");
        }
        mMetadataRetriever = new MediaMetadataRetriever();
        mMetadataRetriever.setDataSource(file.getAbsolutePath());
        String len = getVideoLength();
        fileLength = TextUtils.isEmpty(len) ? 0 : Long.valueOf(len);
    }

    /***
     * 获取视频的长度时间
     *
     * @return String 毫秒
     */
    public String getVideoLength() {
        return mMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
    }
    public void release() {
        if (mMetadataRetriever != null) {
            mMetadataRetriever.release();
        }
    }

}