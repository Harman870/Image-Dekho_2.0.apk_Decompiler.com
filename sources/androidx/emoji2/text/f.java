package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1342i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile f f1343j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1344a;

    /* renamed from: b  reason: collision with root package name */
    public final m.d f1345b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1346c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1347d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1348e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1349f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1350g;

    /* renamed from: h  reason: collision with root package name */
    public final d f1351h;

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile j f1352b;

        /* renamed from: c  reason: collision with root package name */
        public volatile n f1353c;

        public a(f fVar) {
            super(fVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f1354a;

        public b(f fVar) {
            this.f1354a = fVar;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1355a;

        /* renamed from: b  reason: collision with root package name */
        public int f1356b = 0;

        /* renamed from: c  reason: collision with root package name */
        public d f1357c = new d();

        public c(g gVar) {
            this.f1355a = gVar;
        }
    }

    public interface d {
    }

    public static abstract class e {
        public void a() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    public static class C0011f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f1358a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1359b;

        public C0011f(List list, int i10, Throwable th) {
            if (list != null) {
                this.f1358a = new ArrayList(list);
                this.f1359b = i10;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        public final void run() {
            int size = this.f1358a.size();
            int i10 = 0;
            if (this.f1359b != 1) {
                while (i10 < size) {
                    ((e) this.f1358a.get(i10)).getClass();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) this.f1358a.get(i10)).a();
                i10++;
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1344a = reentrantReadWriteLock;
        g gVar = aVar.f1355a;
        this.f1349f = gVar;
        int i10 = aVar.f1356b;
        this.f1350g = i10;
        this.f1351h = aVar.f1357c;
        this.f1347d = new Handler(Looper.getMainLooper());
        this.f1345b = new m.d();
        a aVar2 = new a(this);
        this.f1348e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1346c = 0;
            } catch (Throwable th) {
                this.f1344a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new e(aVar2));
            } catch (Throwable th2) {
                aVar2.f1354a.d(th2);
            }
        }
    }

    public static f a() {
        f fVar;
        boolean z9;
        synchronized (f1342i) {
            fVar = f1343j;
            if (fVar != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f1344a.readLock().lock();
        try {
            return this.f1346c;
        } finally {
            this.f1344a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z9;
        boolean z10 = true;
        if (this.f1350g == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (b() != 1) {
                z10 = false;
            }
            if (!z10) {
                this.f1344a.writeLock().lock();
                try {
                    if (this.f1346c != 0) {
                        this.f1346c = 0;
                        this.f1344a.writeLock().unlock();
                        a aVar = this.f1348e;
                        aVar.getClass();
                        try {
                            aVar.f1354a.f1349f.a(new e(aVar));
                        } catch (Throwable th) {
                            aVar.f1354a.d(th);
                        }
                    }
                } finally {
                    this.f1344a.writeLock().unlock();
                }
            }
        } else {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
    }

    /* JADX INFO: finally extract failed */
    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1344a.writeLock().lock();
        try {
            this.f1346c = 2;
            arrayList.addAll(this.f1345b);
            this.f1345b.clear();
            this.f1344a.writeLock().unlock();
            this.f1347d.post(new C0011f(arrayList, this.f1346c, th));
        } catch (Throwable th2) {
            this.f1344a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1344a.writeLock().lock();
        try {
            this.f1346c = 1;
            arrayList.addAll(this.f1345b);
            this.f1345b.clear();
            this.f1344a.writeLock().unlock();
            this.f1347d.post(new C0011f(arrayList, this.f1346c, (Throwable) null));
        } catch (Throwable th) {
            this.f1344a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0179, code lost:
        ((androidx.emoji2.text.o) r2).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ea, code lost:
        if (r7.b(r2, r11, r0, r10.f1376d.f1397b) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ec, code lost:
        if (r3 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ee, code lost:
        r3 = new androidx.emoji2.text.q((android.text.Spannable) new android.text.SpannableString(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f8, code lost:
        r4 = r10.f1376d.f1397b;
        r7.f1370a.getClass();
        r3.setSpan(new androidx.emoji2.text.p(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0174, code lost:
        if (r8 != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0177, code lost:
        if (r8 == false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[Catch:{ all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b4 A[Catch:{ all -> 0x0181 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence f(int r17, int r18, java.lang.CharSequence r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r16.b()
            r5 = 1
            if (r3 != r5) goto L_0x000f
            r3 = r5
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            if (r3 == 0) goto L_0x01a2
            if (r0 < 0) goto L_0x0198
            if (r1 < 0) goto L_0x018e
            if (r0 > r1) goto L_0x001a
            r3 = r5
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            java.lang.String r6 = "start should be <= than end"
            c6.b.l(r6, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r19.length()
            if (r0 > r6) goto L_0x002c
            r6 = r5
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            java.lang.String r7 = "start should be < than charSequence length"
            c6.b.l(r7, r6)
            int r6 = r19.length()
            if (r1 > r6) goto L_0x003a
            r6 = r5
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            java.lang.String r7 = "end should be < than charSequence length"
            c6.b.l(r7, r6)
            int r6 = r19.length()
            if (r6 == 0) goto L_0x018b
            if (r0 != r1) goto L_0x004a
            goto L_0x018b
        L_0x004a:
            r6 = r16
            androidx.emoji2.text.f$a r7 = r6.f1348e
            androidx.emoji2.text.j r7 = r7.f1352b
            r7.getClass()
            boolean r8 = r2 instanceof androidx.emoji2.text.o
            if (r8 == 0) goto L_0x005d
            r9 = r2
            androidx.emoji2.text.o r9 = (androidx.emoji2.text.o) r9
            r9.a()
        L_0x005d:
            if (r8 != 0) goto L_0x007d
            boolean r9 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x0064
            goto L_0x007d
        L_0x0064:
            boolean r9 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x0085
            r9 = r2
            android.text.Spanned r9 = (android.text.Spanned) r9     // Catch:{ all -> 0x0181 }
            int r10 = r0 + -1
            int r11 = r1 + 1
            java.lang.Class<androidx.emoji2.text.k> r12 = androidx.emoji2.text.k.class
            int r9 = r9.nextSpanTransition(r10, r11, r12)     // Catch:{ all -> 0x0181 }
            if (r9 > r1) goto L_0x0085
            androidx.emoji2.text.q r3 = new androidx.emoji2.text.q     // Catch:{ all -> 0x0181 }
            r3.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0181 }
            goto L_0x0085
        L_0x007d:
            androidx.emoji2.text.q r3 = new androidx.emoji2.text.q     // Catch:{ all -> 0x0181 }
            r9 = r2
            android.text.Spannable r9 = (android.text.Spannable) r9     // Catch:{ all -> 0x0181 }
            r3.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0181 }
        L_0x0085:
            if (r3 == 0) goto L_0x00b2
            java.lang.Class<androidx.emoji2.text.k> r9 = androidx.emoji2.text.k.class
            java.lang.Object[] r9 = r3.getSpans(r0, r1, r9)     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.k[] r9 = (androidx.emoji2.text.k[]) r9     // Catch:{ all -> 0x0181 }
            if (r9 == 0) goto L_0x00b2
            int r10 = r9.length     // Catch:{ all -> 0x0181 }
            if (r10 <= 0) goto L_0x00b2
            int r10 = r9.length     // Catch:{ all -> 0x0181 }
            r11 = 0
        L_0x0096:
            if (r11 >= r10) goto L_0x00b2
            r12 = r9[r11]     // Catch:{ all -> 0x0181 }
            int r13 = r3.getSpanStart(r12)     // Catch:{ all -> 0x0181 }
            int r14 = r3.getSpanEnd(r12)     // Catch:{ all -> 0x0181 }
            if (r13 == r1) goto L_0x00a7
            r3.removeSpan(r12)     // Catch:{ all -> 0x0181 }
        L_0x00a7:
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0181 }
            int r1 = java.lang.Math.max(r14, r1)     // Catch:{ all -> 0x0181 }
            int r11 = r11 + 1
            goto L_0x0096
        L_0x00b2:
            if (r0 == r1) goto L_0x0177
            int r9 = r19.length()     // Catch:{ all -> 0x0181 }
            if (r0 < r9) goto L_0x00bc
            goto L_0x0177
        L_0x00bc:
            r9 = 2147483647(0x7fffffff, float:NaN)
            androidx.emoji2.text.j$a r10 = new androidx.emoji2.text.j$a     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.n r11 = r7.f1371b     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.n$a r11 = r11.f1394c     // Catch:{ all -> 0x0181 }
            r10.<init>(r11)     // Catch:{ all -> 0x0181 }
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0181 }
            r12 = 0
        L_0x00cd:
            r13 = r11
        L_0x00ce:
            r11 = r0
        L_0x00cf:
            r14 = 2
            r15 = 33
            if (r0 >= r1) goto L_0x0129
            if (r12 >= r9) goto L_0x0129
            int r4 = r10.a(r13)     // Catch:{ all -> 0x0181 }
            if (r4 == r5) goto L_0x0119
            if (r4 == r14) goto L_0x010d
            r14 = 3
            if (r4 == r14) goto L_0x00e2
            goto L_0x00cf
        L_0x00e2:
            androidx.emoji2.text.n$a r4 = r10.f1376d     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.i r4 = r4.f1397b     // Catch:{ all -> 0x0181 }
            boolean r4 = r7.b(r2, r11, r0, r4)     // Catch:{ all -> 0x0181 }
            if (r4 != 0) goto L_0x010b
            if (r3 != 0) goto L_0x00f8
            androidx.emoji2.text.q r3 = new androidx.emoji2.text.q     // Catch:{ all -> 0x0181 }
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch:{ all -> 0x0181 }
            r4.<init>(r2)     // Catch:{ all -> 0x0181 }
            r3.<init>((android.text.Spannable) r4)     // Catch:{ all -> 0x0181 }
        L_0x00f8:
            androidx.emoji2.text.n$a r4 = r10.f1376d     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.i r4 = r4.f1397b     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.f$i r14 = r7.f1370a     // Catch:{ all -> 0x0181 }
            r14.getClass()     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.p r14 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0181 }
            r14.<init>(r4)     // Catch:{ all -> 0x0181 }
            r3.setSpan(r14, r11, r0, r15)     // Catch:{ all -> 0x0181 }
            int r12 = r12 + 1
        L_0x010b:
            r11 = r13
            goto L_0x00cd
        L_0x010d:
            int r4 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0181 }
            int r0 = r0 + r4
            if (r0 >= r1) goto L_0x00cf
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0181 }
            goto L_0x00cf
        L_0x0119:
            int r0 = java.lang.Character.codePointAt(r2, r11)     // Catch:{ all -> 0x0181 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0181 }
            int r0 = r0 + r11
            if (r0 >= r1) goto L_0x00ce
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0181 }
            goto L_0x00ce
        L_0x0129:
            int r1 = r10.f1373a     // Catch:{ all -> 0x0181 }
            if (r1 != r14) goto L_0x013f
            androidx.emoji2.text.n$a r1 = r10.f1375c     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.i r1 = r1.f1397b     // Catch:{ all -> 0x0181 }
            if (r1 == 0) goto L_0x013f
            int r1 = r10.f1378f     // Catch:{ all -> 0x0181 }
            if (r1 > r5) goto L_0x013d
            boolean r1 = r10.c()     // Catch:{ all -> 0x0181 }
            if (r1 == 0) goto L_0x013f
        L_0x013d:
            r4 = r5
            goto L_0x0140
        L_0x013f:
            r4 = 0
        L_0x0140:
            if (r4 == 0) goto L_0x0167
            if (r12 >= r9) goto L_0x0167
            androidx.emoji2.text.n$a r1 = r10.f1375c     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.i r1 = r1.f1397b     // Catch:{ all -> 0x0181 }
            boolean r1 = r7.b(r2, r11, r0, r1)     // Catch:{ all -> 0x0181 }
            if (r1 != 0) goto L_0x0167
            if (r3 != 0) goto L_0x0156
            androidx.emoji2.text.q r1 = new androidx.emoji2.text.q     // Catch:{ all -> 0x0181 }
            r1.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0181 }
            r3 = r1
        L_0x0156:
            androidx.emoji2.text.n$a r1 = r10.f1375c     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.i r1 = r1.f1397b     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.f$i r4 = r7.f1370a     // Catch:{ all -> 0x0181 }
            r4.getClass()     // Catch:{ all -> 0x0181 }
            androidx.emoji2.text.p r4 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0181 }
            r4.<init>(r1)     // Catch:{ all -> 0x0181 }
            r3.setSpan(r4, r11, r0, r15)     // Catch:{ all -> 0x0181 }
        L_0x0167:
            if (r3 == 0) goto L_0x0174
            android.text.Spannable r0 = r3.f1403b     // Catch:{ all -> 0x0181 }
            if (r8 == 0) goto L_0x0180
            r1 = r2
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.o) r1
            r1.b()
            goto L_0x0180
        L_0x0174:
            if (r8 == 0) goto L_0x017f
            goto L_0x0179
        L_0x0177:
            if (r8 == 0) goto L_0x017f
        L_0x0179:
            r0 = r2
            androidx.emoji2.text.o r0 = (androidx.emoji2.text.o) r0
            r0.b()
        L_0x017f:
            r0 = r2
        L_0x0180:
            return r0
        L_0x0181:
            r0 = move-exception
            if (r8 == 0) goto L_0x018a
            r1 = r2
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.o) r1
            r1.b()
        L_0x018a:
            throw r0
        L_0x018b:
            r6 = r16
            return r2
        L_0x018e:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "end cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "start cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x01a2:
            r6 = r16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized yet"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f1344a.writeLock().lock();
            try {
                if (this.f1346c != 1) {
                    if (this.f1346c != 2) {
                        this.f1345b.add(eVar);
                    }
                }
                this.f1347d.post(new C0011f(Arrays.asList(new e[]{eVar}), this.f1346c, (Throwable) null));
            } finally {
                this.f1344a.writeLock().unlock();
            }
        } else {
            throw new NullPointerException("initCallback cannot be null");
        }
    }
}
