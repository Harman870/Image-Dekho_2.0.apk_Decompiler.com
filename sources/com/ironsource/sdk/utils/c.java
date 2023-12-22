package com.ironsource.sdk.utils;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f5771d = {Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public a f5772a = new a();

    /* renamed from: b  reason: collision with root package name */
    public a f5773b = new a();

    /* renamed from: c  reason: collision with root package name */
    public int[] f5774c = new int[16];

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5775a = true;

        /* renamed from: b  reason: collision with root package name */
        public int[] f5776b = new int[4];

        /* renamed from: c  reason: collision with root package name */
        public long f5777c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f5778d = new byte[64];

        public a() {
            a();
        }

        public final void a() {
            int[] iArr = this.f5776b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f5777c = 0;
        }
    }

    public c() {
        this.f5772a.a();
        this.f5773b.f5775a = false;
    }

    public static int a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & i11) | (i13 & (~i11))) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public static String a(String str) {
        c cVar = new c();
        byte[] bytes = str.getBytes();
        cVar.c(cVar.f5772a, bytes, bytes.length);
        return cVar.b();
    }

    public static void d(a aVar, int[] iArr) {
        a aVar2 = aVar;
        int[] iArr2 = aVar2.f5776b;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = iArr2[3];
        int a10 = a(i10, i11, i12, i13, iArr[0], 7, -680876936);
        int a11 = a(i13, a10, i11, i12, iArr[1], 12, -389564586);
        int a12 = a(i12, a11, a10, i11, iArr[2], 17, 606105819);
        int a13 = a(i11, a12, a11, a10, iArr[3], 22, -1044525330);
        int a14 = a(a10, a13, a12, a11, iArr[4], 7, -176418897);
        int a15 = a(a11, a14, a13, a12, iArr[5], 12, 1200080426);
        int a16 = a(a12, a15, a14, a13, iArr[6], 17, -1473231341);
        int a17 = a(a13, a16, a15, a14, iArr[7], 22, -45705983);
        int a18 = a(a14, a17, a16, a15, iArr[8], 7, 1770035416);
        int i14 = a18;
        int a19 = a(a15, i14, a17, a16, iArr[9], 12, -1958414417);
        int a20 = a(a16, a19, a18, a17, iArr[10], 17, -42063);
        int a21 = a(a17, a20, a19, a18, iArr[11], 22, -1990404162);
        int a22 = a(i14, a21, a20, a19, iArr[12], 7, 1804603682);
        int i15 = a22;
        int a23 = a(a19, i15, a21, a20, iArr[13], 12, -40341101);
        int a24 = a(a20, a23, a22, a21, iArr[14], 17, -1502002290);
        int a25 = a(a21, a24, a23, a22, iArr[15], 22, 1236535329);
        int f10 = f(i15, a25, a24, a23, iArr[1], 5, -165796510);
        int f11 = f(a23, f10, a25, a24, iArr[6], 9, -1069501632);
        int f12 = f(a24, f11, f10, a25, iArr[11], 14, 643717713);
        int f13 = f(a25, f12, f11, f10, iArr[0], 20, -373897302);
        int f14 = f(f10, f13, f12, f11, iArr[5], 5, -701558691);
        int f15 = f(f11, f14, f13, f12, iArr[10], 9, 38016083);
        int f16 = f(f12, f15, f14, f13, iArr[15], 14, -660478335);
        int f17 = f(f13, f16, f15, f14, iArr[4], 20, -405537848);
        int f18 = f(f14, f17, f16, f15, iArr[9], 5, 568446438);
        int i16 = f18;
        int f19 = f(f15, i16, f17, f16, iArr[14], 9, -1019803690);
        int f20 = f(f16, f19, f18, f17, iArr[3], 14, -187363961);
        int f21 = f(f17, f20, f19, f18, iArr[8], 20, 1163531501);
        int f22 = f(i16, f21, f20, f19, iArr[13], 5, -1444681467);
        int i17 = f22;
        int f23 = f(f19, i17, f21, f20, iArr[2], 9, -51403784);
        int f24 = f(f20, f23, f22, f21, iArr[7], 14, 1735328473);
        int f25 = f(f21, f24, f23, f22, iArr[12], 20, -1926607734);
        int g10 = g(i17, f25, f24, f23, iArr[5], 4, -378558);
        int g11 = g(f23, g10, f25, f24, iArr[8], 11, -2022574463);
        int g12 = g(f24, g11, g10, f25, iArr[11], 16, 1839030562);
        int g13 = g(f25, g12, g11, g10, iArr[14], 23, -35309556);
        int g14 = g(g10, g13, g12, g11, iArr[1], 4, -1530992060);
        int g15 = g(g11, g14, g13, g12, iArr[4], 11, 1272893353);
        int g16 = g(g12, g15, g14, g13, iArr[7], 16, -155497632);
        int g17 = g(g13, g16, g15, g14, iArr[10], 23, -1094730640);
        int g18 = g(g14, g17, g16, g15, iArr[13], 4, 681279174);
        int i18 = g18;
        int g19 = g(g15, i18, g17, g16, iArr[0], 11, -358537222);
        int g20 = g(g16, g19, g18, g17, iArr[3], 16, -722521979);
        int g21 = g(g17, g20, g19, g18, iArr[6], 23, 76029189);
        int g22 = g(i18, g21, g20, g19, iArr[9], 4, -640364487);
        int i19 = g22;
        int g23 = g(g19, i19, g21, g20, iArr[12], 11, -421815835);
        int g24 = g(g20, g23, g22, g21, iArr[15], 16, 530742520);
        int g25 = g(g21, g24, g23, g22, iArr[2], 23, -995338651);
        int h10 = h(i19, g25, g24, g23, iArr[0], 6, -198630844);
        int h11 = h(g23, h10, g25, g24, iArr[7], 10, 1126891415);
        int h12 = h(g24, h11, h10, g25, iArr[14], 15, -1416354905);
        int h13 = h(g25, h12, h11, h10, iArr[5], 21, -57434055);
        int h14 = h(h10, h13, h12, h11, iArr[12], 6, 1700485571);
        int h15 = h(h11, h14, h13, h12, iArr[3], 10, -1894986606);
        int h16 = h(h12, h15, h14, h13, iArr[10], 15, -1051523);
        int h17 = h(h13, h16, h15, h14, iArr[1], 21, -2054922799);
        int h18 = h(h14, h17, h16, h15, iArr[8], 6, 1873313359);
        int i20 = h18;
        int h19 = h(h15, i20, h17, h16, iArr[15], 10, -30611744);
        int h20 = h(h16, h19, h18, h17, iArr[6], 15, -1560198380);
        int h21 = h(h17, h20, h19, h18, iArr[13], 21, 1309151649);
        int h22 = h(i20, h21, h20, h19, iArr[4], 6, -145523070);
        int h23 = h(h19, h22, h21, h20, iArr[11], 10, -1120210379);
        int h24 = h(h20, h23, h22, h21, iArr[2], 15, 718787259);
        int h25 = h(h21, h24, h23, h22, iArr[9], 21, -343485551);
        int[] iArr3 = aVar2.f5776b;
        iArr3[0] = iArr3[0] + h22;
        iArr3[1] = iArr3[1] + h25;
        iArr3[2] = iArr3[2] + h24;
        iArr3[3] = iArr3[3] + h23;
    }

    public static int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 & (~i13)) | (i11 & i13)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public static int g(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + ((i12 ^ i11) ^ i13) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public static int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i10 + (i12 ^ ((~i13) | i11)) + i14 + i16;
        return ((i17 >>> (32 - i15)) | (i17 << i15)) + i11;
    }

    public final String b() {
        a aVar = this.f5773b;
        if (!aVar.f5775a) {
            a aVar2 = this.f5772a;
            byte[] bArr = aVar2.f5778d;
            byte[] bArr2 = aVar.f5778d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar2.f5776b;
            int[] iArr2 = aVar.f5776b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            aVar.f5775a = aVar2.f5775a;
            aVar.f5777c = aVar2.f5777c;
            a aVar3 = this.f5773b;
            long j10 = aVar3.f5777c;
            int i10 = (int) ((j10 >>> 3) & 63);
            c(aVar3, f5771d, i10 < 56 ? 56 - i10 : 120 - i10);
            c(this.f5773b, new byte[]{(byte) ((int) (j10 & 255)), (byte) ((int) ((j10 >>> 8) & 255)), (byte) ((int) ((j10 >>> 16) & 255)), (byte) ((int) ((j10 >>> 24) & 255)), (byte) ((int) ((j10 >>> 32) & 255)), (byte) ((int) ((j10 >>> 40) & 255)), (byte) ((int) ((j10 >>> 48) & 255)), (byte) ((int) ((j10 >>> 56) & 255))}, 8);
            this.f5773b.f5775a = true;
        }
        int[] iArr3 = this.f5773b.f5776b;
        byte[] bArr3 = new byte[16];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 16; i11 < i13; i13 = 16) {
            int i14 = iArr3[i12];
            bArr3[i11] = (byte) (i14 & 255);
            bArr3[i11 + 1] = (byte) ((i14 >>> 8) & 255);
            bArr3[i11 + 2] = (byte) ((i14 >>> 16) & 255);
            bArr3[i11 + 3] = (byte) ((i14 >>> 24) & 255);
            i12++;
            i11 += 4;
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i15 = 0; i15 < 16; i15++) {
            byte b10 = bArr3[i15] & 255;
            if (b10 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(b10));
        }
        return stringBuffer.toString();
    }

    public final void c(a aVar, byte[] bArr, int i10) {
        int i11 = 0;
        this.f5773b.f5775a = false;
        if (i10 + 0 > bArr.length) {
            i10 = bArr.length - 0;
        }
        long j10 = aVar.f5777c;
        int i12 = ((int) (j10 >>> 3)) & 63;
        aVar.f5777c = j10 + ((long) (i10 << 3));
        int i13 = 64 - i12;
        if (i10 >= i13) {
            System.arraycopy(bArr, 0, aVar.f5778d, i12, i13);
            d(aVar, e(aVar.f5778d, 0));
            while (i13 + 63 < i10) {
                d(aVar, e(bArr, i13));
                i13 += 64;
            }
            i12 = 0;
            i11 = i13;
        }
        if (i11 < i10) {
            for (int i14 = i11; i14 < i10; i14++) {
                aVar.f5778d[(i12 + i14) - i11] = bArr[i14 + 0];
            }
        }
    }

    public final int[] e(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 64; i12 += 4) {
            this.f5774c[i11] = (bArr[i12 + i10] & 255) | ((bArr[(i12 + 1) + i10] & 255) << 8) | ((bArr[(i12 + 2) + i10] & 255) << 16) | ((bArr[(i12 + 3) + i10] & 255) << 24);
            i11++;
        }
        return this.f5774c;
    }

    public final String toString() {
        return b();
    }
}
