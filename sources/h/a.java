package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b0.a;
import c0.b;
import y.a;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f6645a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f6646b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f6647c;

    /* renamed from: d  reason: collision with root package name */
    public char f6648d;

    /* renamed from: e  reason: collision with root package name */
    public int f6649e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f6650f;

    /* renamed from: g  reason: collision with root package name */
    public int f6651g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f6652h;

    /* renamed from: i  reason: collision with root package name */
    public Context f6653i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f6654j;
    public CharSequence k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f6655l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f6656m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6657n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6658o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f6659p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f6653i = context;
        this.f6645a = charSequence;
    }

    public final h0.b a() {
        return null;
    }

    public final b b(h0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f6652h;
        if (drawable == null) {
            return;
        }
        if (this.f6657n || this.f6658o) {
            this.f6652h = drawable;
            Drawable mutate = drawable.mutate();
            this.f6652h = mutate;
            if (this.f6657n) {
                a.b.h(mutate, this.f6655l);
            }
            if (this.f6658o) {
                a.b.i(this.f6652h, this.f6656m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f6651g;
    }

    public final char getAlphabeticShortcut() {
        return this.f6650f;
    }

    public final CharSequence getContentDescription() {
        return this.f6654j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f6652h;
    }

    public final ColorStateList getIconTintList() {
        return this.f6655l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f6656m;
    }

    public final Intent getIntent() {
        return this.f6647c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f6649e;
    }

    public final char getNumericShortcut() {
        return this.f6648d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f6645a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6646b;
        return charSequence != null ? charSequence : this.f6645a;
    }

    public final CharSequence getTooltipText() {
        return this.k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f6659p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f6659p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f6659p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f6659p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f6650f = Character.toLowerCase(c10);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f6650f = Character.toLowerCase(c10);
        this.f6651g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setCheckable(boolean z9) {
        this.f6659p = z9 | (this.f6659p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z9) {
        this.f6659p = (z9 ? 2 : 0) | (this.f6659p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f6654j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m12setContentDescription(CharSequence charSequence) {
        this.f6654j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z9) {
        this.f6659p = (z9 ? 16 : 0) | (this.f6659p & -17);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        Context context = this.f6653i;
        Object obj = y.a.f13006a;
        this.f6652h = a.b.b(context, i10);
        c();
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f6652h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f6655l = colorStateList;
        this.f6657n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6656m = mode;
        this.f6658o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f6647c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f6648d = c10;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f6648d = c10;
        this.f6649e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f6648d = c10;
        this.f6650f = Character.toLowerCase(c11);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f6648d = c10;
        this.f6649e = KeyEvent.normalizeMetaState(i10);
        this.f6650f = Character.toLowerCase(c11);
        this.f6651g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public final void setShowAsAction(int i10) {
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f6645a = this.f6653i.getResources().getString(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f6645a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6646b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m13setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z9) {
        int i10 = 8;
        int i11 = this.f6659p & 8;
        if (z9) {
            i10 = 0;
        }
        this.f6659p = i11 | i10;
        return this;
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
