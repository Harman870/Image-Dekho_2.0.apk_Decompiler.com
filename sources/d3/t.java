package d3;

import android.database.sqlite.SQLiteDatabase;
import d3.x;
import u2.c;
import w2.s;

public final /* synthetic */ class t implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6081a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f6082b;

    public /* synthetic */ t(x xVar, s sVar) {
        this.f6081a = xVar;
        this.f6082b = sVar;
    }

    public final Object apply(Object obj) {
        x xVar = this.f6081a;
        s sVar = this.f6082b;
        xVar.getClass();
        Long t10 = x.t((SQLiteDatabase) obj, sVar);
        if (t10 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) x.E(xVar.s().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{t10.toString()}), new c());
    }
}
