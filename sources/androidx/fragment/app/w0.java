package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e;
import com.google.firebase.datatransport.TransportRegistrar;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import j6.d;
import j6.w;

public final /* synthetic */ class w0 implements d {
    public static final void a(int i10, View view) {
        int i11;
        if (i10 != 0) {
            int i12 = i10 - 1;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i11 = 0;
                } else if (i12 == 2) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i11 = 8;
                } else if (i12 == 3) {
                    if (y.I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    i11 = 4;
                } else {
                    return;
                }
                view.setVisibility(i11);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (y.I(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        throw null;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 4) {
            return 4;
        }
        if (i10 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(e.a("Unknown visibility ", i10));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void e(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static void f(StringBuilder sb, String str, IronLog ironLog) {
        sb.append(str);
        ironLog.verbose(sb.toString());
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 == 1) {
            return "RV_STATE_INITIATING";
        }
        if (i10 == 2) {
            return "RV_STATE_AUCTION_IN_PROGRESS";
        }
        if (i10 == 3) {
            return "RV_STATE_NOT_LOADED";
        }
        if (i10 == 4) {
            return "RV_STATE_LOADING_SMASHES";
        }
        if (i10 == 5) {
            return "RV_STATE_READY_TO_SHOW";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i10) {
        return i10 == 1 ? "REMOVED" : i10 == 2 ? "VISIBLE" : i10 == 3 ? "GONE" : i10 == 4 ? "INVISIBLE" : "null";
    }

    public static /* synthetic */ String j(int i10) {
        return i10 == 1 ? "IDLE" : i10 == 2 ? "QUEUING" : i10 == 3 ? "QUEUED" : i10 == 4 ? "RUNNING" : "null";
    }

    public static /* synthetic */ String k(int i10) {
        return i10 == 1 ? "INITIALIZE" : i10 == 2 ? "RESOURCE_CACHE" : i10 == 3 ? "DATA_CACHE" : i10 == 4 ? "SOURCE" : i10 == 5 ? "ENCODE" : i10 == 6 ? "FINISHED" : "null";
    }

    public static /* synthetic */ String l(int i10) {
        return i10 == 1 ? "RV_STATE_INITIATING" : i10 == 2 ? "RV_STATE_AUCTION_IN_PROGRESS" : i10 == 3 ? "RV_STATE_NOT_LOADED" : i10 == 4 ? "RV_STATE_LOADING_SMASHES" : i10 == 5 ? "RV_STATE_READY_TO_SHOW" : "null";
    }

    public static /* synthetic */ String m(int i10) {
        return i10 == 1 ? "ATTEMPT_MIGRATION" : i10 == 2 ? "NOT_GENERATED" : i10 == 3 ? "UNREGISTERED" : i10 == 4 ? "REGISTERED" : i10 == 5 ? "REGISTER_ERROR" : "null";
    }

    public static /* synthetic */ String n(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : i10 == 3 ? "AUTH_ERROR" : "null";
    }

    public Object h(w wVar) {
        return TransportRegistrar.lambda$getComponents$0(wVar);
    }
}
