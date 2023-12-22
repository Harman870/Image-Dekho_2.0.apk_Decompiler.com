package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import l3.d;
import l3.e;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.a;
import s3.a;

public class GoogleSignInOptions extends a implements a.c, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();
    public static final GoogleSignInOptions k;

    /* renamed from: l  reason: collision with root package name */
    public static final Scope f2778l = new Scope(1, "email");

    /* renamed from: m  reason: collision with root package name */
    public static final Scope f2779m;

    /* renamed from: n  reason: collision with root package name */
    public static final Scope f2780n;

    /* renamed from: o  reason: collision with root package name */
    public static final Scope f2781o = new Scope(1, "https://www.googleapis.com/auth/games");

    /* renamed from: p  reason: collision with root package name */
    public static d f2782p = new d();

    /* renamed from: a  reason: collision with root package name */
    public final int f2783a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<Scope> f2784b;

    /* renamed from: c  reason: collision with root package name */
    public Account f2785c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2786d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2787e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2788f;

    /* renamed from: g  reason: collision with root package name */
    public String f2789g;

    /* renamed from: h  reason: collision with root package name */
    public String f2790h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<m3.a> f2791i;

    /* renamed from: j  reason: collision with root package name */
    public String f2792j;

    static {
        Scope scope = new Scope(1, "profile");
        Scope scope2 = new Scope(1, "openid");
        f2779m = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f2780n = scope3;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f2781o)) {
            Scope scope4 = f2780n;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        k = new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) null, false, false, false, (String) null, (String) null, hashMap, (String) null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f2781o)) {
            Scope scope5 = f2780n;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), (Account) null, false, false, false, (String) null, (String) null, hashMap2, (String) null);
    }

    public GoogleSignInOptions() {
        throw null;
    }

    public GoogleSignInOptions(int i10, ArrayList<Scope> arrayList, Account account, boolean z9, boolean z10, boolean z11, String str, String str2, Map<Integer, m3.a> map, String str3) {
        this.f2783a = i10;
        this.f2784b = arrayList;
        this.f2785c = account;
        this.f2786d = z9;
        this.f2787e = z10;
        this.f2788f = z11;
        this.f2789g = str;
        this.f2790h = str2;
        this.f2791i = new ArrayList<>(map.values());
        this.f2792j = str3;
    }

    public static GoogleSignInOptions x(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z9 = jSONObject.getBoolean("idTokenRequested");
        boolean z10 = jSONObject.getBoolean("serverAuthRequested");
        boolean z11 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z9, z10, z11, str3, str4, new HashMap(), (String) null);
    }

    public static HashMap y(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList == null) {
            return hashMap;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m3.a aVar = (m3.a) it.next();
            hashMap.put(Integer.valueOf(aVar.f9354b), aVar);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1.equals(r5.f2785c) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r5 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r5     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList<m3.a> r1 = r4.f2791i     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 > 0) goto L_0x0086
            java.util.ArrayList<m3.a> r1 = r5.f2791i     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0086
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r4.f2784b     // Catch:{ ClassCastException -> 0x0086 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r3 = r5.f2784b     // Catch:{ ClassCastException -> 0x0086 }
            r2.<init>(r3)     // Catch:{ ClassCastException -> 0x0086 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r4.f2784b     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ ClassCastException -> 0x0086 }
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r3 = r5.f2784b     // Catch:{ ClassCastException -> 0x0086 }
            r2.<init>(r3)     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x003b
            goto L_0x0086
        L_0x003b:
            android.accounts.Account r1 = r4.f2785c     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0044
            android.accounts.Account r1 = r5.f2785c     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0086
            goto L_0x004c
        L_0x0044:
            android.accounts.Account r2 = r5.f2785c     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x0086
        L_0x004c:
            java.lang.String r1 = r4.f2789g     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r5.f2789g     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 == 0) goto L_0x0086
            goto L_0x0068
        L_0x005d:
            java.lang.String r1 = r4.f2789g     // Catch:{ ClassCastException -> 0x0086 }
            java.lang.String r2 = r5.f2789g     // Catch:{ ClassCastException -> 0x0086 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != 0) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            boolean r1 = r4.f2788f     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f2788f     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            boolean r1 = r4.f2786d     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f2786d     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            boolean r1 = r4.f2787e     // Catch:{ ClassCastException -> 0x0086 }
            boolean r2 = r5.f2787e     // Catch:{ ClassCastException -> 0x0086 }
            if (r1 != r2) goto L_0x0086
            java.lang.String r1 = r4.f2792j     // Catch:{ ClassCastException -> 0x0086 }
            java.lang.String r5 = r5.f2792j     // Catch:{ ClassCastException -> 0x0086 }
            boolean r5 = android.text.TextUtils.equals(r1, r5)     // Catch:{ ClassCastException -> 0x0086 }
            if (r5 == 0) goto L_0x0086
            r5 = 1
            return r5
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f2784b;
        int size = arrayList2.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(arrayList2.get(i13).f2804b);
        }
        Collections.sort(arrayList);
        Account account = this.f2785c;
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        if (account == null) {
            i10 = 0;
        } else {
            i10 = account.hashCode();
        }
        int i14 = hashCode + i10;
        String str = this.f2789g;
        int i15 = i14 * 31;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i16 = ((((((i15 + i11) * 31) + (this.f2788f ? 1 : 0)) * 31) + (this.f2786d ? 1 : 0)) * 31) + (this.f2787e ? 1 : 0);
        String str2 = this.f2792j;
        int i17 = i16 * 31;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i17 + i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f2783a);
        y3.a.E(parcel, 2, new ArrayList(this.f2784b));
        y3.a.A(parcel, 3, this.f2785c, i10);
        y3.a.u(parcel, 4, this.f2786d);
        y3.a.u(parcel, 5, this.f2787e);
        y3.a.u(parcel, 6, this.f2788f);
        y3.a.B(parcel, 7, this.f2789g);
        y3.a.B(parcel, 8, this.f2790h);
        y3.a.E(parcel, 9, this.f2791i);
        y3.a.B(parcel, 10, this.f2792j);
        y3.a.S(G, parcel);
    }
}
