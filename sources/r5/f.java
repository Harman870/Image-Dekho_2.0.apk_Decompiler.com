package r5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import r5.j;
import r5.l;

public class f extends Drawable implements m {
    public static final String w = f.class.getSimpleName();

    /* renamed from: x  reason: collision with root package name */
    public static final Paint f11659x;

    /* renamed from: a  reason: collision with root package name */
    public b f11660a;

    /* renamed from: b  reason: collision with root package name */
    public final l.f[] f11661b;

    /* renamed from: c  reason: collision with root package name */
    public final l.f[] f11662c;

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f11663d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11664e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f11665f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f11666g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f11667h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f11668i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f11669j;
    public final Region k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f11670l;

    /* renamed from: m  reason: collision with root package name */
    public i f11671m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f11672n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f11673o;

    /* renamed from: p  reason: collision with root package name */
    public final q5.a f11674p;

    /* renamed from: q  reason: collision with root package name */
    public final a f11675q;

    /* renamed from: r  reason: collision with root package name */
    public final j f11676r;

    /* renamed from: s  reason: collision with root package name */
    public PorterDuffColorFilter f11677s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f11678t;
    public final RectF u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f11679v;

    public class a {
        public a() {
        }
    }

    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f11681a;

        /* renamed from: b  reason: collision with root package name */
        public g5.a f11682b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f11683c = null;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f11684d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f11685e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f11686f = null;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f11687g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h  reason: collision with root package name */
        public Rect f11688h = null;

        /* renamed from: i  reason: collision with root package name */
        public float f11689i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f11690j = 1.0f;
        public float k;

        /* renamed from: l  reason: collision with root package name */
        public int f11691l = 255;

        /* renamed from: m  reason: collision with root package name */
        public float f11692m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f11693n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f11694o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public int f11695p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f11696q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f11697r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f11698s = 0;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11699t = false;
        public Paint.Style u = Paint.Style.FILL_AND_STROKE;

        public b(b bVar) {
            this.f11681a = bVar.f11681a;
            this.f11682b = bVar.f11682b;
            this.k = bVar.k;
            this.f11683c = bVar.f11683c;
            this.f11684d = bVar.f11684d;
            this.f11687g = bVar.f11687g;
            this.f11686f = bVar.f11686f;
            this.f11691l = bVar.f11691l;
            this.f11689i = bVar.f11689i;
            this.f11697r = bVar.f11697r;
            this.f11695p = bVar.f11695p;
            this.f11699t = bVar.f11699t;
            this.f11690j = bVar.f11690j;
            this.f11692m = bVar.f11692m;
            this.f11693n = bVar.f11693n;
            this.f11694o = bVar.f11694o;
            this.f11696q = bVar.f11696q;
            this.f11698s = bVar.f11698s;
            this.f11685e = bVar.f11685e;
            this.u = bVar.u;
            if (bVar.f11688h != null) {
                this.f11688h = new Rect(bVar.f11688h);
            }
        }

        public b(i iVar) {
            this.f11681a = iVar;
            this.f11682b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f11664e = true;
            return fVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f11659x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(i.b(context, attributeSet, i10, i11).a());
    }

    public f(b bVar) {
        j jVar;
        this.f11661b = new l.f[4];
        this.f11662c = new l.f[4];
        this.f11663d = new BitSet(8);
        this.f11665f = new Matrix();
        this.f11666g = new Path();
        this.f11667h = new Path();
        this.f11668i = new RectF();
        this.f11669j = new RectF();
        this.k = new Region();
        this.f11670l = new Region();
        Paint paint = new Paint(1);
        this.f11672n = paint;
        Paint paint2 = new Paint(1);
        this.f11673o = paint2;
        this.f11674p = new q5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f11736a;
        } else {
            jVar = new j();
        }
        this.f11676r = jVar;
        this.u = new RectF();
        this.f11679v = true;
        this.f11660a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f11675q = new a();
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.f11676r;
        b bVar = this.f11660a;
        i iVar = bVar.f11681a;
        float f10 = bVar.f11690j;
        jVar.a(iVar, f10, rectF, this.f11675q, path);
        if (this.f11660a.f11689i != 1.0f) {
            this.f11665f.reset();
            Matrix matrix = this.f11665f;
            float f11 = this.f11660a.f11689i;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f11665f);
        }
        path.computeBounds(this.u, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r2 = r4.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            if (r3 != 0) goto L_0x0005
            goto L_0x001a
        L_0x0005:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L_0x0014
            int r2 = r1.d(r2)
        L_0x0014:
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L_0x0030
        L_0x001a:
            if (r5 == 0) goto L_0x002e
            int r2 = r4.getColor()
            int r3 = r1.d(r2)
            if (r3 == r2) goto L_0x002e
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r4 = r2
        L_0x0030:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i10) {
        b bVar = this.f11660a;
        float f10 = bVar.f11693n + bVar.f11694o + bVar.f11692m;
        g5.a aVar = bVar.f11682b;
        if (aVar != null) {
            return aVar.a(i10, f10);
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        if (r0 != false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            android.graphics.Paint r0 = r6.f11672n
            android.graphics.PorterDuffColorFilter r1 = r6.f11677s
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f11672n
            int r8 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f11672n
            r5.f$b r1 = r6.f11660a
            int r1 = r1.f11691l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r8
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            android.graphics.Paint r0 = r6.f11673o
            android.graphics.PorterDuffColorFilter r1 = r6.f11678t
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r6.f11673o
            r5.f$b r1 = r6.f11660a
            float r1 = r1.k
            r0.setStrokeWidth(r1)
            android.graphics.Paint r0 = r6.f11673o
            int r9 = r0.getAlpha()
            android.graphics.Paint r0 = r6.f11673o
            r5.f$b r1 = r6.f11660a
            int r1 = r1.f11691l
            int r2 = r1 >>> 7
            int r1 = r1 + r2
            int r1 = r1 * r9
            int r1 = r1 >>> 8
            r0.setAlpha(r1)
            boolean r0 = r6.f11664e
            r10 = 0
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0112
            r5.f$b r0 = r6.f11660a
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0058
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x0064
        L_0x0058:
            android.graphics.Paint r0 = r6.f11673o
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            r0 = r11
            goto L_0x0065
        L_0x0064:
            r0 = r12
        L_0x0065:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0071
            android.graphics.Paint r0 = r6.f11673o
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x0072
        L_0x0071:
            r0 = r10
        L_0x0072:
            float r0 = -r0
            r5.f$b r2 = r6.f11660a
            r5.i r2 = r2.f11681a
            r2.getClass()
            r5.i$a r3 = new r5.i$a
            r3.<init>(r2)
            r5.c r4 = r2.f11707e
            boolean r5 = r4 instanceof r5.g
            if (r5 == 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r5.b r5 = new r5.b
            r5.<init>(r0, r4)
            r4 = r5
        L_0x008c:
            r3.f11718e = r4
            r5.c r4 = r2.f11708f
            boolean r5 = r4 instanceof r5.g
            if (r5 == 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            r5.b r5 = new r5.b
            r5.<init>(r0, r4)
            r4 = r5
        L_0x009b:
            r3.f11719f = r4
            r5.c r4 = r2.f11710h
            boolean r5 = r4 instanceof r5.g
            if (r5 == 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            r5.b r5 = new r5.b
            r5.<init>(r0, r4)
            r4 = r5
        L_0x00aa:
            r3.f11721h = r4
            r5.c r2 = r2.f11709g
            boolean r4 = r2 instanceof r5.g
            if (r4 == 0) goto L_0x00b3
            goto L_0x00b9
        L_0x00b3:
            r5.b r4 = new r5.b
            r4.<init>(r0, r2)
            r2 = r4
        L_0x00b9:
            r3.f11720g = r2
            r5.i r14 = new r5.i
            r14.<init>(r3)
            r6.f11671m = r14
            r5.j r13 = r6.f11676r
            r5.f$b r0 = r6.f11660a
            float r15 = r0.f11690j
            android.graphics.RectF r0 = r6.f11669j
            android.graphics.RectF r2 = r19.h()
            r0.set(r2)
            r5.f$b r0 = r6.f11660a
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r2) goto L_0x00dd
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            if (r0 != r2) goto L_0x00e9
        L_0x00dd:
            android.graphics.Paint r0 = r6.f11673o
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e9
            r0 = r11
            goto L_0x00ea
        L_0x00e9:
            r0 = r12
        L_0x00ea:
            if (r0 == 0) goto L_0x00f4
            android.graphics.Paint r0 = r6.f11673o
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r1
            goto L_0x00f5
        L_0x00f4:
            r0 = r10
        L_0x00f5:
            android.graphics.RectF r1 = r6.f11669j
            r1.inset(r0, r0)
            android.graphics.RectF r0 = r6.f11669j
            android.graphics.Path r1 = r6.f11667h
            r17 = 0
            r16 = r0
            r18 = r1
            r13.a(r14, r15, r16, r17, r18)
            android.graphics.RectF r0 = r19.h()
            android.graphics.Path r1 = r6.f11666g
            r6.b(r0, r1)
            r6.f11664e = r12
        L_0x0112:
            r5.f$b r0 = r6.f11660a
            int r1 = r0.f11695p
            r2 = 2
            if (r1 == r11) goto L_0x0140
            int r3 = r0.f11696q
            if (r3 <= 0) goto L_0x0140
            if (r1 == r2) goto L_0x013e
            int r1 = android.os.Build.VERSION.SDK_INT
            r5.i r0 = r0.f11681a
            android.graphics.RectF r3 = r19.h()
            boolean r0 = r0.d(r3)
            if (r0 != 0) goto L_0x013b
            android.graphics.Path r0 = r6.f11666g
            boolean r0 = r0.isConvex()
            if (r0 != 0) goto L_0x013b
            r0 = 29
            if (r1 >= r0) goto L_0x013b
            r0 = r11
            goto L_0x013c
        L_0x013b:
            r0 = r12
        L_0x013c:
            if (r0 == 0) goto L_0x0140
        L_0x013e:
            r0 = r11
            goto L_0x0141
        L_0x0140:
            r0 = r12
        L_0x0141:
            if (r0 != 0) goto L_0x0145
            goto L_0x01f2
        L_0x0145:
            r20.save()
            r5.f$b r0 = r6.f11660a
            int r1 = r0.f11697r
            double r3 = (double) r1
            int r0 = r0.f11698s
            double r0 = (double) r0
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r3
            int r0 = (int) r0
            r5.f$b r1 = r6.f11660a
            int r3 = r1.f11697r
            double r3 = (double) r3
            int r1 = r1.f11698s
            double r13 = (double) r1
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.cos(r13)
            double r13 = r13 * r3
            int r1 = (int) r13
            float r0 = (float) r0
            float r1 = (float) r1
            r7.translate(r0, r1)
            boolean r0 = r6.f11679v
            if (r0 != 0) goto L_0x0179
            r19.e(r20)
            goto L_0x01ef
        L_0x0179:
            android.graphics.RectF r0 = r6.u
            float r0 = r0.width()
            android.graphics.Rect r1 = r19.getBounds()
            int r1 = r1.width()
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            android.graphics.RectF r1 = r6.u
            float r1 = r1.height()
            android.graphics.Rect r3 = r19.getBounds()
            int r3 = r3.height()
            float r3 = (float) r3
            float r1 = r1 - r3
            int r1 = (int) r1
            if (r0 < 0) goto L_0x023d
            if (r1 < 0) goto L_0x023d
            android.graphics.RectF r3 = r6.u
            float r3 = r3.width()
            int r3 = (int) r3
            r5.f$b r4 = r6.f11660a
            int r4 = r4.f11696q
            int r4 = r4 * r2
            int r4 = r4 + r3
            int r4 = r4 + r0
            android.graphics.RectF r3 = r6.u
            float r3 = r3.height()
            int r3 = (int) r3
            r5.f$b r5 = r6.f11660a
            int r5 = r5.f11696q
            int r5 = r5 * r2
            int r5 = r5 + r3
            int r5 = r5 + r1
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r4, r5, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.graphics.Rect r4 = r19.getBounds()
            int r4 = r4.left
            r5.f$b r5 = r6.f11660a
            int r5 = r5.f11696q
            int r4 = r4 - r5
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r4 = r19.getBounds()
            int r4 = r4.top
            r5.f$b r5 = r6.f11660a
            int r5 = r5.f11696q
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r4 = -r0
            float r5 = -r1
            r3.translate(r4, r5)
            r6.e(r3)
            r3 = 0
            r7.drawBitmap(r2, r0, r1, r3)
            r2.recycle()
        L_0x01ef:
            r20.restore()
        L_0x01f2:
            r5.f$b r0 = r6.f11660a
            android.graphics.Paint$Style r1 = r0.u
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r1 == r2) goto L_0x0201
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            if (r1 != r2) goto L_0x01ff
            goto L_0x0201
        L_0x01ff:
            r1 = r12
            goto L_0x0202
        L_0x0201:
            r1 = r11
        L_0x0202:
            if (r1 == 0) goto L_0x0215
            android.graphics.Paint r2 = r6.f11672n
            android.graphics.Path r3 = r6.f11666g
            r5.i r4 = r0.f11681a
            android.graphics.RectF r5 = r19.h()
            r0 = r19
            r1 = r20
            r0.f(r1, r2, r3, r4, r5)
        L_0x0215:
            r5.f$b r0 = r6.f11660a
            android.graphics.Paint$Style r0 = r0.u
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r0 == r1) goto L_0x0221
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            if (r0 != r1) goto L_0x022c
        L_0x0221:
            android.graphics.Paint r0 = r6.f11673o
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x022c
            goto L_0x022d
        L_0x022c:
            r11 = r12
        L_0x022d:
            if (r11 == 0) goto L_0x0232
            r19.g(r20)
        L_0x0232:
            android.graphics.Paint r0 = r6.f11672n
            r0.setAlpha(r8)
            android.graphics.Paint r0 = r6.f11673o
            r0.setAlpha(r9)
            return
        L_0x023d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f11663d.cardinality() > 0) {
            Log.w(w, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f11660a.f11697r != 0) {
            canvas.drawPath(this.f11666g, this.f11674p.f11337a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f11661b[i10];
            q5.a aVar = this.f11674p;
            int i11 = this.f11660a.f11696q;
            Matrix matrix = l.f.f11761b;
            fVar.a(matrix, aVar, i11, canvas);
            this.f11662c[i10].a(matrix, this.f11674p, this.f11660a.f11696q, canvas);
        }
        if (this.f11679v) {
            b bVar = this.f11660a;
            int sin = (int) (Math.sin(Math.toRadians((double) bVar.f11698s)) * ((double) bVar.f11697r));
            b bVar2 = this.f11660a;
            int cos = (int) (Math.cos(Math.toRadians((double) bVar2.f11698s)) * ((double) bVar2.f11697r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(this.f11666g, f11659x);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.d(rectF)) {
            float a10 = iVar.f11708f.a(rectF) * this.f11660a.f11690j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        boolean z9;
        Paint paint = this.f11673o;
        Path path = this.f11667h;
        i iVar = this.f11671m;
        this.f11669j.set(h());
        Paint.Style style = this.f11660a.u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f11673o.getStrokeWidth() > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = this.f11673o.getStrokeWidth() / 2.0f;
        }
        this.f11669j.inset(f10, f10);
        f(canvas, paint, path, iVar, this.f11669j);
    }

    public int getAlpha() {
        return this.f11660a.f11691l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f11660a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f11660a;
        if (bVar.f11695p != 2) {
            if (bVar.f11681a.d(h())) {
                outline.setRoundRect(getBounds(), this.f11660a.f11681a.f11707e.a(h()) * this.f11660a.f11690j);
                return;
            }
            b(h(), this.f11666g);
            Path path = this.f11666g;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                outline.setPath(path);
            } else if (i10 >= 29) {
                try {
                    outline.setConvexPath(path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                outline.setConvexPath(path);
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f11660a.f11688h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        this.k.set(getBounds());
        b(h(), this.f11666g);
        this.f11670l.setPath(this.f11666g, this.k);
        this.k.op(this.f11670l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public final RectF h() {
        this.f11668i.set(getBounds());
        return this.f11668i;
    }

    public final void i(Context context) {
        this.f11660a.f11682b = new g5.a(context);
        n();
    }

    public final void invalidateSelf() {
        this.f11664e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f11660a.f11684d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f11660a.f11683c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f11660a.f11686f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f11660a.f11685e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            r5.f$b r0 = r1.f11660a
            android.content.res.ColorStateList r0 = r0.f11686f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            r5.f$b r0 = r1.f11660a
            android.content.res.ColorStateList r0 = r0.f11685e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            r5.f$b r0 = r1.f11660a
            android.content.res.ColorStateList r0 = r0.f11684d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            r5.f$b r0 = r1.f11660a
            android.content.res.ColorStateList r0 = r0.f11683c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.isStateful():boolean");
    }

    public final void j(float f10) {
        b bVar = this.f11660a;
        if (bVar.f11693n != f10) {
            bVar.f11693n = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f11660a;
        if (bVar.f11683c != colorStateList) {
            bVar.f11683c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z9;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f11660a.f11683c == null || (color2 = this.f11672n.getColor()) == (colorForState2 = this.f11660a.f11683c.getColorForState(iArr, color2))) {
            z9 = false;
        } else {
            this.f11672n.setColor(colorForState2);
            z9 = true;
        }
        if (this.f11660a.f11684d == null || (color = this.f11673o.getColor()) == (colorForState = this.f11660a.f11684d.getColorForState(iArr, color))) {
            return z9;
        }
        this.f11673o.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f11677s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f11678t;
        b bVar = this.f11660a;
        this.f11677s = c(bVar.f11686f, bVar.f11687g, this.f11672n, true);
        b bVar2 = this.f11660a;
        this.f11678t = c(bVar2.f11685e, bVar2.f11687g, this.f11673o, false);
        b bVar3 = this.f11660a;
        if (bVar3.f11699t) {
            this.f11674p.a(bVar3.f11686f.getColorForState(getState(), 0));
        }
        if (!g0.b.a(porterDuffColorFilter, this.f11677s) || !g0.b.a(porterDuffColorFilter2, this.f11678t)) {
            return true;
        }
        return false;
    }

    public Drawable mutate() {
        this.f11660a = new b(this.f11660a);
        return this;
    }

    public final void n() {
        b bVar = this.f11660a;
        float f10 = bVar.f11693n + bVar.f11694o;
        bVar.f11696q = (int) Math.ceil((double) (0.75f * f10));
        this.f11660a.f11697r = (int) Math.ceil((double) (f10 * 0.25f));
        m();
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        this.f11664e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z9 = l(iArr) || m();
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    public void setAlpha(int i10) {
        b bVar = this.f11660a;
        if (bVar.f11691l != i10) {
            bVar.f11691l = i10;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11660a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(i iVar) {
        this.f11660a.f11681a = iVar;
        invalidateSelf();
    }

    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11660a.f11686f = colorStateList;
        m();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f11660a;
        if (bVar.f11687g != mode) {
            bVar.f11687g = mode;
            m();
            super.invalidateSelf();
        }
    }
}
