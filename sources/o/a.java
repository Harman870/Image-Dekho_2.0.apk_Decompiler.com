package o;

import androidx.activity.f;
import java.util.Arrays;
import o.b;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f10406a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f10407b;

    /* renamed from: c  reason: collision with root package name */
    public final c f10408c;

    /* renamed from: d  reason: collision with root package name */
    public int f10409d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f10410e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f10411f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f10412g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f10413h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f10414i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10415j = false;

    public a(b bVar, c cVar) {
        this.f10407b = bVar;
        this.f10408c = cVar;
    }

    public final float a(int i10) {
        int i11 = this.f10413h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f10406a) {
            if (i12 == i10) {
                return this.f10412g[i11];
            }
            i11 = this.f10411f[i11];
            i12++;
        }
        return 0.0f;
    }

    public final void b(h hVar, float f10, boolean z9) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f10413h;
            if (i10 == -1) {
                this.f10413h = 0;
                this.f10412g[0] = f10;
                this.f10410e[0] = hVar.f10451b;
                this.f10411f[0] = -1;
                hVar.f10460l++;
                hVar.a(this.f10407b);
                this.f10406a++;
                if (!this.f10415j) {
                    int i11 = this.f10414i + 1;
                    this.f10414i = i11;
                    int[] iArr = this.f10410e;
                    if (i11 >= iArr.length) {
                        this.f10415j = true;
                        this.f10414i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f10406a) {
                int i14 = this.f10410e[i10];
                int i15 = hVar.f10451b;
                if (i14 == i15) {
                    float[] fArr = this.f10412g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f10413h) {
                            this.f10413h = this.f10411f[i10];
                        } else {
                            int[] iArr2 = this.f10411f;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z9) {
                            hVar.b(this.f10407b);
                        }
                        if (this.f10415j) {
                            this.f10414i = i10;
                        }
                        hVar.f10460l--;
                        this.f10406a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f10411f[i10];
                i12++;
            }
            int i16 = this.f10414i;
            int i17 = i16 + 1;
            if (this.f10415j) {
                int[] iArr3 = this.f10410e;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f10410e;
            if (i16 >= iArr4.length && this.f10406a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f10410e;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f10410e;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f10409d * 2;
                this.f10409d = i19;
                this.f10415j = false;
                this.f10414i = i16 - 1;
                this.f10412g = Arrays.copyOf(this.f10412g, i19);
                this.f10410e = Arrays.copyOf(this.f10410e, this.f10409d);
                this.f10411f = Arrays.copyOf(this.f10411f, this.f10409d);
            }
            this.f10410e[i16] = hVar.f10451b;
            this.f10412g[i16] = f10;
            int[] iArr7 = this.f10411f;
            if (i13 != -1) {
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                iArr7[i16] = this.f10413h;
                this.f10413h = i16;
            }
            hVar.f10460l++;
            hVar.a(this.f10407b);
            this.f10406a++;
            if (!this.f10415j) {
                this.f10414i++;
            }
            int i20 = this.f10414i;
            int[] iArr8 = this.f10410e;
            if (i20 >= iArr8.length) {
                this.f10415j = true;
                this.f10414i = iArr8.length - 1;
            }
        }
    }

    public final void c(h hVar, float f10) {
        if (f10 == 0.0f) {
            j(hVar, true);
            return;
        }
        int i10 = this.f10413h;
        if (i10 == -1) {
            this.f10413h = 0;
            this.f10412g[0] = f10;
            this.f10410e[0] = hVar.f10451b;
            this.f10411f[0] = -1;
            hVar.f10460l++;
            hVar.a(this.f10407b);
            this.f10406a++;
            if (!this.f10415j) {
                int i11 = this.f10414i + 1;
                this.f10414i = i11;
                int[] iArr = this.f10410e;
                if (i11 >= iArr.length) {
                    this.f10415j = true;
                    this.f10414i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f10406a) {
            int i14 = this.f10410e[i10];
            int i15 = hVar.f10451b;
            if (i14 == i15) {
                this.f10412g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f10411f[i10];
            i12++;
        }
        int i16 = this.f10414i;
        int i17 = i16 + 1;
        if (this.f10415j) {
            int[] iArr2 = this.f10410e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f10410e;
        if (i16 >= iArr3.length && this.f10406a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f10410e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f10410e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f10409d * 2;
            this.f10409d = i19;
            this.f10415j = false;
            this.f10414i = i16 - 1;
            this.f10412g = Arrays.copyOf(this.f10412g, i19);
            this.f10410e = Arrays.copyOf(this.f10410e, this.f10409d);
            this.f10411f = Arrays.copyOf(this.f10411f, this.f10409d);
        }
        this.f10410e[i16] = hVar.f10451b;
        this.f10412g[i16] = f10;
        int[] iArr6 = this.f10411f;
        if (i13 != -1) {
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            iArr6[i16] = this.f10413h;
            this.f10413h = i16;
        }
        hVar.f10460l++;
        hVar.a(this.f10407b);
        int i20 = this.f10406a + 1;
        this.f10406a = i20;
        if (!this.f10415j) {
            this.f10414i++;
        }
        int[] iArr7 = this.f10410e;
        if (i20 >= iArr7.length) {
            this.f10415j = true;
        }
        if (this.f10414i >= iArr7.length) {
            this.f10415j = true;
            this.f10414i = iArr7.length - 1;
        }
    }

    public final void clear() {
        int i10 = this.f10413h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            h hVar = ((h[]) this.f10408c.f10424d)[this.f10410e[i10]];
            if (hVar != null) {
                hVar.b(this.f10407b);
            }
            i10 = this.f10411f[i10];
            i11++;
        }
        this.f10413h = -1;
        this.f10414i = -1;
        this.f10415j = false;
        this.f10406a = 0;
    }

    public final int d() {
        return this.f10406a;
    }

    public final boolean e(h hVar) {
        int i10 = this.f10413h;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            if (this.f10410e[i10] == hVar.f10451b) {
                return true;
            }
            i10 = this.f10411f[i10];
            i11++;
        }
        return false;
    }

    public final float f(b bVar, boolean z9) {
        float g10 = g(bVar.f10416a);
        j(bVar.f10416a, z9);
        b.a aVar = bVar.f10419d;
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            h h10 = aVar.h(i10);
            b(h10, aVar.g(h10) * g10, z9);
        }
        return g10;
    }

    public final float g(h hVar) {
        int i10 = this.f10413h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            if (this.f10410e[i10] == hVar.f10451b) {
                return this.f10412g[i10];
            }
            i10 = this.f10411f[i10];
            i11++;
        }
        return 0.0f;
    }

    public final h h(int i10) {
        int i11 = this.f10413h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f10406a) {
            if (i12 == i10) {
                return ((h[]) this.f10408c.f10424d)[this.f10410e[i11]];
            }
            i11 = this.f10411f[i11];
            i12++;
        }
        return null;
    }

    public final void i(float f10) {
        int i10 = this.f10413h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            float[] fArr = this.f10412g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f10411f[i10];
            i11++;
        }
    }

    public final float j(h hVar, boolean z9) {
        int i10 = this.f10413h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f10406a) {
            if (this.f10410e[i10] == hVar.f10451b) {
                if (i10 == this.f10413h) {
                    this.f10413h = this.f10411f[i10];
                } else {
                    int[] iArr = this.f10411f;
                    iArr[i12] = iArr[i10];
                }
                if (z9) {
                    hVar.b(this.f10407b);
                }
                hVar.f10460l--;
                this.f10406a--;
                this.f10410e[i10] = -1;
                if (this.f10415j) {
                    this.f10414i = i10;
                }
                return this.f10412g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f10411f[i10];
        }
        return 0.0f;
    }

    public final void k() {
        int i10 = this.f10413h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            float[] fArr = this.f10412g;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f10411f[i10];
            i11++;
        }
    }

    public final String toString() {
        int i10 = this.f10413h;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f10406a) {
            StringBuilder g10 = f.g(com.ironsource.adapters.ironsource.a.g(str, " -> "));
            g10.append(this.f10412g[i10]);
            g10.append(" : ");
            StringBuilder g11 = f.g(g10.toString());
            g11.append(((h[]) this.f10408c.f10424d)[this.f10410e[i10]]);
            str = g11.toString();
            i10 = this.f10411f[i10];
            i11++;
        }
        return str;
    }
}
