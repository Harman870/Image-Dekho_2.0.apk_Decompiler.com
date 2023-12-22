package w1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.activity.f;
import o1.b;
import o1.g;
import o1.h;
import o1.i;
import x1.l;
import x1.m;
import x1.r;

public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final r f12658a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12659b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12660c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12661d;

    /* renamed from: e  reason: collision with root package name */
    public final l f12662e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12663f;

    /* renamed from: g  reason: collision with root package name */
    public final i f12664g;

    /* renamed from: w1.a$a  reason: collision with other inner class name */
    public class C0164a implements ImageDecoder.OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(int i10, int i11, h hVar) {
        boolean z9;
        if (r.f12890j == null) {
            synchronized (r.class) {
                if (r.f12890j == null) {
                    r.f12890j = new r();
                }
            }
        }
        this.f12658a = r.f12890j;
        this.f12659b = i10;
        this.f12660c = i11;
        this.f12661d = (b) hVar.c(m.f12873f);
        this.f12662e = (l) hVar.c(l.f12871f);
        g gVar = m.f12876i;
        if (hVar.c(gVar) == null || !((Boolean) hVar.c(gVar)).booleanValue()) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f12663f = z9;
        this.f12664g = (i) hVar.c(m.f12874g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z9 = false;
        if (this.f12658a.a(this.f12659b, this.f12660c, this.f12663f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f12661d == b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0164a());
        Size size = imageInfo.getSize();
        int i10 = this.f12659b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f12660c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f12662e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(((float) size.getWidth()) * b10);
        int round2 = Math.round(((float) size.getHeight()) * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder g10 = f.g("Resizing from [");
            g10.append(size.getWidth());
            g10.append("x");
            g10.append(size.getHeight());
            g10.append("] to [");
            g10.append(round);
            g10.append("x");
            g10.append(round2);
            g10.append("] scaleFactor: ");
            g10.append(b10);
            Log.v("ImageDecoder", g10.toString());
        }
        imageDecoder.setTargetSize(round, round2);
        i iVar = this.f12664g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                if (iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z9 = true;
                }
                if (z9) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i12 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }
}
