package androidx.activity.result;

import androidx.activity.f;
import b.a;

public final class e extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f294b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f295c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f296d;

    public e(f fVar, String str, a aVar) {
        this.f296d = fVar;
        this.f294b = str;
        this.f295c = aVar;
    }

    public final void A(Object obj) {
        Integer num = (Integer) this.f296d.f299c.get(this.f294b);
        if (num != null) {
            this.f296d.f301e.add(this.f294b);
            try {
                this.f296d.b(num.intValue(), this.f295c, obj);
            } catch (Exception e10) {
                this.f296d.f301e.remove(this.f294b);
                throw e10;
            }
        } else {
            StringBuilder g10 = f.g("Attempting to launch an unregistered ActivityResultLauncher with contract ");
            g10.append(this.f295c);
            g10.append(" and input ");
            g10.append(obj);
            g10.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
            throw new IllegalStateException(g10.toString());
        }
    }
}
