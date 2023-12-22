package com.ironsource.sdk.k;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.utils.a.d;
import o8.f;
import o8.h;
import org.json.JSONObject;
import x8.f;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f5684a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5685b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5686c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5687d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable f5688e;

    /* renamed from: f  reason: collision with root package name */
    public final WebView f5689f;

    /* renamed from: g  reason: collision with root package name */
    public final View f5690g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f5691a;

        /* renamed from: b  reason: collision with root package name */
        public final com.ironsource.sdk.c.a f5692b;

        public a(d dVar, com.ironsource.sdk.c.a aVar) {
            f.f(dVar, "imageLoader");
            f.f(aVar, "adViewManagement");
            this.f5691a = dVar;
            this.f5692b = aVar;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f5693a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final String f5694a;

            /* renamed from: b  reason: collision with root package name */
            public final String f5695b;

            /* renamed from: c  reason: collision with root package name */
            public final String f5696c;

            /* renamed from: d  reason: collision with root package name */
            public final String f5697d;

            /* renamed from: e  reason: collision with root package name */
            public final o8.f<Drawable> f5698e;

            /* renamed from: f  reason: collision with root package name */
            public final o8.f<WebView> f5699f;

            /* renamed from: g  reason: collision with root package name */
            public final View f5700g;

            public a(String str, String str2, String str3, String str4, o8.f<? extends Drawable> fVar, o8.f<? extends WebView> fVar2, View view) {
                f.f(view, "privacyIcon");
                this.f5694a = str;
                this.f5695b = str2;
                this.f5696c = str3;
                this.f5697d = str4;
                this.f5698e = fVar;
                this.f5699f = fVar2;
                this.f5700g = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return f.a(this.f5694a, aVar.f5694a) && f.a(this.f5695b, aVar.f5695b) && f.a(this.f5696c, aVar.f5696c) && f.a(this.f5697d, aVar.f5697d) && f.a(this.f5698e, aVar.f5698e) && f.a(this.f5699f, aVar.f5699f) && f.a(this.f5700g, aVar.f5700g);
            }

            public final int hashCode() {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                Object obj;
                Object obj2;
                String str = this.f5694a;
                int i15 = 0;
                if (str == null) {
                    i10 = 0;
                } else {
                    i10 = str.hashCode();
                }
                int i16 = i10 * 31;
                String str2 = this.f5695b;
                if (str2 == null) {
                    i11 = 0;
                } else {
                    i11 = str2.hashCode();
                }
                int i17 = (i16 + i11) * 31;
                String str3 = this.f5696c;
                if (str3 == null) {
                    i12 = 0;
                } else {
                    i12 = str3.hashCode();
                }
                int i18 = (i17 + i12) * 31;
                String str4 = this.f5697d;
                if (str4 == null) {
                    i13 = 0;
                } else {
                    i13 = str4.hashCode();
                }
                int i19 = (i18 + i13) * 31;
                o8.f<Drawable> fVar = this.f5698e;
                if (fVar == null || (obj2 = fVar.f10605a) == null) {
                    i14 = 0;
                } else {
                    i14 = obj2.hashCode();
                }
                int i20 = (i19 + i14) * 31;
                o8.f<WebView> fVar2 = this.f5699f;
                if (!(fVar2 == null || (obj = fVar2.f10605a) == null)) {
                    i15 = obj.hashCode();
                }
                return this.f5700g.hashCode() + ((i20 + i15) * 31);
            }

            public final String toString() {
                return "Data(title=" + this.f5694a + ", advertiser=" + this.f5695b + ", body=" + this.f5696c + ", cta=" + this.f5697d + ", icon=" + this.f5698e + ", media=" + this.f5699f + ", privacyIcon=" + this.f5700g + ')';
            }
        }

        public b(a aVar) {
            f.f(aVar, "data");
            this.f5693a = aVar;
        }

        public static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        public static final <T> void b(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", !(obj instanceof f.a));
            Throwable a10 = o8.f.a(obj);
            if (a10 != null) {
                String message = a10.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put(IronSourceConstants.EVENTS_ERROR_REASON, message);
            }
            h hVar = h.f10610a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public c(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view) {
        x8.f.f(view, "privacyIcon");
        this.f5684a = str;
        this.f5685b = str2;
        this.f5686c = str3;
        this.f5687d = str4;
        this.f5688e = drawable;
        this.f5689f = webView;
        this.f5690g = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x8.f.a(this.f5684a, cVar.f5684a) && x8.f.a(this.f5685b, cVar.f5685b) && x8.f.a(this.f5686c, cVar.f5686c) && x8.f.a(this.f5687d, cVar.f5687d) && x8.f.a(this.f5688e, cVar.f5688e) && x8.f.a(this.f5689f, cVar.f5689f) && x8.f.a(this.f5690g, cVar.f5690g);
    }

    public final int hashCode() {
        String str = this.f5684a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5685b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5686c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5687d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f5688e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f5689f;
        if (webView != null) {
            i10 = webView.hashCode();
        }
        return this.f5690g.hashCode() + ((hashCode5 + i10) * 31);
    }

    public final String toString() {
        return "ISNNativeAdData(title=" + this.f5684a + ", advertiser=" + this.f5685b + ", body=" + this.f5686c + ", cta=" + this.f5687d + ", icon=" + this.f5688e + ", mediaView=" + this.f5689f + ", privacyIcon=" + this.f5690g + ')';
    }
}
