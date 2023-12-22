package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
import h0.b;
import java.lang.reflect.Method;

public final class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final c0.b f6663d;

    /* renamed from: e  reason: collision with root package name */
    public Method f6664e;

    public class a extends h0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f6665b;

        public a(ActionProvider actionProvider) {
            this.f6665b = actionProvider;
        }

        public final boolean a() {
            return this.f6665b.hasSubMenu();
        }

        public final View c() {
            return this.f6665b.onCreateActionView();
        }

        public final boolean e() {
            return this.f6665b.onPerformDefaultAction();
        }

        public final void f(m mVar) {
            this.f6665b.onPrepareSubMenu(c.this.d(mVar));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f6667d;

        public b(c cVar, ActionProvider actionProvider) {
            super(actionProvider);
        }

        public final boolean b() {
            return this.f6665b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f6665b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f6665b.overridesItemVisibility();
        }

        public final void h(h.a aVar) {
            this.f6667d = aVar;
            this.f6665b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z9) {
            b.a aVar = this.f6667d;
            if (aVar != null) {
                f fVar = h.this.f475n;
                fVar.f446h = true;
                fVar.p(true);
            }
        }
    }

    /* renamed from: h.c$c  reason: collision with other inner class name */
    public static class C0088c extends FrameLayout implements g.b {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f6668a;

        public C0088c(View view) {
            super(view.getContext());
            this.f6668a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f6668a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f6668a.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f6669a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f6669a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f6669a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f6669a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f6671a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f6671a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f6671a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, c0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f6663d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f6663d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f6663d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        h0.b a10 = this.f6663d.a();
        if (a10 instanceof a) {
            return ((a) a10).f6665b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f6663d.getActionView();
        if (actionView instanceof C0088c) {
            return (View) ((C0088c) actionView).f6668a;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f6663d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f6663d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f6663d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f6663d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f6663d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f6663d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f6663d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f6663d.getIntent();
    }

    public final int getItemId() {
        return this.f6663d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f6663d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f6663d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f6663d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f6663d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return d(this.f6663d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f6663d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f6663d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f6663d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f6663d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f6663d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f6663d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f6663d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f6663d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f6663d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, actionProvider);
        c0.b bVar2 = this.f6663d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    public final MenuItem setActionView(int i10) {
        this.f6663d.setActionView(i10);
        View actionView = this.f6663d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f6663d.setActionView((View) new C0088c(actionView));
        }
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0088c(view);
        }
        this.f6663d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f6663d.setAlphabeticShortcut(c10);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f6663d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public final MenuItem setCheckable(boolean z9) {
        this.f6663d.setCheckable(z9);
        return this;
    }

    public final MenuItem setChecked(boolean z9) {
        this.f6663d.setChecked(z9);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6663d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z9) {
        this.f6663d.setEnabled(z9);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f6663d.setIcon(i10);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f6663d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6663d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6663d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f6663d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f6663d.setNumericShortcut(c10);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f6663d.setNumericShortcut(c10, i10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f6663d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f6663d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f6663d.setShortcut(c10, c11);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f6663d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public final void setShowAsAction(int i10) {
        this.f6663d.setShowAsAction(i10);
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        this.f6663d.setShowAsActionFlags(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f6663d.setTitle(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6663d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6663d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f6663d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z9) {
        return this.f6663d.setVisible(z9);
    }
}
