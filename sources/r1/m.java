package r1;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.activity.f;
import j2.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class m implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f11485d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f11486e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f11487f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f11488g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f11489h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f11490a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final g<b, Bitmap> f11491b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f11492c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11493a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11493a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11493a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11493a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11493a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.m.a.<clinit>():void");
        }
    }

    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public final c f11494a;

        /* renamed from: b  reason: collision with root package name */
        public int f11495b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f11496c;

        public b(c cVar) {
            this.f11494a = cVar;
        }

        public final void a() {
            this.f11494a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11495b == bVar.f11495b && l.b(this.f11496c, bVar.f11496c);
        }

        public final int hashCode() {
            int i10 = this.f11495b * 31;
            Bitmap.Config config = this.f11496c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return m.c(this.f11495b, this.f11496c);
        }
    }

    public static class c extends c<b> {
        public final l a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f11485d = configArr;
        f11486e = configArr;
    }

    public static String c(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d10.remove(num);
        } else {
            d10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int d10 = l.d(config) * i10 * i11;
        b bVar = (b) this.f11490a.b();
        bVar.f11495b = d10;
        bVar.f11496c = config;
        int i12 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i13 = a.f11493a[config.ordinal()];
            if (i13 == 1) {
                configArr = f11485d;
            } else if (i13 == 2) {
                configArr = f11487f;
            } else if (i13 != 3) {
                configArr = i13 != 4 ? new Bitmap.Config[]{config} : f11489h;
            } else {
                configArr = f11488g;
            }
        } else {
            configArr = f11486e;
        }
        int length = configArr.length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i12];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(d10));
            if (ceilingKey == null || ceilingKey.intValue() > d10 * 8) {
                i12++;
            } else if (ceilingKey.intValue() != d10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f11490a.c(bVar);
                c cVar = this.f11490a;
                int intValue = ceilingKey.intValue();
                bVar = (b) cVar.b();
                bVar.f11495b = intValue;
                bVar.f11496c = config2;
            }
        }
        Bitmap a10 = this.f11491b.a(bVar);
        if (a10 != null) {
            a(Integer.valueOf(bVar.f11495b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f11492c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f11492c.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c10 = l.c(bitmap);
        c cVar = this.f11490a;
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) cVar.b();
        bVar.f11495b = c10;
        bVar.f11496c = config;
        this.f11491b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(bVar.f11495b));
        Integer valueOf = Integer.valueOf(bVar.f11495b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i10));
    }

    public final String toString() {
        StringBuilder g10 = f.g("SizeConfigStrategy{groupedMap=");
        g10.append(this.f11491b);
        g10.append(", sortedSizes=(");
        for (Map.Entry entry : this.f11492c.entrySet()) {
            g10.append(entry.getKey());
            g10.append('[');
            g10.append(entry.getValue());
            g10.append("], ");
        }
        if (!this.f11492c.isEmpty()) {
            g10.replace(g10.length() - 2, g10.length(), "");
        }
        g10.append(")}");
        return g10.toString();
    }
}
