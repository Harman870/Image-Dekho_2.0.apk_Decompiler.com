package h8;

import androidx.fragment.app.a;
import androidx.fragment.app.y;
import androidx.fragment.app.z;
import com.imgdkh.app.R;
import com.wallpapersindia.app.HomeScreen;
import j8.r;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f7023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f7024b;

    public /* synthetic */ b(z zVar, r rVar) {
        this.f7023a = zVar;
        this.f7024b = rVar;
    }

    public final Object call() {
        y yVar = this.f7023a;
        r rVar = this.f7024b;
        int i10 = HomeScreen.A;
        yVar.getClass();
        a aVar = new a(yVar);
        aVar.d(R.id.frame_layout, rVar);
        aVar.f();
        return null;
    }
}
