package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.b;
import androidx.activity.result.f;
import b.a;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0016a f268b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f269c;

    public g(ComponentActivity.b bVar, int i10, a.C0016a aVar) {
        this.f269c = bVar;
        this.f267a = i10;
        this.f268b = aVar;
    }

    public final void run() {
        b<O> bVar;
        ComponentActivity.b bVar2 = this.f269c;
        int i10 = this.f267a;
        T t10 = this.f268b.f2192a;
        String str = (String) bVar2.f298b.get(Integer.valueOf(i10));
        if (str != null) {
            f.a aVar = (f.a) bVar2.f302f.get(str);
            if (aVar == null || (bVar = aVar.f305a) == null) {
                bVar2.f304h.remove(str);
                bVar2.f303g.put(str, t10);
            } else if (bVar2.f301e.remove(str)) {
                bVar.b(t10);
            }
        }
    }
}
