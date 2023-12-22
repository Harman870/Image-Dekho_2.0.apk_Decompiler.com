package e0;

import android.util.Base64;
import androidx.activity.e;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f6128a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6129b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6130c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f6131d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6132e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f6128a = str;
        str2.getClass();
        this.f6129b = str2;
        this.f6130c = str3;
        list.getClass();
        this.f6131d = list;
        this.f6132e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder g10 = androidx.activity.f.g("FontRequest {mProviderAuthority: ");
        g10.append(this.f6128a);
        g10.append(", mProviderPackage: ");
        g10.append(this.f6129b);
        g10.append(", mQuery: ");
        g10.append(this.f6130c);
        g10.append(", mCertificates:");
        sb.append(g10.toString());
        for (int i10 = 0; i10 < this.f6131d.size(); i10++) {
            sb.append(" [");
            List list = this.f6131d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return e.c(sb, "}", "mCertificatesArray: 0");
    }
}
