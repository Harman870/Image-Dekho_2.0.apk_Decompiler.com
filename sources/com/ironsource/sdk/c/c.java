package com.ironsource.sdk.c;

import android.webkit.JavascriptInterface;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public d f5157a;

    public c(d dVar) {
        this.f5157a = dVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f5157a.handleMessageFromAd(str);
    }
}
