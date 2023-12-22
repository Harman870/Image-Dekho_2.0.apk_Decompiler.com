package s6;

import androidx.activity.f;
import java.util.ArrayList;
import java.util.List;

public final class a extends k {

    /* renamed from: a  reason: collision with root package name */
    public final String f11881a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f11882b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f11881a = str;
            this.f11882b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final List<String> a() {
        return this.f11882b;
    }

    public final String b() {
        return this.f11881a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f11881a.equals(kVar.b()) && this.f11882b.equals(kVar.a());
    }

    public final int hashCode() {
        return ((this.f11881a.hashCode() ^ 1000003) * 1000003) ^ this.f11882b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("HeartBeatResult{userAgent=");
        g10.append(this.f11881a);
        g10.append(", usedDates=");
        g10.append(this.f11882b);
        g10.append("}");
        return g10.toString();
    }
}
