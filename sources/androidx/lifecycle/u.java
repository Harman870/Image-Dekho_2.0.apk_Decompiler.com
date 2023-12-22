package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

public final class u extends c {
    public final /* synthetic */ t this$0;

    public class a extends c {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            u.this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            t tVar = u.this.this$0;
            int i10 = tVar.f1757a + 1;
            tVar.f1757a = i10;
            if (i10 == 1 && tVar.f1760d) {
                tVar.f1762f.f(g.b.ON_START);
                tVar.f1760d = false;
            }
        }
    }

    public u(t tVar) {
        this.this$0 = tVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = v.f1767b;
            ((v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1768a = this.this$0.f1764h;
        }
    }

    public void onActivityPaused(Activity activity) {
        t tVar = this.this$0;
        int i10 = tVar.f1758b - 1;
        tVar.f1758b = i10;
        if (i10 == 0) {
            tVar.f1761e.postDelayed(tVar.f1763g, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        t tVar = this.this$0;
        int i10 = tVar.f1757a - 1;
        tVar.f1757a = i10;
        if (i10 == 0 && tVar.f1759c) {
            tVar.f1762f.f(g.b.ON_STOP);
            tVar.f1760d = true;
        }
    }
}
