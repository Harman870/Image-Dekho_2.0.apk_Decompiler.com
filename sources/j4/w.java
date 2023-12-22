package j4;

import java.util.ArrayList;
import o.c;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8532a = new ArrayList();

    public abstract p a(String str, c cVar, ArrayList arrayList);

    public final void b(String str) {
        if (this.f8532a.contains(j4.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
