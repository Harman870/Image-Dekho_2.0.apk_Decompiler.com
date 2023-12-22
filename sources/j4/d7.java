package j4;

import c.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d7 {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8104c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a9 f8105a = new a9(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f8106b;

    static {
        new d7(0);
    }

    public d7() {
    }

    public d7(int i10) {
        a();
        a();
    }

    public static final void c(c7 c7Var, Object obj) {
        boolean z9;
        y9 zzb = c7Var.zzb();
        Charset charset = s7.f8462a;
        obj.getClass();
        y9[] y9VarArr = y9.f8570b;
        z9 z9Var = z9.f8584b;
        switch (zzb.f8571a.ordinal()) {
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
                if ((obj instanceof q6) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof n8) {
                    return;
                }
                break;
        }
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(c7Var.zza()), c7Var.zzb().f8571a, obj.getClass().getName()}));
    }

    public final void a() {
        if (!this.f8106b) {
            for (int i10 = 0; i10 < this.f8105a.b(); i10++) {
                Map.Entry entry = (Map.Entry) this.f8105a.f8219b.get(i10);
                if (entry.getValue() instanceof m7) {
                    m7 m7Var = (m7) entry.getValue();
                    m7Var.getClass();
                    v8.f8521c.a(m7Var.getClass()).a(m7Var);
                    m7Var.o();
                }
            }
            this.f8105a.a();
            this.f8106b = true;
        }
    }

    public final void b(c7 c7Var, Object obj) {
        if (!c7Var.zzc()) {
            c(c7Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(c7Var, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f8105a.put(c7Var, obj);
    }

    public final Object clone() {
        Iterable<Map.Entry> iterable;
        d7 d7Var = new d7();
        for (int i10 = 0; i10 < this.f8105a.b(); i10++) {
            Map.Entry entry = (Map.Entry) this.f8105a.f8219b.get(i10);
            d7Var.b((c7) entry.getKey(), entry.getValue());
        }
        a9 a9Var = this.f8105a;
        if (a9Var.f8220c.isEmpty()) {
            iterable = a.k;
        } else {
            iterable = a9Var.f8220c.entrySet();
        }
        for (Map.Entry entry2 : iterable) {
            d7Var.b((c7) entry2.getKey(), entry2.getValue());
        }
        return d7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        return this.f8105a.equals(((d7) obj).f8105a);
    }

    public final int hashCode() {
        return this.f8105a.hashCode();
    }
}
