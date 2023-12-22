package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import com.ironsource.lifecycle.d;

public final class b extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3792b = 0;

    /* renamed from: a  reason: collision with root package name */
    public d.e f3793a;

    public interface a {
        void a(Activity activity);

        void b(Activity activity);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f3793a != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f3793a = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        d.e eVar = this.f3793a;
        if (eVar != null) {
            eVar.b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        d.e eVar = this.f3793a;
        if (eVar != null) {
            eVar.a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
