package j3;

import i3.n;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8033a = new HashMap();

    public final HashMap a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8033a.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    public final void b(String str, String str2) {
        if (str != null) {
            this.f8033a.put(str, str2);
            return;
        }
        throw new NullPointerException("Name should be non-null");
    }

    public final String toString() {
        return n.zzb(this.f8033a);
    }
}
