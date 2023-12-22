package u9;

import j9.a0;
import j9.d;
import j9.q;
import j9.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import u9.c;
import u9.f;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f12251a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f12252b;

    /* renamed from: c  reason: collision with root package name */
    public final q f12253c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f12254d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f12255e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12256f;

    public d0(u uVar, q qVar, List list, List list2) {
        this.f12252b = uVar;
        this.f12253c = qVar;
        this.f12254d = list;
        this.f12255e = list2;
        this.f12256f = false;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f12255e.indexOf((Object) null) + 1;
        int size = this.f12255e.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            c<?, ?> a10 = this.f12255e.get(i10).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12255e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f12255e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final e0<?> b(Method method) {
        e0<?> e0Var;
        e0<?> e0Var2 = (e0) this.f12251a.get(method);
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (this.f12251a) {
            e0Var = (e0) this.f12251a.get(method);
            if (e0Var == null) {
                e0Var = e0.b(this, method);
                this.f12251a.put(method, e0Var);
            }
        }
        return e0Var;
    }

    public final <T> f<T, a0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f12254d.indexOf((Object) null) + 1;
        int size = this.f12254d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<T, a0> a10 = this.f12254d.get(i10).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12254d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f12254d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<j9.d0, T> d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f12254d.indexOf((Object) null) + 1;
        int size = this.f12254d.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            f<j9.d0, ?> b10 = this.f12254d.get(i10).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f12254d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f12254d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f12254d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12254d.get(i10).getClass();
        }
    }
}
