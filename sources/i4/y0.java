package i4;

public final class y0 implements a2 {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f7801a = new y0();

    public final z1 a(Class cls) {
        Class<c1> cls2 = c1.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (z1) c1.r(cls.asSubclass(cls2)).p(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean b(Class cls) {
        return c1.class.isAssignableFrom(cls);
    }
}
