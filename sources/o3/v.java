package o3;

import java.lang.ref.WeakReference;

public abstract class v extends t {

    /* renamed from: e  reason: collision with root package name */
    public static final WeakReference f10579e = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    public WeakReference f10580d = f10579e;

    public v(byte[] bArr) {
        super(bArr);
    }

    public final byte[] F() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f10580d.get();
            if (bArr == null) {
                bArr = G();
                this.f10580d = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] G();
}
