package z7;

import com.ironsource.sdk.utils.c;
import java.security.MessageDigest;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13238a;

    /* renamed from: b  reason: collision with root package name */
    public String f13239b;

    public /* synthetic */ e(String str, int i10) {
        this.f13238a = i10;
        this.f13239b = str;
    }

    public static String a(String str) {
        try {
            return c.a(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                byte[] digest = instance.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b10 : digest) {
                    String hexString = Integer.toHexString(b10 & 255);
                    if (hexString.length() < 2) {
                        hexString = "0" + hexString;
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    public final String toString() {
        switch (this.f13238a) {
            case 1:
                return '<' + this.f13239b + '>';
            default:
                return super.toString();
        }
    }
}
