package n1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9500a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f9501b;

    /* renamed from: c  reason: collision with root package name */
    public c f9502c;

    /* renamed from: d  reason: collision with root package name */
    public int f9503d = 0;

    public final boolean a() {
        return this.f9502c.f9491b != 0;
    }

    public final c b() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f9501b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f9502c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f9502c.f9491b = 1;
            } else {
                this.f9502c.f9495f = f();
                this.f9502c.f9496g = f();
                int c10 = c();
                c cVar = this.f9502c;
                if ((c10 & 128) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                cVar.f9497h = z12;
                cVar.f9498i = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                this.f9502c.f9499j = c();
                c cVar2 = this.f9502c;
                c();
                cVar2.getClass();
                if (this.f9502c.f9497h && !a()) {
                    c cVar3 = this.f9502c;
                    cVar3.f9490a = e(cVar3.f9498i);
                    c cVar4 = this.f9502c;
                    cVar4.k = cVar4.f9490a[cVar4.f9499j];
                }
            }
            if (!a()) {
                boolean z13 = false;
                while (!z13 && !a() && this.f9502c.f9492c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 == 249) {
                                this.f9502c.f9493d = new b();
                                c();
                                int c13 = c();
                                b bVar = this.f9502c.f9493d;
                                int i11 = (c13 & 28) >> 2;
                                bVar.f9486g = i11;
                                if (i11 == 0) {
                                    bVar.f9486g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                bVar.f9485f = z9;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar2 = this.f9502c.f9493d;
                                bVar2.f9488i = f10 * 10;
                                bVar2.f9487h = c();
                                c();
                            } else if (c12 != 254 && c12 == 255) {
                                d();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i12 = 0; i12 < 11; i12++) {
                                    sb2.append((char) this.f9500a[i12]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d();
                                        byte[] bArr = this.f9500a;
                                        if (bArr[0] == 1) {
                                            byte b10 = bArr[1];
                                            byte b11 = bArr[2];
                                            this.f9502c.getClass();
                                        }
                                        if (this.f9503d <= 0) {
                                            break;
                                        }
                                    } while (a());
                                }
                            }
                        }
                        g();
                    } else if (c11 == 44) {
                        c cVar5 = this.f9502c;
                        if (cVar5.f9493d == null) {
                            cVar5.f9493d = new b();
                        }
                        this.f9502c.f9493d.f9480a = f();
                        this.f9502c.f9493d.f9481b = f();
                        this.f9502c.f9493d.f9482c = f();
                        this.f9502c.f9493d.f9483d = f();
                        int c14 = c();
                        if ((c14 & 128) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c14 & 7) + 1));
                        b bVar3 = this.f9502c.f9493d;
                        if ((c14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bVar3.f9484e = z11;
                        if (z10) {
                            bVar3.k = e(pow);
                        } else {
                            bVar3.k = null;
                        }
                        this.f9502c.f9493d.f9489j = this.f9501b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f9502c;
                            cVar6.f9492c++;
                            cVar6.f9494e.add(cVar6.f9493d);
                        }
                    } else if (c11 != 59) {
                        this.f9502c.f9491b = 1;
                    } else {
                        z13 = true;
                    }
                }
                c cVar7 = this.f9502c;
                if (cVar7.f9492c < 0) {
                    cVar7.f9491b = 1;
                }
            }
            return this.f9502c;
        }
    }

    public final int c() {
        try {
            return this.f9501b.get() & 255;
        } catch (Exception unused) {
            this.f9502c.f9491b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f9503d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f9503d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f9501b.get(this.f9500a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f9503d, e10);
                    }
                    this.f9502c.f9491b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f9501b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | -16777216 | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f9502c.f9491b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f9501b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f9501b.position(Math.min(this.f9501b.position() + c10, this.f9501b.limit()));
        } while (c10 > 0);
    }
}
