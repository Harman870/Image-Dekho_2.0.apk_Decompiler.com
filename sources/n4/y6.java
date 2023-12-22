package n4;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import r3.o;

public final class y6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10337b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10338c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g8 f10339d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f10340e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a7 f10341f;

    public y6(a7 a7Var, AtomicReference atomicReference, String str, String str2, g8 g8Var, boolean z9) {
        this.f10341f = a7Var;
        this.f10336a = atomicReference;
        this.f10337b = str;
        this.f10338c = str2;
        this.f10339d = g8Var;
        this.f10340e = z9;
    }

    public final void run() {
        List list;
        AtomicReference atomicReference;
        synchronized (this.f10336a) {
            try {
                a7 a7Var = this.f10341f;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f10337b, this.f10338c);
                    this.f10336a.set(Collections.emptyList());
                    this.f10336a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    o.h(this.f10339d);
                    atomicReference = this.f10336a;
                    list = z2Var.s(this.f10337b, this.f10338c, this.f10340e, this.f10339d);
                } else {
                    atomicReference = this.f10336a;
                    list = z2Var.n((String) null, this.f10337b, this.f10338c, this.f10340e);
                }
                atomicReference.set(list);
                this.f10341f.r();
                this.f10336a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f10341f.f9600a.a().f9828f.d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f10337b, e10);
                    this.f10336a.set(Collections.emptyList());
                } catch (Throwable th) {
                    this.f10336a.notify();
                    throw th;
                }
            }
        }
    }
}
