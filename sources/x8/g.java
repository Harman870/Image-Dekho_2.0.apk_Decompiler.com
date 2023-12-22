package x8;

import java.io.Serializable;

public abstract class g<R> implements e<R>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final int f13002b;

    public g(int i10) {
        this.f13002b = i10;
    }

    public int getArity() {
        return this.f13002b;
    }

    public String toString() {
        k.f13004a.getClass();
        String a10 = l.a(this);
        f.e(a10, "renderLambdaToString(this)");
        return a10;
    }
}
