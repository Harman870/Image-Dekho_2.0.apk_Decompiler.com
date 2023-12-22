package q3;

import com.google.android.gms.tasks.TaskCompletionSource;
import o3.d;

public abstract class l<A, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    public final d[] f11251a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11252b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11253c;

    public static class a<A, ResultT> {

        /* renamed from: a  reason: collision with root package name */
        public j<A, TaskCompletionSource<ResultT>> f11254a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11255b = true;

        /* renamed from: c  reason: collision with root package name */
        public d[] f11256c;

        /* renamed from: d  reason: collision with root package name */
        public int f11257d = 0;
    }

    public l(d[] dVarArr, boolean z9, int i10) {
        this.f11251a = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z9) {
            z10 = true;
        }
        this.f11252b = z10;
        this.f11253c = i10;
    }
}
