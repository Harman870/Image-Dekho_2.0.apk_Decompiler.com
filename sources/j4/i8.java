package j4;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class i8 extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    public static final i8 f8239b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8240a = true;

    static {
        i8 i8Var = new i8();
        f8239b = i8Var;
        i8Var.f8240a = false;
    }

    public i8() {
    }

    public i8(Map map) {
        super(map);
    }

    public static i8 b() {
        return f8239b;
    }

    public final i8 c() {
        return isEmpty() ? new i8() : new i8(this);
    }

    public final void clear() {
        f();
        super.clear();
    }

    public final void d() {
        this.f8240a = false;
    }

    public final boolean e() {
        return this.f8240a;
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
        if (!this.f8240a) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i12 = 1;
            if (key instanceof byte[]) {
                Charset charset = s7.f8462a;
                i10 = r5;
                for (byte b10 : (byte[]) key) {
                    i10 = (i10 * 31) + b10;
                }
                if (i10 == 0) {
                    i10 = 1;
                }
            } else {
                i10 = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Charset charset2 = s7.f8462a;
                int i13 = r4;
                for (byte b11 : (byte[]) value) {
                    i13 = (i13 * 31) + b11;
                }
                if (i13 != 0) {
                    i12 = i13;
                }
            } else {
                i12 = value.hashCode();
            }
            i11 += i12 ^ i10;
        }
        return i11;
    }

    public final Object put(Object obj, Object obj2) {
        f();
        Charset charset = s7.f8462a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        f();
        for (Object next : map.keySet()) {
            Charset charset = s7.f8462a;
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
