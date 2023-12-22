package u1;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o1.h;
import u1.n;

public final class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f12176b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f12177a;

    public static class a implements o<Uri, InputStream> {
        public final n<Uri, InputStream> b(r rVar) {
            return new x(rVar.b(f.class, InputStream.class));
        }
    }

    public x(n<f, Data> nVar) {
        this.f12177a = nVar;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        return this.f12177a.a(new f(((Uri) obj).toString()), i10, i11, hVar);
    }

    public final boolean b(Object obj) {
        return f12176b.contains(((Uri) obj).getScheme());
    }
}
