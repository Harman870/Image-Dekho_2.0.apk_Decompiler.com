package i4;

import c.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class u0 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7695c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final o2 f7696a = new o2(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f7697b;

    static {
        new u0(0);
    }

    public u0() {
    }

    public u0(int i10) {
        a();
        a();
    }

    public static final void c(t0 t0Var, Object obj) {
        boolean z9;
        n3 zzb = t0Var.zzb();
        Charset charset = g1.f7324a;
        obj.getClass();
        n3[] n3VarArr = n3.f7519b;
        o3 o3Var = o3.f7544b;
        switch (zzb.f7520a.ordinal()) {
            case 0:
                z9 = obj instanceof Integer;
                break;
            case 1:
                z9 = obj instanceof Long;
                break;
            case 2:
                z9 = obj instanceof Float;
                break;
            case 3:
                z9 = obj instanceof Double;
                break;
            case 4:
                z9 = obj instanceof Boolean;
                break;
            case 5:
                z9 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof e0) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof b2) {
                    return;
                }
                break;
        }
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t0Var.zza()), t0Var.zzb().f7520a, obj.getClass().getName()}));
    }

    public final void a() {
        if (!this.f7697b) {
            for (int i10 = 0; i10 < this.f7696a.b(); i10++) {
                Map.Entry entry = (Map.Entry) this.f7696a.f7702b.get(i10);
                if (entry.getValue() instanceof c1) {
                    ((c1) entry.getValue()).d();
                }
            }
            this.f7696a.a();
            this.f7697b = true;
        }
    }

    public final void b(t0 t0Var, Object obj) {
        if (!t0Var.zzc()) {
            c(t0Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(t0Var, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f7696a.put(t0Var, obj);
    }

    public final Object clone() {
        Iterable<Map.Entry> iterable;
        u0 u0Var = new u0();
        for (int i10 = 0; i10 < this.f7696a.b(); i10++) {
            Map.Entry entry = (Map.Entry) this.f7696a.f7702b.get(i10);
            u0Var.b((t0) entry.getKey(), entry.getValue());
        }
        o2 o2Var = this.f7696a;
        if (o2Var.f7703c.isEmpty()) {
            iterable = a.f2348i;
        } else {
            iterable = o2Var.f7703c.entrySet();
        }
        for (Map.Entry entry2 : iterable) {
            u0Var.b((t0) entry2.getKey(), entry2.getValue());
        }
        return u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return this.f7696a.equals(((u0) obj).f7696a);
    }

    public final int hashCode() {
        return this.f7696a.hashCode();
    }
}
