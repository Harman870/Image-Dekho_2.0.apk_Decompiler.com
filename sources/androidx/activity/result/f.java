package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import b.c;
import c3.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f297a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f298b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f299c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f300d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f301e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f302f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f303g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f304h = new Bundle();

    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f305a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a<?, O> f306b;

        public a(b<O> bVar, b.a<?, O> aVar) {
            this.f305a = bVar;
            this.f306b = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final g f307a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<j> f308b = new ArrayList<>();

        public b(g gVar) {
            this.f307a = gVar;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f298b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f302f.get(str);
        if (aVar == null || aVar.f305a == null || !this.f301e.contains(str)) {
            this.f303g.remove(str);
            this.f304h.putParcelable(str, new a(intent, i11));
            return true;
        }
        aVar.f305a.b(aVar.f306b.c(intent, i11));
        this.f301e.remove(str);
        return true;
    }

    public abstract void b(int i10, b.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(String str, l lVar, c cVar, n nVar) {
        m r4 = lVar.r();
        if (!r4.f1744b.a(g.c.STARTED)) {
            e(str);
            b bVar = (b) this.f300d.get(str);
            if (bVar == null) {
                bVar = new b(r4);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, nVar, cVar);
            bVar.f307a.a(activityResultRegistry$1);
            bVar.f308b.add(activityResultRegistry$1);
            this.f300d.put(str, bVar);
            return new d(this, str, cVar);
        }
        throw new IllegalStateException("LifecycleOwner " + lVar + " is attempting to register while current state is " + r4.f1744b + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, b.a aVar, b bVar) {
        e(str);
        this.f302f.put(str, new a(bVar, aVar));
        if (this.f303g.containsKey(str)) {
            Object obj = this.f303g.get(str);
            this.f303g.remove(str);
            bVar.b(obj);
        }
        a aVar2 = (a) this.f304h.getParcelable(str);
        if (aVar2 != null) {
            this.f304h.remove(str);
            bVar.b(aVar.c(aVar2.f289b, aVar2.f288a));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        if (((Integer) this.f299c.get(str)) == null) {
            int nextInt = this.f297a.nextInt(2147418112);
            while (true) {
                int i10 = nextInt + 65536;
                if (this.f298b.containsKey(Integer.valueOf(i10))) {
                    nextInt = this.f297a.nextInt(2147418112);
                } else {
                    this.f298b.put(Integer.valueOf(i10), str);
                    this.f299c.put(str, Integer.valueOf(i10));
                    return;
                }
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f301e.contains(str) && (num = (Integer) this.f299c.remove(str)) != null) {
            this.f298b.remove(num);
        }
        this.f302f.remove(str);
        if (this.f303g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f303g.get(str));
            this.f303g.remove(str);
        }
        if (this.f304h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f304h.getParcelable(str));
            this.f304h.remove(str);
        }
        b bVar = (b) this.f300d.get(str);
        if (bVar != null) {
            Iterator<j> it = bVar.f308b.iterator();
            while (it.hasNext()) {
                bVar.f307a.c(it.next());
            }
            bVar.f308b.clear();
            this.f300d.remove(str);
        }
    }
}
