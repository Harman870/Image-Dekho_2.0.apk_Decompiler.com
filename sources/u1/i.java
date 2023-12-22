package u1;

import android.text.TextUtils;
import androidx.activity.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f12120b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f12121c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f12122b;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<h>> f12123a = f12122b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f12122b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f12124a;

        public b(String str) {
            this.f12124a = str;
        }

        public final String a() {
            return this.f12124a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f12124a.equals(((b) obj).f12124a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12124a.hashCode();
        }

        public final String toString() {
            StringBuilder g10 = f.g("StringHeaderFactory{value='");
            g10.append(this.f12124a);
            g10.append('\'');
            g10.append('}');
            return g10.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.f12120b = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.f12121c == null) {
            synchronized (this) {
                if (this.f12121c == null) {
                    this.f12121c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f12121c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f12120b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = ((h) list.get(i10)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb.append(a10);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f12120b.equals(((i) obj).f12120b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12120b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("LazyHeaders{headers=");
        g10.append(this.f12120b);
        g10.append('}');
        return g10.toString();
    }
}
