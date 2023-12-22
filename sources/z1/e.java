package z1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import o1.g;
import o1.h;
import o1.j;
import q1.w;

public final class e implements j<Uri, Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Resources.Theme> f13144b = new g<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, g.f10514e);

    /* renamed from: a  reason: collision with root package name */
    public final Context f13145a;

    public e(Context context) {
        this.f13145a = context.getApplicationContext();
    }

    public final boolean a(Object obj, h hVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public final /* bridge */ /* synthetic */ w b(Object obj, int i10, int i11, h hVar) {
        return c((Uri) obj, hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q1.w c(android.net.Uri r9, o1.h r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            android.content.Context r1 = r8.f13145a
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            android.content.Context r1 = r8.f13145a     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.Context r1 = r1.createPackageContext(r0, r2)     // Catch:{ NameNotFoundException -> 0x0019 }
            goto L_0x0028
        L_0x0019:
            r1 = move-exception
            android.content.Context r3 = r8.f13145a
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x00e9
        L_0x0026:
            android.content.Context r1 = r8.f13145a
        L_0x0028:
            java.util.List r3 = r9.getPathSegments()
            int r4 = r3.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x0076
            java.util.List r3 = r9.getPathSegments()
            java.lang.String r4 = r9.getAuthority()
            java.lang.Object r5 = r3.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            android.content.res.Resources r7 = r1.getResources()
            int r4 = r7.getIdentifier(r3, r5, r4)
            if (r4 != 0) goto L_0x005c
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r7 = "android"
            int r4 = r4.getIdentifier(r3, r5, r7)
        L_0x005c:
            if (r4 == 0) goto L_0x005f
            goto L_0x008c
        L_0x005f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find resource id for: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L_0x0076:
            int r3 = r3.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r3 != r6) goto L_0x00d4
            java.util.List r3 = r9.getPathSegments()
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x00be }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x00be }
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00be }
        L_0x008c:
            o1.g<android.content.res.Resources$Theme> r9 = f13144b
            java.lang.Object r9 = r10.c(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            java.lang.String r10 = r1.getPackageName()
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00a0
            if (r9 != 0) goto L_0x00a1
        L_0x00a0:
            r2 = r6
        L_0x00a1:
            java.lang.String r10 = "Can't get a theme from another package"
            y3.a.g(r10, r2)
            r10 = 0
            if (r9 != 0) goto L_0x00b0
            android.content.Context r9 = r8.f13145a
            android.graphics.drawable.Drawable r9 = z1.b.a(r9, r1, r4, r10)
            goto L_0x00b6
        L_0x00b0:
            android.content.Context r0 = r8.f13145a
            android.graphics.drawable.Drawable r9 = z1.b.a(r0, r0, r4, r9)
        L_0x00b6:
            if (r9 == 0) goto L_0x00bd
            z1.d r10 = new z1.d
            r10.<init>(r9)
        L_0x00bd:
            return r10
        L_0x00be:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            throw r0
        L_0x00d4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L_0x00e9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.e.c(android.net.Uri, o1.h):q1.w");
    }
}
