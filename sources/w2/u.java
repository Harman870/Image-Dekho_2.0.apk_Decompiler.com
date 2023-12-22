package w2;

import a7.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import c7.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import d3.x;
import l2.d;
import t2.b;

public final /* synthetic */ class u implements x.a, f.a, Continuation, d.c {
    public final Object apply(Object obj) {
        b bVar = x.f6090f;
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }

    public final String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public final void c(d dVar) {
        dVar.dismiss();
    }

    public final Object then(Task task) {
        Object obj = l.f172c;
        return 403;
    }
}
