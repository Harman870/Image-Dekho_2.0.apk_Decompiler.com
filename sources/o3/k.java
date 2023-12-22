package o3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.n;
import r3.o;

public class k extends n {

    /* renamed from: x0  reason: collision with root package name */
    public Dialog f10569x0;

    /* renamed from: y0  reason: collision with root package name */
    public DialogInterface.OnCancelListener f10570y0;

    /* renamed from: z0  reason: collision with root package name */
    public AlertDialog f10571z0;

    public final Dialog c0() {
        Dialog dialog = this.f10569x0;
        if (dialog != null) {
            return dialog;
        }
        this.f1544o0 = false;
        if (this.f10571z0 == null) {
            Context l6 = l();
            o.h(l6);
            this.f10571z0 = new AlertDialog.Builder(l6).create();
        }
        return this.f10571z0;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10570y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
