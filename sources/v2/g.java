package v2;

import androidx.activity.f;
import java.util.List;

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f12487a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12488b;

    /* renamed from: c  reason: collision with root package name */
    public final k f12489c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f12490d;

    /* renamed from: e  reason: collision with root package name */
    public final String f12491e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f12492f;

    /* renamed from: g  reason: collision with root package name */
    public final p f12493g;

    public g() {
        throw null;
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f12487a = j10;
        this.f12488b = j11;
        this.f12489c = kVar;
        this.f12490d = num;
        this.f12491e = str;
        this.f12492f = list;
        this.f12493g = pVar;
    }

    public final k a() {
        return this.f12489c;
    }

    public final List<l> b() {
        return this.f12492f;
    }

    public final Integer c() {
        return this.f12490d;
    }

    public final String d() {
        return this.f12491e;
    }

    public final p e() {
        return this.f12493g;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12487a == mVar.f() && this.f12488b == mVar.g() && ((kVar = this.f12489c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.f12490d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f12491e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f12492f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f12493g;
            p e10 = mVar.e();
            if (pVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (pVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f12487a;
    }

    public final long g() {
        return this.f12488b;
    }

    public final int hashCode() {
        long j10 = this.f12487a;
        long j11 = this.f12488b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f12489c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f12490d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12491e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f12492f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f12493g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public final String toString() {
        StringBuilder g10 = f.g("LogRequest{requestTimeMs=");
        g10.append(this.f12487a);
        g10.append(", requestUptimeMs=");
        g10.append(this.f12488b);
        g10.append(", clientInfo=");
        g10.append(this.f12489c);
        g10.append(", logSource=");
        g10.append(this.f12490d);
        g10.append(", logSourceName=");
        g10.append(this.f12491e);
        g10.append(", logEvents=");
        g10.append(this.f12492f);
        g10.append(", qosTier=");
        g10.append(this.f12493g);
        g10.append("}");
        return g10.toString();
    }
}
