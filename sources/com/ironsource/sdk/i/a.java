package com.ironsource.sdk.i;

import android.app.Activity;
import android.content.Context;
import com.ironsource.sdk.controller.A;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.b;

public final class a {

    /* renamed from: com.ironsource.sdk.i.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0068a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5669a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.g.d.a.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5669a = r0
                r1 = 0
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                int[] r1 = f5669a     // Catch:{ NoSuchFieldError -> 0x0012 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r1 = f5669a     // Catch:{ NoSuchFieldError -> 0x0017 }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.i.a.C0068a.<clinit>():void");
        }
    }

    public static boolean a(Activity activity) {
        int parseInt = Integer.parseInt(b.a().f5770a.getString("back_button_state", "2"));
        if (C0068a.f5669a[(parseInt == 0 ? d.a.f5629a : parseInt == 1 ? d.a.f5630b : d.a.f5631c) - 1] != 3) {
            return false;
        }
        try {
            A a10 = (A) com.ironsource.sdk.d.b.a((Context) activity).f5543a.f5398a;
            if (a10 != null) {
                a10.b(A.b("nativeNavigationPressed", A.a("action", "back", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
