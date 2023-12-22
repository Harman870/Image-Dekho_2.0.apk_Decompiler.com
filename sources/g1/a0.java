package g1;

import android.graphics.Matrix;
import android.view.View;

public final class a0 extends z {
    public final float U(View view) {
        return view.getTransitionAlpha();
    }

    public final void V(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    public final void W(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void X(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public final void Y(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    public final void x(View view, int i10) {
        view.setTransitionVisibility(i10);
    }
}
