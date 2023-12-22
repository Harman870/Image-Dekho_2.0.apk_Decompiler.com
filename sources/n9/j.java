package n9;

import com.ironsource.adapters.ironsource.a;
import j9.v;
import java.net.ProtocolException;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final v f10403a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10404b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10405c;

    public j(v vVar, int i10, String str) {
        this.f10403a = vVar;
        this.f10404b = i10;
        this.f10405c = str;
    }

    public static j a(String str) {
        String str2;
        v vVar = v.HTTP_1_0;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.g("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    vVar = v.HTTP_1_1;
                } else {
                    throw new ProtocolException(a.g("Unexpected status line: ", str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i10 = 4;
        } else {
            throw new ProtocolException(a.g("Unexpected status line: ", str));
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                int parseInt = Integer.parseInt(str.substring(i10, i11));
                if (str.length() <= i11) {
                    str2 = "";
                } else if (str.charAt(i11) == ' ') {
                    str2 = str.substring(i10 + 4);
                } else {
                    throw new ProtocolException(a.g("Unexpected status line: ", str));
                }
                return new j(vVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.g("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.g("Unexpected status line: ", str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10403a == v.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f10404b);
        if (this.f10405c != null) {
            sb.append(' ');
            sb.append(this.f10405c);
        }
        return sb.toString();
    }
}
