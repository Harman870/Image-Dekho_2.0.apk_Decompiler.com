package v5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12604a;

    public /* synthetic */ w(x xVar) {
        this.f12604a = xVar;
    }

    public final void onClick(View view) {
        boolean z9;
        PasswordTransformationMethod passwordTransformationMethod;
        EditText editText;
        x xVar = this.f12604a;
        EditText editText2 = xVar.f12606f;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            EditText editText3 = xVar.f12606f;
            if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                editText = xVar.f12606f;
                passwordTransformationMethod = null;
            } else {
                editText = xVar.f12606f;
                passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(passwordTransformationMethod);
            if (selectionEnd >= 0) {
                xVar.f12606f.setSelection(selectionEnd);
            }
            xVar.q();
        }
    }
}
