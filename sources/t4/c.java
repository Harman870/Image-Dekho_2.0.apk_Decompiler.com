package t4;

import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class c implements View$OnUnhandledKeyEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11996a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f11997b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11998c;

    public /* synthetic */ c(AppBarLayout.BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout) {
        this.f11996a = baseBehavior;
        this.f11997b = view;
        this.f11998c = appBarLayout;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior baseBehavior = this.f11996a;
        View view2 = this.f11997b;
        AppBarLayout appBarLayout = this.f11998c;
        baseBehavior.getClass();
        AppBarLayout.BaseBehavior.C(keyEvent, view2, appBarLayout);
        return false;
    }
}
