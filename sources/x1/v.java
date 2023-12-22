package x1;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import o1.h;
import o1.j;
import q1.w;
import x1.s;

public final class v implements j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f12909a;

    public v(m mVar) {
        this.f12909a = mVar;
    }

    public final boolean a(Object obj, h hVar) {
        boolean z9;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f12909a.getClass();
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                return true;
            }
        }
        return false;
    }

    public final w b(Object obj, int i10, int i11, h hVar) {
        m mVar = this.f12909a;
        return mVar.a(new s.c((ParcelFileDescriptor) obj, mVar.f12881d, mVar.f12880c), i10, i11, hVar, m.f12877j);
    }
}
