package e0;

import a0.e;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.lifecycle.c0;
import e0.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f6124a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6125b;

    public c(e.a aVar, Handler handler) {
        this.f6124a = aVar;
        this.f6125b = handler;
    }

    public final void a(k.a aVar) {
        boolean z9;
        int i10 = aVar.f6148b;
        if (i10 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Typeface typeface = aVar.f6147a;
            this.f6125b.post(new a(this.f6124a, typeface));
            return;
        }
        this.f6125b.post(new b(this.f6124a, i10));
    }
}
