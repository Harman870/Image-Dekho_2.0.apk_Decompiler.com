package v2;

import androidx.activity.f;
import java.util.ArrayList;
import java.util.List;

public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f12470a;

    public d(ArrayList arrayList) {
        this.f12470a = arrayList;
    }

    public final List<m> a() {
        return this.f12470a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f12470a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12470a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder g10 = f.g("BatchedLogRequest{logRequests=");
        g10.append(this.f12470a);
        g10.append("}");
        return g10.toString();
    }
}
