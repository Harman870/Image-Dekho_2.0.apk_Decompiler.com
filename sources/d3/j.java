package d3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import c7.f;
import com.wallpapersindia.app.pro.MainActivityPro;
import d3.x;
import java.util.List;
import l2.d;

public final /* synthetic */ class j implements x.a, f.a, d.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6064a;

    public /* synthetic */ j(int i10) {
        this.f6064a = i10;
    }

    public final Object apply(Object obj) {
        switch (this.f6064a) {
            case 0:
                return (List) x.E(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new s(0));
            default:
                Cursor cursor = (Cursor) obj;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
        }
    }

    public final String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public final void c(d dVar) {
        int i10 = MainActivityPro.K;
        dVar.dismiss();
    }
}
