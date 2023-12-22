package g1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class x extends w {

    /* renamed from: x  reason: collision with root package name */
    public static boolean f6557x = true;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f6558y = true;

    @SuppressLint({"NewApi"})
    public void W(View view, Matrix matrix) {
        if (f6557x) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f6557x = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void X(View view, Matrix matrix) {
        if (f6558y) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f6558y = false;
            }
        }
    }
}
