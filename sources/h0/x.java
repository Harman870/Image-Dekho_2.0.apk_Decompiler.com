package h0;

import android.view.View;
import com.imgdkh.app.R;
import h0.y;

public final class x extends y.b<Boolean> {
    public x() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(y.l.c(view));
    }

    public final void c(View view, Object obj) {
        y.l.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !y.b.a((Boolean) obj, (Boolean) obj2);
    }
}
