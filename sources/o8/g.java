package o8;

import java.io.Serializable;
import w8.a;
import x8.f;
import z5.c;

public final class g<T> implements c<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a<? extends T> f10607a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10608b = c.f13185i;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10609c = this;

    public g(a aVar) {
        f.f(aVar, "initializer");
        this.f10607a = aVar;
    }

    public final T getValue() {
        T t10;
        T t11 = this.f10608b;
        T t12 = c.f13185i;
        if (t11 != t12) {
            return t11;
        }
        synchronized (this.f10609c) {
            t10 = this.f10608b;
            if (t10 == t12) {
                a aVar = this.f10607a;
                f.c(aVar);
                t10 = aVar.invoke();
                this.f10608b = t10;
                this.f10607a = null;
            }
        }
        return t10;
    }

    public final String toString() {
        boolean z9;
        if (this.f10608b != c.f13185i) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
