package q3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import f4.f;
import n3.w;
import o3.b;
import o3.e;
import o3.i;
import r3.o;
import r3.v;

public final class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f11279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f11280b;

    public u0(o oVar, t0 t0Var) {
        this.f11280b = oVar;
        this.f11279a = t0Var;
    }

    public final void run() {
        boolean z9;
        if (this.f11280b.f11282a) {
            b bVar = this.f11279a.f11277b;
            if (bVar.f10539b == 0 || bVar.f10540c == null) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                v0 v0Var = this.f11280b;
                f fVar = v0Var.mLifecycleFragment;
                Activity activity = v0Var.getActivity();
                PendingIntent pendingIntent = bVar.f10540c;
                o.h(pendingIntent);
                int i10 = this.f11279a.f11276a;
                int i11 = GoogleApiActivity.f2801b;
                Intent intent = new Intent(activity, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                fVar.startActivityForResult(intent, 1);
                return;
            }
            v0 v0Var2 = this.f11280b;
            if (v0Var2.f11285d.a(v0Var2.getActivity(), (String) null, bVar.f10539b) != null) {
                v0 v0Var3 = this.f11280b;
                e eVar = v0Var3.f11285d;
                Activity activity2 = v0Var3.getActivity();
                v0 v0Var4 = this.f11280b;
                eVar.h(activity2, v0Var4.mLifecycleFragment, bVar.f10539b, v0Var4);
            } else if (bVar.f10539b == 18) {
                v0 v0Var5 = this.f11280b;
                e eVar2 = v0Var5.f11285d;
                Activity activity3 = v0Var5.getActivity();
                v0 v0Var6 = this.f11280b;
                eVar2.getClass();
                ProgressBar progressBar = new ProgressBar(activity3, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                builder.setView(progressBar);
                builder.setMessage(v.b(activity3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                e.f(activity3, create, "GooglePlayServicesUpdatingDialog", v0Var6);
                v0 v0Var7 = this.f11280b;
                e eVar3 = v0Var7.f11285d;
                Context applicationContext = v0Var7.getActivity().getApplicationContext();
                w wVar = new w(this, create);
                eVar3.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                b0 b0Var = new b0(wVar);
                applicationContext.registerReceiver(b0Var, intentFilter);
                b0Var.f11206a = applicationContext;
                if (!i.b(applicationContext)) {
                    v0 v0Var8 = ((u0) wVar.f9574b).f11280b;
                    v0Var8.f11283b.set((Object) null);
                    f fVar2 = ((o) v0Var8).f11265f.f11224n;
                    fVar2.sendMessage(fVar2.obtainMessage(3));
                    if (create.isShowing()) {
                        create.dismiss();
                    }
                    synchronized (b0Var) {
                        Context context = b0Var.f11206a;
                        if (context != null) {
                            context.unregisterReceiver(b0Var);
                        }
                        b0Var.f11206a = null;
                    }
                }
            } else {
                this.f11280b.a(bVar, this.f11279a.f11276a);
            }
        }
    }
}
