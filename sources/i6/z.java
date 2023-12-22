package i6;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import i4.c4;
import i4.e6;
import i4.j6;
import i4.r3;
import i4.x6;
import i4.y6;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import u1.t;

public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static z f7931c;

    /* renamed from: a  reason: collision with root package name */
    public final String f7932a;

    /* renamed from: b  reason: collision with root package name */
    public final y6 f7933b;

    public z(Context context, String str) {
        y6 y6Var;
        this.f7932a = str;
        try {
            e6.a();
            x6 x6Var = new x6();
            x6Var.b(context, String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            x6Var.a(j6.f7404a);
            String format = String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str});
            if (format.startsWith("android-keystore://")) {
                x6Var.f7788b = format;
                y6Var = x6Var.c();
                this.f7933b = y6Var;
                return;
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e10.getMessage())));
            y6Var = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i6.z a(android.content.Context r2, java.lang.String r3) {
        /*
            i6.z r0 = f7931c
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f7932a
            r1 = 0
            if (r0 == r3) goto L_0x0011
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 != 0) goto L_0x001b
        L_0x0014:
            i6.z r0 = new i6.z
            r0.<init>(r2, r3)
            f7931c = r0
        L_0x001b:
            i6.z r2 = f7931c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.z.a(android.content.Context, java.lang.String):i6.z");
    }

    public final String b(String str) {
        c4 a10;
        String str2;
        y6 y6Var = this.f7933b;
        if (y6Var != null) {
            try {
                synchronized (y6Var) {
                    y6 y6Var2 = this.f7933b;
                    synchronized (y6Var2) {
                        a10 = y6Var2.f7814b.a();
                    }
                    str2 = new String(((r3) a10.b()).zza(Base64.decode(str, 8)), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
                Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e10.getMessage())));
                return null;
            }
        } else {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
    }

    public final String c() {
        c4 a10;
        if (this.f7933b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        t tVar = new t((Object) byteArrayOutputStream);
        try {
            synchronized (this.f7933b) {
                y6 y6Var = this.f7933b;
                synchronized (y6Var) {
                    a10 = y6Var.f7814b.a();
                }
                a10.a().d(tVar);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e10.getMessage())));
            return null;
        }
    }
}
