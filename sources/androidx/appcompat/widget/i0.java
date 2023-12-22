package androidx.appcompat.widget;

import a0.e;
import a0.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.a0;
import f0.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l0.k;

public class i0 extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public final e f799a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f800b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f801c;

    /* renamed from: d  reason: collision with root package name */
    public m f802d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f803e;

    /* renamed from: f  reason: collision with root package name */
    public b f804f;

    /* renamed from: g  reason: collision with root package name */
    public Future<f0.c> f805g;

    public interface a {
        void a(int i10);

        void b(int i10);
    }

    public class b implements a {
        public b() {
        }

        public void a(int i10) {
        }

        public void b(int i10) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        public final void a(int i10) {
            i0.super.setLastBaselineToBottomHeight(i10);
        }

        public final void b(int i10) {
            i0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public i0() {
        throw null;
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f1.a(context);
        this.f803e = false;
        this.f804f = null;
        d1.a(getContext(), this);
        e eVar = new e(this);
        this.f799a = eVar;
        eVar.d(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.f800b = b0Var;
        b0Var.f(attributeSet, i10);
        b0Var.b();
        this.f801c = new a0(this);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    private m getEmojiTextViewHelper() {
        if (this.f802d == null) {
            this.f802d = new m(this);
        }
        return this.f802d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f799a;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (r1.f934b) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f826e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (r1.f934b) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f825d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (r1.f934b) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            return Math.round(b0Var.f708i.f824c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (r1.f934b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            return b0Var.f708i.f827f;
        }
        return new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!r1.f934b) {
            b0 b0Var = this.f800b;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        b bVar;
        if (this.f804f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                bVar = new c();
            } else if (i10 >= 26) {
                bVar = new b();
            }
            this.f804f = bVar;
        }
        return this.f804f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f799a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f799a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f800b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f800b.e();
    }

    public CharSequence getText() {
        Future<f0.c> future = this.f805g;
        if (future != null) {
            try {
                this.f805g = null;
                f0.c cVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.getClass();
                    setText((CharSequence) null);
                } else {
                    c.a a10 = k.a(this);
                    cVar.getClass();
                    a10.a((c.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f801c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f690b;
        if (textClassifier == null) {
            return a0.a.a(a0Var.f689a);
        }
        return textClassifier;
    }

    public c.a getTextMetricsParamsCompat() {
        return k.a(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f800b.getClass();
        b0.h(this, onCreateInputConnection, editorInfo);
        y3.a.p(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        b0 b0Var = this.f800b;
        if (b0Var != null && !r1.f934b) {
            b0Var.f708i.a();
        }
    }

    public void onMeasure(int i10, int i11) {
        Future<f0.c> future = this.f805g;
        if (future != null) {
            try {
                this.f805g = null;
                f0.c cVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    cVar.getClass();
                    setText((CharSequence) null);
                } else {
                    c.a a10 = k.a(this);
                    cVar.getClass();
                    a10.a((c.a) null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            androidx.appcompat.widget.b0 r1 = r0.f800b
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
            androidx.appcompat.widget.b0 r1 = r0.f800b
            androidx.appcompat.widget.j0 r1 = r1.f708i
            r1.a()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.onTextChanged(java.lang.CharSequence, int, int, int):void");
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
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.i(i10, i11, i12, i13);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (r1.f934b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.j(iArr, i10);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (r1.f934b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.k(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f799a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f799a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i10 != 0 ? e.a.a(context, i10) : null;
        Drawable a11 = i11 != 0 ? e.a.a(context, i11) : null;
        Drawable a12 = i12 != 0 ? e.a.a(context, i12) : null;
        if (i13 != 0) {
            drawable = e.a.a(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a11, a12, drawable);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a10 = i10 != 0 ? e.a.a(context, i10) : null;
        Drawable a11 = i11 != 0 ? e.a.a(context, i11) : null;
        Drawable a12 = i12 != 0 ? e.a.a(context, i12) : null;
        if (i13 != 0) {
            drawable = e.a.a(context, i13);
        }
        setCompoundDrawablesWithIntrinsicBounds(a10, a11, a12, drawable);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
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

    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            k.b(this, i10);
        }
    }

    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i10);
        } else {
            k.c(this, i10);
        }
    }

    public void setLineHeight(int i10) {
        c6.b.n(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(f0.c cVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            cVar.getClass();
            setText((CharSequence) null);
            return;
        }
        c.a a10 = k.a(this);
        cVar.getClass();
        a10.a((c.a) null);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f799a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f799a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f800b.l(colorStateList);
        this.f800b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f800b.m(mode);
        this.f800b.b();
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f801c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f690b = textClassifier;
        }
    }

    public void setTextFuture(Future<f0.c> future) {
        this.f805g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f6305b;
        int i10 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
        }
        k.b.h(this, i10);
        getPaint().set(aVar.f6304a);
        k.c.e(this, aVar.f6306c);
        k.c.h(this, aVar.f6307d);
    }

    public final void setTextSize(int i10, float f10) {
        boolean z9;
        boolean z10 = r1.f934b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.f800b;
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

    public final void setTypeface(Typeface typeface, int i10) {
        if (!this.f803e) {
            Typeface typeface2 = null;
            if (typeface != null && i10 > 0) {
                Context context = getContext();
                l lVar = e.f11a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i10);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f803e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i10);
            } finally {
                this.f803e = false;
            }
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f800b;
        if (b0Var != null) {
            b0Var.b();
        }
    }
}
