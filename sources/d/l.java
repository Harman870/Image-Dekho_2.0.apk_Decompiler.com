package d;

import c6.b;
import h0.m0;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f5941a;

    public class a extends b {
        public a() {
        }

        public final void a() {
            l.this.f5941a.f5900v.setAlpha(1.0f);
            l.this.f5941a.f5903y.d((m0) null);
            l.this.f5941a.f5903y = null;
        }

        public final void k() {
            l.this.f5941a.f5900v.setVisibility(0);
        }
    }

    public l(i iVar) {
        this.f5941a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            d.i r0 = r4.f5941a
            android.widget.PopupWindow r1 = r0.w
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f5900v
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            d.i r0 = r4.f5941a
            h0.l0 r0 = r0.f5903y
            if (r0 == 0) goto L_0x0015
            r0.b()
        L_0x0015:
            d.i r0 = r4.f5941a
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x0029
            android.view.ViewGroup r0 = r0.B
            if (r0 == 0) goto L_0x0029
            java.util.WeakHashMap<android.view.View, h0.l0> r1 = h0.y.f6776a
            boolean r0 = h0.y.g.c(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = r3
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0050
            d.i r0 = r4.f5941a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f5900v
            r2 = 0
            r0.setAlpha(r2)
            d.i r0 = r4.f5941a
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f5900v
            h0.l0 r2 = h0.y.a(r2)
            r2.a(r1)
            r0.f5903y = r2
            d.i r0 = r4.f5941a
            h0.l0 r0 = r0.f5903y
            d.l$a r1 = new d.l$a
            r1.<init>()
            r0.d(r1)
            goto L_0x005e
        L_0x0050:
            d.i r0 = r4.f5941a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f5900v
            r0.setAlpha(r1)
            d.i r0 = r4.f5941a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f5900v
            r0.setVisibility(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.l.run():void");
    }
}
