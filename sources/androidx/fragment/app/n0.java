package androidx.fragment.app;

import android.view.View;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1558b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1559c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1560d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1561e;

    public n0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1557a = i10;
        this.f1558b = arrayList;
        this.f1559c = arrayList2;
        this.f1560d = arrayList3;
        this.f1561e = arrayList4;
    }

    public final void run() {
        for (int i10 = 0; i10 < this.f1557a; i10++) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            y.i.v((View) this.f1558b.get(i10), (String) this.f1559c.get(i10));
            y.i.v((View) this.f1560d.get(i10), (String) this.f1561e.get(i10));
        }
    }
}
