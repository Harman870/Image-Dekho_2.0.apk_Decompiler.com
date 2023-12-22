package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

final class zza extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f2758a;

    public zza(HashMap hashMap) {
        this.f2758a = hashMap;
    }

    public final void run() {
        Map map = this.f2758a;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
