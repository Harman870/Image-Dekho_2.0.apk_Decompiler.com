package p6;

import androidx.activity.f;
import n6.b;
import n6.d;
import n6.e;

public final /* synthetic */ class a implements d {
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        StringBuilder g10 = f.g("Couldn't find encoder for type ");
        g10.append(obj.getClass().getCanonicalName());
        throw new b(g10.toString());
    }
}
