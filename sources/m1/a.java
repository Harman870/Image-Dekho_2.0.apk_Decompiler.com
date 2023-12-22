package m1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import androidx.activity.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f9320a;

    /* renamed from: b  reason: collision with root package name */
    public final File f9321b;

    /* renamed from: c  reason: collision with root package name */
    public final File f9322c;

    /* renamed from: d  reason: collision with root package name */
    public final File f9323d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9324e;

    /* renamed from: f  reason: collision with root package name */
    public long f9325f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9326g;

    /* renamed from: h  reason: collision with root package name */
    public long f9327h = 0;

    /* renamed from: i  reason: collision with root package name */
    public BufferedWriter f9328i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap<String, d> f9329j = new LinkedHashMap<>(0, 0.75f, true);
    public int k;

    /* renamed from: l  reason: collision with root package name */
    public long f9330l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final ThreadPoolExecutor f9331m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: n  reason: collision with root package name */
    public final C0113a f9332n = new C0113a();

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    public class C0113a implements Callable<Void> {
        public C0113a() {
        }

        public final Object call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f9328i != null) {
                    aVar.O();
                    if (a.this.u()) {
                        a.this.M();
                        a.this.k = 0;
                    }
                }
            }
            return null;
        }
    }

    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f9334a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f9335b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9336c;

        public c(d dVar) {
            boolean[] zArr;
            this.f9334a = dVar;
            if (dVar.f9342e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f9326g];
            }
            this.f9335b = zArr;
        }

        public final void a() {
            a.a(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f9334a;
                if (dVar.f9343f == this) {
                    if (!dVar.f9342e) {
                        this.f9335b[0] = true;
                    }
                    file = dVar.f9341d[0];
                    a.this.f9320a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f9338a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f9339b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f9340c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f9341d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9342e;

        /* renamed from: f  reason: collision with root package name */
        public c f9343f;

        public d(String str) {
            this.f9338a = str;
            int i10 = a.this.f9326g;
            this.f9339b = new long[i10];
            this.f9340c = new File[i10];
            this.f9341d = new File[i10];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i11 = 0; i11 < a.this.f9326g; i11++) {
                sb.append(i11);
                this.f9340c[i11] = new File(a.this.f9320a, sb.toString());
                sb.append(".tmp");
                this.f9341d[i11] = new File(a.this.f9320a, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f9339b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f9345a;

        public e(File[] fileArr) {
            this.f9345a = fileArr;
        }
    }

    public a(File file, long j10) {
        File file2 = file;
        this.f9320a = file2;
        this.f9324e = 1;
        this.f9321b = new File(file2, "journal");
        this.f9322c = new File(file2, "journal.tmp");
        this.f9323d = new File(file2, "journal.bkp");
        this.f9326g = 1;
        this.f9325f = j10;
    }

    public static void N(File file, File file2, boolean z9) {
        if (z9) {
            j(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(a aVar, c cVar, boolean z9) {
        synchronized (aVar) {
            d dVar = cVar.f9334a;
            if (dVar.f9343f == cVar) {
                if (z9 && !dVar.f9342e) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= aVar.f9326g) {
                            break;
                        } else if (!cVar.f9335b[i10]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        } else if (!dVar.f9341d[i10].exists()) {
                            cVar.a();
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                for (int i11 = 0; i11 < aVar.f9326g; i11++) {
                    File file = dVar.f9341d[i11];
                    if (!z9) {
                        j(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f9340c[i11];
                        file.renameTo(file2);
                        long j10 = dVar.f9339b[i11];
                        long length = file2.length();
                        dVar.f9339b[i11] = length;
                        aVar.f9327h = (aVar.f9327h - j10) + length;
                    }
                }
                aVar.k++;
                dVar.f9343f = null;
                if (dVar.f9342e || z9) {
                    dVar.f9342e = true;
                    aVar.f9328i.append("CLEAN");
                    aVar.f9328i.append(' ');
                    aVar.f9328i.append(dVar.f9338a);
                    aVar.f9328i.append(dVar.a());
                    aVar.f9328i.append(10);
                    if (z9) {
                        aVar.f9330l++;
                        dVar.getClass();
                    }
                } else {
                    aVar.f9329j.remove(dVar.f9338a);
                    aVar.f9328i.append("REMOVE");
                    aVar.f9328i.append(' ');
                    aVar.f9328i.append(dVar.f9338a);
                    aVar.f9328i.append(10);
                }
                s(aVar.f9328i);
                if (aVar.f9327h > aVar.f9325f || aVar.u()) {
                    aVar.f9331m.submit(aVar.f9332n);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void j(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void s(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a v(File file, long j10) {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    N(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f9321b.exists()) {
                try {
                    aVar.E();
                    aVar.A();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f9320a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.M();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void A() {
        j(this.f9322c);
        Iterator<d> it = this.f9329j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f9343f == null) {
                while (i10 < this.f9326g) {
                    this.f9327h += next.f9339b[i10];
                    i10++;
                }
            } else {
                next.f9343f = null;
                while (i10 < this.f9326g) {
                    j(next.f9340c[i10]);
                    j(next.f9341d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.k = r2 - r9.f9329j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f9350e == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f9328i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f9321b, true), m1.c.f9352a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            m1.b r1 = new m1.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f9321b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = m1.c.f9352a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r1.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r1.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r1.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r1.a()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            int r7 = r9.f9324e     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            int r4 = r9.f9326g     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.a()     // Catch:{ EOFException -> 0x0060 }
            r9.L(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, m1.a$d> r3 = r9.f9329j     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r3
            r9.k = r2     // Catch:{ all -> 0x0091 }
            int r2 = r1.f9350e     // Catch:{ all -> 0x0091 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.M()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            java.io.File r5 = r9.f9321b     // Catch:{ all -> 0x0091 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = m1.c.f9352a     // Catch:{ all -> 0x0091 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            r9.f9328i = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00c1
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0091 }
            r7.append(r2)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r3)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r5)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00c1:
            r1.close()     // Catch:{ RuntimeException -> 0x00c5, Exception -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.E():void");
    }

    public final void L(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f9329j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.f9329j.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                this.f9329j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f9342e = true;
                dVar.f9343f = null;
                if (split.length == a.this.f9326g) {
                    int i11 = 0;
                    while (i11 < split.length) {
                        try {
                            dVar.f9339b[i11] = Long.parseLong(split[i11]);
                            i11++;
                        } catch (NumberFormatException unused) {
                            StringBuilder g10 = f.g("unexpected journal line: ");
                            g10.append(Arrays.toString(split));
                            throw new IOException(g10.toString());
                        }
                    }
                    return;
                }
                StringBuilder g11 = f.g("unexpected journal line: ");
                g11.append(Arrays.toString(split));
                throw new IOException(g11.toString());
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f9343f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(com.ironsource.adapters.ironsource.a.g("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(com.ironsource.adapters.ironsource.a.g("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void M() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f9328i;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9322c), c.f9352a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(IronSourceConstants.BOOLEAN_TRUE_AS_STRING);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f9324e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f9326g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.f9329j.values()) {
                if (next.f9343f != null) {
                    sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(next.f9338a);
                    sb.append(10);
                } else {
                    sb = new StringBuilder();
                    sb.append("CLEAN ");
                    sb.append(next.f9338a);
                    sb.append(next.a());
                    sb.append(10);
                }
                bufferedWriter2.write(sb.toString());
            }
            c(bufferedWriter2);
            if (this.f9321b.exists()) {
                N(this.f9321b, this.f9323d, true);
            }
            N(this.f9322c, this.f9321b, false);
            this.f9323d.delete();
            this.f9328i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9321b, true), c.f9352a));
        } catch (Throwable th) {
            c(bufferedWriter2);
            throw th;
        }
    }

    public final void O() {
        while (this.f9327h > this.f9325f) {
            String str = (String) this.f9329j.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f9328i != null) {
                    d dVar = this.f9329j.get(str);
                    if (dVar != null) {
                        if (dVar.f9343f == null) {
                            for (int i10 = 0; i10 < this.f9326g; i10++) {
                                File file = dVar.f9340c[i10];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j10 = this.f9327h;
                                long[] jArr = dVar.f9339b;
                                this.f9327h = j10 - jArr[i10];
                                jArr[i10] = 0;
                            }
                            this.k++;
                            this.f9328i.append("REMOVE");
                            this.f9328i.append(' ');
                            this.f9328i.append(str);
                            this.f9328i.append(10);
                            this.f9329j.remove(str);
                            if (u()) {
                                this.f9331m.submit(this.f9332n);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public final synchronized void close() {
        if (this.f9328i != null) {
            Iterator it = new ArrayList(this.f9329j.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f9343f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            O();
            c(this.f9328i);
            this.f9328i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0.f9343f != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m1.a.c o(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.io.BufferedWriter r0 = r3.f9328i     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x004b
            java.util.LinkedHashMap<java.lang.String, m1.a$d> r0 = r3.f9329j     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            m1.a$d r0 = (m1.a.d) r0     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 != 0) goto L_0x001b
            m1.a$d r0 = new m1.a$d     // Catch:{ all -> 0x0049 }
            r0.<init>(r4)     // Catch:{ all -> 0x0049 }
            java.util.LinkedHashMap<java.lang.String, m1.a$d> r1 = r3.f9329j     // Catch:{ all -> 0x0049 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0021
        L_0x001b:
            m1.a$c r2 = r0.f9343f     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x0021
        L_0x001f:
            monitor-exit(r3)
            goto L_0x0048
        L_0x0021:
            m1.a$c r1 = new m1.a$c     // Catch:{ all -> 0x0049 }
            r1.<init>(r0)     // Catch:{ all -> 0x0049 }
            r0.f9343f = r1     // Catch:{ all -> 0x0049 }
            java.io.BufferedWriter r0 = r3.f9328i     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "DIRTY"
            r0.append(r2)     // Catch:{ all -> 0x0049 }
            java.io.BufferedWriter r0 = r3.f9328i     // Catch:{ all -> 0x0049 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0049 }
            java.io.BufferedWriter r0 = r3.f9328i     // Catch:{ all -> 0x0049 }
            r0.append(r4)     // Catch:{ all -> 0x0049 }
            java.io.BufferedWriter r4 = r3.f9328i     // Catch:{ all -> 0x0049 }
            r0 = 10
            r4.append(r0)     // Catch:{ all -> 0x0049 }
            java.io.BufferedWriter r4 = r3.f9328i     // Catch:{ all -> 0x0049 }
            s(r4)     // Catch:{ all -> 0x0049 }
            goto L_0x001f
        L_0x0048:
            return r1
        L_0x0049:
            r4 = move-exception
            goto L_0x0053
        L_0x004b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "cache is closed"
            r4.<init>(r0)     // Catch:{ all -> 0x0049 }
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0053:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.o(java.lang.String):m1.a$c");
    }

    public final synchronized e t(String str) {
        if (this.f9328i != null) {
            d dVar = this.f9329j.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f9342e) {
                return null;
            }
            for (File exists : dVar.f9340c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.k++;
            this.f9328i.append("READ");
            this.f9328i.append(' ');
            this.f9328i.append(str);
            this.f9328i.append(10);
            if (u()) {
                this.f9331m.submit(this.f9332n);
            }
            return new e(dVar.f9340c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean u() {
        int i10 = this.k;
        return i10 >= 2000 && i10 >= this.f9329j.size();
    }
}
