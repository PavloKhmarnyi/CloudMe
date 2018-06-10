package com.example.cloudme.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

/**
 * Created by Illya Havrulyk on 4/22/2018.
 */

public class PermissionManager {

    public static void requestPermissions(Activity activity) {
        if (!isPermissions(activity)) {
            ActivityCompat.requestPermissions(activity, new String[]{ Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION },
                    Utils.PERMISSION_REQUEST_CODE);
        }
    }

    public static boolean isPermissions(Context context) {
        return ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED;
    }
}

