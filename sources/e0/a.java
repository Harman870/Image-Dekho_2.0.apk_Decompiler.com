package e0;

import a0.e;
import android.graphics.Typeface;
import androidx.lifecycle.c0;
import z.f;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c0 f6120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f6121b;

    public a(c0 c0Var, Typeface typeface) {
        this.f6120a = c0Var;
        this.f6121b = typeface;
    }

    public final void run() {
        c0 c0Var = this.f6120a;
        Typeface typeface = this.f6121b;
        f.e eVar = ((e.a) c0Var).f13o;
        if (eVar != null) {
            eVar.d(typeface);
        }
    }
}
