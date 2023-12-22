package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import d0.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class EmojiCompatInitializer implements e1.b<Boolean> {

    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f1356b = 1;
        }
    }

    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1337a;

        public b(Context context) {
            this.f1337a = context.getApplicationContext();
        }

        public final void a(f.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(this, hVar, threadPoolExecutor, 0));
        }
    }

    public static class c implements Runnable {
        public final void run() {
            boolean z9;
            try {
                int i10 = i.f6035a;
                i.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f1343j != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    f.a().c();
                }
                i.a.b();
            } catch (Throwable th) {
                int i11 = i.f6035a;
                i.a.b();
                throw th;
            }
        }
    }

    public final List<Class<? extends e1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public final Boolean b(Context context) {
        Object obj;
        a aVar = new a(context);
        if (f.f1343j == null) {
            synchronized (f.f1342i) {
                if (f.f1343j == null) {
                    f.f1343j = new f(aVar);
                }
            }
        }
        e1.a c10 = e1.a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c10.getClass();
        synchronized (e1.a.f6165e) {
            try {
                obj = c10.f6166a.get(cls);
                if (obj == null) {
                    obj = c10.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final m r4 = ((l) obj).r();
        r4.a(new androidx.lifecycle.b() {
            public final void onResume() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500);
                r4.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
