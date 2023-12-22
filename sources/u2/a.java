package u2;

import androidx.lifecycle.c0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import t2.b;
import w2.l;

public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f12178c = c0.h("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    public static final Set<b> f12179d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f12180e;

    /* renamed from: a  reason: collision with root package name */
    public final String f12181a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12182b;

    static {
        String h10 = c0.h("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String h11 = c0.h("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f12180e = new a(h10, h11);
    }

    public a(String str, String str2) {
        this.f12181a = str;
        this.f12182b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f12182b;
        if (str == null && this.f12181a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f12181a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
