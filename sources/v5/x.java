package v5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.a;
import com.imgdkh.app.R;

public final class x extends p {

    /* renamed from: e  reason: collision with root package name */
    public int f12605e = R.drawable.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    public EditText f12606f;

    /* renamed from: g  reason: collision with root package name */
    public final w f12607g = new w(this);

    public x(a aVar, int i10) {
        super(aVar);
        if (i10 != 0) {
            this.f12605e = i10;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R.string.password_toggle_content_description;
    }

    public final int d() {
        return this.f12605e;
    }

    public final View.OnClickListener f() {
        return this.f12607g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        EditText editText = this.f12606f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    public final void m(EditText editText) {
        this.f12606f = editText;
        q();
    }

    public final void r() {
        boolean z9;
        EditText editText = this.f12606f;
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f12606f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f12606f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
