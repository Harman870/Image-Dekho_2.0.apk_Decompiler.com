package com.google.android.gms.internal.gtm;

import androidx.fragment.app.w0;

final class zzso {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException(w0.d("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
