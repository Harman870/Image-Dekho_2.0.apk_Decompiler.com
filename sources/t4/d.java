package t4;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class d implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11999a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f12000b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f12001c;

    public /* synthetic */ d(AppBarLayout.BaseBehavior baseBehavior, View view, AppBarLayout appBarLayout) {
        this.f11999a = baseBehavior;
        this.f12000b = view;
        this.f12001c = appBarLayout;
    }

    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        AppBarLayout.BaseBehavior baseBehavior = this.f11999a;
        View view2 = this.f12000b;
        AppBarLayout appBarLayout = this.f12001c;
        baseBehavior.getClass();
        AppBarLayout.BaseBehavior.C(keyEvent, view2, appBarLayout);
        return false;
    }
}
