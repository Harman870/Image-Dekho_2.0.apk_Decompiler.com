package com.ironsource.environment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f3704a;

    /* renamed from: b  reason: collision with root package name */
    public String f3705b;

    /* renamed from: c  reason: collision with root package name */
    public String f3706c;

    public c(int i10, String str, String str2, String str3) {
        this.f3705b = str2;
        this.f3704a = str;
        this.f3706c = str3;
    }

    public c(String str, String str2, String str3) {
        this.f3705b = str2;
        this.f3704a = str;
        this.f3706c = str3;
    }

    public static long a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static JSONObject a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i10 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i10], (packageInfo.requestedPermissionsFlags[i10] & 2) != 0 ? "Granted" : "Rejected");
                    i10++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                while (i10 < jSONArray.length()) {
                    String string = jSONArray.getString(i10);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i10++;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r4, java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0033
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x002f }
            r2 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)     // Catch:{ Exception -> 0x002f }
            java.lang.String[] r0 = r4.requestedPermissions     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x0033
            r0 = r1
        L_0x001a:
            java.lang.String[] r2 = r4.requestedPermissions     // Catch:{ Exception -> 0x002c }
            int r3 = r2.length     // Catch:{ Exception -> 0x002c }
            if (r1 >= r3) goto L_0x002a
            if (r0 != 0) goto L_0x002a
            r2 = r2[r1]     // Catch:{ Exception -> 0x002c }
            boolean r0 = r5.equals(r2)     // Catch:{ Exception -> 0x002c }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x002a:
            r1 = r0
            goto L_0x0033
        L_0x002c:
            r4 = move-exception
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r4 = move-exception
        L_0x0030:
            r4.printStackTrace()
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.c.a(android.content.Context, java.lang.String):boolean");
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static boolean b(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String c(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused) {
            str = null;
        }
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static String d(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public String a() {
        return this.f3704a;
    }

    public String b() {
        return this.f3705b;
    }

    public String c() {
        return this.f3706c;
    }

    public void d() {
        f.a(this);
    }
}
