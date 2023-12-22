package d3;

import android.database.sqlite.SQLiteDatabase;
import d3.e0;

public final /* synthetic */ class b0 implements e0.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
