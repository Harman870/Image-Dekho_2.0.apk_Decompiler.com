package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public abstract class z extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2152g = true;

    public final boolean a(RecyclerView.z zVar, RecyclerView.z zVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f1863a;
        int i13 = cVar.f1864b;
        if (zVar2.o()) {
            int i14 = cVar.f1863a;
            i10 = cVar.f1864b;
            i11 = i14;
        } else {
            i11 = cVar2.f1863a;
            i10 = cVar2.f1864b;
        }
        k kVar = (k) this;
        if (zVar == zVar2) {
            return kVar.h(zVar, i12, i13, i11, i10);
        }
        float translationX = zVar.f1942a.getTranslationX();
        float translationY = zVar.f1942a.getTranslationY();
        float alpha = zVar.f1942a.getAlpha();
        kVar.m(zVar);
        zVar.f1942a.setTranslationX(translationX);
        zVar.f1942a.setTranslationY(translationY);
        zVar.f1942a.setAlpha(alpha);
        kVar.m(zVar2);
        zVar2.f1942a.setTranslationX((float) (-((int) (((float) (i11 - i12)) - translationX))));
        zVar2.f1942a.setTranslationY((float) (-((int) (((float) (i10 - i13)) - translationY))));
        zVar2.f1942a.setAlpha(0.0f);
        kVar.k.add(new k.a(zVar, zVar2, i12, i13, i11, i10));
        return true;
    }

    public abstract boolean h(RecyclerView.z zVar, int i10, int i11, int i12, int i13);
}
