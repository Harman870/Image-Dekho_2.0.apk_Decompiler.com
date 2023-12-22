package d0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import x8.f;

public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        f.f(bundle, "bundle");
        f.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        f.f(bundle, "bundle");
        f.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
