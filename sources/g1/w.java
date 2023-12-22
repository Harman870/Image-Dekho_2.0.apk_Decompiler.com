package g1;

import android.annotation.SuppressLint;
import android.view.View;
import c6.b;

public class w extends b {
    public static boolean w = true;

    @SuppressLint({"NewApi"})
    public float U(View view) {
        if (w) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                w = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void V(View view, float f10) {
        if (w) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                w = false;
            }
        }
        view.setAlpha(f10);
    }
}
