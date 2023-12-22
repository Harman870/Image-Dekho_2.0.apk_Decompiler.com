package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import b0.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f787a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f788b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f789c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f790d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f791e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f792f;

    public h(CheckedTextView checkedTextView) {
        this.f787a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f787a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f790d || this.f791e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f790d) {
                a.b.h(mutate, this.f788b);
            }
            if (this.f791e) {
                a.b.i(mutate, this.f789c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f787a.getDrawableState());
            }
            this.f787a.setCheckMarkDrawable(mutate);
        }
    }
}
