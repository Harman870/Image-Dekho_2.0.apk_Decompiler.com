package j5;

import android.view.View;
import h0.a;
import i0.f;
import j5.i;

public final class j extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8673d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f8674e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i.c f8675f;

    public j(i.c cVar, int i10, boolean z9) {
        this.f8675f = cVar;
        this.f8673d = i10;
        this.f8674e = z9;
    }

    public final void d(View view, f fVar) {
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        i.c cVar = this.f8675f;
        int i10 = this.f8673d;
        int i11 = i10;
        for (int i12 = 0; i12 < i10; i12++) {
            if (i.this.f8644e.c(i12) == 2) {
                i11--;
            }
        }
        if (i.this.f8641b.getChildCount() == 0) {
            i11--;
        }
        fVar.h(f.b.a(i11, 1, 1, 1, this.f8674e, view.isSelected()));
    }
}
