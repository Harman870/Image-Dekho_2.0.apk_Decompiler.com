package n4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class c3 extends o3 {

    /* renamed from: c  reason: collision with root package name */
    public final b3 f9653c = new b3(this, this.f9600a.f9986a);

    /* renamed from: d  reason: collision with root package name */
    public boolean f9654d;

    public c3(n4 n4Var) {
        super(n4Var);
    }

    public final boolean j() {
        return false;
    }

    public final SQLiteDatabase k() {
        if (this.f9654d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f9653c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f9654d = true;
        return null;
    }

    public final void l() {
        int delete;
        g();
        try {
            SQLiteDatabase k = k();
            if (k != null && (delete = k.delete("messages", (String) null, (String[]) null)) > 0) {
                this.f9600a.a().f9835n.b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e10) {
            this.f9600a.a().f9828f.b("Error resetting local analytics data. error", e10);
        }
    }

    public final void m() {
        g();
        if (!this.f9654d && this.f9600a.f9986a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            int i11 = 0;
            while (i11 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase k = k();
                    if (k == null) {
                        this.f9654d = true;
                        return;
                    }
                    k.beginTransaction();
                    k.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    k.setTransactionSuccessful();
                    k.endTransaction();
                    k.close();
                    return;
                } catch (SQLiteFullException e10) {
                    this.f9600a.a().f9828f.b("Error deleting app launch break from local database", e10);
                    this.f9654d = true;
                    if (sQLiteDatabase == null) {
                        i11++;
                    }
                    sQLiteDatabase.close();
                    i11++;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep((long) i10);
                    i10 += 20;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i11++;
                    } else {
                        i11++;
                    }
                } catch (SQLiteException e11) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    this.f9600a.a().f9828f.b("Error deleting app launch break from local database", e11);
                    this.f9654d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                        i11++;
                    } else {
                        i11++;
                    }
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
            this.f9600a.a().f9831i.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7 A[SYNTHETIC, Splitter:B:47:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0119 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0119 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.g()
            boolean r0 = r1.f9654d
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            n4.n4 r0 = r1.f9600a
            r0.getClass()
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x0028:
            if (r5 >= r4) goto L_0x012f
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.k()     // Catch:{ SQLiteFullException -> 0x00fc, SQLiteDatabaseLockedException -> 0x00ea, SQLiteException -> 0x00c3, all -> 0x00bf }
            if (r9 != 0) goto L_0x0035
            r1.f9654d = r8     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bd, SQLiteDatabaseLockedException -> 0x00eb, SQLiteException -> 0x00b9 }
            r11 = 0
            if (r10 == 0) goto L_0x0053
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r0 == 0) goto L_0x0053
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r0 = move-exception
            goto L_0x00ad
        L_0x004f:
            r0 = move-exception
            goto L_0x00b0
        L_0x0051:
            r0 = move-exception
            goto L_0x00b4
        L_0x0053:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x009a
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r4 = "Data loss, local db full"
            r0.a(r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.String r0 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r11 = 1
            long r13 = r13 + r11
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            int r0 = r9.delete(r15, r0, r4)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r11 = (long) r0     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            n4.n4 r0 = r1.f9600a     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r0.d(r4, r2, r8, r11)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
        L_0x009a:
            r9.insertOrThrow(r15, r7, r3)     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0051, SQLiteDatabaseLockedException -> 0x00b2, SQLiteException -> 0x004f, all -> 0x004d }
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            r9.close()
            r2 = 1
            return r2
        L_0x00ad:
            r7 = r10
            goto L_0x0124
        L_0x00b0:
            r7 = r10
            goto L_0x00ba
        L_0x00b2:
            r7 = r10
            goto L_0x00eb
        L_0x00b4:
            r7 = r10
            goto L_0x00fe
        L_0x00b6:
            r0 = move-exception
            goto L_0x0124
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            r2 = r7
            r7 = r9
            goto L_0x00c5
        L_0x00bd:
            r0 = move-exception
            goto L_0x00fe
        L_0x00bf:
            r0 = move-exception
            r9 = r7
            goto L_0x0124
        L_0x00c3:
            r0 = move-exception
            r2 = r7
        L_0x00c5:
            if (r7 == 0) goto L_0x00d0
            boolean r4 = r7.inTransaction()     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00d0
            r7.endTransaction()     // Catch:{ all -> 0x00e8 }
        L_0x00d0:
            n4.n4 r4 = r1.f9600a     // Catch:{ all -> 0x00e8 }
            n4.i3 r4 = r4.a()     // Catch:{ all -> 0x00e8 }
            n4.g3 r4 = r4.f9828f     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "Error writing entry to local database"
            r4.b(r8, r0)     // Catch:{ all -> 0x00e8 }
            r4 = 1
            r1.f9654d = r4     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00e5
            r2.close()
        L_0x00e5:
            if (r7 == 0) goto L_0x0119
            goto L_0x0116
        L_0x00e8:
            r0 = move-exception
            goto L_0x0122
        L_0x00ea:
            r9 = r7
        L_0x00eb:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b6 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f6
            r7.close()
        L_0x00f6:
            if (r9 == 0) goto L_0x0119
            r9.close()
            goto L_0x0119
        L_0x00fc:
            r0 = move-exception
            r9 = r7
        L_0x00fe:
            n4.n4 r2 = r1.f9600a     // Catch:{ all -> 0x011f }
            n4.i3 r2 = r2.a()     // Catch:{ all -> 0x011f }
            n4.g3 r2 = r2.f9828f     // Catch:{ all -> 0x011f }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.b(r4, r0)     // Catch:{ all -> 0x011f }
            r2 = 1
            r1.f9654d = r2     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0113
            r7.close()
        L_0x0113:
            if (r9 == 0) goto L_0x0119
            r7 = r9
        L_0x0116:
            r7.close()
        L_0x0119:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x011f:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L_0x0122:
            r9 = r7
            r7 = r2
        L_0x0124:
            if (r7 == 0) goto L_0x0129
            r7.close()
        L_0x0129:
            if (r9 == 0) goto L_0x012e
            r9.close()
        L_0x012e:
            throw r0
        L_0x012f:
            n4.n4 r0 = r1.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.c3.n(int, byte[]):boolean");
    }
}
