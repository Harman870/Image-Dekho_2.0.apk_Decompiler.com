package n4;

import java.io.IOException;
import java.util.Map;
import r3.o;

public final class l3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final k3 f9908a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9909b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f9910c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f9911d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9912e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f9913f;

    public /* synthetic */ l3(String str, k3 k3Var, int i10, IOException iOException, byte[] bArr, Map map) {
        o.h(k3Var);
        this.f9908a = k3Var;
        this.f9909b = i10;
        this.f9910c = iOException;
        this.f9911d = bArr;
        this.f9912e = str;
        this.f9913f = map;
    }

    public final void run() {
        this.f9908a.b(this.f9912e, this.f9909b, this.f9910c, this.f9911d, this.f9913f);
    }
}
