package x8;

import b9.b;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final l f13004a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f13005b = new b[0];

    static {
        l lVar = null;
        try {
            lVar = (l) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lVar == null) {
            lVar = new l();
        }
        f13004a = lVar;
    }
}
