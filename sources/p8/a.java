package p8;

import java.util.Collection;

public class a extends c.a {
    public static final int u(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
