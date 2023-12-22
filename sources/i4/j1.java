package i4;

import java.io.Serializable;

public enum j1 {
    VOID(Void.class, (int) null),
    INT(r0, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(e0.class, e0.f7269b),
    ENUM(r0, (int) null),
    MESSAGE(Object.class, (int) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f7399a;

    /* access modifiers changed from: public */
    j1(Class cls, Serializable serializable) {
        this.f7399a = serializable;
    }
}
