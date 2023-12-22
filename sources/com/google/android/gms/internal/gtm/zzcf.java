package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class zzcf extends SQLiteOpenHelper {
    public final /* synthetic */ zzcg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcg, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzcg;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException e10) {
            this.zza.zzS("Error querying for table", str, e10);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static final Set zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", (String[]) null);
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        if (this.zza.zze.zzc(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.zza.zze.zzb();
                this.zza.zzI("Opening the database failed, dropping the table and recreating it");
                this.zza.zzo().getDatabasePath(this.zza.zzad()).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.zza.zze.zza();
                    return writableDatabase;
                } catch (SQLiteException e10) {
                    this.zza.zzJ("Failed to open freshly created database", e10);
                    throw e10;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            zzfc.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r10) {
        /*
            r9 = this;
            java.lang.String r0 = "hits2"
            boolean r1 = r9.zza(r10, r0)
            r2 = 0
            if (r1 != 0) goto L_0x0011
            java.lang.String r0 = com.google.android.gms.internal.gtm.zzcg.zza
        L_0x000d:
            r10.execSQL(r0)
            goto L_0x0053
        L_0x0011:
            java.util.Set r0 = zzb(r10, r0)
            java.lang.String r1 = "hit_id"
            java.lang.String r3 = "hit_string"
            java.lang.String r4 = "hit_time"
            java.lang.String r5 = "hit_url"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3, r4, r5}
            r3 = r2
        L_0x0022:
            r4 = 4
            if (r3 >= r4) goto L_0x0040
            r4 = r1[r3]
            boolean r5 = r0.remove(r4)
            if (r5 == 0) goto L_0x0030
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0030:
            java.lang.String r10 = java.lang.String.valueOf(r4)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database hits2 is missing required column: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        L_0x0040:
            java.lang.String r1 = "hit_app_id"
            boolean r1 = r0.remove(r1)
            r1 = r1 ^ 1
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a2
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER"
            goto L_0x000d
        L_0x0053:
            java.lang.String r0 = "properties"
            boolean r1 = r9.zza(r10, r0)
            if (r1 == 0) goto L_0x009c
            java.util.Set r10 = zzb(r10, r0)
            java.lang.String r3 = "app_uid"
            java.lang.String r4 = "cid"
            java.lang.String r5 = "tid"
            java.lang.String r6 = "params"
            java.lang.String r7 = "adid"
            java.lang.String r8 = "hits_count"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
        L_0x006f:
            r1 = 6
            if (r2 >= r1) goto L_0x008d
            r1 = r0[r2]
            boolean r3 = r10.remove(r1)
            if (r3 == 0) goto L_0x007d
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007d:
            java.lang.String r10 = java.lang.String.valueOf(r1)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            java.lang.String r1 = "Database properties is missing required column: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        L_0x008d:
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0094
            return
        L_0x0094:
            android.database.sqlite.SQLiteException r10 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database properties table has extra columns"
            r10.<init>(r0)
            throw r10
        L_0x009c:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;"
            r10.execSQL(r0)
            return
        L_0x00a2:
            android.database.sqlite.SQLiteException r10 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database hits2 has extra columns"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcf.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
