package u9;

import j9.b0;
import java.util.Objects;

public final class j extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(b0<?> b0Var) {
        super("HTTP " + b0Var.f12245a.f8823c + " " + b0Var.f12245a.f8824d);
        Objects.requireNonNull(b0Var, "response == null");
        b0 b0Var2 = b0Var.f12245a;
        int i10 = b0Var2.f8823c;
        String str = b0Var2.f8824d;
    }
}
