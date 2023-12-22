package i4;

import androidx.activity.f;
import androidx.lifecycle.c0;

public final class r9 extends c0 {
    public final String toString() {
        StringBuilder g10 = f.g("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = 46;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        g10.append(String.copyValueOf(cArr));
        g10.append("')");
        return g10.toString();
    }
}
