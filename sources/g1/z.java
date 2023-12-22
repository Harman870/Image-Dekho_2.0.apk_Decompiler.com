package g1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class z extends y {
    public static boolean A = true;

    @SuppressLint({"NewApi"})
    public void x(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.x(view, i10);
        } else if (A) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                A = false;
            }
        }
    }
}
