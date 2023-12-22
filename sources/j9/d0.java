package j9;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import k9.e;
import t9.g;

public abstract class d0 implements Closeable {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public a f8863a;

    public static final class a extends Reader {

        /* renamed from: a  reason: collision with root package name */
        public final g f8864a;

        /* renamed from: b  reason: collision with root package name */
        public final Charset f8865b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f8866c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public InputStreamReader f8867d;

        public a(g gVar, Charset charset) {
            this.f8864a = gVar;
            this.f8865b = charset;
        }

        public final void close() {
            this.f8866c = true;
            InputStreamReader inputStreamReader = this.f8867d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f8864a.close();
            }
        }

        public final int read(char[] cArr, int i10, int i11) {
            if (!this.f8866c) {
                InputStreamReader inputStreamReader = this.f8867d;
                if (inputStreamReader == null) {
                    InputStreamReader inputStreamReader2 = new InputStreamReader(this.f8864a.K(), e.a(this.f8864a, this.f8865b));
                    this.f8867d = inputStreamReader2;
                    inputStreamReader = inputStreamReader2;
                }
                return inputStreamReader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long a();

    @Nullable
    public abstract s c();

    public void close() {
        e.c(j());
    }

    public abstract g j();

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|(3:4|5|(1:7))|9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o() {
        /*
            r3 = this;
            t9.g r0 = r3.j()
            j9.s r1 = r3.c()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0017
            java.lang.String r1 = r1.f8963c     // Catch:{ IllegalArgumentException -> 0x0017 }
            if (r1 == 0) goto L_0x0017
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch:{ IllegalArgumentException -> 0x0017 }
            goto L_0x0017
        L_0x0015:
            r1 = move-exception
            goto L_0x0023
        L_0x0017:
            java.nio.charset.Charset r1 = k9.e.a(r0, r2)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.J(r1)     // Catch:{ all -> 0x0015 }
            r0.close()
            return r1
        L_0x0023:
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x002f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.d0.o():java.lang.String");
    }
}
