package i6;

import android.content.Context;
import android.content.SharedPreferences;
import r3.o;
import u3.a;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f7920a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7921b = new a("StorageHelpers", new String[0]);

    public q(Context context, String str) {
        o.h(context);
        o.e(str);
        this.f7920a = context.getApplicationContext().getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{str}), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca A[SYNTHETIC, Splitter:B:33:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012e A[ExcHandler: yd | ArrayIndexOutOfBoundsException | IllegalArgumentException (e java.lang.Throwable), Splitter:B:1:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i6.h0 a(org.json.JSONObject r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "enrollmentTimestamp"
            java.lang.String r2 = "userMultiFactorInfo"
            java.lang.String r3 = "userMetadata"
            java.lang.String r5 = "cachedTokenState"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r6 = "applicationName"
            java.lang.String r6 = r0.getString(r6)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r7 = "anonymous"
            boolean r7 = r0.getBoolean(r7)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r8 = "2"
            java.lang.String r9 = "version"
            java.lang.String r9 = r0.getString(r9)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r9 == 0) goto L_0x0025
            r8 = r9
        L_0x0025:
            java.lang.String r9 = "userInfos"
            org.json.JSONArray r9 = r0.getJSONArray(r9)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            int r10 = r9.length()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r13 = 0
        L_0x0035:
            java.lang.String r14 = "displayName"
            java.lang.String r15 = "phoneNumber"
            if (r13 >= r10) goto L_0x008b
            java.lang.String r12 = r9.getString(r13)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r4.<init>(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "userId"
            java.lang.String r17 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "providerId"
            java.lang.String r18 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "email"
            java.lang.String r19 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r20 = r4.optString(r15)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r21 = r4.optString(r14)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "photoUrl"
            java.lang.String r22 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "isEmailVerified"
            boolean r23 = r4.optBoolean(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r12 = "rawUserInfo"
            java.lang.String r24 = r4.optString(r12)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            i6.e0 r4 = new i6.e0     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ JSONException -> 0x007d, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r11.add(r4)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            int r13 = r13 + 1
            goto L_0x0035
        L_0x007d:
            r0 = move-exception
            java.lang.String r1 = "DefaultAuthUserInfo"
            java.lang.String r2 = "Failed to unpack UserInfo from JSON"
            android.util.Log.d(r1, r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            i4.yd r1 = new i4.yd     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            throw r1     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x008b:
            c6.f r4 = c6.f.e(r6)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            i6.h0 r6 = new i6.h0     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r6.<init>(r4, r11)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r4 != 0) goto L_0x00a0
            i4.wg r4 = i4.wg.x(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r6.f7896a = r4     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x00a0:
            if (r7 != 0) goto L_0x00a6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r6.f7903h = r4     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x00a6:
            r6.f7902g = r8     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            boolean r4 = r0.has(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r4 == 0) goto L_0x00cc
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r3 != 0) goto L_0x00b5
            goto L_0x00c7
        L_0x00b5:
            java.lang.String r4 = "lastSignInTimestamp"
            long r4 = r3.getLong(r4)     // Catch:{ JSONException -> 0x00c7, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r7 = "creationTimestamp"
            long r7 = r3.getLong(r7)     // Catch:{ JSONException -> 0x00c7, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            i6.j0 r3 = new i6.j0     // Catch:{ JSONException -> 0x00c7, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r3.<init>(r4, r7)     // Catch:{ JSONException -> 0x00c7, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            if (r3 == 0) goto L_0x00cc
            r6.f7904i = r3     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x00cc:
            boolean r3 = r0.has(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r3 == 0) goto L_0x012d
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r0 == 0) goto L_0x012d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r2.<init>()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r12 = 0
        L_0x00de:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r12 >= r3) goto L_0x012a
            java.lang.String r3 = r0.getString(r12)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r3 = "phone"
            java.lang.String r5 = "factorIdKey"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            boolean r3 = r3.equals(r5)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r3 == 0) goto L_0x0123
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            if (r3 == 0) goto L_0x011b
            java.lang.String r3 = "uid"
            java.lang.String r19 = r4.optString(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r20 = r4.optString(r14)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            long r17 = r4.optLong(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r21 = r4.optString(r15)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            h6.r r3 = new h6.r     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            r16 = r3
            r16.<init>(r17, r19, r20, r21)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            goto L_0x0124
        L_0x011b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            java.lang.String r1 = "An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance."
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            throw r0     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x0123:
            r3 = 0
        L_0x0124:
            r2.add(r3)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
            int r12 = r12 + 1
            goto L_0x00de
        L_0x012a:
            r6.J(r2)     // Catch:{ JSONException -> 0x0134, ArrayIndexOutOfBoundsException -> 0x0132, IllegalArgumentException -> 0x0130, yd -> 0x012e }
        L_0x012d:
            return r6
        L_0x012e:
            r0 = move-exception
            goto L_0x0135
        L_0x0130:
            r0 = move-exception
            goto L_0x0135
        L_0x0132:
            r0 = move-exception
            goto L_0x0135
        L_0x0134:
            r0 = move-exception
        L_0x0135:
            r1 = r25
            u3.a r2 = r1.f7921b
            java.lang.String r2 = r2.f12198a
            android.util.Log.wtf(r2, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.q.a(org.json.JSONObject):i6.h0");
    }
}
