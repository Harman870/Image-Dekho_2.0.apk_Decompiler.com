package m;

import androidx.lifecycle.c0;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f9295d;

    /* renamed from: e  reason: collision with root package name */
    public static int f9296e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f9297f;

    /* renamed from: g  reason: collision with root package name */
    public static int f9298g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f9299a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f9300b;

    /* renamed from: c  reason: collision with root package name */
    public int f9301c;

    public h() {
        this.f9299a = c0.f1721e;
        this.f9300b = c0.f1722f;
        this.f9301c = 0;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f9299a = c0.f1721e;
            this.f9300b = c0.f1722f;
        } else {
            a(i10);
        }
        this.f9301c = 0;
    }

    private void a(int i10) {
        Class<h> cls = h.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = f9297f;
                if (objArr != null) {
                    this.f9300b = objArr;
                    f9297f = (Object[]) objArr[0];
                    this.f9299a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f9298g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f9295d;
                if (objArr2 != null) {
                    this.f9300b = objArr2;
                    f9295d = (Object[]) objArr2[0];
                    this.f9299a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f9296e--;
                    return;
                }
            }
        }
        this.f9299a = new int[i10];
        this.f9300b = new Object[(i10 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f9298g < 10) {
                    objArr[0] = f9297f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f9297f = objArr;
                    f9298g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f9296e < 10) {
                    objArr[0] = f9295d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f9295d = objArr;
                    f9296e++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.f9301c;
        int[] iArr = this.f9299a;
        if (iArr.length < i10) {
            Object[] objArr = this.f9300b;
            a(i10);
            if (this.f9301c > 0) {
                System.arraycopy(iArr, 0, this.f9299a, 0, i11);
                System.arraycopy(objArr, 0, this.f9300b, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f9301c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f9301c;
        if (i10 > 0) {
            int[] iArr = this.f9299a;
            Object[] objArr = this.f9300b;
            this.f9299a = c0.f1721e;
            this.f9300b = c0.f1722f;
            this.f9301c = 0;
            c(iArr, objArr, i10);
        }
        if (this.f9301c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f9301c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int c10 = c0.c(i11, i10, this.f9299a);
            if (c10 < 0 || obj.equals(this.f9300b[c10 << 1])) {
                return c10;
            }
            int i12 = c10 + 1;
            while (i12 < i11 && this.f9299a[i12] == i10) {
                if (obj.equals(this.f9300b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            int i13 = c10 - 1;
            while (i13 >= 0 && this.f9299a[i13] == i10) {
                if (obj.equals(this.f9300b[i13 << 1])) {
                    return i13;
                }
                i13--;
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f9301c != hVar.f9301c) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f9301c) {
                try {
                    Object h10 = h(i10);
                    Object l6 = l(i10);
                    Object orDefault = hVar.getOrDefault(h10, (Object) null);
                    if (l6 == null) {
                        if (orDefault != null || !hVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l6.equals(orDefault)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f9301c != map.size()) {
                return false;
            }
            int i11 = 0;
            while (i11 < this.f9301c) {
                try {
                    Object h11 = h(i11);
                    Object l10 = l(i11);
                    Object obj2 = map.get(h11);
                    if (l10 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l10.equals(obj2)) {
                        return false;
                    }
                    i11++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f9301c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int c10 = c0.c(i10, 0, this.f9299a);
            if (c10 < 0 || this.f9300b[c10 << 1] == null) {
                return c10;
            }
            int i11 = c10 + 1;
            while (i11 < i10 && this.f9299a[i11] == 0) {
                if (this.f9300b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            int i12 = c10 - 1;
            while (i12 >= 0 && this.f9299a[i12] == 0) {
                if (this.f9300b[i12 << 1] == null) {
                    return i12;
                }
                i12--;
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public final int g(Object obj) {
        int i10 = this.f9301c * 2;
        Object[] objArr = this.f9300b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int e10 = e(obj);
        return e10 >= 0 ? this.f9300b[(e10 << 1) + 1] : v10;
    }

    public final K h(int i10) {
        return this.f9300b[i10 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f9299a;
        Object[] objArr = this.f9300b;
        int i10 = this.f9301c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(b bVar) {
        int i10 = bVar.f9301c;
        b(this.f9301c + i10);
        if (this.f9301c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(bVar.h(i11), bVar.l(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.f9299a, 0, this.f9299a, 0, i10);
            System.arraycopy(bVar.f9300b, 0, this.f9300b, 0, i10 << 1);
            this.f9301c = i10;
        }
    }

    public final boolean isEmpty() {
        return this.f9301c <= 0;
    }

    public V j(int i10) {
        V[] vArr = this.f9300b;
        int i11 = i10 << 1;
        V v10 = vArr[i11 + 1];
        int i12 = this.f9301c;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f9299a, vArr, i12);
            this.f9299a = c0.f1721e;
            this.f9300b = c0.f1722f;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f9299a;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f9300b;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f9300b;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f9301c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f9299a, 0, i10);
                        System.arraycopy(vArr, 0, this.f9300b, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f9299a, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f9300b, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f9301c) {
            this.f9301c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f9300b;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public final V l(int i10) {
        return this.f9300b[(i10 << 1) + 1];
    }

    public V put(K k, V v10) {
        int i10;
        int i11;
        int i12 = this.f9301c;
        if (k == null) {
            i11 = f();
            i10 = 0;
        } else {
            int hashCode = k.hashCode();
            i10 = hashCode;
            i11 = d(hashCode, k);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f9300b;
            V v11 = vArr[i13];
            vArr[i13] = v10;
            return v11;
        }
        int i14 = ~i11;
        int[] iArr = this.f9299a;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f9300b;
            a(i15);
            if (i12 == this.f9301c) {
                int[] iArr2 = this.f9299a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f9300b, 0, objArr.length);
                }
                c(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f9299a;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f9300b;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f9301c - i14) << 1);
        }
        int i17 = this.f9301c;
        if (i12 == i17) {
            int[] iArr4 = this.f9299a;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f9300b;
                int i18 = i14 << 1;
                objArr3[i18] = k;
                objArr3[i18 + 1] = v10;
                this.f9301c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v10) {
        V orDefault = getOrDefault(k, (Object) null);
        if (orDefault == null) {
            return put(k, v10);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0) {
            return false;
        }
        Object l6 = l(e10);
        if (obj2 != l6 && (obj2 == null || !obj2.equals(l6))) {
            return false;
        }
        j(e10);
        return true;
    }

    public final V replace(K k, V v10) {
        int e10 = e(k);
        if (e10 >= 0) {
            return k(e10, v10);
        }
        return null;
    }

    public final boolean replace(K k, V v10, V v11) {
        int e10 = e(k);
        if (e10 < 0) {
            return false;
        }
        V l6 = l(e10);
        if (l6 != v10 && (v10 == null || !v10.equals(l6))) {
            return false;
        }
        k(e10, v11);
        return true;
    }

    public final int size() {
        return this.f9301c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9301c * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f9301c; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object h10 = h(i10);
            if (h10 != this) {
                sb.append(h10);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l6 = l(i10);
            if (l6 != this) {
                sb.append(l6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
