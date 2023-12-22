package n4;

import java.util.HashSet;

public final class b extends q7 {

    /* renamed from: d  reason: collision with root package name */
    public String f9619d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet f9620e;

    /* renamed from: f  reason: collision with root package name */
    public m.b f9621f;

    /* renamed from: g  reason: collision with root package name */
    public Long f9622g;

    /* renamed from: h  reason: collision with root package name */
    public Long f9623h;

    public b(w7 w7Var) {
        super(w7Var);
    }

    public final void j() {
    }

    public final j8 k(Integer num) {
        if (this.f9621f.containsKey(num)) {
            return (j8) this.f9621f.getOrDefault(num, null);
        }
        j8 j8Var = new j8(this, this.f9619d);
        this.f9621f.put(num, j8Var);
        return j8Var;
    }
}
