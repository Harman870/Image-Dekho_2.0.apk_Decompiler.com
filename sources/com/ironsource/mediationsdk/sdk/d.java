package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

public interface d extends OfferwallListener {
    void a(boolean z9, IronSourceError ironSourceError);

    @Deprecated
    /* synthetic */ void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    @Deprecated
    /* synthetic */ boolean onOfferwallAdCredited(int i10, int i11, boolean z9);

    @Deprecated
    /* synthetic */ void onOfferwallAvailable(boolean z9);

    @Deprecated
    /* synthetic */ void onOfferwallClosed();

    @Deprecated
    /* synthetic */ void onOfferwallOpened();

    @Deprecated
    /* synthetic */ void onOfferwallShowFailed(IronSourceError ironSourceError);
}
