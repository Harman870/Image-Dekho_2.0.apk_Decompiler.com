package p6;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import n6.b;
import n6.c;
import n6.d;
import n6.e;
import n6.g;

public final class f implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10697a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f10698b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f10699c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, n6.f<?>> f10700d;

    /* renamed from: e  reason: collision with root package name */
    public final d<Object> f10701e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10702f;

    public f(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, a aVar, boolean z9) {
        this.f10698b = new JsonWriter(bufferedWriter);
        this.f10699c = hashMap;
        this.f10700d = hashMap2;
        this.f10701e = aVar;
        this.f10702f = z9;
    }

    public final e a(c cVar, Object obj) {
        return g(obj, cVar.f10382a);
    }

    public final e b(c cVar, long j10) {
        String str = cVar.f10382a;
        h();
        this.f10698b.name(str);
        h();
        this.f10698b.value(j10);
        return this;
    }

    public final e c(c cVar, int i10) {
        String str = cVar.f10382a;
        h();
        this.f10698b.name(str);
        h();
        this.f10698b.value((long) i10);
        return this;
    }

    public final g d(String str) {
        h();
        this.f10698b.value(str);
        return this;
    }

    public final g e(boolean z9) {
        h();
        this.f10698b.value(z9);
        return this;
    }

    public final f f(Object obj) {
        if (obj == null) {
            this.f10698b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f10698b.value((Number) obj);
            return this;
        } else {
            int i10 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    h();
                    this.f10698b.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.f10698b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i10 < length) {
                        this.f10698b.value((long) iArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i10 < length2) {
                        long j10 = jArr[i10];
                        h();
                        this.f10698b.value(j10);
                        i10++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i10 < length3) {
                        this.f10698b.value(dArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i10 < length4) {
                        this.f10698b.value(zArr[i10]);
                        i10++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i10 < length5) {
                        f(numberArr[i10]);
                        i10++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i10 < length6) {
                        f(objArr[i10]);
                        i10++;
                    }
                }
                this.f10698b.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f10698b.beginArray();
                for (Object f10 : (Collection) obj) {
                    f(f10);
                }
                this.f10698b.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f10698b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        g(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                this.f10698b.endObject();
                return this;
            } else {
                d dVar = this.f10699c.get(obj.getClass());
                if (dVar != null) {
                    this.f10698b.beginObject();
                    dVar.a(obj, this);
                    this.f10698b.endObject();
                    return this;
                }
                n6.f fVar = this.f10700d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    h();
                    this.f10698b.value(name);
                    return this;
                } else {
                    d<Object> dVar2 = this.f10701e;
                    this.f10698b.beginObject();
                    dVar2.a(obj, this);
                    this.f10698b.endObject();
                    return this;
                }
            }
        }
    }

    public final f g(Object obj, String str) {
        if (!this.f10702f) {
            h();
            this.f10698b.name(str);
            if (obj != null) {
                return f(obj);
            }
            this.f10698b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            h();
            this.f10698b.name(str);
            return f(obj);
        }
    }

    public final void h() {
        if (!this.f10697a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
