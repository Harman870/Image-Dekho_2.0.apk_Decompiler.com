package d3;

import d3.x;
import java.util.Map;
import z2.a;

public final /* synthetic */ class n implements x.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f6070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f6071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.C0176a f6072c;

    public /* synthetic */ n(x xVar, Map map, a.C0176a aVar) {
        this.f6070a = xVar;
        this.f6071b = map;
        this.f6072c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r10) {
        /*
            r9 = this;
            d3.x r0 = r9.f6070a
            java.util.Map r1 = r9.f6071b
            z2.a$a r2 = r9.f6072c
            android.database.Cursor r10 = (android.database.Cursor) r10
            r0.getClass()
            z2.c$a r3 = z2.c.a.REASON_UNKNOWN
        L_0x000d:
            boolean r4 = r10.moveToNext()
            r5 = 0
            if (r4 == 0) goto L_0x0070
            java.lang.String r4 = r10.getString(r5)
            r5 = 1
            int r6 = r10.getInt(r5)
            r7 = 2
            if (r6 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            z2.c$a r8 = z2.c.a.MESSAGE_TOO_OLD
            if (r6 != r5) goto L_0x0026
            goto L_0x004f
        L_0x0026:
            z2.c$a r8 = z2.c.a.CACHE_FULL
            if (r6 != r7) goto L_0x002b
            goto L_0x004f
        L_0x002b:
            z2.c$a r8 = z2.c.a.PAYLOAD_TOO_BIG
            r5 = 3
            if (r6 != r5) goto L_0x0031
            goto L_0x004f
        L_0x0031:
            z2.c$a r8 = z2.c.a.MAX_RETRIES_REACHED
            r5 = 4
            if (r6 != r5) goto L_0x0037
            goto L_0x004f
        L_0x0037:
            z2.c$a r8 = z2.c.a.INVALID_PAYLOD
            r5 = 5
            if (r6 != r5) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            z2.c$a r8 = z2.c.a.SERVER_ERROR
            r5 = 6
            if (r6 != r5) goto L_0x0043
            goto L_0x004f
        L_0x0043:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = "SQLiteEventStore"
            java.lang.String r8 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            a3.a.a(r5, r6, r8)
        L_0x004e:
            r8 = r3
        L_0x004f:
            long r5 = r10.getLong(r7)
            boolean r7 = r1.containsKey(r4)
            if (r7 != 0) goto L_0x0061
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.put(r4, r7)
        L_0x0061:
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            z2.c r7 = new z2.c
            r7.<init>(r5, r8)
            r4.add(r7)
            goto L_0x000d
        L_0x0070:
            java.util.Set r10 = r1.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0078:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r3 = z2.d.f13167c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            z2.d r4 = new z2.d
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r4.<init>(r3, r1)
            java.util.ArrayList r1 = r2.f13152b
            r1.add(r4)
            goto L_0x0078
        L_0x00a6:
            f3.a r10 = r0.f6092b
            long r3 = r10.a()
            android.database.sqlite.SQLiteDatabase r10 = r0.s()
            r10.beginTransaction()
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0117 }
            java.lang.String r5 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r1 = r10.rawQuery(r5, r1)     // Catch:{ all -> 0x0117 }
            d3.p r5 = new d3.p     // Catch:{ all -> 0x0117 }
            r5.<init>(r3)     // Catch:{ all -> 0x0117 }
            java.lang.Object r1 = d3.x.E(r1, r5)     // Catch:{ all -> 0x0117 }
            z2.f r1 = (z2.f) r1     // Catch:{ all -> 0x0117 }
            r10.setTransactionSuccessful()     // Catch:{ all -> 0x0117 }
            r10.endTransaction()
            r2.f13151a = r1
            android.database.sqlite.SQLiteDatabase r10 = r0.s()
            java.lang.String r1 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r1)
            long r3 = r10.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r10 = r0.s()
            java.lang.String r1 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r1)
            long r5 = r10.simpleQueryForLong()
            long r5 = r5 * r3
            d3.a r10 = d3.e.f6052a
            long r3 = r10.f6044b
            z2.e r10 = new z2.e
            r10.<init>(r5, r3)
            z2.b r1 = new z2.b
            r1.<init>(r10)
            r2.f13153c = r1
            n8.a<java.lang.String> r10 = r0.f6095e
            java.lang.Object r10 = r10.get()
            java.lang.String r10 = (java.lang.String) r10
            r2.f13154d = r10
            z2.a r10 = new z2.a
            z2.f r0 = r2.f13151a
            java.util.ArrayList r1 = r2.f13152b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            z2.b r3 = r2.f13153c
            java.lang.String r2 = r2.f13154d
            r10.<init>(r0, r1, r3, r2)
            return r10
        L_0x0117:
            r0 = move-exception
            r10.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.n.apply(java.lang.Object):java.lang.Object");
    }
}
