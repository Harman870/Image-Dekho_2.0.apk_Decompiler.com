package z;

import android.graphics.Color;
import c6.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f13075a;

    /* renamed from: b  reason: collision with root package name */
    public final float f13076b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13077c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13078d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13079e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13080f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f13075a = f10;
        this.f13076b = f11;
        this.f13077c = f12;
        this.f13078d = f13;
        this.f13079e = f14;
        this.f13080f = f15;
    }

    public static a a(int i10) {
        float f10;
        l lVar = l.k;
        float w = b.w(Color.red(i10));
        float w10 = b.w(Color.green(i10));
        float w11 = b.w(Color.blue(i10));
        float[][] fArr = b.u;
        float[] fArr2 = fArr[0];
        float f11 = fArr2[1] * w10;
        float f12 = (fArr2[2] * w11) + f11 + (fArr2[0] * w);
        float[] fArr3 = fArr[1];
        float f13 = fArr3[1] * w10;
        float f14 = (fArr3[2] * w11) + f13 + (fArr3[0] * w);
        float[] fArr4 = fArr[2];
        float f15 = (w11 * fArr4[2]) + (w10 * fArr4[1]) + (w * fArr4[0]);
        float[][] fArr5 = b.f2485r;
        float[] fArr6 = fArr5[0];
        float f16 = fArr6[1] * f14;
        float f17 = (fArr6[2] * f15) + f16 + (fArr6[0] * f12);
        float[] fArr7 = fArr5[1];
        float f18 = fArr7[1] * f14;
        float f19 = fArr7[2] * f15;
        float[] fArr8 = fArr5[2];
        float f20 = f12 * fArr8[0];
        float f21 = f15 * fArr8[2];
        float[] fArr9 = lVar.f13120g;
        float f22 = fArr9[0] * f17;
        float f23 = fArr9[1] * (f19 + f18 + (fArr7[0] * f12));
        float f24 = fArr9[2] * (f21 + (f14 * fArr8[1]) + f20);
        float pow = (float) Math.pow(((double) (Math.abs(f22) * lVar.f13121h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f23) * lVar.f13121h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f24) * lVar.f13121h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f22) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f23) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f24) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f25 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d10)) / 11.0f;
        float f26 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f27 = signum2 * 20.0f;
        float f28 = ((21.0f * signum3) + ((signum * 20.0f) + f27)) / 20.0f;
        float f29 = (((signum * 40.0f) + f27) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f26, (double) f25)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f30 = atan2;
        float f31 = (3.1415927f * f30) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f29 * lVar.f13115b) / lVar.f13114a), (double) (lVar.f13117d * lVar.f13123j))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        if (((double) f30) < 20.14d) {
            f10 = 360.0f + f30;
        } else {
            f10 = f30;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.f13119f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f10) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f13118e) * lVar.f13116c) * ((float) Math.sqrt((double) ((f26 * f26) + (f25 * f25))))) / (f28 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * lVar.f13117d) / (lVar.f13114a + 4.0f)));
        float f32 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((lVar.f13122i * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d11 = (double) f31;
        return new a(f30, sqrt, pow4, f32, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        l lVar = l.k;
        float f13 = lVar.f13117d;
        double d10 = ((double) f10) / 100.0d;
        Math.sqrt(d10);
        Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.f13117d) / (lVar.f13114a + 4.0f)));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((((double) (lVar.f13122i * f11)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (double) ((3.1415927f * f12) / 180.0f);
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(l lVar) {
        float f10;
        l lVar2 = lVar;
        float f11 = this.f13076b;
        if (((double) f11) != 0.0d) {
            double d10 = (double) this.f13077c;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f13119f), 0.73d), 1.1111111111111112d);
                double d11 = (double) ((this.f13075a * 3.1415927f) / 180.0f);
                float pow2 = lVar2.f13114a * ((float) Math.pow(((double) this.f13077c) / 100.0d, (1.0d / ((double) lVar2.f13117d)) / ((double) lVar2.f13123j)));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f13118e * lVar2.f13116c;
                float f12 = pow2 / lVar2.f13115b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = 11.0f * pow * cos2;
                float f14 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f13 + (cos * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f12 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))));
                float signum = (100.0f / lVar2.f13121h) * Math.signum(f18) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / lVar2.f13121h) * Math.signum(f19) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f19)) * 27.13d) / (400.0d - ((double) Math.abs(f19))))), 2.380952380952381d));
                float signum3 = Math.signum(f20);
                float[] fArr = lVar2.f13120g;
                float f21 = signum / fArr[0];
                float f22 = signum2 / fArr[1];
                float pow3 = (((100.0f / lVar2.f13121h) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f20)) * 27.13d) / (400.0d - ((double) Math.abs(f20))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f2486s;
                float[] fArr3 = fArr2[0];
                float f23 = fArr3[1] * f22;
                float f24 = (fArr3[2] * pow3) + f23 + (fArr3[0] * f21);
                float[] fArr4 = fArr2[1];
                float f25 = fArr4[1] * f22;
                float f26 = fArr4[2] * pow3;
                float[] fArr5 = fArr2[2];
                float f27 = f21 * fArr5[0];
                return a0.a.a((double) f24, (double) (f26 + f25 + (fArr4[0] * f21)), (double) ((pow3 * fArr5[2]) + (f22 * fArr5[1]) + f27));
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar2.f13119f), 0.73d), 1.1111111111111112d);
        double d112 = (double) ((this.f13075a * 3.1415927f) / 180.0f);
        float pow22 = lVar2.f13114a * ((float) Math.pow(((double) this.f13077c) / 100.0d, (1.0d / ((double) lVar2.f13117d)) / ((double) lVar2.f13123j)));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * lVar2.f13118e * lVar2.f13116c;
        float f122 = pow22 / lVar2.f13115b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = 11.0f * pow4 * cos22;
        float f142 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f132 + (cos3 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f122 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (((double) Math.abs(f182)) * 27.13d) / (400.0d - ((double) Math.abs(f182))));
        float signum4 = (100.0f / lVar2.f13121h) * Math.signum(f182) * ((float) Math.pow((double) max2, 2.380952380952381d));
        float signum22 = (100.0f / lVar2.f13121h) * Math.signum(f192) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f192)) * 27.13d) / (400.0d - ((double) Math.abs(f192))))), 2.380952380952381d));
        float signum32 = Math.signum(f202);
        float[] fArr6 = lVar2.f13120g;
        float f212 = signum4 / fArr6[0];
        float f222 = signum22 / fArr6[1];
        float pow32 = (((100.0f / lVar2.f13121h) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f202)) * 27.13d) / (400.0d - ((double) Math.abs(f202))))), 2.380952380952381d))) / fArr6[2];
        float[][] fArr22 = b.f2486s;
        float[] fArr32 = fArr22[0];
        float f232 = fArr32[1] * f222;
        float f242 = (fArr32[2] * pow32) + f232 + (fArr32[0] * f212);
        float[] fArr42 = fArr22[1];
        float f252 = fArr42[1] * f222;
        float f262 = fArr42[2] * pow32;
        float[] fArr52 = fArr22[2];
        float f272 = f212 * fArr52[0];
        return a0.a.a((double) f242, (double) (f262 + f252 + (fArr42[0] * f212)), (double) ((pow32 * fArr52[2]) + (f222 * fArr52[1]) + f272));
    }
}
