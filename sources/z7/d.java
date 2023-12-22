package z7;

import android.webkit.JavascriptInterface;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public e f13236a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13237b = false;

    public d(e eVar) {
        this.f13236a = eVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f13237b) {
            return "";
        }
        this.f13237b = true;
        return this.f13236a.f13239b;
    }
}
