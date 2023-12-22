package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.k;
import com.imgdkh.app.R;
import j5.s;
import java.util.Locale;
import x5.a;

public class TextInputEditText extends k {

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3330g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public boolean f3331h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        TypedArray d10 = s.d(context, attributeSet, c.a.Y, R.attr.editTextStyle, 2132018018, new int[0]);
        setTextInputLayoutFocusedRectEnabled(d10.getBoolean(0, false));
        d10.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        boolean z9;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f3331h) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 && rect != null) {
            textInputLayout.getFocusedRect(this.f3330g);
            rect.bottom = this.f3330g.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z9;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f3331h) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.C) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z9;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f3331h) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f3330g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f3330g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z9) {
        this.f3331h = z9;
    }
}
