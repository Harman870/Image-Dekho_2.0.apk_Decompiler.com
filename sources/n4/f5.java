package n4;

import android.os.Bundle;
import java.util.EnumMap;

public final class f5 {

    /* renamed from: c  reason: collision with root package name */
    public static final f5 f9743c = new f5((Boolean) null, (Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f9744a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9745b;

    public f5(Boolean bool, Boolean bool2, int i10) {
        EnumMap enumMap = new EnumMap(e5.class);
        this.f9744a = enumMap;
        enumMap.put(e5.AD_STORAGE, bool);
        enumMap.put(e5.ANALYTICS_STORAGE, bool2);
        this.f9745b = i10;
    }

    public f5(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(e5.class);
        this.f9744a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9745b = i10;
    }

    public static f5 a(int i10, Bundle bundle) {
        Boolean bool;
        if (bundle == null) {
            return new f5((Boolean) null, (Boolean) null, i10);
        }
        EnumMap enumMap = new EnumMap(e5.class);
        for (e5 e5Var : e5.values()) {
            String string = bundle.getString(e5Var.f9721a);
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                enumMap.put(e5Var, bool);
            }
            bool = null;
            enumMap.put(e5Var, bool);
        }
        return new f5(enumMap, i10);
    }

    public static f5 b(int i10, String str) {
        EnumMap enumMap = new EnumMap(e5.class);
        if (str != null) {
            int i11 = 0;
            while (true) {
                e5[] e5VarArr = e5.f9719d;
                if (i11 >= 2) {
                    break;
                }
                e5 e5Var = e5VarArr[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    char charAt = str.charAt(i12);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(e5Var, bool);
                }
                i11++;
            }
        }
        return new f5(enumMap, i10);
    }

    public final f5 c(f5 f5Var) {
        EnumMap enumMap = new EnumMap(e5.class);
        for (e5 e5Var : e5.values()) {
            Boolean bool = (Boolean) this.f9744a.get(e5Var);
            Boolean bool2 = (Boolean) f5Var.f9744a.get(e5Var);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(e5Var, bool);
        }
        return new f5(enumMap, 100);
    }

    public final f5 d(f5 f5Var) {
        EnumMap enumMap = new EnumMap(e5.class);
        for (e5 e5Var : e5.values()) {
            Boolean bool = (Boolean) this.f9744a.get(e5Var);
            if (bool == null) {
                bool = (Boolean) f5Var.f9744a.get(e5Var);
            }
            enumMap.put(e5Var, bool);
        }
        return new f5(enumMap, this.f9745b);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("G1");
        e5[] e5VarArr = e5.f9719d;
        for (int i10 = 0; i10 < 2; i10++) {
            Boolean bool = (Boolean) this.f9744a.get(e5VarArr[i10]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        e5[] values = e5.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                e5 e5Var = values[i10];
                Boolean bool = (Boolean) this.f9744a.get(e5Var);
                if (bool == null) {
                    z9 = false;
                } else if (bool.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                Boolean bool2 = (Boolean) f5Var.f9744a.get(e5Var);
                if (bool2 == null) {
                    z10 = false;
                } else if (!bool2.booleanValue()) {
                    z10 = true;
                }
                if (z9 != z10) {
                    return false;
                }
                i10++;
            } else if (this.f9745b == f5Var.f9745b) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final boolean f(e5 e5Var) {
        Boolean bool = (Boolean) this.f9744a.get(e5Var);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(f5 f5Var, e5... e5VarArr) {
        for (e5 e5Var : e5VarArr) {
            Boolean bool = (Boolean) this.f9744a.get(e5Var);
            Boolean bool2 = (Boolean) f5Var.f9744a.get(e5Var);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9745b * 17;
        for (Boolean bool : this.f9744a.values()) {
            i10 = (i10 * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.f9745b);
        for (e5 e5Var : e5.values()) {
            sb.append(", ");
            sb.append(e5Var.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f9744a.get(e5Var);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
