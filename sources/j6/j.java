package j6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final a<?> f8743a;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f8744b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f8745c = new HashSet();

        public a(a<?> aVar) {
            this.f8743a = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final v<?> f8746a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8747b;

        public b() {
            throw null;
        }

        public b(v vVar, boolean z9) {
            this.f8746a = vVar;
            this.f8747b = z9;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f8746a.equals(this.f8746a) && bVar.f8747b == this.f8747b;
        }

        public final int hashCode() {
            return ((this.f8746a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8747b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        boolean z9;
        boolean z10;
        boolean z11;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                Iterator<v<? super T>> it2 = aVar.f8718b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        v next = it2.next();
                        if (aVar.f8721e == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z12 = !z11;
                        b bVar = new b(next, z12);
                        if (!hashMap.containsKey(bVar)) {
                            hashMap.put(bVar, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar);
                        if (set.isEmpty() || z12) {
                            set.add(aVar2);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<a> it3 : hashMap.values()) {
                    for (a aVar3 : it3) {
                        for (k next2 : aVar3.f8743a.f8719c) {
                            if (next2.f8750c == 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                v<?> vVar = next2.f8748a;
                                if (next2.f8749b == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                Set<a> set2 = (Set) hashMap.get(new b(vVar, z10));
                                if (set2 != null) {
                                    for (a aVar4 : set2) {
                                        aVar3.f8744b.add(aVar4);
                                        aVar4.f8745c.add(aVar3);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    a aVar5 = (a) it4.next();
                    if (aVar5.f8745c.isEmpty()) {
                        hashSet2.add(aVar5);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar6 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar6);
                    i10++;
                    Iterator it5 = aVar6.f8744b.iterator();
                    while (it5.hasNext()) {
                        a aVar7 = (a) it5.next();
                        aVar7.f8745c.remove(aVar6);
                        if (aVar7.f8745c.isEmpty()) {
                            hashSet2.add(aVar7);
                        }
                    }
                }
                if (i10 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        a aVar8 = (a) it6.next();
                        if (!aVar8.f8745c.isEmpty() && !aVar8.f8744b.isEmpty()) {
                            arrayList2.add(aVar8.f8743a);
                        }
                    }
                    throw new l(arrayList2);
                }
                return;
            }
        }
    }
}
