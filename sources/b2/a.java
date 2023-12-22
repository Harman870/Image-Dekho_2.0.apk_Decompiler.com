package b2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.f;
import b2.c;
import com.bumptech.glide.load.ImageHeaderParser;
import j2.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import n1.c;
import n1.e;
import o1.h;
import o1.j;
import q1.w;
import r1.d;

public final class a implements j<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0019a f2200f = new C0019a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f2201g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2202a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f2203b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2204c;

    /* renamed from: d  reason: collision with root package name */
    public final C0019a f2205d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2206e;

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    public static class C0019a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f2207a = new ArrayDeque(0);

        public b() {
            char[] cArr = l.f8029a;
        }
    }

    public a(Context context, List<ImageHeaderParser> list, d dVar, r1.b bVar) {
        b bVar2 = f2201g;
        C0019a aVar = f2200f;
        this.f2202a = context.getApplicationContext();
        this.f2203b = list;
        this.f2205d = aVar;
        this.f2206e = new b(dVar, bVar);
        this.f2204c = bVar2;
    }

    public static int d(c cVar, int i10, int i11) {
        int i12;
        int min = Math.min(cVar.f9496g / i11, cVar.f9495f / i10);
        if (min == 0) {
            i12 = 0;
        } else {
            i12 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i12);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.f9495f + "x" + cVar.f9496g + "]");
        }
        return max;
    }

    public final boolean a(Object obj, h hVar) {
        return !((Boolean) hVar.c(h.f2245b)).booleanValue() && com.bumptech.glide.load.a.b(this.f2203b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        n1.d dVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        b bVar = this.f2204c;
        synchronized (bVar) {
            n1.d dVar2 = (n1.d) bVar.f2207a.poll();
            if (dVar2 == null) {
                dVar2 = new n1.d();
            }
            dVar = dVar2;
            dVar.f9501b = null;
            Arrays.fill(dVar.f9500a, (byte) 0);
            dVar.f9502c = new c();
            dVar.f9503d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            dVar.f9501b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f9501b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c10 = c(byteBuffer, i10, i11, dVar, hVar);
            b bVar2 = this.f2204c;
            synchronized (bVar2) {
                dVar.f9501b = null;
                dVar.f9502c = null;
                bVar2.f2207a.offer(dVar);
            }
            return c10;
        } catch (Throwable th) {
            b bVar3 = this.f2204c;
            synchronized (bVar3) {
                dVar.f9501b = null;
                dVar.f9502c = null;
                bVar3.f2207a.offer(dVar);
                throw th;
            }
        }
    }

    public final d c(ByteBuffer byteBuffer, int i10, int i11, n1.d dVar, h hVar) {
        Bitmap.Config config;
        int i12 = j2.h.f8019b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            c b10 = dVar.b();
            if (b10.f9492c > 0) {
                if (b10.f9491b == 0) {
                    if (hVar.c(h.f2244a) == o1.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int d10 = d(b10, i10, i11);
                    C0019a aVar = this.f2205d;
                    b bVar = this.f2206e;
                    aVar.getClass();
                    e eVar = new e(bVar, b10, byteBuffer, d10);
                    eVar.i(config);
                    eVar.c();
                    Bitmap b11 = eVar.b();
                    if (b11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder g10 = f.g("Decoded GIF from stream in ");
                            g10.append(j2.h.a(elapsedRealtimeNanos));
                            Log.v("BufferGifDecoder", g10.toString());
                        }
                        return null;
                    }
                    w1.b bVar2 = w1.b.f12665b;
                    f fVar = r9;
                    f fVar2 = new f(com.bumptech.glide.b.b(this.f2202a), eVar, i10, i11, bVar2, b11);
                    return new d(new c(new c.a(fVar)));
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g11 = f.g("Decoded GIF from stream in ");
                g11.append(j2.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g11.toString());
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder g12 = f.g("Decoded GIF from stream in ");
                g12.append(j2.h.a(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", g12.toString());
            }
        }
    }
}
