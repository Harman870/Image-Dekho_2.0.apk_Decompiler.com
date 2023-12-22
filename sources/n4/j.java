package n4;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public final class j {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3 == false) goto L_0x0039;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ all -> 0x00c4, SQLiteException -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[Catch:{ all -> 0x00c4, SQLiteException -> 0x00c9 }, LOOP:1: B:30:0x009b->B:35:0x00ad, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:29:0x0099, B:35:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6 A[Catch:{ all -> 0x00c4, SQLiteException -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(n4.i3 r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) {
        /*
            if (r10 == 0) goto L_0x00da
            r0 = 0
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r2 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r2}     // Catch:{ SQLiteException -> 0x002a, all -> 0x0027 }
            java.lang.String r5 = "name=?"
            r2 = 1
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x002a, all -> 0x0027 }
            r6[r0] = r12     // Catch:{ SQLiteException -> 0x002a, all -> 0x0027 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x002a, all -> 0x0027 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0025 }
            r2.close()
            if (r3 != 0) goto L_0x003c
            goto L_0x0039
        L_0x0025:
            r3 = move-exception
            goto L_0x002d
        L_0x0027:
            r10 = move-exception
            goto L_0x00d4
        L_0x002a:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x002d:
            n4.g3 r4 = r10.f9831i     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = "Error querying for table"
            r4.c(r5, r12, r3)     // Catch:{ all -> 0x00d2 }
            if (r2 == 0) goto L_0x0039
            r2.close()
        L_0x0039:
            r11.execSQL(r13)
        L_0x003c:
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00c9 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c9 }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00c9 }
            r2.append(r12)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r3 = " LIMIT 0"
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00c9 }
            android.database.Cursor r1 = r11.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String[] r2 = r1.getColumnNames()     // Catch:{ all -> 0x00c4 }
            java.util.Collections.addAll(r13, r2)     // Catch:{ all -> 0x00c4 }
            r1.close()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r1 = ","
            java.lang.String[] r14 = r14.split(r1)     // Catch:{ SQLiteException -> 0x00c9 }
            int r1 = r14.length     // Catch:{ SQLiteException -> 0x00c9 }
            r2 = r0
        L_0x006d:
            if (r2 >= r1) goto L_0x0099
            r3 = r14[r2]     // Catch:{ SQLiteException -> 0x00c9 }
            boolean r4 = r13.remove(r3)     // Catch:{ SQLiteException -> 0x00c9 }
            if (r4 == 0) goto L_0x007a
            int r2 = r2 + 1
            goto L_0x006d
        L_0x007a:
            android.database.sqlite.SQLiteException r11 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c9 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r14 = "Table "
            r13.append(r14)     // Catch:{ SQLiteException -> 0x00c9 }
            r13.append(r12)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r14 = " is missing required column: "
            r13.append(r14)     // Catch:{ SQLiteException -> 0x00c9 }
            r13.append(r3)     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r13 = r13.toString()     // Catch:{ SQLiteException -> 0x00c9 }
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x00c9 }
            throw r11     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x0099:
            if (r15 == 0) goto L_0x00b0
        L_0x009b:
            int r14 = r15.length     // Catch:{ SQLiteException -> 0x00c9 }
            if (r0 >= r14) goto L_0x00b0
            r14 = r15[r0]     // Catch:{ SQLiteException -> 0x00c9 }
            boolean r14 = r13.remove(r14)     // Catch:{ SQLiteException -> 0x00c9 }
            if (r14 != 0) goto L_0x00ad
            int r14 = r0 + 1
            r14 = r15[r14]     // Catch:{ SQLiteException -> 0x00c9 }
            r11.execSQL(r14)     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x00ad:
            int r0 = r0 + 2
            goto L_0x009b
        L_0x00b0:
            boolean r11 = r13.isEmpty()     // Catch:{ SQLiteException -> 0x00c9 }
            if (r11 != 0) goto L_0x00c3
            n4.g3 r11 = r10.f9831i     // Catch:{ SQLiteException -> 0x00c9 }
            java.lang.String r14 = "Table has extra columns. table, columns"
            java.lang.String r15 = ", "
            java.lang.String r13 = android.text.TextUtils.join(r15, r13)     // Catch:{ SQLiteException -> 0x00c9 }
            r11.c(r14, r12, r13)     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x00c3:
            return
        L_0x00c4:
            r11 = move-exception
            r1.close()     // Catch:{ SQLiteException -> 0x00c9 }
            throw r11     // Catch:{ SQLiteException -> 0x00c9 }
        L_0x00c9:
            r11 = move-exception
            n4.g3 r10 = r10.f9828f
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            r10.b(r13, r12)
            throw r11
        L_0x00d2:
            r10 = move-exception
            r1 = r2
        L_0x00d4:
            if (r1 == 0) goto L_0x00d9
            r1.close()
        L_0x00d9:
            throw r10
        L_0x00da:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Monitor must not be null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.j.a(n4.i3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(i3 i3Var, SQLiteDatabase sQLiteDatabase) {
        if (i3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                i3Var.f9831i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                i3Var.f9831i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                i3Var.f9831i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                i3Var.f9831i.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
