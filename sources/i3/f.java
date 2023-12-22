package i3;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import r3.o;

public final class f extends zzbu {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7131a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7132b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7133c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final zzfb f7134d;

    /* renamed from: e  reason: collision with root package name */
    public final x f7135e;

    public f(zzbx zzbx) {
        super(zzbx);
        HashMap hashMap = new HashMap();
        this.f7132b = hashMap;
        hashMap.put("&tid", "_GTM_DEFAULT_TRACKER_");
        hashMap.put("useSecure", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f7134d = new zzfb(60, 2000, "tracking", zzC());
        this.f7135e = new x(zzbx);
    }

    public static void j(Map map, HashMap hashMap) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String o10 = o(entry);
                if (o10 != null) {
                    hashMap.put(o10, (String) entry.getValue());
                }
            }
        }
    }

    public static String o(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith("&") || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    public final void c(Map<String, String> map) {
        boolean z9;
        zzfd zzfd;
        String str;
        long currentTimeMillis = zzC().currentTimeMillis();
        zzp().getClass();
        boolean z10 = zzp().f7124g;
        HashMap hashMap = new HashMap();
        j(this.f7132b, hashMap);
        j(map, hashMap);
        String str2 = (String) this.f7132b.get("useSecure");
        int i10 = 1;
        if (str2 == null || str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("yes") || str2.equalsIgnoreCase(IronSourceConstants.BOOLEAN_TRUE_AS_STRING) || (!str2.equalsIgnoreCase("false") && !str2.equalsIgnoreCase("no") && !str2.equalsIgnoreCase("0"))) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (Map.Entry entry : this.f7133c.entrySet()) {
            String o10 = o(entry);
            if (o10 != null && !hashMap.containsKey(o10)) {
                hashMap.put(o10, (String) entry.getValue());
            }
        }
        this.f7133c.clear();
        String str3 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str3)) {
            zzfd = zzz();
            str = "Missing hit type parameter";
        } else {
            String str4 = (String) hashMap.get("tid");
            if (!TextUtils.isEmpty(str4)) {
                boolean z11 = this.f7131a;
                synchronized (this) {
                    if ("screenview".equalsIgnoreCase(str3) || "pageview".equalsIgnoreCase(str3) || "appview".equalsIgnoreCase(str3) || TextUtils.isEmpty(str3)) {
                        String str5 = (String) this.f7132b.get("&a");
                        o.h(str5);
                        int parseInt = Integer.parseInt(str5) + 1;
                        if (parseInt < Integer.MAX_VALUE) {
                            i10 = parseInt;
                        }
                        this.f7132b.put("&a", Integer.toString(i10));
                    }
                }
                t zzq = zzq();
                w wVar = new w(this, hashMap, z11, str3, currentTimeMillis, z10, z9, str4);
                zzq.getClass();
                zzq.f7164c.submit(wVar);
                return;
            }
            zzfd = zzz();
            str = "Missing tracking id parameter";
        }
        zzfd.zzc(hashMap, str);
    }

    public final void zzd() {
        this.f7135e.zzW();
        String zza = zzB().zza();
        if (zza != null && !TextUtils.isEmpty("&an")) {
            this.f7132b.put("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null && !TextUtils.isEmpty("&av")) {
            this.f7132b.put("&av", zzb);
        }
    }
}
