package i4;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public final class k4 implements s3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7436a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7437b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7438c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f7439d;

    public /* synthetic */ k4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f7436a = obj;
        this.f7437b = obj2;
        this.f7438c = obj4;
        this.f7439d = obj3;
    }

    public final List a(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f7436a).get(new j4(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean b() {
        if (!((c9) this.f7439d).f7231a.isEmpty()) {
            return true;
        }
        return false;
    }
}
