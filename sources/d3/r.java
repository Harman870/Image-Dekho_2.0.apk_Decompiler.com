package d3;

import android.database.sqlite.SQLiteDatabase;
import c3.n;
import d3.x;

public final /* synthetic */ class r implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f6079b;

    public /* synthetic */ r(x xVar, long j10) {
        this.f6078a = xVar;
        this.f6079b = j10;
    }

    public final Object apply(Object obj) {
        x xVar = this.f6078a;
        long j10 = this.f6079b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        xVar.getClass();
        String[] strArr = {String.valueOf(j10)};
        x.E(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new n(xVar));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }
}
