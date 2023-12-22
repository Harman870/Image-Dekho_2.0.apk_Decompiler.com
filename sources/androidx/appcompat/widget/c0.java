package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f740c;

    public c0(TextView textView, Typeface typeface, int i10) {
        this.f738a = textView;
        this.f739b = typeface;
        this.f740c = i10;
    }

    public final void run() {
        this.f738a.setTypeface(this.f739b, this.f740c);
    }
}
