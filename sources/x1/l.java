package x1;

import o1.g;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12866a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final c f12867b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final d f12868c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f12869d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final d f12870e;

    /* renamed from: f  reason: collision with root package name */
    public static final g<l> f12871f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f12872g = true;

    public static class a extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    public static class b extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            return 1;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    public static class c extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return 2;
            }
            return l.f12866a.a(i10, i11, i12, i13);
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, l.f12866a.b(i10, i11, i12, i13));
        }
    }

    public static class d extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    public static class e extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            return l.f12872g ? 2 : 1;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            if (l.f12872g) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class f extends l {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        d dVar = new d();
        f12868c = dVar;
        f12870e = dVar;
        f12871f = g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public abstract int a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
