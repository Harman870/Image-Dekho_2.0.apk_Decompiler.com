package z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13098a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f13099b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13100c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        public static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f13101a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f13102b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13103c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f13101a = colorStateList;
            this.f13102b = configuration;
            this.f13103c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13104a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f13105b;

        public d(Resources resources, Resources.Theme theme) {
            this.f13104a = resources;
            this.f13105b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f13104a.equals(dVar.f13104a) && g0.b.a(this.f13105b, dVar.f13105b);
        }

        public final int hashCode() {
            return g0.b.b(this.f13104a, this.f13105b);
        }
    }

    public static abstract class e {
        public final void a(int i10) {
            new Handler(Looper.getMainLooper()).post(new h(this, i10));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new g(this, 0, typeface));
        }

        public abstract void c(int i10);

        public abstract void d(Typeface typeface);
    }

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, (e) null, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r11 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        if (r11 != null) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, z.f.e r20, boolean r21, boolean r22) {
        /*
            r10 = r17
            r0 = r18
            r7 = r19
            r11 = r20
            android.content.res.Resources r8 = r16.getResources()
            r1 = 1
            r8.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00e4
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = -3
            r15 = 0
            if (r1 != 0) goto L_0x0028
            if (r11 == 0) goto L_0x00c0
            goto L_0x00bd
        L_0x0028:
            int r1 = r0.assetCookie
            m.f<java.lang.String, android.graphics.Typeface> r9 = a0.e.f12b
            java.lang.String r1 = a0.e.b(r8, r10, r13, r1, r7)
            java.lang.Object r1 = r9.b(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0040
            if (r11 == 0) goto L_0x003d
            r11.b(r1)
        L_0x003d:
            r15 = r1
            goto L_0x00c0
        L_0x0040:
            if (r22 == 0) goto L_0x0044
            goto L_0x00c0
        L_0x0044:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0078
            android.content.res.XmlResourceParser r1 = r8.getXml(r10)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            z.d$b r2 = z.d.a(r1, r8)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            if (r2 != 0) goto L_0x0065
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            if (r11 == 0) goto L_0x00c0
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            goto L_0x00c0
        L_0x0065:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            r1 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r7 = r19
            r8 = r20
            r9 = r21
            android.graphics.Typeface r15 = a0.e.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            goto L_0x00c0
        L_0x0078:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            a0.l r1 = a0.e.f11a     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r6 = r19
            android.graphics.Typeface r1 = r1.d(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0091
            java.lang.String r0 = a0.e.b(r8, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            r9.c(r0, r1)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
        L_0x0091:
            if (r11 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x0099
            r11.b(r1)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            goto L_0x003d
        L_0x0099:
            r11.a(r14)     // Catch:{ XmlPullParserException -> 0x00a6, IOException -> 0x009d }
            goto L_0x003d
        L_0x009d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x00ae
        L_0x00a6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x00ae:
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            if (r11 == 0) goto L_0x00c0
        L_0x00bd:
            r11.a(r14)
        L_0x00c0:
            if (r15 != 0) goto L_0x00e3
            if (r11 != 0) goto L_0x00e3
            if (r22 == 0) goto L_0x00c7
            goto L_0x00e3
        L_0x00c7:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = androidx.activity.f.g(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00e3:
            return r15
        L_0x00e4:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = androidx.activity.f.g(r2)
            java.lang.String r3 = r8.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.b(android.content.Context, int, android.util.TypedValue, int, z.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
