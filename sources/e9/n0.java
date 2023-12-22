package e9;

import java.util.concurrent.CancellationException;
import q8.f;

public interface n0 extends f.b {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f6254a0 = 0;

    public static final class a {
        public static /* synthetic */ b0 a(n0 n0Var, boolean z9, q0 q0Var, int i10) {
            boolean z10 = false;
            if ((i10 & 1) != 0) {
                z9 = false;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return n0Var.o(z9, z10, q0Var);
        }
    }

    public static final class b implements f.c<n0> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ b f6255a = new b();
    }

    void A(CancellationException cancellationException);

    boolean a();

    b0 o(boolean z9, boolean z10, q0 q0Var);

    CancellationException u();
}
