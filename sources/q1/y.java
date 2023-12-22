package q1;

import j2.i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o1.f;
import o1.h;
import o1.l;
import r1.b;

public final class y implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final i<Class<?>, byte[]> f11158j = new i<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final b f11159b;

    /* renamed from: c  reason: collision with root package name */
    public final f f11160c;

    /* renamed from: d  reason: collision with root package name */
    public final f f11161d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11162e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11163f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f11164g;

    /* renamed from: h  reason: collision with root package name */
    public final h f11165h;

    /* renamed from: i  reason: collision with root package name */
    public final l<?> f11166i;

    public y(b bVar, f fVar, f fVar2, int i10, int i11, l<?> lVar, Class<?> cls, h hVar) {
        this.f11159b = bVar;
        this.f11160c = fVar;
        this.f11161d = fVar2;
        this.f11162e = i10;
        this.f11163f = i11;
        this.f11166i = lVar;
        this.f11164g = cls;
        this.f11165h = hVar;
    }

    public final void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11159b.d();
        ByteBuffer.wrap(bArr).putInt(this.f11162e).putInt(this.f11163f).array();
        this.f11161d.b(messageDigest);
        this.f11160c.b(messageDigest);
        messageDigest.update(bArr);
        l<?> lVar = this.f11166i;
        if (lVar != null) {
            lVar.b(messageDigest);
        }
        this.f11165h.b(messageDigest);
        i<Class<?>, byte[]> iVar = f11158j;
        byte[] a10 = iVar.a(this.f11164g);
        if (a10 == null) {
            a10 = this.f11164g.getName().getBytes(f.f10513a);
            iVar.d(this.f11164g, a10);
        }
        messageDigest.update(a10);
        this.f11159b.put(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f11163f == yVar.f11163f && this.f11162e == yVar.f11162e && j2.l.b(this.f11166i, yVar.f11166i) && this.f11164g.equals(yVar.f11164g) && this.f11160c.equals(yVar.f11160c) && this.f11161d.equals(yVar.f11161d) && this.f11165h.equals(yVar.f11165h);
    }

    public final int hashCode() {
        int hashCode = ((((this.f11161d.hashCode() + (this.f11160c.hashCode() * 31)) * 31) + this.f11162e) * 31) + this.f11163f;
        l<?> lVar = this.f11166i;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        int hashCode2 = this.f11164g.hashCode();
        return this.f11165h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g10 = androidx.activity.f.g("ResourceCacheKey{sourceKey=");
        g10.append(this.f11160c);
        g10.append(", signature=");
        g10.append(this.f11161d);
        g10.append(", width=");
        g10.append(this.f11162e);
        g10.append(", height=");
        g10.append(this.f11163f);
        g10.append(", decodedResourceClass=");
        g10.append(this.f11164g);
        g10.append(", transformation='");
        g10.append(this.f11166i);
        g10.append('\'');
        g10.append(", options=");
        g10.append(this.f11165h);
        g10.append('}');
        return g10.toString();
    }
}
