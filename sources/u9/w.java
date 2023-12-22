package u9;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

public final class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f12319a;

    public w(x xVar) {
        this.f12319a = xVar;
    }

    public final void a(z zVar, @Nullable Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                this.f12319a.a(zVar, Array.get(obj, i10));
            }
        }
    }
}
