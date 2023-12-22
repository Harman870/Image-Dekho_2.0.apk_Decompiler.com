package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f350b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f350b = bVar;
        this.f349a = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f350b.f345h.onClick(this.f349a.f314b, i10);
        if (!this.f350b.f346i) {
            this.f349a.f314b.dismiss();
        }
    }
}
