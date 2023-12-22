package o1;

import androidx.activity.f;
import j2.b;
import java.security.MessageDigest;
import o1.g;

public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    public final b f10519b = new b();

    public final void b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            b bVar = this.f10519b;
            if (i10 < bVar.f9301c) {
                g gVar = (g) bVar.h(i10);
                Object l6 = this.f10519b.l(i10);
                g.b<T> bVar2 = gVar.f10516b;
                if (gVar.f10518d == null) {
                    gVar.f10518d = gVar.f10517c.getBytes(f.f10513a);
                }
                bVar2.a(gVar.f10518d, l6, messageDigest);
                i10++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        if (this.f10519b.containsKey(gVar)) {
            return this.f10519b.getOrDefault(gVar, null);
        }
        return gVar.f10515a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f10519b.equals(((h) obj).f10519b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10519b.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("Options{values=");
        g10.append(this.f10519b);
        g10.append('}');
        return g10.toString();
    }
}
