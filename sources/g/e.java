package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import c0.b;
import g.a;
import h.c;
import java.util.ArrayList;
import m.h;

public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6407a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6408b;

    public static class a implements a.C0083a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f6409a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f6410b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f6411c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final h<Menu, Menu> f6412d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f6410b = context;
            this.f6409a = callback;
        }

        public final boolean a(a aVar, f fVar) {
            ActionMode.Callback callback = this.f6409a;
            e e10 = e(aVar);
            Menu orDefault = this.f6412d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new h.e(this.f6410b, fVar);
                this.f6412d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e10, orDefault);
        }

        public final boolean b(a aVar, MenuItem menuItem) {
            return this.f6409a.onActionItemClicked(e(aVar), new c(this.f6410b, (b) menuItem));
        }

        public final boolean c(a aVar, f fVar) {
            ActionMode.Callback callback = this.f6409a;
            e e10 = e(aVar);
            Menu orDefault = this.f6412d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new h.e(this.f6410b, fVar);
                this.f6412d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e10, orDefault);
        }

        public final void d(a aVar) {
            this.f6409a.onDestroyActionMode(e(aVar));
        }

        public final e e(a aVar) {
            int size = this.f6411c.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f6411c.get(i10);
                if (eVar != null && eVar.f6408b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f6410b, aVar);
            this.f6411c.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, a aVar) {
        this.f6407a = context;
        this.f6408b = aVar;
    }

    public final void finish() {
        this.f6408b.c();
    }

    public final View getCustomView() {
        return this.f6408b.d();
    }

    public final Menu getMenu() {
        return new h.e(this.f6407a, this.f6408b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f6408b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f6408b.g();
    }

    public final Object getTag() {
        return this.f6408b.f6393a;
    }

    public final CharSequence getTitle() {
        return this.f6408b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f6408b.f6394b;
    }

    public final void invalidate() {
        this.f6408b.i();
    }

    public final boolean isTitleOptional() {
        return this.f6408b.j();
    }

    public final void setCustomView(View view) {
        this.f6408b.k(view);
    }

    public final void setSubtitle(int i10) {
        this.f6408b.l(i10);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f6408b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f6408b.f6393a = obj;
    }

    public final void setTitle(int i10) {
        this.f6408b.n(i10);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f6408b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z9) {
        this.f6408b.p(z9);
    }
}
