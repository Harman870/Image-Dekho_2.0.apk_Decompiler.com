package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f3620a;

    /* renamed from: b  reason: collision with root package name */
    public final C0036b f3621b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.async.b$b  reason: collision with other inner class name */
    public interface C0036b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(C0036b bVar) {
        this.f3621b = bVar;
    }

    public void a(a aVar) {
        this.f3620a = aVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f3620a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
