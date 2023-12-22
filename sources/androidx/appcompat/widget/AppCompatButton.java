package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.imgdkh.app.R;
import l0.k;

public class AppCompatButton extends Button {

    /* renamed from: a  reason: collision with root package name */
    public final e f585a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f586b;

    /* renamed from: c  reason: collision with root package name */
    public m f587c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f1.a(context);
        d1.a(getContext(), this);
        e eVar = new e(this);
        this.f585a = eVar;
        eVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f586b = b0Var;
        b0Var.f(attributeSet, i10);
        b0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f587c == null) {
            this.f587c = new m(this);
        }
        return this.f587c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f585a;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (r1.f934b) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f826e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (r1.f934b) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f825d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (r1.f934b) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f824c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (r1.f934b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            return b0Var.f708i.f827f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!r1.f934b) {
            b0 b0Var = this.f586b;
            if (b0Var != null) {
                return b0Var.f708i.f822a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f585a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f585a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f586b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f586b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        b0 b0Var = this.f586b;
        if (b0Var != null && !r1.f934b) {
            b0Var.f708i.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.b0 r1 = r0.f586b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            boolean r4 = androidx.appcompat.widget.r1.f934b
            if (r4 != 0) goto L_0x001f
            androidx.appcompat.widget.j0 r1 = r1.f708i
            boolean r4 = r1.i()
            if (r4 == 0) goto L_0x001b
            int r1 = r1.f822a
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = r3
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r2 == 0) goto L_0x0029
            androidx.appcompat.widget.b0 r1 = r0.f586b
            androidx.appcompat.widget.j0 r1 = r1.f708i
            r1.a()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatButton.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (r1.f934b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.i(i10, i11, i12, i13);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (r1.f934b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.j(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (r1.f934b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.k(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f585a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f585a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().c(z9);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f867b.f11814a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.f700a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f585a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f585a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f586b.l(colorStateList);
        this.f586b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f586b.m(mode);
        this.f586b.b();
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f586b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    public final void setTextSize(int i10, float f10) {
        boolean z9;
        boolean z10 = r1.f934b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f586b;
        if (b0Var != null && !z10) {
            j0 j0Var = b0Var.f708i;
            if (!j0Var.i() || j0Var.f822a == 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                b0Var.f708i.f(i10, f10);
            }
        }
    }
}
