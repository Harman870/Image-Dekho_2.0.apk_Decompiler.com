package j4;

import javax.annotation.CheckForNull;

public final class h5 extends i5 {

    /* renamed from: a  reason: collision with root package name */
    public static final h5 f8214a = new h5();

    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
