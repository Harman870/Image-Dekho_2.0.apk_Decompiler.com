package j9;

import com.ironsource.adapters.ironsource.a;
import java.io.IOException;

public enum v {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f9007a;

    /* access modifiers changed from: public */
    v(String str) {
        this.f9007a = str;
    }

    public static v a(String str) {
        v vVar = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return vVar;
        }
        v vVar2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return vVar2;
        }
        v vVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return vVar3;
        }
        v vVar4 = HTTP_2;
        if (str.equals("h2")) {
            return vVar4;
        }
        v vVar5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return vVar5;
        }
        v vVar6 = QUIC;
        if (str.equals("quic")) {
            return vVar6;
        }
        throw new IOException(a.g("Unexpected protocol: ", str));
    }

    public final String toString() {
        return this.f9007a;
    }
}
