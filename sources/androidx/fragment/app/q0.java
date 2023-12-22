package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class q0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f1609a = "FragmentManager";

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f1610b = new StringBuilder(128);

    public final void a() {
        if (this.f1610b.length() > 0) {
            Log.d(this.f1609a, this.f1610b.toString());
            StringBuilder sb = this.f1610b;
            sb.delete(0, sb.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                a();
            } else {
                this.f1610b.append(c10);
            }
        }
    }
}
