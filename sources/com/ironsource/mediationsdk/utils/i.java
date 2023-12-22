package com.ironsource.mediationsdk.utils;

import java.util.Arrays;
import x8.f;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5000a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f5001b = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    /* renamed from: c  reason: collision with root package name */
    public boolean f5002c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f5003d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int[] f5004e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f5005f = null;

    public final void a(int i10) {
        this.f5003d = i10;
    }

    public final void a(String str) {
        f.f(str, "<set-?>");
        this.f5001b = str;
    }

    public final void a(boolean z9) {
        this.f5000a = z9;
    }

    public final void a(int[] iArr) {
        this.f5004e = iArr;
    }

    public final boolean a() {
        return this.f5000a;
    }

    public final String b() {
        return this.f5001b;
    }

    public final void b(boolean z9) {
        this.f5002c = z9;
    }

    public final void b(int[] iArr) {
        this.f5005f = iArr;
    }

    public final boolean c() {
        return this.f5002c;
    }

    public final int d() {
        return this.f5003d;
    }

    public final int[] e() {
        return this.f5004e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5000a == iVar.f5000a && f.a(this.f5001b, iVar.f5001b) && this.f5002c == iVar.f5002c && this.f5003d == iVar.f5003d && f.a(this.f5004e, iVar.f5004e) && f.a(this.f5005f, iVar.f5005f);
    }

    public final int[] f() {
        return this.f5005f;
    }

    public final int hashCode() {
        boolean z9 = this.f5000a;
        boolean z10 = true;
        if (z9) {
            z9 = true;
        }
        int hashCode = (this.f5001b.hashCode() + ((z9 ? 1 : 0) * true)) * 31;
        boolean z11 = this.f5002c;
        if (!z11) {
            z10 = z11;
        }
        int hashCode2 = (Integer.hashCode(this.f5003d) + ((hashCode + (z10 ? 1 : 0)) * 31)) * 31;
        int[] iArr = this.f5004e;
        int i10 = 0;
        int hashCode3 = (hashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f5005f;
        if (iArr2 != null) {
            i10 = Arrays.hashCode(iArr2);
        }
        return hashCode3 + i10;
    }

    public final String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f5000a + ", pixelEventsUrl=" + this.f5001b + ", pixelEventsCompression=" + this.f5002c + ", pixelEventsCompressionLevel=" + this.f5003d + ", pixelOptOut=" + Arrays.toString(this.f5004e) + ", pixelOptIn=" + Arrays.toString(this.f5005f) + ')';
    }
}
