package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l3.c;
import org.json.JSONArray;
import org.json.JSONObject;
import r3.o;
import s3.a;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f2766a;

    /* renamed from: b  reason: collision with root package name */
    public String f2767b;

    /* renamed from: c  reason: collision with root package name */
    public String f2768c;

    /* renamed from: d  reason: collision with root package name */
    public String f2769d;

    /* renamed from: e  reason: collision with root package name */
    public String f2770e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f2771f;

    /* renamed from: g  reason: collision with root package name */
    public String f2772g;

    /* renamed from: h  reason: collision with root package name */
    public long f2773h;

    /* renamed from: i  reason: collision with root package name */
    public String f2774i;

    /* renamed from: j  reason: collision with root package name */
    public List<Scope> f2775j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public String f2776l;

    /* renamed from: m  reason: collision with root package name */
    public HashSet f2777m = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2766a = i10;
        this.f2767b = str;
        this.f2768c = str2;
        this.f2769d = str3;
        this.f2770e = str4;
        this.f2771f = uri;
        this.f2772g = str5;
        this.f2773h = j10;
        this.f2774i = str6;
        this.f2775j = arrayList;
        this.k = str7;
        this.f2776l = str8;
    }

    public static GoogleSignInAccount y(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        o.e(string);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, (String) null, longValue, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        } else {
            str7 = null;
        }
        googleSignInAccount.f2772g = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f2774i.equals(this.f2774i) && googleSignInAccount.x().equals(x());
    }

    public final int hashCode() {
        return x().hashCode() + ((this.f2774i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.x(parcel, 1, this.f2766a);
        y3.a.B(parcel, 2, this.f2767b);
        y3.a.B(parcel, 3, this.f2768c);
        y3.a.B(parcel, 4, this.f2769d);
        y3.a.B(parcel, 5, this.f2770e);
        y3.a.A(parcel, 6, this.f2771f, i10);
        y3.a.B(parcel, 7, this.f2772g);
        y3.a.y(parcel, 8, this.f2773h);
        y3.a.B(parcel, 9, this.f2774i);
        y3.a.E(parcel, 10, this.f2775j);
        y3.a.B(parcel, 11, this.k);
        y3.a.B(parcel, 12, this.f2776l);
        y3.a.S(G, parcel);
    }

    public final HashSet x() {
        HashSet hashSet = new HashSet(this.f2775j);
        hashSet.addAll(this.f2777m);
        return hashSet;
    }
}
