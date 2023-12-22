package i3;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfu;
import r3.o;

public final class a extends BroadcastReceiver {
    public static Boolean zza;

    public static boolean zzb(Context context) {
        o.h(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }
}
