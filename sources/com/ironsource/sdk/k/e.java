package com.ironsource.sdk.k;

import android.view.View;
import com.ironsource.sdk.g.g;
import com.ironsource.sdk.k.b;
import org.json.JSONObject;
import x8.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public a f5701a;

    /* renamed from: b  reason: collision with root package name */
    public b f5702b;

    /* renamed from: c  reason: collision with root package name */
    public View f5703c;

    /* renamed from: d  reason: collision with root package name */
    public View f5704d;

    /* renamed from: e  reason: collision with root package name */
    public View f5705e;

    /* renamed from: f  reason: collision with root package name */
    public View f5706f;

    /* renamed from: g  reason: collision with root package name */
    public View f5707g;

    /* renamed from: h  reason: collision with root package name */
    public View f5708h;

    /* renamed from: i  reason: collision with root package name */
    public View f5709i;

    public interface a {
        void a(g gVar);

        void a(b bVar);
    }

    public enum b {
        Title("title"),
        Advertiser("advertiser"),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon("privacyIcon");
        

        /* renamed from: a  reason: collision with root package name */
        public final String f5718a;

        /* access modifiers changed from: public */
        b(String str) {
            this.f5718a = str;
        }
    }

    public static final class c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ e f5719a;

        public c(e eVar) {
            this.f5719a = eVar;
        }

        public final void a(g gVar) {
            f.f(gVar, "viewVisibilityParams");
            a aVar = this.f5719a.f5701a;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }
    }

    public e(b bVar, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        f.f(bVar, "containerView");
        f.f(view7, "privacyIconView");
        this.f5702b = bVar;
        this.f5703c = view;
        this.f5704d = view2;
        this.f5705e = view3;
        this.f5706f = view4;
        this.f5707g = view5;
        this.f5708h = view6;
        this.f5709i = view7;
        b(this, view, b.Title);
        b(this, this.f5704d, b.Advertiser);
        b(this, this.f5706f, b.Body);
        b(this, this.f5708h, b.Cta);
        b(this, this.f5705e, b.Icon);
        b(this, this.f5702b, b.Container);
        b(this, this.f5709i, b.PrivacyIcon);
        this.f5702b.f5683b = new c(this);
    }

    public static final void b(e eVar, View view, b bVar) {
        if (view != null) {
            view.setOnClickListener(new a8.a(eVar, 0, bVar));
        }
    }

    public final JSONObject a() {
        boolean z9 = true;
        JSONObject put = new JSONObject().put("title", this.f5703c != null).put("advertiser", this.f5704d != null).put("body", this.f5706f != null).put("cta", this.f5708h != null).put("media", this.f5707g != null);
        if (this.f5705e == null) {
            z9 = false;
        }
        JSONObject put2 = put.put("icon", z9);
        f.e(put2, "JSONObject()\n\t\t\t.put(\"ti…\"icon\", iconView != null)");
        return put2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return f.a(this.f5702b, eVar.f5702b) && f.a(this.f5703c, eVar.f5703c) && f.a(this.f5704d, eVar.f5704d) && f.a(this.f5705e, eVar.f5705e) && f.a(this.f5706f, eVar.f5706f) && f.a(this.f5707g, eVar.f5707g) && f.a(this.f5708h, eVar.f5708h) && f.a(this.f5709i, eVar.f5709i);
    }

    public final int hashCode() {
        int hashCode = this.f5702b.hashCode() * 31;
        View view = this.f5703c;
        int i10 = 0;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f5704d;
        int hashCode3 = (hashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f5705e;
        int hashCode4 = (hashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f5706f;
        int hashCode5 = (hashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f5707g;
        int hashCode6 = (hashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f5708h;
        if (view6 != null) {
            i10 = view6.hashCode();
        }
        return this.f5709i.hashCode() + ((hashCode6 + i10) * 31);
    }

    public final String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f5702b + ", titleView=" + this.f5703c + ", advertiserView=" + this.f5704d + ", iconView=" + this.f5705e + ", bodyView=" + this.f5706f + ", mediaView=" + this.f5707g + ", ctaView=" + this.f5708h + ", privacyIconView=" + this.f5709i + ')';
    }
}
