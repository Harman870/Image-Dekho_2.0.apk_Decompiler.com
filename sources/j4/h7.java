package j4;

public final class h7 implements m8 {

    /* renamed from: a  reason: collision with root package name */
    public static final h7 f8216a = new h7();

    public final l8 a(Class cls) {
        Class<m7> cls2 = m7.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (l8) m7.k(cls.asSubclass(cls2)).s(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean b(Class cls) {
        return m7.class.isAssignableFrom(cls);
    }
}
