package r1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.activity.f;
import j2.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f11475j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final k f11476a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f11477b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11478c;

    /* renamed from: d  reason: collision with root package name */
    public long f11479d;

    /* renamed from: e  reason: collision with root package name */
    public long f11480e;

    /* renamed from: f  reason: collision with root package name */
    public int f11481f;

    /* renamed from: g  reason: collision with root package name */
    public int f11482g;

    /* renamed from: h  reason: collision with root package name */
    public int f11483h;

    /* renamed from: i  reason: collision with root package name */
    public int f11484i;

    public static final class a {
    }

    public j(long j10) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f11479d = j10;
        this.f11476a = mVar;
        this.f11477b = unmodifiableSet;
        this.f11478c = new a();
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            h(this.f11479d / 2);
        }
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0);
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            return g10;
        }
        if (config == null) {
            config = f11475j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap g10 = g(i10, i11, config);
        if (g10 != null) {
            g10.eraseColor(0);
            return g10;
        }
        if (config == null) {
            config = f11475j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((m) this.f11476a).getClass();
                        if (((long) l.c(bitmap)) <= this.f11479d) {
                            if (this.f11477b.contains(bitmap.getConfig())) {
                                ((m) this.f11476a).getClass();
                                int c10 = l.c(bitmap);
                                ((m) this.f11476a).f(bitmap);
                                this.f11478c.getClass();
                                this.f11483h++;
                                this.f11480e += (long) c10;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f11476a).e(bitmap));
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    f();
                                }
                                h(this.f11479d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f11476a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f11477b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void f() {
        StringBuilder g10 = f.g("Hits=");
        g10.append(this.f11481f);
        g10.append(", misses=");
        g10.append(this.f11482g);
        g10.append(", puts=");
        g10.append(this.f11483h);
        g10.append(", evictions=");
        g10.append(this.f11484i);
        g10.append(", currentSize=");
        g10.append(this.f11480e);
        g10.append(", maxSize=");
        g10.append(this.f11479d);
        g10.append("\nStrategy=");
        g10.append(this.f11476a);
        Log.v("LruBitmapPool", g10.toString());
    }

    public final synchronized Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b10;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            k kVar = this.f11476a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f11475j;
            }
            b10 = ((m) kVar).b(i10, i11, config2);
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing bitmap=");
                    ((m) this.f11476a).getClass();
                    sb.append(m.c(l.d(config) * i10 * i11, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f11482g++;
            } else {
                this.f11481f++;
                long j10 = this.f11480e;
                ((m) this.f11476a).getClass();
                this.f11480e = j10 - ((long) l.c(b10));
                this.f11478c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Get bitmap=");
                ((m) this.f11476a).getClass();
                sb2.append(m.c(l.d(config) * i10 * i11, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void h(long j10) {
        while (this.f11480e > j10) {
            m mVar = (m) this.f11476a;
            Bitmap c10 = mVar.f11491b.c();
            if (c10 != null) {
                mVar.a(Integer.valueOf(l.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f11480e = 0;
                return;
            }
            this.f11478c.getClass();
            long j11 = this.f11480e;
            ((m) this.f11476a).getClass();
            this.f11480e = j11 - ((long) l.c(c10));
            this.f11484i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f11476a).e(c10));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c10.recycle();
        }
    }
}
