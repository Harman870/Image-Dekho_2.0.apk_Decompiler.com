package p3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p3.h;

public final class k<R extends h> extends BasePendingResult<R> {

    /* renamed from: a  reason: collision with root package name */
    public final R f10676a;

    public k(Status status) {
        super((d) null);
        this.f10676a = status;
    }

    public final R createFailedResult(Status status) {
        return this.f10676a;
    }
}
