package f4;

import android.os.IBinder;
import android.os.IInterface;

public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6379a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6380b;

    public a(IBinder iBinder, String str) {
        this.f6379a = iBinder;
        this.f6380b = str;
    }

    public final IBinder asBinder() {
        return this.f6379a;
    }
}
