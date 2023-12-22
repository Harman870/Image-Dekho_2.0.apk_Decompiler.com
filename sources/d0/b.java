package d0;

import android.os.Bundle;
import android.os.IBinder;
import x8.f;

public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        f.f(bundle, "bundle");
        f.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
