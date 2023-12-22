package d3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.activity.f;
import e3.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import w2.n;
import w2.s;
import z2.a;
import z2.c;

public final class x implements d, e3.b, c {

    /* renamed from: f  reason: collision with root package name */
    public static final t2.b f6090f = new t2.b("proto");

    /* renamed from: a  reason: collision with root package name */
    public final e0 f6091a;

    /* renamed from: b  reason: collision with root package name */
    public final f3.a f6092b;

    /* renamed from: c  reason: collision with root package name */
    public final f3.a f6093c;

    /* renamed from: d  reason: collision with root package name */
    public final e f6094d;

    /* renamed from: e  reason: collision with root package name */
    public final n8.a<String> f6095e;

    public interface a<T, U> {
        U apply(T t10);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6096a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6097b;

        public b(String str, String str2) {
            this.f6096a = str;
            this.f6097b = str2;
        }
    }

    public x(f3.a aVar, f3.a aVar2, e eVar, e0 e0Var, n8.a<String> aVar3) {
        this.f6091a = e0Var;
        this.f6092b = aVar;
        this.f6093c = aVar2;
        this.f6094d = eVar;
        this.f6095e = aVar3;
    }

    public static String A(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T E(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long t(SQLiteDatabase sQLiteDatabase, s sVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{sVar.b(), String.valueOf(g3.a.a(sVar.d()))}));
        if (sVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(sVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) E(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new j(1));
    }

    public final void B(Iterable<i> iterable) {
        Cursor rawQuery;
        if (iterable.iterator().hasNext()) {
            StringBuilder g10 = f.g("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            g10.append(A(iterable));
            String sb = g10.toString();
            SQLiteDatabase s10 = s();
            s10.beginTransaction();
            try {
                s10.compileStatement(sb).execute();
                rawQuery = s10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", (String[]) null);
                while (rawQuery.moveToNext()) {
                    int i10 = rawQuery.getInt(0);
                    j((long) i10, c.a.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                s10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                s10.setTransactionSuccessful();
                s10.endTransaction();
            } catch (Throwable th) {
                s10.endTransaction();
                throw th;
            }
        }
    }

    public final Iterable<i> C(s sVar) {
        return (Iterable) u(new w(this, sVar));
    }

    public final z2.a a() {
        int i10 = z2.a.f13146e;
        a.C0176a aVar = new a.C0176a();
        HashMap hashMap = new HashMap();
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            z2.a aVar2 = (z2.a) E(s10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new n(this, hashMap, aVar));
            s10.setTransactionSuccessful();
            return aVar2;
        } finally {
            s10.endTransaction();
        }
    }

    public final <T> T c(b.a<T> aVar) {
        SQLiteDatabase s10 = s();
        q qVar = new q(0);
        long a10 = this.f6093c.a();
        while (true) {
            try {
                s10.beginTransaction();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f6093c.a() >= ((long) this.f6094d.a()) + a10) {
                    qVar.apply(e10);
                    break;
                }
                SystemClock.sleep(50);
            }
        }
        try {
            T a11 = aVar.a();
            s10.setTransactionSuccessful();
            return a11;
        } finally {
            s10.endTransaction();
        }
    }

    public final void close() {
        this.f6091a.close();
    }

    public final int f() {
        return ((Integer) u(new r(this, this.f6092b.a() - this.f6094d.b()))).intValue();
    }

    public final void h(Iterable<i> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder g10 = f.g("DELETE FROM events WHERE _id in ");
            g10.append(A(iterable));
            s().compileStatement(g10.toString()).execute();
        }
    }

    public final void j(long j10, c.a aVar, String str) {
        u(new u(j10, aVar, str));
    }

    public final b k(s sVar, n nVar) {
        Object[] objArr = {sVar.d(), nVar.g(), sVar.b()};
        String c10 = a3.a.c("SQLiteEventStore");
        if (Log.isLoggable(c10, 3)) {
            Log.d(c10, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) u(new o(this, nVar, sVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return new b(longValue, sVar, nVar);
    }

    public final boolean m(s sVar) {
        return ((Boolean) u(new t(this, sVar))).booleanValue();
    }

    public final void n(long j10, s sVar) {
        u(new v(j10, sVar));
    }

    public final void o() {
        u(new u2.b(1, this));
    }

    /* JADX INFO: finally extract failed */
    public final long q(s sVar) {
        long j10;
        Cursor rawQuery = s().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(g3.a.a(sVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                j10 = rawQuery.getLong(0);
            } else {
                j10 = 0;
            }
            Long valueOf = Long.valueOf(j10);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public final Iterable<s> r() {
        return (Iterable) u(new j(0));
    }

    public final SQLiteDatabase s() {
        e0 e0Var = this.f6091a;
        Objects.requireNonNull(e0Var);
        long a10 = this.f6093c.a();
        while (true) {
            try {
                return e0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f6093c.a() < ((long) this.f6094d.a()) + a10) {
                    SystemClock.sleep(50);
                } else {
                    throw new e3.a("Timed out while trying to open db.", e10);
                }
            }
        }
    }

    public final <T> T u(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase s10 = s();
        s10.beginTransaction();
        try {
            T apply = aVar.apply(s10);
            s10.setTransactionSuccessful();
            return apply;
        } finally {
            s10.endTransaction();
        }
    }

    public final ArrayList v(SQLiteDatabase sQLiteDatabase, s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long t10 = t(sQLiteDatabase, sVar);
        if (t10 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        E(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{t10.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new m(this, arrayList, sVar));
        return arrayList;
    }
}
