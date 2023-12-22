package c4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.b;

public abstract class d extends a {
    public d() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback", 0);
    }

    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        Parcelable parcelable;
        Parcelable parcelable2;
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i12 = b.f2443a;
        AppSetIdInfo appSetIdInfo = null;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = creator.createFromParcel(parcel);
        }
        Status status = (Status) parcelable;
        Parcelable.Creator<zzc> creator2 = zzc.CREATOR;
        if (parcel.readInt() == 0) {
            parcelable2 = null;
        } else {
            parcelable2 = creator2.createFromParcel(parcel);
        }
        zzc zzc = (zzc) parcelable2;
        j jVar = (j) this;
        if (zzc != null) {
            appSetIdInfo = new AppSetIdInfo(zzc.zzb(), zzc.zza());
        }
        TaskCompletionSource taskCompletionSource = jVar.f2453b;
        if (status.x()) {
            taskCompletionSource.setResult(appSetIdInfo);
        } else {
            taskCompletionSource.setException(new b(status));
        }
        return true;
    }
}
