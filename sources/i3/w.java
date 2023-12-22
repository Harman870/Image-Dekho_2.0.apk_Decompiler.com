package i3;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import r3.o;

public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f7167a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7168b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7169c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f7170d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f7171e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f7172f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f7173g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f7174h;

    public w(f fVar, HashMap hashMap, boolean z9, String str, long j10, boolean z10, boolean z11, String str2) {
        this.f7174h = fVar;
        this.f7167a = hashMap;
        this.f7168b = z9;
        this.f7169c = str;
        this.f7170d = j10;
        this.f7171e = z10;
        this.f7172f = z11;
        this.f7173g = str2;
    }

    public final void run() {
        String str;
        double d10;
        synchronized (this.f7174h.f7135e) {
        }
        Map map = this.f7167a;
        b zzp = this.f7174h.zzp();
        o.g("getClientId can not be called from the main thread");
        String zzb = zzp.f7139d.zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str2 = (String) this.f7167a.get("sf");
        if (str2 != null) {
            try {
                d10 = Double.parseDouble(str2);
            } catch (NumberFormatException unused) {
                d10 = 100.0d;
            }
            if (zzfu.zzj(d10, (String) this.f7167a.get("cid"))) {
                this.f7174h.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d10));
                return;
            }
        }
        zzbk zzr = this.f7174h.zzr();
        if (this.f7168b) {
            Map map2 = this.f7167a;
            boolean zzb2 = zzr.zzb();
            if (!map2.containsKey("ate")) {
                if (true != zzb2) {
                    str = "0";
                } else {
                    str = IronSourceConstants.BOOLEAN_TRUE_AS_STRING;
                }
                map2.put("ate", str);
            }
            zzfu.zzg(this.f7167a, "adid", zzr.zza());
        } else {
            this.f7167a.remove("ate");
            this.f7167a.remove("adid");
        }
        zzax zza = this.f7174h.zzu().zza();
        zzfu.zzg(this.f7167a, "an", zza.zzf());
        zzfu.zzg(this.f7167a, "av", zza.zzg());
        zzfu.zzg(this.f7167a, "aid", zza.zzd());
        zzfu.zzg(this.f7167a, "aiid", zza.zze());
        this.f7167a.put("v", IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
        this.f7167a.put("_v", zzbv.zzb);
        zzfu.zzg(this.f7167a, "ul", this.f7174h.zzx().zza().zzd());
        zzfu.zzg(this.f7167a, "sr", this.f7174h.zzx().zzb());
        if (this.f7169c.equals("transaction") || this.f7169c.equals("item") || this.f7174h.f7134d.zza()) {
            long zza2 = zzfu.zza((String) this.f7167a.get("ht"));
            if (zza2 == 0) {
                zza2 = this.f7170d;
            }
            long j10 = zza2;
            if (this.f7171e) {
                this.f7174h.zzz().zzM("Dry run enabled. Would have sent hit", new zzez(this.f7174h, this.f7167a, j10, this.f7172f));
                return;
            }
            String str3 = (String) this.f7167a.get("cid");
            HashMap hashMap = new HashMap();
            zzfu.zzh(hashMap, "uid", this.f7167a);
            zzfu.zzh(hashMap, "an", this.f7167a);
            zzfu.zzh(hashMap, "aid", this.f7167a);
            zzfu.zzh(hashMap, "av", this.f7167a);
            zzfu.zzh(hashMap, "aiid", this.f7167a);
            o.h(str3);
            this.f7167a.put("_s", String.valueOf(this.f7174h.zzs().zza(new zzbz(0, str3, this.f7173g, !TextUtils.isEmpty((CharSequence) this.f7167a.get("adid")), 0, hashMap))));
            this.f7174h.zzs().zzh(new zzez(this.f7174h, this.f7167a, j10, this.f7172f));
            return;
        }
        this.f7174h.zzz().zzc(this.f7167a, "Too many hits sent too quickly, rate limiting invoked");
    }
}
