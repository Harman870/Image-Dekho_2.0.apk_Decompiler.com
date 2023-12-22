package y7;

import android.os.Build;
import android.util.Log;
import android.webkit.ValueCallback;
import com.ironsource.sdk.b.b;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ String f13069a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ String f13070b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ b f13071c;

    public a(b bVar, String str, String str2) {
        this.f13071c = bVar;
        this.f13069a = str;
        this.f13070b = str2;
    }

    public final void run() {
        try {
            this.f13071c.f5137c.evaluateJavascript(this.f13069a, (ValueCallback) null);
        } catch (Throwable unused) {
            String str = this.f13071c.f5139e;
            Log.e(str, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f13070b + "Android API level: " + Build.VERSION.SDK_INT);
        }
    }
}
