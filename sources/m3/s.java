package m3;

import android.content.Context;
import android.os.Binder;
import w3.j;

public final class s extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Context f9370b;

    public s(Context context) {
        this.f9370b = context;
    }

    public final void E() {
        if (!j.a(this.f9370b, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }
}
