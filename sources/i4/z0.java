package i4;

import i4.c1;
import i4.z0;

public class z0<MessageType extends c1<MessageType, BuilderType>, BuilderType extends z0<MessageType, BuilderType>> extends s<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    public final c1 f7832a;

    /* renamed from: b  reason: collision with root package name */
    public c1 f7833b;

    public z0(MessageType messagetype) {
        this.f7832a = messagetype;
        if (!messagetype.n()) {
            this.f7833b = messagetype.s();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final void b(c1 c1Var) {
        if (!this.f7832a.equals(c1Var)) {
            if (!this.f7833b.n()) {
                c1 s10 = this.f7832a.s();
                j2.f7400c.a(s10.getClass()).c(s10, this.f7833b);
                this.f7833b = s10;
            }
            c1 c1Var2 = this.f7833b;
            j2.f7400c.a(c1Var2.getClass()).c(c1Var2, c1Var);
        }
    }

    public final Object clone() {
        z0 z0Var = (z0) this.f7832a.p(5);
        z0Var.f7833b = f();
        return z0Var;
    }

    public final MessageType d() {
        MessageType f10 = f();
        if (f10.m()) {
            return f10;
        }
        throw new w2();
    }

    public final MessageType f() {
        if (!this.f7833b.n()) {
            return this.f7833b;
        }
        this.f7833b.d();
        return this.f7833b;
    }

    public final void j() {
        if (!this.f7833b.n()) {
            c1 s10 = this.f7832a.s();
            j2.f7400c.a(s10.getClass()).c(s10, this.f7833b);
            this.f7833b = s10;
        }
    }
}
