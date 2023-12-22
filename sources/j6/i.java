package j6;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m6.a;
import r6.c;
import r6.d;

public final class i implements b, a {

    /* renamed from: g  reason: collision with root package name */
    public static final f f8736g = new f();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8737a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8738b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8739c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final o f8740d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<Boolean> f8741e = new AtomicReference<>();

    /* renamed from: f  reason: collision with root package name */
    public final e f8742f;

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, e eVar) {
        o oVar = new o(executor);
        this.f8740d = oVar;
        this.f8742f = eVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.b(oVar, o.class, d.class, c.class));
        arrayList3.add(a.b(this, a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((u6.a) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f8742f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (p e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f8737a.isEmpty()) {
                j.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f8737a.keySet());
                arrayList6.addAll(arrayList3);
                j.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                a aVar2 = (a) it4.next();
                this.f8737a.put(aVar2, new q(new c6.d(this, 1, aVar2)));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f8741e.get();
        if (bool != null) {
            g(this.f8737a, bool.booleanValue());
        }
    }

    public final synchronized <T> u6.a<T> b(v<T> vVar) {
        if (vVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (u6.a) this.f8738b.get(vVar);
    }

    public final synchronized <T> u6.a<Set<T>> e(v<T> vVar) {
        r rVar = (r) this.f8739c.get(vVar);
        if (rVar != null) {
            return rVar;
        }
        return f8736g;
    }

    public final void g(Map<a<?>, u6.a<?>> map, boolean z9) {
        ArrayDeque<r6.a> arrayDeque;
        Set<Map.Entry> set;
        boolean z10;
        Iterator<Map.Entry<a<?>, u6.a<?>>> it = map.entrySet().iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            u6.a aVar = (u6.a) next.getValue();
            int i10 = ((a) next.getKey()).f8720d;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (i10 == 2) {
                    z11 = true;
                }
                if (z11) {
                    if (!z9) {
                    }
                }
            }
            aVar.get();
        }
        o oVar = this.f8740d;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f8756b;
                if (arrayDeque != null) {
                    oVar.f8756b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (r6.a aVar2 : arrayDeque) {
                aVar2.getClass();
                synchronized (oVar) {
                    ArrayDeque arrayDeque2 = oVar.f8756b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar2);
                    } else {
                        synchronized (oVar) {
                            Map map2 = (Map) oVar.f8755a.get((Object) null);
                            if (map2 == null) {
                                set = Collections.emptySet();
                            } else {
                                set = map2.entrySet();
                            }
                        }
                        for (Map.Entry entry : set) {
                            ((Executor) entry.getValue()).execute(new n(entry, 0, aVar2));
                        }
                    }
                }
            }
        }
    }

    public final void h() {
        boolean z9;
        Object obj;
        HashMap hashMap;
        v<?> vVar;
        boolean z10;
        for (a aVar : this.f8737a.keySet()) {
            Iterator<k> it = aVar.f8719c.iterator();
            while (true) {
                if (it.hasNext()) {
                    k next = it.next();
                    boolean z11 = true;
                    if (next.f8749b == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && !this.f8739c.containsKey(next.f8748a)) {
                        hashMap = this.f8739c;
                        vVar = next.f8748a;
                        obj = new r(Collections.emptySet());
                    } else if (this.f8738b.containsKey(next.f8748a)) {
                        continue;
                    } else {
                        int i10 = next.f8749b;
                        if (i10 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (i10 != 2) {
                                z11 = false;
                            }
                            if (!z11) {
                                hashMap = this.f8738b;
                                vVar = next.f8748a;
                                obj = new u();
                            }
                        } else {
                            throw new s(String.format("Unsatisfied dependency for component %s: %s", new Object[]{aVar, next.f8748a}));
                        }
                    }
                    hashMap.put(vVar, obj);
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        boolean z9;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f8721e == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                u6.a aVar2 = (u6.a) this.f8737a.get(aVar);
                for (v next : aVar.f8718b) {
                    if (!this.f8738b.containsKey(next)) {
                        this.f8738b.put(next, aVar2);
                    } else {
                        arrayList2.add(new s((u) ((u6.a) this.f8738b.get(next)), 2, aVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = this.f8737a.entrySet().iterator();
        while (true) {
            boolean z9 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getKey();
            if (aVar.f8721e == 0) {
                z9 = true;
            }
            if (!z9) {
                u6.a aVar2 = (u6.a) entry.getValue();
                for (v next : aVar.f8718b) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(aVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f8739c.containsKey(entry2.getKey())) {
                this.f8739c.put((v) entry2.getKey(), new r((Set) ((Collection) entry2.getValue())));
            } else {
                r rVar = (r) this.f8739c.get(entry2.getKey());
                for (u6.a gVar : (Set) entry2.getValue()) {
                    arrayList.add(new g(rVar, 0, gVar));
                }
            }
        }
        return arrayList;
    }
}
