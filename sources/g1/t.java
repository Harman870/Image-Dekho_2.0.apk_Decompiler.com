package g1;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import c3.c;
import c3.e;
import c4.f;
import c6.h;
import com.google.android.gms.tasks.OnFailureListener;
import f3.a;
import i6.i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import n4.c8;
import n4.n4;
import n4.t7;
import n4.w7;
import t2.d;
import y2.b;

public final class t implements b, c8, OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6553a;

    public /* synthetic */ t(ViewGroup viewGroup) {
        this.f6553a = viewGroup.getOverlay();
    }

    public /* synthetic */ t(Object obj) {
        this.f6553a = obj;
    }

    public /* synthetic */ t(n4 n4Var) {
        this.f6553a = n4Var;
    }

    public final void a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            n4 n4Var = ((w7) this.f6553a).f10292l;
            if (n4Var != null) {
                n4Var.a().f9828f.b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        ((w7) this.f6553a).d().o(new t7(this, str, bundle));
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(((n4) this.f6553a).f9987b) || !Log.isLoggable(((n4) this.f6553a).a().t(), 3)) {
            return false;
        }
        return true;
    }

    public final Object get() {
        a aVar = (a) ((n8.a) this.f6553a).get();
        HashMap hashMap = new HashMap();
        d dVar = d.DEFAULT;
        c.a aVar2 = new c.a();
        Set<e.b> emptySet = Collections.emptySet();
        if (emptySet != null) {
            aVar2.f2386c = emptySet;
            aVar2.f2384a = 30000L;
            aVar2.f2385b = 86400000L;
            hashMap.put(dVar, aVar2.a());
            d dVar2 = d.HIGHEST;
            c.a aVar3 = new c.a();
            Set<e.b> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                aVar3.f2386c = emptySet2;
                aVar3.f2384a = 1000L;
                aVar3.f2385b = 86400000L;
                hashMap.put(dVar2, aVar3.a());
                d dVar3 = d.VERY_LOW;
                c.a aVar4 = new c.a();
                Set<e.b> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    aVar4.f2386c = emptySet3;
                    aVar4.f2384a = 86400000L;
                    aVar4.f2385b = 86400000L;
                    Set<e.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.b[]{e.b.DEVICE_IDLE})));
                    if (unmodifiableSet != null) {
                        aVar4.f2386c = unmodifiableSet;
                        hashMap.put(dVar3, aVar4.a());
                        if (aVar == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= d.values().length) {
                            new HashMap();
                            return new c3.b(aVar, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }

    public final void onFailure(Exception exc) {
        long j10;
        if (exc instanceof h) {
            u3.a aVar = i.f7907e;
            aVar.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            i iVar = (i) ((f) this.f6553a).f2448c;
            int i10 = (int) iVar.f7909b;
            if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
                long j11 = iVar.f7909b;
                j10 = j11 + j11;
            } else if (i10 != 960) {
                j10 = 30;
            } else {
                j10 = 960;
            }
            iVar.f7909b = j10;
            iVar.f7908a = (iVar.f7909b * 1000) + System.currentTimeMillis();
            long j12 = iVar.f7908a;
            aVar.e("Scheduling refresh for " + j12, new Object[0]);
            iVar.f7910c.postDelayed(iVar.f7911d, iVar.f7909b * 1000);
        }
    }
}
