package n4;

import android.content.Intent;

public final /* synthetic */ class e7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g7 f9722a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9723b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i3 f9724c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Intent f9725d;

    public /* synthetic */ e7(g7 g7Var, int i10, i3 i3Var, Intent intent) {
        this.f9722a = g7Var;
        this.f9723b = i10;
        this.f9724c = i3Var;
        this.f9725d = intent;
    }

    public final void run() {
        g7 g7Var = this.f9722a;
        int i10 = this.f9723b;
        i3 i3Var = this.f9724c;
        Intent intent = this.f9725d;
        if (((f7) g7Var.f9767a).b(i10)) {
            i3Var.f9835n.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            g7Var.c().f9835n.a("Completed wakeful intent.");
            ((f7) g7Var.f9767a).a(intent);
        }
    }
}
