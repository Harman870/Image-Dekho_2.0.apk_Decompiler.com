package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2024a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2025b;

    public c(k kVar, ArrayList arrayList) {
        this.f2025b = kVar;
        this.f2024a = arrayList;
    }

    public final void run() {
        Iterator it = this.f2024a.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2025b;
            RecyclerView.z zVar = bVar.f2075a;
            int i10 = bVar.f2076b;
            int i11 = bVar.f2077c;
            int i12 = bVar.f2078d;
            int i13 = bVar.f2079e;
            kVar.getClass();
            View view = zVar.f1942a;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (i14 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i15 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.f2066p.add(zVar);
            animate.setDuration(kVar.f1861e).setListener(new h(kVar, zVar, i14, view, i15, animate)).start();
        }
        this.f2024a.clear();
        this.f2025b.f2063m.remove(this.f2024a);
    }
}
