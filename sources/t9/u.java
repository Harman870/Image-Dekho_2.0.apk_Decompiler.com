package t9;

import javax.annotation.Nullable;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12079a;

    /* renamed from: b  reason: collision with root package name */
    public int f12080b;

    /* renamed from: c  reason: collision with root package name */
    public int f12081c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12082d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12083e;

    /* renamed from: f  reason: collision with root package name */
    public u f12084f;

    /* renamed from: g  reason: collision with root package name */
    public u f12085g;

    public u() {
        this.f12079a = new byte[8192];
        this.f12083e = true;
        this.f12082d = false;
    }

    public u(byte[] bArr, int i10, int i11) {
        this.f12079a = bArr;
        this.f12080b = i10;
        this.f12081c = i11;
        this.f12082d = true;
        this.f12083e = false;
    }

    @Nullable
    public final u a() {
        u uVar = this.f12084f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f12085g;
        uVar3.f12084f = uVar;
        this.f12084f.f12085g = uVar3;
        this.f12084f = null;
        this.f12085g = null;
        return uVar2;
    }

    public final void b(u uVar) {
        uVar.f12085g = this;
        uVar.f12084f = this.f12084f;
        this.f12084f.f12085g = uVar;
        this.f12084f = uVar;
    }

    public final u c() {
        this.f12082d = true;
        return new u(this.f12079a, this.f12080b, this.f12081c);
    }

    public final void d(u uVar, int i10) {
        if (uVar.f12083e) {
            int i11 = uVar.f12081c;
            if (i11 + i10 > 8192) {
                if (!uVar.f12082d) {
                    int i12 = uVar.f12080b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = uVar.f12079a;
                        System.arraycopy(bArr, i12, bArr, 0, i11 - i12);
                        uVar.f12081c -= uVar.f12080b;
                        uVar.f12080b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f12079a, this.f12080b, uVar.f12079a, uVar.f12081c, i10);
            uVar.f12081c += i10;
            this.f12080b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
