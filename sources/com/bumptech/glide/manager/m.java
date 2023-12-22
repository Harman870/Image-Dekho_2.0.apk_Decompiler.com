package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.o;
import java.util.HashSet;

@Deprecated
public final class m extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final a f2623a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2624b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f2625c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public o f2626d;

    /* renamed from: e  reason: collision with root package name */
    public m f2627e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f2628f;

    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        a aVar = new a();
        this.f2623a = aVar;
    }

    public final void a(Activity activity) {
        m mVar = this.f2627e;
        if (mVar != null) {
            mVar.f2625c.remove(this);
            this.f2627e = null;
        }
        n nVar = b.b(activity).f2550e;
        nVar.getClass();
        m h10 = nVar.h(activity.getFragmentManager(), (Fragment) null);
        this.f2627e = h10;
        if (!equals(h10)) {
            this.f2627e.f2625c.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2623a.a();
        m mVar = this.f2627e;
        if (mVar != null) {
            mVar.f2625c.remove(this);
            this.f2627e = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        m mVar = this.f2627e;
        if (mVar != null) {
            mVar.f2625c.remove(this);
            this.f2627e = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2623a.b();
    }

    public final void onStop() {
        super.onStop();
        this.f2623a.c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f2628f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
