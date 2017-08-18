package com.wilddog.conversation.utils;

import android.os.Environment;

/**
 * Created by fly on 17-6-9.
 */

public final class Contants {
    public static final int AUTO_SKIP_TIME = 2000;
    //
    //public static final String APP_ID = "wd6029736988xhigqo";
    //public static final String APP_ID = "wd7095075756axmzrk";
    public static final String APP_ID = "wd6029736988xhigqo";
    public static final String INVITE_CANCEL = "com.wilddog.conversation.inviteCancel";
    //TuSDK key
    public static final String TUSDK_KEY = /*<TU_SDK_KEY>*/"eb73513fb59037c3-00-f8g7r1";


    //Camera360 key
    public static final String SDK_KEY_NEW = /*<CAMERA_360_KEY>*/"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";
    //滤镜列表 17/02/27
    public static String[] mFilterName = {"深度美白", "清新丽人", "暖暖阳光", "香艳红唇", "艺术黑白", "温暖", "果冻", "甜美", "唯美", "淡雅", "清新", "电影（Lomo）", "电影色FM2", "电影色FM7", "Vista"};
    public static String[] mFilterType = {"Deep", "Skinfresh", "Sunshine", "Sexylips", "Skinbw", "Lightwarm", "Jelly", "Sweet", "Grace", "Elegant", "Fresh",
            "Movie", "FM2", "FM7", "Vista"};
    public static final boolean IS_HAS_STICKER = false;

    //录制视频存储路径
    public static  String filePath = Environment.getExternalStorageDirectory().getPath()+"/wilddogConversaton/";
}
