package h1;

import a0.d;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import b0.a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class g extends f {

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f6816j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public C0093g f6817b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f6818c;

    /* renamed from: d  reason: collision with root package name */
    public ColorFilter f6819d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6820e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6821f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f6822g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f6823h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f6824i;

    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public z.c f6825e;

        /* renamed from: f  reason: collision with root package name */
        public float f6826f = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        public z.c f6827g;

        /* renamed from: h  reason: collision with root package name */
        public float f6828h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f6829i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f6830j = 0.0f;
        public float k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f6831l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f6832m = Paint.Cap.BUTT;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f6833n = Paint.Join.MITER;

        /* renamed from: o  reason: collision with root package name */
        public float f6834o = 4.0f;

        public b() {
        }

        public b(b bVar) {
            super(bVar);
            this.f6825e = bVar.f6825e;
            this.f6826f = bVar.f6826f;
            this.f6828h = bVar.f6828h;
            this.f6827g = bVar.f6827g;
            this.f6848c = bVar.f6848c;
            this.f6829i = bVar.f6829i;
            this.f6830j = bVar.f6830j;
            this.k = bVar.k;
            this.f6831l = bVar.f6831l;
            this.f6832m = bVar.f6832m;
            this.f6833n = bVar.f6833n;
            this.f6834o = bVar.f6834o;
        }

        public final boolean a() {
            return this.f6827g.b() || this.f6825e.b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                z.c r0 = r6.f6827g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x001c
                android.content.res.ColorStateList r1 = r0.f13083b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f13084c
                if (r1 == r4) goto L_0x001c
                r0.f13084c = r1
                r0 = r2
                goto L_0x001d
            L_0x001c:
                r0 = r3
            L_0x001d:
                z.c r1 = r6.f6825e
                boolean r4 = r1.b()
                if (r4 == 0) goto L_0x0036
                android.content.res.ColorStateList r4 = r1.f13083b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f13084c
                if (r7 == r4) goto L_0x0036
                r1.f13084c = r7
                goto L_0x0037
            L_0x0036:
                r2 = r3
            L_0x0037:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.g.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f6829i;
        }

        public int getFillColor() {
            return this.f6827g.f13084c;
        }

        public float getStrokeAlpha() {
            return this.f6828h;
        }

        public int getStrokeColor() {
            return this.f6825e.f13084c;
        }

        public float getStrokeWidth() {
            return this.f6826f;
        }

        public float getTrimPathEnd() {
            return this.k;
        }

        public float getTrimPathOffset() {
            return this.f6831l;
        }

        public float getTrimPathStart() {
            return this.f6830j;
        }

        public void setFillAlpha(float f10) {
            this.f6829i = f10;
        }

        public void setFillColor(int i10) {
            this.f6827g.f13084c = i10;
        }

        public void setStrokeAlpha(float f10) {
            this.f6828h = f10;
        }

        public void setStrokeColor(int i10) {
            this.f6825e.f13084c = i10;
        }

        public void setStrokeWidth(float f10) {
            this.f6826f = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.k = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f6831l = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f6830j = f10;
        }
    }

    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f6850p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f6851a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f6852b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f6853c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f6854d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f6855e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f6856f;

        /* renamed from: g  reason: collision with root package name */
        public final c f6857g;

        /* renamed from: h  reason: collision with root package name */
        public float f6858h;

        /* renamed from: i  reason: collision with root package name */
        public float f6859i;

        /* renamed from: j  reason: collision with root package name */
        public float f6860j;
        public float k;

        /* renamed from: l  reason: collision with root package name */
        public int f6861l;

        /* renamed from: m  reason: collision with root package name */
        public String f6862m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f6863n;

        /* renamed from: o  reason: collision with root package name */
        public final m.b<String, Object> f6864o;

        public f() {
            this.f6853c = new Matrix();
            this.f6858h = 0.0f;
            this.f6859i = 0.0f;
            this.f6860j = 0.0f;
            this.k = 0.0f;
            this.f6861l = 255;
            this.f6862m = null;
            this.f6863n = null;
            this.f6864o = new m.b<>();
            this.f6857g = new c();
            this.f6851a = new Path();
            this.f6852b = new Path();
        }

        public f(f fVar) {
            this.f6853c = new Matrix();
            this.f6858h = 0.0f;
            this.f6859i = 0.0f;
            this.f6860j = 0.0f;
            this.k = 0.0f;
            this.f6861l = 255;
            this.f6862m = null;
            this.f6863n = null;
            m.b<String, Object> bVar = new m.b<>();
            this.f6864o = bVar;
            this.f6857g = new c(fVar.f6857g, bVar);
            this.f6851a = new Path(fVar.f6851a);
            this.f6852b = new Path(fVar.f6852b);
            this.f6858h = fVar.f6858h;
            this.f6859i = fVar.f6859i;
            this.f6860j = fVar.f6860j;
            this.k = fVar.k;
            this.f6861l = fVar.f6861l;
            this.f6862m = fVar.f6862m;
            String str = fVar.f6862m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f6863n = fVar.f6863n;
        }

        /* JADX WARNING: type inference failed for: r9v0 */
        /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r9v2 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            float f10;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            Path.FillType fillType;
            Path.FillType fillType2;
            c cVar2 = cVar;
            Canvas canvas2 = canvas;
            cVar2.f6835a.set(matrix);
            cVar2.f6835a.preConcat(cVar2.f6844j);
            canvas.save();
            ? r92 = 0;
            f fVar = this;
            int i12 = 0;
            while (i12 < cVar2.f6836b.size()) {
                d dVar = cVar2.f6836b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar2.f6835a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f11 = ((float) i10) / fVar.f6860j;
                    float f12 = ((float) i11) / fVar.k;
                    float min = Math.min(f11, f12);
                    Matrix matrix2 = cVar2.f6835a;
                    fVar.f6853c.set(matrix2);
                    fVar.f6853c.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f13 = min;
                    float f14 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r92], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    if (max > 0.0f) {
                        f10 = Math.abs(f14) / max;
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        Path path = this.f6851a;
                        eVar.getClass();
                        path.reset();
                        d.a[] aVarArr = eVar.f6846a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = this.f6851a;
                        this.f6852b.reset();
                        if (eVar instanceof a) {
                            Path path3 = this.f6852b;
                            if (eVar.f6848c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path3.setFillType(fillType2);
                            this.f6852b.addPath(path2, this.f6853c);
                            canvas2.clipPath(this.f6852b);
                        } else {
                            b bVar = (b) eVar;
                            float f15 = bVar.f6830j;
                            if (!(f15 == 0.0f && bVar.k == 1.0f)) {
                                float f16 = bVar.f6831l;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (bVar.k + f16) % 1.0f;
                                if (this.f6856f == null) {
                                    this.f6856f = new PathMeasure();
                                }
                                this.f6856f.setPath(this.f6851a, r92);
                                float length = this.f6856f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path2.reset();
                                if (f19 > f20) {
                                    this.f6856f.getSegment(f19, length, path2, true);
                                    this.f6856f.getSegment(0.0f, f20, path2, true);
                                } else {
                                    this.f6856f.getSegment(f19, f20, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f6852b.addPath(path2, this.f6853c);
                            z.c cVar3 = bVar.f6827g;
                            if (cVar3.f13082a != null) {
                                z9 = true;
                            } else {
                                z9 = r92;
                            }
                            if (z9 || cVar3.f13084c != 0) {
                                z10 = true;
                            } else {
                                z10 = r92;
                            }
                            if (z10) {
                                if (this.f6855e == null) {
                                    Paint paint = new Paint(1);
                                    this.f6855e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f6855e;
                                Shader shader = cVar3.f13082a;
                                if (shader != null) {
                                    z14 = true;
                                } else {
                                    z14 = r92;
                                }
                                if (z14) {
                                    shader.setLocalMatrix(this.f6853c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f6829i * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i13 = cVar3.f13084c;
                                    float f21 = bVar.f6829i;
                                    PorterDuff.Mode mode = g.f6816j;
                                    paint2.setColor((i13 & 16777215) | (((int) (((float) Color.alpha(i13)) * f21)) << 24));
                                }
                                paint2.setColorFilter((ColorFilter) null);
                                Path path4 = this.f6852b;
                                if (bVar.f6848c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path4.setFillType(fillType);
                                canvas2.drawPath(this.f6852b, paint2);
                            }
                            z.c cVar4 = bVar.f6825e;
                            if (cVar4.f13082a != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11 || cVar4.f13084c != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (this.f6854d == null) {
                                    z13 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f6854d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z13 = true;
                                }
                                Paint paint4 = this.f6854d;
                                Paint.Join join = bVar.f6833n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f6832m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f6834o);
                                Shader shader2 = cVar4.f13082a;
                                if (shader2 == null) {
                                    z13 = false;
                                }
                                if (z13) {
                                    shader2.setLocalMatrix(this.f6853c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f6828h * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i14 = cVar4.f13084c;
                                    float f22 = bVar.f6828h;
                                    PorterDuff.Mode mode2 = g.f6816j;
                                    paint4.setColor((i14 & 16777215) | (((int) (((float) Color.alpha(i14)) * f22)) << 24));
                                }
                                paint4.setColorFilter((ColorFilter) null);
                                paint4.setStrokeWidth(bVar.f6826f * f10 * f13);
                                canvas2.drawPath(this.f6852b, paint4);
                            }
                        }
                    }
                    fVar = this;
                    i12++;
                    r92 = 0;
                }
                int i15 = i10;
                int i16 = i11;
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6861l;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f6861l = i10;
        }
    }

    /* renamed from: h1.g$g  reason: collision with other inner class name */
    public static class C0093g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f6865a;

        /* renamed from: b  reason: collision with root package name */
        public f f6866b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f6867c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f6868d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6869e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f6870f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f6871g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f6872h;

        /* renamed from: i  reason: collision with root package name */
        public int f6873i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6874j;
        public boolean k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f6875l;

        public C0093g() {
            this.f6867c = null;
            this.f6868d = g.f6816j;
            this.f6866b = new f();
        }

        public C0093g(C0093g gVar) {
            this.f6867c = null;
            this.f6868d = g.f6816j;
            if (gVar != null) {
                this.f6865a = gVar.f6865a;
                f fVar = new f(gVar.f6866b);
                this.f6866b = fVar;
                if (gVar.f6866b.f6855e != null) {
                    fVar.f6855e = new Paint(gVar.f6866b.f6855e);
                }
                if (gVar.f6866b.f6854d != null) {
                    this.f6866b.f6854d = new Paint(gVar.f6866b.f6854d);
                }
                this.f6867c = gVar.f6867c;
                this.f6868d = gVar.f6868d;
                this.f6869e = gVar.f6869e;
            }
        }

        public int getChangingConfigurations() {
            return this.f6865a;
        }

        public final Drawable newDrawable() {
            return new g(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f6876a;

        public h(Drawable.ConstantState constantState) {
            this.f6876a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f6876a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f6876a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.f6815a = (VectorDrawable) this.f6876a.newDrawable();
            return gVar;
        }

        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f6815a = (VectorDrawable) this.f6876a.newDrawable(resources);
            return gVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f6815a = (VectorDrawable) this.f6876a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f6821f = true;
        this.f6822g = new float[9];
        this.f6823h = new Matrix();
        this.f6824i = new Rect();
        this.f6817b = new C0093g();
    }

    public g(C0093g gVar) {
        this.f6821f = true;
        this.f6822g = new float[9];
        this.f6823h = new Matrix();
        this.f6824i = new Rect();
        this.f6817b = gVar;
        this.f6818c = a(gVar.f6867c, gVar.f6868d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f6815a;
        if (drawable == null) {
            return false;
        }
        a.b.b(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if (r8 == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.graphics.drawable.Drawable r2 = r0.f6815a
            if (r2 == 0) goto L_0x000c
            r2.draw(r1)
            return
        L_0x000c:
            android.graphics.Rect r2 = r0.f6824i
            r0.copyBounds(r2)
            android.graphics.Rect r2 = r0.f6824i
            int r2 = r2.width()
            if (r2 <= 0) goto L_0x0193
            android.graphics.Rect r2 = r0.f6824i
            int r2 = r2.height()
            if (r2 > 0) goto L_0x0023
            goto L_0x0193
        L_0x0023:
            android.graphics.ColorFilter r2 = r0.f6819d
            if (r2 != 0) goto L_0x0029
            android.graphics.PorterDuffColorFilter r2 = r0.f6818c
        L_0x0029:
            android.graphics.Matrix r3 = r0.f6823h
            r1.getMatrix(r3)
            android.graphics.Matrix r3 = r0.f6823h
            float[] r4 = r0.f6822g
            r3.getValues(r4)
            float[] r3 = r0.f6822g
            r4 = 0
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r5 = r0.f6822g
            r6 = 4
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            float[] r6 = r0.f6822g
            r7 = 1
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            float[] r8 = r0.f6822g
            r9 = 3
            r8 = r8[r9]
            float r8 = java.lang.Math.abs(r8)
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r6 != 0) goto L_0x0064
            int r6 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0066
        L_0x0064:
            r3 = r10
            r5 = r3
        L_0x0066:
            android.graphics.Rect r6 = r0.f6824i
            int r6 = r6.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            int r3 = (int) r6
            android.graphics.Rect r6 = r0.f6824i
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r6 = 2048(0x800, float:2.87E-42)
            int r15 = java.lang.Math.min(r6, r3)
            int r3 = java.lang.Math.min(r6, r5)
            if (r15 <= 0) goto L_0x0193
            if (r3 > 0) goto L_0x0088
            goto L_0x0193
        L_0x0088:
            int r5 = r18.save()
            android.graphics.Rect r6 = r0.f6824i
            int r8 = r6.left
            float r8 = (float) r8
            int r6 = r6.top
            float r6 = (float) r6
            r1.translate(r8, r6)
            boolean r6 = r17.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = b0.a.c.a(r17)
            if (r6 != r7) goto L_0x00a5
            r6 = r7
            goto L_0x00a6
        L_0x00a5:
            r6 = r4
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r0.f6824i
            int r6 = r6.width()
            float r6 = (float) r6
            r1.translate(r6, r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.scale(r6, r10)
        L_0x00b7:
            android.graphics.Rect r6 = r0.f6824i
            r6.offsetTo(r4, r4)
            h1.g$g r6 = r0.f6817b
            android.graphics.Bitmap r8 = r6.f6870f
            if (r8 == 0) goto L_0x00d5
            int r8 = r8.getWidth()
            if (r15 != r8) goto L_0x00d2
            android.graphics.Bitmap r8 = r6.f6870f
            int r8 = r8.getHeight()
            if (r3 != r8) goto L_0x00d2
            r8 = r7
            goto L_0x00d3
        L_0x00d2:
            r8 = r4
        L_0x00d3:
            if (r8 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r15, r3, r8)
            r6.f6870f = r8
            r6.k = r7
        L_0x00df:
            boolean r6 = r0.f6821f
            if (r6 != 0) goto L_0x00fd
            h1.g$g r6 = r0.f6817b
            android.graphics.Bitmap r8 = r6.f6870f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f6870f
            r14.<init>(r8)
            h1.g$f r11 = r6.f6866b
            h1.g$c r12 = r11.f6857g
            android.graphics.Matrix r13 = h1.g.f.f6850p
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            goto L_0x0155
        L_0x00fd:
            h1.g$g r6 = r0.f6817b
            boolean r8 = r6.k
            if (r8 != 0) goto L_0x0121
            android.content.res.ColorStateList r8 = r6.f6871g
            android.content.res.ColorStateList r9 = r6.f6867c
            if (r8 != r9) goto L_0x0121
            android.graphics.PorterDuff$Mode r8 = r6.f6872h
            android.graphics.PorterDuff$Mode r9 = r6.f6868d
            if (r8 != r9) goto L_0x0121
            boolean r8 = r6.f6874j
            boolean r9 = r6.f6869e
            if (r8 != r9) goto L_0x0121
            int r8 = r6.f6873i
            h1.g$f r6 = r6.f6866b
            int r6 = r6.getRootAlpha()
            if (r8 != r6) goto L_0x0121
            r6 = r7
            goto L_0x0122
        L_0x0121:
            r6 = r4
        L_0x0122:
            if (r6 != 0) goto L_0x0155
            h1.g$g r6 = r0.f6817b
            android.graphics.Bitmap r8 = r6.f6870f
            r8.eraseColor(r4)
            android.graphics.Canvas r14 = new android.graphics.Canvas
            android.graphics.Bitmap r8 = r6.f6870f
            r14.<init>(r8)
            h1.g$f r11 = r6.f6866b
            h1.g$c r12 = r11.f6857g
            android.graphics.Matrix r13 = h1.g.f.f6850p
            r16 = r3
            r11.a(r12, r13, r14, r15, r16)
            h1.g$g r3 = r0.f6817b
            android.content.res.ColorStateList r6 = r3.f6867c
            r3.f6871g = r6
            android.graphics.PorterDuff$Mode r6 = r3.f6868d
            r3.f6872h = r6
            h1.g$f r6 = r3.f6866b
            int r6 = r6.getRootAlpha()
            r3.f6873i = r6
            boolean r6 = r3.f6869e
            r3.f6874j = r6
            r3.k = r4
        L_0x0155:
            h1.g$g r3 = r0.f6817b
            android.graphics.Rect r6 = r0.f6824i
            h1.g$f r8 = r3.f6866b
            int r8 = r8.getRootAlpha()
            r9 = 255(0xff, float:3.57E-43)
            if (r8 >= r9) goto L_0x0164
            r4 = r7
        L_0x0164:
            r8 = 0
            if (r4 != 0) goto L_0x016b
            if (r2 != 0) goto L_0x016b
            r2 = r8
            goto L_0x018b
        L_0x016b:
            android.graphics.Paint r4 = r3.f6875l
            if (r4 != 0) goto L_0x0179
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f6875l = r4
            r4.setFilterBitmap(r7)
        L_0x0179:
            android.graphics.Paint r4 = r3.f6875l
            h1.g$f r7 = r3.f6866b
            int r7 = r7.getRootAlpha()
            r4.setAlpha(r7)
            android.graphics.Paint r4 = r3.f6875l
            r4.setColorFilter(r2)
            android.graphics.Paint r2 = r3.f6875l
        L_0x018b:
            android.graphics.Bitmap r3 = r3.f6870f
            r1.drawBitmap(r3, r8, r6, r2)
            r1.restoreToCount(r5)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.C0017a.a(drawable);
        }
        return this.f6817b.f6866b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6817b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f6819d;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f6815a != null) {
            return new h(this.f6815a.getConstantState());
        }
        this.f6817b.f6865a = getChangingConfigurations();
        return this.f6817b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6817b.f6866b.f6859i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6817b.f6866b.f6858h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            android.graphics.drawable.Drawable r0 = r1.f6815a
            if (r0 == 0) goto L_0x0012
            b0.a.b.d(r0, r2, r3, r4, r5)
            return
        L_0x0012:
            h1.g$g r6 = r1.f6817b
            h1.g$f r0 = new h1.g$f
            r0.<init>()
            r6.f6866b = r0
            int[] r0 = h1.a.f6795a
            android.content.res.TypedArray r7 = z.k.e(r2, r5, r4, r0)
            h1.g$g r8 = r1.f6817b
            h1.g$f r9 = r8.f6866b
            java.lang.String r0 = "tintMode"
            r10 = 6
            r11 = -1
            int r0 = z.k.c(r7, r3, r0, r10, r11)
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_IN
            r13 = 9
            r14 = 5
            r15 = 3
            if (r0 == r15) goto L_0x0049
            if (r0 == r14) goto L_0x004b
            if (r0 == r13) goto L_0x0046
            switch(r0) {
                case 14: goto L_0x0043;
                case 15: goto L_0x0040;
                case 16: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x004b
        L_0x003d:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x004b
        L_0x0040:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x004b
        L_0x0043:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x004b
        L_0x0046:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x004b
        L_0x0049:
            android.graphics.PorterDuff$Mode r12 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x004b:
            r8.f6868d = r12
            java.lang.String r0 = "tint"
            boolean r0 = z.k.d(r3, r0)
            r12 = 0
            r10 = 1
            r13 = 2
            if (r0 == 0) goto L_0x00ae
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r7.getValue(r10, r0)
            int r11 = r0.type
            if (r11 == r13) goto L_0x008f
            r13 = 28
            if (r11 < r13) goto L_0x0073
            r13 = 31
            if (r11 > r13) goto L_0x0073
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00af
        L_0x0073:
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r7.getResourceId(r10, r12)
            java.lang.ThreadLocal<android.util.TypedValue> r13 = z.b.f13081a
            android.content.res.XmlResourceParser r11 = r0.getXml(r11)     // Catch:{ Exception -> 0x0086 }
            android.content.res.ColorStateList r0 = z.b.a(r0, r11, r5)     // Catch:{ Exception -> 0x0086 }
            goto L_0x00af
        L_0x0086:
            r0 = move-exception
            java.lang.String r11 = "CSLCompat"
            java.lang.String r13 = "Failed to inflate ColorStateList."
            android.util.Log.e(r11, r13, r0)
            goto L_0x00ae
        L_0x008f:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00ae:
            r0 = 0
        L_0x00af:
            if (r0 == 0) goto L_0x00b3
            r8.f6867c = r0
        L_0x00b3:
            boolean r0 = r8.f6869e
            java.lang.String r11 = "autoMirrored"
            boolean r11 = z.k.d(r3, r11)
            if (r11 != 0) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            boolean r0 = r7.getBoolean(r14, r0)
        L_0x00c2:
            r8.f6869e = r0
            float r0 = r9.f6860j
            java.lang.String r8 = "viewportWidth"
            r11 = 7
            float r0 = z.k.b(r7, r3, r8, r11, r0)
            r9.f6860j = r0
            float r0 = r9.k
            java.lang.String r8 = "viewportHeight"
            r13 = 8
            float r0 = z.k.b(r7, r3, r8, r13, r0)
            r9.k = r0
            float r8 = r9.f6860j
            r18 = 0
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x03da
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x03bf
            float r0 = r9.f6858h
            float r0 = r7.getDimension(r15, r0)
            r9.f6858h = r0
            float r0 = r9.f6859i
            r8 = 2
            float r0 = r7.getDimension(r8, r0)
            r9.f6859i = r0
            float r8 = r9.f6858h
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x03a4
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0389
            float r0 = r9.getAlpha()
            java.lang.String r8 = "alpha"
            r14 = 4
            float r0 = z.k.b(r7, r3, r8, r14, r0)
            r9.setAlpha(r0)
            java.lang.String r0 = r7.getString(r12)
            if (r0 == 0) goto L_0x011d
            r9.f6862m = r0
            m.b<java.lang.String, java.lang.Object> r8 = r9.f6864o
            r8.put(r0, r9)
        L_0x011d:
            r7.recycle()
            int r0 = r21.getChangingConfigurations()
            r6.f6865a = r0
            r6.k = r10
            h1.g$g r0 = r1.f6817b
            h1.g$f r7 = r0.f6866b
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            h1.g$c r9 = r7.f6857g
            r8.push(r9)
            int r9 = r23.getEventType()
            int r19 = r23.getDepth()
            int r11 = r19 + 1
            r19 = r10
        L_0x0142:
            if (r9 == r10) goto L_0x0374
            int r14 = r23.getDepth()
            if (r14 >= r11) goto L_0x014c
            if (r9 == r15) goto L_0x0374
        L_0x014c:
            java.lang.String r14 = "group"
            r15 = 2
            if (r9 != r15) goto L_0x034f
            java.lang.String r9 = r23.getName()
            java.lang.Object r15 = r8.peek()
            h1.g$c r15 = (h1.g.c) r15
            java.lang.String r13 = "path"
            boolean r13 = r13.equals(r9)
            java.lang.String r10 = "fillType"
            java.lang.String r12 = "pathData"
            if (r13 == 0) goto L_0x0264
            h1.g$b r9 = new h1.g$b
            r9.<init>()
            int[] r13 = h1.a.f6797c
            android.content.res.TypedArray r13 = z.k.e(r2, r5, r4, r13)
            boolean r12 = z.k.d(r3, r12)
            if (r12 != 0) goto L_0x017c
            r20 = r11
            goto L_0x023c
        L_0x017c:
            r12 = 0
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x0185
            r9.f6847b = r14
        L_0x0185:
            r12 = 2
            java.lang.String r14 = r13.getString(r12)
            if (r14 == 0) goto L_0x0192
            a0.d$a[] r12 = a0.d.c(r14)
            r9.f6846a = r12
        L_0x0192:
            java.lang.String r12 = "fillColor"
            r14 = 1
            z.c r12 = z.k.a(r13, r3, r5, r12, r14)
            r9.f6827g = r12
            r12 = 12
            float r14 = r9.f6829i
            r20 = r11
            java.lang.String r11 = "fillAlpha"
            float r11 = z.k.b(r13, r3, r11, r12, r14)
            r9.f6829i = r11
            java.lang.String r11 = "strokeLineCap"
            r12 = 8
            r14 = -1
            int r11 = z.k.c(r13, r3, r11, r12, r14)
            android.graphics.Paint$Cap r14 = r9.f6832m
            if (r11 == 0) goto L_0x01c3
            r12 = 1
            if (r11 == r12) goto L_0x01c0
            r12 = 2
            if (r11 == r12) goto L_0x01bd
            goto L_0x01c5
        L_0x01bd:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.SQUARE
            goto L_0x01c5
        L_0x01c0:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.ROUND
            goto L_0x01c5
        L_0x01c3:
            android.graphics.Paint$Cap r14 = android.graphics.Paint.Cap.BUTT
        L_0x01c5:
            r9.f6832m = r14
            java.lang.String r11 = "strokeLineJoin"
            r12 = 9
            r14 = -1
            int r11 = z.k.c(r13, r3, r11, r12, r14)
            android.graphics.Paint$Join r12 = r9.f6833n
            if (r11 == 0) goto L_0x01e1
            r14 = 1
            if (r11 == r14) goto L_0x01de
            r14 = 2
            if (r11 == r14) goto L_0x01db
            goto L_0x01e3
        L_0x01db:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.BEVEL
            goto L_0x01e3
        L_0x01de:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.ROUND
            goto L_0x01e3
        L_0x01e1:
            android.graphics.Paint$Join r12 = android.graphics.Paint.Join.MITER
        L_0x01e3:
            r9.f6833n = r12
            r11 = 10
            float r12 = r9.f6834o
            java.lang.String r14 = "strokeMiterLimit"
            float r11 = z.k.b(r13, r3, r14, r11, r12)
            r9.f6834o = r11
            java.lang.String r11 = "strokeColor"
            r12 = 3
            z.c r11 = z.k.a(r13, r3, r5, r11, r12)
            r9.f6825e = r11
            r11 = 11
            float r12 = r9.f6828h
            java.lang.String r14 = "strokeAlpha"
            float r11 = z.k.b(r13, r3, r14, r11, r12)
            r9.f6828h = r11
            float r11 = r9.f6826f
            java.lang.String r12 = "strokeWidth"
            r14 = 4
            float r11 = z.k.b(r13, r3, r12, r14, r11)
            r9.f6826f = r11
            float r11 = r9.k
            java.lang.String r12 = "trimPathEnd"
            r14 = 6
            float r11 = z.k.b(r13, r3, r12, r14, r11)
            r9.k = r11
            float r11 = r9.f6831l
            java.lang.String r12 = "trimPathOffset"
            r14 = 7
            float r11 = z.k.b(r13, r3, r12, r14, r11)
            r9.f6831l = r11
            float r11 = r9.f6830j
            java.lang.String r12 = "trimPathStart"
            r14 = 5
            float r11 = z.k.b(r13, r3, r12, r14, r11)
            r9.f6830j = r11
            r11 = 13
            int r12 = r9.f6848c
            int r10 = z.k.c(r13, r3, r10, r11, r12)
            r9.f6848c = r10
        L_0x023c:
            r13.recycle()
            java.util.ArrayList<h1.g$d> r10 = r15.f6836b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x0253
            m.b<java.lang.String, java.lang.Object> r10 = r7.f6864o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x0253:
            int r10 = r0.f6865a
            int r9 = r9.f6849d
            r9 = r9 | r10
            r0.f6865a = r9
            r10 = 5
            r11 = 0
            r12 = 3
            r13 = 7
            r16 = -1
            r19 = 0
            goto L_0x0366
        L_0x0264:
            r20 = r11
            r13 = 9
            r16 = -1
            java.lang.String r11 = "clip-path"
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x02c1
            h1.g$a r9 = new h1.g$a
            r9.<init>()
            boolean r11 = z.k.d(r3, r12)
            if (r11 != 0) goto L_0x027e
            goto L_0x02a4
        L_0x027e:
            int[] r11 = h1.a.f6798d
            android.content.res.TypedArray r11 = z.k.e(r2, r5, r4, r11)
            r12 = 0
            java.lang.String r14 = r11.getString(r12)
            if (r14 == 0) goto L_0x028d
            r9.f6847b = r14
        L_0x028d:
            r14 = 1
            java.lang.String r17 = r11.getString(r14)
            if (r17 == 0) goto L_0x029a
            a0.d$a[] r14 = a0.d.c(r17)
            r9.f6846a = r14
        L_0x029a:
            r14 = 2
            int r10 = z.k.c(r11, r3, r10, r14, r12)
            r9.f6848c = r10
            r11.recycle()
        L_0x02a4:
            java.util.ArrayList<h1.g$d> r10 = r15.f6836b
            r10.add(r9)
            java.lang.String r10 = r9.getPathName()
            if (r10 == 0) goto L_0x02b8
            m.b<java.lang.String, java.lang.Object> r10 = r7.f6864o
            java.lang.String r11 = r9.getPathName()
            r10.put(r11, r9)
        L_0x02b8:
            int r10 = r0.f6865a
            int r9 = r9.f6849d
            r9 = r9 | r10
            r0.f6865a = r9
            goto L_0x0349
        L_0x02c1:
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0349
            h1.g$c r9 = new h1.g$c
            r9.<init>()
            int[] r10 = h1.a.f6796b
            android.content.res.TypedArray r10 = z.k.e(r2, r5, r4, r10)
            float r11 = r9.f6837c
            java.lang.String r12 = "rotation"
            r14 = 5
            float r11 = z.k.b(r10, r3, r12, r14, r11)
            r9.f6837c = r11
            float r11 = r9.f6838d
            r12 = 1
            float r11 = r10.getFloat(r12, r11)
            r9.f6838d = r11
            float r11 = r9.f6839e
            r12 = 2
            float r11 = r10.getFloat(r12, r11)
            r9.f6839e = r11
            float r11 = r9.f6840f
            java.lang.String r12 = "scaleX"
            r13 = 3
            float r11 = z.k.b(r10, r3, r12, r13, r11)
            r9.f6840f = r11
            float r11 = r9.f6841g
            java.lang.String r12 = "scaleY"
            r13 = 4
            float r11 = z.k.b(r10, r3, r12, r13, r11)
            r9.f6841g = r11
            float r11 = r9.f6842h
            java.lang.String r12 = "translateX"
            r13 = 6
            float r11 = z.k.b(r10, r3, r12, r13, r11)
            r9.f6842h = r11
            float r11 = r9.f6843i
            java.lang.String r12 = "translateY"
            r13 = 7
            float r11 = z.k.b(r10, r3, r12, r13, r11)
            r9.f6843i = r11
            r11 = 0
            java.lang.String r12 = r10.getString(r11)
            if (r12 == 0) goto L_0x0324
            r9.f6845l = r12
        L_0x0324:
            r9.c()
            r10.recycle()
            java.util.ArrayList<h1.g$d> r10 = r15.f6836b
            r10.add(r9)
            r8.push(r9)
            java.lang.String r10 = r9.getGroupName()
            if (r10 == 0) goto L_0x0341
            m.b<java.lang.String, java.lang.Object> r10 = r7.f6864o
            java.lang.String r12 = r9.getGroupName()
            r10.put(r12, r9)
        L_0x0341:
            int r10 = r0.f6865a
            int r9 = r9.k
            r9 = r9 | r10
            r0.f6865a = r9
            goto L_0x034c
        L_0x0349:
            r11 = 0
            r13 = 7
            r14 = 5
        L_0x034c:
            r10 = r14
            r12 = 3
            goto L_0x0366
        L_0x034f:
            r20 = r11
            r11 = r12
            r10 = 5
            r12 = 3
            r13 = 7
            r16 = -1
            if (r9 != r12) goto L_0x0366
            java.lang.String r9 = r23.getName()
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x0366
            r8.pop()
        L_0x0366:
            int r9 = r23.next()
            r15 = r12
            r10 = 1
            r13 = 8
            r14 = 4
            r12 = r11
            r11 = r20
            goto L_0x0142
        L_0x0374:
            if (r19 != 0) goto L_0x0381
            android.content.res.ColorStateList r0 = r6.f6867c
            android.graphics.PorterDuff$Mode r2 = r6.f6868d
            android.graphics.PorterDuffColorFilter r0 = r1.a(r0, r2)
            r1.f6818c = r0
            return
        L_0x0381:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "no path defined"
            r0.<init>(r2)
            throw r0
        L_0x0389:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03a4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03bf:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x03da:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r7.getPositionDescription()
            r2.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return a.C0017a.d(drawable);
        }
        return this.f6817b.f6869e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0093g gVar = this.f6817b;
            if (gVar != null) {
                f fVar = gVar.f6866b;
                if (fVar.f6863n == null) {
                    fVar.f6863n = Boolean.valueOf(fVar.f6857g.a());
                }
                if (fVar.f6863n.booleanValue() || ((colorStateList = this.f6817b.f6867c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Drawable mutate() {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6820e && super.mutate() == this) {
            this.f6817b = new C0093g(this.f6817b);
            this.f6820e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z9 = false;
        C0093g gVar = this.f6817b;
        ColorStateList colorStateList = gVar.f6867c;
        if (!(colorStateList == null || (mode = gVar.f6868d) == null)) {
            this.f6818c = a(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        f fVar = gVar.f6866b;
        if (fVar.f6863n == null) {
            fVar.f6863n = Boolean.valueOf(fVar.f6857g.a());
        }
        if (fVar.f6863n.booleanValue()) {
            boolean b10 = gVar.f6866b.f6857g.b(iArr);
            gVar.k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f6817b.f6866b.getRootAlpha() != i10) {
            this.f6817b.f6866b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.C0017a.e(drawable, z9);
        } else {
            this.f6817b.f6869e = z9;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f6819d = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i10) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            b0.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        C0093g gVar = this.f6817b;
        if (gVar.f6867c != colorStateList) {
            gVar.f6867c = colorStateList;
            this.f6818c = a(colorStateList, gVar.f6868d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        C0093g gVar = this.f6817b;
        if (gVar.f6868d != mode) {
            gVar.f6868d = mode;
            this.f6818c = a(gVar.f6867c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f6815a;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6815a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f6835a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f6836b;

        /* renamed from: c  reason: collision with root package name */
        public float f6837c;

        /* renamed from: d  reason: collision with root package name */
        public float f6838d;

        /* renamed from: e  reason: collision with root package name */
        public float f6839e;

        /* renamed from: f  reason: collision with root package name */
        public float f6840f;

        /* renamed from: g  reason: collision with root package name */
        public float f6841g;

        /* renamed from: h  reason: collision with root package name */
        public float f6842h;

        /* renamed from: i  reason: collision with root package name */
        public float f6843i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f6844j;
        public int k;

        /* renamed from: l  reason: collision with root package name */
        public String f6845l;

        public c() {
            this.f6835a = new Matrix();
            this.f6836b = new ArrayList<>();
            this.f6837c = 0.0f;
            this.f6838d = 0.0f;
            this.f6839e = 0.0f;
            this.f6840f = 1.0f;
            this.f6841g = 1.0f;
            this.f6842h = 0.0f;
            this.f6843i = 0.0f;
            this.f6844j = new Matrix();
            this.f6845l = null;
        }

        public final boolean a() {
            for (int i10 = 0; i10 < this.f6836b.size(); i10++) {
                if (this.f6836b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean b(int[] iArr) {
            boolean z9 = false;
            for (int i10 = 0; i10 < this.f6836b.size(); i10++) {
                z9 |= this.f6836b.get(i10).b(iArr);
            }
            return z9;
        }

        public final void c() {
            this.f6844j.reset();
            this.f6844j.postTranslate(-this.f6838d, -this.f6839e);
            this.f6844j.postScale(this.f6840f, this.f6841g);
            this.f6844j.postRotate(this.f6837c, 0.0f, 0.0f);
            this.f6844j.postTranslate(this.f6842h + this.f6838d, this.f6843i + this.f6839e);
        }

        public String getGroupName() {
            return this.f6845l;
        }

        public Matrix getLocalMatrix() {
            return this.f6844j;
        }

        public float getPivotX() {
            return this.f6838d;
        }

        public float getPivotY() {
            return this.f6839e;
        }

        public float getRotation() {
            return this.f6837c;
        }

        public float getScaleX() {
            return this.f6840f;
        }

        public float getScaleY() {
            return this.f6841g;
        }

        public float getTranslateX() {
            return this.f6842h;
        }

        public float getTranslateY() {
            return this.f6843i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f6838d) {
                this.f6838d = f10;
                c();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f6839e) {
                this.f6839e = f10;
                c();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f6837c) {
                this.f6837c = f10;
                c();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f6840f) {
                this.f6840f = f10;
                c();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f6841g) {
                this.f6841g = f10;
                c();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f6842h) {
                this.f6842h = f10;
                c();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f6843i) {
                this.f6843i = f10;
                c();
            }
        }

        public c(c cVar, m.b<String, Object> bVar) {
            e eVar;
            this.f6835a = new Matrix();
            this.f6836b = new ArrayList<>();
            this.f6837c = 0.0f;
            this.f6838d = 0.0f;
            this.f6839e = 0.0f;
            this.f6840f = 1.0f;
            this.f6841g = 1.0f;
            this.f6842h = 0.0f;
            this.f6843i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6844j = matrix;
            this.f6845l = null;
            this.f6837c = cVar.f6837c;
            this.f6838d = cVar.f6838d;
            this.f6839e = cVar.f6839e;
            this.f6840f = cVar.f6840f;
            this.f6841g = cVar.f6841g;
            this.f6842h = cVar.f6842h;
            this.f6843i = cVar.f6843i;
            String str = cVar.f6845l;
            this.f6845l = str;
            this.k = cVar.k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f6844j);
            ArrayList<d> arrayList = cVar.f6836b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f6836b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        eVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        eVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6836b.add(eVar);
                    String str2 = eVar.f6847b;
                    if (str2 != null) {
                        bVar.put(str2, eVar);
                    }
                }
            }
        }
    }

    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f6846a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f6847b;

        /* renamed from: c  reason: collision with root package name */
        public int f6848c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f6849d;

        public e() {
        }

        public d.a[] getPathData() {
            return this.f6846a;
        }

        public String getPathName() {
            return this.f6847b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!a0.d.a(this.f6846a, aVarArr)) {
                this.f6846a = a0.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f6846a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f9a = aVarArr[i10].f9a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f10b;
                    if (i11 >= fArr.length) {
                        break;
                    }
                    aVarArr2[i10].f10b[i11] = fArr[i11];
                    i11++;
                }
            }
        }

        public e(e eVar) {
            this.f6847b = eVar.f6847b;
            this.f6849d = eVar.f6849d;
            this.f6846a = a0.d.e(eVar.f6846a);
        }
    }
}
