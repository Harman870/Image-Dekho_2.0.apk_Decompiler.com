package v6;

import com.google.android.gms.tasks.TaskCompletionSource;
import x6.a;

public final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final m f12638a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<j> f12639b;

    public h(m mVar, TaskCompletionSource<j> taskCompletionSource) {
        this.f12638a = mVar;
        this.f12639b = taskCompletionSource;
    }

    public final boolean a(a aVar) {
        boolean z9;
        String str;
        if (aVar.f() == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || this.f12638a.a(aVar)) {
            return false;
        }
        TaskCompletionSource<j> taskCompletionSource = this.f12639b;
        String str2 = aVar.f12972d;
        if (str2 != null) {
            Long valueOf = Long.valueOf(aVar.f12974f);
            Long valueOf2 = Long.valueOf(aVar.f12975g);
            if (valueOf == null) {
                str = " tokenExpirationTimestamp";
            } else {
                str = "";
            }
            if (valueOf2 == null) {
                str = com.ironsource.adapters.ironsource.a.g(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                taskCompletionSource.setResult(new a(str2, valueOf.longValue(), valueOf2.longValue()));
                return true;
            }
            throw new IllegalStateException(com.ironsource.adapters.ironsource.a.g("Missing required properties:", str));
        }
        throw new NullPointerException("Null token");
    }

    public final boolean b(Exception exc) {
        this.f12639b.trySetException(exc);
        return true;
    }
}
