package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class TagManagerService extends Service {
    @KeepName
    @Keep
    public static void initialize(Context context) {
        zzbo.zze(context);
    }

    public IBinder onBind(Intent intent) {
        return zzbo.zza(this);
    }
}
