package com.iab.omid.library.ironsrc.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.ironsrc.adsession.DeviceCategory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static UiModeManager f3585a;

    public static DeviceCategory a() {
        int currentModeType = f3585a.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f3585a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
