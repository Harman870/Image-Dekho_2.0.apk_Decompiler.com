package g1;

import android.annotation.SuppressLint;
import android.view.View;

public class y extends x {

    /* renamed from: z  reason: collision with root package name */
    public static boolean f6559z = true;

    @SuppressLint({"NewApi"})
    public void Y(View view, int i10, int i11, int i12, int i13) {
        if (f6559z) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6559z = false;
            }
        }
    }
}
