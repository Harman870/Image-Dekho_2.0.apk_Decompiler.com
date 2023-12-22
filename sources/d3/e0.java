package d3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.activity.f;
import java.util.Arrays;
import java.util.List;

public final class e0 extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6053c;

    /* renamed from: d  reason: collision with root package name */
    public static int f6054d = 5;

    /* renamed from: e  reason: collision with root package name */
    public static final List<a> f6055e = Arrays.asList(new a[]{new z(), new a0(), new b0(), new c0(), new d0()});

    /* renamed from: a  reason: collision with root package name */
    public final int f6056a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6057b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder g10 = f.g("INSERT INTO global_log_event_state VALUES (");
        g10.append(System.currentTimeMillis());
        g10.append(")");
        f6053c = g10.toString();
    }

    public e0(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f6056a = i10;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f6055e;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f6055e.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f6057b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i10 = this.f6056a;
        if (!this.f6057b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i10);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f6057b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f6057b) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f6057b) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}
