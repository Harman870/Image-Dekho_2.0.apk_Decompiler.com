package i4;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

public final class pd extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ qd f7595a;

    public pd(qd qdVar) {
        this.f7595a = qdVar;
    }

    public final Object initialValue() {
        try {
            Mac mac = (Mac) kd.f7451f.a(this.f7595a.f7620b);
            mac.init(this.f7595a.f7621c);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
