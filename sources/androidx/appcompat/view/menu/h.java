package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import b0.a;
import c0.b;
import h0.b;

public final class h implements b {
    public h0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f463a;

    /* renamed from: b  reason: collision with root package name */
    public final int f464b;

    /* renamed from: c  reason: collision with root package name */
    public final int f465c;

    /* renamed from: d  reason: collision with root package name */
    public final int f466d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f467e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f468f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f469g;

    /* renamed from: h  reason: collision with root package name */
    public char f470h;

    /* renamed from: i  reason: collision with root package name */
    public int f471i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f472j;
    public int k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f473l;

    /* renamed from: m  reason: collision with root package name */
    public int f474m = 0;

    /* renamed from: n  reason: collision with root package name */
    public f f475n;

    /* renamed from: o  reason: collision with root package name */
    public m f476o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f477p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f478q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f479r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f480s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f481t = null;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f482v = false;
    public boolean w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f483x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f484y;

    /* renamed from: z  reason: collision with root package name */
    public View f485z;

    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f475n = fVar;
        this.f463a = i11;
        this.f464b = i10;
        this.f465c = i12;
        this.f466d = i13;
        this.f467e = charSequence;
        this.f484y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public final h0.b a() {
        return this.A;
    }

    public final c0.b b(h0.b bVar) {
        h0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f6681a = null;
        }
        this.f485z = null;
        this.A = bVar;
        this.f475n.p(true);
        h0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f484y & 8) == 0) {
            return false;
        }
        if (this.f485z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f475n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.f482v)) {
            drawable = drawable.mutate();
            if (this.u) {
                a.b.h(drawable, this.f480s);
            }
            if (this.f482v) {
                a.b.i(drawable, this.f481t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        h0.b bVar;
        if ((this.f484y & 8) == 0) {
            return false;
        }
        if (this.f485z == null && (bVar = this.A) != null) {
            this.f485z = bVar.d(this);
        }
        return this.f485z != null;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f475n.f(this);
        }
        return false;
    }

    public final void f(boolean z9) {
        this.f483x = (z9 ? 4 : 0) | (this.f483x & -5);
    }

    public final void g(boolean z9) {
        this.f483x = z9 ? this.f483x | 32 : this.f483x & -33;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f485z;
        if (view != null) {
            return view;
        }
        h0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.f485z = d10;
        return d10;
    }

    public final int getAlphabeticModifiers() {
        return this.k;
    }

    public final char getAlphabeticShortcut() {
        return this.f472j;
    }

    public final CharSequence getContentDescription() {
        return this.f478q;
    }

    public final int getGroupId() {
        return this.f464b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f473l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f474m;
        if (i10 == 0) {
            return null;
        }
        Drawable a10 = e.a.a(this.f475n.f439a, i10);
        this.f474m = 0;
        this.f473l = a10;
        return d(a10);
    }

    public final ColorStateList getIconTintList() {
        return this.f480s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f481t;
    }

    public final Intent getIntent() {
        return this.f469g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f463a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f471i;
    }

    public final char getNumericShortcut() {
        return this.f470h;
    }

    public final int getOrder() {
        return this.f465c;
    }

    public final SubMenu getSubMenu() {
        return this.f476o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f467e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f468f;
        return charSequence != null ? charSequence : this.f467e;
    }

    public final CharSequence getTooltipText() {
        return this.f479r;
    }

    public final boolean hasSubMenu() {
        return this.f476o != null;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f483x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f483x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f483x & 16) != 0;
    }

    public final boolean isVisible() {
        h0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f483x & 8) == 0 : (this.f483x & 8) == 0 && this.A.b();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f475n.f439a;
        View inflate = LayoutInflater.from(context).inflate(i10, new LinearLayout(context), false);
        this.f485z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i11 = this.f463a) > 0) {
            inflate.setId(i11);
        }
        f fVar = this.f475n;
        fVar.k = true;
        fVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f472j == c10) {
            return this;
        }
        this.f472j = Character.toLowerCase(c10);
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f472j == c10 && this.k == i10) {
            return this;
        }
        this.f472j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z9) {
        int i10 = this.f483x;
        boolean z10 = z9 | (i10 & true);
        this.f483x = z10 ? 1 : 0;
        if (i10 != z10) {
            this.f475n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z9) {
        boolean z10;
        int i10;
        int i11 = this.f483x;
        int i12 = 2;
        if ((i11 & 4) != 0) {
            f fVar = this.f475n;
            fVar.getClass();
            int i13 = this.f464b;
            int size = fVar.f444f.size();
            fVar.w();
            for (int i14 = 0; i14 < size; i14++) {
                h hVar = fVar.f444f.get(i14);
                if (hVar.f464b == i13) {
                    boolean z11 = true;
                    if ((hVar.f483x & 4) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z11 = false;
                        }
                        int i15 = hVar.f483x;
                        int i16 = i15 & -3;
                        if (z11) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        int i17 = i10 | i16;
                        hVar.f483x = i17;
                        if (i15 != i17) {
                            hVar.f475n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i18 = i11 & -3;
            if (!z9) {
                i12 = 0;
            }
            int i19 = i12 | i18;
            this.f483x = i19;
            if (i11 != i19) {
                this.f475n.p(false);
            }
        }
        return this;
    }

    public final c0.b setContentDescription(CharSequence charSequence) {
        this.f478q = charSequence;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z9) {
        this.f483x = z9 ? this.f483x | 16 : this.f483x & -17;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f473l = null;
        this.f474m = i10;
        this.w = true;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f474m = 0;
        this.f473l = drawable;
        this.w = true;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f480s = colorStateList;
        this.u = true;
        this.w = true;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f481t = mode;
        this.f482v = true;
        this.w = true;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f469g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        if (this.f470h == c10) {
            return this;
        }
        this.f470h = c10;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f470h == c10 && this.f471i == i10) {
            return this;
        }
        this.f470h = c10;
        this.f471i = KeyEvent.normalizeMetaState(i10);
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f477p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f470h = c10;
        this.f472j = Character.toLowerCase(c11);
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f470h = c10;
        this.f471i = KeyEvent.normalizeMetaState(i10);
        this.f472j = Character.toLowerCase(c11);
        this.k = KeyEvent.normalizeMetaState(i11);
        this.f475n.p(false);
        return this;
    }

    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f484y = i10;
            f fVar = this.f475n;
            fVar.k = true;
            fVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        setTitle((CharSequence) this.f475n.f439a.getString(i10));
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f467e = charSequence;
        this.f475n.p(false);
        m mVar = this.f476o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f468f = charSequence;
        this.f475n.p(false);
        return this;
    }

    public final c0.b setTooltipText(CharSequence charSequence) {
        this.f479r = charSequence;
        this.f475n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z9) {
        int i10;
        int i11 = this.f483x;
        int i12 = i11 & -9;
        boolean z10 = false;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        int i13 = i10 | i12;
        this.f483x = i13;
        if (i11 != i13) {
            z10 = true;
        }
        if (z10) {
            f fVar = this.f475n;
            fVar.f446h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f467e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setActionView(View view) {
        int i10;
        this.f485z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f463a) > 0) {
            view.setId(i10);
        }
        f fVar = this.f475n;
        fVar.k = true;
        fVar.p(true);
        return this;
    }
}
