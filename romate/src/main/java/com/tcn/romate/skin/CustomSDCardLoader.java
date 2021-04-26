package com.tcn.romate.skin;

import android.content.Context;

import com.blankj.utilcode.util.Utils;

import java.io.File;

import skin.support.load.SkinSDCardLoader;
import skin.support.utils.SkinFileUtils;

public class CustomSDCardLoader extends SkinSDCardLoader {
    public static final int SKIN_LOADER_STRATEGY_SDCARD = Integer.MAX_VALUE;

    public static String m_strAdvertPath = "/TcnFolder/skins";

    @Override
    protected String getSkinPath(Context context, String skinName) {
        String mExternalPath = Util.getExternalStorageDirectory();
        if (null == mExternalPath) {
            return "";
        }
        String folderPath = mExternalPath + m_strAdvertPath;
        return new File(folderPath, skinName).getAbsolutePath();
    }

    @Override
    public int getType() {
        return SKIN_LOADER_STRATEGY_SDCARD;
    }
}