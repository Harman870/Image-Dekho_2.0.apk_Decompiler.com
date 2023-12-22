package t9;

import javax.annotation.Nullable;

public final class v {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static u f12086a;

    /* renamed from: b  reason: collision with root package name */
    public static long f12087b;

    public static void a(u uVar) {
        if (uVar.f12084f != null || uVar.f12085g != null) {
            throw new IllegalArgumentException();
        } else if (!uVar.f12082d) {
            synchronized (v.class) {
                long j10 = f12087b + 8192;
                if (j10 <= 65536) {
                    f12087b = j10;
                    uVar.f12084f = f12086a;
                    uVar.f12081c = 0;
                    uVar.f12080b = 0;
                    f12086a = uVar;
                }
            }
        }
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = f12086a;
            if (uVar == null) {
                return new u();
            }
            f12086a = uVar.f12084f;
            uVar.f12084f = null;
            f12087b -= 8192;
            return uVar;
        }
    }
}
