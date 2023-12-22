package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.lifecycle.c0;
import r3.o;
import w3.a;

public final class gg {

    /* renamed from: a  reason: collision with root package name */
    public final String f7334a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7335b;

    public gg(Context context, String str) {
        o.e(str);
        this.f7334a = str;
        try {
            byte[] a10 = a.a(context, str);
            if (a10 == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f7335b = null;
                return;
            }
            this.f7335b = c0.e(a10);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f7335b = null;
        }
    }
}
