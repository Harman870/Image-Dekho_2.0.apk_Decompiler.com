package o3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import w3.d;
import y3.c;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10555a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f10556b = new f();

    static {
        AtomicBoolean atomicBoolean = i.f10562a;
    }

    public Intent a(Context context, String str, int i10) {
        if (i10 == 1 || i10 == 2) {
            if (context == null || !d.a(context)) {
                StringBuilder g10 = androidx.activity.f.g("gcore_");
                g10.append(f10555a);
                g10.append("-");
                if (!TextUtils.isEmpty(str)) {
                    g10.append(str);
                }
                g10.append("-");
                if (context != null) {
                    g10.append(context.getPackageName());
                }
                g10.append("-");
                if (context != null) {
                    try {
                        g10.append(c.a(context).b(0, context.getPackageName()).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb = g10.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i10 != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x019d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(android.content.Context r10, int r11) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = o3.i.f10562a
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x000d }
            r1 = 2131951672(0x7f130038, float:1.9539765E38)
            r0.getString(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0014:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = o3.i.f10565d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x002a
            goto L_0x0077
        L_0x002a:
            java.lang.Object r0 = r3.p0.f11620a
            monitor-enter(r0)
            boolean r2 = r3.p0.f11621b     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            r3.p0.f11621b = r1     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0074 }
            y3.b r3 = y3.c.a(r10)     // Catch:{ all -> 0x0074 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r4, r2)     // Catch:{ NameNotFoundException -> 0x0055 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0055 }
            if (r2 != 0) goto L_0x0047
            goto L_0x005d
        L_0x0047:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0055 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0055 }
            r3.p0.f11622c = r2     // Catch:{ NameNotFoundException -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0074 }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            int r0 = r3.p0.f11622c
            if (r0 == 0) goto L_0x006e
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0068
            goto L_0x0077
        L_0x0068:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r0)
            throw r10
        L_0x006e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x0074:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r10
        L_0x0077:
            boolean r0 = w3.d.a(r10)
            r2 = 0
            if (r0 != 0) goto L_0x00ae
            java.lang.Boolean r0 = w3.d.f12743c
            if (r0 != 0) goto L_0x00a4
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x009d
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r0 = r2
            goto L_0x009e
        L_0x009d:
            r0 = r1
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            w3.d.f12743c = r0
        L_0x00a4:
            java.lang.Boolean r0 = w3.d.f12743c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ae
            r0 = r1
            goto L_0x00af
        L_0x00ae:
            r0 = r2
        L_0x00af:
            if (r11 < 0) goto L_0x00b3
            r3 = r1
            goto L_0x00b4
        L_0x00b3:
            r3 = r2
        L_0x00b4:
            r3.o.b(r3)
            java.lang.String r3 = r10.getPackageName()
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00d3
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00cc }
            goto L_0x00d4
        L_0x00cc:
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            goto L_0x0116
        L_0x00d3:
            r6 = 0
        L_0x00d4:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x017d }
            o3.j.a(r10)
            boolean r8 = o3.j.d(r7, r1)
            if (r8 != 0) goto L_0x00ec
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            goto L_0x0116
        L_0x00ec:
            if (r0 == 0) goto L_0x00fe
            r3.o.h(r6)
            boolean r8 = o3.j.d(r6, r1)
            if (r8 != 0) goto L_0x00fe
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x0116
        L_0x00fe:
            if (r0 == 0) goto L_0x0121
            if (r6 == 0) goto L_0x0121
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r6 = r7.signatures
            r6 = r6[r2]
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0121
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
        L_0x0116:
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x018d
        L_0x0121:
            int r0 = r7.versionCode
            r5 = -1
            if (r0 != r5) goto L_0x0128
            r6 = r5
            goto L_0x012a
        L_0x0128:
            int r6 = r0 / 1000
        L_0x012a:
            if (r11 != r5) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            int r5 = r11 / 1000
        L_0x012f:
            if (r6 >= r5) goto L_0x0159
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Google Play services out of date for "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = ".  Requires "
            r4.append(r3)
            r4.append(r11)
            java.lang.String r11 = " but found "
            r4.append(r11)
            r4.append(r0)
            java.lang.String r11 = r4.toString()
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.w(r0, r11)
            r5 = 2
            goto L_0x018d
        L_0x0159:
            android.content.pm.ApplicationInfo r11 = r7.applicationInfo
            if (r11 != 0) goto L_0x0175
            java.lang.String r11 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r11 = r4.getApplicationInfo(r11, r2)     // Catch:{ NameNotFoundException -> 0x0164 }
            goto L_0x0175
        L_0x0164:
            r11 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = "GooglePlayServicesUtil"
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r4, r0, r11)
            goto L_0x018c
        L_0x0175:
            boolean r11 = r11.enabled
            if (r11 != 0) goto L_0x017b
            r5 = 3
            goto L_0x018d
        L_0x017b:
            r5 = r2
            goto L_0x018d
        L_0x017d:
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
        L_0x018c:
            r5 = r1
        L_0x018d:
            r11 = 18
            if (r5 != r11) goto L_0x0192
            goto L_0x019a
        L_0x0192:
            if (r5 != r1) goto L_0x0199
            boolean r1 = o3.i.b(r10)
            goto L_0x019a
        L_0x0199:
            r1 = r2
        L_0x019a:
            if (r1 == 0) goto L_0x019d
            return r11
        L_0x019d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.f.b(android.content.Context, int):int");
    }
}
