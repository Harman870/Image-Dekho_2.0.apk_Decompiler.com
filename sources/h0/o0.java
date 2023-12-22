package h0;

import android.view.View;
import android.view.Window;

public final class o0 {
    public static void a(Window window, boolean z9) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z9 ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }
}
