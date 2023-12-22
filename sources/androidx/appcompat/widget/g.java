package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import l0.k;
import y3.a;

public final class g extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    public final h f779a;

    /* renamed from: b  reason: collision with root package name */
    public final e f780b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f781c;

    /* renamed from: d  reason: collision with root package name */
    public m f782d;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[SYNTHETIC, Splitter:B:11:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093 A[Catch:{ all -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            androidx.appcompat.widget.f1.a(r9)
            r0 = 2130903238(0x7f0300c6, float:1.7413288E38)
            r8.<init>(r9, r10, r0)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.d1.a(r9, r8)
            androidx.appcompat.widget.b0 r9 = new androidx.appcompat.widget.b0
            r9.<init>(r8)
            r8.f781c = r9
            r9.f(r10, r0)
            r9.b()
            androidx.appcompat.widget.e r9 = new androidx.appcompat.widget.e
            r9.<init>(r8)
            r8.f780b = r9
            r9.d(r10, r0)
            androidx.appcompat.widget.h r9 = new androidx.appcompat.widget.h
            r9.<init>(r8)
            r8.f779a = r9
            android.content.Context r1 = r8.getContext()
            int[] r4 = y3.a.f13034p
            androidx.appcompat.widget.i1 r1 = androidx.appcompat.widget.i1.m(r1, r10, r4, r0)
            android.content.Context r3 = r8.getContext()
            android.content.res.TypedArray r6 = r1.f809b
            r7 = 2130903238(0x7f0300c6, float:1.7413288E38)
            r2 = r8
            r5 = r10
            h0.y.m(r2, r3, r4, r5, r6, r7)
            r2 = 1
            boolean r3 = r1.l(r2)     // Catch:{ all -> 0x00ad }
            r4 = 0
            if (r3 == 0) goto L_0x0060
            int r3 = r1.i(r2, r4)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x0060
            android.content.Context r5 = r8.getContext()     // Catch:{ NotFoundException -> 0x0060 }
            android.graphics.drawable.Drawable r3 = e.a.a(r5, r3)     // Catch:{ NotFoundException -> 0x0060 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r3)     // Catch:{ NotFoundException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            if (r2 != 0) goto L_0x007c
            boolean r2 = r1.l(r4)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x007c
            int r2 = r1.i(r4, r4)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x007c
            android.widget.CheckedTextView r3 = r9.f787a     // Catch:{ all -> 0x00ad }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00ad }
            android.graphics.drawable.Drawable r2 = e.a.a(r4, r2)     // Catch:{ all -> 0x00ad }
            r3.setCheckMarkDrawable(r2)     // Catch:{ all -> 0x00ad }
        L_0x007c:
            r2 = 2
            boolean r3 = r1.l(r2)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x008c
            android.widget.CheckedTextView r3 = r9.f787a     // Catch:{ all -> 0x00ad }
            android.content.res.ColorStateList r2 = r1.b(r2)     // Catch:{ all -> 0x00ad }
            r3.setCheckMarkTintList(r2)     // Catch:{ all -> 0x00ad }
        L_0x008c:
            r2 = 3
            boolean r3 = r1.l(r2)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x00a2
            android.widget.CheckedTextView r9 = r9.f787a     // Catch:{ all -> 0x00ad }
            r3 = -1
            int r2 = r1.h(r2, r3)     // Catch:{ all -> 0x00ad }
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.o0.b(r2, r3)     // Catch:{ all -> 0x00ad }
            r9.setCheckMarkTintMode(r2)     // Catch:{ all -> 0x00ad }
        L_0x00a2:
            r1.n()
            androidx.appcompat.widget.m r9 = r8.getEmojiTextViewHelper()
            r9.a(r10, r0)
            return
        L_0x00ad:
            r9 = move-exception
            r1.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private m getEmojiTextViewHelper() {
        if (this.f782d == null) {
            this.f782d = new m(this);
        }
        return this.f782d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b0 b0Var = this.f781c;
        if (b0Var != null) {
            b0Var.b();
        }
        e eVar = this.f780b;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.f779a;
        if (hVar != null) {
            hVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f780b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f780b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f779a;
        if (hVar != null) {
            return hVar.f788b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f779a;
        if (hVar != null) {
            return hVar.f789c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f781c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f781c.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.p(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().b(z9);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f780b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f780b;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(e.a.a(getContext(), i10));
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f779a;
        if (hVar == null) {
            return;
        }
        if (hVar.f792f) {
            hVar.f792f = false;
            return;
        }
        hVar.f792f = true;
        hVar.a();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f781c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f781c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f780b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f780b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f779a;
        if (hVar != null) {
            hVar.f788b = colorStateList;
            hVar.f790d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f779a;
        if (hVar != null) {
            hVar.f789c = mode;
            hVar.f791e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f781c.l(colorStateList);
        this.f781c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f781c.m(mode);
        this.f781c.b();
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f781c;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }
}
