package androidx.activity;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class n implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f283a;

    public /* synthetic */ n(Runnable runnable) {
        this.f283a = runnable;
    }

    public final void onBackInvoked() {
        this.f283a.run();
    }
}
