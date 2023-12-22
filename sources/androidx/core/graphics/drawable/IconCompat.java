package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1259a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1260b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1261c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1262d;

    /* renamed from: e  reason: collision with root package name */
    public int f1263e;

    /* renamed from: f  reason: collision with root package name */
    public int f1264f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1265g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1266h;

    /* renamed from: i  reason: collision with root package name */
    public String f1267i;

    /* renamed from: j  reason: collision with root package name */
    public String f1268j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e12) {
                e = e12;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
            if (r0 >= 26) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
            r6 = androidx.core.graphics.drawable.IconCompat.b.b(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
            r6 = androidx.core.graphics.drawable.IconCompat.a(r6, false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
            r6 = android.graphics.drawable.Icon.createWithBitmap(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0127, code lost:
            r0 = r5.f1265g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
            if (r0 == null) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x012b, code lost:
            r6.setTintList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x012e, code lost:
            r5 = r5.f1266h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0132, code lost:
            if (r5 == androidx.core.graphics.drawable.IconCompat.k) goto L_0x0137;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0134, code lost:
            r6.setTintMode(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0137, code lost:
            return r6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r5, android.content.Context r6) {
            /*
                int r0 = r5.f1259a
                r1 = 26
                r2 = 0
                switch(r0) {
                    case -1: goto L_0x0138;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x011f;
                    case 2: goto L_0x00da;
                    case 3: goto L_0x00cd;
                    case 4: goto L_0x00c4;
                    case 5: goto L_0x00ad;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "Unknown type"
                r5.<init>(r6)
                throw r5
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r6 = r5.d()
                android.graphics.drawable.Icon r6 = androidx.core.graphics.drawable.IconCompat.d.a(r6)
                goto L_0x0127
            L_0x0020:
                if (r6 == 0) goto L_0x0096
                android.net.Uri r0 = r5.d()
                java.lang.String r3 = r0.getScheme()
                java.lang.String r4 = "content"
                boolean r4 = r4.equals(r3)
                if (r4 != 0) goto L_0x0053
                java.lang.String r4 = "file"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L_0x003b
                goto L_0x0053
            L_0x003b:
                java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004a }
                java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004a }
                java.lang.Object r4 = r5.f1260b     // Catch:{ FileNotFoundException -> 0x004a }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x004a }
                r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004a }
                r6.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004a }
                goto L_0x0074
            L_0x004a:
                r6 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to load image from path: "
                goto L_0x0064
            L_0x0053:
                android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x005c }
                java.io.InputStream r6 = r6.openInputStream(r0)     // Catch:{ Exception -> 0x005c }
                goto L_0x0074
            L_0x005c:
                r6 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to load image from URI: "
            L_0x0064:
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "IconCompat"
                android.util.Log.w(r3, r0, r6)
                r6 = 0
            L_0x0074:
                if (r6 == 0) goto L_0x007f
                int r0 = android.os.Build.VERSION.SDK_INT
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r6)
                if (r0 < r1) goto L_0x00bf
                goto L_0x00b5
            L_0x007f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot load adaptive icon from uri: "
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                android.net.Uri r5 = r5.d()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L_0x0096:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
                java.lang.StringBuilder r0 = androidx.activity.f.g(r0)
                android.net.Uri r5 = r5.d()
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L_0x00ad:
                int r6 = android.os.Build.VERSION.SDK_INT
                if (r6 < r1) goto L_0x00bb
                java.lang.Object r6 = r5.f1260b
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            L_0x00b5:
                android.graphics.drawable.Icon r6 = androidx.core.graphics.drawable.IconCompat.b.b(r6)
                goto L_0x0127
            L_0x00bb:
                java.lang.Object r6 = r5.f1260b
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            L_0x00bf:
                android.graphics.Bitmap r6 = androidx.core.graphics.drawable.IconCompat.a(r6, r2)
                goto L_0x0123
            L_0x00c4:
                java.lang.Object r6 = r5.f1260b
                java.lang.String r6 = (java.lang.String) r6
                android.graphics.drawable.Icon r6 = android.graphics.drawable.Icon.createWithContentUri(r6)
                goto L_0x0127
            L_0x00cd:
                java.lang.Object r6 = r5.f1260b
                byte[] r6 = (byte[]) r6
                int r0 = r5.f1263e
                int r1 = r5.f1264f
                android.graphics.drawable.Icon r6 = android.graphics.drawable.Icon.createWithData(r6, r0, r1)
                goto L_0x0127
            L_0x00da:
                r6 = -1
                if (r0 != r6) goto L_0x00e4
                java.lang.Object r6 = r5.f1260b
                java.lang.String r6 = b(r6)
                goto L_0x0101
            L_0x00e4:
                r1 = 2
                if (r0 != r1) goto L_0x0108
                java.lang.String r0 = r5.f1268j
                if (r0 == 0) goto L_0x00f5
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00f2
                goto L_0x00f5
            L_0x00f2:
                java.lang.String r6 = r5.f1268j
                goto L_0x0101
            L_0x00f5:
                java.lang.Object r0 = r5.f1260b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = ":"
                java.lang.String[] r6 = r0.split(r1, r6)
                r6 = r6[r2]
            L_0x0101:
                int r0 = r5.f1263e
                android.graphics.drawable.Icon r6 = android.graphics.drawable.Icon.createWithResource(r6, r0)
                goto L_0x0127
            L_0x0108:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "called getResPackage() on "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
            L_0x011f:
                java.lang.Object r6 = r5.f1260b
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            L_0x0123:
                android.graphics.drawable.Icon r6 = android.graphics.drawable.Icon.createWithBitmap(r6)
            L_0x0127:
                android.content.res.ColorStateList r0 = r5.f1265g
                if (r0 == 0) goto L_0x012e
                r6.setTintList(r0)
            L_0x012e:
                android.graphics.PorterDuff$Mode r5 = r5.f1266h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.k
                if (r5 == r0) goto L_0x0137
                r6.setTintMode(r5)
            L_0x0137:
                return r6
            L_0x0138:
                java.lang.Object r5 = r5.f1260b
                android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1259a = -1;
        this.f1261c = null;
        this.f1262d = null;
        this.f1263e = 0;
        this.f1264f = 0;
        this.f1265g = null;
        this.f1266h = k;
        this.f1267i = null;
    }

    public IconCompat(int i10) {
        this.f1261c = null;
        this.f1262d = null;
        this.f1263e = 0;
        this.f1264f = 0;
        this.f1265g = null;
        this.f1266h = k;
        this.f1267i = null;
        this.f1259a = i10;
    }

    public static Bitmap a(Bitmap bitmap, boolean z9) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z9) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1263e = i10;
            iconCompat.f1260b = str;
            iconCompat.f1268j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f1259a;
        if (i10 == -1) {
            return a.a(this.f1260b);
        }
        if (i10 == 2) {
            return this.f1263e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i10 = this.f1259a;
        if (i10 == -1) {
            return a.d(this.f1260b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1260b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f1259a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f1260b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f1259a
            switch(r1) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r1 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r1 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r1 = "BITMAP"
        L_0x002c:
            r0.append(r1)
            int r1 = r4.f1259a
            switch(r1) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0056;
                case 3: goto L_0x0040;
                case 4: goto L_0x0035;
                case 5: goto L_0x007d;
                case 6: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x009d
        L_0x0035:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f1260b
            r0.append(r1)
            goto L_0x009d
        L_0x0040:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f1263e
            r0.append(r1)
            int r1 = r4.f1264f
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f1264f
            goto L_0x009a
        L_0x0056:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f1268j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x009d
        L_0x007d:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f1260b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f1260b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x009a:
            r0.append(r1)
        L_0x009d:
            android.content.res.ColorStateList r1 = r4.f1265g
            if (r1 == 0) goto L_0x00ab
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f1265g
            r0.append(r1)
        L_0x00ab:
            android.graphics.PorterDuff$Mode r1 = r4.f1266h
            android.graphics.PorterDuff$Mode r2 = k
            if (r1 == r2) goto L_0x00bb
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f1266h
            r0.append(r1)
        L_0x00bb:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
