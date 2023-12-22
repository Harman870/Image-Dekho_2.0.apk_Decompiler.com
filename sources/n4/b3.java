package n4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public final class b3 extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c3 f9627a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f9627a = c3Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            this.f9627a.f9600a.a().f9828f.a("Opening the local database failed, dropping and recreating it");
            this.f9627a.f9600a.getClass();
            if (!this.f9627a.f9600a.f9986a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f9627a.f9600a.a().f9828f.b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f9627a.f9600a.a().f9828f.b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        j.b(this.f9627a.f9600a.a(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        j.a(this.f9627a.f9600a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
