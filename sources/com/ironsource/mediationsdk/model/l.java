package com.ironsource.mediationsdk.model;

import x8.f;

public final class l extends BasePlacement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(int i10, String str, boolean z9) {
        super(i10, str, z9, (m) null);
        f.f(str, "placementName");
    }

    public final String toString() {
        return super.toString() + ", placement id: " + getPlacementId();
    }
}
