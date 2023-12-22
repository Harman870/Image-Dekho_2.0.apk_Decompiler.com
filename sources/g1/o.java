package g1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.b;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static a f6531a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<b<ViewGroup, ArrayList<k>>>> f6532b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f6533c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public k f6534a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f6535b;

        /* renamed from: g1.o$a$a  reason: collision with other inner class name */
        public class C0085a extends n {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f6536a;

            public C0085a(b bVar) {
                this.f6536a = bVar;
            }

            public final void b(k kVar) {
                ((ArrayList) this.f6536a.getOrDefault(a.this.f6535b, null)).remove(kVar);
                kVar.z(this);
            }
        }

        public a(ViewGroup viewGroup, k kVar) {
            this.f6534a = kVar;
            this.f6535b = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x021f  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01f9 A[EDGE_INSN: B:146:0x01f9->B:94:0x01f9 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01fe  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f6535b
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f6535b
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = g1.o.f6533c
                android.view.ViewGroup r2 = r0.f6535b
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                m.b r1 = g1.o.b()
                android.view.ViewGroup r3 = r0.f6535b
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f6535b
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                g1.k r6 = r0.f6534a
                r3.add(r6)
                g1.k r3 = r0.f6534a
                g1.o$a$a r6 = new g1.o$a$a
                r6.<init>(r1)
                r3.b(r6)
                g1.k r1 = r0.f6534a
                android.view.ViewGroup r3 = r0.f6535b
                r6 = 0
                r1.i(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                g1.k r3 = (g1.k) r3
                android.view.ViewGroup r5 = r0.f6535b
                r3.B(r5)
                goto L_0x0060
            L_0x0072:
                g1.k r1 = r0.f6534a
                android.view.ViewGroup r8 = r0.f6535b
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.k = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f6514l = r3
                g1.s r3 = r1.f6510g
                g1.s r5 = r1.f6511h
                m.b r7 = new m.b
                m.b<android.view.View, g1.r> r9 = r3.f6549a
                r7.<init>((m.b) r9)
                m.b r9 = new m.b
                m.b<android.view.View, g1.r> r10 = r5.f6549a
                r9.<init>((m.b) r10)
                r10 = r6
            L_0x009a:
                int[] r11 = r1.f6513j
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01f9
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01b9
                r12 = 2
                if (r11 == r12) goto L_0x016b
                r12 = 3
                if (r11 == r12) goto L_0x0117
                r12 = 4
                if (r11 == r12) goto L_0x00af
            L_0x00ac:
                r17 = r3
                goto L_0x0113
            L_0x00af:
                m.e<android.view.View> r11 = r3.f6551c
                m.e<android.view.View> r12 = r5.f6551c
                boolean r13 = r11.f9271a
                if (r13 == 0) goto L_0x00ba
                r11.d()
            L_0x00ba:
                int r13 = r11.f9274d
                r14 = r6
            L_0x00bd:
                if (r14 >= r13) goto L_0x00ac
                java.lang.Object r15 = r11.g(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0109
                boolean r16 = r1.w(r15)
                if (r16 == 0) goto L_0x0109
                boolean r6 = r11.f9271a
                if (r6 == 0) goto L_0x00d4
                r11.d()
            L_0x00d4:
                long[] r6 = r11.f9272b
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.e(r2, r4)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x010b
                boolean r3 = r1.w(r2)
                if (r3 == 0) goto L_0x010b
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                g1.r r3 = (g1.r) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                g1.r r6 = (g1.r) r6
                if (r3 == 0) goto L_0x010b
                if (r6 == 0) goto L_0x010b
                java.util.ArrayList<g1.r> r4 = r1.k
                r4.add(r3)
                java.util.ArrayList<g1.r> r3 = r1.f6514l
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x010b
            L_0x0109:
                r17 = r3
            L_0x010b:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00bd
            L_0x0113:
                r2 = r17
                goto L_0x01ef
            L_0x0117:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f6550b
                android.util.SparseArray<android.view.View> r4 = r5.f6550b
                int r6 = r3.size()
                r11 = 0
            L_0x0121:
                if (r11 >= r6) goto L_0x01ef
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0166
                boolean r13 = r1.w(r12)
                if (r13 == 0) goto L_0x0166
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0166
                boolean r14 = r1.w(r13)
                if (r14 == 0) goto L_0x0166
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                g1.r r15 = (g1.r) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                g1.r r14 = (g1.r) r14
                if (r15 == 0) goto L_0x0166
                if (r14 == 0) goto L_0x0166
                java.util.ArrayList<g1.r> r0 = r1.k
                r0.add(r15)
                java.util.ArrayList<g1.r> r0 = r1.f6514l
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0166:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x0121
            L_0x016b:
                r2 = r3
                m.b<java.lang.String, android.view.View> r0 = r2.f6552d
                m.b<java.lang.String, android.view.View> r3 = r5.f6552d
                int r4 = r0.f9301c
                r6 = 0
            L_0x0173:
                if (r6 >= r4) goto L_0x01ef
                java.lang.Object r11 = r0.l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01b6
                boolean r12 = r1.w(r11)
                if (r12 == 0) goto L_0x01b6
                java.lang.Object r12 = r0.h(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01b6
                boolean r14 = r1.w(r12)
                if (r14 == 0) goto L_0x01b6
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                g1.r r14 = (g1.r) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                g1.r r15 = (g1.r) r15
                if (r14 == 0) goto L_0x01b6
                if (r15 == 0) goto L_0x01b6
                java.util.ArrayList<g1.r> r13 = r1.k
                r13.add(r14)
                java.util.ArrayList<g1.r> r13 = r1.f6514l
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01b6:
                int r6 = r6 + 1
                goto L_0x0173
            L_0x01b9:
                r2 = r3
                int r0 = r7.f9301c
            L_0x01bc:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01ef
                java.lang.Object r3 = r7.h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01bc
                boolean r4 = r1.w(r3)
                if (r4 == 0) goto L_0x01bc
                java.lang.Object r3 = r9.remove(r3)
                g1.r r3 = (g1.r) r3
                if (r3 == 0) goto L_0x01bc
                android.view.View r4 = r3.f6547b
                boolean r4 = r1.w(r4)
                if (r4 == 0) goto L_0x01bc
                java.lang.Object r4 = r7.j(r0)
                g1.r r4 = (g1.r) r4
                java.util.ArrayList<g1.r> r6 = r1.k
                r6.add(r4)
                java.util.ArrayList<g1.r> r4 = r1.f6514l
                r4.add(r3)
                goto L_0x01bc
            L_0x01ef:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009a
            L_0x01f9:
                r0 = 0
            L_0x01fa:
                int r2 = r7.f9301c
                if (r0 >= r2) goto L_0x021a
                java.lang.Object r2 = r7.l(r0)
                g1.r r2 = (g1.r) r2
                android.view.View r3 = r2.f6547b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x0217
                java.util.ArrayList<g1.r> r3 = r1.k
                r3.add(r2)
                java.util.ArrayList<g1.r> r2 = r1.f6514l
                r3 = 0
                r2.add(r3)
            L_0x0217:
                int r0 = r0 + 1
                goto L_0x01fa
            L_0x021a:
                r0 = 0
            L_0x021b:
                int r2 = r9.f9301c
                if (r0 >= r2) goto L_0x023b
                java.lang.Object r2 = r9.l(r0)
                g1.r r2 = (g1.r) r2
                android.view.View r3 = r2.f6547b
                boolean r3 = r1.w(r3)
                if (r3 == 0) goto L_0x0238
                java.util.ArrayList<g1.r> r3 = r1.f6514l
                r3.add(r2)
                java.util.ArrayList<g1.r> r2 = r1.k
                r3 = 0
                r2.add(r3)
            L_0x0238:
                int r0 = r0 + 1
                goto L_0x021b
            L_0x023b:
                m.b r0 = g1.k.p()
                int r2 = r0.f9301c
                g1.z r3 = g1.v.f6555a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0249:
                if (r2 < 0) goto L_0x02be
                java.lang.Object r4 = r0.h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02ba
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                g1.k$b r6 = (g1.k.b) r6
                if (r6 == 0) goto L_0x02ba
                android.view.View r5 = r6.f6523a
                if (r5 == 0) goto L_0x02ba
                g1.e0 r5 = r6.f6526d
                boolean r7 = r5 instanceof g1.d0
                if (r7 == 0) goto L_0x0272
                g1.d0 r5 = (g1.d0) r5
                android.view.WindowId r5 = r5.f6491a
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x0272
                r5 = 1
                goto L_0x0273
            L_0x0272:
                r5 = 0
            L_0x0273:
                if (r5 == 0) goto L_0x02ba
                g1.r r5 = r6.f6525c
                android.view.View r7 = r6.f6523a
                r9 = 1
                g1.r r10 = r1.r(r7, r9)
                g1.r r11 = r1.o(r7, r9)
                if (r10 != 0) goto L_0x0293
                if (r11 != 0) goto L_0x0293
                g1.s r9 = r1.f6511h
                m.b<android.view.View, g1.r> r9 = r9.f6549a
                r12 = 0
                java.lang.Object r7 = r9.getOrDefault(r7, r12)
                r11 = r7
                g1.r r11 = (g1.r) r11
                goto L_0x0294
            L_0x0293:
                r12 = 0
            L_0x0294:
                if (r10 != 0) goto L_0x0298
                if (r11 == 0) goto L_0x02a2
            L_0x0298:
                g1.k r6 = r6.f6527e
                boolean r5 = r6.v(r5, r11)
                if (r5 == 0) goto L_0x02a2
                r5 = 1
                goto L_0x02a3
            L_0x02a2:
                r5 = 0
            L_0x02a3:
                if (r5 == 0) goto L_0x02bb
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02b6
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02b2
                goto L_0x02b6
            L_0x02b2:
                r0.remove(r4)
                goto L_0x02bb
            L_0x02b6:
                r4.cancel()
                goto L_0x02bb
            L_0x02ba:
                r12 = 0
            L_0x02bb:
                int r2 = r2 + -1
                goto L_0x0249
            L_0x02be:
                g1.s r9 = r1.f6510g
                g1.s r10 = r1.f6511h
                java.util.ArrayList<g1.r> r11 = r1.k
                java.util.ArrayList<g1.r> r12 = r1.f6514l
                r7 = r1
                r7.m(r8, r9, r10, r11, r12)
                r1.C()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.o.a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f6535b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6535b.removeOnAttachStateChangeListener(this);
            o.f6533c.remove(this.f6535b);
            ArrayList orDefault = o.b().getOrDefault(this.f6535b, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).B(this.f6535b);
                }
            }
            this.f6534a.j(true);
        }
    }

    public static void a(ViewGroup viewGroup, k kVar) {
        if (!f6533c.contains(viewGroup)) {
            WeakHashMap<View, l0> weakHashMap = y.f6776a;
            if (y.g.c(viewGroup)) {
                f6533c.add(viewGroup);
                if (kVar == null) {
                    kVar = f6531a;
                }
                k k = kVar.clone();
                ArrayList orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((k) it.next()).y(viewGroup);
                    }
                }
                if (k != null) {
                    k.i(viewGroup, true);
                }
                if (((j) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (k != null) {
                        a aVar = new a(viewGroup, k);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static b<ViewGroup, ArrayList<k>> b() {
        b<ViewGroup, ArrayList<k>> bVar;
        WeakReference weakReference = f6532b.get();
        if (weakReference != null && (bVar = (b) weakReference.get()) != null) {
            return bVar;
        }
        b<ViewGroup, ArrayList<k>> bVar2 = new b<>();
        f6532b.set(new WeakReference(bVar2));
        return bVar2;
    }
}
