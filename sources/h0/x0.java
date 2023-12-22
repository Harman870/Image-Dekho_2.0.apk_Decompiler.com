package h0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import m.h;
import y3.a;

public final class x0 extends a {
    public final WindowInsetsController Q;
    public Window R;

    public x0(Window window) {
        WindowInsetsController a10 = window.getInsetsController();
        new h();
        this.Q = a10;
        this.R = window;
    }

    public final void r(boolean z9) {
        if (z9) {
            Window window = this.R;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.Q.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.R;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.Q.setSystemBarsAppearance(0, 16);
    }

    public final void s(boolean z9) {
        if (z9) {
            Window window = this.R;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.Q.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.R;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.Q.setSystemBarsAppearance(0, 8);
    }
}
