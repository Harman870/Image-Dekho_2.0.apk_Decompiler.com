package a7;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import x.n;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f112a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f113a;

        /* renamed from: b  reason: collision with root package name */
        public final String f114b;

        public a(n nVar, String str) {
            this.f113a = nVar;
            this.f114b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0300 A[SYNTHETIC, Splitter:B:123:0x0300] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x032a A[SYNTHETIC, Splitter:B:129:0x032a] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0421 A[SYNTHETIC, Splitter:B:173:0x0421] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0461 A[SYNTHETIC, Splitter:B:182:0x0461] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a7.e.a a(android.content.Context r14, androidx.lifecycle.p r15) {
        /*
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r1 = "FirebaseMessaging"
            android.content.pm.PackageManager r2 = r14.getPackageManager()
            java.lang.String r3 = r14.getPackageName()
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x002c
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x002c
            goto L_0x002e
        L_0x0019:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r1, r2)
        L_0x002c:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x002e:
            java.lang.String r3 = "gcm.n.android_channel_id"
            java.lang.String r3 = r15.f(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            r6 = 0
            r7 = 3
            if (r4 >= r5) goto L_0x003e
            goto L_0x00c8
        L_0x003e:
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c8 }
            java.lang.String r8 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c8 }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x00c8 }
            int r4 = r4.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00c8 }
            if (r4 >= r5) goto L_0x0050
            goto L_0x00c8
        L_0x0050:
            java.lang.Class<android.app.NotificationManager> r4 = android.app.NotificationManager.class
            java.lang.Object r4 = r14.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x007e
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 == 0) goto L_0x0065
            goto L_0x00c9
        L_0x0065:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Notification Channel requested ("
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r1, r3)
        L_0x007e:
            java.lang.String r3 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r3 = r2.getString(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0094
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 == 0) goto L_0x0091
            goto L_0x00c9
        L_0x0091:
            java.lang.String r3 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            goto L_0x0096
        L_0x0094:
            java.lang.String r3 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
        L_0x0096:
            android.util.Log.w(r1, r3)
            java.lang.String r3 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 != 0) goto L_0x00c9
            android.content.res.Resources r5 = r14.getResources()
            java.lang.String r8 = r14.getPackageName()
            java.lang.String r9 = "fcm_fallback_notification_channel_label"
            java.lang.String r10 = "string"
            int r5 = r5.getIdentifier(r9, r10, r8)
            if (r5 != 0) goto L_0x00bb
            java.lang.String r5 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r1, r5)
            java.lang.String r5 = "Misc"
            goto L_0x00bf
        L_0x00bb:
            java.lang.String r5 = r14.getString(r5)
        L_0x00bf:
            android.app.NotificationChannel r8 = new android.app.NotificationChannel
            r8.<init>(r3, r5, r7)
            r4.createNotificationChannel(r8)
            goto L_0x00c9
        L_0x00c8:
            r3 = 0
        L_0x00c9:
            java.lang.String r4 = r14.getPackageName()
            android.content.res.Resources r5 = r14.getResources()
            android.content.pm.PackageManager r7 = r14.getPackageManager()
            x.n r8 = new x.n
            r8.<init>(r14, r3)
            java.lang.String r3 = "gcm.n.title"
            java.lang.String r3 = r15.e(r5, r4, r3)
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x00ec
            java.lang.CharSequence r3 = x.n.b(r3)
            r8.f12801e = r3
        L_0x00ec:
            java.lang.String r3 = "gcm.n.body"
            java.lang.String r3 = r15.e(r5, r4, r3)
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x010c
            java.lang.CharSequence r9 = x.n.b(r3)
            r8.f12802f = r9
            x.m r9 = new x.m
            r9.<init>()
            java.lang.CharSequence r3 = x.n.b(r3)
            r9.f12796b = r3
            r8.d(r9)
        L_0x010c:
            java.lang.String r3 = "gcm.n.icon"
            java.lang.String r3 = r15.f(r3)
            boolean r9 = android.text.TextUtils.isEmpty(r3)
            if (r9 != 0) goto L_0x014f
            java.lang.String r9 = "drawable"
            int r9 = r5.getIdentifier(r3, r9, r4)
            if (r9 == 0) goto L_0x0127
            boolean r10 = b(r9, r5)
            if (r10 == 0) goto L_0x0127
            goto L_0x0184
        L_0x0127:
            java.lang.String r9 = "mipmap"
            int r9 = r5.getIdentifier(r3, r9, r4)
            if (r9 == 0) goto L_0x0136
            boolean r10 = b(r9, r5)
            if (r10 == 0) goto L_0x0136
            goto L_0x0184
        L_0x0136:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Icon resource "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r3 = " not found. Notification will use default icon."
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            android.util.Log.w(r1, r3)
        L_0x014f:
            java.lang.String r3 = "com.google.firebase.messaging.default_notification_icon"
            int r3 = r2.getInt(r3, r6)
            if (r3 == 0) goto L_0x015d
            boolean r9 = b(r3, r5)
            if (r9 != 0) goto L_0x0178
        L_0x015d:
            android.content.pm.ApplicationInfo r9 = r7.getApplicationInfo(r4, r6)     // Catch:{ NameNotFoundException -> 0x0165 }
            int r0 = r9.icon     // Catch:{ NameNotFoundException -> 0x0165 }
            r9 = r0
            goto L_0x0179
        L_0x0165:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = r10.toString()
            android.util.Log.w(r1, r0)
        L_0x0178:
            r9 = r3
        L_0x0179:
            if (r9 == 0) goto L_0x0181
            boolean r0 = b(r9, r5)
            if (r0 != 0) goto L_0x0184
        L_0x0181:
            r9 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0184:
            android.app.Notification r0 = r8.f12814s
            r0.icon = r9
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r15.f(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x019a
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r15.f(r0)
        L_0x019a:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r9 = 2
            if (r3 == 0) goto L_0x01a3
            r0 = 0
            goto L_0x01d5
        L_0x01a3:
            java.lang.String r3 = "default"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = "raw"
            int r3 = r5.getIdentifier(r0, r3, r4)
            if (r3 == 0) goto L_0x01d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "android.resource://"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = "/raw/"
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01d5
        L_0x01d1:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r9)
        L_0x01d5:
            r3 = -1
            r5 = 4
            if (r0 == 0) goto L_0x01f3
            android.app.Notification r10 = r8.f12814s
            r10.sound = r0
            r10.audioStreamType = r3
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r5)
            r5 = 5
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r5)
            android.media.AudioAttributes r0 = r0.build()
            r10.audioAttributes = r0
        L_0x01f3:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r15.f(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x020d
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            r5.setPackage(r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            goto L_0x0246
        L_0x020d:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r15.f(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x021f
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r15.f(r0)
        L_0x021f:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x022a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x022b
        L_0x022a:
            r0 = 0
        L_0x022b:
            if (r0 == 0) goto L_0x023b
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r5.<init>(r7)
            r5.setPackage(r4)
            r5.setData(r0)
            goto L_0x0246
        L_0x023b:
            android.content.Intent r5 = r7.getLaunchIntentForPackage(r4)
            if (r5 != 0) goto L_0x0246
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r1, r0)
        L_0x0246:
            r0 = 1140850688(0x44000000, float:512.0)
            java.lang.String r4 = "google.c.a.e"
            r7 = 1
            if (r5 != 0) goto L_0x024f
            r5 = 0
            goto L_0x02b3
        L_0x024f:
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            r5.addFlags(r10)
            android.os.Bundle r10 = new android.os.Bundle
            java.lang.Object r11 = r15.f1755a
            android.os.Bundle r11 = (android.os.Bundle) r11
            r10.<init>(r11)
            java.lang.Object r11 = r15.f1755a
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0269:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0297
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "google.c."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0290
            java.lang.String r13 = "gcm.n."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0290
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x028e
            goto L_0x0290
        L_0x028e:
            r13 = r6
            goto L_0x0291
        L_0x0290:
            r13 = r7
        L_0x0291:
            if (r13 == 0) goto L_0x0269
            r10.remove(r12)
            goto L_0x0269
        L_0x0297:
            r5.putExtras(r10)
            boolean r10 = r15.a(r4)
            if (r10 == 0) goto L_0x02a9
            android.os.Bundle r10 = r15.h()
            java.lang.String r11 = "gcm.n.analytics_data"
            r5.putExtra(r11, r10)
        L_0x02a9:
            java.util.concurrent.atomic.AtomicInteger r10 = f112a
            int r10 = r10.incrementAndGet()
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r14, r10, r5, r0)
        L_0x02b3:
            r8.f12803g = r5
            boolean r4 = r15.a(r4)
            if (r4 != 0) goto L_0x02bd
            r0 = 0
            goto L_0x02ee
        L_0x02bd:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r4.<init>(r5)
            android.os.Bundle r5 = r15.h()
            android.content.Intent r4 = r4.putExtras(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = f112a
            int r5 = r5.incrementAndGet()
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.MESSAGING_EVENT"
            r10.<init>(r11)
            android.content.ComponentName r11 = new android.content.ComponentName
            java.lang.String r12 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r11.<init>(r14, r12)
            android.content.Intent r10 = r10.setComponent(r11)
            java.lang.String r11 = "wrapped_intent"
            android.content.Intent r4 = r10.putExtra(r11, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r14, r5, r4, r0)
        L_0x02ee:
            if (r0 == 0) goto L_0x02f4
            android.app.Notification r4 = r8.f12814s
            r4.deleteIntent = r0
        L_0x02f4:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r15.f(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0322
            int r4 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x0309 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0309 }
            goto L_0x033b
        L_0x0309:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Color is invalid: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r1, r0)
        L_0x0322:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r2.getInt(r0, r6)
            if (r0 == 0) goto L_0x033a
            java.lang.Object r2 = y.a.f13006a     // Catch:{ NotFoundException -> 0x0335 }
            int r14 = y.a.c.a(r14, r0)     // Catch:{ NotFoundException -> 0x0335 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x0335 }
            goto L_0x033b
        L_0x0335:
            java.lang.String r14 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r14)
        L_0x033a:
            r14 = 0
        L_0x033b:
            if (r14 == 0) goto L_0x0343
            int r14 = r14.intValue()
            r8.f12810o = r14
        L_0x0343:
            java.lang.String r14 = "gcm.n.sticky"
            boolean r14 = r15.a(r14)
            r14 = r14 ^ r7
            if (r14 == 0) goto L_0x0353
            android.app.Notification r14 = r8.f12814s
            int r0 = r14.flags
            r0 = r0 | 16
            goto L_0x0359
        L_0x0353:
            android.app.Notification r14 = r8.f12814s
            int r0 = r14.flags
            r0 = r0 & -17
        L_0x0359:
            r14.flags = r0
            java.lang.String r14 = "gcm.n.local_only"
            boolean r14 = r15.a(r14)
            r8.f12808m = r14
            java.lang.String r14 = "gcm.n.ticker"
            java.lang.String r14 = r15.f(r14)
            if (r14 == 0) goto L_0x0373
            android.app.Notification r0 = r8.f12814s
            java.lang.CharSequence r14 = x.n.b(r14)
            r0.tickerText = r14
        L_0x0373:
            java.lang.String r14 = "gcm.n.notification_priority"
            java.lang.Integer r14 = r15.c(r14)
            r0 = -2
            if (r14 != 0) goto L_0x037d
            goto L_0x03a2
        L_0x037d:
            int r2 = r14.intValue()
            if (r2 < r0) goto L_0x0389
            int r2 = r14.intValue()
            if (r2 <= r9) goto L_0x03a3
        L_0x0389:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "notificationPriority is invalid "
            r2.append(r4)
            r2.append(r14)
            java.lang.String r14 = ". Skipping setting notificationPriority."
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            android.util.Log.w(r1, r14)
        L_0x03a2:
            r14 = 0
        L_0x03a3:
            if (r14 == 0) goto L_0x03ab
            int r14 = r14.intValue()
            r8.f12806j = r14
        L_0x03ab:
            java.lang.String r14 = "gcm.n.visibility"
            java.lang.Integer r14 = r15.c(r14)
            java.lang.String r2 = "NotificationParams"
            if (r14 != 0) goto L_0x03b6
            goto L_0x03db
        L_0x03b6:
            int r4 = r14.intValue()
            if (r4 < r3) goto L_0x03c2
            int r3 = r14.intValue()
            if (r3 <= r7) goto L_0x03dc
        L_0x03c2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "visibility is invalid: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r14 = ". Skipping setting visibility."
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            android.util.Log.w(r2, r14)
        L_0x03db:
            r14 = 0
        L_0x03dc:
            if (r14 == 0) goto L_0x03e4
            int r14 = r14.intValue()
            r8.f12811p = r14
        L_0x03e4:
            java.lang.String r14 = "gcm.n.notification_count"
            java.lang.Integer r14 = r15.c(r14)
            if (r14 != 0) goto L_0x03ed
            goto L_0x040c
        L_0x03ed:
            int r3 = r14.intValue()
            if (r3 >= 0) goto L_0x040d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notificationCount is invalid: "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r14 = ". Skipping setting notificationCount."
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            android.util.Log.w(r1, r14)
        L_0x040c:
            r14 = 0
        L_0x040d:
            if (r14 == 0) goto L_0x0415
            int r14 = r14.intValue()
            r8.f12805i = r14
        L_0x0415:
            java.lang.String r14 = "gcm.n.event_time"
            java.lang.String r1 = r15.f(r14)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x044b
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x042a }
            java.lang.Long r14 = java.lang.Long.valueOf(r3)     // Catch:{ NumberFormatException -> 0x042a }
            goto L_0x044c
        L_0x042a:
            java.lang.String r3 = "Couldn't parse value of "
            java.lang.StringBuilder r3 = androidx.activity.f.g(r3)
            java.lang.String r14 = androidx.lifecycle.p.i(r14)
            r3.append(r14)
            java.lang.String r14 = "("
            r3.append(r14)
            r3.append(r1)
            java.lang.String r14 = ") into a long"
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            android.util.Log.w(r2, r14)
        L_0x044b:
            r14 = 0
        L_0x044c:
            if (r14 == 0) goto L_0x0458
            r8.k = r7
            long r3 = r14.longValue()
            android.app.Notification r14 = r8.f12814s
            r14.when = r3
        L_0x0458:
            java.lang.String r14 = "gcm.n.vibrate_timings"
            org.json.JSONArray r14 = r15.d(r14)
            if (r14 != 0) goto L_0x0461
            goto L_0x049a
        L_0x0461:
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            if (r1 <= r7) goto L_0x0479
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            long[] r3 = new long[r1]     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            r4 = r6
        L_0x046e:
            if (r4 >= r1) goto L_0x049b
            long r10 = r14.optLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            r3[r4] = r10     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            int r4 = r4 + 1
            goto L_0x046e
        L_0x0479:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            java.lang.String r3 = "vibrateTimings have invalid length"
            r1.<init>(r3)     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
            throw r1     // Catch:{ NumberFormatException | JSONException -> 0x0481 }
        L_0x0481:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "User defined vibrateTimings is invalid: "
            r1.append(r3)
            r1.append(r14)
            java.lang.String r14 = ". Skipping setting vibrateTimings."
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.w(r2, r14)
        L_0x049a:
            r3 = 0
        L_0x049b:
            if (r3 == 0) goto L_0x04a1
            android.app.Notification r14 = r8.f12814s
            r14.vibrate = r3
        L_0x04a1:
            java.lang.String r14 = ". Skipping setting LightSettings"
            java.lang.String r1 = "LightSettings is invalid: "
            java.lang.String r3 = "gcm.n.light_settings"
            org.json.JSONArray r3 = r15.d(r3)
            if (r3 != 0) goto L_0x04ae
            goto L_0x0517
        L_0x04ae:
            r4 = 3
            int[] r5 = new int[r4]
            int r10 = r3.length()     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            if (r10 != r4) goto L_0x04da
            java.lang.String r4 = r3.optString(r6)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r4 == r10) goto L_0x04d2
            r5[r6] = r4     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            int r4 = r3.optInt(r7)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            r5[r7] = r4     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            int r4 = r3.optInt(r9)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            r5[r9] = r4     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            goto L_0x0518
        L_0x04d2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            java.lang.String r5 = "Transparent color is invalid"
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            throw r4     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
        L_0x04da:
            org.json.JSONException r4 = new org.json.JSONException     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            java.lang.String r5 = "lightSettings don't have all three fields"
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
            throw r4     // Catch:{ JSONException -> 0x0502, IllegalArgumentException -> 0x04e2 }
        L_0x04e2:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = ". "
            r5.append(r1)
            java.lang.String r1 = r4.getMessage()
            r5.append(r1)
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            goto L_0x0514
        L_0x0502:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
        L_0x0514:
            android.util.Log.w(r2, r14)
        L_0x0517:
            r5 = 0
        L_0x0518:
            if (r5 == 0) goto L_0x0533
            r14 = r5[r6]
            r1 = r5[r7]
            r2 = r5[r9]
            android.app.Notification r3 = r8.f12814s
            r3.ledARGB = r14
            r3.ledOnMS = r1
            r3.ledOffMS = r2
            if (r1 == 0) goto L_0x052d
            if (r2 == 0) goto L_0x052d
            r6 = r7
        L_0x052d:
            int r14 = r3.flags
            r14 = r14 & r0
            r14 = r14 | r6
            r3.flags = r14
        L_0x0533:
            java.lang.String r14 = "gcm.n.default_sound"
            boolean r14 = r15.a(r14)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r15.a(r0)
            if (r0 == 0) goto L_0x0543
            r14 = r14 | 2
        L_0x0543:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r15.a(r0)
            if (r0 == 0) goto L_0x054d
            r14 = r14 | 4
        L_0x054d:
            android.app.Notification r0 = r8.f12814s
            r0.defaults = r14
            r14 = r14 & 4
            if (r14 == 0) goto L_0x055a
            int r14 = r0.flags
            r14 = r14 | r7
            r0.flags = r14
        L_0x055a:
            a7.e$a r14 = new a7.e$a
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r15 = r15.f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0569
            goto L_0x057a
        L_0x0569:
            java.lang.String r15 = "FCM-Notification:"
            java.lang.StringBuilder r15 = androidx.activity.f.g(r15)
            long r0 = android.os.SystemClock.uptimeMillis()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
        L_0x057a:
            r14.<init>(r8, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.e.a(android.content.Context, androidx.lifecycle.p):a7.e$a");
    }

    @TargetApi(26)
    public static boolean b(int i10, Resources resources) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
