package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.gtm.zzho;
import com.google.android.gms.internal.gtm.zzhu;
import com.google.android.gms.internal.gtm.zzjh;
import z3.a;
import z3.b;

@DynamiteApi
public class TagManagerApiImpl extends zzcq {
    public void initialize(a aVar, zzco zzco, zzcf zzcf) {
        zzjh.zzf((Context) b.F(aVar), zzco, zzcf).zzm((String[]) null);
    }

    @Deprecated
    public void preview(Intent intent, a aVar) {
        zzho.zze("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, a aVar, a aVar2, zzco zzco, zzcf zzcf) {
        Context context = (Context) b.F(aVar);
        new zzhu(intent, context, (Context) b.F(aVar2), zzjh.zzf(context, zzco, zzcf)).zzb();
    }
}
