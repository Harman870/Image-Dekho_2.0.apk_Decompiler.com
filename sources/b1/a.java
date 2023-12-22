package b1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2193e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static a f2194f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2195a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f2196b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f2197c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f2198d = new ArrayList<>();

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    public class C0018a extends Handler {
        public C0018a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            int size;
            b[] bVarArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            a aVar = a.this;
            do {
                synchronized (aVar.f2196b) {
                    size = aVar.f2198d.size();
                    if (size > 0) {
                        bVarArr = new b[size];
                        aVar.f2198d.toArray(bVarArr);
                        aVar.f2198d.clear();
                    } else {
                        return;
                    }
                }
            } while (size <= 0);
            b bVar = bVarArr[0];
            throw null;
        }
    }

    public static final class b {
    }

    public static final class c {
        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append((Object) null);
            sb.append(" filter=");
            sb.append((Object) null);
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f2195a = context;
        new C0018a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f2193e) {
            if (f2194f == null) {
                f2194f = new a(context.getApplicationContext());
            }
            aVar = f2194f;
        }
        return aVar;
    }

    public final void b(Intent intent) {
        synchronized (this.f2196b) {
            intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2195a.getContentResolver());
            intent.getData();
            String scheme = intent.getScheme();
            intent.getCategories();
            boolean z9 = (intent.getFlags() & 8) != 0;
            if (z9) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList arrayList = this.f2197c.get(intent.getAction());
            if (arrayList != null) {
                if (z9) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                }
                if (arrayList.size() > 0) {
                    c cVar = (c) arrayList.get(0);
                    if (z9) {
                        cVar.getClass();
                        Log.v("LocalBroadcastManager", "Matching against filter null");
                    }
                    cVar.getClass();
                    throw null;
                }
            }
        }
    }
}
