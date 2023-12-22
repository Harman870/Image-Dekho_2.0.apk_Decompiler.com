package androidx.fragment.app;

import android.view.ViewGroup;
import j1.a;

@Deprecated
public abstract class d0 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final y f1447a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1448b;

    /* renamed from: c  reason: collision with root package name */
    public a f1449c = null;

    /* renamed from: d  reason: collision with root package name */
    public o f1450d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1451e;

    @Deprecated
    public d0(y yVar) {
        this.f1447a = yVar;
        this.f1448b = 0;
    }

    public final void c(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
