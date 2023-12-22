package u2;

import a3.a;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.tasks.OnFailureListener;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.integration.IntegrationHelper;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.wallpapersindia.app.LoginScreen;
import d3.x;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p6.e;
import p6.f;
import u2.d;
import v2.j;
import v2.n;

public final /* synthetic */ class b implements x.a, OnFailureListener, InitializationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12183a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12184b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f12183a = i10;
        this.f12184b = obj;
    }

    public final Object apply(Object obj) {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        InputStream inputStream;
        Throwable th3;
        switch (this.f12183a) {
            case 0:
                d dVar = (d) this.f12184b;
                d.a aVar = (d.a) obj;
                dVar.getClass();
                URL url = aVar.f12192a;
                String c10 = a.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Making request to: %s", new Object[]{url}));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f12192a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f12191g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.8"}));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = aVar.f12194c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(outputStream);
                        p6.d dVar2 = dVar.f12185a;
                        j jVar = aVar.f12193b;
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                        e eVar = dVar2.f10687a;
                        f fVar = new f(bufferedWriter, eVar.f10692a, eVar.f10693b, eVar.f10694c, eVar.f10695d);
                        fVar.f(jVar);
                        fVar.h();
                        fVar.f10698b.flush();
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Integer valueOf = Integer.valueOf(responseCode);
                        String c11 = a.c("CctTransportBackend");
                        if (Log.isLoggable(c11, 4)) {
                            Log.i(c11, String.format("Status Code: %d", new Object[]{valueOf}));
                        }
                        a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                        a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            return new d.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                        }
                        if (responseCode != 200) {
                            return new d.b(responseCode, (URL) null, 0);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            d.b bVar = new d.b(responseCode, (URL) null, n.a(new BufferedReader(new InputStreamReader(inputStream))).f12494a);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            return bVar;
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } catch (ConnectException | UnknownHostException e10) {
                    a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
                    return new d.b(500, (URL) null, 0);
                } catch (IOException | n6.b e11) {
                    a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
                    return new d.b(400, (URL) null, 0);
                } catch (Throwable th8) {
                    th.addSuppressed(th8);
                }
                break;
            default:
                x xVar = (x) this.f12184b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                t2.b bVar2 = x.f6090f;
                xVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + xVar.f6092b.a()).execute();
                return null;
        }
        throw th2;
        throw th3;
    }

    public final void onFailure(Exception exc) {
        LoginScreen loginScreen = (LoginScreen) this.f12184b;
        int i10 = LoginScreen.K;
        loginScreen.getClass();
        Toast.makeText(loginScreen, "Please Retry", 0).show();
    }

    public final void onInitializationComplete() {
        IntegrationHelper.validateIntegration((Activity) this.f12184b);
        IronSource.loadInterstitial();
        IronSource.loadRewardedVideo();
    }
}
