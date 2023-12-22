package i4;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class w1 extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    public static final w1 f7755b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7756a = true;

    static {
        w1 w1Var = new w1();
        f7755b = w1Var;
        w1Var.f7756a = false;
    }

    public w1() {
    }

    public w1(Map map) {
        super(map);
    }

    public static w1 b() {
        return f7755b;
    }

    public static int e(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        Charset charset = g1.f7324a;
        int i10 = r0;
        for (byte b10 : (byte[]) obj) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final w1 c() {
        return isEmpty() ? new w1() : new w1(this);
    }

    public final void clear() {
        f();
        super.clear();
    }

    public final void d() {
        this.f7756a = false;
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z9 = value.equals(obj2);
                continue;
            } else {
                z9 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z9) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (!this.f7756a) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += e(entry.getValue()) ^ e(entry.getKey());
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        f();
        Charset charset = g1.f7324a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        f();
        for (Object next : map.keySet()) {
            Charset charset = g1.f7324a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        f();
        return super.remove(obj);
    }
}
