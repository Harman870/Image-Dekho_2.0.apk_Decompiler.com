package n7;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.c.b;
import com.ironsource.environment.h;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Context f10384a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ b f10385b;

    public a(b bVar, Context context) {
        this.f10385b = bVar;
        this.f10384a = context;
    }

    public final void run() {
        try {
            b bVar = this.f10385b;
            Context context = this.f10384a;
            if (context != null) {
                String C = h.C(context);
                if (!TextUtils.isEmpty(C)) {
                    bVar.b("gaid", C);
                }
                String D = h.D(context);
                if (!TextUtils.isEmpty(D)) {
                    bVar.b("lat", Boolean.valueOf(Boolean.parseBoolean(D)));
                }
            }
        } catch (Exception unused) {
        }
        this.f10385b.f3717b.set(false);
    }
}
