package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class b implements DynamiteModule.b {
    public final DynamiteModule.b.C0024b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0024b bVar = new DynamiteModule.b.C0024b();
        bVar.f2828a = aVar.a(context, str);
        int b10 = aVar.b(context, str, true);
        bVar.f2829b = b10;
        int i10 = bVar.f2828a;
        if (i10 == 0) {
            if (b10 == 0) {
                bVar.f2830c = 0;
                return bVar;
            }
            i10 = 0;
        }
        if (i10 >= b10) {
            bVar.f2830c = -1;
        } else {
            bVar.f2830c = 1;
        }
        return bVar;
    }
}
