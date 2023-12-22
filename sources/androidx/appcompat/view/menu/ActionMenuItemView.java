package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.m1;
import androidx.appcompat.widget.r0;

public class ActionMenuItemView extends i0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h  reason: collision with root package name */
    public h f354h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f355i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f356j;
    public f.b k;

    /* renamed from: l  reason: collision with root package name */
    public a f357l;

    /* renamed from: m  reason: collision with root package name */
    public b f358m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f359n = m();

    /* renamed from: o  reason: collision with root package name */
    public boolean f360o;

    /* renamed from: p  reason: collision with root package name */
    public int f361p;

    /* renamed from: q  reason: collision with root package name */
    public int f362q;

    /* renamed from: r  reason: collision with root package name */
    public int f363r;

    public class a extends r0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final h.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f358m;
            if (bVar == null || (aVar = c.this.u) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.f$b r1 = r0.k
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.f354h
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                h.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y3.a.f13026g, 0, 0);
        this.f361p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f363r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f362q = -1;
        setSaveEnabled(false);
    }

    public final boolean a() {
        return l();
    }

    public final boolean b() {
        return l() && this.f354h.getIcon() == null;
    }

    public final void c(h hVar) {
        int i10;
        this.f354h = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f463a);
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f357l == null) {
            this.f357l = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public h getItemData() {
        return this.f354h;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        CharSequence charSequence;
        boolean z9;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f355i);
        if (this.f356j != null) {
            if ((this.f354h.f484y & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9 || (!this.f359n && !this.f360o)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence2 = null;
        if (z12) {
            charSequence = this.f355i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f354h.f478q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z12) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f354h.f467e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f354h.f479r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z12) {
                charSequence2 = this.f354h.f467e;
            }
            m1.a(this, charSequence2);
            return;
        }
        m1.a(this, charSequence4);
    }

    public final void onClick(View view) {
        f.b bVar = this.k;
        if (bVar != null) {
            bVar.a(this.f354h);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f359n = m();
        n();
    }

    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean l6 = l();
        if (l6 && (i12 = this.f362q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f361p) : this.f361p;
        if (mode != 1073741824 && this.f361p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!l6 && this.f356j != null) {
            super.setPadding((getMeasuredWidth() - this.f356j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f354h.hasSubMenu() || (aVar = this.f357l) == null || !aVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f360o != z9) {
            this.f360o = z9;
            h hVar = this.f354h;
            if (hVar != null) {
                f fVar = hVar.f475n;
                fVar.k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f356j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f363r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.k = bVar;
    }

    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f362q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f358m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f355i = charSequence;
        n();
    }
}
