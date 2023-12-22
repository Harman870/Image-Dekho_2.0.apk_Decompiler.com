package h4;

import androidx.activity.f;

public final class c extends androidx.activity.result.c {

    /* renamed from: b  reason: collision with root package name */
    public final char f6880b;

    public c(char c10) {
        this.f6880b = c10;
    }

    public final boolean s(char c10) {
        return c10 == this.f6880b;
    }

    public final String toString() {
        StringBuilder g10 = f.g("CharMatcher.is('");
        int i10 = this.f6880b;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        g10.append(String.copyValueOf(cArr));
        g10.append("')");
        return g10.toString();
    }
}
