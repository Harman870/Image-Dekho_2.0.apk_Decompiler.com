package d9;

import a9.c;
import c9.b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o8.e;
import w8.p;
import x8.f;

public final class a implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f6108a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6109b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6110c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, e<Integer, Integer>> f6111d;

    /* renamed from: d9.a$a  reason: collision with other inner class name */
    public static final class C0077a implements Iterator<c> {

        /* renamed from: a  reason: collision with root package name */
        public int f6112a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f6113b;

        /* renamed from: c  reason: collision with root package name */
        public int f6114c;

        /* renamed from: d  reason: collision with root package name */
        public c f6115d;

        /* renamed from: e  reason: collision with root package name */
        public int f6116e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f6117f;

        public C0077a(a aVar) {
            this.f6117f = aVar;
            int i10 = aVar.f6109b;
            int length = aVar.f6108a.length();
            if (length >= 0) {
                if (i10 < 0) {
                    i10 = 0;
                } else if (i10 > length) {
                    i10 = length;
                }
                this.f6113b = i10;
                this.f6114c = i10;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum " + 0 + '.');
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r6 < r3) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f6114c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f6112a = r1
                r0 = 0
                r7.f6115d = r0
                goto L_0x0089
            L_0x000c:
                d9.a r2 = r7.f6117f
                int r3 = r2.f6110c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L_0x001b
                int r6 = r7.f6116e
                int r6 = r6 + r5
                r7.f6116e = r6
                if (r6 >= r3) goto L_0x0023
            L_0x001b:
                java.lang.CharSequence r2 = r2.f6108a
                int r2 = r2.length()
                if (r0 <= r2) goto L_0x0037
            L_0x0023:
                a9.c r0 = new a9.c
                int r1 = r7.f6113b
                d9.a r2 = r7.f6117f
                java.lang.CharSequence r2 = r2.f6108a
                int r2 = d9.g.w(r2)
                r0.<init>(r1, r2)
            L_0x0032:
                r7.f6115d = r0
                r7.f6114c = r4
                goto L_0x0087
            L_0x0037:
                d9.a r0 = r7.f6117f
                w8.p<java.lang.CharSequence, java.lang.Integer, o8.e<java.lang.Integer, java.lang.Integer>> r2 = r0.f6111d
                java.lang.CharSequence r0 = r0.f6108a
                int r3 = r7.f6114c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.a(r0, r3)
                o8.e r0 = (o8.e) r0
                if (r0 != 0) goto L_0x005b
                a9.c r0 = new a9.c
                int r1 = r7.f6113b
                d9.a r2 = r7.f6117f
                java.lang.CharSequence r2 = r2.f6108a
                int r2 = d9.g.w(r2)
                r0.<init>(r1, r2)
                goto L_0x0032
            L_0x005b:
                A r2 = r0.f10603a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f10604b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f6113b
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r4) goto L_0x0074
                a9.c r3 = a9.c.f227d
                goto L_0x007c
            L_0x0074:
                a9.c r4 = new a9.c
                int r6 = r2 + -1
                r4.<init>(r3, r6)
                r3 = r4
            L_0x007c:
                r7.f6115d = r3
                int r2 = r2 + r0
                r7.f6113b = r2
                if (r0 != 0) goto L_0x0084
                r1 = r5
            L_0x0084:
                int r2 = r2 + r1
                r7.f6114c = r2
            L_0x0087:
                r7.f6112a = r5
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d9.a.C0077a.a():void");
        }

        public final boolean hasNext() {
            if (this.f6112a == -1) {
                a();
            }
            return this.f6112a == 1;
        }

        public final Object next() {
            if (this.f6112a == -1) {
                a();
            }
            if (this.f6112a != 0) {
                c cVar = this.f6115d;
                f.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f6115d = null;
                this.f6112a = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(String str, int i10, int i11, f fVar) {
        this.f6108a = str;
        this.f6109b = i10;
        this.f6110c = i11;
        this.f6111d = fVar;
    }

    public final Iterator<c> iterator() {
        return new C0077a(this);
    }
}
