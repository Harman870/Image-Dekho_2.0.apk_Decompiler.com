package com.ironsource.mediationsdk.model;

import x8.f;

public class e extends BasePlacement {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i10, String str, boolean z9, m mVar) {
        super(i10, str, z9, mVar);
        f.f(str, "placementName");
    }

    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
