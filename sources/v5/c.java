package v5;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f12527a;

    public /* synthetic */ c(g gVar) {
        this.f12527a = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.f12527a;
        EditText editText = gVar.f12535i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            gVar.q();
        }
    }
}
