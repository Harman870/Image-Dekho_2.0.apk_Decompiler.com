package n4;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import r3.o;

public final class w6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10279c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g8 f10280d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a7 f10281e;

    public w6(a7 a7Var, AtomicReference atomicReference, String str, String str2, g8 g8Var) {
        this.f10281e = a7Var;
        this.f10277a = atomicReference;
        this.f10278b = str;
        this.f10279c = str2;
        this.f10280d = g8Var;
    }

    public final void run() {
        List list;
        AtomicReference atomicReference;
        synchronized (this.f10277a) {
            try {
                a7 a7Var = this.f10281e;
                z2 z2Var = a7Var.f9613d;
                if (z2Var == null) {
                    a7Var.f9600a.a().f9828f.d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f10278b, this.f10279c);
                    this.f10277a.set(Collections.emptyList());
                    this.f10277a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    o.h(this.f10280d);
                    atomicReference = this.f10277a;
                    list = z2Var.A(this.f10278b, this.f10279c, this.f10280d);
                } else {
                    atomicReference = this.f10277a;
                    list = z2Var.zzg((String) null, this.f10278b, this.f10279c);
                }
                atomicReference.set(list);
                this.f10281e.r();
                this.f10277a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f10281e.f9600a.a().f9828f.d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f10278b, e10);
                    this.f10277a.set(Collections.emptyList());
                } catch (Throwable th) {
                    this.f10277a.notify();
                    throw th;
                }
            }
        }
    }
}
