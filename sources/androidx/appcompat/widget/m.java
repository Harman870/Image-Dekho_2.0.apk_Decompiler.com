package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import s0.f;
import y3.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f866a;

    /* renamed from: b  reason: collision with root package name */
    public final f f867b;

    public m(TextView textView) {
        this.f866a = textView;
        this.f867b = new f(textView);
    }

    /* JADX INFO: finally extract failed */
    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f866a.getContext().obtainStyledAttributes(attributeSet, a.f13031m, i10, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z9) {
        this.f867b.f11814a.b(z9);
    }

    public final void c(boolean z9) {
        this.f867b.f11814a.c(z9);
    }
}
