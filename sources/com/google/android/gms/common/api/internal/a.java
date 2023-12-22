package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import p3.a;
import p3.h;
import q3.a0;
import r3.o;

public abstract class a<R extends h, A> extends BasePendingResult<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(p3.a aVar, a0 a0Var) {
        super(a0Var);
        if (a0Var != null) {
            if (aVar == null) {
                throw new NullPointerException("Api must not be null");
            }
            return;
        }
        throw new NullPointerException("GoogleApiClient must not be null");
    }

    public abstract void a(a.e eVar);

    public final void b(Status status) {
        o.a("Failed result must not be success", !status.x());
        setResult(createFailedResult(status));
    }
}
