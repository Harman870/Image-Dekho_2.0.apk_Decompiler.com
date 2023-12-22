package n4;

import android.text.TextUtils;
import android.util.Log;
import j4.cb;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r3.o;

public final class i3 extends b5 {

    /* renamed from: c  reason: collision with root package name */
    public char f9825c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f9826d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f9827e;

    /* renamed from: f  reason: collision with root package name */
    public final g3 f9828f = new g3(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final g3 f9829g = new g3(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final g3 f9830h = new g3(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final g3 f9831i = new g3(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final g3 f9832j = new g3(this, 5, true, false);
    public final g3 k = new g3(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final g3 f9833l = new g3(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final g3 f9834m = new g3(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    public final g3 f9835n = new g3(this, 2, false, false);

    public i3(n4 n4Var) {
        super(n4Var);
    }

    public static h3 p(String str) {
        if (str == null) {
            return null;
        }
        return new h3(str);
    }

    public static String q(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String r4 = r(obj, z9);
        String r10 = r(obj2, z9);
        String r11 = r(obj3, z9);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(r4)) {
            sb.append(str2);
            sb.append(r4);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(r10)) {
            sb.append(str2);
            sb.append(r10);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(r11)) {
            sb.append(str3);
            sb.append(r11);
        }
        return sb.toString();
    }

    public static String r(Object obj, boolean z9) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z9) {
                return obj.toString();
            }
            Long l6 = (Long) obj;
            int i11 = (Math.abs(l6.longValue()) > 100 ? 1 : (Math.abs(l6.longValue()) == 100 ? 0 : -1));
            String obj2 = obj.toString();
            if (i11 < 0) {
                return obj2;
            }
            char charAt = obj2.charAt(0);
            String valueOf = String.valueOf(Math.abs(l6.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z9) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String s10 = s(n4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && s(className).equals(s10)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i10++;
                }
                return sb2.toString();
            } else if (obj instanceof h3) {
                return ((h3) obj).f9795a;
            } else {
                if (z9) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    public static String s(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        cb.f8089b.zza().zza();
        if (((Boolean) w2.f10238r0.a((Object) null)).booleanValue()) {
            return "";
        }
        return str;
    }

    public final boolean h() {
        return false;
    }

    public final g3 k() {
        return this.f9834m;
    }

    public final g3 l() {
        return this.f9828f;
    }

    public final g3 m() {
        return this.f9835n;
    }

    public final g3 n() {
        return this.f9831i;
    }

    public final g3 o() {
        return this.k;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String t() {
        String str;
        synchronized (this) {
            try {
                if (this.f9827e == null) {
                    n4 n4Var = this.f9600a;
                    String str2 = n4Var.f9989d;
                    if (str2 != null) {
                        this.f9827e = str2;
                    } else {
                        n4Var.f9992g.f9600a.getClass();
                        this.f9827e = "FA";
                    }
                }
                o.h(this.f9827e);
                str = this.f9827e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void u(int i10, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String t10;
        String str2;
        if (!z9 && Log.isLoggable(t(), i10)) {
            Log.println(i10, t(), q(false, str, obj, obj2, obj3));
        }
        if (!z10 && i10 >= 5) {
            o.h(str);
            m4 m4Var = this.f9600a.f9995j;
            if (m4Var == null) {
                t10 = t();
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!m4Var.f9629b) {
                t10 = t();
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i10 >= 9) {
                    i10 = 8;
                }
                m4Var.o(new f3(this, i10, str, obj, obj2, obj3));
                return;
            }
            Log.println(6, t10, str2);
        }
    }
}
