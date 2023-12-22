package d1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j.b;
import x8.f;

@SuppressLint({"RestrictedApi"})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final j.b<String, C0076b> f6037a = new j.b<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f6038b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f6039c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6040d;

    public interface a {
        void a(d dVar);
    }

    /* renamed from: d1.b$b  reason: collision with other inner class name */
    public interface C0076b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f6040d) {
            Bundle bundle = this.f6039c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f6039c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f6039c;
            boolean z9 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z9 = true;
            }
            if (!z9) {
                this.f6039c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void b(String str, C0076b bVar) {
        V v10;
        f.f(bVar, IronSourceConstants.EVENTS_PROVIDER);
        j.b<String, C0076b> bVar2 = this.f6037a;
        b.c<String, C0076b> a10 = bVar2.a(str);
        boolean z9 = true;
        if (a10 != null) {
            v10 = a10.f7992b;
        } else {
            b.c<K, V> cVar = new b.c<>(str, bVar);
            bVar2.f7990d++;
            b.c<K, V> cVar2 = bVar2.f7988b;
            if (cVar2 == null) {
                bVar2.f7987a = cVar;
            } else {
                cVar2.f7993c = cVar;
                cVar.f7994d = cVar2;
            }
            bVar2.f7988b = cVar;
            v10 = null;
        }
        if (((C0076b) v10) != null) {
            z9 = false;
        }
        if (!z9) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }
}
