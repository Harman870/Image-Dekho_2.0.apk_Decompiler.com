package x2;

import android.content.Context;
import androidx.activity.e;
import androidx.activity.f;
import f3.a;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12930a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12931b;

    /* renamed from: c  reason: collision with root package name */
    public final a f12932c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12933d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f12930a = context;
            if (aVar != null) {
                this.f12931b = aVar;
                if (aVar2 != null) {
                    this.f12932c = aVar2;
                    if (str != null) {
                        this.f12933d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context a() {
        return this.f12930a;
    }

    public final String b() {
        return this.f12933d;
    }

    public final a c() {
        return this.f12932c;
    }

    public final a d() {
        return this.f12931b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12930a.equals(hVar.a()) && this.f12931b.equals(hVar.d()) && this.f12932c.equals(hVar.c()) && this.f12933d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f12930a.hashCode() ^ 1000003) * 1000003) ^ this.f12931b.hashCode()) * 1000003) ^ this.f12932c.hashCode()) * 1000003) ^ this.f12933d.hashCode();
    }

    public final String toString() {
        StringBuilder g10 = f.g("CreationContext{applicationContext=");
        g10.append(this.f12930a);
        g10.append(", wallClock=");
        g10.append(this.f12931b);
        g10.append(", monotonicClock=");
        g10.append(this.f12932c);
        g10.append(", backendName=");
        return e.c(g10, this.f12933d, "}");
    }
}
