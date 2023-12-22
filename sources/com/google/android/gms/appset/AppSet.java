package com.google.android.gms.appset;

import android.content.Context;
import c4.l;

public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        return new l(context);
    }
}
