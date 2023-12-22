package com.google.android.gms.internal.gtm;

import java.util.Locale;
import r3.o;

public final class zzoi implements zzjw {
    public final zzqz zzd(zzie zzie, zzqz... zzqzArr) {
        boolean z9 = true;
        o.b(zzqzArr != null);
        if (zzqzArr.length != 0) {
            z9 = false;
        }
        o.b(z9);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new zzrk("");
        }
        String language = locale.getLanguage();
        return language == null ? new zzrk("") : new zzrk(language.toLowerCase());
    }
}
