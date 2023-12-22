package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.f;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import com.bumptech.glide.i;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.n;
import d2.e;
import j2.l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q1.m;
import r1.d;
import r1.j;
import s1.g;
import s1.h;
import s1.i;
import t1.a;

public final class b implements ComponentCallbacks2 {

    /* renamed from: h  reason: collision with root package name */
    public static volatile b f2544h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile boolean f2545i;

    /* renamed from: a  reason: collision with root package name */
    public final d f2546a;

    /* renamed from: b  reason: collision with root package name */
    public final h f2547b;

    /* renamed from: c  reason: collision with root package name */
    public final h f2548c;

    /* renamed from: d  reason: collision with root package name */
    public final r1.b f2549d;

    /* renamed from: e  reason: collision with root package name */
    public final n f2550e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2551f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2552g = new ArrayList();

    public interface a {
    }

    public b(Context context, m mVar, h hVar, d dVar, r1.b bVar, n nVar, c cVar, int i10, c cVar2, m.b bVar2, List list, ArrayList arrayList, d2.a aVar, i iVar) {
        this.f2546a = dVar;
        r1.b bVar3 = bVar;
        this.f2549d = bVar3;
        this.f2547b = hVar;
        this.f2550e = nVar;
        this.f2551f = cVar;
        this.f2548c = new h(context, bVar3, new l(this, arrayList, aVar), new z5.c(), cVar2, bVar2, list, mVar, iVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i10;
        ArrayList arrayList;
        d dVar;
        if (!f2545i) {
            f2545i = true;
            m.b bVar = new m.b();
            i.a aVar = new i.a();
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList2.add(e.a(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        d2.c cVar2 = (d2.c) it.next();
                        if (hashSet.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        StringBuilder g10 = f.g("Discovered GlideModule from manifest: ");
                        g10.append(((d2.c) it2.next()).getClass());
                        Log.d("Glide", g10.toString());
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((d2.c) it3.next()).a();
                }
                a.C0144a aVar2 = new a.C0144a();
                if (t1.a.f11975c == 0) {
                    t1.a.f11975c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i11 = t1.a.f11975c;
                if (!TextUtils.isEmpty("source")) {
                    t1.a aVar3 = new t1.a(new ThreadPoolExecutor(i11, i11, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar2, "source", false)));
                    int i12 = t1.a.f11975c;
                    a.C0144a aVar4 = new a.C0144a();
                    if (!TextUtils.isEmpty("disk-cache")) {
                        t1.a aVar5 = new t1.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar4, "disk-cache", true)));
                        if (t1.a.f11975c == 0) {
                            t1.a.f11975c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (t1.a.f11975c >= 4) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        a.C0144a aVar6 = new a.C0144a();
                        if (!TextUtils.isEmpty("animation")) {
                            t1.a aVar7 = new t1.a(new ThreadPoolExecutor(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.b(aVar6, "animation", true)));
                            s1.i iVar = new s1.i(new i.a(applicationContext));
                            com.bumptech.glide.manager.e eVar = new com.bumptech.glide.manager.e();
                            int i13 = iVar.f11840a;
                            if (i13 > 0) {
                                arrayList = arrayList2;
                                dVar = new j((long) i13);
                            } else {
                                arrayList = arrayList2;
                                dVar = new r1.e();
                            }
                            r1.i iVar2 = new r1.i(iVar.f11842c);
                            g gVar = new g((long) iVar.f11841b);
                            m mVar = new m(gVar, new s1.f(applicationContext), aVar5, aVar3, new t1.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, t1.a.f11974b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.b(new a.C0144a(), "source-unlimited", false))), aVar7);
                            List emptyList = Collections.emptyList();
                            i iVar3 = new i(aVar);
                            b bVar2 = r1;
                            b bVar3 = new b(applicationContext, mVar, gVar, dVar, iVar2, new n((n.b) null, iVar3), eVar, 4, cVar, bVar, emptyList, arrayList, generatedAppGlideModule, iVar3);
                            b bVar4 = bVar2;
                            applicationContext.registerComponentCallbacks(bVar4);
                            f2544h = bVar4;
                            f2545i = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (f2544h == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f2544h == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f2544h;
    }

    public static o d(ImageView imageView) {
        Context context = imageView.getContext();
        if (context != null) {
            n nVar = b(context).f2550e;
            nVar.getClass();
            if (!l.i()) {
                if (imageView.getContext() != null) {
                    Activity a10 = n.a(imageView.getContext());
                    if (a10 != null) {
                        if (a10 instanceof p) {
                            p pVar = (p) a10;
                            nVar.f2637g.clear();
                            n.c(pVar.w().f1649c.h(), nVar.f2637g);
                            View findViewById = pVar.findViewById(16908290);
                            o oVar = null;
                            View view = imageView;
                            while (!view.equals(findViewById) && (oVar = nVar.f2637g.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            nVar.f2637g.clear();
                            if (oVar == null) {
                                return nVar.g(pVar);
                            }
                            if (oVar.l() == null) {
                                throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
                            } else if (l.i()) {
                                return nVar.f(oVar.l().getApplicationContext());
                            } else {
                                if (oVar.j() != null) {
                                    com.bumptech.glide.manager.g gVar = nVar.f2640j;
                                    oVar.j();
                                    gVar.f();
                                }
                                y k = oVar.k();
                                Context l6 = oVar.l();
                                if (!nVar.f2636f.f2563a.containsKey(f.class)) {
                                    return nVar.j(l6, k, oVar, oVar.z());
                                }
                                return nVar.k.a(l6, b(l6.getApplicationContext()), oVar.N, k, oVar.z());
                            }
                        } else {
                            nVar.f2638h.clear();
                            nVar.b(a10.getFragmentManager(), nVar.f2638h);
                            View findViewById2 = a10.findViewById(16908290);
                            Fragment fragment = null;
                            View view2 = imageView;
                            while (!view2.equals(findViewById2) && (fragment = nVar.f2638h.getOrDefault(view2, null)) == null && (view2.getParent() instanceof View)) {
                                view2 = (View) view2.getParent();
                            }
                            nVar.f2638h.clear();
                            if (fragment == null) {
                                return nVar.e(a10);
                            }
                            if (fragment.getActivity() == null) {
                                throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                            } else if (l.i()) {
                                return nVar.f(fragment.getActivity().getApplicationContext());
                            } else {
                                if (fragment.getActivity() != null) {
                                    com.bumptech.glide.manager.g gVar2 = nVar.f2640j;
                                    fragment.getActivity();
                                    gVar2.f();
                                }
                                return nVar.d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
                }
            }
            return nVar.f(imageView.getContext().getApplicationContext());
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public final void c(o oVar) {
        synchronized (this.f2552g) {
            if (this.f2552g.contains(oVar)) {
                this.f2552g.remove(oVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        l.a();
        ((j2.i) this.f2547b).e(0);
        this.f2546a.b();
        this.f2549d.b();
    }

    public final void onTrimMemory(int i10) {
        long j10;
        l.a();
        synchronized (this.f2552g) {
            Iterator it = this.f2552g.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
            }
        }
        g gVar = (g) this.f2547b;
        if (i10 >= 40) {
            gVar.e(0);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (gVar) {
                j10 = gVar.f8021b;
            }
            gVar.e(j10 / 2);
        } else {
            gVar.getClass();
        }
        this.f2546a.a(i10);
        this.f2549d.a(i10);
    }
}
