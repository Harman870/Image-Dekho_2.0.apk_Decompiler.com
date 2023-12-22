package d;

import android.content.Context;
import android.os.Parcel;
import c4.c;
import c4.e;
import com.google.android.gms.appset.zza;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Map;
import n4.k3;
import n4.w7;
import p3.a;
import q3.j;
import y2.b;

public final class u implements b, j, k3 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5966a;

    public u() {
        this.f5966a = new ArrayList();
    }

    public final void a(a.e eVar, TaskCompletionSource taskCompletionSource) {
        e eVar2 = (e) ((c) eVar).v();
        zza zza = new zza((String) null, (String) null);
        c4.j jVar = new c4.j(taskCompletionSource);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(eVar2.f2445b);
        int i10 = c4.b.f2443a;
        obtain.writeInt(1);
        zza.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(jVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            eVar2.f2444a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public final void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((w7) this.f5966a).l(str, i10, th, bArr, map);
    }

    public final Object get() {
        String packageName = ((Context) ((n8.a) this.f5966a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ u(Object obj) {
        this.f5966a = obj;
    }
}
