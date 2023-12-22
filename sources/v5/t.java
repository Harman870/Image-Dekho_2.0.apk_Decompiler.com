package v5;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.u0;

public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f12594a;

    public t(u uVar) {
        this.f12594a = uVar;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object obj;
        int i11;
        u uVar = this.f12594a;
        if (i10 < 0) {
            u0 u0Var = uVar.f12595e;
            if (!u0Var.b()) {
                obj = null;
            } else {
                obj = u0Var.f960c.getSelectedItem();
            }
        } else {
            obj = uVar.getAdapter().getItem(i10);
        }
        u.a(this.f12594a, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f12594a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                u0 u0Var2 = this.f12594a.f12595e;
                if (!u0Var2.b()) {
                    view = null;
                } else {
                    view = u0Var2.f960c.getSelectedView();
                }
                u0 u0Var3 = this.f12594a.f12595e;
                if (!u0Var3.b()) {
                    i11 = -1;
                } else {
                    i11 = u0Var3.f960c.getSelectedItemPosition();
                }
                i10 = i11;
                u0 u0Var4 = this.f12594a.f12595e;
                if (!u0Var4.b()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = u0Var4.f960c.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.f12594a.f12595e.f960c, view, i10, j10);
        }
        this.f12594a.f12595e.dismiss();
    }
}
