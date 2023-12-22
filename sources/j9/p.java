package j9;

import androidx.fragment.app.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;
import k9.e;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f8939a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f8940a = new ArrayList(20);

        public final void a(String str, String str2) {
            p.a(str);
            p.b(str2, str);
            b(str, str2);
        }

        public final void b(String str, String str2) {
            this.f8940a.add(str);
            this.f8940a.add(str2.trim());
        }

        public final void c(String str) {
            int i10 = 0;
            while (i10 < this.f8940a.size()) {
                if (str.equalsIgnoreCase((String) this.f8940a.get(i10))) {
                    this.f8940a.remove(i10);
                    this.f8940a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
        }

        public final void d(String str, String str2) {
            p.a(str);
            p.b(str2, str);
            c(str);
            b(str, str2);
        }
    }

    public p(a aVar) {
        ArrayList arrayList = aVar.f8940a;
        this.f8939a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public p(String[] strArr) {
        this.f8939a = strArr;
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i10++;
                } else {
                    throw new IllegalArgumentException(e.j("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(w0.d("value for name ", str2, " == null"));
    }

    public static p f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i10 = 0;
            while (i10 < strArr2.length) {
                String str = strArr2[i10];
                if (str != null) {
                    strArr2[i10] = str.trim();
                    i10++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
                String str2 = strArr2[i11];
                String str3 = strArr2[i11 + 1];
                a(str2);
                b(str3, str2);
            }
            return new p(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public final String c(String str) {
        String[] strArr = this.f8939a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String d(int i10) {
        return this.f8939a[i10 * 2];
    }

    public final a e() {
        a aVar = new a();
        Collections.addAll(aVar.f8940a, this.f8939a);
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f8939a, this.f8939a);
    }

    public final String g(int i10) {
        return this.f8939a[(i10 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8939a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f8939a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(d(i10));
            sb.append(": ");
            sb.append(g(i10));
            sb.append("\n");
        }
        return sb.toString();
    }
}
