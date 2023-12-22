package e0;

import android.content.Context;
import e0.k;
import java.util.concurrent.Callable;

public final class i implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f6139b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f6140c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6141d;

    public i(String str, Context context, f fVar, int i10) {
        this.f6138a = str;
        this.f6139b = context;
        this.f6140c = fVar;
        this.f6141d = i10;
    }

    public final Object call() {
        try {
            return k.a(this.f6138a, this.f6139b, this.f6140c, this.f6141d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
