package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import androidx.fragment.app.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q3.b1;
import q3.e;
import q3.f;
import q3.z0;
import r3.o;

public class LifecycleCallback {
    public final f mLifecycleFragment;

    public LifecycleCallback(f fVar) {
        this.mLifecycleFragment = fVar;
    }

    @Keep
    private static f getChimeraLifecycleFragmentImpl(e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static f getFragment(Activity activity) {
        return getFragment(new e(activity));
    }

    public static f getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public static f getFragment(e eVar) {
        z0 z0Var;
        b1 b1Var;
        Activity activity = eVar.f11231a;
        if (activity instanceof p) {
            p pVar = (p) activity;
            WeakHashMap weakHashMap = b1.W;
            WeakReference weakReference = (WeakReference) weakHashMap.get(pVar);
            if (weakReference == null || (b1Var = (b1) weakReference.get()) == null) {
                try {
                    b1Var = (b1) pVar.w().D("SupportLifecycleFragmentImpl");
                    if (b1Var == null || b1Var.f1573m) {
                        b1Var = new b1();
                        z w = pVar.w();
                        w.getClass();
                        a aVar = new a(w);
                        aVar.c(0, b1Var, "SupportLifecycleFragmentImpl", 1);
                        aVar.g(true);
                    }
                    weakHashMap.put(pVar, new WeakReference(b1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return b1Var;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = z0.f11314d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (z0Var = (z0) weakReference2.get()) == null) {
                try {
                    z0Var = (z0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (z0Var == null || z0Var.isRemoving()) {
                        z0Var = new z0();
                        activity.getFragmentManager().beginTransaction().add(z0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(z0Var));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return z0Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity f10 = this.mLifecycleFragment.f();
        o.h(f10);
        return f10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
