package y3;

import android.content.Context;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f13044b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f13045a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f13044b;
        synchronized (cVar) {
            if (cVar.f13045a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f13045a = new b(context);
            }
            bVar = cVar.f13045a;
        }
        return bVar;
    }
}
