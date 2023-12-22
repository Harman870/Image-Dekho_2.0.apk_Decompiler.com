package x1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.activity.f;
import o1.h;
import o1.j;
import r1.e;
import w1.a;

public final class c implements j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final e f12843a = new e();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final d b(ImageDecoder.Source source, int i10, int i11, h hVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new a(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder g10 = f.g("Decoded [");
            g10.append(decodeBitmap.getWidth());
            g10.append("x");
            g10.append(decodeBitmap.getHeight());
            g10.append("] for [");
            g10.append(i10);
            g10.append("x");
            g10.append(i11);
            g10.append("]");
            Log.v("BitmapImageDecoder", g10.toString());
        }
        return new d(decodeBitmap, this.f12843a);
    }
}
