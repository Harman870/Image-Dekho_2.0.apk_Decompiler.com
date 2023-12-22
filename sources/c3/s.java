package c3;

import a7.m0;
import a7.n0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.wallpapersindia.app.LoginScreen;
import e3.b;
import l2.d;
import z5.b;

public final /* synthetic */ class s implements b.a, OnCompleteListener, d.c, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2437a;

    public /* synthetic */ s(Object obj) {
        this.f2437a = obj;
    }

    public final Object a() {
        t tVar = (t) this.f2437a;
        for (w2.s b10 : tVar.f2439b.r()) {
            tVar.f2440c.b(b10, 1);
        }
        return null;
    }

    public final void c(d dVar) {
        s.super.onBackPressed();
    }

    public final void onComplete(Task task) {
        int i10 = m0.f180b;
        ((n0.a) this.f2437a).f190b.trySetResult(null);
    }

    public final void onSuccess(Object obj) {
        ((LoginScreen) this.f2437a).I = (b.c) obj;
    }
}
