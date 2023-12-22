package j4;

import java.io.Serializable;

public enum v7 {
    VOID(Void.class, (int) null),
    INT(r0, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(q6.class, q6.f8402b),
    ENUM(r0, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f8520a;

    /* access modifiers changed from: public */
    v7(Class cls, Serializable serializable) {
        this.f8520a = serializable;
    }
}
