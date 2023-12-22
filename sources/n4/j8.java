package n4;

import j4.a4;
import j4.f3;
import j4.g3;
import j4.h3;
import j4.i3;
import j4.va;
import j4.x3;
import j4.y3;
import j4.z3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m.b;
import m.g;

public final class j8 {

    /* renamed from: a  reason: collision with root package name */
    public String f9872a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9873b;

    /* renamed from: c  reason: collision with root package name */
    public y3 f9874c;

    /* renamed from: d  reason: collision with root package name */
    public BitSet f9875d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f9876e;

    /* renamed from: f  reason: collision with root package name */
    public Map f9877f;

    /* renamed from: g  reason: collision with root package name */
    public b f9878g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f9879h;

    public /* synthetic */ j8(b bVar, String str) {
        this.f9879h = bVar;
        this.f9872a = str;
        this.f9873b = true;
        this.f9875d = new BitSet();
        this.f9876e = new BitSet();
        this.f9877f = new b();
        this.f9878g = new b();
    }

    public j8(b bVar, String str, y3 y3Var, BitSet bitSet, BitSet bitSet2, b bVar2, b bVar3) {
        this.f9879h = bVar;
        this.f9872a = str;
        this.f9875d = bitSet;
        this.f9876e = bitSet2;
        this.f9877f = bVar2;
        this.f9878g = new b();
        Iterator it = ((g.c) bVar3.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) bVar3.getOrDefault(num, null));
            this.f9878g.put(num, arrayList);
        }
        this.f9873b = false;
        this.f9874c = y3Var;
    }

    public final g3 a(int i10) {
        ArrayList arrayList;
        List list;
        f3 u = g3.u();
        u.j();
        g3.y((g3) u.f8238b, i10);
        boolean z9 = this.f9873b;
        u.j();
        g3.B((g3) u.f8238b, z9);
        y3 y3Var = this.f9874c;
        if (y3Var != null) {
            u.j();
            g3.A((g3) u.f8238b, y3Var);
        }
        x3 x9 = y3.x();
        ArrayList D = y7.D(this.f9875d);
        x9.j();
        y3.G((y3) x9.f8238b, D);
        ArrayList D2 = y7.D(this.f9876e);
        x9.j();
        y3.E((y3) x9.f8238b, D2);
        Map map = this.f9877f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            for (Integer intValue : this.f9877f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l6 = (Long) this.f9877f.get(Integer.valueOf(intValue2));
                if (l6 != null) {
                    h3 v10 = i3.v();
                    v10.j();
                    i3.x((i3) v10.f8238b, intValue2);
                    long longValue = l6.longValue();
                    v10.j();
                    i3.y((i3) v10.f8238b, longValue);
                    arrayList.add((i3) v10.h());
                }
            }
        }
        if (arrayList != null) {
            x9.j();
            y3.I((y3) x9.f8238b, arrayList);
        }
        b bVar = this.f9878g;
        if (bVar == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f9301c);
            Iterator it = ((g.c) this.f9878g.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                z3 w = a4.w();
                int intValue3 = num.intValue();
                w.j();
                a4.z((a4) w.f8238b, intValue3);
                List list2 = (List) this.f9878g.getOrDefault(num, null);
                if (list2 != null) {
                    Collections.sort(list2);
                    w.j();
                    a4.A((a4) w.f8238b, list2);
                }
                arrayList2.add((a4) w.h());
            }
            list = arrayList2;
        }
        x9.j();
        y3.K((y3) x9.f8238b, list);
        u.j();
        g3.z((g3) u.f8238b, (y3) x9.h());
        return (g3) u.h();
    }

    public final void b(m8 m8Var) {
        int a10 = m8Var.a();
        Boolean bool = m8Var.f9969c;
        if (bool != null) {
            BitSet bitSet = this.f9876e;
            bool.booleanValue();
            bitSet.set(a10, true);
        }
        Boolean bool2 = m8Var.f9970d;
        if (bool2 != null) {
            this.f9875d.set(a10, bool2.booleanValue());
        }
        if (m8Var.f9971e != null) {
            Map map = this.f9877f;
            Integer valueOf = Integer.valueOf(a10);
            Long l6 = (Long) map.get(valueOf);
            long longValue = m8Var.f9971e.longValue() / 1000;
            if (l6 == null || longValue > l6.longValue()) {
                this.f9877f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (m8Var.f9972f != null) {
            b bVar = this.f9878g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) bVar.getOrDefault(valueOf2, null);
            if (list == null) {
                list = new ArrayList();
                this.f9878g.put(valueOf2, list);
            }
            if (m8Var.c()) {
                list.clear();
            }
            va.a();
            f fVar = this.f9879h.f9600a.f9992g;
            String str = this.f9872a;
            v2 v2Var = w2.X;
            if (fVar.o(str, v2Var) && m8Var.b()) {
                list.clear();
            }
            va.a();
            boolean o10 = this.f9879h.f9600a.f9992g.o(this.f9872a, v2Var);
            Long valueOf3 = Long.valueOf(m8Var.f9972f.longValue() / 1000);
            if (!o10) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }
}
