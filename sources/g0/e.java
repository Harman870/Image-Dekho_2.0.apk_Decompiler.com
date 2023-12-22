package g0;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f6454a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6455b;

    public /* synthetic */ e() {
        this.f6455b = new int[10];
    }

    public /* synthetic */ e(int i10) {
        if (i10 > 0) {
            this.f6455b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(Object obj) {
        int i10;
        boolean z9;
        int i11 = 0;
        while (true) {
            i10 = this.f6454a;
            if (i11 >= i10) {
                z9 = false;
                break;
            } else if (((Object[]) this.f6455b)[i11] == obj) {
                z9 = true;
                break;
            } else {
                i11++;
            }
        }
        if (!z9) {
            Object obj2 = this.f6455b;
            if (i10 >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i10] = obj;
            this.f6454a = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public Object b() {
        int i10 = this.f6454a;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f6455b;
        Object obj2 = ((Object[]) obj)[i11];
        ((Object[]) obj)[i11] = null;
        this.f6454a = i10 - 1;
        return obj2;
    }

    public final int c() {
        if ((this.f6454a & 128) != 0) {
            return ((int[]) this.f6455b)[7];
        }
        return 65535;
    }

    public final void d(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = (int[]) this.f6455b;
            if (i10 < iArr.length) {
                this.f6454a = (1 << i10) | this.f6454a;
                iArr[i10] = i11;
            }
        }
    }
}
