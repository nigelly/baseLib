package com.tcn.romate.skin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import skin.support.content.res.SkinCompatResources;

public class Util {

    public static boolean fileIsExists(String strFile) {


        try {
            File f = new File(strFile);
            if (!f.exists()) {
                return false;
            }

        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static final String PATH_SDCARD = "/mnt/sdcard";

    public static String getExternalStorageDirectory() {

        String dir = new String();

        try {
            File file = new File(PATH_SDCARD);
            if (file.exists() && file.isDirectory()) {
                dir = PATH_SDCARD;
                return dir;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec("mount");
            InputStream is = proc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            String line;
            BufferedReader br = new BufferedReader(isr);
            while ((line = br.readLine()) != null) {
                if (line.contains("secure")) continue;
                if (line.contains("asec")) continue;

                if (line.contains("fat")) {
                    String columns[] = line.split(" ");
                    if (columns != null && columns.length > 1) {
                        dir = columns[1];
                    }
                }
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dir;
    }

    public static View getSkinView(Context context, int resId) {
        //根据主APP的ID获取插件里面的ID
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, resId);
        Log.d("print", "targetResId " + targetResId);
        return LayoutInflater.from(context).inflate(SkinCompatResources.getInstance().getSkinResources().getLayout(targetResId), null);
    }

    public static View getSkinSonView(Context context, int restId) {
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, restId);
        return LayoutInflater.from(context).inflate(SkinCompatResources.getInstance().getSkinResources().getLayout(targetResId), null).findViewById(restId);
    }

    public static String getSkinText(Context context, int resId) {
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, resId);
        if (targetResId != 0) {
            if(SkinCompatResources.getInstance().getSkinResources().getText(targetResId) instanceof String){
                return (String) SkinCompatResources.getInstance().getSkinResources().getText(targetResId);
            }else if(SkinCompatResources.getInstance().getSkinResources().getText(targetResId) instanceof SpannedString) {
                return  SkinCompatResources.getInstance().getSkinResources().getText(targetResId).toString();
            }else {
                return  SkinCompatResources.getInstance().getSkinResources().getText(targetResId).toString();
            }
        }
        return "";
    }

    public static int getSkinSize(Context context, int resId) {
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, resId);
        if (targetResId != 0) {
            return (int) SkinCompatResources.getInstance().getSkinResources().getDimensionPixelSize(targetResId);
        }
        return 0;
    }

    public static int getSkinColor(Context context, int resId) {
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, resId);
        if (targetResId != 0) {
            return (int) SkinCompatResources.getInstance().getSkinResources().getColor(targetResId);
        }
        return 0;
    }

    public static Drawable getSkinDrawable(Context context, int resId) {
        int targetResId = SkinCompatResources.getInstance().getTargetResId(context, resId);
        if (targetResId != 0) {
            return (Drawable) SkinCompatResources.getInstance().getSkinResources().getDrawable(targetResId);
        }
        return null;
    }
}
