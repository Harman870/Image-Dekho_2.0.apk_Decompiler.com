package h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import c0.c;
import m.h;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6660a;

    /* renamed from: b  reason: collision with root package name */
    public h<c0.b, MenuItem> f6661b;

    /* renamed from: c  reason: collision with root package name */
    public h<c, SubMenu> f6662c;

    public b(Context context) {
        this.f6660a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof c0.b)) {
            return menuItem;
        }
        c0.b bVar = (c0.b) menuItem;
        if (this.f6661b == null) {
            this.f6661b = new h<>();
        }
        MenuItem orDefault = this.f6661b.getOrDefault(bVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f6660a, bVar);
        this.f6661b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f6662c == null) {
            this.f6662c = new h<>();
        }
        SubMenu orDefault = this.f6662c.getOrDefault(cVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        g gVar = new g(this.f6660a, cVar);
        this.f6662c.put(cVar, gVar);
        return gVar;
    }
}
