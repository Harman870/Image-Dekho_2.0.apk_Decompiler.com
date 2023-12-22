package i4;

import androidx.activity.result.c;
import androidx.fragment.app.w0;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class d8 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7253a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7254b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7255c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7256d;

    public /* synthetic */ d8(a8 a8Var) {
        this.f7253a = new HashMap(a8Var.f7184a);
        this.f7254b = new HashMap(a8Var.f7185b);
        this.f7255c = new HashMap(a8Var.f7186c);
        this.f7256d = new HashMap(a8Var.f7187d);
    }

    public final c a(y7 y7Var) {
        b8 b8Var = new b8(y7.class, y7Var.f7816b);
        if (this.f7254b.containsKey(b8Var)) {
            return ((f7) this.f7254b.get(b8Var)).a(y7Var);
        }
        throw new GeneralSecurityException(w0.d("No Key Parser for requested key type ", b8Var.toString(), " available"));
    }
}
