package r1;

import android.graphics.Bitmap;

public class e implements d {
    public final void a(int i10) {
    }

    public final void b() {
    }

    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
