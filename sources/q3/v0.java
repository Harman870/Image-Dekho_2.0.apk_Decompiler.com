package q3;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import f4.f;
import java.util.concurrent.atomic.AtomicReference;
import o3.b;
import o3.e;

public abstract class v0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f11282a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<t0> f11283b = new AtomicReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final f f11284c = new f(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final e f11285d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v0(f fVar) {
        super(fVar);
        e eVar = e.f10553d;
        this.f11285d = eVar;
    }

    public final void a(b bVar, int i10) {
        this.f11283b.set((Object) null);
        ((o) this).f11265f.g(bVar, i10);
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        t0 t0Var = this.f11283b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int c10 = this.f11285d.c(getActivity());
                if (c10 == 0) {
                    this.f11283b.set((Object) null);
                    f fVar = ((o) this).f11265f.f11224n;
                    fVar.sendMessage(fVar.obtainMessage(3));
                    return;
                } else if (t0Var != null) {
                    if (t0Var.f11277b.f10539b == 18 && c10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            this.f11283b.set((Object) null);
            f fVar2 = ((o) this).f11265f.f11224n;
            fVar2.sendMessage(fVar2.obtainMessage(3));
            return;
        } else if (i11 == 0) {
            if (t0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                a(new b(1, i12, (PendingIntent) null, t0Var.f11277b.toString()), t0Var.f11276a);
                return;
            }
            return;
        }
        if (t0Var != null) {
            a(t0Var.f11277b, t0Var.f11276a);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i10;
        b bVar = new b(13, (PendingIntent) null);
        t0 t0Var = this.f11283b.get();
        if (t0Var == null) {
            i10 = -1;
        } else {
            i10 = t0Var.f11276a;
        }
        a(bVar, i10);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f11283b.set(bundle.getBoolean("resolving_error", false) ? new t0(new b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        t0 t0Var = this.f11283b.get();
        if (t0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", t0Var.f11276a);
            bundle.putInt("failed_status", t0Var.f11277b.f10539b);
            bundle.putParcelable("failed_resolution", t0Var.f11277b.f10540c);
        }
    }

    public void onStart() {
        super.onStart();
        this.f11282a = true;
    }

    public void onStop() {
        super.onStop();
        this.f11282a = false;
    }
}
