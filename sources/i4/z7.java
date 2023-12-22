package i4;

import android.os.Looper;
import com.bumptech.glide.manager.g;
import java.security.Provider;
import java.security.Signature;

public final class z7 implements g, md {
    public /* synthetic */ z7() {
    }

    public /* synthetic */ z7(int i10) {
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public final /* bridge */ /* synthetic */ Object b(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    public final void f() {
    }
}
