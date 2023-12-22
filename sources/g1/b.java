package g1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class b extends k {
    public static final d A = new d(PointF.class);
    public static final e B = new e(PointF.class);
    public static final f C = new f(PointF.class);

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f6457x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y  reason: collision with root package name */
    public static final C0084b f6458y = new C0084b(PointF.class);

    /* renamed from: z  reason: collision with root package name */
    public static final c f6459z = new c(PointF.class);

    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f6460a = new Rect();

        public a(Class cls) {
            super(cls, "boundsOrigin");
        }

        public final Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f6460a);
            Rect rect = this.f6460a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f6460a);
            this.f6460a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6460a);
        }
    }

    /* renamed from: g1.b$b  reason: collision with other inner class name */
    public class C0084b extends Property<i, PointF> {
        public C0084b(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f6463a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f6464b = round;
            int i10 = iVar.f6468f + 1;
            iVar.f6468f = i10;
            if (i10 == iVar.f6469g) {
                v.a(iVar.f6467e, iVar.f6463a, round, iVar.f6465c, iVar.f6466d);
                iVar.f6468f = 0;
                iVar.f6469g = 0;
            }
        }
    }

    public class c extends Property<i, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            iVar.getClass();
            iVar.f6465c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f6466d = round;
            int i10 = iVar.f6469g + 1;
            iVar.f6469g = i10;
            if (iVar.f6468f == i10) {
                v.a(iVar.f6467e, iVar.f6463a, iVar.f6464b, iVar.f6465c, round);
                iVar.f6468f = 0;
                iVar.f6469g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            v.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            v.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            v.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends n {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6461a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f6462b;

        public h(ViewGroup viewGroup) {
            this.f6462b = viewGroup;
        }

        public final void a() {
            u.a(this.f6462b, false);
        }

        public final void b(k kVar) {
            if (!this.f6461a) {
                u.a(this.f6462b, false);
            }
            kVar.z(this);
        }

        public final void c() {
            u.a(this.f6462b, true);
        }

        public final void d() {
            u.a(this.f6462b, false);
            this.f6461a = true;
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f6463a;

        /* renamed from: b  reason: collision with root package name */
        public int f6464b;

        /* renamed from: c  reason: collision with root package name */
        public int f6465c;

        /* renamed from: d  reason: collision with root package name */
        public int f6466d;

        /* renamed from: e  reason: collision with root package name */
        public View f6467e;

        /* renamed from: f  reason: collision with root package name */
        public int f6468f;

        /* renamed from: g  reason: collision with root package name */
        public int f6469g;

        public i(View view) {
            this.f6467e = view;
        }
    }

    static {
        new a(PointF.class);
    }

    public final void L(r rVar) {
        View view = rVar.f6547b;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        if (y.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            rVar.f6546a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            rVar.f6546a.put("android:changeBounds:parent", rVar.f6547b.getParent());
        }
    }

    public final void e(r rVar) {
        L(rVar);
    }

    public final void h(r rVar) {
        L(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator l(android.view.ViewGroup r19, g1.r r20, g1.r r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x012e
            if (r2 != 0) goto L_0x000c
            goto L_0x012e
        L_0x000c:
            java.util.HashMap r4 = r1.f6546a
            java.util.HashMap r5 = r2.f6546a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x012c
            if (r5 != 0) goto L_0x0024
            goto L_0x012c
        L_0x0024:
            android.view.View r4 = r2.f6547b
            java.util.HashMap r5 = r1.f6546a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.HashMap r7 = r2.f6546a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.HashMap r1 = r1.f6546a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.HashMap r2 = r2.f6546a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = r2
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0128
            g1.v.a(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00e9
            if (r13 != r15) goto L_0x00a9
            if (r14 != r3) goto L_0x00a9
            r0 = r18
            androidx.activity.result.c r1 = r0.f6522t
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.g(r3, r5, r6, r7)
            g1.b$f r3 = C
            goto L_0x0109
        L_0x00a9:
            r0 = r18
            g1.b$i r3 = new g1.b$i
            r3.<init>(r4)
            androidx.activity.result.c r13 = r0.f6522t
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.g(r7, r9, r8, r10)
            g1.b$b r8 = f6458y
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            androidx.activity.result.c r8 = r0.f6522t
            float r10 = (float) r11
            float r5 = (float) r5
            float r11 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.g(r10, r5, r11, r6)
            g1.b$c r6 = f6459z
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            g1.b$g r1 = new g1.b$g
            r1.<init>(r3)
            r6.addListener(r1)
            goto L_0x010e
        L_0x00e9:
            r0 = r18
            if (r7 != r8) goto L_0x00fd
            if (r9 == r10) goto L_0x00f0
            goto L_0x00fd
        L_0x00f0:
            androidx.activity.result.c r1 = r0.f6522t
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.g(r3, r5, r7, r6)
            g1.b$d r3 = A
            goto L_0x0109
        L_0x00fd:
            androidx.activity.result.c r1 = r0.f6522t
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.g(r3, r5, r6, r7)
            g1.b$e r3 = B
        L_0x0109:
            r5 = 0
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
        L_0x010e:
            android.view.ViewParent r1 = r4.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0127
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            g1.u.a(r1, r2)
            g1.b$h r2 = new g1.b$h
            r2.<init>(r1)
            r0.b(r2)
        L_0x0127:
            return r6
        L_0x0128:
            r0 = r18
            r1 = 0
            return r1
        L_0x012c:
            r1 = 0
            return r1
        L_0x012e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.b.l(android.view.ViewGroup, g1.r, g1.r):android.animation.Animator");
    }

    public final String[] q() {
        return f6457x;
    }
}
