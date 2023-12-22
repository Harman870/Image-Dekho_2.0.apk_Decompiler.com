package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.sdk.utils.Logger;

public class InterstitialActivity extends ControllerActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("InterstitialActivity", "onCreate");
    }

    public final void onPause() {
        super.onPause();
        Logger.i("InterstitialActivity", "onPause");
    }

    public final void onResume() {
        super.onResume();
        Logger.i("InterstitialActivity", "onResume");
    }
}
