package h3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import s2.b;
import s2.c;

public interface a extends IInterface {

    /* renamed from: h3.a$a  reason: collision with other inner class name */
    public static abstract class C0095a extends b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f6878a = 0;

        /* renamed from: h3.a$a$a  reason: collision with other inner class name */
        public static class C0096a extends s2.a implements a {
            public C0096a(IBinder iBinder) {
                super(iBinder);
            }

            public final Bundle e(Bundle bundle) {
                Parcelable parcelable;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i10 = c.f11854a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.f11853a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    if (obtain.readInt() == 0) {
                        parcelable = null;
                    } else {
                        parcelable = (Parcelable) creator.createFromParcel(obtain);
                    }
                    return (Bundle) parcelable;
                } catch (RuntimeException e10) {
                    throw e10;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle e(Bundle bundle);
}
