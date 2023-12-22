package v1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.j;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o1.h;
import u1.n;
import u1.o;
import u1.r;

public final class d<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12405a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f12406b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f12407c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f12408d;

    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f12409a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f12410b;

        public a(Context context, Class<DataT> cls) {
            this.f12409a = context;
            this.f12410b = cls;
        }

        public final n<Uri, DataT> b(r rVar) {
            return new d(this.f12409a, rVar.b(File.class, this.f12410b), rVar.b(Uri.class, this.f12410b), this.f12410b);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: v1.d$d  reason: collision with other inner class name */
    public static final class C0162d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f12411a;

        /* renamed from: b  reason: collision with root package name */
        public final n<File, DataT> f12412b;

        /* renamed from: c  reason: collision with root package name */
        public final n<Uri, DataT> f12413c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f12414d;

        /* renamed from: e  reason: collision with root package name */
        public final int f12415e;

        /* renamed from: f  reason: collision with root package name */
        public final int f12416f;

        /* renamed from: g  reason: collision with root package name */
        public final h f12417g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<DataT> f12418h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f12419i;

        /* renamed from: j  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f12420j;

        public C0162d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, h hVar, Class<DataT> cls) {
            this.f12411a = context.getApplicationContext();
            this.f12412b = nVar;
            this.f12413c = nVar2;
            this.f12414d = uri;
            this.f12415e = i10;
            this.f12416f = i11;
            this.f12417g = hVar;
            this.f12418h = cls;
        }

        public final Class<DataT> a() {
            return this.f12418h;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f12420j;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                u1.n<java.io.File, DataT> r0 = r9.f12412b
                android.net.Uri r8 = r9.f12414d
                android.content.Context r2 = r9.f12411a     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = k     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f12415e
                int r3 = r9.f12416f
                o1.h r5 = r9.f12417g
                u1.n$a r0 = r0.a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f12411a
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f12414d
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f12414d
            L_0x0096:
                u1.n<android.net.Uri, DataT> r2 = r9.f12413c
                int r3 = r9.f12415e
                int r4 = r9.f12416f
                o1.h r5 = r9.f12417g
                u1.n$a r0 = r2.a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                com.bumptech.glide.load.data.d<Data> r1 = r0.f12137c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.d.C0162d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f12419i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f12420j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final o1.a e() {
            return o1.a.LOCAL;
        }

        public final void f(j jVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f12414d));
                    return;
                }
                this.f12420j = c10;
                if (this.f12419i) {
                    cancel();
                } else {
                    c10.f(jVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f12405a = context.getApplicationContext();
        this.f12406b = nVar;
        this.f12407c = nVar2;
        this.f12408d = cls;
    }

    public final n.a a(Object obj, int i10, int i11, h hVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i2.b(uri), new C0162d(this.f12405a, this.f12406b, this.f12407c, uri, i10, i11, hVar, this.f12408d));
    }

    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && y3.a.m((Uri) obj);
    }
}
