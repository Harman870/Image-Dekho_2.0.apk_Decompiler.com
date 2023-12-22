package i4;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;
import o.g;

public final class x6 {

    /* renamed from: a  reason: collision with root package name */
    public c7 f7787a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f7788b = null;

    /* renamed from: c  reason: collision with root package name */
    public z6 f7789c = null;

    /* renamed from: d  reason: collision with root package name */
    public a4 f7790d = null;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public d4 f7791e;

    /* renamed from: f  reason: collision with root package name */
    public b7 f7792f = null;

    @Deprecated
    public final void a(bc bcVar) {
        String A = bcVar.A();
        byte[] r4 = bcVar.z().r();
        int y9 = bcVar.y();
        int i10 = y6.f7812c;
        int b10 = g.b(y9);
        int i11 = 4;
        if (b10 == 1) {
            i11 = 1;
        } else if (b10 == 2) {
            i11 = 2;
        } else if (b10 == 3) {
            i11 = 3;
        } else if (b10 != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.f7790d = a4.a(A, r4, i11);
    }

    public final void b(Context context, String str) {
        if (context != null) {
            this.f7792f = new b7(context, str);
            this.f7787a = new c7(context, str);
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized y6 c() {
        d4 d4Var;
        if (this.f7788b != null) {
            this.f7789c = d();
        }
        try {
            d4Var = e();
        } catch (FileNotFoundException e10) {
            int i10 = y6.f7812c;
            if (Log.isLoggable("y6", 4)) {
                int i11 = y6.f7812c;
                Log.i("y6", String.format("keyset not found, will generate a new one. %s", new Object[]{e10.getMessage()}));
            }
            if (this.f7790d != null) {
                d4Var = new d4(gc.x());
                d4Var.b(this.f7790d);
                d4Var.c(p4.a(d4Var.a().f7223a).w().v());
                if (this.f7789c != null) {
                    d4Var.a().c(this.f7787a, this.f7789c);
                } else {
                    this.f7787a.b(d4Var.a().f7223a);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.f7791e = d4Var;
        return new y6(this);
    }

    public final z6 d() {
        a7 a7Var = new a7();
        boolean b10 = a7Var.b(this.f7788b);
        if (!b10) {
            try {
                String str = this.f7788b;
                if (!new a7().b(str)) {
                    String a10 = vd.a(str);
                    KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance.init(new KeyGenParameterSpec.Builder(a10, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                    instance.generateKey();
                } else {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                }
            } catch (GeneralSecurityException | ProviderException e10) {
                e = e10;
                int i10 = y6.f7812c;
                Log.w("y6", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return a7Var.zza(this.f7788b);
        } catch (GeneralSecurityException | ProviderException e11) {
            e = e11;
            if (b10) {
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f7788b}), e);
            }
            int i102 = y6.f7812c;
            Log.w("y6", "cannot use Android Keystore, it'll be disabled", e);
            return null;
        }
    }

    public final d4 e() {
        z6 z6Var = this.f7789c;
        if (z6Var != null) {
            try {
                gc gcVar = c4.e(this.f7792f, z6Var).f7223a;
                z0 z0Var = (z0) gcVar.p(5);
                z0Var.b(gcVar);
                return new d4((dc) z0Var);
            } catch (i1 | GeneralSecurityException e10) {
                int i10 = y6.f7812c;
                Log.w("y6", "cannot decrypt keyset: ", e10);
            }
        }
        gc A = gc.A(this.f7792f.a(), p0.f7582b);
        if (A.v() > 0) {
            c9 c9Var = c9.f7230b;
            z0 z0Var2 = (z0) A.p(5);
            z0Var2.b(A);
            return new d4((dc) z0Var2);
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
