package com.google.android.gms.internal.gtm;

import androidx.activity.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class zzqc implements zzqd {
    private HttpURLConnection zza;
    private InputStream zzb = null;

    public final InputStream zza(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.zza = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.zzb = inputStream;
            return inputStream;
        }
        String a10 = e.a("Bad response: ", responseCode);
        if (responseCode == 404) {
            throw new FileNotFoundException(a10);
        } else if (responseCode == 503) {
            throw new zzqh(a10);
        } else {
            throw new IOException(a10);
        }
    }

    public final void zzb() {
        HttpURLConnection httpURLConnection = this.zza;
        try {
            InputStream inputStream = this.zzb;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e10) {
            zzho.zzb("HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(String.valueOf(e10.getMessage())), e10);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
