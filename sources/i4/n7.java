package i4;

import androidx.lifecycle.c0;
import o.g;

public final class n7 extends c0 {

    /* renamed from: o  reason: collision with root package name */
    public final String f7526o;

    /* renamed from: p  reason: collision with root package name */
    public final int f7527p;

    public /* synthetic */ n7(String str, int i10) {
        super((Object) null);
        this.f7526o = str;
        this.f7527p = i10;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f7526o;
        int b10 = g.b(this.f7527p);
        objArr[1] = b10 != 1 ? b10 != 2 ? b10 != 3 ? b10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
