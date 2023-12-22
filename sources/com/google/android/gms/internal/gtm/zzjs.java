package com.google.android.gms.internal.gtm;

import android.content.Context;
import i3.b;
import i3.f;
import java.util.ArrayList;

public final class zzjs {
    private b zza;
    private final Context zzb;
    private f zzc;

    public zzjs(Context context) {
        this.zzb = context;
    }

    private final synchronized void zzb(String str) {
        f fVar;
        if (this.zza == null) {
            Context context = this.zzb;
            ArrayList arrayList = b.f7122i;
            b zzc2 = zzbx.zzg(context).zzc();
            this.zza = zzc2;
            zzc2.a(new zzjr());
            b bVar = this.zza;
            synchronized (bVar) {
                fVar = new f(bVar.f7139d);
                fVar.zzW();
            }
            this.zzc = fVar;
        }
    }

    public final f zza(String str) {
        zzb("_GTM_DEFAULT_TRACKER_");
        return this.zzc;
    }
}
