package com.google.firebase.messaging;

import a7.d0;
import a7.j;
import android.content.Intent;
import java.util.ArrayDeque;

public class FirebaseMessagingService extends j {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque f3501g = new ArrayDeque(10);

    public final Intent b(Intent intent) {
        return (Intent) d0.a().f111d.poll();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0292, code lost:
        if (r0.isEmpty() != false) goto L_0x02a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r27) {
        /*
            r26 = this;
            r1 = r27
            java.lang.String r0 = r27.getAction()
            java.lang.String r2 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r2 = r2.equals(r0)
            java.lang.String r3 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r4 = "FirebaseMessaging"
            if (r2 != 0) goto L_0x003f
            boolean r2 = r3.equals(r0)
            if (r2 == 0) goto L_0x0019
            goto L_0x003f
        L_0x0019:
            java.lang.String r2 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "token"
            r1.getStringExtra(r0)
            goto L_0x003b
        L_0x0027:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
            java.lang.String r1 = r27.getAction()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x003b:
            r5 = r26
            goto L_0x0331
        L_0x003f:
            java.lang.String r0 = "google.message_id"
            java.lang.String r2 = r1.getStringExtra(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            r6 = 0
            r7 = 1
            r8 = 3
            if (r5 == 0) goto L_0x004f
            goto L_0x0081
        L_0x004f:
            java.util.ArrayDeque r5 = f3501g
            boolean r9 = r5.contains(r2)
            if (r9 == 0) goto L_0x0073
            boolean r5 = android.util.Log.isLoggable(r4, r8)
            if (r5 == 0) goto L_0x0071
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Received duplicate message: "
            r5.append(r9)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.d(r4, r2)
        L_0x0071:
            r2 = r7
            goto L_0x0082
        L_0x0073:
            int r9 = r5.size()
            r10 = 10
            if (r9 < r10) goto L_0x007e
            r5.remove()
        L_0x007e:
            r5.add(r2)
        L_0x0081:
            r2 = r6
        L_0x0082:
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = "message_type"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r5 = "gcm"
            if (r2 != 0) goto L_0x008f
            r2 = r5
        L_0x008f:
            r9 = -1
            int r10 = r2.hashCode()
            r11 = 2
            switch(r10) {
                case -2062414158: goto L_0x00b8;
                case 102161: goto L_0x00af;
                case 814694033: goto L_0x00a4;
                case 814800675: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00c2
        L_0x0099:
            java.lang.String r5 = "send_event"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00a2
            goto L_0x00c2
        L_0x00a2:
            r9 = r8
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "send_error"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00ad
            goto L_0x00c2
        L_0x00ad:
            r9 = r11
            goto L_0x00c2
        L_0x00af:
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00b6
            goto L_0x00c2
        L_0x00b6:
            r9 = r7
            goto L_0x00c2
        L_0x00b8:
            java.lang.String r5 = "deleted_messages"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r9 = r6
        L_0x00c2:
            java.lang.String r5 = "message_id"
            if (r9 == 0) goto L_0x003b
            if (r9 == r7) goto L_0x00fd
            if (r9 == r11) goto L_0x00e7
            if (r9 == r8) goto L_0x00e2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Received message with unknown type: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            goto L_0x003b
        L_0x00e2:
            r1.getStringExtra(r0)
            goto L_0x003b
        L_0x00e7:
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x00f0
            r1.getStringExtra(r5)
        L_0x00f0:
            a7.c0 r0 = new a7.c0
            java.lang.String r2 = "error"
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.<init>(r1)
            goto L_0x003b
        L_0x00fd:
            boolean r2 = a7.r.b(r27)
            if (r2 == 0) goto L_0x010c
            android.os.Bundle r2 = r27.getExtras()
            java.lang.String r8 = "_nr"
            a7.r.a(r8, r2)
        L_0x010c:
            java.lang.String r2 = r27.getAction()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0117
            goto L_0x0160
        L_0x0117:
            java.lang.String r2 = "delivery_metrics_exported_to_big_query_enabled"
            c6.f.d()     // Catch:{ IllegalStateException -> 0x015b }
            c6.f r3 = c6.f.d()
            r3.a()
            android.content.Context r3 = r3.f2494a
            java.lang.String r8 = "com.google.firebase.messaging"
            android.content.SharedPreferences r8 = r3.getSharedPreferences(r8, r6)
            java.lang.String r9 = "export_to_big_query"
            boolean r10 = r8.contains(r9)
            if (r10 == 0) goto L_0x0138
            boolean r2 = r8.getBoolean(r9, r6)
            goto L_0x0161
        L_0x0138:
            android.content.pm.PackageManager r8 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0160 }
            if (r8 == 0) goto L_0x0160
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0160 }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r8.getApplicationInfo(r3, r9)     // Catch:{ NameNotFoundException -> 0x0160 }
            if (r3 == 0) goto L_0x0160
            android.os.Bundle r8 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0160 }
            if (r8 == 0) goto L_0x0160
            boolean r8 = r8.containsKey(r2)     // Catch:{ NameNotFoundException -> 0x0160 }
            if (r8 == 0) goto L_0x0160
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x0160 }
            boolean r2 = r3.getBoolean(r2, r6)     // Catch:{ NameNotFoundException -> 0x0160 }
            goto L_0x0161
        L_0x015b:
            java.lang.String r2 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r4, r2)
        L_0x0160:
            r2 = r6
        L_0x0161:
            if (r2 == 0) goto L_0x02dd
            b7.a$a r23 = b7.a.C0021a.MESSAGE_DELIVERED
            t2.e r2 = com.google.firebase.messaging.FirebaseMessaging.f3485m
            if (r2 != 0) goto L_0x0170
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r4, r0)
            goto L_0x02dd
        L_0x0170:
            android.os.Bundle r3 = r27.getExtras()
            if (r3 != 0) goto L_0x0178
            android.os.Bundle r3 = android.os.Bundle.EMPTY
        L_0x0178:
            java.lang.String r8 = ""
            java.lang.String r9 = "google.ttl"
            java.lang.Object r9 = r3.get(r9)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x018b
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r6 = r9.intValue()
            goto L_0x01ab
        L_0x018b:
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L_0x01ab
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0197 }
            int r6 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0197 }
            goto L_0x01ab
        L_0x0197:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Invalid TTL: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.w(r4, r9)
        L_0x01ab:
            r21 = r6
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r3.getString(r6)
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto L_0x01bc
        L_0x01b9:
            r16 = r6
            goto L_0x01d5
        L_0x01bc:
            c6.f r6 = c6.f.d()     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            java.lang.Object r9 = v6.e.f12626m     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            java.lang.Class<v6.f> r9 = v6.f.class
            java.lang.Object r6 = r6.b(r9)     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            v6.e r6 = (v6.e) r6     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6)     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x02d6, InterruptedException -> 0x02d4 }
            goto L_0x01b9
        L_0x01d5:
            c6.f r6 = c6.f.d()
            r6.a()
            android.content.Context r6 = r6.f2494a
            java.lang.String r19 = r6.getPackageName()
            b7.a$c r18 = b7.a.c.ANDROID
            boolean r6 = androidx.lifecycle.p.g(r3)
            if (r6 == 0) goto L_0x01ed
            b7.a$b r6 = b7.a.b.DISPLAY_NOTIFICATION
            goto L_0x01ef
        L_0x01ed:
            b7.a$b r6 = b7.a.b.DATA_MESSAGE
        L_0x01ef:
            r17 = r6
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = r3.getString(r5)
        L_0x01fb:
            if (r0 == 0) goto L_0x01ff
            r15 = r0
            goto L_0x0200
        L_0x01ff:
            r15 = r8
        L_0x0200:
            java.lang.String r0 = "from"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0211
            java.lang.String r5 = "/topics/"
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r0 = 0
        L_0x0212:
            if (r0 == 0) goto L_0x0217
            r22 = r0
            goto L_0x0219
        L_0x0217:
            r22 = r8
        L_0x0219:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0224
            r20 = r0
            goto L_0x0226
        L_0x0224:
            r20 = r8
        L_0x0226:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x0231
            r24 = r0
            goto L_0x0233
        L_0x0231:
            r24 = r8
        L_0x0233:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r3.getString(r0)
            if (r0 == 0) goto L_0x023e
            r25 = r0
            goto L_0x0240
        L_0x023e:
            r25 = r8
        L_0x0240:
            java.lang.String r0 = "google.c.sender.id"
            boolean r5 = r3.containsKey(r0)
            r8 = 0
            if (r5 == 0) goto L_0x0259
            java.lang.String r0 = r3.getString(r0)     // Catch:{ NumberFormatException -> 0x0253 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x02a2
        L_0x0253:
            r0 = move-exception
            java.lang.String r3 = "error parsing project number"
            android.util.Log.w(r4, r3, r0)
        L_0x0259:
            c6.f r3 = c6.f.d()
            r3.a()
            c6.i r0 = r3.f2496c
            java.lang.String r0 = r0.f2510e
            if (r0 == 0) goto L_0x0272
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x026b }
            goto L_0x02a2
        L_0x026b:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r4, r0, r5)
        L_0x0272:
            r3.a()
            c6.i r0 = r3.f2496c
            java.lang.String r0 = r0.f2507b
            java.lang.String r3 = "1:"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x0282
            goto L_0x0295
        L_0x0282:
            java.lang.String r3 = ":"
            java.lang.String[] r0 = r0.split(r3)
            int r3 = r0.length
            if (r3 >= r11) goto L_0x028c
            goto L_0x02a1
        L_0x028c:
            r0 = r0[r7]
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0295
            goto L_0x02a1
        L_0x0295:
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x029a }
            goto L_0x02a2
        L_0x029a:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "error parsing app ID"
            android.util.Log.w(r4, r0, r3)
        L_0x02a1:
            r5 = r8
        L_0x02a2:
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a8
            r13 = r5
            goto L_0x02a9
        L_0x02a8:
            r13 = r8
        L_0x02a9:
            b7.a r0 = new b7.a
            r12 = r0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r3 = "proto"
            t2.b r5 = new t2.b     // Catch:{ RuntimeException -> 0x02cd }
            r5.<init>(r3)     // Catch:{ RuntimeException -> 0x02cd }
            d3.s r3 = new d3.s     // Catch:{ RuntimeException -> 0x02cd }
            r3.<init>(r7)     // Catch:{ RuntimeException -> 0x02cd }
            w2.v r2 = r2.a(r5, r3)     // Catch:{ RuntimeException -> 0x02cd }
            b7.b r3 = new b7.b     // Catch:{ RuntimeException -> 0x02cd }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x02cd }
            t2.a r0 = new t2.a     // Catch:{ RuntimeException -> 0x02cd }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x02cd }
            r2.a(r0)     // Catch:{ RuntimeException -> 0x02cd }
            goto L_0x02dd
        L_0x02cd:
            r0 = move-exception
            java.lang.String r2 = "Failed to send big query analytics payload."
            android.util.Log.w(r4, r2, r0)
            goto L_0x02dd
        L_0x02d4:
            r0 = move-exception
            goto L_0x02d7
        L_0x02d6:
            r0 = move-exception
        L_0x02d7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x02dd:
            android.os.Bundle r0 = r27.getExtras()
            if (r0 != 0) goto L_0x02e8
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x02e8:
            java.lang.String r2 = "androidx.content.wakelockid"
            r0.remove(r2)
            boolean r2 = androidx.lifecycle.p.g(r0)
            if (r2 == 0) goto L_0x032a
            androidx.lifecycle.p r2 = new androidx.lifecycle.p
            r2.<init>((android.os.Bundle) r0)
            x3.a r3 = new x3.a
            java.lang.String r4 = "Firebase-Messaging-Network-Io"
            r3.<init>(r4)
            java.util.concurrent.ExecutorService r3 = java.util.concurrent.Executors.newSingleThreadExecutor(r3)
            a7.g r4 = new a7.g
            r5 = r26
            r4.<init>(r5, r2, r3)
            boolean r2 = r4.a()     // Catch:{ all -> 0x0324 }
            r3.shutdown()
            if (r2 == 0) goto L_0x0314
            goto L_0x0331
        L_0x0314:
            boolean r2 = a7.r.b(r27)
            if (r2 == 0) goto L_0x032c
            android.os.Bundle r1 = r27.getExtras()
            java.lang.String r2 = "_nf"
            a7.r.a(r2, r1)
            goto L_0x032c
        L_0x0324:
            r0 = move-exception
            r1 = r0
            r3.shutdown()
            throw r1
        L_0x032a:
            r5 = r26
        L_0x032c:
            a7.y r1 = new a7.y
            r1.<init>(r0)
        L_0x0331:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }
}
