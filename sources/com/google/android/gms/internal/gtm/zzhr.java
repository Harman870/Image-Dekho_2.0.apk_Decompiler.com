package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class zzhr extends SQLiteOpenHelper {
    public final /* synthetic */ zzhs zza;
    private boolean zzb;
    private long zzc = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzhr(zzhs zzhs, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzhs;
    }

    private static final boolean zza(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
            boolean moveToFirst = query.moveToFirst();
            query.close();
            return moveToFirst;
        } catch (SQLiteException unused) {
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

    /* JADX INFO: finally extract failed */
    private static final void zzb(SQLiteDatabase sQLiteDatabase, String str, List list) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " WHERE 0", (String[]) null);
        HashSet hashSet = new HashSet();
        try {
            String[] columnNames = rawQuery.getColumnNames();
            for (String add : columnNames) {
                hashSet.add(add);
            }
            rawQuery.close();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!hashSet.remove(str2)) {
                    throw new SQLiteException(String.format("Database column %s missing in table %s.", new Object[]{str2, str}));
                }
            }
            if (!hashSet.isEmpty()) {
                throw new SQLiteException(String.format("Database has extra columns in table %s.", new Object[]{str}));
            }
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        if (!this.zzb || this.zzc + 3600000 <= this.zza.zzj.currentTimeMillis()) {
            this.zzb = true;
            this.zzc = this.zza.zzj.currentTimeMillis();
            try {
                sQLiteDatabase = super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzhs zzhs = this.zza;
                zzhs.zzg.getDatabasePath(zzhs.zzh).delete();
                sQLiteDatabase = null;
            }
            if (sQLiteDatabase == null) {
                sQLiteDatabase = super.getWritableDatabase();
            }
            this.zzb = false;
            return sQLiteDatabase;
        }
        throw new SQLiteException("Database creation failed");
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
            zzho.zza("Invalid version number: ".concat(String.valueOf(Build.VERSION.SDK)));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!zza("gtm_hit_unique_ids", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(zzhs.zza);
        } else {
            zzb(sQLiteDatabase, "gtm_hit_unique_ids", Arrays.asList(new String[]{"hit_unique_id"}));
        }
        if (!zza("gtm_hits", sQLiteDatabase)) {
            sQLiteDatabase.execSQL(zzhs.zzb);
        } else {
            zzb(sQLiteDatabase, "gtm_hits", Arrays.asList(new String[]{"hit_id", "hit_url", "hit_time", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"}));
        }
        sQLiteDatabase.execSQL(zzhs.zzc);
        sQLiteDatabase.execSQL(zzhs.zzd);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
