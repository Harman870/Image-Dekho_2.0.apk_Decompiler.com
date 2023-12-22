package d3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d3.x;
import z2.c;

public final /* synthetic */ class u implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6083a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.a f6084b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f6085c;

    public /* synthetic */ u(long j10, c.a aVar, String str) {
        this.f6083a = str;
        this.f6084b = aVar;
        this.f6085c = j10;
    }

    public final Object apply(Object obj) {
        String str = this.f6083a;
        c.a aVar = this.f6084b;
        long j10 = this.f6085c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (!((Boolean) x.E(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f13166a)}), new w2.u())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put(IronSourceConstants.EVENTS_ERROR_REASON, Integer.valueOf(aVar.f13166a));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f13166a)});
        }
        return null;
    }
}
