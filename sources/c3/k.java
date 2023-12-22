package c3;

import a7.j;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.wallpapersindia.app.RedeemScreen;
import e3.b;
import l2.d;
import w2.s;

public final /* synthetic */ class k implements b.a, OnCompleteListener, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2405a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2406b;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f2405a = obj;
        this.f2406b = obj2;
    }

    public final Object a() {
        return ((q) this.f2405a).f2421c.C((s) this.f2406b);
    }

    public final void c(d dVar) {
        int i10 = RedeemScreen.T;
        ((RedeemScreen) this.f2405a).startActivity((Intent) this.f2406b);
    }

    public final void onComplete(Task task) {
        int i10 = j.f142f;
        ((j) this.f2405a).a((Intent) this.f2406b);
    }
}
