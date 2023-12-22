package a0;

import android.graphics.Path;
import android.util.Log;

public final class d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f9a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f10b;

        public a(char c10, float[] fArr) {
            this.f9a = c10;
            this.f10b = fArr;
        }

        public a(a aVar) {
            this.f9a = aVar.f9a;
            float[] fArr = aVar.f10b;
            this.f10b = d.b(fArr, fArr.length);
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z9, boolean z10) {
            double d10;
            double d11;
            float f17 = f10;
            float f18 = f12;
            float f19 = f14;
            boolean z11 = z10;
            double radians = Math.toRadians((double) f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = (double) f17;
            double d13 = (double) f11;
            double d14 = (d13 * sin) + (d12 * cos);
            double d15 = d12;
            double d16 = (double) f19;
            double d17 = d14 / d16;
            double d18 = radians;
            double d19 = (double) f15;
            double d20 = ((d13 * cos) + (((double) (-f17)) * sin)) / d19;
            double d21 = d13;
            double d22 = (double) f13;
            double d23 = ((d22 * sin) + (((double) f18) * cos)) / d16;
            double d24 = ((d22 * cos) + (((double) (-f18)) * sin)) / d19;
            double d25 = d17 - d23;
            double d26 = d20 - d24;
            double d27 = (d17 + d23) / 2.0d;
            double d28 = (d20 + d24) / 2.0d;
            double d29 = sin;
            double d30 = (d26 * d26) + (d25 * d25);
            if (d30 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d31 = (1.0d / d30) - 0.25d;
            if (d31 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d30);
                float sqrt = (float) (Math.sqrt(d30) / 1.99999d);
                a(path, f10, f11, f12, f13, f19 * sqrt, f15 * sqrt, f16, z9, z10);
                return;
            }
            double sqrt2 = Math.sqrt(d31);
            double d32 = d25 * sqrt2;
            double d33 = sqrt2 * d26;
            if (z9 == z11) {
                d11 = d27 - d33;
                d10 = d28 + d32;
            } else {
                d11 = d27 + d33;
                d10 = d28 - d32;
            }
            double atan2 = Math.atan2(d20 - d10, d17 - d11);
            double atan22 = Math.atan2(d24 - d10, d23 - d11) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i10 >= 0)) {
                atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d34 = d11 * d16;
            double d35 = d10 * d19;
            double d36 = (d34 * cos) - (d35 * d29);
            double d37 = (d35 * cos) + (d34 * d29);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d38 = -d16;
            double d39 = d38 * cos2;
            double d40 = d19 * sin2;
            double d41 = (d39 * sin3) - (d40 * cos3);
            double d42 = d38 * sin2;
            double d43 = d19 * cos2;
            double d44 = (cos3 * d43) + (sin3 * d42);
            double d45 = d43;
            double d46 = atan22 / ((double) ceil);
            int i11 = 0;
            while (i11 < ceil) {
                double d47 = atan2 + d46;
                double sin4 = Math.sin(d47);
                double cos4 = Math.cos(d47);
                double d48 = d46;
                double d49 = (((d16 * cos2) * cos4) + d36) - (d40 * sin4);
                double d50 = d45;
                double d51 = d36;
                double d52 = (d50 * sin4) + (d16 * sin2 * cos4) + d37;
                double d53 = (d39 * sin4) - (d40 * cos4);
                double d54 = (cos4 * d50) + (sin4 * d42);
                double d55 = d47 - atan2;
                double tan = Math.tan(d55 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d55)) / 3.0d;
                double d56 = d47;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d41 * sqrt3) + d15), (float) ((d44 * sqrt3) + d21), (float) (d49 - (sqrt3 * d53)), (float) (d52 - (sqrt3 * d54)), (float) d49, (float) d52);
                i11++;
                atan2 = d56;
                d42 = d42;
                cos2 = cos2;
                ceil = ceil;
                d44 = d54;
                d16 = d16;
                d41 = d53;
                d15 = d49;
                d21 = d52;
                d36 = d51;
                d46 = d48;
                d45 = d50;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            float f10;
            float f11;
            int i11;
            int i12;
            float[] fArr;
            char c10;
            int i13;
            float[] fArr2;
            char c11;
            int i14;
            boolean z9;
            boolean z10;
            float f12;
            float f13;
            float f14;
            float f15;
            int i15;
            boolean z11;
            boolean z12;
            float f16;
            float f17;
            int i16;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f30;
            float f31;
            float f32;
            float f33;
            float f34;
            a[] aVarArr2 = aVarArr;
            Path path2 = path;
            int i17 = 6;
            float[] fArr3 = new float[6];
            char c12 = 'm';
            int i18 = 0;
            char c13 = 'm';
            int i19 = 0;
            while (i19 < aVarArr2.length) {
                a aVar = aVarArr2[i19];
                char c14 = aVar.f9a;
                float[] fArr4 = aVar.f10b;
                float f35 = fArr3[i18];
                float f36 = fArr3[1];
                float f37 = fArr3[2];
                float f38 = fArr3[3];
                float f39 = fArr3[4];
                float f40 = fArr3[5];
                switch (c14) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i17;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path2.moveTo(f39, f40);
                        f35 = f39;
                        f37 = f35;
                        f36 = f40;
                        f38 = f36;
                        break;
                }
                i10 = 2;
                float f41 = f39;
                float f42 = f40;
                float f43 = f35;
                float f44 = f36;
                int i20 = i18;
                while (i20 < fArr4.length) {
                    if (c14 != 'A') {
                        if (c14 != 'C') {
                            if (c14 == 'H') {
                                i11 = i20;
                                fArr = fArr4;
                                c10 = c14;
                                i12 = i19;
                                int i21 = i11 + 0;
                                path2.lineTo(fArr[i21], f44);
                                f43 = fArr[i21];
                            } else if (c14 == 'Q') {
                                i15 = i20;
                                fArr = fArr4;
                                c10 = c14;
                                i12 = i19;
                                int i22 = i15 + 0;
                                int i23 = i15 + 1;
                                int i24 = i15 + 2;
                                int i25 = i15 + 3;
                                path2.quadTo(fArr[i22], fArr[i23], fArr[i24], fArr[i25]);
                                f15 = fArr[i22];
                                f14 = fArr[i23];
                                f43 = fArr[i24];
                                f44 = fArr[i25];
                            } else if (c14 == 'V') {
                                i11 = i20;
                                fArr = fArr4;
                                c10 = c14;
                                i12 = i19;
                                int i26 = i11 + 0;
                                path2.lineTo(f43, fArr[i26]);
                                f44 = fArr[i26];
                            } else if (c14 != 'a') {
                                if (c14 != 'c') {
                                    if (c14 == 'h') {
                                        i11 = i20;
                                        float f45 = f44;
                                        int i27 = i11 + 0;
                                        path2.rLineTo(fArr4[i27], 0.0f);
                                        f43 += fArr4[i27];
                                    } else if (c14 != 'q') {
                                        if (c14 != 'v') {
                                            if (c14 != 'L') {
                                                if (c14 == 'M') {
                                                    i11 = i20;
                                                    f26 = fArr4[i11 + 0];
                                                    f25 = fArr4[i11 + 1];
                                                    if (i11 > 0) {
                                                        path2.lineTo(f26, f25);
                                                    } else {
                                                        path2.moveTo(f26, f25);
                                                        f41 = f26;
                                                        f42 = f25;
                                                    }
                                                } else if (c14 == 'S') {
                                                    i16 = i20;
                                                    float f46 = f44;
                                                    float f47 = f43;
                                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                        f27 = (f46 * 2.0f) - f10;
                                                        f28 = (f47 * 2.0f) - f11;
                                                    } else {
                                                        f28 = f47;
                                                        f27 = f46;
                                                    }
                                                    int i28 = i16 + 0;
                                                    int i29 = i16 + 1;
                                                    int i30 = i16 + 2;
                                                    int i31 = i16 + 3;
                                                    path.cubicTo(f28, f27, fArr4[i28], fArr4[i29], fArr4[i30], fArr4[i31]);
                                                    float f48 = fArr4[i28];
                                                    float f49 = fArr4[i29];
                                                    f17 = fArr4[i30];
                                                    f16 = fArr4[i31];
                                                    f11 = f48;
                                                    f10 = f49;
                                                    f43 = f17;
                                                    f44 = f16;
                                                } else if (c14 == 'T') {
                                                    i11 = i20;
                                                    float f50 = f44;
                                                    float f51 = f43;
                                                    if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                        f29 = (f51 * 2.0f) - f11;
                                                        f30 = (f50 * 2.0f) - f10;
                                                    } else {
                                                        f29 = f51;
                                                        f30 = f50;
                                                    }
                                                    int i32 = i11 + 0;
                                                    int i33 = i11 + 1;
                                                    path2.quadTo(f29, f30, fArr4[i32], fArr4[i33]);
                                                    f10 = f30;
                                                    f11 = f29;
                                                    fArr = fArr4;
                                                    c10 = c14;
                                                    i12 = i19;
                                                    f43 = fArr4[i32];
                                                    f44 = fArr4[i33];
                                                } else if (c14 == 'l') {
                                                    i11 = i20;
                                                    f23 = f44;
                                                    int i34 = i11 + 0;
                                                    int i35 = i11 + 1;
                                                    path2.rLineTo(fArr4[i34], fArr4[i35]);
                                                    f43 += fArr4[i34];
                                                    f24 = fArr4[i35];
                                                } else if (c14 == c12) {
                                                    i11 = i20;
                                                    float f52 = fArr4[i11 + 0];
                                                    f43 += f52;
                                                    float f53 = fArr4[i11 + 1];
                                                    f44 += f53;
                                                    if (i11 > 0) {
                                                        path2.rLineTo(f52, f53);
                                                    } else {
                                                        path2.rMoveTo(f52, f53);
                                                        f42 = f44;
                                                        f41 = f43;
                                                    }
                                                } else if (c14 != 's') {
                                                    if (c14 == 't') {
                                                        if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                            f33 = f43 - f11;
                                                            f34 = f44 - f10;
                                                        } else {
                                                            f34 = 0.0f;
                                                            f33 = 0.0f;
                                                        }
                                                        int i36 = i20 + 0;
                                                        int i37 = i20 + 1;
                                                        path2.rQuadTo(f33, f34, fArr4[i36], fArr4[i37]);
                                                        float f54 = f33 + f43;
                                                        float f55 = f34 + f44;
                                                        f43 += fArr4[i36];
                                                        f44 += fArr4[i37];
                                                        f10 = f55;
                                                        f11 = f54;
                                                    }
                                                    i11 = i20;
                                                } else {
                                                    if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                        f31 = f44 - f10;
                                                        f32 = f43 - f11;
                                                    } else {
                                                        f32 = 0.0f;
                                                        f31 = 0.0f;
                                                    }
                                                    int i38 = i20 + 0;
                                                    int i39 = i20 + 1;
                                                    int i40 = i20 + 2;
                                                    int i41 = i20 + 3;
                                                    i16 = i20;
                                                    f18 = f44;
                                                    float f56 = f43;
                                                    path.rCubicTo(f32, f31, fArr4[i38], fArr4[i39], fArr4[i40], fArr4[i41]);
                                                    f21 = fArr4[i38] + f56;
                                                    f20 = fArr4[i39] + f18;
                                                    f19 = f56 + fArr4[i40];
                                                    f22 = fArr4[i41];
                                                }
                                                f43 = f41;
                                                f44 = f42;
                                            } else {
                                                i11 = i20;
                                                int i42 = i11 + 0;
                                                int i43 = i11 + 1;
                                                path2.lineTo(fArr4[i42], fArr4[i43]);
                                                f26 = fArr4[i42];
                                                f25 = fArr4[i43];
                                            }
                                            f43 = f26;
                                            f44 = f25;
                                        } else {
                                            i11 = i20;
                                            f23 = f44;
                                            float f57 = f43;
                                            int i44 = i11 + 0;
                                            path2.rLineTo(0.0f, fArr4[i44]);
                                            f24 = fArr4[i44];
                                        }
                                        f44 = f23 + f24;
                                    } else {
                                        i16 = i20;
                                        f18 = f44;
                                        float f58 = f43;
                                        int i45 = i16 + 0;
                                        int i46 = i16 + 1;
                                        int i47 = i16 + 2;
                                        int i48 = i16 + 3;
                                        path2.rQuadTo(fArr4[i45], fArr4[i46], fArr4[i47], fArr4[i48]);
                                        f21 = fArr4[i45] + f58;
                                        f20 = fArr4[i46] + f18;
                                        float f59 = f58 + fArr4[i47];
                                        float f60 = fArr4[i48];
                                        f19 = f59;
                                        f22 = f60;
                                    }
                                    fArr = fArr4;
                                    c10 = c14;
                                    i12 = i19;
                                } else {
                                    i16 = i20;
                                    f18 = f44;
                                    float f61 = f43;
                                    int i49 = i16 + 2;
                                    int i50 = i16 + 3;
                                    int i51 = i16 + 4;
                                    int i52 = i16 + 5;
                                    path.rCubicTo(fArr4[i16 + 0], fArr4[i16 + 1], fArr4[i49], fArr4[i50], fArr4[i51], fArr4[i52]);
                                    f21 = fArr4[i49] + f61;
                                    f20 = fArr4[i50] + f18;
                                    f19 = f61 + fArr4[i51];
                                    f22 = fArr4[i52];
                                }
                                f16 = f18 + f22;
                                f11 = f21;
                                f10 = f20;
                                f17 = f19;
                                f43 = f17;
                                f44 = f16;
                                fArr = fArr4;
                                c10 = c14;
                                i12 = i19;
                            } else {
                                i13 = i20;
                                float f62 = f44;
                                float f63 = f43;
                                int i53 = i13 + 5;
                                float f64 = fArr4[i53] + f63;
                                int i54 = i13 + 6;
                                float f65 = fArr4[i54] + f62;
                                float f66 = fArr4[i13 + 0];
                                float f67 = fArr4[i13 + 1];
                                float f68 = fArr4[i13 + 2];
                                if (fArr4[i13 + 3] != 0.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (fArr4[i13 + 4] != 0.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                fArr2 = fArr4;
                                float f69 = f68;
                                c11 = c14;
                                i14 = i19;
                                a(path, f63, f62, f64, f65, f66, f67, f69, z11, z12);
                                f12 = f63 + fArr2[i53];
                                f13 = f62 + fArr2[i54];
                            }
                            i20 = i11 + i10;
                            c13 = c10;
                            c14 = c13;
                            fArr4 = fArr;
                            i19 = i12;
                            c12 = 'm';
                            i18 = 0;
                            a[] aVarArr3 = aVarArr;
                        } else {
                            i15 = i20;
                            fArr = fArr4;
                            c10 = c14;
                            i12 = i19;
                            int i55 = i15 + 2;
                            int i56 = i15 + 3;
                            int i57 = i15 + 4;
                            int i58 = i15 + 5;
                            path.cubicTo(fArr[i15 + 0], fArr[i15 + 1], fArr[i55], fArr[i56], fArr[i57], fArr[i58]);
                            float f70 = fArr[i57];
                            float f71 = fArr[i58];
                            f15 = fArr[i55];
                            f43 = f70;
                            f44 = f71;
                            f14 = fArr[i56];
                        }
                        f11 = f15;
                        f10 = f14;
                        i20 = i11 + i10;
                        c13 = c10;
                        c14 = c13;
                        fArr4 = fArr;
                        i19 = i12;
                        c12 = 'm';
                        i18 = 0;
                        a[] aVarArr32 = aVarArr;
                    } else {
                        i13 = i20;
                        float f72 = f44;
                        float f73 = f43;
                        fArr2 = fArr4;
                        c11 = c14;
                        i14 = i19;
                        int i59 = i13 + 5;
                        float f74 = fArr2[i59];
                        int i60 = i13 + 6;
                        float f75 = fArr2[i60];
                        float f76 = fArr2[i13 + 0];
                        float f77 = fArr2[i13 + 1];
                        float f78 = fArr2[i13 + 2];
                        if (fArr2[i13 + 3] != 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (fArr2[i13 + 4] != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a(path, f73, f72, f74, f75, f76, f77, f78, z9, z10);
                        f12 = fArr2[i59];
                        f13 = fArr2[i60];
                    }
                    f10 = f44;
                    f11 = f43;
                    i20 = i11 + i10;
                    c13 = c10;
                    c14 = c13;
                    fArr4 = fArr;
                    i19 = i12;
                    c12 = 'm';
                    i18 = 0;
                    a[] aVarArr322 = aVarArr;
                }
                int i61 = i19;
                fArr3[i18] = f43;
                fArr3[1] = f44;
                fArr3[2] = f11;
                fArr3[3] = f10;
                fArr3[4] = f41;
                fArr3[5] = f42;
                i19 = i61 + 1;
                i17 = 6;
                c12 = 'm';
                c13 = aVarArr[i61].f9a;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            char c10 = aVar.f9a;
            a aVar2 = aVarArr2[i10];
            if (c10 != aVar2.f9a || aVar.f10b.length != aVar2.f10b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0097 A[Catch:{ NumberFormatException -> 0x00bc }, LOOP:3: B:25:0x006c->B:45:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a0.d.a[] c(java.lang.String r17) {
        /*
            r0 = r17
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 1
            r4 = r3
            r3 = r2
        L_0x000f:
            int r5 = r17.length()
            if (r4 >= r5) goto L_0x00e3
        L_0x0015:
            int r5 = r17.length()
            r6 = 69
            r7 = 101(0x65, float:1.42E-43)
            if (r4 >= r5) goto L_0x0039
            char r5 = r0.charAt(r4)
            int r8 = r5 + -65
            int r9 = r5 + -90
            int r9 = r9 * r8
            if (r9 <= 0) goto L_0x0031
            int r8 = r5 + -97
            int r9 = r5 + -122
            int r9 = r9 * r8
            if (r9 > 0) goto L_0x0036
        L_0x0031:
            if (r5 == r7) goto L_0x0036
            if (r5 == r6) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0039:
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r2 = r2.trim()
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x00d9
            char r5 = r2.charAt(r3)
            r8 = 122(0x7a, float:1.71E-43)
            if (r5 == r8) goto L_0x00cb
            char r5 = r2.charAt(r3)
            r8 = 90
            if (r5 != r8) goto L_0x0059
            goto L_0x00cb
        L_0x0059:
            int r5 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            float[] r5 = new float[r5]     // Catch:{ NumberFormatException -> 0x00bc }
            int r8 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            r9 = 1
            r10 = r9
            r9 = r3
        L_0x0066:
            if (r10 >= r8) goto L_0x00b1
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r10
        L_0x006c:
            int r15 = r2.length()     // Catch:{ NumberFormatException -> 0x00bc }
            if (r14 >= r15) goto L_0x009a
            char r15 = r2.charAt(r14)     // Catch:{ NumberFormatException -> 0x00bc }
            r7 = 32
            if (r15 == r7) goto L_0x0090
            r7 = 101(0x65, float:1.42E-43)
            if (r15 == r6) goto L_0x008e
            if (r15 == r7) goto L_0x008e
            switch(r15) {
                case 44: goto L_0x0092;
                case 45: goto L_0x0088;
                case 46: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ NumberFormatException -> 0x00bc }
        L_0x0083:
            goto L_0x0093
        L_0x0084:
            if (r12 != 0) goto L_0x008c
            r12 = 1
            goto L_0x0093
        L_0x0088:
            if (r14 == r10) goto L_0x0093
            if (r13 != 0) goto L_0x0093
        L_0x008c:
            r11 = 1
            goto L_0x0092
        L_0x008e:
            r13 = 1
            goto L_0x0094
        L_0x0090:
            r7 = 101(0x65, float:1.42E-43)
        L_0x0092:
            r9 = 1
        L_0x0093:
            r13 = 0
        L_0x0094:
            if (r9 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            int r14 = r14 + 1
            goto L_0x006c
        L_0x009a:
            if (r10 >= r14) goto L_0x00a9
            int r9 = r3 + 1
            java.lang.String r10 = r2.substring(r10, r14)     // Catch:{ NumberFormatException -> 0x00bc }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x00bc }
            r5[r3] = r10     // Catch:{ NumberFormatException -> 0x00bc }
            r3 = r9
        L_0x00a9:
            if (r11 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            int r14 = r14 + 1
        L_0x00ae:
            r10 = r14
            r9 = 0
            goto L_0x0066
        L_0x00b1:
            float[] r3 = b(r5, r3)     // Catch:{ NumberFormatException -> 0x00bc }
            r5 = 0
            r16 = r5
            r5 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00bc:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r3 = "error in parsing \""
            java.lang.String r4 = "\""
            java.lang.String r2 = androidx.fragment.app.w0.d(r3, r2, r4)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r5 = new float[r3]
        L_0x00cd:
            char r2 = r2.charAt(r3)
            a0.d$a r3 = new a0.d$a
            r3.<init>(r2, r5)
            r1.add(r3)
        L_0x00d9:
            int r2 = r4 + 1
            r3 = 0
            r16 = r4
            r4 = r2
            r2 = r16
            goto L_0x000f
        L_0x00e3:
            int r4 = r4 - r2
            r3 = 1
            if (r4 != r3) goto L_0x00fc
            int r3 = r17.length()
            if (r2 >= r3) goto L_0x00fc
            char r0 = r0.charAt(r2)
            r2 = 0
            float[] r2 = new float[r2]
            a0.d$a r3 = new a0.d$a
            r3.<init>(r0, r2)
            r1.add(r3)
        L_0x00fc:
            int r0 = r1.size()
            a0.d$a[] r0 = new a0.d.a[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            a0.d$a[] r0 = (a0.d.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.c(java.lang.String):a0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 == null) {
            return null;
        }
        try {
            a.b(c10, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(com.ironsource.adapters.ironsource.a.g("Error in parsing ", str), e10);
        }
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
