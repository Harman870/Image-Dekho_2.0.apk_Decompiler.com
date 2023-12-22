package n5;

import android.graphics.Typeface;
import androidx.activity.result.c;
import j5.b;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final Typeface f10360b;

    /* renamed from: c  reason: collision with root package name */
    public final C0118a f10361c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10362d;

    /* renamed from: n5.a$a  reason: collision with other inner class name */
    public interface C0118a {
    }

    public a(b bVar, Typeface typeface) {
        super(0);
        this.f10360b = typeface;
        this.f10361c = bVar;
    }

    public final void k(int i10) {
        Typeface typeface = this.f10360b;
        if (!this.f10362d) {
            j5.c cVar = ((b) this.f10361c).f8599a;
            if (cVar.j(typeface)) {
                cVar.h(false);
            }
        }
    }

    public final void l(Typeface typeface, boolean z9) {
        if (!this.f10362d) {
            j5.c cVar = ((b) this.f10361c).f8599a;
            if (cVar.j(typeface)) {
                cVar.h(false);
            }
        }
    }
}
