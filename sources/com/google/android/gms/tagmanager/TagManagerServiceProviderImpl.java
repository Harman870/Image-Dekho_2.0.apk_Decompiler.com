package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.gtm.zzhm;
import com.google.android.gms.internal.gtm.zzjl;
import z3.a;
import z3.b;

@DynamiteApi
public class TagManagerServiceProviderImpl extends zzct {
    private static volatile zzjl zza;

    public zzhm getService(a aVar, zzco zzco, zzcf zzcf) {
        zzjl zzjl = zza;
        if (zzjl == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                zzjl = zza;
                if (zzjl == null) {
                    zzjl = new zzjl((Context) b.F(aVar), zzco, zzcf);
                    zza = zzjl;
                }
            }
        }
        return zzjl;
    }
}
