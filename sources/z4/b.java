package z4;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class b extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f13175q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f13175q = carouselLayoutManager;
    }

    public final PointF a(int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f13175q;
        com.google.android.material.carousel.b bVar = carouselLayoutManager.u;
        if (bVar == null) {
            return null;
        }
        return new PointF(((float) carouselLayoutManager.G0(bVar.f3037a, i10)) - ((float) this.f13175q.f3009p), 0.0f);
    }

    public final int f(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f13175q;
        return (int) (((float) this.f13175q.f3009p) - ((float) carouselLayoutManager.G0(carouselLayoutManager.u.f3037a, RecyclerView.l.G(view))));
    }
}
