package e9;

import java.util.concurrent.CancellationException;
import x8.f;

public final class o0 extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f6256a;

    public o0(String str, Throwable th, n0 n0Var) {
        super(str);
        this.f6256a = n0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (!f.a(o0Var.getMessage(), getMessage()) || !f.a(o0Var.f6256a, this.f6256a) || !f.a(o0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        f.c(message);
        int hashCode = (this.f6256a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public final String toString() {
        return super.toString() + "; job=" + this.f6256a;
    }
}
