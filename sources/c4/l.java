package c4;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import o3.f;
import y0.c;

public final class l implements AppSetIdClient {

    /* renamed from: a  reason: collision with root package name */
    public final k f2456a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2457b;

    public l(Context context) {
        h hVar;
        this.f2456a = new k(context, f.f10556b);
        synchronized (h.class) {
            if (context != null) {
                if (h.f2449d == null) {
                    h.f2449d = new h(context.getApplicationContext());
                }
                hVar = h.f2449d;
            } else {
                throw new NullPointerException("Context must not be null");
            }
        }
        this.f2457b = hVar;
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        return this.f2456a.getAppSetIdInfo().continueWithTask(new c((Object) this));
    }
}
