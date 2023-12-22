package h0;

import android.view.View;
import android.view.Window;

public class v0 extends u0 {
    public v0(Window window) {
        super(window);
    }

    public final void s(boolean z9) {
        if (z9) {
            this.Q.clearFlags(67108864);
            this.Q.addFlags(Integer.MIN_VALUE);
            View decorView = this.Q.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = this.Q.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
    }
}
