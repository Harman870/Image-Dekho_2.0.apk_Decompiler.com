package r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
import v3.a;

public final class c1 implements ServiceConnection, f1 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11539a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f11540b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11541c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f11542d;

    /* renamed from: e  reason: collision with root package name */
    public final b1 f11543e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f11544f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e1 f11545g;

    public c1(e1 e1Var, b1 b1Var) {
        this.f11545g = e1Var;
        this.f11543e = b1Var;
    }

    public final void a(String str, Executor executor) {
        boolean z9;
        this.f11540b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            e1 e1Var = this.f11545g;
            a aVar = e1Var.f11578g;
            Context context = e1Var.f11576e;
            boolean d10 = aVar.d(context, str, this.f11543e.a(context), this, 4225, executor);
            this.f11541c = d10;
            if (d10) {
                this.f11545g.f11577f.sendMessageDelayed(this.f11545g.f11577f.obtainMessage(1, this.f11543e), this.f11545g.f11580i);
            } else {
                this.f11540b = 2;
                try {
                    e1 e1Var2 = this.f11545g;
                    e1Var2.f11578g.c(e1Var2.f11576e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11545g.f11575d) {
            this.f11545g.f11577f.removeMessages(1, this.f11543e);
            this.f11542d = iBinder;
            this.f11544f = componentName;
            for (ServiceConnection onServiceConnected : this.f11539a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f11540b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11545g.f11575d) {
            this.f11545g.f11577f.removeMessages(1, this.f11543e);
            this.f11542d = null;
            this.f11544f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f11539a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f11540b = 2;
        }
    }
}
