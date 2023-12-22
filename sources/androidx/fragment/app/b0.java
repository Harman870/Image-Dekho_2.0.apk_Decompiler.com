package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import java.util.HashMap;
import java.util.Iterator;

public final class b0 extends androidx.lifecycle.b0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f1435i = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, o> f1436c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, b0> f1437d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, e0> f1438e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1439f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1440g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1441h = false;

    public class a implements d0.a {
        public final <T extends androidx.lifecycle.b0> T a(Class<T> cls) {
            return new b0(true);
        }
    }

    public b0(boolean z9) {
        this.f1439f = z9;
    }

    public final void a() {
        if (y.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1440g = true;
    }

    public final void b(o oVar) {
        if (y.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        c(oVar.f1567f);
    }

    public final void c(String str) {
        b0 b0Var = this.f1437d.get(str);
        if (b0Var != null) {
            b0Var.a();
            this.f1437d.remove(str);
        }
        e0 e0Var = this.f1438e.get(str);
        if (e0Var != null) {
            e0Var.a();
            this.f1438e.remove(str);
        }
    }

    public final void d(o oVar) {
        if (!this.f1441h) {
            if ((this.f1436c.remove(oVar.f1567f) != null) && y.I(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
            }
        } else if (y.I(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f1436c.equals(b0Var.f1436c) && this.f1437d.equals(b0Var.f1437d) && this.f1438e.equals(b0Var.f1438e);
    }

    public final int hashCode() {
        int hashCode = this.f1437d.hashCode();
        return this.f1438e.hashCode() + ((hashCode + (this.f1436c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<o> it = this.f1436c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1437d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1438e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
