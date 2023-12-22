package d7;

import com.google.firebase.components.ComponentRegistrar;
import j6.a;
import j6.e;
import java.util.ArrayList;
import java.util.List;

public final class b implements e {
    public final List<a<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (a next : componentRegistrar.getComponents()) {
            String str = next.f8717a;
            if (str != null) {
                next = new a(str, next.f8718b, next.f8719c, next.f8720d, next.f8721e, new a(str, next), next.f8723g);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
