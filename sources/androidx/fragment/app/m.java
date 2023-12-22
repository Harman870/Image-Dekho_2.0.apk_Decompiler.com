package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t0;
import d0.d;
import h0.h0;
import h0.l0;
import h0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.g;

public final class m extends t0 {

    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1535c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1536d = false;

        /* renamed from: e  reason: collision with root package name */
        public q f1537e;

        public a(t0.b bVar, d dVar, boolean z9) {
            super(bVar, dVar);
            this.f1535c = z9;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00c0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.fragment.app.q c(android.content.Context r10) {
            /*
                r9 = this;
                boolean r0 = r9.f1536d
                if (r0 == 0) goto L_0x0007
                androidx.fragment.app.q r10 = r9.f1537e
                return r10
            L_0x0007:
                androidx.fragment.app.t0$b r0 = r9.f1538a
                androidx.fragment.app.o r1 = r0.f1630c
                int r0 = r0.f1628a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r0 != r2) goto L_0x0014
                r0 = r3
                goto L_0x0015
            L_0x0014:
                r0 = r4
            L_0x0015:
                boolean r2 = r9.f1535c
                androidx.fragment.app.o$b r5 = r1.I
                if (r5 != 0) goto L_0x001d
                r6 = r4
                goto L_0x001f
            L_0x001d:
                int r6 = r5.f1591f
            L_0x001f:
                if (r2 == 0) goto L_0x0030
                if (r0 == 0) goto L_0x002a
                if (r5 != 0) goto L_0x0027
            L_0x0025:
                r2 = r4
                goto L_0x003d
            L_0x0027:
                int r2 = r5.f1589d
                goto L_0x003d
            L_0x002a:
                if (r5 != 0) goto L_0x002d
                goto L_0x0025
            L_0x002d:
                int r2 = r5.f1590e
                goto L_0x003d
            L_0x0030:
                if (r0 == 0) goto L_0x0038
                if (r5 != 0) goto L_0x0035
                goto L_0x0025
            L_0x0035:
                int r2 = r5.f1587b
                goto L_0x003d
            L_0x0038:
                if (r5 != 0) goto L_0x003b
                goto L_0x0025
            L_0x003b:
                int r2 = r5.f1588c
            L_0x003d:
                r1.X(r4, r4, r4, r4)
                android.view.ViewGroup r5 = r1.E
                r7 = 0
                if (r5 == 0) goto L_0x0053
                r8 = 2131296894(0x7f09027e, float:1.8211718E38)
                java.lang.Object r5 = r5.getTag(r8)
                if (r5 == 0) goto L_0x0053
                android.view.ViewGroup r5 = r1.E
                r5.setTag(r8, r7)
            L_0x0053:
                android.view.ViewGroup r1 = r1.E
                if (r1 == 0) goto L_0x005f
                android.animation.LayoutTransition r1 = r1.getLayoutTransition()
                if (r1 == 0) goto L_0x005f
                goto L_0x0100
            L_0x005f:
                if (r2 != 0) goto L_0x00be
                if (r6 == 0) goto L_0x00be
                r1 = 4097(0x1001, float:5.741E-42)
                r2 = -1
                if (r6 == r1) goto L_0x00b4
                r1 = 8194(0x2002, float:1.1482E-41)
                if (r6 == r1) goto L_0x00aa
                r1 = 8197(0x2005, float:1.1486E-41)
                if (r6 == r1) goto L_0x008d
                r1 = 4099(0x1003, float:5.744E-42)
                if (r6 == r1) goto L_0x0083
                r1 = 4100(0x1004, float:5.745E-42)
                if (r6 == r1) goto L_0x0079
                goto L_0x00be
            L_0x0079:
                if (r0 == 0) goto L_0x007f
                r0 = 16842936(0x10100b8, float:2.3694074E-38)
                goto L_0x0096
            L_0x007f:
                r0 = 16842937(0x10100b9, float:2.3694076E-38)
                goto L_0x0096
            L_0x0083:
                if (r0 == 0) goto L_0x0089
                r0 = 2130837509(0x7f020005, float:1.7279974E38)
                goto L_0x00bd
            L_0x0089:
                r0 = 2130837510(0x7f020006, float:1.7279976E38)
                goto L_0x00bd
            L_0x008d:
                if (r0 == 0) goto L_0x0093
                r0 = 16842938(0x10100ba, float:2.369408E-38)
                goto L_0x0096
            L_0x0093:
                r0 = 16842939(0x10100bb, float:2.3694082E-38)
            L_0x0096:
                int[] r1 = new int[r3]
                r1[r4] = r0
                r0 = 16973825(0x1030001, float:2.4060903E-38)
                android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
                int r1 = r0.getResourceId(r4, r2)
                r0.recycle()
                r2 = r1
                goto L_0x00be
            L_0x00aa:
                if (r0 == 0) goto L_0x00b0
                r0 = 2130837507(0x7f020003, float:1.727997E38)
                goto L_0x00bd
            L_0x00b0:
                r0 = 2130837508(0x7f020004, float:1.7279972E38)
                goto L_0x00bd
            L_0x00b4:
                if (r0 == 0) goto L_0x00ba
                r0 = 2130837511(0x7f020007, float:1.7279978E38)
                goto L_0x00bd
            L_0x00ba:
                r0 = 2130837512(0x7f020008, float:1.727998E38)
            L_0x00bd:
                r2 = r0
            L_0x00be:
                if (r2 == 0) goto L_0x0100
                android.content.res.Resources r0 = r10.getResources()
                java.lang.String r0 = r0.getResourceTypeName(r2)
                java.lang.String r1 = "anim"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x00e1
                android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)     // Catch:{ NotFoundException -> 0x00df, RuntimeException -> 0x00e1 }
                if (r1 == 0) goto L_0x00dd
                androidx.fragment.app.q r5 = new androidx.fragment.app.q     // Catch:{ NotFoundException -> 0x00df, RuntimeException -> 0x00e1 }
                r5.<init>((android.view.animation.Animation) r1)     // Catch:{ NotFoundException -> 0x00df, RuntimeException -> 0x00e1 }
                r7 = r5
                goto L_0x0100
            L_0x00dd:
                r4 = r3
                goto L_0x00e1
            L_0x00df:
                r10 = move-exception
                throw r10
            L_0x00e1:
                if (r4 != 0) goto L_0x0100
                android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r10, r2)     // Catch:{ RuntimeException -> 0x00f0 }
                if (r1 == 0) goto L_0x0100
                androidx.fragment.app.q r4 = new androidx.fragment.app.q     // Catch:{ RuntimeException -> 0x00f0 }
                r4.<init>((android.animation.Animator) r1)     // Catch:{ RuntimeException -> 0x00f0 }
                r7 = r4
                goto L_0x0100
            L_0x00f0:
                r1 = move-exception
                if (r0 != 0) goto L_0x00ff
                android.view.animation.Animation r10 = android.view.animation.AnimationUtils.loadAnimation(r10, r2)
                if (r10 == 0) goto L_0x0100
                androidx.fragment.app.q r7 = new androidx.fragment.app.q
                r7.<init>((android.view.animation.Animation) r10)
                goto L_0x0100
            L_0x00ff:
                throw r1
            L_0x0100:
                r9.f1537e = r7
                r9.f1536d = r3
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.a.c(android.content.Context):androidx.fragment.app.q");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final t0.b f1538a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1539b;

        public b(t0.b bVar, d dVar) {
            this.f1538a = bVar;
            this.f1539b = dVar;
        }

        public final void a() {
            t0.b bVar = this.f1538a;
            if (bVar.f1632e.remove(this.f1539b) && bVar.f1632e.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            int c10 = w0.c(this.f1538a.f1630c.F);
            int i10 = this.f1538a.f1628a;
            if (c10 == i10 || (c10 != 2 && i10 != 2)) {
                return true;
            }
            return false;
        }
    }

    public static class c extends b {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1540c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1541d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1542e;

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            if (r4 == androidx.fragment.app.o.S) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r4 == androidx.fragment.app.o.S) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(androidx.fragment.app.t0.b r3, d0.d r4, boolean r5, boolean r6) {
            /*
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.f1628a
                r0 = 2
                r1 = 0
                if (r4 != r0) goto L_0x002d
                if (r5 == 0) goto L_0x0019
                androidx.fragment.app.o r4 = r3.f1630c
                androidx.fragment.app.o$b r4 = r4.I
                if (r4 != 0) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                java.lang.Object r4 = r4.f1595j
                java.lang.Object r0 = androidx.fragment.app.o.S
                if (r4 != r0) goto L_0x001f
                goto L_0x001e
            L_0x0019:
                androidx.fragment.app.o r4 = r3.f1630c
                r4.getClass()
            L_0x001e:
                r4 = r1
            L_0x001f:
                r2.f1540c = r4
                if (r5 == 0) goto L_0x0028
                androidx.fragment.app.o r4 = r3.f1630c
                androidx.fragment.app.o$b r4 = r4.I
                goto L_0x0045
            L_0x0028:
                androidx.fragment.app.o r4 = r3.f1630c
                androidx.fragment.app.o$b r4 = r4.I
                goto L_0x0045
            L_0x002d:
                if (r5 == 0) goto L_0x003d
                androidx.fragment.app.o r4 = r3.f1630c
                androidx.fragment.app.o$b r4 = r4.I
                if (r4 != 0) goto L_0x0036
                goto L_0x0042
            L_0x0036:
                java.lang.Object r4 = r4.f1594i
                java.lang.Object r0 = androidx.fragment.app.o.S
                if (r4 != r0) goto L_0x0043
                goto L_0x0042
            L_0x003d:
                androidx.fragment.app.o r4 = r3.f1630c
                r4.getClass()
            L_0x0042:
                r4 = r1
            L_0x0043:
                r2.f1540c = r4
            L_0x0045:
                r4 = 1
                r2.f1541d = r4
                if (r6 == 0) goto L_0x0061
                if (r5 == 0) goto L_0x005c
                androidx.fragment.app.o r3 = r3.f1630c
                androidx.fragment.app.o$b r3 = r3.I
                if (r3 != 0) goto L_0x0053
                goto L_0x0061
            L_0x0053:
                java.lang.Object r3 = r3.k
                java.lang.Object r4 = androidx.fragment.app.o.S
                if (r3 != r4) goto L_0x005a
                goto L_0x0061
            L_0x005a:
                r1 = r3
                goto L_0x0061
            L_0x005c:
                androidx.fragment.app.o r3 = r3.f1630c
                r3.getClass()
            L_0x0061:
                r2.f1542e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.c.<init>(androidx.fragment.app.t0$b, d0.d, boolean, boolean):void");
        }

        public final o0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            k0 k0Var = i0.f1516a;
            if (k0Var != null && (obj instanceof Transition)) {
                return k0Var;
            }
            o0 o0Var = i0.f1517b;
            if (o0Var != null && o0Var.e(obj)) {
                return o0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1538a.f1630c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public m(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!h0.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        i(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(m.b bVar, View view) {
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        String k = y.i.k(view);
        if (k != null) {
            bVar.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(bVar, childAt);
                }
            }
        }
    }

    public static void k(m.b bVar, Collection collection) {
        Iterator it = ((g.b) bVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, l0> weakHashMap = y.f6776a;
                if (!collection.contains(y.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x06fc  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x087a A[LOOP:19: B:278:0x0874->B:280:0x087a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0894  */
    /* JADX WARNING: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r35, boolean r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            java.util.Iterator r2 = r35.iterator()
            r3 = 0
            r4 = 0
        L_0x000a:
            boolean r5 = r2.hasNext()
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x003a
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.t0$b r5 = (androidx.fragment.app.t0.b) r5
            androidx.fragment.app.o r9 = r5.f1630c
            android.view.View r9 = r9.F
            int r9 = androidx.fragment.app.w0.c(r9)
            int r10 = r5.f1628a
            int r10 = o.g.b(r10)
            if (r10 == 0) goto L_0x0034
            if (r10 == r8) goto L_0x0030
            if (r10 == r7) goto L_0x0034
            if (r10 == r6) goto L_0x0034
            goto L_0x000a
        L_0x0030:
            if (r9 == r7) goto L_0x000a
            r4 = r5
            goto L_0x000a
        L_0x0034:
            if (r9 != r7) goto L_0x000a
            if (r3 != 0) goto L_0x000a
            r3 = r5
            goto L_0x000a
        L_0x003a:
            boolean r2 = androidx.fragment.app.y.I(r7)
            java.lang.String r5 = " to "
            java.lang.String r6 = "FragmentManager"
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Executing operations from "
            r2.append(r7)
            r2.append(r3)
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r6, r2)
        L_0x005e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = r35
            r8.<init>(r9)
            java.util.Iterator r9 = r35.iterator()
        L_0x0073:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00be
            java.lang.Object r10 = r9.next()
            androidx.fragment.app.t0$b r10 = (androidx.fragment.app.t0.b) r10
            d0.d r11 = new d0.d
            r11.<init>()
            r10.d()
            java.util.HashSet<d0.d> r12 = r10.f1632e
            r12.add(r11)
            androidx.fragment.app.m$a r12 = new androidx.fragment.app.m$a
            r12.<init>(r10, r11, r1)
            r2.add(r12)
            d0.d r11 = new d0.d
            r11.<init>()
            r10.d()
            java.util.HashSet<d0.d> r12 = r10.f1632e
            r12.add(r11)
            androidx.fragment.app.m$c r12 = new androidx.fragment.app.m$c
            if (r1 == 0) goto L_0x00a8
            if (r10 != r3) goto L_0x00ac
            goto L_0x00aa
        L_0x00a8:
            if (r10 != r4) goto L_0x00ac
        L_0x00aa:
            r13 = 1
            goto L_0x00ad
        L_0x00ac:
            r13 = 0
        L_0x00ad:
            r12.<init>(r10, r11, r1, r13)
            r7.add(r12)
            androidx.fragment.app.d r11 = new androidx.fragment.app.d
            r11.<init>(r0, r8, r10)
            java.util.ArrayList r10 = r10.f1631d
            r10.add(r11)
            goto L_0x0073
        L_0x00be:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r10 = r7.iterator()
            r11 = 0
        L_0x00c8:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0148
            java.lang.Object r12 = r10.next()
            androidx.fragment.app.m$c r12 = (androidx.fragment.app.m.c) r12
            boolean r13 = r12.b()
            if (r13 == 0) goto L_0x00db
            goto L_0x00c8
        L_0x00db:
            java.lang.Object r13 = r12.f1540c
            androidx.fragment.app.o0 r13 = r12.c(r13)
            java.lang.Object r14 = r12.f1542e
            androidx.fragment.app.o0 r14 = r12.c(r14)
            java.lang.String r15 = " returned Transition "
            java.lang.String r16 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r13 == 0) goto L_0x0119
            if (r14 == 0) goto L_0x0119
            if (r13 != r14) goto L_0x00f2
            goto L_0x0119
        L_0x00f2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r16)
            androidx.fragment.app.t0$b r3 = r12.f1538a
            androidx.fragment.app.o r3 = r3.f1630c
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r12.f1540c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r3 = r12.f1542e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0119:
            if (r13 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r13 = r14
        L_0x011d:
            if (r11 != 0) goto L_0x0121
            r11 = r13
            goto L_0x00c8
        L_0x0121:
            if (r13 == 0) goto L_0x00c8
            if (r11 != r13) goto L_0x0126
            goto L_0x00c8
        L_0x0126:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = androidx.activity.f.g(r16)
            androidx.fragment.app.t0$b r3 = r12.f1538a
            androidx.fragment.app.o r3 = r3.f1630c
            r2.append(r3)
            r2.append(r15)
            java.lang.Object r3 = r12.f1540c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than other Fragments."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0148:
            if (r11 != 0) goto L_0x016d
            java.util.Iterator r1 = r7.iterator()
        L_0x014e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0165
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.m$c r7 = (androidx.fragment.app.m.c) r7
            androidx.fragment.app.t0$b r10 = r7.f1538a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r9.put(r10, r11)
            r7.a()
            goto L_0x014e
        L_0x0165:
            r23 = r2
            r22 = r5
            r14 = r6
            r15 = r9
            goto L_0x05a4
        L_0x016d:
            android.view.View r10 = new android.view.View
            android.view.ViewGroup r12 = r0.f1622a
            android.content.Context r12 = r12.getContext()
            r10.<init>(r12)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            m.b r12 = new m.b
            r12.<init>()
            java.util.Iterator r18 = r7.iterator()
            r16 = 0
            r17 = 0
            r19 = 0
            r23 = r2
            r2 = r3
            r22 = r5
            r24 = r8
            r5 = r16
            r20 = r17
            r8 = r4
        L_0x01a2:
            boolean r16 = r18.hasNext()
            if (r16 == 0) goto L_0x03cf
            java.lang.Object r16 = r18.next()
            r35 = r5
            r5 = r16
            androidx.fragment.app.m$c r5 = (androidx.fragment.app.m.c) r5
            java.lang.Object r5 = r5.f1542e
            if (r5 == 0) goto L_0x01b9
            r16 = 1
            goto L_0x01bb
        L_0x01b9:
            r16 = 0
        L_0x01bb:
            if (r16 == 0) goto L_0x03b0
            if (r2 == 0) goto L_0x03b0
            if (r8 == 0) goto L_0x03b0
            java.lang.Object r5 = r11.f(r5)
            java.lang.Object r5 = r11.r(r5)
            r21 = r7
            androidx.fragment.app.o r7 = r8.f1630c
            androidx.fragment.app.o$b r7 = r7.I
            if (r7 == 0) goto L_0x01d5
            java.util.ArrayList<java.lang.String> r7 = r7.f1592g
            if (r7 != 0) goto L_0x01da
        L_0x01d5:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x01da:
            r25 = r9
            androidx.fragment.app.o r9 = r2.f1630c
            androidx.fragment.app.o$b r9 = r9.I
            if (r9 == 0) goto L_0x01e6
            java.util.ArrayList<java.lang.String> r9 = r9.f1592g
            if (r9 != 0) goto L_0x01eb
        L_0x01e6:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x01eb:
            r26 = r10
            androidx.fragment.app.o r10 = r2.f1630c
            androidx.fragment.app.o$b r10 = r10.I
            if (r10 == 0) goto L_0x01f7
            java.util.ArrayList<java.lang.String> r10 = r10.f1593h
            if (r10 != 0) goto L_0x01fc
        L_0x01f7:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x01fc:
            r16 = 0
            r35 = r5
            r17 = r15
            r15 = r16
        L_0x0204:
            int r5 = r10.size()
            r27 = r11
            r11 = -1
            if (r15 >= r5) goto L_0x0225
            java.lang.Object r5 = r10.get(r15)
            int r5 = r7.indexOf(r5)
            if (r5 == r11) goto L_0x0220
            java.lang.Object r11 = r9.get(r15)
            java.lang.String r11 = (java.lang.String) r11
            r7.set(r5, r11)
        L_0x0220:
            int r15 = r15 + 1
            r11 = r27
            goto L_0x0204
        L_0x0225:
            androidx.fragment.app.o r5 = r8.f1630c
            androidx.fragment.app.o$b r5 = r5.I
            if (r5 == 0) goto L_0x022f
            java.util.ArrayList<java.lang.String> r5 = r5.f1593h
            if (r5 != 0) goto L_0x0234
        L_0x022f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0234:
            androidx.fragment.app.o r9 = r2.f1630c
            r9.getClass()
            androidx.fragment.app.o r9 = r8.f1630c
            r9.getClass()
            int r9 = r7.size()
            r10 = 0
        L_0x0243:
            if (r10 >= r9) goto L_0x0257
            java.lang.Object r11 = r7.get(r10)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r15 = r5.get(r10)
            java.lang.String r15 = (java.lang.String) r15
            r12.put(r11, r15)
            int r10 = r10 + 1
            goto L_0x0243
        L_0x0257:
            r9 = 2
            boolean r9 = androidx.fragment.app.y.I(r9)
            if (r9 == 0) goto L_0x02b0
            java.lang.String r9 = ">>> entering view names <<<"
            android.util.Log.v(r6, r9)
            java.util.Iterator r9 = r5.iterator()
        L_0x0267:
            boolean r10 = r9.hasNext()
            java.lang.String r11 = "Name: "
            if (r10 == 0) goto L_0x0288
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            android.util.Log.v(r6, r10)
            goto L_0x0267
        L_0x0288:
            java.lang.String r9 = ">>> exiting view names <<<"
            android.util.Log.v(r6, r9)
            java.util.Iterator r9 = r7.iterator()
        L_0x0291:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02b0
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            android.util.Log.v(r6, r10)
            goto L_0x0291
        L_0x02b0:
            m.b r9 = new m.b
            r9.<init>()
            androidx.fragment.app.o r10 = r2.f1630c
            android.view.View r10 = r10.F
            j(r9, r10)
            m.g.k(r7, r9)
            java.util.Set r10 = r9.keySet()
            m.g.k(r10, r12)
            m.b r10 = new m.b
            r10.<init>()
            androidx.fragment.app.o r11 = r8.f1630c
            android.view.View r11 = r11.F
            j(r10, r11)
            m.g.k(r5, r10)
            java.util.Collection r11 = r12.values()
            m.g.k(r11, r10)
            androidx.fragment.app.k0 r11 = androidx.fragment.app.i0.f1516a
            int r11 = r12.f9301c
        L_0x02e0:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x02f4
            java.lang.Object r15 = r12.l(r11)
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r10.containsKey(r15)
            if (r15 != 0) goto L_0x02e0
            r12.j(r11)
            goto L_0x02e0
        L_0x02f4:
            java.util.Set r11 = r12.keySet()
            k(r9, r11)
            java.util.Collection r11 = r12.values()
            k(r10, r11)
            boolean r11 = r12.isEmpty()
            if (r11 == 0) goto L_0x031e
            r14.clear()
            r13.clear()
            r5 = 0
            r7 = r12
            r10 = r13
            r1 = r14
            r9 = r17
            r15 = r25
            r11 = r27
            r12 = r8
            r8 = r5
            r5 = r26
            goto L_0x03be
        L_0x031e:
            androidx.fragment.app.o r8 = r8.f1630c
            androidx.fragment.app.o r2 = r2.f1630c
            if (r1 == 0) goto L_0x0328
            r2.getClass()
            goto L_0x032b
        L_0x0328:
            r8.getClass()
        L_0x032b:
            android.view.ViewGroup r2 = r0.f1622a
            androidx.fragment.app.i r8 = new androidx.fragment.app.i
            r8.<init>(r4, r3, r1, r10)
            h0.t.a(r2, r8)
            java.util.Collection r2 = r9.values()
            r14.addAll(r2)
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L_0x035a
            r2 = 0
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            java.lang.Object r7 = r9.getOrDefault(r7, r8)
            android.view.View r7 = (android.view.View) r7
            r9 = r35
            r11 = r27
            r11.m(r7, r9)
            r20 = r7
            goto L_0x0360
        L_0x035a:
            r9 = r35
            r11 = r27
            r2 = 0
            r8 = 0
        L_0x0360:
            java.util.Collection r7 = r10.values()
            r13.addAll(r7)
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x038a
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r10.getOrDefault(r2, r8)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x038a
            android.view.ViewGroup r5 = r0.f1622a
            androidx.fragment.app.j r7 = new androidx.fragment.app.j
            r8 = r17
            r7.<init>(r11, r2, r8)
            h0.t.a(r5, r7)
            r19 = 1
            goto L_0x038c
        L_0x038a:
            r8 = r17
        L_0x038c:
            r5 = r26
            r11.p(r9, r5, r14)
            r2 = 0
            r15 = 0
            r7 = r12
            r12 = r11
            r10 = r13
            r13 = r9
            r1 = r14
            r14 = r2
            r2 = r8
            r16 = r9
            r17 = r10
            r12.l(r13, r14, r15, r16, r17)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r15 = r25
            r15.put(r3, r8)
            r15.put(r4, r8)
            r12 = r4
            r8 = r9
            r9 = r2
            r2 = r3
            goto L_0x03be
        L_0x03b0:
            r21 = r7
            r5 = r10
            r7 = r12
            r10 = r13
            r1 = r14
            r33 = r15
            r15 = r9
            r9 = r33
            r12 = r8
            r8 = r35
        L_0x03be:
            r14 = r1
            r13 = r10
            r1 = r36
            r10 = r5
            r5 = r8
            r8 = r12
            r12 = r7
            r7 = r21
            r33 = r15
            r15 = r9
            r9 = r33
            goto L_0x01a2
        L_0x03cf:
            r35 = r5
            r21 = r7
            r5 = r10
            r7 = r12
            r10 = r13
            r1 = r14
            r33 = r15
            r15 = r9
            r9 = r33
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r18 = r21.iterator()
            r12 = 0
            r13 = 0
            r33 = r13
            r13 = r12
            r12 = r33
        L_0x03ec:
            boolean r16 = r18.hasNext()
            if (r16 == 0) goto L_0x0508
            java.lang.Object r16 = r18.next()
            r25 = r7
            r7 = r16
            androidx.fragment.app.m$c r7 = (androidx.fragment.app.m.c) r7
            boolean r16 = r7.b()
            if (r16 == 0) goto L_0x0417
            r36 = r12
            androidx.fragment.app.t0$b r12 = r7.f1538a
            r16 = r13
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r15.put(r12, r13)
            r7.a()
            r12 = r36
            r13 = r16
            r7 = r25
            goto L_0x03ec
        L_0x0417:
            r36 = r12
            r16 = r13
            java.lang.Object r12 = r7.f1540c
            java.lang.Object r13 = r11.f(r12)
            androidx.fragment.app.t0$b r12 = r7.f1538a
            if (r35 == 0) goto L_0x042b
            if (r12 == r2) goto L_0x0429
            if (r12 != r8) goto L_0x042b
        L_0x0429:
            r8 = 1
            goto L_0x042c
        L_0x042b:
            r8 = 0
        L_0x042c:
            if (r13 != 0) goto L_0x0445
            if (r8 != 0) goto L_0x0438
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r15.put(r12, r2)
            r7.a()
        L_0x0438:
            r13 = r36
            r26 = r6
            r12 = r14
            r29 = r16
            r6 = r20
            r8 = r24
            goto L_0x04f8
        L_0x0445:
            r26 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r17 = r14
            androidx.fragment.app.o r14 = r12.f1630c
            android.view.View r14 = r14.F
            i(r6, r14)
            if (r8 == 0) goto L_0x0460
            if (r12 != r2) goto L_0x045d
            r6.removeAll(r1)
            goto L_0x0460
        L_0x045d:
            r6.removeAll(r10)
        L_0x0460:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0474
            r11.a(r5, r13)
            r31 = r36
            r2 = r12
            r14 = r13
            r32 = r15
            r29 = r16
            r30 = r17
            goto L_0x04c0
        L_0x0474:
            r11.b(r13, r6)
            r2 = 0
            r8 = 0
            r14 = r36
            r28 = r12
            r12 = r11
            r36 = r13
            r29 = r16
            r31 = r14
            r30 = r17
            r14 = r36
            r32 = r15
            r15 = r6
            r16 = r2
            r17 = r8
            r12.l(r13, r14, r15, r16, r17)
            r2 = r28
            int r8 = r2.f1628a
            r12 = 3
            if (r8 != r12) goto L_0x04be
            r8 = r24
            r8.remove(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r6)
            androidx.fragment.app.o r13 = r2.f1630c
            android.view.View r13 = r13.F
            r12.remove(r13)
            androidx.fragment.app.o r13 = r2.f1630c
            android.view.View r13 = r13.F
            r14 = r36
            r11.k(r14, r13, r12)
            android.view.ViewGroup r12 = r0.f1622a
            androidx.fragment.app.k r13 = new androidx.fragment.app.k
            r13.<init>(r6)
            h0.t.a(r12, r13)
            goto L_0x04c2
        L_0x04be:
            r14 = r36
        L_0x04c0:
            r8 = r24
        L_0x04c2:
            int r12 = r2.f1628a
            r13 = 2
            if (r12 != r13) goto L_0x04d4
            r12 = r30
            r12.addAll(r6)
            if (r19 == 0) goto L_0x04d1
            r11.n(r14, r9)
        L_0x04d1:
            r6 = r20
            goto L_0x04db
        L_0x04d4:
            r6 = r20
            r12 = r30
            r11.m(r6, r14)
        L_0x04db:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r15 = r32
            r15.put(r2, r13)
            boolean r2 = r7.f1541d
            if (r2 == 0) goto L_0x04ee
            r13 = r31
            java.lang.Object r2 = r11.j(r13, r14)
            r13 = r2
            goto L_0x04f8
        L_0x04ee:
            r2 = r29
            r13 = r31
            java.lang.Object r2 = r11.j(r2, r14)
            r29 = r2
        L_0x04f8:
            r2 = r3
            r20 = r6
            r24 = r8
            r14 = r12
            r12 = r13
            r7 = r25
            r6 = r26
            r13 = r29
            r8 = r4
            goto L_0x03ec
        L_0x0508:
            r26 = r6
            r25 = r7
            r2 = r13
            r8 = r24
            r7 = r35
            r13 = r12
            r12 = r14
            java.lang.Object r2 = r11.i(r13, r2, r7)
            if (r2 != 0) goto L_0x051d
            r14 = r26
            goto L_0x05a4
        L_0x051d:
            java.util.Iterator r5 = r21.iterator()
        L_0x0521:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0598
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.m$c r6 = (androidx.fragment.app.m.c) r6
            boolean r9 = r6.b()
            if (r9 == 0) goto L_0x0534
            goto L_0x0521
        L_0x0534:
            java.lang.Object r9 = r6.f1540c
            androidx.fragment.app.t0$b r13 = r6.f1538a
            if (r7 == 0) goto L_0x0540
            if (r13 == r3) goto L_0x053e
            if (r13 != r4) goto L_0x0540
        L_0x053e:
            r14 = 1
            goto L_0x0541
        L_0x0540:
            r14 = 0
        L_0x0541:
            if (r9 != 0) goto L_0x054b
            if (r14 == 0) goto L_0x0546
            goto L_0x054b
        L_0x0546:
            r35 = r5
            r14 = r26
            goto L_0x0593
        L_0x054b:
            android.view.ViewGroup r9 = r0.f1622a
            java.util.WeakHashMap<android.view.View, h0.l0> r14 = h0.y.f6776a
            boolean r9 = h0.y.g.c(r9)
            if (r9 != 0) goto L_0x0581
            r9 = 2
            boolean r9 = androidx.fragment.app.y.I(r9)
            if (r9 == 0) goto L_0x0579
            java.lang.String r9 = "SpecialEffectsController: Container "
            java.lang.StringBuilder r9 = androidx.activity.f.g(r9)
            android.view.ViewGroup r14 = r0.f1622a
            r9.append(r14)
            java.lang.String r14 = " has not been laid out. Completing operation "
            r9.append(r14)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            r14 = r26
            android.util.Log.v(r14, r9)
            goto L_0x057b
        L_0x0579:
            r14 = r26
        L_0x057b:
            r6.a()
            r35 = r5
            goto L_0x0593
        L_0x0581:
            r14 = r26
            androidx.fragment.app.t0$b r9 = r6.f1538a
            androidx.fragment.app.o r9 = r9.f1630c
            d0.d r9 = r6.f1539b
            r35 = r5
            androidx.fragment.app.l r5 = new androidx.fragment.app.l
            r5.<init>(r6, r13)
            r11.o(r2, r9, r5)
        L_0x0593:
            r5 = r35
            r26 = r14
            goto L_0x0521
        L_0x0598:
            r14 = r26
            android.view.ViewGroup r5 = r0.f1622a
            java.util.WeakHashMap<android.view.View, h0.l0> r6 = h0.y.f6776a
            boolean r5 = h0.y.g.c(r5)
            if (r5 != 0) goto L_0x05af
        L_0x05a4:
            r1 = 0
            r26 = r3
            r24 = r4
            r27 = r8
            r28 = r14
            goto L_0x06de
        L_0x05af:
            r5 = 4
            androidx.fragment.app.i0.a(r12, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r10.size()
            r9 = 0
        L_0x05bd:
            if (r9 >= r6) goto L_0x05d9
            java.lang.Object r13 = r10.get(r9)
            android.view.View r13 = (android.view.View) r13
            java.util.WeakHashMap<android.view.View, h0.l0> r16 = h0.y.f6776a
            r35 = r6
            java.lang.String r6 = h0.y.i.k(r13)
            r5.add(r6)
            r6 = 0
            h0.y.i.v(r13, r6)
            int r9 = r9 + 1
            r6 = r35
            goto L_0x05bd
        L_0x05d9:
            r6 = 2
            boolean r6 = androidx.fragment.app.y.I(r6)
            if (r6 == 0) goto L_0x0659
            java.lang.String r6 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r14, r6)
            java.lang.String r6 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r14, r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x05ee:
            boolean r9 = r6.hasNext()
            java.lang.String r13 = " Name: "
            r24 = r4
            java.lang.String r4 = "View: "
            if (r9 == 0) goto L_0x0623
            java.lang.Object r9 = r6.next()
            android.view.View r9 = (android.view.View) r9
            r35 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r13)
            java.lang.String r4 = h0.y.i.k(r9)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.v(r14, r4)
            r6 = r35
            r4 = r24
            goto L_0x05ee
        L_0x0623:
            java.lang.String r6 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r14, r6)
            java.util.Iterator r6 = r10.iterator()
        L_0x062c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x065b
            java.lang.Object r9 = r6.next()
            android.view.View r9 = (android.view.View) r9
            r35 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            r6.append(r13)
            java.lang.String r9 = h0.y.i.k(r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r14, r6)
            r6 = r35
            goto L_0x062c
        L_0x0659:
            r24 = r4
        L_0x065b:
            android.view.ViewGroup r4 = r0.f1622a
            r11.c(r4, r2)
            android.view.ViewGroup r2 = r0.f1622a
            int r4 = r10.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9 = 0
        L_0x066c:
            if (r9 >= r4) goto L_0x06bc
            java.lang.Object r13 = r1.get(r9)
            android.view.View r13 = (android.view.View) r13
            java.util.WeakHashMap<android.view.View, h0.l0> r16 = h0.y.f6776a
            r26 = r3
            java.lang.String r3 = h0.y.i.k(r13)
            r6.add(r3)
            r27 = r8
            if (r3 != 0) goto L_0x0686
            r28 = r14
            goto L_0x06b3
        L_0x0686:
            r8 = 0
            h0.y.i.v(r13, r8)
            r13 = r25
            java.lang.Object r8 = r13.getOrDefault(r3, r8)
            java.lang.String r8 = (java.lang.String) r8
            r16 = 0
            r13 = r16
        L_0x0696:
            r28 = r14
            if (r13 >= r4) goto L_0x06b3
            java.lang.Object r14 = r5.get(r13)
            boolean r14 = r8.equals(r14)
            if (r14 == 0) goto L_0x06ae
            java.lang.Object r8 = r10.get(r13)
            android.view.View r8 = (android.view.View) r8
            h0.y.i.v(r8, r3)
            goto L_0x06b3
        L_0x06ae:
            int r13 = r13 + 1
            r14 = r28
            goto L_0x0696
        L_0x06b3:
            int r9 = r9 + 1
            r3 = r26
            r8 = r27
            r14 = r28
            goto L_0x066c
        L_0x06bc:
            r26 = r3
            r27 = r8
            r28 = r14
            androidx.fragment.app.n0 r3 = new androidx.fragment.app.n0
            r16 = r3
            r17 = r4
            r18 = r10
            r19 = r5
            r20 = r1
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            h0.t.a(r2, r3)
            r2 = 0
            androidx.fragment.app.i0.a(r12, r2)
            r11.q(r7, r1, r10)
            r1 = r2
        L_0x06de:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r15.containsValue(r2)
            android.view.ViewGroup r9 = r0.f1622a
            android.content.Context r10 = r9.getContext()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r23.iterator()
            r3 = r1
        L_0x06f4:
            boolean r4 = r12.hasNext()
            java.lang.String r13 = " has started."
            if (r4 == 0) goto L_0x07c4
            java.lang.Object r4 = r12.next()
            r14 = r4
            androidx.fragment.app.m$a r14 = (androidx.fragment.app.m.a) r14
            boolean r4 = r14.b()
            if (r4 == 0) goto L_0x070a
            goto L_0x0710
        L_0x070a:
            androidx.fragment.app.q r4 = r14.c(r10)
            if (r4 != 0) goto L_0x0714
        L_0x0710:
            r14.a()
            goto L_0x071b
        L_0x0714:
            android.animation.Animator r8 = r4.f1608b
            if (r8 != 0) goto L_0x071e
            r11.add(r14)
        L_0x071b:
            r6 = r28
            goto L_0x0756
        L_0x071e:
            androidx.fragment.app.t0$b r7 = r14.f1538a
            androidx.fragment.app.o r4 = r7.f1630c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            java.lang.Object r6 = r15.get(r7)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0759
            r5 = 2
            boolean r5 = androidx.fragment.app.y.I(r5)
            if (r5 == 0) goto L_0x0751
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Ignoring Animator set on "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " as this Fragment was involved in a Transition."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r6 = r28
            android.util.Log.v(r6, r4)
            goto L_0x0753
        L_0x0751:
            r6 = r28
        L_0x0753:
            r14.a()
        L_0x0756:
            r28 = r6
            goto L_0x06f4
        L_0x0759:
            r6 = r28
            int r3 = r7.f1628a
            r5 = 3
            if (r3 != r5) goto L_0x0761
            r1 = 1
        L_0x0761:
            if (r1 == 0) goto L_0x0769
            r5 = r27
            r5.remove(r7)
            goto L_0x076b
        L_0x0769:
            r5 = r27
        L_0x076b:
            android.view.View r4 = r4.F
            r9.startViewTransition(r4)
            androidx.fragment.app.e r3 = new androidx.fragment.app.e
            r35 = r3
            r36 = r4
            r4 = r9
            r16 = r5
            r5 = r36
            r0 = r6
            r6 = r1
            r1 = r7
            r17 = r12
            r12 = r8
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r12.addListener(r3)
            r3 = r36
            r12.setTarget(r3)
            r12.start()
            r3 = 2
            boolean r3 = androidx.fragment.app.y.I(r3)
            if (r3 == 0) goto L_0x07ae
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Animator from operation "
            r3.append(r4)
            r3.append(r1)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r0, r3)
        L_0x07ae:
            d0.d r3 = r14.f1539b
            androidx.fragment.app.f r4 = new androidx.fragment.app.f
            r4.<init>(r12, r1)
            r3.b(r4)
            r1 = 0
            r3 = 1
            r28 = r0
            r27 = r16
            r12 = r17
            r0 = r34
            goto L_0x06f4
        L_0x07c4:
            r16 = r27
            r0 = r28
            java.util.Iterator r1 = r11.iterator()
        L_0x07cc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0870
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.m$a r4 = (androidx.fragment.app.m.a) r4
            androidx.fragment.app.t0$b r5 = r4.f1538a
            androidx.fragment.app.o r6 = r5.f1630c
            java.lang.String r7 = "Ignoring Animation set on "
            if (r2 == 0) goto L_0x07f5
            r5 = 2
            boolean r5 = androidx.fragment.app.y.I(r5)
            if (r5 == 0) goto L_0x0815
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Transitions."
            goto L_0x080b
        L_0x07f5:
            r8 = 2
            if (r3 == 0) goto L_0x0819
            boolean r5 = androidx.fragment.app.y.I(r8)
            if (r5 == 0) goto L_0x0815
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " as Animations cannot run alongside Animators."
        L_0x080b:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r0, r5)
        L_0x0815:
            r4.a()
            goto L_0x07cc
        L_0x0819:
            android.view.View r6 = r6.F
            androidx.fragment.app.q r7 = r4.c(r10)
            r7.getClass()
            android.view.animation.Animation r7 = r7.f1607a
            r7.getClass()
            int r8 = r5.f1628a
            r11 = 1
            if (r8 == r11) goto L_0x0833
            r6.startAnimation(r7)
            r4.a()
            goto L_0x0864
        L_0x0833:
            r9.startViewTransition(r6)
            androidx.fragment.app.r r8 = new androidx.fragment.app.r
            r8.<init>(r7, r9, r6)
            androidx.fragment.app.g r7 = new androidx.fragment.app.g
            r7.<init>(r6, r9, r4, r5)
            r8.setAnimationListener(r7)
            r6.startAnimation(r8)
            r7 = 2
            boolean r7 = androidx.fragment.app.y.I(r7)
            if (r7 == 0) goto L_0x0864
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Animation from operation "
            r7.append(r8)
            r7.append(r5)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r0, r7)
        L_0x0864:
            d0.d r7 = r4.f1539b
            androidx.fragment.app.h r8 = new androidx.fragment.app.h
            r8.<init>(r6, r9, r4, r5)
            r7.b(r8)
            goto L_0x07cc
        L_0x0870:
            java.util.Iterator r1 = r16.iterator()
        L_0x0874:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x088a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.t0$b r2 = (androidx.fragment.app.t0.b) r2
            androidx.fragment.app.o r3 = r2.f1630c
            android.view.View r3 = r3.F
            int r2 = r2.f1628a
            androidx.fragment.app.w0.a(r2, r3)
            goto L_0x0874
        L_0x088a:
            r16.clear()
            r1 = 2
            boolean r1 = androidx.fragment.app.y.I(r1)
            if (r1 == 0) goto L_0x08b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Completed executing operations from "
            r1.append(r2)
            r3 = r26
            r1.append(r3)
            r2 = r22
            r1.append(r2)
            r4 = r24
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x08b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.b(java.util.ArrayList, boolean):void");
    }
}
