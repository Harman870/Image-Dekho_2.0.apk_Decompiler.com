package i4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import r3.o;
import s3.a;

public final class k extends a implements wf {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    public String f7412a;

    /* renamed from: b  reason: collision with root package name */
    public String f7413b;

    /* renamed from: c  reason: collision with root package name */
    public String f7414c;

    /* renamed from: d  reason: collision with root package name */
    public String f7415d;

    /* renamed from: e  reason: collision with root package name */
    public String f7416e;

    /* renamed from: f  reason: collision with root package name */
    public String f7417f;

    /* renamed from: g  reason: collision with root package name */
    public String f7418g;

    /* renamed from: h  reason: collision with root package name */
    public String f7419h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7420i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7421j;
    public String k;

    /* renamed from: l  reason: collision with root package name */
    public String f7422l;

    /* renamed from: m  reason: collision with root package name */
    public String f7423m;

    /* renamed from: n  reason: collision with root package name */
    public String f7424n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7425o;

    /* renamed from: p  reason: collision with root package name */
    public String f7426p;

    public k() {
        this.f7420i = true;
        this.f7421j = true;
    }

    public k(we weVar, String str) {
        o.h(weVar);
        String str2 = (String) weVar.f7770a;
        o.e(str2);
        this.f7422l = str2;
        o.e(str);
        this.f7423m = str;
        String str3 = (String) weVar.f7772c;
        o.e(str3);
        this.f7416e = str3;
        this.f7420i = true;
        this.f7418g = "providerId=".concat(String.valueOf(str3));
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f7412a = "http://localhost";
        this.f7414c = str;
        this.f7415d = str2;
        this.f7419h = str4;
        this.k = str5;
        this.f7424n = str6;
        this.f7426p = str7;
        this.f7420i = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f7415d) || !TextUtils.isEmpty(this.k)) {
            o.e(str3);
            this.f7416e = str3;
            this.f7417f = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f7414c)) {
                sb.append("id_token=");
                sb.append(this.f7414c);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f7415d)) {
                sb.append("access_token=");
                sb.append(this.f7415d);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f7417f)) {
                sb.append("identifier=");
                sb.append(this.f7417f);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f7419h)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f7419h);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.k)) {
                sb.append("code=");
                sb.append(this.k);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str8)) {
                sb.append("nonce=");
                sb.append(str8);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f7416e);
            this.f7418g = sb.toString();
            this.f7421j = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z9, boolean z10, String str9, String str10, String str11, String str12, boolean z11, String str13) {
        this.f7412a = str;
        this.f7413b = str2;
        this.f7414c = str3;
        this.f7415d = str4;
        this.f7416e = str5;
        this.f7417f = str6;
        this.f7418g = str7;
        this.f7419h = str8;
        this.f7420i = z9;
        this.f7421j = z10;
        this.k = str9;
        this.f7422l = str10;
        this.f7423m = str11;
        this.f7424n = str12;
        this.f7425o = z11;
        this.f7426p = str13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int G = y3.a.G(20293, parcel);
        y3.a.B(parcel, 2, this.f7412a);
        y3.a.B(parcel, 3, this.f7413b);
        y3.a.B(parcel, 4, this.f7414c);
        y3.a.B(parcel, 5, this.f7415d);
        y3.a.B(parcel, 6, this.f7416e);
        y3.a.B(parcel, 7, this.f7417f);
        y3.a.B(parcel, 8, this.f7418g);
        y3.a.B(parcel, 9, this.f7419h);
        y3.a.u(parcel, 10, this.f7420i);
        y3.a.u(parcel, 11, this.f7421j);
        y3.a.B(parcel, 12, this.k);
        y3.a.B(parcel, 13, this.f7422l);
        y3.a.B(parcel, 14, this.f7423m);
        y3.a.B(parcel, 15, this.f7424n);
        y3.a.u(parcel, 16, this.f7425o);
        y3.a.B(parcel, 17, this.f7426p);
        y3.a.S(G, parcel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f7421j
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f7420i
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f7413b
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L_0x001c:
            java.lang.String r1 = r3.f7418g
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L_0x0025:
            java.lang.String r1 = r3.f7424n
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L_0x002e:
            java.lang.String r1 = r3.f7426p
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L_0x0037:
            java.lang.String r1 = r3.f7422l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0046
            java.lang.String r1 = r3.f7422l
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L_0x0046:
            java.lang.String r1 = r3.f7423m
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = r3.f7423m
        L_0x0052:
            r0.put(r2, r1)
            goto L_0x005b
        L_0x0056:
            java.lang.String r1 = r3.f7412a
            if (r1 == 0) goto L_0x005b
            goto L_0x0052
        L_0x005b:
            boolean r1 = r3.f7425o
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.k.zza():java.lang.String");
    }
}
