package o3;

import androidx.lifecycle.c0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10574a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10575b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f10576c;

    public /* synthetic */ o(boolean z9, String str, t tVar) {
        this.f10574a = z9;
        this.f10575b = str;
        this.f10576c = tVar;
    }

    public final Object call() {
        boolean z9;
        String str;
        MessageDigest messageDigest;
        boolean z10 = this.f10574a;
        String str2 = this.f10575b;
        t tVar = this.f10576c;
        if (z10 || !x.a(str2, tVar, true, false).f10558a) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (true != z9) {
            str = "not allowed";
        } else {
            str = "debug cert rejected";
        }
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = str2;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        r3.o.h(messageDigest);
        byte[] digest = messageDigest.digest(tVar.F());
        int length = digest.length;
        char[] cArr = new char[(length + length)];
        int i11 = 0;
        for (byte b10 : digest) {
            byte b11 = b10 & 255;
            int i12 = i11 + 1;
            char[] cArr2 = c0.f1727l;
            cArr[i11] = cArr2[b11 >>> 4];
            cArr[i12] = cArr2[b11 & 15];
            i11 = i12 + 1;
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z10);
        objArr[4] = "12451000.false";
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
    }
}
