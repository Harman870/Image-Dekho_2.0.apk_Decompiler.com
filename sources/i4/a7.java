package i4;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

public final class a7 implements e4 {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f7183a;

    public a7() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.f7183a = instance;
        } catch (IOException | GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final synchronized boolean a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = i4.vd.a(r3)     // Catch:{ all -> 0x0034 }
            java.security.KeyStore r0 = r2.f7183a     // Catch:{ NullPointerException -> 0x000d }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000d }
            monitor-exit(r2)
            return r3
        L_0x000d:
            java.lang.String r0 = "a7"
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0034 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r2.f7183a = r0     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
        L_0x0025:
            java.security.KeyStore r0 = r2.f7183a     // Catch:{ all -> 0x0034 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.a7.b(java.lang.String):boolean");
    }

    public final synchronized z6 zza(String str) {
        z6 z6Var;
        z6Var = new z6(vd.a(str), this.f7183a);
        byte[] a10 = td.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, z6Var.a(z6Var.b(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return z6Var;
    }
}
