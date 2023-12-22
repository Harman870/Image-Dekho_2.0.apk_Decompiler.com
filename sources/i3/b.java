package i3;

import android.util.Log;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzfc;
import java.util.ArrayList;
import java.util.HashSet;

public final class b extends g {

    /* renamed from: i  reason: collision with root package name */
    public static ArrayList f7122i = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f7123f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7124g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7125h;

    public b(zzbx zzbx) {
        super(zzbx);
        new HashSet();
    }

    @Deprecated
    public final void a(e eVar) {
        zzfc.zzc(eVar);
        if (!this.f7125h) {
            zzev zzev = zzew.zzc;
            Log.i((String) zzev.zzb(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzev.zzb()) + " DEBUG");
            this.f7125h = true;
        }
    }
}
