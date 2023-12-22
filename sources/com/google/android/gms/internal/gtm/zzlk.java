package com.google.android.gms.internal.gtm;

import r3.o;

public final class zzlk extends zzjy {
    public final zzqz zza(zzie zzie, zzqz... zzqzArr) {
        o.b(zzqzArr.length == 1);
        o.b(!(zzqzArr[0] instanceof zzri));
        o.b(!zzrl.zzi(zzqzArr[0]));
        zzrd zzrd = zzqzArr[0];
        return new zzrk(zzrd == zzrd.zze ? "undefined" : zzrd instanceof zzra ? "boolean" : zzrd instanceof zzrb ? "number" : zzrd instanceof zzrk ? "string" : zzrd instanceof zzrc ? "function" : "object");
    }
}
