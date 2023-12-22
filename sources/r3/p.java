package r3;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static p f11617b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f11618c = new q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public q f11619a;

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (f11617b == null) {
                f11617b = new p();
            }
            pVar = f11617b;
        }
        return pVar;
    }
}
