package androidx.activity.result;

import androidx.activity.f;
import b.a;
import b.c;

public final class d extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f291b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f292c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f293d;

    public d(f fVar, String str, c cVar) {
        this.f293d = fVar;
        this.f291b = str;
        this.f292c = cVar;
    }

    public final void A(Object obj) {
        Integer num = (Integer) this.f293d.f299c.get(this.f291b);
        if (num != null) {
            this.f293d.f301e.add(this.f291b);
            try {
                this.f293d.b(num.intValue(), this.f292c, obj);
            } catch (Exception e10) {
                this.f293d.f301e.remove(this.f291b);
                throw e10;
            }
        } else {
            StringBuilder g10 = f.g("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            g10.append(this.f292c);
            g10.append(" and input ");
            g10.append(obj);
            g10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(g10.toString());
        }
    }
}
