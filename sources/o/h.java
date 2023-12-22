package o;

import androidx.activity.f;
import java.util.Arrays;

public final class h implements Comparable<h> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10450a;

    /* renamed from: b  reason: collision with root package name */
    public int f10451b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f10452c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f10453d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f10454e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10455f = false;

    /* renamed from: g  reason: collision with root package name */
    public float[] f10456g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public float[] f10457h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public int f10458i;

    /* renamed from: j  reason: collision with root package name */
    public b[] f10459j = new b[16];
    public int k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f10460l = 0;

    public h(int i10) {
        this.f10458i = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.k;
            if (i10 >= i11) {
                b[] bVarArr = this.f10459j;
                if (i11 >= bVarArr.length) {
                    this.f10459j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f10459j;
                int i12 = this.k;
                bVarArr2[i12] = bVar;
                this.k = i12 + 1;
                return;
            } else if (this.f10459j[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f10459j[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f10459j;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.k--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f10458i = 5;
        this.f10453d = 0;
        this.f10451b = -1;
        this.f10452c = -1;
        this.f10454e = 0.0f;
        this.f10455f = false;
        int i10 = this.k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10459j[i11] = null;
        }
        this.k = 0;
        this.f10460l = 0;
        this.f10450a = false;
        Arrays.fill(this.f10457h, 0.0f);
    }

    public final int compareTo(Object obj) {
        return this.f10451b - ((h) obj).f10451b;
    }

    public final void d(d dVar, float f10) {
        this.f10454e = f10;
        this.f10455f = true;
        int i10 = this.k;
        this.f10452c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10459j[i11].h(dVar, this, false);
        }
        this.k = 0;
    }

    public final void e(d dVar, b bVar) {
        int i10 = this.k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f10459j[i11].i(dVar, bVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        StringBuilder g10 = f.g("");
        g10.append(this.f10451b);
        return g10.toString();
    }
}
