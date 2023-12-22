package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import j2.c;
import j2.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o1.e;
import u1.f;

public final class j implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final f f2601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2602b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f2603c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f2604d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f2605e;

    public static class a {
    }

    static {
        new a();
    }

    public j(f fVar, int i10) {
        this.f2601a = fVar;
        this.f2602b = i10;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f2604d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2603c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2603c = null;
    }

    public final void cancel() {
        this.f2605e = true;
    }

    public final InputStream d(URL url, int i10, URL url2, Map<String, String> map) {
        boolean z9;
        InputStream inputStream;
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e(-1, "In re-direct loop", (IOException) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z10 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f2602b);
                httpURLConnection.setReadTimeout(this.f2602b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f2603c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f2604d = this.f2603c.getInputStream();
                    if (this.f2605e) {
                        return null;
                    }
                    int c10 = c(this.f2603c);
                    int i11 = c10 / 100;
                    if (i11 == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        HttpURLConnection httpURLConnection2 = this.f2603c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.f2604d = inputStream;
                            return inputStream;
                        } catch (IOException e10) {
                            throw new e(c(httpURLConnection2), "Failed to obtain InputStream", e10);
                        }
                    } else {
                        if (i11 == 3) {
                            z10 = true;
                        }
                        if (z10) {
                            String headerField = this.f2603c.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return d(url3, i10 + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new e(c10, com.ironsource.adapters.ironsource.a.g("Bad redirect url: ", headerField), e11);
                                }
                            } else {
                                throw new e(c10, "Received empty or null redirect url", (IOException) null);
                            }
                        } else if (c10 == -1) {
                            throw new e(c10, "Http request failed", (IOException) null);
                        } else {
                            try {
                                throw new e(c10, this.f2603c.getResponseMessage(), (IOException) null);
                            } catch (IOException e12) {
                                throw new e(c10, "Failed to get a response message", e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    throw new e(c(this.f2603c), "Failed to connect or obtain data", e13);
                }
            } catch (IOException e14) {
                throw new e(0, "URL.openConnection threw", e14);
            }
        } else {
            throw new e(-1, "Too many (> 5) redirects!", (IOException) null);
        }
    }

    public final o1.a e() {
        return o1.a.REMOTE;
    }

    public final void f(com.bumptech.glide.j jVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i10 = h.f8019b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(d(this.f2601a.d(), 0, (URL) null, this.f2601a.f12112b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder g10 = androidx.activity.f.g("Finished http url fetcher fetch in ");
                g10.append(h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", g10.toString());
            }
            throw th;
        }
    }
}
