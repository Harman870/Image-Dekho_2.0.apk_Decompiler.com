package l5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import j5.i;
import j5.z;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f9240a;

    public a(NavigationView navigationView) {
        this.f9240a = navigationView;
    }

    public final void onGlobalLayout() {
        boolean z9;
        boolean z10;
        boolean z11;
        Activity activity;
        Rect rect;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        NavigationView navigationView = this.f9240a;
        navigationView.getLocationOnScreen(navigationView.f3271l);
        NavigationView navigationView2 = this.f9240a;
        boolean z15 = true;
        if (navigationView2.f3271l[1] == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        i iVar = navigationView2.f3269i;
        if (iVar.w != z9) {
            iVar.w = z9;
            if (iVar.f8641b.getChildCount() != 0 || !iVar.w) {
                i10 = 0;
            } else {
                i10 = iVar.f8661y;
            }
            NavigationMenuView navigationMenuView = iVar.f8640a;
            navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationView navigationView3 = this.f9240a;
        if (!z9 || !navigationView3.f3274o) {
            z10 = false;
        } else {
            z10 = true;
        }
        navigationView3.setDrawTopInsetForeground(z10);
        NavigationView navigationView4 = this.f9240a;
        int i11 = navigationView4.f3271l[0];
        if (i11 == 0 || navigationView4.getWidth() + i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9240a.setDrawLeftInsetForeground(z11);
        Context context = this.f9240a.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            int i12 = Build.VERSION.SDK_INT;
            int i13 = z.f8716a;
            WindowManager windowManager = (WindowManager) activity.getSystemService("window");
            if (i12 >= 30) {
                rect = z.a.a(windowManager);
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect();
                rect.right = point.x;
                rect.bottom = point.y;
            }
            if (rect.height() - this.f9240a.getHeight() == this.f9240a.f3271l[1]) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            NavigationView navigationView5 = this.f9240a;
            if (!z12 || !z13 || !navigationView5.f3275p) {
                z14 = false;
            } else {
                z14 = true;
            }
            navigationView5.setDrawBottomInsetForeground(z14);
            if (!(rect.width() == this.f9240a.f3271l[0] || rect.width() - this.f9240a.getWidth() == this.f9240a.f3271l[0])) {
                z15 = false;
            }
            this.f9240a.setDrawRightInsetForeground(z15);
        }
    }
}
