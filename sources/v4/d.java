package v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f12514b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12515c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f12516d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f12517e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z9) {
        this.f12517e = bottomAppBar;
        this.f12514b = actionMenuView;
        this.f12515c = i10;
        this.f12516d = z9;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f12513a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        if (!this.f12513a) {
            BottomAppBar bottomAppBar = this.f12517e;
            int i10 = bottomAppBar.u0;
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0) {
                bottomAppBar.u0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            this.f12517e.C(this.f12514b, this.f12515c, this.f12516d, z9);
        }
    }
}
