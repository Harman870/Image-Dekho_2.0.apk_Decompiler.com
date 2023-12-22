package z8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import x8.f;

public final class a extends y8.a {
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        f.e(current, "current()");
        return current;
    }
}
