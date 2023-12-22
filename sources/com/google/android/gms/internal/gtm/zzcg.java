package com.google.android.gms.internal.gtm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import i3.t;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r3.o;
import w3.e;

final class zzcg extends zzbu implements Closeable {
    /* access modifiers changed from: private */
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[]{"hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id"});
    private static final String zzb = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[]{"hit_time", "hits2"});
    private final zzcf zzc;
    private final zzfq zzd = new zzfq(zzC());
    /* access modifiers changed from: private */
    public final zzfq zze = new zzfq(zzC());

    public zzcg(zzbx zzbx) {
        super(zzbx);
        this.zzc = new zzcf(this, zzbx.zza(), zzad());
    }

    private final long zzac(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzf().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j11 = rawQuery.getLong(0);
                rawQuery.close();
                return j11;
            }
            rawQuery.close();
            return 0;
        } catch (SQLiteException e10) {
            zzK("Database error", str, e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final String zzad() {
        zzw();
        zzw();
        return "google_analytics_v4.db";
    }

    public final void close() {
        String str;
        try {
            this.zzc.close();
        } catch (SQLiteException e10) {
            e = e10;
            str = "Sql error closing database";
            zzJ(str, e);
        } catch (IllegalStateException e11) {
            e = e11;
            str = "Error closing database";
            zzJ(str, e);
        }
    }

    public final void zzY(List list) {
        o.h(list);
        t.a();
        zzV();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i10 = 0; i10 < list.size(); i10++) {
                Long l6 = (Long) list.get(i10);
                if (l6 == null || l6.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i10 > 0) {
                    sb.append(",");
                }
                sb.append(l6);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase zzf = zzf();
                zzO("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = zzf.delete("hits2", sb2, (String[]) null);
                if (delete != list.size()) {
                    zzT("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e10) {
                zzJ("Error deleting hits", e10);
                throw e10;
            }
        }
    }

    public final void zzZ() {
        zzV();
        zzf().endTransaction();
    }

    public final int zza() {
        t.a();
        zzV();
        if (!this.zzd.zzc(86400000)) {
            return 0;
        }
        this.zzd.zzb();
        zzN("Deleting stale hits (if any)");
        int delete = zzf().delete("hits2", "hit_time < ?", new String[]{Long.toString(zzC().currentTimeMillis() - 2592000000L)});
        zzO("Deleted stale hits, count", Integer.valueOf(delete));
        return delete;
    }

    public final void zzaa() {
        zzV();
        zzf().setTransactionSuccessful();
    }

    public final boolean zzab() {
        return zzb() == 0;
    }

    public final long zzb() {
        t.a();
        zzV();
        Cursor cursor = null;
        try {
            cursor = zzf().rawQuery("SELECT COUNT(*) FROM hits2", (String[]) null);
            if (cursor.moveToFirst()) {
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e10) {
            zzK("Database error", "SELECT COUNT(*) FROM hits2", e10);
            throw e10;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zzc() {
        t.a();
        zzV();
        return zzac(zzb, (String[]) null, 0);
    }

    public final void zzd() {
    }

    public final long zze(long j10, String str, String str2) {
        o.e(str);
        o.e(str2);
        zzV();
        t.a();
        return zzac("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{"0", str, str2}, 0);
    }

    public final SQLiteDatabase zzf() {
        try {
            return this.zzc.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzR("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List zzj(long r17) {
        /*
            r16 = this;
            r11 = r16
            java.lang.String r0 = "hit_id"
            r1 = 0
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            r12 = 0
            r13 = 1
            if (r1 < 0) goto L_0x000e
            r1 = r13
            goto L_0x000f
        L_0x000e:
            r1 = r12
        L_0x000f:
            r3.o.b(r1)
            i3.t.a()
            r16.zzV()
            android.database.sqlite.SQLiteDatabase r2 = r16.zzf()
            r1 = 0
            java.lang.String r3 = "hits2"
            java.lang.String r4 = "hit_time"
            java.lang.String r5 = "hit_string"
            java.lang.String r6 = "hit_url"
            java.lang.String r7 = "hit_app_id"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0097 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "%s ASC"
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ SQLiteException -> 0x0097 }
            r10[r12] = r0     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.lang.String r10 = java.lang.Long.toString(r17)     // Catch:{ SQLiteException -> 0x0097 }
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0097 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r0.<init>()     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            if (r1 == 0) goto L_0x008b
        L_0x004c:
            long r7 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            long r4 = r14.getLong(r13)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r1 = 2
            java.lang.String r1 = r14.getString(r1)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r2 = 3
            java.lang.String r2 = r14.getString(r2)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r3 = 4
            int r9 = r14.getInt(r3)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            java.util.Map r3 = r11.zzk(r1)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            if (r1 == 0) goto L_0x006f
        L_0x006d:
            r6 = r13
            goto L_0x0079
        L_0x006f:
            java.lang.String r1 = "http:"
            boolean r1 = r2.startsWith(r1)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            if (r1 != 0) goto L_0x0078
            goto L_0x006d
        L_0x0078:
            r6 = r12
        L_0x0079:
            com.google.android.gms.internal.gtm.zzez r15 = new com.google.android.gms.internal.gtm.zzez     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r10 = 0
            r1 = r15
            r2 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9, r10)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0092, all -> 0x008f }
            if (r1 != 0) goto L_0x004c
        L_0x008b:
            r14.close()
            return r0
        L_0x008f:
            r0 = move-exception
            r1 = r14
            goto L_0x009e
        L_0x0092:
            r0 = move-exception
            r1 = r14
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            goto L_0x009e
        L_0x0097:
            r0 = move-exception
        L_0x0098:
            java.lang.String r2 = "Error loading hits from the database"
            r11.zzJ(r2, r0)     // Catch:{ all -> 0x0095 }
            throw r0     // Catch:{ all -> 0x0095 }
        L_0x009e:
            if (r1 == 0) goto L_0x00a3
            r1.close()
        L_0x00a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcg.zzj(long):java.util.List");
    }

    public final Map zzk(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = "?" + str;
            }
            return e.a(new URI(str));
        } catch (URISyntaxException e10) {
            zzJ("Error parsing hit parameters", e10);
            return new HashMap(0);
        }
    }

    public final void zzm() {
        zzV();
        zzf().beginTransaction();
    }

    public final void zzn(long j10) {
        t.a();
        zzV();
        ArrayList arrayList = new ArrayList(1);
        Long valueOf = Long.valueOf(j10);
        arrayList.add(valueOf);
        zzO("Deleting hit, id", valueOf);
        zzY(arrayList);
    }
}
