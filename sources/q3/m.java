package q3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.a;
import p3.e;

public final class m implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11259a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f11260b;

    public m(n nVar, a aVar) {
        this.f11260b = nVar;
        this.f11259a = aVar;
    }

    public final void a(Status status) {
        this.f11260b.f11262a.remove(this.f11259a);
    }
}
