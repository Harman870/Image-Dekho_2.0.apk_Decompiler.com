package c8;

import android.content.Context;
import com.ironsource.sdk.service.b;
import com.ironsource.sdk.service.d;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Context f2521a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ d f2522b;

    public a(Context context, d dVar) {
        this.f2522b = dVar;
        this.f2521a = context;
    }

    public final void run() {
        try {
            this.f2522b.a(b.a(this.f2521a));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
