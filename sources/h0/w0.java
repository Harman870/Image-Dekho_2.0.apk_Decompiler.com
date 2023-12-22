package h0;

import android.view.View;
import android.view.Window;

public final class w0 extends v0 {
    public w0(Window window) {
        super(window);
    }

    public final void r(boolean z9) {
        if (z9) {
            this.Q.clearFlags(134217728);
            this.Q.addFlags(Integer.MIN_VALUE);
            View decorView = this.Q.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = this.Q.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
    }
}
