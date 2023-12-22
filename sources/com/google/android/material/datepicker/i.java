package com.google.android.material.datepicker;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.q;
import i0.f;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class i<S> extends a0<S> {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f3131v0 = 0;
    public int U;
    public d<S> V;
    public a W;
    public f X;
    public v Y;
    public int Z;

    /* renamed from: o0  reason: collision with root package name */
    public c f3132o0;
    public RecyclerView p0;

    /* renamed from: q0  reason: collision with root package name */
    public RecyclerView f3133q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f3134r0;

    /* renamed from: s0  reason: collision with root package name */
    public View f3135s0;

    /* renamed from: t0  reason: collision with root package name */
    public View f3136t0;
    public View u0;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f3137a;

        public a(int i10) {
            this.f3137a = i10;
        }

        public final void run() {
            RecyclerView recyclerView = i.this.f3133q0;
            int i10 = this.f3137a;
            if (!recyclerView.u) {
                RecyclerView.l lVar = recyclerView.f1830l;
                if (lVar == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    lVar.v0(recyclerView, i10);
                }
            }
        }
    }

    public class b extends h0.a {
        public final void d(View view, f fVar) {
            this.f6677a.onInitializeAccessibilityNodeInfo(view, fVar.f7091a);
            fVar.f7091a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    public class c extends c0 {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i10, int i11) {
            super(i10);
            this.E = i11;
        }

        public final void y0(RecyclerView.w wVar, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = i.this.f3133q0.getWidth();
                iArr[1] = i.this.f3133q0.getWidth();
                return;
            }
            iArr[0] = i.this.f3133q0.getHeight();
            iArr[1] = i.this.f3133q0.getHeight();
        }
    }

    public class d implements e {
        public d() {
        }
    }

    public interface e {
    }

    public final void D(Bundle bundle) {
        super.D(bundle);
        if (bundle == null) {
            bundle = this.f1568g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.W = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.X = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.Y = (v) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0190, code lost:
        r12 = new androidx.recyclerview.widget.u();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View E(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r12 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r9.l()
            int r1 = r9.U
            r12.<init>(r0, r1)
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r12)
            r9.f3132o0 = r0
            android.view.LayoutInflater r10 = r10.cloneInContext(r12)
            com.google.android.material.datepicker.a r0 = r9.W
            com.google.android.material.datepicker.v r0 = r0.f3088a
            boolean r1 = com.google.android.material.datepicker.q.g0(r12)
            r6 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0027
            r1 = 2131492969(0x7f0c0069, float:1.8609405E38)
            r3 = r6
            goto L_0x002b
        L_0x0027:
            r1 = 2131492964(0x7f0c0064, float:1.8609395E38)
            r3 = r2
        L_0x002b:
            android.view.View r10 = r10.inflate(r1, r11, r2)
            android.content.Context r11 = r9.U()
            android.content.res.Resources r11 = r11.getResources()
            r1 = 2131100281(0x7f060279, float:1.781294E38)
            int r1 = r11.getDimensionPixelSize(r1)
            r4 = 2131100282(0x7f06027a, float:1.7812941E38)
            int r4 = r11.getDimensionPixelOffset(r4)
            int r4 = r4 + r1
            r1 = 2131100280(0x7f060278, float:1.7812937E38)
            int r1 = r11.getDimensionPixelOffset(r1)
            int r1 = r1 + r4
            r4 = 2131100265(0x7f060269, float:1.7812907E38)
            int r4 = r11.getDimensionPixelSize(r4)
            int r5 = com.google.android.material.datepicker.w.f3169g
            r7 = 2131100260(0x7f060264, float:1.7812896E38)
            int r7 = r11.getDimensionPixelSize(r7)
            int r7 = r7 * r5
            int r5 = r5 + -1
            r8 = 2131100279(0x7f060277, float:1.7812935E38)
            int r8 = r11.getDimensionPixelOffset(r8)
            int r8 = r8 * r5
            int r8 = r8 + r7
            r5 = 2131100257(0x7f060261, float:1.781289E38)
            int r11 = r11.getDimensionPixelOffset(r5)
            int r1 = r1 + r4
            int r1 = r1 + r8
            int r1 = r1 + r11
            r10.setMinimumHeight(r1)
            r11 = 2131296602(0x7f09015a, float:1.8211125E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.GridView r11 = (android.widget.GridView) r11
            com.google.android.material.datepicker.i$b r1 = new com.google.android.material.datepicker.i$b
            r1.<init>()
            h0.y.n(r11, r1)
            com.google.android.material.datepicker.a r1 = r9.W
            int r1 = r1.f3092e
            com.google.android.material.datepicker.g r4 = new com.google.android.material.datepicker.g
            if (r1 <= 0) goto L_0x0094
            r4.<init>(r1)
            goto L_0x0097
        L_0x0094:
            r4.<init>()
        L_0x0097:
            r11.setAdapter(r4)
            int r0 = r0.f3165d
            r11.setNumColumns(r0)
            r11.setEnabled(r2)
            r11 = 2131296605(0x7f09015d, float:1.8211131E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r9.f3133q0 = r11
            com.google.android.material.datepicker.i$c r11 = new com.google.android.material.datepicker.i$c
            r9.l()
            r11.<init>(r3, r3)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3133q0
            r0.setLayoutManager(r11)
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3133q0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r11.setTag(r0)
            com.google.android.material.datepicker.y r11 = new com.google.android.material.datepicker.y
            com.google.android.material.datepicker.d<S> r2 = r9.V
            com.google.android.material.datepicker.a r3 = r9.W
            com.google.android.material.datepicker.f r4 = r9.X
            com.google.android.material.datepicker.i$d r5 = new com.google.android.material.datepicker.i$d
            r5.<init>()
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3133q0
            r0.setAdapter(r11)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131361843(0x7f0a0033, float:1.834345E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131296608(0x7f090160, float:1.8211137E38)
            android.view.View r2 = r10.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r9.p0 = r2
            if (r2 == 0) goto L_0x0111
            r2.setHasFixedSize(r6)
            androidx.recyclerview.widget.RecyclerView r2 = r9.p0
            androidx.recyclerview.widget.GridLayoutManager r3 = new androidx.recyclerview.widget.GridLayoutManager
            r3.<init>(r0)
            r2.setLayoutManager(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r9.p0
            com.google.android.material.datepicker.g0 r2 = new com.google.android.material.datepicker.g0
            r2.<init>(r9)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r9.p0
            com.google.android.material.datepicker.k r2 = new com.google.android.material.datepicker.k
            r2.<init>(r9)
            r0.g(r2)
        L_0x0111:
            r0 = 2131296595(0x7f090153, float:1.8211111E38)
            android.view.View r2 = r10.findViewById(r0)
            if (r2 == 0) goto L_0x018a
            android.view.View r0 = r10.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            com.google.android.material.datepicker.l r2 = new com.google.android.material.datepicker.l
            r2.<init>(r9)
            h0.y.n(r0, r2)
            r2 = 2131296597(0x7f090155, float:1.8211115E38)
            android.view.View r2 = r10.findViewById(r2)
            r9.f3134r0 = r2
            java.lang.String r3 = "NAVIGATION_PREV_TAG"
            r2.setTag(r3)
            r2 = 2131296596(0x7f090154, float:1.8211113E38)
            android.view.View r2 = r10.findViewById(r2)
            r9.f3135s0 = r2
            java.lang.String r3 = "NAVIGATION_NEXT_TAG"
            r2.setTag(r3)
            android.view.View r1 = r10.findViewById(r1)
            r9.f3136t0 = r1
            r1 = 2131296601(0x7f090159, float:1.8211123E38)
            android.view.View r1 = r10.findViewById(r1)
            r9.u0 = r1
            r9.f0(r6)
            com.google.android.material.datepicker.v r1 = r9.Y
            java.lang.String r1 = r1.c()
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r9.f3133q0
            com.google.android.material.datepicker.m r2 = new com.google.android.material.datepicker.m
            r2.<init>(r9, r11, r0)
            r1.h(r2)
            com.google.android.material.datepicker.n r1 = new com.google.android.material.datepicker.n
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f3135s0
            com.google.android.material.datepicker.o r1 = new com.google.android.material.datepicker.o
            r1.<init>(r9, r11)
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.f3134r0
            com.google.android.material.datepicker.h r1 = new com.google.android.material.datepicker.h
            r1.<init>(r9, r11)
            r0.setOnClickListener(r1)
        L_0x018a:
            boolean r12 = com.google.android.material.datepicker.q.g0(r12)
            if (r12 != 0) goto L_0x01df
            androidx.recyclerview.widget.u r12 = new androidx.recyclerview.widget.u
            r12.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r9.f3133q0
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2008a
            if (r1 != r0) goto L_0x019c
            goto L_0x01df
        L_0x019c:
            if (r1 == 0) goto L_0x01ad
            androidx.recyclerview.widget.a0$a r2 = r12.f2009b
            java.util.ArrayList r1 = r1.f1841s0
            if (r1 == 0) goto L_0x01a7
            r1.remove(r2)
        L_0x01a7:
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2008a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x01ad:
            r12.f2008a = r0
            if (r0 == 0) goto L_0x01df
            androidx.recyclerview.widget.RecyclerView$n r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x01d7
            androidx.recyclerview.widget.RecyclerView r0 = r12.f2008a
            androidx.recyclerview.widget.a0$a r1 = r12.f2009b
            r0.h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r12.f2008a
            r0.setOnFlingListener(r12)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r12.f2008a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r12.b()
            goto L_0x01df
        L_0x01d7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "An instance of OnFlingListener already set."
            r10.<init>(r11)
            throw r10
        L_0x01df:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f3133q0
            com.google.android.material.datepicker.v r0 = r9.Y
            com.google.android.material.datepicker.a r11 = r11.f3179c
            com.google.android.material.datepicker.v r11 = r11.f3088a
            java.util.Calendar r1 = r11.f3162a
            boolean r1 = r1 instanceof java.util.GregorianCalendar
            if (r1 == 0) goto L_0x0208
            int r1 = r0.f3164c
            int r2 = r11.f3164c
            int r1 = r1 - r2
            int r1 = r1 * 12
            int r0 = r0.f3163b
            int r11 = r11.f3163b
            int r0 = r0 - r11
            int r0 = r0 + r1
            r12.a0(r0)
            androidx.recyclerview.widget.RecyclerView r11 = r9.f3133q0
            com.google.android.material.datepicker.j r12 = new com.google.android.material.datepicker.j
            r12.<init>()
            h0.y.n(r11, r12)
            return r10
        L_0x0208:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Only Gregorian calendars are supported."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.i.E(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void K(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.X);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Y);
    }

    public final boolean b0(q.d dVar) {
        return super.b0(dVar);
    }

    public final LinearLayoutManager c0() {
        return (LinearLayoutManager) this.f3133q0.getLayoutManager();
    }

    public final void d0(int i10) {
        this.f3133q0.post(new a(i10));
    }

    public final void e0(v vVar) {
        boolean z9;
        RecyclerView recyclerView;
        int i10;
        v vVar2 = ((y) this.f3133q0.getAdapter()).f3179c.f3088a;
        Calendar calendar = vVar2.f3162a;
        if (calendar instanceof GregorianCalendar) {
            int i11 = vVar.f3164c;
            int i12 = vVar2.f3164c;
            int i13 = vVar.f3163b;
            int i14 = vVar2.f3163b;
            int i15 = (i13 - i14) + ((i11 - i12) * 12);
            v vVar3 = this.Y;
            if (calendar instanceof GregorianCalendar) {
                int i16 = i15 - ((vVar3.f3163b - i14) + ((vVar3.f3164c - i12) * 12));
                boolean z10 = true;
                if (Math.abs(i16) > 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i16 <= 0) {
                    z10 = false;
                }
                this.Y = vVar;
                if (!z9 || !z10) {
                    if (z9) {
                        recyclerView = this.f3133q0;
                        i10 = i15 + 3;
                    }
                    d0(i15);
                    return;
                }
                recyclerView = this.f3133q0;
                i10 = i15 - 3;
                recyclerView.a0(i10);
                d0(i15);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void f0(int i10) {
        this.Z = i10;
        if (i10 == 2) {
            this.p0.getLayoutManager().l0(this.Y.f3164c - ((g0) this.p0.getAdapter()).f3127c.W.f3088a.f3164c);
            this.f3136t0.setVisibility(0);
            this.u0.setVisibility(8);
            this.f3134r0.setVisibility(8);
            this.f3135s0.setVisibility(8);
        } else if (i10 == 1) {
            this.f3136t0.setVisibility(8);
            this.u0.setVisibility(0);
            this.f3134r0.setVisibility(0);
            this.f3135s0.setVisibility(0);
            e0(this.Y);
        }
    }
}
