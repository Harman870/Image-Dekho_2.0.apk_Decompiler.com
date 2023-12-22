package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.imgdkh.app.R;
import e.a;
import l0.m;

public class f extends CheckBox implements m {

    /* renamed from: a  reason: collision with root package name */
    public final i f774a;

    /* renamed from: b  reason: collision with root package name */
    public final e f775b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f776c;

    /* renamed from: d  reason: collision with root package name */
    public m f777d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f1.a(context);
        d1.a(getContext(), this);
        i iVar = new i(this);
        this.f774a = iVar;
        iVar.b(attributeSet, i10);
        e eVar = new e(this);
        this.f775b = eVar;
        eVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f776c = b0Var;
        b0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f777d == null) {
            this.f777d = new m(this);
        }
        return this.f777d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f775b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f776c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f774a;
        if (iVar != null) {
            iVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f775b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f775b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f774a;
        if (iVar != null) {
            return iVar.f794b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f774a;
        if (iVar != null) {
            return iVar.f795c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f776c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f776c.e();
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f775b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f775b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setButtonDrawable(int i10) {
        setButtonDrawable(a.a(getContext(), i10));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f774a;
        if (iVar == null) {
            return;
        }
        if (iVar.f798f) {
            iVar.f798f = false;
            return;
        }
        iVar.f798f = true;
        iVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f776c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f776c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f867b.f11814a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f775b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f775b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f774a;
        if (iVar != null) {
            iVar.f794b = colorStateList;
            iVar.f796d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f774a;
        if (iVar != null) {
            iVar.f795c = mode;
            iVar.f797e = true;
            iVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f776c.l(colorStateList);
        this.f776c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f776c.m(mode);
        this.f776c.b();
    }
}
