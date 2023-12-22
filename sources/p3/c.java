package p3;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.t;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import o3.e;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p3.a;
import p3.a.c;
import q3.a0;
import q3.d;
import q3.d0;
import q3.f;
import q3.f0;
import q3.l0;
import q3.o;
import q3.p0;
import q3.r;
import q3.w;
import r3.b;
import r3.p;
import r3.q;

public abstract class c<O extends a.c> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10661a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10662b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f10663c;

    /* renamed from: d  reason: collision with root package name */
    public final O f10664d;

    /* renamed from: e  reason: collision with root package name */
    public final q3.a<O> f10665e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f10666f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10667g;
    @NotOnlyInitialized

    /* renamed from: h  reason: collision with root package name */
    public final a0 f10668h;

    /* renamed from: i  reason: collision with root package name */
    public final t f10669i;

    /* renamed from: j  reason: collision with root package name */
    public final d f10670j;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10671c = new a(new t(), Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final t f10672a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f10673b;

        public a(t tVar, Looper looper) {
            this.f10672a = tVar;
            this.f10673b = looper;
        }
    }

    public c() {
        throw null;
    }

    public c(Context context, Activity activity, a<O> aVar, O o10, a aVar2) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        } else if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        } else if (aVar2 != null) {
            this.f10661a = context.getApplicationContext();
            String str = null;
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            this.f10662b = str;
            this.f10663c = aVar;
            this.f10664d = o10;
            this.f10666f = aVar2.f10673b;
            q3.a<O> aVar3 = new q3.a<>(aVar, o10, str);
            this.f10665e = aVar3;
            this.f10668h = new a0(this);
            d f10 = d.f(this.f10661a);
            this.f10670j = f10;
            this.f10667g = f10.f11219h.getAndIncrement();
            this.f10669i = aVar2.f10672a;
            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                f fragment = LifecycleCallback.getFragment(activity);
                o oVar = (o) fragment.d(o.class, "ConnectionlessLifecycleHelper");
                if (oVar == null) {
                    Object obj = e.f10552c;
                    oVar = new o(fragment, f10);
                }
                oVar.f11264e.add(aVar3);
                f10.a(oVar);
            }
            f4.f fVar = f10.f11224n;
            fVar.sendMessage(fVar.obtainMessage(7, this));
        } else {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
    }

    public c(Context context, a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, aVar, o10, aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final r3.c.a a() {
        /*
            r4 = this;
            r3.c$a r0 = new r3.c$a
            r0.<init>()
            O r1 = r4.f10664d
            boolean r2 = r1 instanceof p3.a.c.b
            if (r2 == 0) goto L_0x0020
            p3.a$c$b r1 = (p3.a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.r()
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.f2769d
            if (r1 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            goto L_0x002e
        L_0x0020:
            O r1 = r4.f10664d
            boolean r2 = r1 instanceof p3.a.c.C0126a
            if (r2 == 0) goto L_0x002d
            p3.a$c$a r1 = (p3.a.c.C0126a) r1
            android.accounts.Account r2 = r1.g()
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r0.f11535a = r2
            O r1 = r4.f10664d
            boolean r2 = r1 instanceof p3.a.c.b
            if (r2 == 0) goto L_0x0044
            p3.a$c$b r1 = (p3.a.c.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.r()
            if (r1 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            java.util.HashSet r1 = r1.x()
            goto L_0x0048
        L_0x0044:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0048:
            m.d<com.google.android.gms.common.api.Scope> r2 = r0.f11536b
            if (r2 != 0) goto L_0x0053
            m.d r2 = new m.d
            r2.<init>()
            r0.f11536b = r2
        L_0x0053:
            m.d<com.google.android.gms.common.api.Scope> r2 = r0.f11536b
            r2.addAll(r1)
            android.content.Context r1 = r4.f10661a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.f11538d = r1
            android.content.Context r1 = r4.f10661a
            java.lang.String r1 = r1.getPackageName()
            r0.f11537c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.a():r3.c$a");
    }

    public final Task b(int i10, l0 l0Var) {
        long j10;
        boolean z9;
        l0 l0Var2 = l0Var;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = this.f10670j;
        t tVar = this.f10669i;
        dVar.getClass();
        int i11 = l0Var2.f11253c;
        if (i11 != 0) {
            q3.a<O> aVar = this.f10665e;
            d0 d0Var = null;
            if (dVar.b()) {
                q qVar = p.a().f11619a;
                boolean z10 = true;
                if (qVar != null) {
                    if (qVar.f11624b) {
                        boolean z11 = qVar.f11625c;
                        w wVar = (w) dVar.f11221j.get(aVar);
                        if (wVar != null) {
                            a.e eVar = wVar.f11287b;
                            if (eVar instanceof b) {
                                b bVar = (b) eVar;
                                if (bVar.f11519v != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9 && !bVar.h()) {
                                    r3.d a10 = d0.a(wVar, bVar, i11);
                                    if (a10 != null) {
                                        wVar.f11296l++;
                                        z10 = a10.f11548c;
                                    }
                                }
                            }
                        }
                        z10 = z11;
                    }
                }
                long j11 = 0;
                if (z10) {
                    j10 = System.currentTimeMillis();
                } else {
                    j10 = 0;
                }
                if (z10) {
                    j11 = SystemClock.elapsedRealtime();
                }
                d0Var = new d0(dVar, i11, aVar, j10, j11);
            }
            if (d0Var != null) {
                Task task = taskCompletionSource.getTask();
                f4.f fVar = dVar.f11224n;
                fVar.getClass();
                task.addOnCompleteListener((Executor) new r(fVar), d0Var);
            }
        }
        p0 p0Var = new p0(i10, l0Var2, taskCompletionSource, tVar);
        f4.f fVar2 = dVar.f11224n;
        fVar2.sendMessage(fVar2.obtainMessage(4, new f0(p0Var, dVar.f11220i.get(), this)));
        return taskCompletionSource.getTask();
    }
}
