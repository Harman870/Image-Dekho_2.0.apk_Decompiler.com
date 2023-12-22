package d3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import d3.x;
import g3.a;
import w2.s;

public final /* synthetic */ class v implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f6086a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f6087b;

    public /* synthetic */ v(long j10, s sVar) {
        this.f6086a = j10;
        this.f6087b = sVar;
    }

    public final Object apply(Object obj) {
        long j10 = this.f6086a;
        s sVar = this.f6087b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(a.a(sVar.d()))}) < 1) {
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(sVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }
}
