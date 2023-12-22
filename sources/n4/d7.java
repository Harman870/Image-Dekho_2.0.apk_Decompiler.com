package n4;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

public final class d7 extends q7 {

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f9700d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final t3 f9701e;

    /* renamed from: f  reason: collision with root package name */
    public final t3 f9702f;

    /* renamed from: g  reason: collision with root package name */
    public final t3 f9703g;

    /* renamed from: h  reason: collision with root package name */
    public final t3 f9704h;

    /* renamed from: i  reason: collision with root package name */
    public final t3 f9705i;

    public d7(w7 w7Var) {
        super(w7Var);
        w3 r4 = this.f9600a.r();
        r4.getClass();
        this.f9701e = new t3(r4, "last_delete_stale", 0);
        w3 r10 = this.f9600a.r();
        r10.getClass();
        this.f9702f = new t3(r10, "backoff", 0);
        w3 r11 = this.f9600a.r();
        r11.getClass();
        this.f9703g = new t3(r11, "last_upload", 0);
        w3 r12 = this.f9600a.r();
        r12.getClass();
        this.f9704h = new t3(r12, "last_upload_attempt", 0);
        w3 r13 = this.f9600a.r();
        r13.getClass();
        this.f9705i = new t3(r13, "midnight_offset", 0);
    }

    public final void j() {
    }

    @Deprecated
    public final Pair k(String str) {
        c7 c7Var;
        g();
        this.f9600a.f9998n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c7 c7Var2 = (c7) this.f9700d.get(str);
        if (c7Var2 != null && elapsedRealtime < c7Var2.f9664c) {
            return new Pair(c7Var2.f9662a, Boolean.valueOf(c7Var2.f9663b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long l6 = this.f9600a.f9992g.l(str, w2.f10207b) + elapsedRealtime;
        try {
            long l10 = this.f9600a.f9992g.l(str, w2.f10209c);
            AdvertisingIdClient.Info info = null;
            if (l10 > 0) {
                try {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.f9600a.f9986a);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c7Var2 != null) {
                        if (elapsedRealtime < c7Var2.f9664c + l10) {
                            return new Pair(c7Var2.f9662a, Boolean.valueOf(c7Var2.f9663b));
                        }
                    }
                }
            } else {
                info = AdvertisingIdClient.getAdvertisingIdInfo(this.f9600a.f9986a);
            }
            if (info == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = info.getId();
            if (id != null) {
                c7Var = new c7(id, info.isLimitAdTrackingEnabled(), l6);
            } else {
                c7Var = new c7("", info.isLimitAdTrackingEnabled(), l6);
            }
            this.f9700d.put(str, c7Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(c7Var.f9662a, Boolean.valueOf(c7Var.f9663b));
        } catch (Exception e10) {
            this.f9600a.a().f9834m.b("Unable to get advertising id", e10);
            c7Var = new c7("", false, l6);
        }
    }

    @Deprecated
    public final String l(String str, boolean z9) {
        g();
        String str2 = z9 ? (String) k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest o10 = d8.o();
        if (o10 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, o10.digest(str2.getBytes()))});
    }
}
