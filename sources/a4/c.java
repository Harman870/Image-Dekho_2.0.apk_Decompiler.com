package a4;

import dalvik.system.PathClassLoader;

public final class c extends PathClassLoader {
    public c(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z9) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z9);
    }
}
