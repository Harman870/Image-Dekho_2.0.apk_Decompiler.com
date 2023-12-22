package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import g.a;
import java.lang.ref.WeakReference;

public final class d extends a implements f.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f6401c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContextView f6402d;

    /* renamed from: e  reason: collision with root package name */
    public a.C0083a f6403e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference<View> f6404f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6405g;

    /* renamed from: h  reason: collision with root package name */
    public f f6406h;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0083a aVar) {
        this.f6401c = context;
        this.f6402d = actionBarContextView;
        this.f6403e = aVar;
        f fVar = new f(actionBarContextView.getContext());
        fVar.f449l = 1;
        this.f6406h = fVar;
        fVar.f443e = this;
    }

    public final boolean a(f fVar, MenuItem menuItem) {
        return this.f6403e.b(this, menuItem);
    }

    public final void b(f fVar) {
        i();
        c cVar = this.f6402d.f681d;
        if (cVar != null) {
            cVar.n();
        }
    }

    public final void c() {
        if (!this.f6405g) {
            this.f6405g = true;
            this.f6403e.d(this);
        }
    }

    public final View d() {
        WeakReference<View> weakReference = this.f6404f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final f e() {
        return this.f6406h;
    }

    public final MenuInflater f() {
        return new f(this.f6402d.getContext());
    }

    public final CharSequence g() {
        return this.f6402d.getSubtitle();
    }

    public final CharSequence h() {
        return this.f6402d.getTitle();
    }

    public final void i() {
        this.f6403e.c(this, this.f6406h);
    }

    public final boolean j() {
        return this.f6402d.f539s;
    }

    public final void k(View view) {
        this.f6402d.setCustomView(view);
        this.f6404f = view != null ? new WeakReference<>(view) : null;
    }

    public final void l(int i10) {
        m(this.f6401c.getString(i10));
    }

    public final void m(CharSequence charSequence) {
        this.f6402d.setSubtitle(charSequence);
    }

    public final void n(int i10) {
        o(this.f6401c.getString(i10));
    }

    public final void o(CharSequence charSequence) {
        this.f6402d.setTitle(charSequence);
    }

    public final void p(boolean z9) {
        this.f6394b = z9;
        this.f6402d.setTitleOptional(z9);
    }
}
