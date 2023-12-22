package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Looper;

public class zzgc extends Handler {
    public zzgc() {
        Looper.getMainLooper();
    }

    public zzgc(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public zzgc(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
