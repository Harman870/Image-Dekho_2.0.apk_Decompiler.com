package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

public final class v extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1767b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f1768a;

    public interface a {
    }

    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            v.a(activity, g.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            v.a(activity, g.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            v.a(activity, g.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            v.a(activity, g.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            v.a(activity, g.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            v.a(activity, g.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, g.b bVar) {
        if (activity instanceof n) {
            ((n) activity).e().f(bVar);
        } else if (activity instanceof l) {
            m r4 = ((l) activity).r();
            if (r4 instanceof m) {
                r4.f(bVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(g.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(g.b.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        b(g.b.ON_DESTROY);
        this.f1768a = null;
    }

    public final void onPause() {
        super.onPause();
        b(g.b.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f1768a;
        if (aVar != null) {
            t.this.a();
        }
        b(g.b.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f1768a;
        if (aVar != null) {
            t tVar = t.this;
            int i10 = tVar.f1757a + 1;
            tVar.f1757a = i10;
            if (i10 == 1 && tVar.f1760d) {
                tVar.f1762f.f(g.b.ON_START);
                tVar.f1760d = false;
            }
        }
        b(g.b.ON_START);
    }

    public final void onStop() {
        super.onStop();
        b(g.b.ON_STOP);
    }
}
