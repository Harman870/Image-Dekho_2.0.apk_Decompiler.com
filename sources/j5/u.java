package j5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f8709a;

    public u(EditText editText) {
        this.f8709a = editText;
    }

    public final void run() {
        ((InputMethodManager) this.f8709a.getContext().getSystemService("input_method")).showSoftInput(this.f8709a, 1);
    }
}
