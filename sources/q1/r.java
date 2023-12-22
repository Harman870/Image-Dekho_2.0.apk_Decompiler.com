package q1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o1.f;

public final class r extends Exception {

    /* renamed from: f  reason: collision with root package name */
    public static final StackTraceElement[] f11130f = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f11131a;

    /* renamed from: b  reason: collision with root package name */
    public f f11132b;

    /* renamed from: c  reason: collision with root package name */
    public o1.a f11133c;

    /* renamed from: d  reason: collision with root package name */
    public Class<?> f11134d;

    /* renamed from: e  reason: collision with root package name */
    public String f11135e;

    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f11136a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f11137b = true;

        public a(Appendable appendable) {
            this.f11136a = appendable;
        }

        public final Appendable append(char c10) {
            boolean z9 = false;
            if (this.f11137b) {
                this.f11137b = false;
                this.f11136a.append("  ");
            }
            if (c10 == 10) {
                z9 = true;
            }
            this.f11137b = z9;
            this.f11136a.append(c10);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z9 = false;
            if (this.f11137b) {
                this.f11137b = false;
                this.f11136a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == 10) {
                z9 = true;
            }
            this.f11137b = z9;
            this.f11136a.append(charSequence, i10, i11);
            return this;
        }
    }

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public r(String str, List<Throwable> list) {
        this.f11135e = str;
        setStackTrace(f11130f);
        this.f11131a = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof r) {
            for (Throwable a10 : ((r) th).f11131a) {
                a(a10, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append((CharSequence) "Cause (");
            int i11 = i10 + 1;
            aVar.append((CharSequence) String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof r) {
                ((r) th).f(aVar);
            } else {
                d(th, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder g10 = androidx.activity.f.g("Root cause (");
            int i11 = i10 + 1;
            g10.append(i11);
            g10.append(" of ");
            g10.append(size);
            g10.append(")");
            Log.i("Glide", g10.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f11131a, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f11135e);
        String str4 = "";
        if (this.f11134d != null) {
            StringBuilder g10 = androidx.activity.f.g(", ");
            g10.append(this.f11134d);
            str = g10.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f11133c != null) {
            StringBuilder g11 = androidx.activity.f.g(", ");
            g11.append(this.f11133c);
            str2 = g11.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f11132b != null) {
            StringBuilder g12 = androidx.activity.f.g(", ");
            g12.append(this.f11132b);
            str4 = g12.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
