package z3;

import android.os.IBinder;
import android.os.IInterface;

public interface a extends IInterface {

    /* renamed from: z3.a$a  reason: collision with other inner class name */
    public static abstract class C0177a extends c4.a implements a {
        public C0177a() {
            super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        }

        public static a E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
