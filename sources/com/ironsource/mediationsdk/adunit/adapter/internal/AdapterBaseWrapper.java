package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

public class AdapterBaseWrapper {

    /* renamed from: a  reason: collision with root package name */
    public AdapterBaseInterface f4121a;

    /* renamed from: b  reason: collision with root package name */
    public NetworkSettings f4122b;

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.f4121a = adapterBaseInterface;
        this.f4122b = networkSettings;
    }

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.f4121a;
    }

    public NetworkSettings getSettings() {
        return this.f4122b;
    }
}
