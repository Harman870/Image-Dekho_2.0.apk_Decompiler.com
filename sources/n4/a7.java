package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import q3.a1;
import r3.o;
import v3.a;

public final class a7 extends o3 {

    /* renamed from: c  reason: collision with root package name */
    public final z6 f9612c;

    /* renamed from: d  reason: collision with root package name */
    public z2 f9613d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f9614e;

    /* renamed from: f  reason: collision with root package name */
    public final r6 f9615f;

    /* renamed from: g  reason: collision with root package name */
    public final m7 f9616g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f9617h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final t6 f9618i;

    public a7(n4 n4Var) {
        super(n4Var);
        this.f9616g = new m7(n4Var.f9998n);
        this.f9612c = new z6(this);
        this.f9615f = new r6(this, n4Var, 0);
        this.f9618i = new t6(this, n4Var);
    }

    public static void t(a7 a7Var, ComponentName componentName) {
        a7Var.g();
        if (a7Var.f9613d != null) {
            a7Var.f9613d = null;
            a7Var.f9600a.a().f9835n.b("Disconnected from device MeasurementService", componentName);
            a7Var.g();
            a7Var.u();
        }
    }

    public final boolean j() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v58, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:72|73|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:87|88|89|90) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:58|59|60|61|244) */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x021b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x021c, code lost:
        r17 = r7;
        r16 = r10;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0224, code lost:
        r17 = r7;
        r16 = r10;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022c, code lost:
        r17 = r7;
        r16 = r10;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x024d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x024f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0250, code lost:
        r18 = r6;
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0257, code lost:
        r18 = r6;
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0260, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0261, code lost:
        r18 = r6;
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x01aa, code lost:
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r9.f9600a.a().f9828f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r9.f9600a.a().f9828f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r9.f9600a.a().f9828f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0140 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0174 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0245 A[SYNTHETIC, Splitter:B:140:0x0245] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x024d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x027a A[SYNTHETIC, Splitter:B:165:0x027a] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0248 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x02d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x02d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02d3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(n4.z2 r28, s3.a r29, n4.g8 r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.g()
            r27.h()
            n4.n4 r0 = r1.f9600a
            r0.getClass()
            n4.n4 r0 = r1.f9600a
            r0.getClass()
            r5 = 100
            r6 = 0
            r0 = r5
            r7 = r6
        L_0x001d:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x0388
            if (r0 != r5) goto L_0x0388
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            n4.n4 r0 = r1.f9600a
            n4.c3 r9 = r0.p()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.g()
            boolean r0 = r9.f9654d
            if (r0 == 0) goto L_0x003a
            goto L_0x005d
        L_0x003a:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            n4.n4 r0 = r9.f9600a
            android.content.Context r0 = r0.f9986a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0301
            r14 = 5
            r15 = r6
            r12 = r14
        L_0x0052:
            if (r15 >= r14) goto L_0x02ee
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.k()     // Catch:{ SQLiteFullException -> 0x02b1, SQLiteDatabaseLockedException -> 0x029a, SQLiteException -> 0x026f, all -> 0x026a }
            if (r5 != 0) goto L_0x0063
            r9.f9654d = r14     // Catch:{ SQLiteFullException -> 0x0260, SQLiteDatabaseLockedException -> 0x0257, SQLiteException -> 0x024f, all -> 0x024d }
        L_0x005d:
            r18 = r6
            r17 = r7
            goto L_0x02ff
        L_0x0063:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0260, SQLiteDatabaseLockedException -> 0x0257, SQLiteException -> 0x024f, all -> 0x024d }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch:{ all -> 0x023b }
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch:{ all -> 0x023b }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x023b }
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x0233 }
            r25 = -1
            if (r0 == 0) goto L_0x0092
            long r16 = r14.getLong(r6)     // Catch:{ all -> 0x0233 }
            r14.close()     // Catch:{ SQLiteFullException -> 0x0260, SQLiteDatabaseLockedException -> 0x0257, SQLiteException -> 0x024f, all -> 0x024d }
            goto L_0x0097
        L_0x0092:
            r14.close()     // Catch:{ SQLiteFullException -> 0x0260, SQLiteDatabaseLockedException -> 0x0257, SQLiteException -> 0x024f, all -> 0x024d }
            r16 = r25
        L_0x0097:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
            r16 = 0
            r6[r16] = r14     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
            r19 = r0
            r20 = r6
            goto L_0x00b1
        L_0x00ad:
            r19 = 0
            r20 = 0
        L_0x00b1:
            java.lang.String r17 = "messages"
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x022b, SQLiteDatabaseLockedException -> 0x0224, SQLiteException -> 0x021b, all -> 0x024d }
        L_0x00cd:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteFullException -> 0x0215, SQLiteDatabaseLockedException -> 0x0210, SQLiteException -> 0x020a }
            if (r0 == 0) goto L_0x01c7
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch:{ SQLiteFullException -> 0x0215, SQLiteDatabaseLockedException -> 0x0210, SQLiteException -> 0x020a }
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch:{ SQLiteFullException -> 0x0215, SQLiteDatabaseLockedException -> 0x0210, SQLiteException -> 0x020a }
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0 }
            if (r0 != 0) goto L_0x0121
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01b7, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x01b0 }
            int r0 = r10.length     // Catch:{ a -> 0x0109, all -> 0x0105 }
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch:{ a -> 0x010b }
            r14.setDataPosition(r7)     // Catch:{ a -> 0x010b }
            android.os.Parcelable$Creator<n4.r> r0 = n4.r.CREATOR     // Catch:{ a -> 0x010b }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ a -> 0x010b }
            n4.r r0 = (n4.r) r0     // Catch:{ a -> 0x010b }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            if (r0 == 0) goto L_0x01aa
            goto L_0x0187
        L_0x0103:
            r0 = move-exception
            goto L_0x011d
        L_0x0105:
            r0 = move-exception
            r17 = r7
            goto L_0x011d
        L_0x0109:
            r17 = r7
        L_0x010b:
            n4.n4 r0 = r9.f9600a     // Catch:{ all -> 0x0103 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0103 }
            n4.g3 r0 = r0.f9828f     // Catch:{ all -> 0x0103 }
            java.lang.String r7 = "Failed to load event from local database"
            r0.a(r7)     // Catch:{ all -> 0x0103 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            goto L_0x01aa
        L_0x011d:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
        L_0x0121:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L_0x0158
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            int r0 = r10.length     // Catch:{ a -> 0x0140 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ a -> 0x0140 }
            r7.setDataPosition(r14)     // Catch:{ a -> 0x0140 }
            android.os.Parcelable$Creator<n4.z7> r0 = n4.z7.CREATOR     // Catch:{ a -> 0x0140 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ a -> 0x0140 }
            n4.z7 r0 = (n4.z7) r0     // Catch:{ a -> 0x0140 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            goto L_0x0151
        L_0x013e:
            r0 = move-exception
            goto L_0x0154
        L_0x0140:
            n4.n4 r0 = r9.f9600a     // Catch:{ all -> 0x013e }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x013e }
            n4.g3 r0 = r0.f9828f     // Catch:{ all -> 0x013e }
            java.lang.String r10 = "Failed to load user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x013e }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            r0 = 0
        L_0x0151:
            if (r0 == 0) goto L_0x01aa
            goto L_0x0187
        L_0x0154:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
        L_0x0158:
            if (r0 != r14) goto L_0x018f
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            int r0 = r10.length     // Catch:{ a -> 0x0174 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ a -> 0x0174 }
            r7.setDataPosition(r14)     // Catch:{ a -> 0x0174 }
            android.os.Parcelable$Creator<n4.c> r0 = n4.c.CREATOR     // Catch:{ a -> 0x0174 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ a -> 0x0174 }
            n4.c r0 = (n4.c) r0     // Catch:{ a -> 0x0174 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            goto L_0x0185
        L_0x0172:
            r0 = move-exception
            goto L_0x018b
        L_0x0174:
            n4.n4 r0 = r9.f9600a     // Catch:{ all -> 0x0172 }
            n4.i3 r0 = r0.a()     // Catch:{ all -> 0x0172 }
            n4.g3 r0 = r0.f9828f     // Catch:{ all -> 0x0172 }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x0172 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            r0 = 0
        L_0x0185:
            if (r0 == 0) goto L_0x01aa
        L_0x0187:
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            goto L_0x01aa
        L_0x018b:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
        L_0x018f:
            r7 = 3
            if (r0 != r7) goto L_0x019d
            n4.n4 r0 = r9.f9600a     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            n4.g3 r0 = r0.f9831i     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            java.lang.String r7 = "Skipping app launch break"
            goto L_0x01a7
        L_0x019d:
            n4.n4 r0 = r9.f9600a     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            java.lang.String r7 = "Unknown record type in local database"
        L_0x01a7:
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
        L_0x01aa:
            r10 = r16
            r7 = r17
            goto L_0x00cd
        L_0x01b0:
            r0 = move-exception
            r17 = r7
            goto L_0x01bb
        L_0x01b4:
            r17 = r7
            goto L_0x01bf
        L_0x01b7:
            r0 = move-exception
            r17 = r7
            goto L_0x01c3
        L_0x01bb:
            r18 = 0
            goto L_0x0278
        L_0x01bf:
            r18 = 0
            goto L_0x025e
        L_0x01c3:
            r18 = 0
            goto L_0x0268
        L_0x01c7:
            r17 = r7
            r16 = r10
            java.lang.String r0 = "messages"
            java.lang.String r7 = "rowid <= ?"
            r10 = 1
            java.lang.String[] r14 = new java.lang.String[r10]     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            java.lang.String r10 = java.lang.Long.toString(r25)     // Catch:{ SQLiteFullException -> 0x0208, SQLiteDatabaseLockedException -> 0x01bf, SQLiteException -> 0x0206 }
            r18 = 0
            r14[r18] = r10     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            int r0 = r5.delete(r0, r7, r14)     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            int r7 = r13.size()     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            if (r0 >= r7) goto L_0x01f1
            n4.n4 r0 = r9.f9600a     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            n4.g3 r0 = r0.f9828f     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
        L_0x01f1:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0203, SQLiteDatabaseLockedException -> 0x025e, SQLiteException -> 0x0200 }
            r6.close()
            r5.close()
            r12 = r13
            goto L_0x0307
        L_0x0200:
            r0 = move-exception
            goto L_0x0278
        L_0x0203:
            r0 = move-exception
            goto L_0x0268
        L_0x0206:
            r0 = move-exception
            goto L_0x01bb
        L_0x0208:
            r0 = move-exception
            goto L_0x01c3
        L_0x020a:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01bb
        L_0x0210:
            r17 = r7
            r16 = r10
            goto L_0x01bf
        L_0x0215:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01c3
        L_0x021b:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r18 = 0
            goto L_0x0277
        L_0x0224:
            r17 = r7
            r16 = r10
            r18 = 0
            goto L_0x025d
        L_0x022b:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r18 = 0
            goto L_0x0267
        L_0x0233:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
            goto L_0x0243
        L_0x023b:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
            r14 = 0
        L_0x0243:
            if (r14 == 0) goto L_0x0248
            r14.close()     // Catch:{ SQLiteFullException -> 0x024b, SQLiteDatabaseLockedException -> 0x025d, SQLiteException -> 0x0249, all -> 0x024d }
        L_0x0248:
            throw r0     // Catch:{ SQLiteFullException -> 0x024b, SQLiteDatabaseLockedException -> 0x025d, SQLiteException -> 0x0249, all -> 0x024d }
        L_0x0249:
            r0 = move-exception
            goto L_0x0277
        L_0x024b:
            r0 = move-exception
            goto L_0x0267
        L_0x024d:
            r0 = move-exception
            goto L_0x026c
        L_0x024f:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
            goto L_0x0277
        L_0x0257:
            r18 = r6
            r17 = r7
            r16 = r10
        L_0x025d:
            r6 = 0
        L_0x025e:
            r7 = r13
            goto L_0x02a3
        L_0x0260:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
        L_0x0267:
            r6 = 0
        L_0x0268:
            r7 = r13
            goto L_0x02bb
        L_0x026a:
            r0 = move-exception
            r5 = 0
        L_0x026c:
            r12 = 0
            goto L_0x02e3
        L_0x026f:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
            r5 = 0
        L_0x0277:
            r6 = 0
        L_0x0278:
            if (r5 == 0) goto L_0x0283
            boolean r7 = r5.inTransaction()     // Catch:{ all -> 0x02e1 }
            if (r7 == 0) goto L_0x0283
            r5.endTransaction()     // Catch:{ all -> 0x02e1 }
        L_0x0283:
            n4.n4 r7 = r9.f9600a     // Catch:{ all -> 0x02e1 }
            n4.i3 r7 = r7.a()     // Catch:{ all -> 0x02e1 }
            n4.g3 r7 = r7.f9828f     // Catch:{ all -> 0x02e1 }
            r7.b(r11, r0)     // Catch:{ all -> 0x02e1 }
            r7 = 1
            r9.f9654d = r7     // Catch:{ all -> 0x02e1 }
            if (r6 == 0) goto L_0x0296
            r6.close()
        L_0x0296:
            r7 = r13
            if (r5 == 0) goto L_0x02d3
            goto L_0x02d0
        L_0x029a:
            r18 = r6
            r17 = r7
            r16 = r10
            r7 = r13
            r5 = 0
            r6 = 0
        L_0x02a3:
            long r13 = (long) r12
            android.os.SystemClock.sleep(r13)     // Catch:{ all -> 0x02e1 }
            int r12 = r12 + 20
            if (r6 == 0) goto L_0x02ae
            r6.close()
        L_0x02ae:
            if (r5 == 0) goto L_0x02d3
            goto L_0x02d0
        L_0x02b1:
            r0 = move-exception
            r18 = r6
            r17 = r7
            r16 = r10
            r7 = r13
            r5 = 0
            r6 = 0
        L_0x02bb:
            n4.n4 r10 = r9.f9600a     // Catch:{ all -> 0x02e1 }
            n4.i3 r10 = r10.a()     // Catch:{ all -> 0x02e1 }
            n4.g3 r10 = r10.f9828f     // Catch:{ all -> 0x02e1 }
            r10.b(r11, r0)     // Catch:{ all -> 0x02e1 }
            r10 = 1
            r9.f9654d = r10     // Catch:{ all -> 0x02e1 }
            if (r6 == 0) goto L_0x02ce
            r6.close()
        L_0x02ce:
            if (r5 == 0) goto L_0x02d3
        L_0x02d0:
            r5.close()
        L_0x02d3:
            int r15 = r15 + 1
            r13 = r7
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = 100
            r14 = 5
            goto L_0x0052
        L_0x02e1:
            r0 = move-exception
            r12 = r6
        L_0x02e3:
            if (r12 == 0) goto L_0x02e8
            r12.close()
        L_0x02e8:
            if (r5 == 0) goto L_0x02ed
            r5.close()
        L_0x02ed:
            throw r0
        L_0x02ee:
            r18 = r6
            r17 = r7
            n4.n4 r0 = r9.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.a(r5)
        L_0x02ff:
            r12 = 0
            goto L_0x0307
        L_0x0301:
            r18 = r6
            r17 = r7
            r7 = r13
            r12 = r7
        L_0x0307:
            if (r12 == 0) goto L_0x0312
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L_0x0314
        L_0x0312:
            r5 = r18
        L_0x0314:
            r6 = 100
            if (r3 == 0) goto L_0x031d
            if (r5 >= r6) goto L_0x031d
            r8.add(r3)
        L_0x031d:
            int r7 = r8.size()
            r9 = r18
        L_0x0323:
            if (r9 >= r7) goto L_0x0380
            java.lang.Object r0 = r8.get(r9)
            s3.a r0 = (s3.a) r0
            boolean r10 = r0 instanceof n4.r
            if (r10 == 0) goto L_0x0341
            n4.r r0 = (n4.r) r0     // Catch:{ RemoteException -> 0x0335 }
            r2.q(r0, r4)     // Catch:{ RemoteException -> 0x0335 }
            goto L_0x037d
        L_0x0335:
            r0 = move-exception
            n4.n4 r10 = r1.f9600a
            n4.i3 r10 = r10.a()
            n4.g3 r10 = r10.f9828f
            java.lang.String r11 = "Failed to send event to the service"
            goto L_0x036c
        L_0x0341:
            boolean r10 = r0 instanceof n4.z7
            if (r10 == 0) goto L_0x0357
            n4.z7 r0 = (n4.z7) r0     // Catch:{ RemoteException -> 0x034b }
            r2.D(r0, r4)     // Catch:{ RemoteException -> 0x034b }
            goto L_0x037d
        L_0x034b:
            r0 = move-exception
            n4.n4 r10 = r1.f9600a
            n4.i3 r10 = r10.a()
            n4.g3 r10 = r10.f9828f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L_0x036c
        L_0x0357:
            boolean r10 = r0 instanceof n4.c
            if (r10 == 0) goto L_0x0370
            n4.c r0 = (n4.c) r0     // Catch:{ RemoteException -> 0x0361 }
            r2.k(r0, r4)     // Catch:{ RemoteException -> 0x0361 }
            goto L_0x037d
        L_0x0361:
            r0 = move-exception
            n4.n4 r10 = r1.f9600a
            n4.i3 r10 = r10.a()
            n4.g3 r10 = r10.f9828f
            java.lang.String r11 = "Failed to send conditional user property to the service"
        L_0x036c:
            r10.b(r11, r0)
            goto L_0x037d
        L_0x0370:
            n4.n4 r0 = r1.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.a(r10)
        L_0x037d:
            int r9 = r9 + 1
            goto L_0x0323
        L_0x0380:
            int r7 = r17 + 1
            r0 = r5
            r5 = r6
            r6 = r18
            goto L_0x001d
        L_0x0388:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a7.k(n4.z2, s3.a, n4.g8):void");
    }

    public final void l(c cVar) {
        boolean z9;
        g();
        h();
        this.f9600a.getClass();
        c3 p5 = this.f9600a.p();
        p5.f9600a.x().getClass();
        byte[] X = d8.X(cVar);
        if (X.length > 131072) {
            p5.f9600a.a().f9829g.a("Conditional user property too long for local database. Sending directly to service");
            z9 = false;
        } else {
            z9 = p5.n(2, X);
        }
        s(new v6(this, p(true), z9, new c(cVar)));
    }

    public final boolean m() {
        g();
        h();
        return this.f9613d != null;
    }

    public final boolean n() {
        g();
        h();
        return !o() || this.f9600a.x().h0() >= ((Integer) w2.f10216f0.a((Object) null)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o() {
        /*
            r8 = this;
            r8.g()
            r8.h()
            java.lang.Boolean r0 = r8.f9614e
            if (r0 != 0) goto L_0x0139
            r8.g()
            r8.h()
            n4.n4 r0 = r8.f9600a
            n4.w3 r0 = r0.r()
            r0.g()
            android.content.SharedPreferences r1 = r0.k()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.k()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0133
        L_0x003f:
            n4.n4 r4 = r8.f9600a
            r4.getClass()
            n4.n4 r4 = r8.f9600a
            n4.a3 r4 = r4.o()
            r4.h()
            int r4 = r4.k
            if (r4 != r1) goto L_0x0053
            goto L_0x00fe
        L_0x0053:
            n4.n4 r4 = r8.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9835n
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            n4.n4 r4 = r8.f9600a
            n4.d8 r4 = r4.x()
            r4.getClass()
            o3.f r5 = o3.f.f10556b
            n4.n4 r4 = r4.f9600a
            android.content.Context r4 = r4.f9986a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.b(r4, r6)
            if (r4 == 0) goto L_0x00f1
            if (r4 == r1) goto L_0x00e3
            r5 = 2
            if (r4 == r5) goto L_0x00bf
            r0 = 3
            if (r4 == r0) goto L_0x00b0
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x009a
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9831i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.b(r4, r1)
            goto L_0x00bd
        L_0x009a:
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r3 = "Service updating"
            goto L_0x00fb
        L_0x00a5:
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r1 = "Service invalid"
            goto L_0x00ba
        L_0x00b0:
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9831i
            java.lang.String r1 = "Service disabled"
        L_0x00ba:
            r0.a(r1)
        L_0x00bd:
            r1 = r3
            goto L_0x00ff
        L_0x00bf:
            n4.n4 r4 = r8.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9834m
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            n4.n4 r4 = r8.f9600a
            n4.d8 r4 = r4.x()
            int r4 = r4.h0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00db
            goto L_0x00ff
        L_0x00db:
            if (r0 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            r1 = r3
        L_0x00df:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x00ff
        L_0x00e3:
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x00ff
        L_0x00f1:
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r3 = "Service available"
        L_0x00fb:
            r0.a(r3)
        L_0x00fe:
            r3 = r1
        L_0x00ff:
            if (r3 != 0) goto L_0x0119
            n4.n4 r0 = r8.f9600a
            n4.f r0 = r0.f9992g
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x0119
            n4.n4 r0 = r8.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x0132
        L_0x0119:
            if (r1 == 0) goto L_0x0132
            n4.n4 r0 = r8.f9600a
            n4.w3 r0 = r0.r()
            r0.g()
            android.content.SharedPreferences r0 = r0.k()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0132:
            r1 = r3
        L_0x0133:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f9614e = r0
        L_0x0139:
            java.lang.Boolean r0 = r8.f9614e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a7.o():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n4.g8 p(boolean r39) {
        /*
            r38 = this;
            r1 = r38
            n4.n4 r0 = r1.f9600a
            r0.getClass()
            n4.n4 r0 = r1.f9600a
            n4.a3 r2 = r0.o()
            r3 = 0
            r4 = 0
            if (r39 == 0) goto L_0x00b6
            n4.n4 r0 = r1.f9600a
            n4.i3 r0 = r0.a()
            n4.n4 r6 = r0.f9600a
            n4.w3 r6 = r6.r()
            n4.u3 r6 = r6.f10254d
            if (r6 != 0) goto L_0x0024
            goto L_0x00b6
        L_0x0024:
            n4.n4 r0 = r0.f9600a
            n4.w3 r0 = r0.r()
            n4.u3 r0 = r0.f10254d
            n4.w3 r6 = r0.f10157e
            r6.g()
            n4.w3 r6 = r0.f10157e
            r6.g()
            n4.w3 r6 = r0.f10157e
            android.content.SharedPreferences r6 = r6.k()
            java.lang.String r7 = r0.f10153a
            long r6 = r6.getLong(r7, r4)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x004b
            r0.a()
            r6 = r4
            goto L_0x005d
        L_0x004b:
            n4.w3 r8 = r0.f10157e
            n4.n4 r8 = r8.f9600a
            y3.a r8 = r8.f9998n
            r8.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
        L_0x005d:
            long r8 = r0.f10156d
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            long r8 = r8 + r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x006e
            r0.a()
        L_0x006c:
            r0 = r3
            goto L_0x009c
        L_0x006e:
            n4.w3 r6 = r0.f10157e
            android.content.SharedPreferences r6 = r6.k()
            java.lang.String r7 = r0.f10155c
            java.lang.String r6 = r6.getString(r7, r3)
            n4.w3 r7 = r0.f10157e
            android.content.SharedPreferences r7 = r7.k()
            java.lang.String r8 = r0.f10154b
            long r7 = r7.getLong(r8, r4)
            r0.a()
            if (r6 == 0) goto L_0x009a
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.<init>(r6, r7)
            goto L_0x009c
        L_0x009a:
            android.util.Pair r0 = n4.w3.f10252x
        L_0x009c:
            if (r0 == 0) goto L_0x00b6
            android.util.Pair r6 = n4.w3.f10252x
            if (r0 != r6) goto L_0x00a3
            goto L_0x00b6
        L_0x00a3:
            java.lang.Object r6 = r0.second
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = ":"
            java.lang.String r0 = androidx.fragment.app.w0.d(r6, r7, r0)
            r17 = r0
            goto L_0x00b8
        L_0x00b6:
            r17 = r3
        L_0x00b8:
            r2.g()
            n4.g8 r37 = new n4.g8
            java.lang.String r7 = r2.l()
            java.lang.String r8 = r2.m()
            r2.h()
            java.lang.String r9 = r2.f9588d
            r2.h()
            int r0 = r2.f9589e
            long r10 = (long) r0
            r2.h()
            java.lang.String r0 = r2.f9590f
            r3.o.h(r0)
            java.lang.String r12 = r2.f9590f
            n4.n4 r0 = r2.f9600a
            n4.f r0 = r0.f9992g
            r0.k()
            r2.h()
            r2.g()
            long r13 = r2.f9591g
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r4 = 0
            if (r0 != 0) goto L_0x016f
            n4.n4 r0 = r2.f9600a
            n4.d8 r5 = r0.x()
            n4.n4 r0 = r2.f9600a
            android.content.Context r0 = r0.f9986a
            java.lang.String r6 = r0.getPackageName()
            r5.g()
            r3.o.e(r6)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = n4.d8.o()
            r15 = -1
            if (r14 != 0) goto L_0x011c
            n4.n4 r0 = r5.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9828f
            java.lang.String r5 = "Could not get MD5 instance"
            r0.a(r5)
            goto L_0x016a
        L_0x011c:
            if (r13 == 0) goto L_0x0168
            boolean r6 = r5.R(r0, r6)     // Catch:{ NameNotFoundException -> 0x015a }
            if (r6 != 0) goto L_0x0168
            y3.b r0 = y3.c.a(r0)     // Catch:{ NameNotFoundException -> 0x015a }
            n4.n4 r6 = r5.f9600a     // Catch:{ NameNotFoundException -> 0x015a }
            android.content.Context r6 = r6.f9986a     // Catch:{ NameNotFoundException -> 0x015a }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x015a }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.b(r13, r6)     // Catch:{ NameNotFoundException -> 0x015a }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x015a }
            if (r0 == 0) goto L_0x014c
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x015a }
            if (r6 <= 0) goto L_0x014c
            r0 = r0[r4]     // Catch:{ NameNotFoundException -> 0x015a }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x015a }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x015a }
            long r15 = n4.d8.i0(r0)     // Catch:{ NameNotFoundException -> 0x015a }
            goto L_0x016a
        L_0x014c:
            n4.n4 r0 = r5.f9600a     // Catch:{ NameNotFoundException -> 0x015a }
            n4.i3 r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x015a }
            n4.g3 r0 = r0.f9831i     // Catch:{ NameNotFoundException -> 0x015a }
            java.lang.String r6 = "Could not get signatures"
            r0.a(r6)     // Catch:{ NameNotFoundException -> 0x015a }
            goto L_0x016a
        L_0x015a:
            r0 = move-exception
            n4.n4 r5 = r5.f9600a
            n4.i3 r5 = r5.a()
            n4.g3 r5 = r5.f9828f
            java.lang.String r6 = "Package name not found"
            r5.b(r6, r0)
        L_0x0168:
            r15 = 0
        L_0x016a:
            r5 = r15
            r2.f9591g = r5
            r15 = r5
            goto L_0x0170
        L_0x016f:
            r15 = r13
        L_0x0170:
            n4.n4 r0 = r2.f9600a
            boolean r18 = r0.g()
            n4.n4 r0 = r2.f9600a
            n4.w3 r0 = r0.r()
            boolean r0 = r0.f10265p
            r5 = 1
            r19 = r0 ^ 1
            r2.g()
            n4.n4 r0 = r2.f9600a
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x018d
            goto L_0x01c4
        L_0x018d:
            j4.id r0 = j4.id.f8266b
            j4.m5 r0 = r0.f8267a
            java.lang.Object r0 = r0.zza()
            j4.jd r0 = (j4.jd) r0
            r0.zza()
            n4.n4 r0 = r2.f9600a
            n4.f r0 = r0.f9992g
            n4.v2 r6 = n4.w2.f10208b0
            boolean r0 = r0.o(r3, r6)
            if (r0 == 0) goto L_0x01b4
            n4.n4 r0 = r2.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r4 = "Disabled IID for tests."
            r0.a(r4)
            goto L_0x01c4
        L_0x01b4:
            n4.n4 r0 = r2.f9600a     // Catch:{ ClassNotFoundException -> 0x020d }
            android.content.Context r0 = r0.f9986a     // Catch:{ ClassNotFoundException -> 0x020d }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x020d }
            java.lang.String r6 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x020d }
            if (r0 != 0) goto L_0x01c7
        L_0x01c4:
            r20 = r3
            goto L_0x020f
        L_0x01c7:
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0200 }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r6[r4] = r13     // Catch:{ Exception -> 0x0200 }
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r6)     // Catch:{ Exception -> 0x0200 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0200 }
            n4.n4 r6 = r2.f9600a     // Catch:{ Exception -> 0x0200 }
            android.content.Context r6 = r6.f9986a     // Catch:{ Exception -> 0x0200 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0200 }
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r5)     // Catch:{ Exception -> 0x0200 }
            if (r3 != 0) goto L_0x01e3
            goto L_0x020d
        L_0x01e3:
            java.lang.String r5 = "getFirebaseInstanceId"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x01f5 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x01f5 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x01f5 }
            java.lang.Object r0 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x01f5 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01f5 }
            goto L_0x01c4
        L_0x01f5:
            n4.n4 r0 = r2.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            goto L_0x020a
        L_0x0200:
            n4.n4 r0 = r2.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9832j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
        L_0x020a:
            r0.a(r3)
        L_0x020d:
            r3 = 0
            goto L_0x01c4
        L_0x020f:
            n4.n4 r0 = r2.f9600a
            n4.w3 r3 = r0.r()
            n4.t3 r3 = r3.f10255e
            long r3 = r3.a()
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0224
            long r3 = r0.G
            goto L_0x022a
        L_0x0224:
            long r5 = r0.G
            long r3 = java.lang.Math.min(r5, r3)
        L_0x022a:
            r21 = r3
            r2.h()
            int r0 = r2.k
            n4.n4 r3 = r2.f9600a
            n4.f r3 = r3.f9992g
            java.lang.String r4 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r3 = r3.n(r4)
            if (r3 == 0) goto L_0x0246
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            r3 = 0
            goto L_0x0247
        L_0x0246:
            r3 = 1
        L_0x0247:
            r24 = r3
            n4.n4 r3 = r2.f9600a
            n4.w3 r3 = r3.r()
            r3.g()
            android.content.SharedPreferences r3 = r3.k()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r25 = r3.getBoolean(r4, r5)
            r2.h()
            java.lang.String r3 = r2.f9596m
            n4.n4 r4 = r2.f9600a
            n4.f r4 = r4.f9992g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.n(r5)
            if (r4 != 0) goto L_0x0270
            r4 = 0
            goto L_0x027a
        L_0x0270:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x027a:
            r27 = r4
            long r4 = r2.f9592h
            java.util.List r6 = r2.f9593i
            n4.n4 r13 = r2.f9600a
            n4.w3 r13 = r13.r()
            n4.f5 r13 = r13.m()
            java.lang.String r31 = r13.e()
            java.lang.String r13 = r2.f9594j
            if (r13 != 0) goto L_0x029e
            n4.n4 r13 = r2.f9600a
            n4.d8 r13 = r13.x()
            java.lang.String r13 = r13.m()
            r2.f9594j = r13
        L_0x029e:
            java.lang.String r13 = r2.f9594j
            j4.tc.b()
            n4.n4 r14 = r2.f9600a
            n4.f r14 = r14.f9992g
            n4.v2 r1 = n4.w2.f10224j0
            r23 = r6
            r6 = 0
            boolean r1 = r14.o(r6, r1)
            if (r1 == 0) goto L_0x02ed
            r2.g()
            r1 = r13
            long r13 = r2.f9598o
            r28 = 0
            int r6 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r6 != 0) goto L_0x02c1
            r28 = r4
            goto L_0x02e3
        L_0x02c1:
            n4.n4 r6 = r2.f9600a
            y3.a r6 = r6.f9998n
            r6.getClass()
            long r13 = java.lang.System.currentTimeMillis()
            r28 = r4
            long r4 = r2.f9598o
            long r13 = r13 - r4
            java.lang.String r4 = r2.f9597n
            if (r4 == 0) goto L_0x02e3
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x02e3
            java.lang.String r4 = r2.f9599p
            if (r4 != 0) goto L_0x02e3
            r2.n()
        L_0x02e3:
            java.lang.String r4 = r2.f9597n
            if (r4 != 0) goto L_0x02ea
            r2.n()
        L_0x02ea:
            java.lang.String r4 = r2.f9597n
            goto L_0x02f1
        L_0x02ed:
            r28 = r4
            r1 = r13
            r4 = 0
        L_0x02f1:
            r33 = r4
            n4.n4 r4 = r2.f9600a
            n4.f r4 = r4.f9992g
            n4.n4 r5 = r4.f9600a
            java.lang.String r5 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r4 = r4.n(r5)
            if (r4 != 0) goto L_0x0303
            r4 = 0
            goto L_0x0307
        L_0x0303:
            boolean r4 = r4.booleanValue()
        L_0x0307:
            r34 = r4
            j4.xb.a()
            n4.n4 r4 = r2.f9600a
            n4.f r4 = r4.f9992g
            n4.v2 r5 = n4.w2.f10244v0
            r6 = 0
            boolean r4 = r4.o(r6, r5)
            if (r4 == 0) goto L_0x0357
            n4.n4 r4 = r2.f9600a
            n4.d8 r4 = r4.x()
            java.lang.String r2 = r2.l()
            n4.n4 r5 = r4.f9600a
            android.content.Context r5 = r5.f9986a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 != 0) goto L_0x032e
            goto L_0x0357
        L_0x032e:
            n4.n4 r5 = r4.f9600a     // Catch:{ NameNotFoundException -> 0x0340 }
            android.content.Context r5 = r5.f9986a     // Catch:{ NameNotFoundException -> 0x0340 }
            y3.b r5 = y3.c.a(r5)     // Catch:{ NameNotFoundException -> 0x0340 }
            r6 = 0
            android.content.pm.ApplicationInfo r5 = r5.a(r6, r2)     // Catch:{ NameNotFoundException -> 0x0342 }
            if (r5 == 0) goto L_0x0354
            int r2 = r5.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x0342 }
            goto L_0x0355
        L_0x0340:
            r5 = 0
            r6 = r5
        L_0x0342:
            n4.n4 r5 = r4.f9600a
            r5.getClass()
            n4.n4 r4 = r4.f9600a
            n4.i3 r4 = r4.a()
            n4.g3 r4 = r4.f9833l
            java.lang.String r5 = "PackageManager failed to find running app: app_id"
            r4.b(r5, r2)
        L_0x0354:
            r2 = r6
        L_0x0355:
            long r4 = (long) r2
            goto L_0x0359
        L_0x0357:
            r4 = 0
        L_0x0359:
            r35 = r4
            r13 = 79000(0x13498, double:3.9031E-319)
            r2 = r23
            r6 = r37
            r23 = r0
            r26 = r3
            r30 = r2
            r32 = r1
            r6.<init>(r7, r8, r9, r10, r12, r13, r15, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35)
            return r37
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a7.p(boolean):n4.g8");
    }

    public final void q() {
        g();
        this.f9600a.a().f9835n.b("Processing queued up service tasks", Integer.valueOf(this.f9617h.size()));
        Iterator it = this.f9617h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f9600a.a().f9828f.b("Task exception while flushing queue", e10);
            }
        }
        this.f9617h.clear();
        this.f9618i.a();
    }

    public final void r() {
        g();
        m7 m7Var = this.f9616g;
        m7Var.f9966b = m7Var.f9965a.elapsedRealtime();
        r6 r6Var = this.f9615f;
        this.f9600a.getClass();
        r6Var.c(((Long) w2.J.a((Object) null)).longValue());
    }

    public final void s(Runnable runnable) {
        g();
        if (m()) {
            runnable.run();
            return;
        }
        this.f9600a.getClass();
        if (((long) this.f9617h.size()) >= 1000) {
            this.f9600a.a().f9828f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f9617h.add(runnable);
        this.f9618i.c(60000);
        u();
    }

    public final void u() {
        g3 g3Var;
        String str;
        g();
        h();
        if (!m()) {
            if (o()) {
                z6 z6Var = this.f9612c;
                z6Var.f10352c.g();
                Context context = z6Var.f10352c.f9600a.f9986a;
                synchronized (z6Var) {
                    if (z6Var.f10350a) {
                        g3Var = z6Var.f10352c.f9600a.a().f9835n;
                        str = "Connection attempt already in progress";
                    } else if (z6Var.f10351b == null || (!z6Var.f10351b.h() && !z6Var.f10351b.a())) {
                        z6Var.f10351b = new e3(context, Looper.getMainLooper(), z6Var, z6Var);
                        z6Var.f10352c.f9600a.a().f9835n.a("Connecting to remote service");
                        z6Var.f10350a = true;
                        o.h(z6Var.f10351b);
                        z6Var.f10351b.n();
                    } else {
                        g3Var = z6Var.f10352c.f9600a.a().f9835n;
                        str = "Already awaiting connection attempt";
                    }
                    g3Var.a(str);
                }
            } else if (!this.f9600a.f9992g.s()) {
                this.f9600a.getClass();
                List<ResolveInfo> queryIntentServices = this.f9600a.f9986a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f9600a.f9986a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f9600a.a().f9828f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(this.f9600a.f9986a, "com.google.android.gms.measurement.AppMeasurementService"));
                z6 z6Var2 = this.f9612c;
                z6Var2.f10352c.g();
                Context context2 = z6Var2.f10352c.f9600a.f9986a;
                a b10 = a.b();
                synchronized (z6Var2) {
                    if (z6Var2.f10350a) {
                        z6Var2.f10352c.f9600a.a().f9835n.a("Connection attempt already in progress");
                    } else {
                        z6Var2.f10352c.f9600a.a().f9835n.a("Using local app measurement service");
                        z6Var2.f10350a = true;
                        b10.a(context2, intent, z6Var2.f10352c.f9612c, 129);
                    }
                }
            }
        }
    }

    public final void v() {
        g();
        h();
        z6 z6Var = this.f9612c;
        if (z6Var.f10351b != null && (z6Var.f10351b.a() || z6Var.f10351b.h())) {
            z6Var.f10351b.p();
        }
        z6Var.f10351b = null;
        try {
            a.b().c(this.f9600a.f9986a, this.f9612c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f9613d = null;
    }

    public final void w(AtomicReference atomicReference) {
        g();
        h();
        s(new a1(this, atomicReference, p(false), 2));
    }
}
