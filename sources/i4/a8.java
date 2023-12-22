package i4;

import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class a8 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7184a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7185b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7186c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7187d;

    public a8() {
        this.f7184a = new HashMap();
        this.f7185b = new HashMap();
        this.f7186c = new HashMap();
        this.f7187d = new HashMap();
    }

    public a8(d8 d8Var) {
        this.f7184a = new HashMap(d8Var.f7253a);
        this.f7185b = new HashMap(d8Var.f7254b);
        this.f7186c = new HashMap(d8Var.f7255c);
        this.f7187d = new HashMap(d8Var.f7256d);
    }

    public final void a(d7 d7Var) {
        b8 b8Var = new b8(d7Var.f7308b, d7Var.f7307a);
        if (this.f7185b.containsKey(b8Var)) {
            f7 f7Var = (f7) this.f7185b.get(b8Var);
            if (!f7Var.equals(d7Var) || !d7Var.equals(f7Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(b8Var.toString()));
            }
            return;
        }
        this.f7185b.put(b8Var, d7Var);
    }

    public final void b(g7 g7Var) {
        c8 c8Var = new c8(g7Var.f7359a, g7Var.f7360b);
        if (this.f7184a.containsKey(c8Var)) {
            h7 h7Var = (h7) this.f7184a.get(c8Var);
            if (!h7Var.equals(g7Var) || !g7Var.equals(h7Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c8Var.toString()));
            }
            return;
        }
        this.f7184a.put(c8Var, g7Var);
    }

    public final void c(s7 s7Var) {
        b8 b8Var = new b8(s7Var.f7682b, s7Var.f7681a);
        if (this.f7187d.containsKey(b8Var)) {
            t7 t7Var = (t7) this.f7187d.get(b8Var);
            if (!t7Var.equals(s7Var) || !s7Var.equals(t7Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(b8Var.toString()));
            }
            return;
        }
        this.f7187d.put(b8Var, s7Var);
    }

    public final void d(u7 u7Var) {
        c8 c8Var = new c8(u7Var.f7741a, u7Var.f7742b);
        if (this.f7186c.containsKey(c8Var)) {
            v7 v7Var = (v7) this.f7186c.get(c8Var);
            if (!v7Var.equals(u7Var) || !u7Var.equals(v7Var)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(c8Var.toString()));
            }
            return;
        }
        this.f7186c.put(c8Var, u7Var);
    }
}
