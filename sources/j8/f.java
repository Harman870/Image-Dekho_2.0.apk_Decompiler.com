package j8;

import android.widget.Toast;
import androidx.fragment.app.p;
import com.imgdkh.app.R;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8785a;

    public /* synthetic */ f(g gVar) {
        this.f8785a = gVar;
    }

    public final Object call() {
        Toast toast;
        g gVar = this.f8785a;
        if (!gVar.d0(gVar.Z) || !gVar.W.a(gVar.t(R.string.show_ad)).equals(IronSourceConstants.BOOLEAN_TRUE_AS_STRING)) {
            return null;
        }
        if (gVar.c0(gVar.Z)) {
            toast = Toast.makeText(gVar.T(), "Install 1 App", 0);
        } else {
            p T = gVar.T();
            StringBuilder g10 = androidx.activity.f.g("Click On Ad And Wait ");
            g10.append(gVar.b0(gVar.Z));
            g10.append(" Second");
            toast = Toast.makeText(T, g10.toString(), 1);
        }
        toast.show();
        return null;
    }
}
