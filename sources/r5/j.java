package r5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import n4.z;
import r5.f;
import r5.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f11725a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f11726b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f11727c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f11728d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f11729e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f11730f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f11731g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f11732h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f11733i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f11734j = new Path();
    public final Path k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f11735l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f11736a = new j();
    }

    public j() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f11725a[i10] = new l();
            this.f11726b[i10] = new Matrix();
            this.f11727c[i10] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v14 */
    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        int i10;
        int i11;
        float f11;
        float f12;
        e eVar;
        int i12;
        Path path2;
        Matrix matrix;
        l lVar;
        boolean z9;
        c cVar;
        z zVar;
        float f13;
        float f14;
        float f15;
        i iVar2 = iVar;
        float f16 = f10;
        RectF rectF2 = rectF;
        f.a aVar2 = aVar;
        Path path3 = path;
        path.rewind();
        this.f11729e.rewind();
        this.f11730f.rewind();
        this.f11730f.addRect(rectF2, Path.Direction.CW);
        ? r62 = 0;
        int i13 = 0;
        while (true) {
            i10 = 3;
            if (i13 >= 4) {
                break;
            }
            if (i13 == 1) {
                cVar = iVar2.f11709g;
            } else if (i13 == 2) {
                cVar = iVar2.f11710h;
            } else if (i13 != 3) {
                cVar = iVar2.f11708f;
            } else {
                cVar = iVar2.f11707e;
            }
            if (i13 == 1) {
                zVar = iVar2.f11705c;
            } else if (i13 == 2) {
                zVar = iVar2.f11706d;
            } else if (i13 != 3) {
                zVar = iVar2.f11704b;
            } else {
                zVar = iVar2.f11703a;
            }
            l lVar2 = this.f11725a[i13];
            zVar.getClass();
            zVar.a(f16, cVar.a(rectF2), lVar2);
            int i14 = i13 + 1;
            float f17 = (float) ((i14 % 4) * 90);
            this.f11726b[i13].reset();
            PointF pointF = this.f11728d;
            if (i13 == 1) {
                f15 = rectF2.right;
            } else if (i13 != 2) {
                if (i13 != 3) {
                    f14 = rectF2.right;
                } else {
                    f14 = rectF2.left;
                }
                f13 = rectF2.top;
                pointF.set(f14, f13);
                Matrix matrix2 = this.f11726b[i13];
                PointF pointF2 = this.f11728d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f11726b[i13].preRotate(f17);
                float[] fArr = this.f11732h;
                l lVar3 = this.f11725a[i13];
                fArr[0] = lVar3.f11741c;
                fArr[1] = lVar3.f11742d;
                this.f11726b[i13].mapPoints(fArr);
                this.f11727c[i13].reset();
                Matrix matrix3 = this.f11727c[i13];
                float[] fArr2 = this.f11732h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f11727c[i13].preRotate(f17);
                i13 = i14;
            } else {
                f15 = rectF2.left;
            }
            f13 = rectF2.bottom;
            pointF.set(f14, f13);
            Matrix matrix22 = this.f11726b[i13];
            PointF pointF22 = this.f11728d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f11726b[i13].preRotate(f17);
            float[] fArr3 = this.f11732h;
            l lVar32 = this.f11725a[i13];
            fArr3[0] = lVar32.f11741c;
            fArr3[1] = lVar32.f11742d;
            this.f11726b[i13].mapPoints(fArr3);
            this.f11727c[i13].reset();
            Matrix matrix32 = this.f11727c[i13];
            float[] fArr22 = this.f11732h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f11727c[i13].preRotate(f17);
            i13 = i14;
        }
        int i15 = 0;
        for (i11 = 4; i15 < i11; i11 = 4) {
            float[] fArr4 = this.f11732h;
            l lVar4 = this.f11725a[i15];
            fArr4[r62] = lVar4.f11739a;
            fArr4[1] = lVar4.f11740b;
            this.f11726b[i15].mapPoints(fArr4);
            float[] fArr5 = this.f11732h;
            if (i15 == 0) {
                path3.moveTo(fArr5[r62], fArr5[1]);
            } else {
                path3.lineTo(fArr5[r62], fArr5[1]);
            }
            this.f11725a[i15].c(this.f11726b[i15], path3);
            if (aVar2 != null) {
                l lVar5 = this.f11725a[i15];
                Matrix matrix4 = this.f11726b[i15];
                BitSet bitSet = f.this.f11663d;
                lVar5.getClass();
                bitSet.set(i15, r62);
                l.f[] fVarArr = f.this.f11661b;
                lVar5.b(lVar5.f11744f);
                fVarArr[i15] = new k(new ArrayList(lVar5.f11746h), new Matrix(matrix4));
            }
            int i16 = i15 + 1;
            int i17 = i16 % 4;
            float[] fArr6 = this.f11732h;
            l lVar6 = this.f11725a[i15];
            fArr6[r62] = lVar6.f11741c;
            fArr6[1] = lVar6.f11742d;
            this.f11726b[i15].mapPoints(fArr6);
            float[] fArr7 = this.f11733i;
            l lVar7 = this.f11725a[i17];
            fArr7[r62] = lVar7.f11739a;
            fArr7[1] = lVar7.f11740b;
            this.f11726b[i17].mapPoints(fArr7);
            float[] fArr8 = this.f11732h;
            float f18 = fArr8[r62];
            float[] fArr9 = this.f11733i;
            int i18 = i15;
            float max = Math.max(((float) Math.hypot((double) (f18 - fArr9[r62]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f11732h;
            l lVar8 = this.f11725a[i18];
            fArr10[0] = lVar8.f11741c;
            fArr10[1] = lVar8.f11742d;
            this.f11726b[i18].mapPoints(fArr10);
            int i19 = i18;
            if (i19 == 1 || i19 == i10) {
                f12 = rectF.centerX();
                f11 = this.f11732h[0];
            } else {
                f12 = rectF.centerY();
                f11 = this.f11732h[1];
            }
            float abs = Math.abs(f12 - f11);
            this.f11731g.e(0.0f, 270.0f, 0.0f);
            if (i19 == 1) {
                i12 = 3;
                eVar = iVar2.k;
            } else if (i19 != 2) {
                i12 = 3;
                if (i19 != 3) {
                    eVar = iVar2.f11712j;
                } else {
                    eVar = iVar2.f11711i;
                }
            } else {
                i12 = 3;
                eVar = iVar2.f11713l;
            }
            eVar.b(max, abs, f16, this.f11731g);
            this.f11734j.reset();
            this.f11731g.c(this.f11727c[i19], this.f11734j);
            if (!this.f11735l || (!b(this.f11734j, i19) && !b(this.f11734j, i17))) {
                lVar = this.f11731g;
                matrix = this.f11727c[i19];
                path2 = path3;
            } else {
                Path path4 = this.f11734j;
                path4.op(path4, this.f11730f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f11732h;
                l lVar9 = this.f11731g;
                fArr11[0] = lVar9.f11739a;
                fArr11[1] = lVar9.f11740b;
                this.f11727c[i19].mapPoints(fArr11);
                Path path5 = this.f11729e;
                float[] fArr12 = this.f11732h;
                path5.moveTo(fArr12[0], fArr12[1]);
                lVar = this.f11731g;
                matrix = this.f11727c[i19];
                path2 = this.f11729e;
            }
            lVar.c(matrix, path2);
            if (aVar2 != null) {
                l lVar10 = this.f11731g;
                Matrix matrix5 = this.f11727c[i19];
                lVar10.getClass();
                z9 = false;
                f.this.f11663d.set(i19 + 4, false);
                l.f[] fVarArr2 = f.this.f11662c;
                lVar10.b(lVar10.f11744f);
                fVarArr2[i19] = new k(new ArrayList(lVar10.f11746h), new Matrix(matrix5));
            } else {
                z9 = false;
            }
            i10 = i12;
            i15 = i16;
            r62 = z9;
        }
        path.close();
        this.f11729e.close();
        if (!this.f11729e.isEmpty()) {
            path3.op(this.f11729e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        this.k.reset();
        this.f11725a[i10].c(this.f11726b[i10], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
