package g1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import g1.k;

public abstract class c0 extends k {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f6475y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x  reason: collision with root package name */
    public int f6476x = 3;

    public static class a extends AnimatorListenerAdapter implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f6477a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6478b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f6479c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6480d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6481e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6482f = false;

        public a(View view, int i10) {
            this.f6477a = view;
            this.f6478b = i10;
            this.f6479c = (ViewGroup) view.getParent();
            this.f6480d = true;
            f(true);
        }

        public final void a() {
            f(false);
        }

        public final void b(k kVar) {
            if (!this.f6482f) {
                v.f6555a.x(this.f6477a, this.f6478b);
                ViewGroup viewGroup = this.f6479c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            kVar.z(this);
        }

        public final void c() {
            f(true);
        }

        public final void d() {
        }

        public final void e(k kVar) {
        }

        public final void f(boolean z9) {
            ViewGroup viewGroup;
            if (this.f6480d && this.f6481e != z9 && (viewGroup = this.f6479c) != null) {
                this.f6481e = z9;
                u.a(viewGroup, z9);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f6482f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f6482f) {
                v.f6555a.x(this.f6477a, this.f6478b);
                ViewGroup viewGroup = this.f6479c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f6482f) {
                v.f6555a.x(this.f6477a, this.f6478b);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f6482f) {
                v.f6555a.x(this.f6477a, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6483a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6484b;

        /* renamed from: c  reason: collision with root package name */
        public int f6485c;

        /* renamed from: d  reason: collision with root package name */
        public int f6486d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f6487e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f6488f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r8 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f6487e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r0.f6485c == 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g1.c0.b M(g1.r r7, g1.r r8) {
        /*
            g1.c0$b r0 = new g1.c0$b
            r0.<init>()
            r1 = 0
            r0.f6483a = r1
            r0.f6484b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L_0x0033
            java.util.HashMap r6 = r7.f6546a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.HashMap r6 = r7.f6546a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f6485c = r6
            java.util.HashMap r6 = r7.f6546a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f6487e = r6
            goto L_0x0037
        L_0x0033:
            r0.f6485c = r4
            r0.f6487e = r3
        L_0x0037:
            if (r8 == 0) goto L_0x005a
            java.util.HashMap r6 = r8.f6546a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.HashMap r3 = r8.f6546a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f6486d = r3
            java.util.HashMap r3 = r8.f6546a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f6488f = r2
            goto L_0x005e
        L_0x005a:
            r0.f6486d = r4
            r0.f6488f = r3
        L_0x005e:
            r2 = 1
            if (r7 == 0) goto L_0x0082
            if (r8 == 0) goto L_0x0082
            int r7 = r0.f6485c
            int r8 = r0.f6486d
            if (r7 != r8) goto L_0x0070
            android.view.ViewGroup r3 = r0.f6487e
            android.view.ViewGroup r4 = r0.f6488f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r7 == r8) goto L_0x0078
            if (r7 != 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            if (r8 != 0) goto L_0x0095
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r7 = r0.f6488f
            if (r7 != 0) goto L_0x007d
            goto L_0x0091
        L_0x007d:
            android.view.ViewGroup r7 = r0.f6487e
            if (r7 != 0) goto L_0x0095
            goto L_0x0088
        L_0x0082:
            if (r7 != 0) goto L_0x008b
            int r7 = r0.f6486d
            if (r7 != 0) goto L_0x008b
        L_0x0088:
            r0.f6484b = r2
            goto L_0x0093
        L_0x008b:
            if (r8 != 0) goto L_0x0095
            int r7 = r0.f6485c
            if (r7 != 0) goto L_0x0095
        L_0x0091:
            r0.f6484b = r1
        L_0x0093:
            r0.f6483a = r2
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c0.M(g1.r, g1.r):g1.c0$b");
    }

    public final void L(r rVar) {
        rVar.f6546a.put("android:visibility:visibility", Integer.valueOf(rVar.f6547b.getVisibility()));
        rVar.f6546a.put("android:visibility:parent", rVar.f6547b.getParent());
        int[] iArr = new int[2];
        rVar.f6547b.getLocationOnScreen(iArr);
        rVar.f6546a.put("android:visibility:screenLocation", iArr);
    }

    public final void e(r rVar) {
        L(rVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: g1.c0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: g1.b0} */
    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (M(o(r1, false), r(r1, false)).f6483a != false) goto L_0x0068;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator l(android.view.ViewGroup r22, g1.r r23, g1.r r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            g1.c0$b r4 = M(r23, r24)
            boolean r5 = r4.f6483a
            if (r5 == 0) goto L_0x02e9
            android.view.ViewGroup r5 = r4.f6487e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f6488f
            if (r5 == 0) goto L_0x02e9
        L_0x0018:
            boolean r5 = r4.f6484b
            r7 = 1
            java.lang.String r8 = "android:fade:transitionAlpha"
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.f6476x
            r1 = r1 & r7
            if (r1 != r7) goto L_0x0068
            if (r3 != 0) goto L_0x002b
            goto L_0x0068
        L_0x002b:
            if (r2 != 0) goto L_0x0046
            android.view.View r1 = r3.f6547b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            g1.r r4 = r0.o(r1, r11)
            g1.r r1 = r0.r(r1, r11)
            g1.c0$b r1 = M(r4, r1)
            boolean r1 = r1.f6483a
            if (r1 == 0) goto L_0x0046
            goto L_0x0068
        L_0x0046:
            android.view.View r1 = r3.f6547b
            r3 = r0
            g1.d r3 = (g1.d) r3
            if (r2 == 0) goto L_0x005c
            java.util.HashMap r2 = r2.f6546a
            java.lang.Object r2 = r2.get(r8)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005c
            float r2 = r2.floatValue()
            goto L_0x005d
        L_0x005c:
            r2 = r9
        L_0x005d:
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r9 = r2
        L_0x0063:
            android.animation.ObjectAnimator r6 = r3.N(r1, r9, r10)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            return r6
        L_0x006a:
            int r4 = r4.f6486d
            int r5 = r0.f6476x
            r12 = 2
            r5 = r5 & r12
            if (r5 == r12) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            if (r2 != 0) goto L_0x0078
        L_0x0075:
            r4 = r0
            goto L_0x02e7
        L_0x0078:
            android.view.View r5 = r2.f6547b
            if (r3 == 0) goto L_0x007f
            android.view.View r3 = r3.f6547b
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            r13 = 2131296724(0x7f0901d4, float:1.8211373E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0092
            r19 = r4
            r20 = r8
            r3 = 0
            goto L_0x0223
        L_0x0092:
            if (r3 == 0) goto L_0x00a3
            android.view.ViewParent r14 = r3.getParent()
            if (r14 != 0) goto L_0x009b
            goto L_0x00a3
        L_0x009b:
            r14 = 4
            if (r4 != r14) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            if (r5 != r3) goto L_0x00a9
        L_0x00a1:
            r14 = r11
            goto L_0x00ab
        L_0x00a3:
            if (r3 == 0) goto L_0x00a9
            r14 = r3
            r15 = r11
            r3 = 0
            goto L_0x00ad
        L_0x00a9:
            r14 = r7
            r3 = 0
        L_0x00ab:
            r15 = r14
            r14 = 0
        L_0x00ad:
            if (r15 == 0) goto L_0x021a
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00bd
            r19 = r4
            r14 = r5
            r20 = r8
            r7 = r11
            goto L_0x0223
        L_0x00bd:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021a
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            g1.r r6 = r0.r(r15, r7)
            g1.r r13 = r0.o(r15, r7)
            g1.c0$b r6 = M(r6, r13)
            boolean r6 = r6.f6483a
            if (r6 != 0) goto L_0x0203
            boolean r6 = g1.q.f6543a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            g1.z r13 = g1.v.f6555a
            r13.W(r5, r6)
            r13.X(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r9, r9, r14, r15)
            r6.mapRect(r13)
            float r14 = r13.left
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.top
            int r15 = java.lang.Math.round(r15)
            float r9 = r13.right
            int r9 = java.lang.Math.round(r9)
            float r12 = r13.bottom
            int r12 = java.lang.Math.round(r12)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r5.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = g1.q.f6543a
            if (r10 == 0) goto L_0x013f
            boolean r10 = r5.isAttachedToWindow()
            r10 = r10 ^ r7
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0142
        L_0x013f:
            r10 = 0
            r16 = 0
        L_0x0142:
            boolean r17 = g1.q.f6544b
            if (r17 == 0) goto L_0x016b
            if (r10 == 0) goto L_0x016b
            if (r16 != 0) goto L_0x0153
            r18 = r3
            r19 = r4
            r20 = r8
            r0 = 0
            goto L_0x01e8
        L_0x0153:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            r18 = r3
            android.view.ViewGroupOverlay r3 = r22.getOverlay()
            r3.add(r5)
            r3 = r16
            goto L_0x016f
        L_0x016b:
            r18 = r3
            r3 = 0
            r7 = 0
        L_0x016f:
            float r16 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r16)
            float r16 = r13.height()
            r20 = r8
            int r8 = java.lang.Math.round(r16)
            if (r4 <= 0) goto L_0x01d9
            if (r8 <= 0) goto L_0x01d9
            r16 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r4 * r8
            float r0 = (float) r0
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r8 = (float) r8
            float r8 = r8 * r0
            int r8 = java.lang.Math.round(r8)
            float r2 = r13.left
            float r2 = -r2
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r2, r13)
            r6.postScale(r0, r0)
            boolean r0 = g1.q.f6545c
            if (r0 == 0) goto L_0x01c7
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r4, r8)
            r2.concat(r6)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01da
        L_0x01c7:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r8, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01da
        L_0x01d9:
            r0 = 0
        L_0x01da:
            if (r17 == 0) goto L_0x01e8
            if (r10 == 0) goto L_0x01e8
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01e8:
            if (r0 == 0) goto L_0x01ed
            r11.setImageBitmap(r0)
        L_0x01ed:
            int r0 = r9 - r14
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r12 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r14, r15, r9, r12)
            r14 = r11
            goto L_0x0220
        L_0x0203:
            r18 = r3
            r19 = r4
            r20 = r8
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x0220
            r2 = -1
            if (r0 == r2) goto L_0x0220
            r1.findViewById(r0)
            goto L_0x0220
        L_0x021a:
            r18 = r3
            r19 = r4
            r20 = r8
        L_0x0220:
            r3 = r18
            r7 = 0
        L_0x0223:
            if (r14 == 0) goto L_0x02a1
            r0 = r23
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r7 != 0) goto L_0x0263
            java.util.HashMap r3 = r0.f6546a
            java.lang.String r4 = "android:visibility:screenLocation"
            java.lang.Object r3 = r3.get(r4)
            int[] r3 = (int[]) r3
            r4 = 0
            r6 = r3[r4]
            r8 = 1
            r3 = r3[r8]
            r9 = 2
            int[] r9 = new int[r9]
            r1.getLocationOnScreen(r9)
            r4 = r9[r4]
            int r6 = r6 - r4
            int r4 = r14.getLeft()
            int r6 = r6 - r4
            r14.offsetLeftAndRight(r6)
            r4 = r9[r8]
            int r3 = r3 - r4
            int r4 = r14.getTop()
            int r3 = r3 - r4
            r14.offsetTopAndBottom(r3)
            g1.t r3 = new g1.t
            r3.<init>((android.view.ViewGroup) r1)
            java.lang.Object r3 = r3.f6553a
            android.view.ViewGroupOverlay r3 = (android.view.ViewGroupOverlay) r3
            r3.add(r14)
        L_0x0263:
            r4 = r21
            r3 = r4
            g1.d r3 = (g1.d) r3
            g1.z r6 = g1.v.f6555a
            r6.getClass()
            java.util.HashMap r0 = r0.f6546a
            r6 = r20
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x027e
            float r10 = r0.floatValue()
            goto L_0x027f
        L_0x027e:
            r10 = r2
        L_0x027f:
            r0 = 0
            android.animation.ObjectAnimator r6 = r3.N(r14, r10, r0)
            if (r7 != 0) goto L_0x02e8
            if (r6 != 0) goto L_0x0295
            g1.t r0 = new g1.t
            r0.<init>((android.view.ViewGroup) r1)
            java.lang.Object r0 = r0.f6553a
            android.view.ViewGroupOverlay r0 = (android.view.ViewGroupOverlay) r0
            r0.remove(r14)
            goto L_0x02e8
        L_0x0295:
            r0 = 2131296724(0x7f0901d4, float:1.8211373E38)
            r5.setTag(r0, r14)
            g1.b0 r0 = new g1.b0
            r0.<init>(r4, r1, r14, r5)
            goto L_0x02df
        L_0x02a1:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = r21
            r0 = r23
            r6 = r20
            if (r3 == 0) goto L_0x02e7
            int r1 = r3.getVisibility()
            g1.z r5 = g1.v.f6555a
            r7 = 0
            r5.x(r3, r7)
            r7 = r4
            g1.d r7 = (g1.d) r7
            r5.getClass()
            java.util.HashMap r0 = r0.f6546a
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L_0x02ca
            float r10 = r0.floatValue()
            goto L_0x02cb
        L_0x02ca:
            r10 = r2
        L_0x02cb:
            r0 = 0
            android.animation.ObjectAnimator r6 = r7.N(r3, r10, r0)
            if (r6 == 0) goto L_0x02e3
            g1.c0$a r0 = new g1.c0$a
            r1 = r19
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
        L_0x02df:
            r4.b(r0)
            goto L_0x02e8
        L_0x02e3:
            r5.x(r3, r1)
            goto L_0x02e8
        L_0x02e7:
            r6 = 0
        L_0x02e8:
            return r6
        L_0x02e9:
            r4 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.c0.l(android.view.ViewGroup, g1.r, g1.r):android.animation.Animator");
    }

    public final String[] q() {
        return f6475y;
    }

    public final boolean v(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f6546a.containsKey("android:visibility:visibility") != rVar.f6546a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b M = M(rVar, rVar2);
        if (M.f6483a) {
            return M.f6485c == 0 || M.f6486d == 0;
        }
        return false;
    }
}
