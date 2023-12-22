package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import com.imgdkh.app.R;
import y3.a;

public final class q extends MultiAutoCompleteTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f917d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final e f918a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f919b;

    /* renamed from: c  reason: collision with root package name */
    public final l f920c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        f1.a(context);
        d1.a(getContext(), this);
        i1 m2 = i1.m(getContext(), attributeSet, f917d, R.attr.autoCompleteTextViewStyle);
        if (m2.l(0)) {
            setDropDownBackgroundDrawable(m2.e(0));
        }
        m2.n();
        e eVar = new e(this);
        this.f918a = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        b0 b0Var = new b0(this);
        this.f919b = b0Var;
        b0Var.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        b0Var.b();
        l lVar = new l((EditText) this);
        this.f920c = lVar;
        lVar.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener d10 = lVar.d(keyListener);
            if (d10 != keyListener) {
                super.setKeyListener(d10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f918a;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f919b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f918a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f918a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f919b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f919b.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.p(this, editorInfo, onCreateInputConnection);
        return this.f920c.g(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f918a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f918a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f919b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f919b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(e.a.a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f920c.h(z9);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f920c.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f918a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f918a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f919b.l(colorStateList);
        this.f919b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f919b.m(mode);
        this.f919b.b();
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f919b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }
}
