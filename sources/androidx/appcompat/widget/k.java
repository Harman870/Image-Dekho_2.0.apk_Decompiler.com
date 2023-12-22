package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.a0;
import com.imgdkh.app.R;
import h0.c;
import h0.s;
import h0.y;
import k0.b;
import k0.d;
import l0.l;

public class k extends EditText implements s {

    /* renamed from: a  reason: collision with root package name */
    public final e f834a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f835b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f836c;

    /* renamed from: d  reason: collision with root package name */
    public final l f837d;

    /* renamed from: e  reason: collision with root package name */
    public final l f838e;

    /* renamed from: f  reason: collision with root package name */
    public a f839f;

    public class a {
        public a() {
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.editTextStyle);
        f1.a(context);
        d1.a(getContext(), this);
        e eVar = new e(this);
        this.f834a = eVar;
        eVar.d(attributeSet, R.attr.editTextStyle);
        b0 b0Var = new b0(this);
        this.f835b = b0Var;
        b0Var.f(attributeSet, R.attr.editTextStyle);
        b0Var.b();
        this.f836c = new a0(this);
        this.f837d = new l();
        l lVar = new l((EditText) this);
        this.f838e = lVar;
        lVar.f(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener d10 = lVar.d(keyListener);
            if (d10 != keyListener) {
                super.setKeyListener(d10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private a getSuperCaller() {
        if (this.f839f == null) {
            this.f839f = new a();
        }
        return this.f839f;
    }

    public final c a(c cVar) {
        return this.f837d.a(this, cVar);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f834a;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f835b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return l0.k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f834a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f834a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f835b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f835b.e();
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f836c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f690b;
        if (textClassifier == null) {
            return a0.a.a(a0Var.f689a);
        }
        return textClassifier;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        String[] g10;
        InputConnection dVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f835b.getClass();
        b0.h(this, onCreateInputConnection, editorInfo);
        y3.a.p(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || (i10 = Build.VERSION.SDK_INT) > 30 || (g10 = y.g(this)) == null)) {
            k0.a.b(editorInfo, g10);
            b bVar = new b(this);
            if (i10 >= 25) {
                dVar = new k0.c(onCreateInputConnection, bVar);
            } else if (k0.a.a(editorInfo).length != 0) {
                dVar = new d(onCreateInputConnection, bVar);
            }
            onCreateInputConnection = dVar;
        }
        return this.f838e.g(onCreateInputConnection, editorInfo);
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z9 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && y.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z9 = v.a(dragEvent, this, activity);
            }
        }
        if (z9) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i10) {
        ClipData clipData;
        c.b bVar;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 31 && y.g(this) != null && (i10 == 16908322 || i10 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                clipData = null;
            } else {
                clipData = clipboardManager.getPrimaryClip();
            }
            if (clipData != null && clipData.getItemCount() > 0) {
                if (i11 >= 31) {
                    bVar = new c.a(clipData, 1);
                } else {
                    bVar = new c.C0090c(clipData, 1);
                }
                if (i10 != 16908322) {
                    i12 = 1;
                }
                bVar.b(i12);
                y.j(this, bVar.build());
            }
            i12 = 1;
        }
        if (i12 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f834a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f834a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f835b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f835b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l0.k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f838e.h(z9);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f838e.d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f834a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f834a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f835b.l(colorStateList);
        this.f835b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f835b.m(mode);
        this.f835b.b();
    }

    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        b0 b0Var = this.f835b;
        if (b0Var != null) {
            b0Var.g(context, i10);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f836c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f690b = textClassifier;
        }
    }
}
