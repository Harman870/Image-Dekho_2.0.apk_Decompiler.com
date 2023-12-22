package com.google.android.material.theme;

import a5.b;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.t;
import com.google.android.material.button.MaterialButton;
import d.q;
import m5.a;
import v5.u;

public class MaterialComponentsViewInflater extends q {
    public final d a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final f c(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final t d(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public final i0 e(Context context, AttributeSet attributeSet) {
        return new w5.a(context, attributeSet);
    }
}
