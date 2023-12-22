package com.ironsource.mediationsdk.model;

import x8.d;
import x8.f;

public abstract class BasePlacement {

    /* renamed from: a  reason: collision with root package name */
    public final int f4682a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4683b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4684c;

    /* renamed from: d  reason: collision with root package name */
    public final m f4685d;

    public BasePlacement(int i10, String str, boolean z9, m mVar) {
        f.f(str, "placementName");
        this.f4682a = i10;
        this.f4683b = str;
        this.f4684c = z9;
        this.f4685d = mVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasePlacement(int i10, String str, boolean z9, m mVar, int i11, d dVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z9, (i11 & 8) != 0 ? null : mVar);
    }

    public final m getPlacementAvailabilitySettings() {
        return this.f4685d;
    }

    public final int getPlacementId() {
        return this.f4682a;
    }

    public final String getPlacementName() {
        return this.f4683b;
    }

    public final boolean isDefault() {
        return this.f4684c;
    }

    public final boolean isPlacementId(int i10) {
        return this.f4682a == i10;
    }

    public String toString() {
        return "placement name: " + this.f4683b;
    }
}
