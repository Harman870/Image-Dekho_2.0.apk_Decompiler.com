package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.C0180c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.model.NetworkSettings;

public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    /* renamed from: a  reason: collision with root package name */
    public final IronSource.AD_UNIT f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkSettings f4124b;

    public BaseAdAdapter(IronSource.AD_UNIT ad_unit, NetworkSettings networkSettings) {
        this.f4123a = ad_unit;
        this.f4124b = networkSettings;
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter a10 = C0180c.a().a(this.f4124b, this.f4123a);
        if (a10 != null) {
            return a10;
        }
        return null;
    }

    public void releaseMemory() {
    }
}
