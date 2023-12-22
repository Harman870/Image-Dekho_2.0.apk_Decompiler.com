package n9;

import j9.d0;
import j9.s;
import javax.annotation.Nullable;
import t9.t;

public final class g extends d0 {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f10399b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10400c;

    /* renamed from: d  reason: collision with root package name */
    public final t9.g f10401d;

    public g(@Nullable String str, long j10, t tVar) {
        this.f10399b = str;
        this.f10400c = j10;
        this.f10401d = tVar;
    }

    public final long a() {
        return this.f10400c;
    }

    public final s c() {
        String str = this.f10399b;
        if (str == null) {
            return null;
        }
        try {
            return s.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final t9.g j() {
        return this.f10401d;
    }
}
