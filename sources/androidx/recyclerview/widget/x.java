package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import i0.f;
import i0.g;
import java.util.WeakHashMap;

public class x extends h0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2148d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2149e;

    public static class a extends h0.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f2150d;

        /* renamed from: e  reason: collision with root package name */
        public WeakHashMap f2151e = new WeakHashMap();

        public a(x xVar) {
            this.f2150d = xVar;
        }

        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        public final g b(View view) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        public final void d(View view, f fVar) {
            boolean z9;
            RecyclerView recyclerView = this.f2150d.f2148d;
            if (!recyclerView.f1838r || recyclerView.f1849y || recyclerView.f1823d.g()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 && this.f2150d.f2148d.getLayoutManager() != null) {
                this.f2150d.f2148d.getLayoutManager().S(view, fVar);
                h0.a aVar = (h0.a) this.f2151e.get(view);
                if (aVar != null) {
                    aVar.d(view, fVar);
                    return;
                }
            }
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        }

        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            h0.a aVar = (h0.a) this.f2151e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        public final boolean g(View view, int i10, Bundle bundle) {
            boolean z9;
            RecyclerView recyclerView = this.f2150d.f2148d;
            if (!recyclerView.f1838r || recyclerView.f1849y || recyclerView.f1823d.g()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 || this.f2150d.f2148d.getLayoutManager() == null) {
                return super.g(view, i10, bundle);
            }
            h0.a aVar = (h0.a) this.f2151e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i10, bundle)) {
                    return true;
                }
            } else if (super.g(view, i10, bundle)) {
                return true;
            }
            RecyclerView.r rVar = this.f2150d.f2148d.getLayoutManager().f1867b.f1821b;
            return false;
        }

        public final void h(View view, int i10) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            h0.a aVar = (h0.a) this.f2151e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f2148d = recyclerView;
        a aVar = this.f2149e;
        this.f2149e = aVar == null ? new a(this) : aVar;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z9;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f2148d;
            if (!recyclerView.f1838r || recyclerView.f1849y || recyclerView.f1823d.g()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().R(accessibilityEvent);
                }
            }
        }
    }

    public void d(View view, f fVar) {
        boolean z9;
        this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
        RecyclerView recyclerView = this.f2148d;
        if (!recyclerView.f1838r || recyclerView.f1849y || recyclerView.f1823d.g()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && this.f2148d.getLayoutManager() != null) {
            RecyclerView.l layoutManager = this.f2148d.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1867b;
            RecyclerView.r rVar = recyclerView2.f1821b;
            RecyclerView.w wVar = recyclerView2.f1837q0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f1867b.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.k(true);
            }
            if (layoutManager.f1867b.canScrollVertically(1) || layoutManager.f1867b.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.k(true);
            }
            AccessibilityNodeInfo.CollectionInfo obtain = AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.I(rVar, wVar), layoutManager.y(rVar, wVar), false, 0);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = obtain;
            fVar.f7091a.setCollectionInfo(obtain);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2148d
            boolean r0 = r4.f1838r
            r1 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r4.f1849y
            if (r0 != 0) goto L_0x001e
            androidx.recyclerview.widget.a r4 = r4.f1823d
            boolean r4 = r4.g()
            if (r4 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r4 = r1
            goto L_0x001f
        L_0x001e:
            r4 = r6
        L_0x001f:
            if (r4 != 0) goto L_0x00a1
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2148d
            androidx.recyclerview.widget.RecyclerView$l r4 = r4.getLayoutManager()
            if (r4 == 0) goto L_0x00a1
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2148d
            androidx.recyclerview.widget.RecyclerView$l r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1867b
            androidx.recyclerview.widget.RecyclerView$r r2 = r0.f1821b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x006a
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x003e
            r5 = r1
            r0 = r5
            goto L_0x0095
        L_0x003e:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L_0x0053
            int r0 = r4.f1879o
            int r2 = r4.F()
            int r0 = r0 - r2
            int r2 = r4.C()
            int r0 = r0 - r2
            int r0 = -r0
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f1867b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0094
            int r5 = r4.f1878n
            int r2 = r4.D()
            int r5 = r5 - r2
            int r2 = r4.E()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0095
        L_0x006a:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L_0x007e
            int r5 = r4.f1879o
            int r0 = r4.F()
            int r5 = r5 - r0
            int r0 = r4.C()
            int r5 = r5 - r0
            r0 = r5
            goto L_0x007f
        L_0x007e:
            r0 = r1
        L_0x007f:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f1867b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0094
            int r5 = r4.f1878n
            int r2 = r4.D()
            int r5 = r5 - r2
            int r2 = r4.E()
            int r5 = r5 - r2
            goto L_0x0095
        L_0x0094:
            r5 = r1
        L_0x0095:
            if (r0 != 0) goto L_0x009b
            if (r5 != 0) goto L_0x009b
            r6 = r1
            goto L_0x00a0
        L_0x009b:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f1867b
            r4.b0(r5, r0, r6)
        L_0x00a0:
            return r6
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.x.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
