package z5;

import android.content.Context;
import android.os.Bundle;
import b6.b;
import b6.k;
import b6.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import y3.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final r f13213a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13214b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f13215c;

    /* renamed from: d  reason: collision with root package name */
    public final b f13216d;

    public l(Context context, r rVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13215c = taskCompletionSource;
        this.f13214b = context.getPackageName();
        this.f13213a = rVar;
        b bVar = new b(context, rVar, m.f13217a);
        this.f13216d = bVar;
        bVar.a().post(new e(this, taskCompletionSource, context));
    }

    public static Bundle a(l lVar, String str, long j10, long j11) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", lVar.f13214b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(a.b(arrayList)));
        return bundle;
    }

    public static Bundle b(l lVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", lVar.f13214b);
        bundle.putLong("cloud.prj", j10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new k(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(a.b(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean c(l lVar) {
        return lVar.f13215c.getTask().isSuccessful() && !((Boolean) lVar.f13215c.getTask().getResult()).booleanValue();
    }
}
