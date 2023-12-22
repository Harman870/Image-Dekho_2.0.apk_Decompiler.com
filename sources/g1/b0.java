package g1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import com.imgdkh.app.R;

public final class b0 extends n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6470a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6471b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f6472c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c0 f6473d;

    public b0(c0 c0Var, ViewGroup viewGroup, View view, View view2) {
        this.f6473d = c0Var;
        this.f6470a = viewGroup;
        this.f6471b = view;
        this.f6472c = view2;
    }

    public final void a() {
        t tVar = new t(this.f6470a);
        ((ViewGroupOverlay) tVar.f6553a).remove(this.f6471b);
    }

    public final void b(k kVar) {
        this.f6472c.setTag(R.id.save_overlay_view, (Object) null);
        t tVar = new t(this.f6470a);
        ((ViewGroupOverlay) tVar.f6553a).remove(this.f6471b);
        kVar.z(this);
    }

    public final void c() {
        if (this.f6471b.getParent() == null) {
            t tVar = new t(this.f6470a);
            ((ViewGroupOverlay) tVar.f6553a).add(this.f6471b);
            return;
        }
        this.f6473d.cancel();
    }
}
