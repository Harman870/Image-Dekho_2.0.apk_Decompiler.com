package i4;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import c6.f;
import i6.h;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import r3.o;
import u3.a;

public final class qf extends AsyncTask {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7624g = new a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a  reason: collision with root package name */
    public final String f7625a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7626b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f7627c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri.Builder f7628d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7629e;

    /* renamed from: f  reason: collision with root package name */
    public final f f7630f;

    public qf(String str, String str2, Intent intent, f fVar, rf rfVar) {
        o.e(str);
        this.f7625a = str;
        this.f7630f = fVar;
        o.e(str2);
        o.h(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        o.e(stringExtra);
        Uri.Builder buildUpon = Uri.parse(rfVar.d(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        o.h(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f7626b = buildUpon.build().toString();
        this.f7627c = new WeakReference(rfVar);
        this.f7628d = rfVar.a(intent, str, str2);
        this.f7629e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    public static byte[] b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* renamed from: a */
    public final void onPostExecute(pf pfVar) {
        String str;
        Uri.Builder builder;
        rf rfVar = (rf) this.f7627c.get();
        String str2 = null;
        if (pfVar != null) {
            str2 = pfVar.f7596a;
            str = pfVar.f7597b;
        } else {
            str = null;
        }
        if (rfVar == null) {
            f7624g.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f7628d) == null) {
            rfVar.f(h.a(str));
        } else {
            builder.authority(str2);
            rfVar.g(this.f7625a, this.f7628d.build());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0085, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = f7624g;
        android.util.Log.w(r3.f12198a, r3.d("Error parsing error message from response body in getErrorMessageFromBody. ".concat(r1.toString()), new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0100, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0101, code lost:
        f7624g.c("ConversionException encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0117, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        f7624g.c("Null pointer encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e1 A[Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0100 A[ExcHandler: bf (r1v8 'e' i4.bf A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117 A[ExcHandler: NullPointerException (r1v4 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0017] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            java.lang.String r9 = r8.f7629e
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r0 = 0
            if (r9 != 0) goto L_0x0016
            java.lang.String r9 = r8.f7629e
            i4.pf r0 = new i4.pf
            r0.<init>()
            r0.f7596a = r9
            goto L_0x0144
        L_0x0016:
            r9 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r2 = r8.f7626b     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.ref.WeakReference r2 = r8.f7627c     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            i4.rf r2 = (i4.rf) r2     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.net.HttpURLConnection r1 = r2.i(r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            i4.ag r3 = new i4.ag     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            android.content.Context r2 = r2.zza()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            c6.f r4 = r8.f7630f     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            i4.yf r5 = i4.yf.c()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            int r5 = r5.f7828a     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r7[r9] = r5     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r5 = "X%s"
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3.a(r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x00c0
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x009d
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x009e
        L_0x0073:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            byte[] r1 = b(r1)     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = i4.vf.a(r3, r1)     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0085, NullPointerException -> 0x0117, bf -> 0x0100 }
            goto L_0x009e
        L_0x0085:
            r1 = move-exception
            u3.a r3 = f7624g     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r1 = r4.concat(r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r5 = r3.f12198a     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r1 = r3.d(r1, r4)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            android.util.Log.w(r5, r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
        L_0x009d:
            r1 = r0
        L_0x009e:
            u3.a r3 = f7624g     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r4[r9] = r1     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r4[r6] = r2     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3.c(r2, r4)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            i4.pf r2 = new i4.pf     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r2.<init>()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r2.f7597b = r1     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r0 = r2
            goto L_0x0144
        L_0x00c0:
            i4.vg r2 = new i4.vg     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r2.<init>()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            byte[] r1 = b(r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r2.a(r3)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.util.ArrayList r1 = r2.f7748a     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
        L_0x00db:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            if (r3 != 0) goto L_0x00f7
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            if (r3 == 0) goto L_0x00db
        L_0x00f7:
            i4.pf r1 = new i4.pf     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r1.<init>()     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r1.f7596a = r2     // Catch:{ IOException -> 0x012e, NullPointerException -> 0x0117, bf -> 0x0100 }
            r0 = r1
            goto L_0x0144
        L_0x0100:
            r1 = move-exception
            u3.a r2 = f7624g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2.c(r1, r9)
            goto L_0x0144
        L_0x0117:
            r1 = move-exception
            u3.a r2 = f7624g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2.c(r1, r9)
            goto L_0x0144
        L_0x012e:
            r1 = move-exception
            u3.a r2 = f7624g
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r2.c(r1, r9)
        L_0x0144:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.qf.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* synthetic */ void onCancelled(Object obj) {
        pf pfVar = (pf) obj;
        onPostExecute((pf) null);
    }
}
