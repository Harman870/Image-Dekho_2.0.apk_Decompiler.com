package x4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import b0.a;
import c6.b;
import com.google.android.material.button.MaterialButton;
import com.imgdkh.app.R;
import h0.l0;
import h0.y;
import java.util.WeakHashMap;
import r5.f;
import r5.i;
import r5.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f12949a;

    /* renamed from: b  reason: collision with root package name */
    public i f12950b;

    /* renamed from: c  reason: collision with root package name */
    public int f12951c;

    /* renamed from: d  reason: collision with root package name */
    public int f12952d;

    /* renamed from: e  reason: collision with root package name */
    public int f12953e;

    /* renamed from: f  reason: collision with root package name */
    public int f12954f;

    /* renamed from: g  reason: collision with root package name */
    public int f12955g;

    /* renamed from: h  reason: collision with root package name */
    public int f12956h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f12957i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f12958j;
    public ColorStateList k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f12959l;

    /* renamed from: m  reason: collision with root package name */
    public f f12960m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12961n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12962o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12963p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12964q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12965r = true;

    /* renamed from: s  reason: collision with root package name */
    public RippleDrawable f12966s;

    /* renamed from: t  reason: collision with root package name */
    public int f12967t;

    public a(MaterialButton materialButton, i iVar) {
        this.f12949a = materialButton;
        this.f12950b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.f12966s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (m) (this.f12966s.getNumberOfLayers() > 2 ? this.f12966s.getDrawable(2) : this.f12966s.getDrawable(1));
    }

    public final f b(boolean z9) {
        RippleDrawable rippleDrawable = this.f12966s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f12966s.getDrawable(0)).getDrawable()).getDrawable(z9 ^ true ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f12950b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.f12949a;
        WeakHashMap<View, l0> weakHashMap = y.f6776a;
        int f10 = y.e.f(materialButton);
        int paddingTop = this.f12949a.getPaddingTop();
        int e10 = y.e.e(this.f12949a);
        int paddingBottom = this.f12949a.getPaddingBottom();
        int i12 = this.f12953e;
        int i13 = this.f12954f;
        this.f12954f = i11;
        this.f12953e = i10;
        if (!this.f12962o) {
            e();
        }
        y.e.k(this.f12949a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        MaterialButton materialButton = this.f12949a;
        f fVar = new f(this.f12950b);
        fVar.i(this.f12949a.getContext());
        a.b.h(fVar, this.f12958j);
        PorterDuff.Mode mode = this.f12957i;
        if (mode != null) {
            a.b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.k;
        fVar.f11660a.k = (float) this.f12956h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f11660a;
        if (bVar.f11684d != colorStateList) {
            bVar.f11684d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f12950b);
        fVar2.setTint(0);
        float f10 = (float) this.f12956h;
        if (this.f12961n) {
            i10 = b.t(this.f12949a, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        fVar2.f11660a.k = f10;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        f.b bVar2 = fVar2.f11660a;
        if (bVar2.f11684d != valueOf) {
            bVar2.f11684d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f12950b);
        this.f12960m = fVar3;
        a.b.g(fVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(o5.a.a(this.f12959l), new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f12951c, this.f12953e, this.f12952d, this.f12954f), this.f12960m);
        this.f12966s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.j((float) this.f12967t);
            b10.setState(this.f12949a.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            ColorStateList colorStateList = this.k;
            b10.f11660a.k = (float) this.f12956h;
            b10.invalidateSelf();
            f.b bVar = b10.f11660a;
            if (bVar.f11684d != colorStateList) {
                bVar.f11684d = colorStateList;
                b10.onStateChange(b10.getState());
            }
            if (b11 != null) {
                float f10 = (float) this.f12956h;
                if (this.f12961n) {
                    i10 = b.t(this.f12949a, R.attr.colorSurface);
                }
                b11.f11660a.k = f10;
                b11.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                f.b bVar2 = b11.f11660a;
                if (bVar2.f11684d != valueOf) {
                    bVar2.f11684d = valueOf;
                    b11.onStateChange(b11.getState());
                }
            }
        }
    }
}
