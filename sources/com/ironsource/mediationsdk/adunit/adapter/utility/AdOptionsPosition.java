package com.ironsource.mediationsdk.adunit.adapter.utility;

import x8.d;

public enum AdOptionsPosition {
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT;
    
    public static String AD_OPTIONS_POSITION_KEY;
    public static final Companion Companion = null;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((d) null);
        AD_OPTIONS_POSITION_KEY = "adOptionsPos";
    }
}
