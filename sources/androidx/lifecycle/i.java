package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f1742a = new AtomicBoolean(false);

    public static class a extends c {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            v.c(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
