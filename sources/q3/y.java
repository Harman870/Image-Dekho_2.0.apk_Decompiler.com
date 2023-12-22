package q3;

import android.util.Log;
import o3.b;
import p3.a;
import r3.i;

public final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11302a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f11303b;

    public y(z zVar, b bVar) {
        this.f11303b = zVar;
        this.f11302a = bVar;
    }

    public final void run() {
        boolean z9;
        i iVar;
        z zVar = this.f11303b;
        w wVar = (w) zVar.f11313f.f11221j.get(zVar.f11309b);
        if (wVar != null) {
            b bVar = this.f11302a;
            if (bVar.f10539b == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                z zVar2 = this.f11303b;
                zVar2.f11312e = true;
                if (zVar2.f11308a.l()) {
                    z zVar3 = this.f11303b;
                    if (zVar3.f11312e && (iVar = zVar3.f11310c) != null) {
                        zVar3.f11308a.d(iVar, zVar3.f11311d);
                        return;
                    }
                    return;
                }
                try {
                    a.e eVar = this.f11303b.f11308a;
                    eVar.d((i) null, eVar.b());
                    return;
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f11303b.f11308a.e("Failed to get service from broker.");
                    bVar = new b(10);
                }
            }
            wVar.q(bVar, (RuntimeException) null);
        }
    }
}
