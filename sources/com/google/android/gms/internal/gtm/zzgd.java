package com.google.android.gms.internal.gtm;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import o3.g;

final class zzgd implements zzgf {
    public final /* synthetic */ zzgg zza;

    public zzgd(zzgg zzgg) {
        this.zza = zzgg;
    }

    public final AdvertisingIdClient.Info zza() {
        String str;
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.zza.zzj);
        } catch (IllegalStateException e10) {
            e = e10;
            str = "IllegalStateException getting Advertising Id Info";
            zzho.zzf(str, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            str = "IOException getting Ad Id Info";
            zzho.zzf(str, e);
            return null;
        } catch (g e12) {
            e = e12;
            this.zza.zze = false;
            str = "GooglePlayServicesNotAvailableException getting Advertising Id Info";
            zzho.zzf(str, e);
            return null;
        } catch (Exception e13) {
            e = e13;
            str = "Unknown exception. Could not get the Advertising Id Info.";
            zzho.zzf(str, e);
            return null;
        }
    }
}
