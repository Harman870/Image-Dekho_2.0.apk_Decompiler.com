package z6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import r6.c;
import y.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f13228a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13229b;

    public a(Context context, String str, c cVar) {
        boolean z9;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = y.a.f13006a;
        Context a10 = a.d.a(context);
        SharedPreferences sharedPreferences = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f13228a = cVar;
        boolean z10 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z9 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a10.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z9 = z10;
        }
        this.f13229b = z9;
    }
}
