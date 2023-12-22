package z6;

import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.util.Arrays;
import r3.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f13230a;

    public b(String str) {
        this.f13230a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return m.a(this.f13230a, ((b) obj).f13230a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13230a});
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f13230a, IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
        return aVar.toString();
    }
}
