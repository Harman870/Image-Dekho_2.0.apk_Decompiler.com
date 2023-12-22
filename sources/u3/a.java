package u3;

import android.util.Log;
import java.util.Locale;
import r3.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12198a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12199b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12200c;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f12199b = str2;
        this.f12198a = str;
        new h(str, (String) null);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f12198a, i10)) {
            i10++;
        }
        this.f12200c = i10;
    }

    public final void a(String str, Object... objArr) {
        boolean z9;
        if (this.f12200c <= 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Log.d(this.f12198a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f12198a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f12198a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f12199b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        boolean z9;
        if (this.f12200c <= 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            Log.v(this.f12198a, d(str, objArr));
        }
    }
}
