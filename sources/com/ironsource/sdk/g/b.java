package com.ironsource.sdk.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f5605a;

    /* renamed from: b  reason: collision with root package name */
    public String f5606b;

    /* renamed from: c  reason: collision with root package name */
    public String f5607c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5608d;

    /* renamed from: e  reason: collision with root package name */
    public int f5609e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f5610f;

    /* renamed from: g  reason: collision with root package name */
    public String f5611g;

    /* renamed from: h  reason: collision with root package name */
    public String f5612h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5613i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5614j;
    public Map<String, String> k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<String> f5615l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f5616m;

    /* renamed from: n  reason: collision with root package name */
    public HashMap f5617n;

    public static class a implements Parcelable.Creator<b> {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b() {
        b();
    }

    public b(Parcel parcel) {
        b();
        try {
            boolean z9 = true;
            this.f5608d = parcel.readByte() != 0;
            this.f5609e = parcel.readInt();
            this.f5605a = parcel.readString();
            this.f5606b = parcel.readString();
            this.f5607c = parcel.readString();
            this.f5611g = parcel.readString();
            this.f5612h = parcel.readString();
            this.f5617n = a(parcel.readString());
            this.f5614j = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z9 = false;
            }
            this.f5613i = z9;
            this.k = a(parcel.readString());
        } catch (Throwable unused) {
            b();
        }
    }

    public static HashMap a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return hashMap;
    }

    public final void b() {
        this.f5608d = false;
        this.f5609e = -1;
        this.f5615l = new ArrayList<>();
        this.f5616m = new ArrayList<>();
        this.f5610f = new ArrayList<>();
        new ArrayList();
        this.f5613i = true;
        this.f5614j = false;
        this.f5612h = "";
        this.f5611g = "";
        this.f5617n = new HashMap();
        this.k = new HashMap();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f5608d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f5609e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f5615l);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f5616m);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f5611g);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f5612h);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f5617n);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f5613i);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f5614j);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.k);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        try {
            int i11 = 1;
            parcel.writeByte((byte) (this.f5608d ? 1 : 0));
            parcel.writeInt(this.f5609e);
            parcel.writeString(this.f5605a);
            parcel.writeString(this.f5606b);
            parcel.writeString(this.f5607c);
            parcel.writeString(this.f5611g);
            parcel.writeString(this.f5612h);
            parcel.writeString(new JSONObject(this.f5617n).toString());
            parcel.writeByte((byte) (this.f5614j ? 1 : 0));
            if (!this.f5613i) {
                i11 = 0;
            }
            parcel.writeByte((byte) i11);
            parcel.writeString(new JSONObject(this.k).toString());
        } catch (Throwable unused) {
        }
    }
}
