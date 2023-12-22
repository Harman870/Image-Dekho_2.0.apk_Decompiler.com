package c4;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d.u;
import o3.d;
import o3.f;
import p3.a;
import p3.b;
import p3.c;
import q3.l;
import q3.l0;

public final class k extends c<a.c.C0127c> implements AppSetIdClient {

    /* renamed from: m  reason: collision with root package name */
    public static final a<a.c.C0127c> f2454m = new a<>("AppSet.API", new i(), new a.f());
    public final Context k;

    /* renamed from: l  reason: collision with root package name */
    public final f f2455l;

    public k(Context context, f fVar) {
        super(context, f2454m, a.c.f10659m0, c.a.f10671c);
        this.k = context;
        this.f2455l = fVar;
    }

    public final Task<AppSetIdInfo> getAppSetIdInfo() {
        if (this.f2455l.b(this.k, 212800000) != 0) {
            return Tasks.forException(new b(new Status(17, (String) null)));
        }
        l.a aVar = new l.a();
        aVar.f11256c = new d[]{zze.zza};
        aVar.f11254a = new u(this);
        aVar.f11255b = false;
        aVar.f11257d = 27601;
        return b(0, new l0(aVar, aVar.f11256c, aVar.f11255b, aVar.f11257d));
    }
}
