package i4;

import java.security.SecureRandom;

public final class sd extends ThreadLocal {
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
