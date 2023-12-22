package j5;

import android.view.View;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;

public final class w implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        y.h.c(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
