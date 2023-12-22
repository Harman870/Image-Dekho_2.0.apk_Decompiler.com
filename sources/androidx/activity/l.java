package androidx.activity;

import g0.a;

public final /* synthetic */ class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f280a;

    public /* synthetic */ l(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f280a = onBackPressedDispatcher;
    }

    public final void accept(Object obj) {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f280a;
        Boolean bool = (Boolean) obj;
        onBackPressedDispatcher.getClass();
        if (d0.a.a()) {
            onBackPressedDispatcher.c();
        }
    }
}
