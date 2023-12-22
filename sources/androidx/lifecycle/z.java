package androidx.lifecycle;

import android.os.Bundle;
import d1.b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o8.g;
import x8.f;
import x8.k;
import y0.a;
import y0.c;
import y0.e;

public final class z implements b.C0076b {

    /* renamed from: a  reason: collision with root package name */
    public final b f1779a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1780b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1781c;

    /* renamed from: d  reason: collision with root package name */
    public final g f1782d;

    public static final class a extends x8.g implements w8.a<a0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f0 f1783c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var) {
            super(0);
            this.f1783c = f0Var;
        }

        public final Object invoke() {
            y0.a aVar;
            f0 f0Var = this.f1783c;
            Class<a0> cls = a0.class;
            f.f(f0Var, "<this>");
            c cVar = new c(0);
            y yVar = y.f1778c;
            k.f13004a.getClass();
            x8.c cVar2 = new x8.c(cls);
            f.f(yVar, "initializer");
            Class<?> a10 = cVar2.a();
            f.d(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            ((List) cVar.f13011a).add(new e(a10, yVar));
            Object[] array = ((List) cVar.f13011a).toArray(new e[0]);
            if (array != null) {
                e[] eVarArr = (e[]) array;
                y0.b bVar = new y0.b((e[]) Arrays.copyOf(eVarArr, eVarArr.length));
                e0 p5 = f0Var.p();
                f.e(p5, "owner.viewModelStore");
                if (f0Var instanceof f) {
                    aVar = ((f) f0Var).m();
                    f.e(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
                } else {
                    aVar = a.C0169a.f13009b;
                }
                return (a0) new d0(p5, bVar, aVar).b(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public z(b bVar, f0 f0Var) {
        f.f(bVar, "savedStateRegistry");
        f.f(f0Var, "viewModelStoreOwner");
        this.f1779a = bVar;
        this.f1782d = new g(new a(f0Var));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1781c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((a0) this.f1782d.getValue()).f1714c.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((w) entry.getValue()).f1774e.a();
            if (!f.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f1780b = false;
        return bundle;
    }
}
