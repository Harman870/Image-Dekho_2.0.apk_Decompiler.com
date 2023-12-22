package v5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.a;
import i0.d;
import i0.f;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12561a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12562b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12563c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f12564d;

    public p(a aVar) {
        this.f12561a = aVar.f3372a;
        this.f12562b = aVar;
        this.f12563c = aVar.getContext();
        this.f12564d = aVar.f3378g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public d h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof o;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(f fVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z9) {
    }

    public final void q() {
        this.f12562b.e(false);
    }

    public void r() {
    }

    public void s() {
    }
}
