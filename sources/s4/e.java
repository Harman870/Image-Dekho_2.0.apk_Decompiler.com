package s4;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public final class e extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f11863a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final Object get(Object obj) {
        this.f11863a.set(((ImageView) obj).getImageMatrix());
        return this.f11863a;
    }

    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
