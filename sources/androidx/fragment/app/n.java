package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import com.imgdkh.app.R;

public class n extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler T;
    public a U = new a();
    public b V = new b();
    public c W = new c();
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1544o0 = true;
    public int p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f1545q0;

    /* renamed from: r0  reason: collision with root package name */
    public d f1546r0 = new d();

    /* renamed from: s0  reason: collision with root package name */
    public Dialog f1547s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1548t0;
    public boolean u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f1549v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f1550w0 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            n nVar = n.this;
            nVar.W.onDismiss(nVar.f1547s0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.f1547s0;
            if (dialog != null) {
                nVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.f1547s0;
            if (dialog != null) {
                nVar.onDismiss(dialog);
            }
        }
    }

    public class d implements r<l> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void a(Object obj) {
            if (((l) obj) != null) {
                n nVar = n.this;
                if (nVar.f1544o0) {
                    View V = nVar.V();
                    if (V.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (n.this.f1547s0 != null) {
                        if (y.I(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + n.this.f1547s0);
                        }
                        n.this.f1547s0.setContentView(V);
                    }
                }
            }
        }
    }

    public class e extends androidx.activity.result.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.c f1555b;

        public e(o.a aVar) {
            this.f1555b = aVar;
        }

        public final View i(int i10) {
            if (this.f1555b.m()) {
                return this.f1555b.i(i10);
            }
            Dialog dialog = n.this.f1547s0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }

        public final boolean m() {
            return this.f1555b.m() || n.this.f1550w0;
        }
    }

    @Deprecated
    public final void A() {
        this.D = true;
    }

    public final void C(Context context) {
        super.C(context);
        this.P.e(this.f1546r0);
        if (!this.f1549v0) {
            this.u0 = false;
        }
    }

    public void D(Bundle bundle) {
        super.D(bundle);
        this.T = new Handler();
        this.f1544o0 = this.f1582x == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.f1544o0 = bundle.getBoolean("android:showsDialog", this.f1544o0);
            this.p0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void G() {
        this.D = true;
        Dialog dialog = this.f1547s0;
        if (dialog != null) {
            this.f1548t0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1547s0.dismiss();
            if (!this.u0) {
                onDismiss(this.f1547s0);
            }
            this.f1547s0 = null;
            this.f1550w0 = false;
        }
    }

    public final void H() {
        this.D = true;
        if (!this.f1549v0 && !this.u0) {
            this.u0 = true;
        }
        this.P.h(this.f1546r0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater I(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.I(r8)
            boolean r0 = r7.f1544o0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L_0x009b
            boolean r3 = r7.f1545q0
            if (r3 == 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            boolean r0 = r7.f1550w0
            if (r0 != 0) goto L_0x006f
            r0 = 0
            r3 = 1
            r7.f1545q0 = r3     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.c0()     // Catch:{ all -> 0x006b }
            r7.f1547s0 = r4     // Catch:{ all -> 0x006b }
            boolean r5 = r7.f1544o0     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x0065
            int r5 = r7.X     // Catch:{ all -> 0x006b }
            if (r5 == r3) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x006b }
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch:{ all -> 0x006b }
        L_0x003e:
            android.content.Context r4 = r7.l()     // Catch:{ all -> 0x006b }
            boolean r5 = r4 instanceof android.app.Activity     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x004d
            android.app.Dialog r5 = r7.f1547s0     // Catch:{ all -> 0x006b }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x006b }
            r5.setOwnerActivity(r4)     // Catch:{ all -> 0x006b }
        L_0x004d:
            android.app.Dialog r4 = r7.f1547s0     // Catch:{ all -> 0x006b }
            boolean r5 = r7.Z     // Catch:{ all -> 0x006b }
            r4.setCancelable(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.f1547s0     // Catch:{ all -> 0x006b }
            androidx.fragment.app.n$b r5 = r7.V     // Catch:{ all -> 0x006b }
            r4.setOnCancelListener(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r4 = r7.f1547s0     // Catch:{ all -> 0x006b }
            androidx.fragment.app.n$c r5 = r7.W     // Catch:{ all -> 0x006b }
            r4.setOnDismissListener(r5)     // Catch:{ all -> 0x006b }
            r7.f1550w0 = r3     // Catch:{ all -> 0x006b }
            goto L_0x0068
        L_0x0065:
            r3 = 0
            r7.f1547s0 = r3     // Catch:{ all -> 0x006b }
        L_0x0068:
            r7.f1545q0 = r0
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            r7.f1545q0 = r0
            throw r8
        L_0x006f:
            boolean r0 = androidx.fragment.app.y.I(r2)
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x008e:
            android.app.Dialog r0 = r7.f1547s0
            if (r0 == 0) goto L_0x009a
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L_0x009a:
            return r8
        L_0x009b:
            boolean r0 = androidx.fragment.app.y.I(r2)
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1544o0
            if (r2 != 0) goto L_0x00be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto L_0x00c5
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        L_0x00c5:
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        L_0x00d2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.I(android.os.Bundle):android.view.LayoutInflater");
    }

    public void K(Bundle bundle) {
        Dialog dialog = this.f1547s0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.X;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.Y;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z9 = this.Z;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f1544o0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.p0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void L() {
        this.D = true;
        Dialog dialog = this.f1547s0;
        if (dialog != null) {
            this.f1548t0 = false;
            dialog.show();
            View decorView = this.f1547s0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void M() {
        this.D = true;
        Dialog dialog = this.f1547s0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void N(Bundle bundle) {
        Bundle bundle2;
        this.D = true;
        if (this.f1547s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1547s0.onRestoreInstanceState(bundle2);
        }
    }

    public final void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.O(layoutInflater, viewGroup, bundle);
        if (this.F == null && this.f1547s0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1547s0.onRestoreInstanceState(bundle2);
        }
    }

    public final void b0(boolean z9, boolean z10) {
        if (!this.u0) {
            this.u0 = true;
            this.f1549v0 = false;
            Dialog dialog = this.f1547s0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1547s0.dismiss();
                if (!z10) {
                    if (Looper.myLooper() == this.T.getLooper()) {
                        onDismiss(this.f1547s0);
                    } else {
                        this.T.post(this.U);
                    }
                }
            }
            this.f1548t0 = true;
            if (this.p0 >= 0) {
                y o10 = o();
                int i10 = this.p0;
                if (i10 >= 0) {
                    o10.w(new y.l(i10), z9);
                    this.p0 = -1;
                    return;
                }
                throw new IllegalArgumentException(androidx.activity.e.a("Bad id: ", i10));
            }
            a aVar = new a(o());
            aVar.f1503o = true;
            aVar.i(this);
            if (z9) {
                aVar.g(true);
            } else {
                aVar.f();
            }
        }
    }

    public Dialog c0() {
        if (y.I(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(U(), this.Y);
    }

    public final Dialog d0() {
        Dialog dialog = this.f1547s0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final androidx.activity.result.c g() {
        return new e(new o.a());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1548t0) {
            if (y.I(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            b0(true, true);
        }
    }
}
