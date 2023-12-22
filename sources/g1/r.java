package g1;

import android.view.View;
import androidx.activity.f;
import com.ironsource.adapters.ironsource.a;
import java.util.ArrayList;
import java.util.HashMap;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6546a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f6547b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<k> f6548c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public r(View view) {
        this.f6547b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6547b == rVar.f6547b && this.f6546a.equals(rVar.f6546a);
    }

    public final int hashCode() {
        return this.f6546a.hashCode() + (this.f6547b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder g10 = f.g("TransitionValues@");
        g10.append(Integer.toHexString(hashCode()));
        g10.append(":\n");
        StringBuilder h10 = a.h(g10.toString(), "    view = ");
        h10.append(this.f6547b);
        h10.append("\n");
        String g11 = a.g(h10.toString(), "    values:");
        for (String str : this.f6546a.keySet()) {
            g11 = g11 + "    " + str + ": " + this.f6546a.get(str) + "\n";
        }
        return g11;
    }
}
