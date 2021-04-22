package com.tcn.romate.log;

import com.blankj.utilcode.util.LogUtils;
import com.tcn.romate.ALog;

public class TcnLog {

    public static void LoggerInfo(String tag, String msg) {
        // LogUtils.aTag(tag, msg);
        ALog.aTag("",tag +" "+ msg);
    }

}
