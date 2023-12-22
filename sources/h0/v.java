package h0;

import android.view.View;
import com.imgdkh.app.R;
import h0.y;

public final class v extends y.b<Boolean> {
    public v() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(y.l.d(view));
    }

    public final void c(View view, Object obj) {
        y.l.i(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !y.b.a((Boolean) obj, (Boolean) obj2);
    }
}
