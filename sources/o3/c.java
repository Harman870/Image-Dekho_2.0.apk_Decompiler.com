package o3;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import r3.o;

public final class c extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f10542a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnCancelListener f10543b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f10544c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f10543b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f10542a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f10544c == null) {
            Activity activity = getActivity();
            o.h(activity);
            this.f10544c = new AlertDialog.Builder(activity).create();
        }
        return this.f10544c;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
