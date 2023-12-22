package j3;

import i3.n;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8035a = new HashMap();

    public final HashMap a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8035a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    public final void b(String str, String str2) {
        this.f8035a.put(str, str2);
    }

    public final String toString() {
        return n.zzb(this.f8035a);
    }
}
