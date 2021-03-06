package com.epienriz.hengruicao.wifidatacollector.data;

import android.net.wifi.ScanResult;

/**
 * Created by hengruicao on 5/22/16.
 */
public class ScanResultFilter {
    String[] ssids = new String[]{
            "eduroam", "Alumni"
    };

    public boolean filter(ScanResult result) {
        for (String ssid : ssids) {
            if (result.SSID.compareToIgnoreCase(ssid) == 0) {
                return true;
            }
        }
        return false;
    }
}
