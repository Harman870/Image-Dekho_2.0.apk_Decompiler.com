package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.imgdkh.app.R;

public abstract class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public Context f383a;

    /* renamed from: b  reason: collision with root package name */
    public Context f384b;

    /* renamed from: c  reason: collision with root package name */
    public f f385c;

    /* renamed from: d  reason: collision with root package name */
    public LayoutInflater f386d;

    /* renamed from: e  reason: collision with root package name */
    public j.a f387e;

    /* renamed from: f  reason: collision with root package name */
    public int f388f = R.layout.abc_action_menu_layout;

    /* renamed from: g  reason: collision with root package name */
    public int f389g = R.layout.abc_action_menu_item_layout;

    /* renamed from: h  reason: collision with root package name */
    public k f390h;

    /* renamed from: i  reason: collision with root package name */
    public int f391i;

    public a(Context context) {
        this.f383a = context;
        this.f386d = LayoutInflater.from(context);
    }

    public final boolean c(h hVar) {
        return false;
    }

    public final int getId() {
        return this.f391i;
    }

    public final void k(j.a aVar) {
        this.f387e = aVar;
    }

    public final boolean l(h hVar) {
        return false;
    }
}
