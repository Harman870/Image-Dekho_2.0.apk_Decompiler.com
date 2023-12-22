package w3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import y3.c;

public final class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo b10 = c.a(context).b(64, str);
        Signature[] signatureArr = b10.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        break;
                    }
                    i10++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(b10.signatures[0].toByteArray());
            }
        }
        return null;
    }
}
