package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

@Deprecated
public interface OfferwallListener {
    @Deprecated
    void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    @Deprecated
    boolean onOfferwallAdCredited(int i10, int i11, boolean z9);

    @Deprecated
    void onOfferwallAvailable(boolean z9);

    @Deprecated
    void onOfferwallClosed();

    @Deprecated
    void onOfferwallOpened();

    @Deprecated
    void onOfferwallShowFailed(IronSourceError ironSourceError);
}
