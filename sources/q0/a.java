package q0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

public final class a implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z9;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z10 = true;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        drawerLayout.f1315x = windowInsets;
        drawerLayout.f1316y = z9;
        if (z9 || drawerLayout.getBackground() != null) {
            z10 = false;
        }
        drawerLayout.setWillNotDraw(z10);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
