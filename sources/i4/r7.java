package i4;

import java.util.concurrent.atomic.AtomicReference;

public final class r7 {

    /* renamed from: b  reason: collision with root package name */
    public static final r7 f7638b = new r7();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f7639a = new AtomicReference(new d8(new a8()));

    public final synchronized void a(d7 d7Var) {
        a8 a8Var = new a8((d8) this.f7639a.get());
        a8Var.a(d7Var);
        this.f7639a.set(new d8(a8Var));
    }

    public final synchronized void b(g7 g7Var) {
        a8 a8Var = new a8((d8) this.f7639a.get());
        a8Var.b(g7Var);
        this.f7639a.set(new d8(a8Var));
    }

    public final synchronized void c(s7 s7Var) {
        a8 a8Var = new a8((d8) this.f7639a.get());
        a8Var.c(s7Var);
        this.f7639a.set(new d8(a8Var));
    }

    public final synchronized void d(u7 u7Var) {
        a8 a8Var = new a8((d8) this.f7639a.get());
        a8Var.d(u7Var);
        this.f7639a.set(new d8(a8Var));
    }
}
