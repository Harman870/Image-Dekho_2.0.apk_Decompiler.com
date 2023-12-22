package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
import w3.b;
import w3.c;
import y3.a;

final class zzhs implements zzhg {
    /* access modifiers changed from: private */
    public static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", new Object[]{"gtm_hit_unique_ids", "hit_unique_id"});
    /* access modifiers changed from: private */
    public static final String zzb = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"});
    /* access modifiers changed from: private */
    public static final String zzc = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", new Object[]{"save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    /* access modifiers changed from: private */
    public static final String zzd = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", new Object[]{"check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    private final zzhr zze;
    private volatile zzgy zzf;
    /* access modifiers changed from: private */
    public final Context zzg;
    /* access modifiers changed from: private */
    public final String zzh = "gtm_urls.db";
    private long zzi;
    /* access modifiers changed from: private */
    public final b zzj;
    private final int zzk;
    private final zzih zzl;

    public zzhs(zzih zzih, Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzg = applicationContext;
        this.zzl = zzih;
        this.zzj = a.P;
        this.zze = new zzhr(this, applicationContext, "gtm_urls.db");
        this.zzf = new zziq(applicationContext, new zzhq(this));
        this.zzi = 0;
        this.zzk = 2000;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzhs zzhs, long j10, long j11) {
        SQLiteDatabase zzn = zzhs.zzn("Error opening database for getNumStoredHits.");
        if (zzn != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j11));
            try {
                zzn.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j10)});
            } catch (SQLiteException e10) {
                String message = e10.getMessage();
                zzho.zze("Error setting HIT_FIRST_DISPATCH_TIME for hitId " + j10 + ": " + message);
                zzhs.zzo(j10);
            }
        }
    }

    private final SQLiteDatabase zzn(String str) {
        try {
            return this.zze.getWritableDatabase();
        } catch (SQLiteException e10) {
            Context context = this.zzg;
            zzho.zzf(str, e10);
            c.a(context, e10);
            zzho.zzd("Failed to report crash");
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzo(long j10) {
        zzm(new String[]{String.valueOf(j10)});
    }

    private final void zzp(long j10, String str, String str2, String str3, Map map, String str4) {
        SQLiteDatabase zzn = zzn("Error opening database for putHit");
        if (zzn != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j10));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            if (str2 == null) {
                str2 = "GET";
            }
            contentValues.put("hit_method", str2);
            contentValues.put("hit_unique_id", str3);
            contentValues.put("hit_headers", map == null ? null : new JSONObject(map).toString());
            contentValues.put("hit_body", str4);
            try {
                zzn.insertOrThrow("gtm_hits", (String) null, contentValues);
                zzho.zzd("Hit stored (url = " + str + ")");
                this.zzl.zza(false);
            } catch (SQLiteConstraintException unused) {
                zzho.zzd("Hit has already been sent: ".concat(String.valueOf(str)));
            } catch (SQLiteException e10) {
                zzho.zze("Error storing hit: ".concat(String.valueOf(e10.getMessage())));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x026f, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c7, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ca, code lost:
        r15 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d9, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01dd, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f7, code lost:
        if (r12 != null) goto L_0x0160;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b9 A[EDGE_INSN: B:130:0x01b9->B:70:0x01b9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1 A[Catch:{ all -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:11:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r26 = this;
            r1 = r26
            java.lang.String r0 = "%s ASC"
            java.lang.String r2 = "GTM Dispatch running..."
            com.google.android.gms.internal.gtm.zzho.zzd(r2)
            com.google.android.gms.internal.gtm.zzgy r2 = r1.zzf
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L_0x0273
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            android.database.sqlite.SQLiteDatabase r3 = r1.zzn(r3)
            java.lang.String r13 = "hit_first_send_time"
            java.lang.String r14 = "hit_id"
            r12 = 0
            r11 = 1
            if (r3 != 0) goto L_0x0027
            r15 = r12
            goto L_0x01fb
        L_0x0027:
            java.lang.String r5 = "gtm_hits"
            java.lang.String r4 = "hit_time"
            java.lang.String[] r6 = new java.lang.String[]{r14, r4, r13}     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01d8 }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01d8 }
            r4[r12] = r14     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01d8 }
            java.lang.String r16 = java.lang.String.format(r0, r4)     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01d8 }
            r17 = 40
            java.lang.String r18 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x01dc, all -> 0x01d8 }
            r4 = r3
            r15 = r11
            r11 = r16
            r15 = r12
            r12 = r18
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01d6, all -> 0x01d8 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01d0, all -> 0x01c9 }
            r11.<init>()     // Catch:{ SQLiteException -> 0x01d0, all -> 0x01c9 }
            boolean r2 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            r10 = 2
            if (r2 == 0) goto L_0x0075
        L_0x0058:
            com.google.android.gms.internal.gtm.zzhb r2 = new com.google.android.gms.internal.gtm.zzhb     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            long r20 = r12.getLong(r15)     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            r4 = 1
            long r22 = r12.getLong(r4)     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            long r24 = r12.getLong(r10)     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            r19 = r2
            r19.<init>(r20, r22, r24)     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            r11.add(r2)     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            boolean r2 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01c6, all -> 0x01c9 }
            if (r2 != 0) goto L_0x0058
        L_0x0075:
            r12.close()
            java.lang.String r5 = "gtm_hits"
            java.lang.String r2 = "hit_url"
            java.lang.String r4 = "hit_method"
            java.lang.String r6 = "hit_headers"
            java.lang.String r7 = "hit_body"
            java.lang.String[] r6 = new java.lang.String[]{r14, r2, r4, r6, r7}     // Catch:{ SQLiteException -> 0x0173, all -> 0x016d }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = 0
            r4 = 1
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ SQLiteException -> 0x0173, all -> 0x016d }
            r10[r15] = r14     // Catch:{ SQLiteException -> 0x0173, all -> 0x016d }
            java.lang.String r0 = java.lang.String.format(r0, r10)     // Catch:{ SQLiteException -> 0x0173, all -> 0x016d }
            java.lang.String r17 = java.lang.Integer.toString(r17)     // Catch:{ SQLiteException -> 0x0173, all -> 0x016d }
            r4 = r3
            r3 = 2
            r10 = r2
            r2 = r11
            r11 = r0
            r18 = r12
            r12 = r17
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x016b, all -> 0x0169 }
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0167 }
            if (r0 == 0) goto L_0x0160
            r4 = r15
        L_0x00ab:
            r0 = r12
            android.database.sqlite.SQLiteCursor r0 = (android.database.sqlite.SQLiteCursor) r0     // Catch:{ SQLiteException -> 0x0167 }
            android.database.CursorWindow r0 = r0.getWindow()     // Catch:{ SQLiteException -> 0x0167 }
            int r0 = r0.getNumRows()     // Catch:{ SQLiteException -> 0x0167 }
            if (r0 <= 0) goto L_0x013c
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r0 = (com.google.android.gms.internal.gtm.zzhb) r0     // Catch:{ SQLiteException -> 0x0167 }
            r5 = 1
            java.lang.String r6 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0167 }
            r0.zzj(r6)     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r0 = (com.google.android.gms.internal.gtm.zzhb) r0     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.String r5 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0167 }
            r0.zzi(r5)     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r0 = (com.google.android.gms.internal.gtm.zzhb) r0     // Catch:{ SQLiteException -> 0x0167 }
            r5 = 4
            java.lang.String r5 = r12.getString(r5)     // Catch:{ SQLiteException -> 0x0167 }
            r0.zzg(r5)     // Catch:{ SQLiteException -> 0x0167 }
            r0 = 3
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x0118 }
            if (r0 == 0) goto L_0x010d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0118 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x0118 }
            org.json.JSONArray r0 = r5.names()     // Catch:{ JSONException -> 0x0118 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ JSONException -> 0x0118 }
            r6.<init>()     // Catch:{ JSONException -> 0x0118 }
            r7 = r15
        L_0x00f7:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x0118 }
            if (r7 >= r8) goto L_0x010e
            java.lang.String r8 = r0.getString(r7)     // Catch:{ JSONException -> 0x0118 }
            java.lang.Object r9 = r5.opt(r8)     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0118 }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x0118 }
            int r7 = r7 + 1
            goto L_0x00f7
        L_0x010d:
            r6 = 0
        L_0x010e:
            java.lang.Object r0 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r0 = (com.google.android.gms.internal.gtm.zzhb) r0     // Catch:{ SQLiteException -> 0x0167 }
            r0.zzh(r6)     // Catch:{ SQLiteException -> 0x0167 }
            goto L_0x0158
        L_0x0118:
            r0 = move-exception
            java.lang.String r5 = "Failed to read headers for hitId %d: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Object r7 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r7 = (com.google.android.gms.internal.gtm.zzhb) r7     // Catch:{ SQLiteException -> 0x0167 }
            long r7 = r7.zzb()     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0167 }
            r6[r15] = r7     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x0167 }
            r7 = 1
            r6[r7] = r0     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.String r0 = java.lang.String.format(r5, r6)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ SQLiteException -> 0x0167 }
            goto L_0x015a
        L_0x013c:
            java.lang.String r0 = "HitString for hitId %d too large. Hit will be deleted."
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Object r5 = r2.get(r4)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzhb r5 = (com.google.android.gms.internal.gtm.zzhb) r5     // Catch:{ SQLiteException -> 0x0167 }
            long r7 = r5.zzb()     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ SQLiteException -> 0x0167 }
            r6[r15] = r5     // Catch:{ SQLiteException -> 0x0167 }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ SQLiteException -> 0x0167 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ SQLiteException -> 0x0167 }
        L_0x0158:
            int r4 = r4 + 1
        L_0x015a:
            boolean r0 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0167 }
            if (r0 != 0) goto L_0x00ab
        L_0x0160:
            r12.close()
            goto L_0x01fb
        L_0x0165:
            r0 = move-exception
            goto L_0x01c0
        L_0x0167:
            r0 = move-exception
            goto L_0x0179
        L_0x0169:
            r0 = move-exception
            goto L_0x0170
        L_0x016b:
            r0 = move-exception
            goto L_0x0177
        L_0x016d:
            r0 = move-exception
            r18 = r12
        L_0x0170:
            r12 = r18
            goto L_0x01c0
        L_0x0173:
            r0 = move-exception
            r2 = r11
            r18 = r12
        L_0x0177:
            r12 = r18
        L_0x0179:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0165 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            r3.<init>()     // Catch:{ all -> 0x0165 }
            java.lang.String r4 = "Error in peekHits fetching hit url: "
            r3.append(r4)     // Catch:{ all -> 0x0165 }
            r3.append(r0)     // Catch:{ all -> 0x0165 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0165 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x0165 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0165 }
            r0.<init>()     // Catch:{ all -> 0x0165 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0165 }
            r3 = r15
        L_0x019b:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0165 }
            if (r4 == 0) goto L_0x01b9
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0165 }
            com.google.android.gms.internal.gtm.zzhb r4 = (com.google.android.gms.internal.gtm.zzhb) r4     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = r4.zze()     // Catch:{ all -> 0x0165 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0165 }
            if (r5 == 0) goto L_0x01b5
            if (r3 == 0) goto L_0x01b4
            goto L_0x01b9
        L_0x01b4:
            r3 = 1
        L_0x01b5:
            r0.add(r4)     // Catch:{ all -> 0x0165 }
            goto L_0x019b
        L_0x01b9:
            if (r12 == 0) goto L_0x01be
            r12.close()
        L_0x01be:
            r2 = r0
            goto L_0x01fb
        L_0x01c0:
            if (r12 == 0) goto L_0x01c5
            r12.close()
        L_0x01c5:
            throw r0
        L_0x01c6:
            r0 = move-exception
            r2 = r11
            goto L_0x01d1
        L_0x01c9:
            r0 = move-exception
            r18 = r12
            r15 = r18
            goto L_0x026d
        L_0x01d0:
            r0 = move-exception
        L_0x01d1:
            r18 = r12
            r12 = r18
            goto L_0x01df
        L_0x01d6:
            r0 = move-exception
            goto L_0x01de
        L_0x01d8:
            r0 = move-exception
            r15 = 0
            goto L_0x026d
        L_0x01dc:
            r0 = move-exception
            r15 = r12
        L_0x01de:
            r12 = 0
        L_0x01df:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x026b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026b }
            r3.<init>()     // Catch:{ all -> 0x026b }
            java.lang.String r4 = "Error in peekHits fetching hitIds: "
            r3.append(r4)     // Catch:{ all -> 0x026b }
            r3.append(r0)     // Catch:{ all -> 0x026b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x026b }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x026b }
            if (r12 == 0) goto L_0x01fb
            goto L_0x0160
        L_0x01fb:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = "...nothing to dispatch"
            com.google.android.gms.internal.gtm.zzho.zzd(r0)
            com.google.android.gms.internal.gtm.zzih r0 = r1.zzl
            r2 = 1
            r0.zza(r2)
            return
        L_0x020d:
            com.google.android.gms.internal.gtm.zzgy r0 = r1.zzf
            r0.zza(r2)
            java.lang.String r0 = "Error opening database for getNumStoredHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.zzn(r0)
            if (r2 != 0) goto L_0x021b
            goto L_0x025e
        L_0x021b:
            java.lang.String r3 = "gtm_hits"
            java.lang.String[] r4 = new java.lang.String[]{r14, r13}     // Catch:{ SQLiteException -> 0x0238, all -> 0x0235 }
            java.lang.String r5 = "hit_first_send_time=0"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0238, all -> 0x0235 }
            int r12 = r2.getCount()     // Catch:{ SQLiteException -> 0x0233 }
            r2.close()
            goto L_0x0255
        L_0x0233:
            r0 = move-exception
            goto L_0x023a
        L_0x0235:
            r0 = move-exception
            r15 = 0
            goto L_0x0265
        L_0x0238:
            r0 = move-exception
            r2 = 0
        L_0x023a:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0263 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0263 }
            r3.<init>()     // Catch:{ all -> 0x0263 }
            java.lang.String r4 = "Error getting num untried hits: "
            r3.append(r4)     // Catch:{ all -> 0x0263 }
            r3.append(r0)     // Catch:{ all -> 0x0263 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0263 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x0263 }
            if (r2 != 0) goto L_0x025f
            r12 = r15
        L_0x0255:
            if (r12 <= 0) goto L_0x025e
            com.google.android.gms.internal.gtm.zzin r0 = com.google.android.gms.internal.gtm.zzin.zzf()
            r0.zzi()
        L_0x025e:
            return
        L_0x025f:
            r2.close()
            return
        L_0x0263:
            r0 = move-exception
            r15 = r2
        L_0x0265:
            if (r15 == 0) goto L_0x026a
            r15.close()
        L_0x026a:
            throw r0
        L_0x026b:
            r0 = move-exception
            r15 = r12
        L_0x026d:
            if (r15 == 0) goto L_0x0272
            r15.close()
        L_0x0272:
            throw r0
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzhs.zza():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cc, code lost:
        if (r4 == null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.Map r23, java.lang.String r24) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "hit_id"
            w3.b r2 = r1.zzj
            long r2 = r2.currentTimeMillis()
            long r4 = r1.zzi
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r5 = "gtm_hits"
            r6 = 1
            r7 = 0
            if (r4 > 0) goto L_0x0019
            goto L_0x0064
        L_0x0019:
            r1.zzi = r2
            java.lang.String r2 = "Error opening database for deleteStaleHits."
            android.database.sqlite.SQLiteDatabase r2 = r1.zzn(r2)
            if (r2 == 0) goto L_0x0064
            w3.b r3 = r1.zzj
            long r3 = r3.currentTimeMillis()
            r8 = -2592000000(0xffffffff65813800, double:NaN)
            long r3 = r3 + r8
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r3 = java.lang.Long.toString(r3)
            r8[r7] = r3
            java.lang.String r3 = "HIT_TIME < ?"
            int r2 = r2.delete(r5, r3, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Removed "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " stale hits."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.internal.gtm.zzho.zzd(r2)
            com.google.android.gms.internal.gtm.zzih r2 = r1.zzl
            int r3 = r1.zzc(r5)
            if (r3 != 0) goto L_0x0060
            r3 = r6
            goto L_0x0061
        L_0x0060:
            r3 = r7
        L_0x0061:
            r2.zza(r3)
        L_0x0064:
            int r2 = r1.zzc(r5)
            int r3 = r1.zzk
            int r2 = r2 - r3
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0100
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r4 = "Error opening database for peekHitIds."
            android.database.sqlite.SQLiteDatabase r8 = r1.zzn(r4)
            if (r8 != 0) goto L_0x007c
            goto L_0x00d1
        L_0x007c:
            r4 = 0
            java.lang.String r9 = "gtm_hits"
            java.lang.String[] r10 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x00b3 }
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = "%s ASC"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SQLiteException -> 0x00b3 }
            r6[r7] = r0     // Catch:{ SQLiteException -> 0x00b3 }
            java.lang.String r15 = java.lang.String.format(r5, r6)     // Catch:{ SQLiteException -> 0x00b3 }
            java.lang.String r16 = java.lang.Integer.toString(r2)     // Catch:{ SQLiteException -> 0x00b3 }
            android.database.Cursor r4 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00b3 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00b3 }
            if (r0 == 0) goto L_0x00ce
        L_0x009f:
            long r5 = r4.getLong(r7)     // Catch:{ SQLiteException -> 0x00b3 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00b3 }
            r3.add(r0)     // Catch:{ SQLiteException -> 0x00b3 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x00b3 }
            if (r0 != 0) goto L_0x009f
            goto L_0x00ce
        L_0x00b1:
            r0 = move-exception
            goto L_0x00fa
        L_0x00b3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r2.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Error in peekHits fetching hitIds: "
            r2.append(r5)     // Catch:{ all -> 0x00b1 }
            r2.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.internal.gtm.zzho.zze(r0)     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x00d1
        L_0x00ce:
            r4.close()
        L_0x00d1:
            int r0 = r3.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Store full, deleting "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " hits to make room."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.gtm.zzho.zzd(r0)
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1.zzm(r0)
            goto L_0x0100
        L_0x00fa:
            if (r4 == 0) goto L_0x00ff
            r4.close()
        L_0x00ff:
            throw r0
        L_0x0100:
            r17.zzp(r18, r20, r21, r22, r23, r24)
            com.google.android.gms.internal.gtm.zzhv r0 = com.google.android.gms.internal.gtm.zzhv.zza()
            boolean r0 = r0.zzd()
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "Sending hits immediately under preview."
            com.google.android.gms.internal.gtm.zzho.zzd(r0)
            r17.zza()
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzhs.zzb(long, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    public final int zzc(String str) {
        SQLiteDatabase zzn = zzn("Error opening database for getNumRecords.");
        int i10 = 0;
        if (zzn == null) {
            return 0;
        }
        ? r12 = 0;
        try {
            Cursor rawQuery = zzn.rawQuery("SELECT COUNT(*) from gtm_hits", r12);
            if (rawQuery.moveToFirst()) {
                i10 = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
            return i10;
        } catch (SQLiteException e10) {
            String message = e10.getMessage();
            zzho.zze("Error getting numStoredRecords: " + message);
            if (r12 == 0) {
                return 0;
            }
            r12.close();
            return 0;
        } catch (Throwable th) {
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
    }

    public final void zzm(String[] strArr) {
        int length;
        SQLiteDatabase zzn;
        if (strArr != null && (length = strArr.length) != 0 && (zzn = zzn("Error opening database for deleteHits.")) != null) {
            boolean z9 = true;
            try {
                zzn.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(length, "?"))}), strArr);
                zzih zzih = this.zzl;
                if (zzc("gtm_hits") != 0) {
                    z9 = false;
                }
                zzih.zza(z9);
            } catch (SQLiteException e10) {
                zzho.zze("Error deleting hits: ".concat(String.valueOf(e10.getMessage())));
            }
        }
    }
}
