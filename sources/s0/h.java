package s0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.f;

public final class h implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f11824a;

    public h(TransformationMethod transformationMethod) {
        this.f11824a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f11824a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || f.a().b() != 1) {
            return charSequence;
        }
        f a10 = f.a();
        a10.getClass();
        return a10.f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z9, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f11824a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z9, i10, rect);
        }
    }
}
