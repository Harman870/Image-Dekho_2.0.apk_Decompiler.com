package e9;

import q8.f;

public final class x extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final f f6274a;

    public x(f fVar) {
        this.f6274a = fVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f6274a.toString();
    }
}
