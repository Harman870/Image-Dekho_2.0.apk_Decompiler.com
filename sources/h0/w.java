package h0;

import android.text.TextUtils;
import android.view.View;
import com.imgdkh.app.R;
import h0.y;

public final class w extends y.b<CharSequence> {
    public w(Class cls) {
        super(R.id.tag_accessibility_pane_title, cls, 8, 28);
    }

    public final Object b(View view) {
        return y.l.b(view);
    }

    public final void c(View view, Object obj) {
        y.l.h(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
