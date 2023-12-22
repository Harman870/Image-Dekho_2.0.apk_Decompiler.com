package e0;

import android.content.Context;
import e0.k;
import java.util.concurrent.Callable;

public final class g implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f6133a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f6134b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f6135c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6136d;

    public g(String str, Context context, f fVar, int i10) {
        this.f6133a = str;
        this.f6134b = context;
        this.f6135c = fVar;
        this.f6136d = i10;
    }

    public final Object call() {
        return k.a(this.f6133a, this.f6134b, this.f6135c, this.f6136d);
    }
}
