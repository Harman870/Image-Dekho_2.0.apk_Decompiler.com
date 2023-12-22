package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import x8.f;

public final class Placement extends BasePlacement {

    /* renamed from: e  reason: collision with root package name */
    public String f4701e;

    /* renamed from: f  reason: collision with root package name */
    public int f4702f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Placement(int i10, String str, boolean z9, String str2, int i11, m mVar) {
        super(i10, str, z9, mVar);
        f.f(str, "placementName");
        f.f(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f4702f = i11;
        this.f4701e = str2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Placement(BasePlacement basePlacement) {
        super(basePlacement.getPlacementId(), basePlacement.getPlacementName(), basePlacement.isDefault(), basePlacement.getPlacementAvailabilitySettings());
        f.f(basePlacement, "placement");
        this.f4701e = "";
    }

    public final int getRewardAmount() {
        return this.f4702f;
    }

    public final String getRewardName() {
        return this.f4701e;
    }

    public final String toString() {
        return super.toString() + ", reward name: " + this.f4701e + " , amount: " + this.f4702f;
    }
}
