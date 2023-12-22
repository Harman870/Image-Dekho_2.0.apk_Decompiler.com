package q3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p3.h;

public final class k extends BasePendingResult<Status> {
    public k(a0 a0Var) {
        super(a0Var);
    }

    public final /* bridge */ /* synthetic */ h createFailedResult(Status status) {
        return status;
    }
}
