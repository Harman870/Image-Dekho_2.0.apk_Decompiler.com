package j3;

import i3.n;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8034a = new HashMap();

    public b(String str) {
        a("&pa", str);
    }

    public final void a(String str, String str2) {
        this.f8034a.put(str, str2);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8034a.entrySet()) {
            hashMap.put(((String) entry.getKey()).startsWith("&") ? ((String) entry.getKey()).substring(1) : (String) entry.getKey(), (String) entry.getValue());
        }
        return n.zzb(hashMap);
    }
}
