package n4;

import java.util.concurrent.atomic.AtomicReference;

public final class r5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10101b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10102c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a6 f10103d;

    public r5(a6 a6Var, AtomicReference atomicReference, String str, String str2) {
        this.f10103d = a6Var;
        this.f10100a = atomicReference;
        this.f10101b = str;
        this.f10102c = str2;
    }

    public final void run() {
        a7 v10 = this.f10103d.f9600a.v();
        AtomicReference atomicReference = this.f10100a;
        String str = this.f10101b;
        String str2 = this.f10102c;
        v10.g();
        v10.h();
        v10.s(new w6(v10, atomicReference, str, str2, v10.p(false)));
    }
}
