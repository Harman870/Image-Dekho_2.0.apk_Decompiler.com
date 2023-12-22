package k7;

import androidx.activity.f;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class b implements Closeable, Flushable {

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f9132h = new String[128];

    /* renamed from: a  reason: collision with root package name */
    public final Writer f9133a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9134b;

    /* renamed from: c  reason: collision with root package name */
    public int f9135c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f9136d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9137e;

    /* renamed from: f  reason: collision with root package name */
    public String f9138f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9139g;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f9132h[i10] = String.format("\\u%04x", new Object[]{Integer.valueOf(i10)});
        }
        String[] strArr = f9132h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f9134b = iArr;
        if (iArr.length == 0) {
            int[] iArr2 = new int[(0 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, 0);
            this.f9134b = iArr2;
        }
        int[] iArr3 = this.f9134b;
        int i10 = this.f9135c;
        this.f9135c = i10 + 1;
        iArr3[i10] = 6;
        this.f9136d = ":";
        this.f9139g = true;
        if (writer != null) {
            this.f9133a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final int A() {
        int i10 = this.f9135c;
        if (i10 != 0) {
            return this.f9134b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void E(String str) {
        String str2;
        String[] strArr = f9132h;
        this.f9133a.write("\"");
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i10 < i11) {
                this.f9133a.write(str, i10, i11 - i10);
            }
            this.f9133a.write(str2);
            i10 = i11 + 1;
        }
        if (i10 < length) {
            this.f9133a.write(str, i10, length - i10);
        }
        this.f9133a.write("\"");
    }

    public void L(long j10) {
        Q();
        a();
        this.f9133a.write(Long.toString(j10));
    }

    public void M(Boolean bool) {
        if (bool == null) {
            v();
            return;
        }
        Q();
        a();
        this.f9133a.write(bool.booleanValue() ? "true" : "false");
    }

    public void N(Number number) {
        if (number == null) {
            v();
            return;
        }
        Q();
        String obj = number.toString();
        if (this.f9137e || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.f9133a.append(obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void O(String str) {
        if (str == null) {
            v();
            return;
        }
        Q();
        a();
        E(str);
    }

    public void P(boolean z9) {
        Q();
        a();
        this.f9133a.write(z9 ? "true" : "false");
    }

    public final void Q() {
        if (this.f9138f != null) {
            int A = A();
            if (A == 5) {
                this.f9133a.write(44);
            } else if (A != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f9134b[this.f9135c - 1] = 4;
            E(this.f9138f);
            this.f9138f = null;
        }
    }

    public final void a() {
        int A = A();
        if (A == 1) {
            this.f9134b[this.f9135c - 1] = 2;
        } else if (A == 2) {
            this.f9133a.append(',');
        } else if (A != 4) {
            if (A != 6) {
                if (A != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f9137e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f9134b[this.f9135c - 1] = 7;
        } else {
            this.f9133a.append(this.f9136d);
            this.f9134b[this.f9135c - 1] = 5;
        }
    }

    public void c() {
        Q();
        a();
        int i10 = this.f9135c;
        int[] iArr = this.f9134b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[(i10 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f9134b = iArr2;
        }
        int[] iArr3 = this.f9134b;
        int i11 = this.f9135c;
        this.f9135c = i11 + 1;
        iArr3[i11] = 1;
        this.f9133a.write("[");
    }

    public void close() {
        this.f9133a.close();
        int i10 = this.f9135c;
        if (i10 > 1 || (i10 == 1 && this.f9134b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f9135c = 0;
    }

    public void flush() {
        if (this.f9135c != 0) {
            this.f9133a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void j() {
        Q();
        a();
        int i10 = this.f9135c;
        int[] iArr = this.f9134b;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[(i10 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f9134b = iArr2;
        }
        int[] iArr3 = this.f9134b;
        int i11 = this.f9135c;
        this.f9135c = i11 + 1;
        iArr3[i11] = 3;
        this.f9133a.write("{");
    }

    public final void o(int i10, int i11, String str) {
        int A = A();
        if (A != i11 && A != i10) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f9138f == null) {
            this.f9135c--;
            this.f9133a.write(str);
        } else {
            StringBuilder g10 = f.g("Dangling name: ");
            g10.append(this.f9138f);
            throw new IllegalStateException(g10.toString());
        }
    }

    public void s() {
        o(1, 2, "]");
    }

    public void t() {
        o(3, 5, "}");
    }

    public void u(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f9138f != null) {
            throw new IllegalStateException();
        } else if (this.f9135c != 0) {
            this.f9138f = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public b v() {
        if (this.f9138f != null) {
            if (this.f9139g) {
                Q();
            } else {
                this.f9138f = null;
                return this;
            }
        }
        a();
        this.f9133a.write("null");
        return this;
    }
}
