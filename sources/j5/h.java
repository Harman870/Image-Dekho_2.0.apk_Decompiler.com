package j5;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;

public final class h extends f {
    public h(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.h a10 = a(i10, i11, i12, charSequence);
        k kVar = new k(this.f439a, this, a10);
        a10.f476o = kVar;
        kVar.setHeaderTitle(a10.f467e);
        return kVar;
    }
}
