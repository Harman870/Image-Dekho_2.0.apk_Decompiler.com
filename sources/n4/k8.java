package n4;

import j4.k3;

public final class k8 {

    /* renamed from: a  reason: collision with root package name */
    public k3 f9896a;

    /* renamed from: b  reason: collision with root package name */
    public Long f9897b;

    /* renamed from: c  reason: collision with root package name */
    public long f9898c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f9899d;

    public /* synthetic */ k8(b bVar) {
        this.f9899d = bVar;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r14 == null) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.k3 a(j4.k3 r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r17
            r8 = r18
            r3 = r19
            java.lang.String r0 = r18.A()
            java.util.List r9 = r18.B()
            n4.b r2 = r1.f9899d
            n4.w7 r2 = r2.f10066b
            r2.O()
            java.lang.String r2 = "_eid"
            java.io.Serializable r4 = n4.y7.m(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x021c
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01d6
            n4.b r0 = r1.f9899d
            n4.w7 r0 = r0.f10066b
            r0.O()
            java.lang.String r0 = "_en"
            java.io.Serializable r0 = n4.y7.m(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0050
            n4.b r0 = r1.f9899d
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9829g
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r5
        L_0x0050:
            j4.k3 r0 = r1.f9896a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.Long r0 = r1.f9897b
            if (r0 == 0) goto L_0x0068
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f9897b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
        L_0x0068:
            n4.b r0 = r1.f9899d
            n4.w7 r0 = r0.f10066b
            n4.i r13 = r0.f10284c
            n4.w7.H(r13)
            r13.g()
            r13.h()
            android.database.sqlite.SQLiteDatabase r0 = r13.z()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            java.lang.String r14 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            r15[r12] = r3     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            java.lang.String r16 = r4.toString()     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            r15[r11] = r16     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            android.database.Cursor r14 = r0.rawQuery(r14, r15)     // Catch:{ SQLiteException -> 0x00e1, all -> 0x00dd }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00c8 }
            if (r0 != 0) goto L_0x00a4
            n4.n4 r0 = r13.f9600a     // Catch:{ SQLiteException -> 0x00c8 }
            n4.i3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x00c8 }
            n4.g3 r0 = r0.f9835n     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00c8 }
            r14.close()
            r0 = r5
            goto L_0x00f6
        L_0x00a4:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00c8 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00c8 }
            j4.j3 r5 = j4.k3.x()     // Catch:{ IOException -> 0x00ca }
            j4.i7 r0 = n4.y7.z(r5, r0)     // Catch:{ IOException -> 0x00ca }
            j4.j3 r0 = (j4.j3) r0     // Catch:{ IOException -> 0x00ca }
            j4.m7 r0 = r0.h()     // Catch:{ IOException -> 0x00ca }
            j4.k3 r0 = (j4.k3) r0     // Catch:{ IOException -> 0x00ca }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00c8 }
            r14.close()
            goto L_0x00f6
        L_0x00c8:
            r0 = move-exception
            goto L_0x00e3
        L_0x00ca:
            r0 = move-exception
            n4.n4 r5 = r13.f9600a     // Catch:{ SQLiteException -> 0x00c8 }
            n4.i3 r5 = r5.a()     // Catch:{ SQLiteException -> 0x00c8 }
            n4.g3 r5 = r5.f9828f     // Catch:{ SQLiteException -> 0x00c8 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            n4.h3 r12 = n4.i3.p(r19)     // Catch:{ SQLiteException -> 0x00c8 }
            r5.d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00c8 }
            goto L_0x00f2
        L_0x00dd:
            r0 = move-exception
            r5 = 0
            goto L_0x01d0
        L_0x00e1:
            r0 = move-exception
            r14 = 0
        L_0x00e3:
            n4.n4 r5 = r13.f9600a     // Catch:{ all -> 0x01ce }
            n4.i3 r5 = r5.a()     // Catch:{ all -> 0x01ce }
            n4.g3 r5 = r5.f9828f     // Catch:{ all -> 0x01ce }
            java.lang.String r12 = "Error selecting main event"
            r5.b(r12, r0)     // Catch:{ all -> 0x01ce }
            if (r14 == 0) goto L_0x00f5
        L_0x00f2:
            r14.close()
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x00fe
            goto L_0x01bd
        L_0x00fe:
            j4.k3 r5 = (j4.k3) r5
            r1.f9896a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f9898c = r12
            n4.b r0 = r1.f9899d
            n4.w7 r0 = r0.f10066b
            r0.O()
            j4.k3 r0 = r1.f9896a
            java.io.Serializable r0 = n4.y7.m(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f9897b = r0
        L_0x011d:
            long r12 = r1.f9898c
            r14 = -1
            long r12 = r12 + r14
            r1.f9898c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x015f
            n4.b r0 = r1.f9899d
            n4.w7 r0 = r0.f10066b
            n4.i r2 = r0.f10284c
            n4.w7.H(r2)
            r2.g()
            n4.n4 r0 = r2.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9835n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.z()     // Catch:{ SQLiteException -> 0x0150 }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0150 }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0150 }
            r0.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0150 }
            goto L_0x0171
        L_0x0150:
            r0 = move-exception
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9828f
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x0171
        L_0x015f:
            n4.b r0 = r1.f9899d
            n4.w7 r0 = r0.f10066b
            n4.i r2 = r0.f10284c
            n4.w7.H(r2)
            long r5 = r1.f9898c
            j4.k3 r7 = r1.f9896a
            r3 = r19
            r2.p(r3, r4, r5, r7)
        L_0x0171:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            j4.k3 r2 = r1.f9896a
            java.util.List r2 = r2.B()
            java.util.Iterator r2 = r2.iterator()
        L_0x0180:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a1
            java.lang.Object r3 = r2.next()
            j4.o3 r3 = (j4.o3) r3
            n4.b r4 = r1.f9899d
            n4.w7 r4 = r4.f10066b
            r4.O()
            java.lang.String r4 = r3.z()
            j4.o3 r4 = n4.y7.l(r8, r4)
            if (r4 != 0) goto L_0x0180
            r0.add(r3)
            goto L_0x0180
        L_0x01a1:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01ac
            r0.addAll(r9)
            r9 = r0
            goto L_0x01bb
        L_0x01ac:
            n4.b r0 = r1.f9899d
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9829g
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.b(r2, r10)
        L_0x01bb:
            r0 = r10
            goto L_0x021c
        L_0x01bd:
            n4.b r0 = r1.f9899d
            n4.n4 r0 = r0.f9600a
            n4.i3 r0 = r0.a()
            n4.g3 r0 = r0.f9829g
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01ce:
            r0 = move-exception
            r5 = r14
        L_0x01d0:
            if (r5 == 0) goto L_0x01d5
            r5.close()
        L_0x01d5:
            throw r0
        L_0x01d6:
            r1.f9897b = r4
            r1.f9896a = r8
            n4.b r2 = r1.f9899d
            n4.w7 r2 = r2.f10066b
            r2.O()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.io.Serializable r5 = n4.y7.m(r8, r5)
            if (r5 == 0) goto L_0x01ee
            r2 = r5
        L_0x01ee:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f9898c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x020a
            n4.b r2 = r1.f9899d
            n4.n4 r2 = r2.f9600a
            n4.i3 r2 = r2.a()
            n4.g3 r2 = r2.f9829g
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.b(r3, r0)
            goto L_0x021c
        L_0x020a:
            n4.b r2 = r1.f9899d
            n4.w7 r2 = r2.f10066b
            n4.i r2 = r2.f10284c
            n4.w7.H(r2)
            long r5 = r1.f9898c
            r3 = r19
            r7 = r18
            r2.p(r3, r4, r5, r7)
        L_0x021c:
            j4.i7 r2 = r18.j()
            j4.j3 r2 = (j4.j3) r2
            r2.j()
            j4.m7 r3 = r2.f8238b
            j4.k3 r3 = (j4.k3) r3
            j4.k3.H(r3, r0)
            r2.j()
            j4.m7 r0 = r2.f8238b
            j4.k3 r0 = (j4.k3) r0
            j4.k3.F(r0)
            r2.j()
            j4.m7 r0 = r2.f8238b
            j4.k3 r0 = (j4.k3) r0
            j4.k3.E(r0, r9)
            j4.m7 r0 = r2.h()
            j4.k3 r0 = (j4.k3) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.k8.a(j4.k3, java.lang.String):j4.k3");
    }
}
