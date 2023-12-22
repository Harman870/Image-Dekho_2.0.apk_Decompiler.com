package c6;

import r3.o;

public class g extends Exception {
    @Deprecated
    public g() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(str);
        o.f("Detail message must not be empty", str);
    }
}
