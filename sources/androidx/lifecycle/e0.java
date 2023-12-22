package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, b0> f1733a = new HashMap<>();

    public final void a() {
        for (b0 next : this.f1733a.values()) {
            HashMap hashMap = next.f1715a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object next2 : next.f1715a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet = next.f1716b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : next.f1716b) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                    }
                }
            }
            next.a();
        }
        this.f1733a.clear();
    }
}
