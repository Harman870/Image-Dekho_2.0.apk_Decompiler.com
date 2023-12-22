package i3;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n4.a3;
import n4.a6;
import n4.c;
import n4.d8;
import n4.f;
import n4.g8;
import n4.r;
import n4.v2;
import n4.w2;
import n4.w7;
import n4.z4;
import n4.z7;

public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7156b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7157c;

    public /* synthetic */ o(Object obj, int i10, Object obj2) {
        this.f7155a = i10;
        this.f7157c = obj;
        this.f7156b = obj2;
    }

    public final void run() {
        String str;
        switch (this.f7155a) {
            case 0:
                l lVar = (l) this.f7156b;
                g gVar = lVar.f7147a;
                gVar.getClass();
                zzbg zzbg = (zzbg) lVar.a(zzbg.class);
                if (TextUtils.isEmpty(zzbg.zze())) {
                    zzbg.zzj(gVar.f7139d.zzi().zzb());
                }
                if (gVar.f7140e && TextUtils.isEmpty(zzbg.zzd())) {
                    zzbk zze = gVar.f7139d.zze();
                    zzbg.zzi(zze.zza());
                    zzbg.zzh(zze.zzb());
                }
                Iterator it = ((t) this.f7157c).f7163b.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).zza();
                }
                l lVar2 = (l) this.f7156b;
                r3.o.g("deliver should be called from worker thread");
                r3.o.a("Measurement must be submitted", lVar2.f7149c);
                ArrayList<v> arrayList = lVar2.f7154h;
                if (!arrayList.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (v vVar : arrayList) {
                        Uri zzb = vVar.zzb();
                        if (!hashSet.contains(zzb)) {
                            hashSet.add(zzb);
                            vVar.a(lVar2);
                        }
                    }
                    return;
                }
                return;
            case 2:
                ((z4) this.f7157c).f10346a.b();
                w7 w7Var = ((z4) this.f7157c).f10346a;
                g8 g8Var = (g8) this.f7156b;
                w7Var.d().g();
                w7Var.g();
                r3.o.e(g8Var.f9768a);
                w7Var.I(g8Var);
                return;
            case 3:
                a6 a6Var = (a6) this.f7156b;
                String str2 = (String) this.f7157c;
                a3 o10 = a6Var.f9600a.o();
                String str3 = o10.f9599p;
                boolean z9 = false;
                if (str3 != null && !str3.equals(str2)) {
                    z9 = true;
                }
                o10.f9599p = str2;
                if (z9) {
                    a6Var.f9600a.o().n();
                    return;
                }
                return;
            case 4:
                a6 a6Var2 = (a6) this.f7157c;
                Bundle bundle = (Bundle) this.f7156b;
                a6Var2.g();
                a6Var2.h();
                r3.o.h(bundle);
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                r3.o.e(string);
                r3.o.e(string2);
                r3.o.h(bundle.get("value"));
                if (!a6Var2.f9600a.g()) {
                    a6Var2.f9600a.a().f9835n.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                z7 z7Var = new z7(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    d8 x9 = a6Var2.f9600a.x();
                    bundle.getString("app_id");
                    r n02 = x9.n0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true);
                    d8 x10 = a6Var2.f9600a.x();
                    bundle.getString("app_id");
                    r n03 = x10.n0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true);
                    d8 x11 = a6Var2.f9600a.x();
                    bundle.getString("app_id");
                    r n04 = x11.n0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true);
                    String str4 = string2;
                    z7 z7Var2 = z7Var;
                    a6Var2.f9600a.v().l(new c(bundle.getString("app_id"), str4, z7Var2, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), n03, bundle.getLong("trigger_timeout"), n02, bundle.getLong("time_to_live"), n04));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                synchronized (((AtomicReference) this.f7156b)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.f7156b;
                        Object obj = this.f7157c;
                        f fVar = ((a6) obj).f9600a.f9992g;
                        String l6 = ((a6) obj).f9600a.o().l();
                        v2 v2Var = w2.L;
                        if (l6 == null) {
                            fVar.getClass();
                            str = null;
                        } else {
                            str = fVar.f9731c.b(l6, v2Var.f10176a);
                        }
                        atomicReference.set((String) v2Var.a(str));
                        ((AtomicReference) this.f7156b).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f7156b).notify();
                        throw th;
                    }
                }
                return;
        }
    }

    public /* synthetic */ o(a6 a6Var, Object obj) {
        this.f7155a = 3;
        this.f7156b = a6Var;
        this.f7157c = obj;
    }
}
