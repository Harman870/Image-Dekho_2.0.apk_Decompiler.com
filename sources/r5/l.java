package r5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f11739a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f11740b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f11741c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f11742d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f11743e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f11744f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11745g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f11746h = new ArrayList();

    public static class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final c f11747c;

        public a(c cVar) {
            this.f11747c = cVar;
        }

        public final void a(Matrix matrix, q5.a aVar, int i10, Canvas canvas) {
            boolean z9;
            q5.a aVar2 = aVar;
            int i11 = i10;
            Canvas canvas2 = canvas;
            c cVar = this.f11747c;
            float f10 = cVar.f11756f;
            float f11 = cVar.f11757g;
            c cVar2 = this.f11747c;
            RectF rectF = new RectF(cVar2.f11752b, cVar2.f11753c, cVar2.f11754d, cVar2.f11755e);
            if (f11 < 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            Path path = aVar2.f11343g;
            if (z9) {
                int[] iArr = q5.a.k;
                iArr[0] = 0;
                iArr[1] = aVar2.f11342f;
                iArr[2] = aVar2.f11341e;
                iArr[3] = aVar2.f11340d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = (float) (-i11);
                rectF.inset(f12, f12);
                int[] iArr2 = q5.a.k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f11340d;
                iArr2[2] = aVar2.f11341e;
                iArr2[3] = aVar2.f11342f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f13 = 1.0f - (((float) i11) / width);
                float[] fArr = q5.a.f11336l;
                fArr[1] = f13;
                fArr[2] = ((1.0f - f13) / 2.0f) + f13;
                aVar2.f11338b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, q5.a.k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z9) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f11344h);
                }
                canvas.drawArc(rectF, f10, f11, true, aVar2.f11338b);
                canvas.restore();
            }
        }
    }

    public static class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public final d f11748c;

        /* renamed from: d  reason: collision with root package name */
        public final float f11749d;

        /* renamed from: e  reason: collision with root package name */
        public final float f11750e;

        public b(d dVar, float f10, float f11) {
            this.f11748c = dVar;
            this.f11749d = f10;
            this.f11750e = f11;
        }

        public final void a(Matrix matrix, q5.a aVar, int i10, Canvas canvas) {
            d dVar = this.f11748c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f11759c - this.f11750e), (double) (dVar.f11758b - this.f11749d)), 0.0f);
            this.f11762a.set(matrix);
            this.f11762a.preTranslate(this.f11749d, this.f11750e);
            this.f11762a.preRotate(b());
            Matrix matrix2 = this.f11762a;
            aVar.getClass();
            rectF.bottom += (float) i10;
            rectF.offset(0.0f, (float) (-i10));
            int[] iArr = q5.a.f11334i;
            iArr[0] = aVar.f11342f;
            iArr[1] = aVar.f11341e;
            iArr[2] = aVar.f11340d;
            Paint paint = aVar.f11339c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, q5.a.f11335j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f11339c);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f11748c;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f11759c - this.f11750e) / (dVar.f11758b - this.f11749d))));
        }
    }

    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f11751h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f11752b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f11753c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f11754d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f11755e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f11756f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f11757g;

        public c(float f10, float f11, float f12, float f13) {
            this.f11752b = f10;
            this.f11753c = f11;
            this.f11754d = f12;
            this.f11755e = f13;
        }

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11760a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f11751h;
            rectF.set(this.f11752b, this.f11753c, this.f11754d, this.f11755e);
            path.arcTo(rectF, this.f11756f, this.f11757g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f11758b;

        /* renamed from: c  reason: collision with root package name */
        public float f11759c;

        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11760a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f11758b, this.f11759c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f11760a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f11761b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f11762a = new Matrix();

        public abstract void a(Matrix matrix, q5.a aVar, int i10, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z9;
        float f16;
        c cVar = new c(f10, f11, f12, f13);
        cVar.f11756f = f14;
        cVar.f11757g = f15;
        this.f11745g.add(cVar);
        a aVar = new a(cVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z9) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        b(f14);
        this.f11746h.add(aVar);
        this.f11743e = f16;
        double d10 = (double) f17;
        this.f11741c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f11742d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f11743e;
        if (f11 != f10) {
            float f12 = ((f10 - f11) + 360.0f) % 360.0f;
            if (f12 <= 180.0f) {
                float f13 = this.f11741c;
                float f14 = this.f11742d;
                c cVar = new c(f13, f14, f13, f14);
                cVar.f11756f = this.f11743e;
                cVar.f11757g = f12;
                this.f11746h.add(new a(cVar));
                this.f11743e = f10;
            }
        }
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f11745g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f11745g.get(i10)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f11758b = f10;
        dVar.f11759c = f11;
        this.f11745g.add(dVar);
        b bVar = new b(dVar, this.f11741c, this.f11742d);
        b(bVar.b() + 270.0f);
        this.f11746h.add(bVar);
        this.f11743e = bVar.b() + 270.0f;
        this.f11741c = f10;
        this.f11742d = f11;
    }

    public final void e(float f10, float f11, float f12) {
        this.f11739a = 0.0f;
        this.f11740b = f10;
        this.f11741c = 0.0f;
        this.f11742d = f10;
        this.f11743e = f11;
        this.f11744f = (f11 + f12) % 360.0f;
        this.f11745g.clear();
        this.f11746h.clear();
    }
}
