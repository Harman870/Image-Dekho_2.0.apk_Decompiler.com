package com.ironsource.a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.d.b;
import com.ironsource.d.c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public c f3644a;

    /* renamed from: b  reason: collision with root package name */
    public a f3645b;

    /* renamed from: c  reason: collision with root package name */
    public d f3646c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f3647d;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ String f3648a;

        public a(String str) {
            this.f3648a = str;
        }

        public final void run() {
            try {
                c cVar = new c();
                ArrayList arrayList = new ArrayList(b.this.f3645b.f3637f);
                if ("POST".equals(b.this.f3645b.f3634c)) {
                    cVar = com.ironsource.d.b.a(b.this.f3645b.f3632a, this.f3648a, arrayList);
                } else if ("GET".equals(b.this.f3645b.f3634c)) {
                    String str = b.this.f3645b.f3632a;
                    String str2 = this.f3648a;
                    Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                    b.a.C0039a aVar = new b.a.C0039a();
                    aVar.f3665b = build.toString();
                    aVar.f3667d = str2;
                    aVar.f3666c = "GET";
                    aVar.a(arrayList);
                    cVar = com.ironsource.d.b.a(aVar.a());
                }
                String str3 = "response status code: " + cVar.f3671a;
                if (b.this.f3645b.f3636e) {
                    Log.d("EventsTracker", str3);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public b(a aVar, c cVar) {
        if (aVar != null) {
            d dVar = aVar.f3635d;
            if (dVar != null) {
                this.f3645b = aVar;
                this.f3644a = cVar;
                this.f3646c = dVar;
                this.f3647d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            java.lang.String r2 = r6.toString()
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "%s %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            com.ironsource.a.a r1 = r4.f3645b
            boolean r1 = r1.f3636e
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = "EventsTracker"
            android.util.Log.d(r1, r0)
        L_0x0020:
            com.ironsource.a.a r0 = r4.f3645b
            boolean r0 = r0.f3633b
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x002e
            return
        L_0x002e:
            java.lang.String r0 = "eventname"
            java.util.HashMap r5 = androidx.fragment.app.v0.c(r0, r5)
            com.ironsource.a.c r0 = r4.f3644a
            java.util.Map r0 = r0.a()
            r5.putAll(r0)     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r5.putAll(r6)     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            com.ironsource.a.d r6 = r4.f3646c
            java.lang.String r5 = r6.a(r5)
            java.util.concurrent.ExecutorService r6 = r4.f3647d
            com.ironsource.a.b$a r0 = new com.ironsource.a.b$a
            r0.<init>(r5)
            r6.submit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.a.b.a(java.lang.String, java.util.Map):void");
    }
}
