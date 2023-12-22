package j4;

import androidx.activity.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class f implements Iterable, p, l {

    /* renamed from: a  reason: collision with root package name */
    public final TreeMap f8132a;

    /* renamed from: b  reason: collision with root package name */
    public final TreeMap f8133b;

    public f() {
        this.f8132a = new TreeMap();
        this.f8133b = new TreeMap();
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                r(i10, (p) list.get(i10));
            }
        }
    }

    public final p a() {
        Integer num;
        TreeMap treeMap;
        p pVar;
        f fVar = new f();
        for (Map.Entry entry : this.f8132a.entrySet()) {
            if (entry.getValue() instanceof l) {
                treeMap = fVar.f8132a;
                num = (Integer) entry.getKey();
                pVar = (p) entry.getValue();
            } else {
                treeMap = fVar.f8132a;
                num = (Integer) entry.getKey();
                pVar = ((p) entry.getValue()).a();
            }
            treeMap.put(num, pVar);
        }
        return fVar;
    }

    public final Double b() {
        return this.f8132a.size() == 1 ? m(0).b() : this.f8132a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final Iterator d() {
        return new d(this.f8132a.keySet().iterator(), this.f8133b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (j() != fVar.j()) {
            return false;
        }
        if (this.f8132a.isEmpty()) {
            return fVar.f8132a.isEmpty();
        }
        for (int intValue = ((Integer) this.f8132a.firstKey()).intValue(); intValue <= ((Integer) this.f8132a.lastKey()).intValue(); intValue++) {
            if (!m(intValue).equals(fVar.m(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(String str) {
        return "length".equals(str) || this.f8133b.containsKey(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (j4.p) r2.f8133b.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p h(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            j4.i r3 = new j4.i
            int r0 = r2.j()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.g(r3)
            if (r0 == 0) goto L_0x0028
            java.util.TreeMap r0 = r2.f8133b
            java.lang.Object r3 = r0.get(r3)
            j4.p r3 = (j4.p) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            j4.u r3 = j4.p.f8373c0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f.h(java.lang.String):j4.p");
    }

    public final int hashCode() {
        return this.f8132a.hashCode() * 31;
    }

    public final void i(String str, p pVar) {
        if (pVar == null) {
            this.f8133b.remove(str);
        } else {
            this.f8133b.put(str, pVar);
        }
    }

    public final Iterator iterator() {
        return new e(this);
    }

    public final int j() {
        if (this.f8132a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f8132a.lastKey()).intValue() + 1;
    }

    public final Boolean k() {
        return Boolean.TRUE;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01cd, code lost:
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e7, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f6, code lost:
        r7 = ",";
        r21 = r12;
        r18 = "forEach";
        r12 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0202, code lost:
        switch(r22) {
            case 0: goto L_0x0858;
            case 1: goto L_0x0818;
            case 2: goto L_0x07b2;
            case 3: goto L_0x077e;
            case 4: goto L_0x06eb;
            case 5: goto L_0x06a9;
            case 6: goto L_0x0603;
            case 7: goto L_0x05ce;
            case 8: goto L_0x05b3;
            case 9: goto L_0x057b;
            case 10: goto L_0x056e;
            case 11: goto L_0x0566;
            case 12: goto L_0x052b;
            case 13: goto L_0x051b;
            case 14: goto L_0x0493;
            case 15: goto L_0x041d;
            case 16: goto L_0x03c0;
            case 17: goto L_0x02b7;
            case 18: goto L_0x02a4;
            case 19: goto L_0x020f;
            default: goto L_0x0205;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0205, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020e, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0213, code lost:
        if (r28.isEmpty() != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0215, code lost:
        r0 = new j4.f();
        r1 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0222, code lost:
        if (r1.hasNext() == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0224, code lost:
        r2 = r27.b((j4.p) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0232, code lost:
        if ((r2 instanceof j4.h) != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        r0.r(r0.j(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0243, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0244, code lost:
        r1 = r0.j();
        r2 = o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0250, code lost:
        if (r2.hasNext() == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0252, code lost:
        r3 = (java.lang.Integer) r2.next();
        r0.r(r3.intValue() + r1, m(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r8 = r25;
        r8.f8132a.clear();
        r1 = r0.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x027a, code lost:
        if (r1.hasNext() == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x027c, code lost:
        r2 = (java.lang.Integer) r1.next();
        r8.r(r2.intValue(), r0.m(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0292, code lost:
        r8 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0294, code lost:
        r0 = new j4.i(java.lang.Double.valueOf((double) j()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a4, code lost:
        r8 = r25;
        j4.j4.h(r6, 0, r28);
        r0 = new j4.t(r8.n(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b7, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c2, code lost:
        if (r28.isEmpty() == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c4, code lost:
        r0 = new j4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02cb, code lost:
        r1 = (int) j4.j4.a(r3.b((j4.p) r5.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e2, code lost:
        if (r1 >= 0) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e4, code lost:
        r1 = java.lang.Math.max(0, j() + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f2, code lost:
        if (r1 <= j()) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f4, code lost:
        r1 = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f8, code lost:
        r0 = j();
        r2 = new j4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0306, code lost:
        if (r28.size() <= 1) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0308, code lost:
        r4 = java.lang.Math.max(0, (int) j4.j4.a(r3.b((j4.p) r5.get(1)).b().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0324, code lost:
        if (r4 <= 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0326, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x032d, code lost:
        if (r6 >= java.lang.Math.min(r0, r1 + r4)) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x032f, code lost:
        r2.r(r2.j(), r8.m(r1));
        r8.q(r1);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0340, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0345, code lost:
        if (r28.size() <= 2) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0347, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034c, code lost:
        if (r0 >= r28.size()) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034e, code lost:
        r4 = r3.b((j4.p) r5.get(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035a, code lost:
        if ((r4 instanceof j4.h) != false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035c, code lost:
        r6 = (r1 + r0) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0360, code lost:
        if (r6 < 0) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0366, code lost:
        if (r6 < j()) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0369, code lost:
        r7 = ((java.lang.Integer) r8.f8132a.lastKey()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0375, code lost:
        if (r7 < r6) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0377, code lost:
        r9 = r8.f8132a;
        r10 = java.lang.Integer.valueOf(r7);
        r9 = (j4.p) r9.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0383, code lost:
        if (r9 == null) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0385, code lost:
        r8.r(r7 + 1, r9);
        r8.f8132a.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038f, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0392, code lost:
        r8.r(r6, r4);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03a3, code lost:
        throw new java.lang.IllegalArgumentException(androidx.activity.e.a("Invalid value index: ", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ab, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ac, code lost:
        if (r1 >= r0) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03ae, code lost:
        r2.r(r2.j(), r8.m(r1));
        r8.r(r1, (j4.p) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c0, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.j(r0, 1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03cf, code lost:
        if (j() >= 2) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d3, code lost:
        r0 = p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03db, code lost:
        if (r28.isEmpty() != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03dd, code lost:
        r1 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ea, code lost:
        if ((r1 instanceof j4.j) == false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ec, code lost:
        r1 = (j4.j) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f6, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03f7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f8, code lost:
        java.util.Collections.sort(r0, new j4.a0(r1, r3));
        r8.f8132a.clear();
        r0 = r0.iterator();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040e, code lost:
        if (r0.hasNext() == false) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0410, code lost:
        r8.r(r1, (j4.p) r0.next());
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x041d, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.h(r10, 1, r5);
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0434, code lost:
        if ((r0 instanceof j4.j) == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043a, code lost:
        if (j() != 0) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x043d, code lost:
        r0 = (j4.j) r0;
        r1 = o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0447, code lost:
        if (r1.hasNext() == false) goto L_0x0489;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0449, code lost:
        r2 = ((java.lang.Integer) r1.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0457, code lost:
        if (r8.s(r2) == false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0483, code lost:
        if (r0.c(r3, java.util.Arrays.asList(new j4.p[]{r8.m(r2), new j4.i(java.lang.Double.valueOf((double) r2)), r8})).k().booleanValue() == false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0485, code lost:
        r0 = j4.p.f8378h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0489, code lost:
        r0 = j4.p.f8379i0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0492, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0493, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.j("slice", 2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x04a1, code lost:
        if (r28.isEmpty() == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04a3, code lost:
        r0 = a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04a9, code lost:
        r0 = (double) j();
        r6 = j4.j4.a(r3.b((j4.p) r5.get(0)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04c7, code lost:
        if (r6 >= 0.0d) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04c9, code lost:
        r6 = java.lang.Math.max(r6 + r0, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04cf, code lost:
        r6 = java.lang.Math.min(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04d8, code lost:
        if (r28.size() != 2) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04da, code lost:
        r2 = j4.j4.a(r3.b((j4.p) r5.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04f3, code lost:
        if (r2 >= 0.0d) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04f5, code lost:
        r0 = java.lang.Math.max(r0 + r2, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04fb, code lost:
        r0 = java.lang.Math.min(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04ff, code lost:
        r2 = new j4.f();
        r3 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0508, code lost:
        if (((double) r3) >= r0) goto L_0x0518;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x050a, code lost:
        r2.r(r2.j(), r8.m(r3));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0518, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x051b, code lost:
        r8 = r25;
        r0 = 0;
        j4.j4.h("shift", 0, r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0527, code lost:
        if (j() != 0) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x052b, code lost:
        r8 = r25;
        j4.j4.h("reverse", 0, r28);
        r0 = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0537, code lost:
        if (r0 == 0) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0539, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x053c, code lost:
        if (r1 >= (r0 / 2)) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0542, code lost:
        if (r8.s(r1) == false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0544, code lost:
        r2 = r8.m(r1);
        r8.r(r1, (j4.p) null);
        r3 = (r0 - 1) - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0553, code lost:
        if (r8.s(r3) == false) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0555, code lost:
        r8.r(r1, r8.m(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x055c, code lost:
        r8.r(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x055f, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0562, code lost:
        r1 = r8;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0566, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x056e, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0575, code lost:
        r0 = c.a.s(r8, r3, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x057b, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0585, code lost:
        if (r28.isEmpty() != false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0587, code lost:
        r0 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x058f, code lost:
        if (r0.hasNext() == false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0591, code lost:
        r8.r(j(), r3.b((j4.p) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x05a3, code lost:
        r0 = new j4.i(java.lang.Double.valueOf((double) j()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05b3, code lost:
        r8 = r25;
        j4.j4.h("pop", 0, r28);
        r0 = j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05bf, code lost:
        if (r0 != 0) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05c3, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05c5, code lost:
        r1 = r8.m(r0);
        r8.q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05ce, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.h("map", 1, r5);
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05e5, code lost:
        if ((r0 instanceof j4.o) == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05eb, code lost:
        if (j() != 0) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ed, code lost:
        r0 = new j4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05f4, code lost:
        r0 = c.a.q(r8, r3, (j4.o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0602, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0603, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.j("lastIndexOf", 2, r5);
        r0 = j4.p.f8373c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0613, code lost:
        if (r28.isEmpty() != false) goto L_0x0620;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0615, code lost:
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0620, code lost:
        r1 = j() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x062b, code lost:
        if (r28.size() <= 1) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x062d, code lost:
        r1 = r3.b((j4.p) r5.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0643, code lost:
        if (java.lang.Double.isNaN(r1.b().doubleValue()) == false) goto L_0x064d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0645, code lost:
        r1 = (double) (j() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x064d, code lost:
        r1 = j4.j4.a(r1.b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x065b, code lost:
        if (r1 >= 0.0d) goto L_0x0665;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x065d, code lost:
        r1 = r1 + ((double) j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0664, code lost:
        r1 = (double) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0667, code lost:
        if (r1 >= 0.0d) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0669, code lost:
        r0 = new j4.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0673, code lost:
        r1 = (int) java.lang.Math.min((double) j(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x067d, code lost:
        if (r1 < 0) goto L_0x069e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0683, code lost:
        if (r8.s(r1) == false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x068d, code lost:
        if (j4.j4.l(r8.m(r1), r0) == false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x068f, code lost:
        r2 = new j4.i(java.lang.Double.valueOf((double) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x069b, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x069e, code lost:
        r0 = new j4.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06a7, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06a9, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.j(r21, 1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06b9, code lost:
        if (j() != 0) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06bb, code lost:
        r1 = j4.p.f8380j0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06bd, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06c4, code lost:
        if (r28.isEmpty() != false) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06c6, code lost:
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06d3, code lost:
        if ((r0 instanceof j4.n) != false) goto L_0x06df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06d7, code lost:
        if ((r0 instanceof j4.u) == false) goto L_0x06da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06da, code lost:
        r7 = r0.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06df, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06e1, code lost:
        r1 = new j4.t(r8.n(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06eb, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.j("indexOf", 2, r5);
        r0 = j4.p.f8373c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06fb, code lost:
        if (r28.isEmpty() != false) goto L_0x0708;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06fd, code lost:
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x070d, code lost:
        if (r28.size() <= 1) goto L_0x0745;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x070f, code lost:
        r1 = j4.j4.a(r3.b((j4.p) r5.get(1)).b().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x072c, code lost:
        if (r1 < ((double) j())) goto L_0x0738;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x072e, code lost:
        r1 = new j4.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x073a, code lost:
        if (r1 >= 0.0d) goto L_0x0744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x073c, code lost:
        r12 = ((double) j()) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0744, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0745, code lost:
        r1 = o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x074d, code lost:
        if (r1.hasNext() == false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x074f, code lost:
        r2 = ((java.lang.Integer) r1.next()).intValue();
        r3 = (double) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x075c, code lost:
        if (r3 < r12) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0766, code lost:
        if (j4.j4.l(r8.m(r2), r0) == false) goto L_0x0749;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0768, code lost:
        r1 = new j4.i(java.lang.Double.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0773, code lost:
        r1 = new j4.i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x077e, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        j4.j4.h(r18, 1, r5);
        r0 = r3.b((j4.p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0797, code lost:
        if ((r0 instanceof j4.o) == false) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x079f, code lost:
        if (r8.f8132a.size() != 0) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07a2, code lost:
        c.a.q(r8, r3, (j4.o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07a8, code lost:
        r1 = j4.p.f8373c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07b1, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07b2, code lost:
        r8 = r25;
        r3 = r27;
        r0 = r28;
        j4.j4.h(r5, 1, r0);
        r0 = r3.b((j4.p) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x07c9, code lost:
        if ((r0 instanceof j4.o) == false) goto L_0x0812;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07d1, code lost:
        if (r8.f8132a.size() != 0) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07d3, code lost:
        r1 = new j4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07da, code lost:
        r1 = a();
        r0 = c.a.q(r8, r3, (j4.o) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new j4.f();
        r0 = r0.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07f4, code lost:
        if (r0.hasNext() == false) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07f6, code lost:
        r2.r(r2.j(), ((j4.f) r1).m(((java.lang.Integer) r0.next()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x080f, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0817, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0818, code lost:
        r2 = r25;
        r3 = r27;
        r0 = r28;
        j4.j4.h("every", 1, r0);
        r0 = r3.b((j4.p) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x082f, code lost:
        if ((r0 instanceof j4.o) == false) goto L_0x0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0835, code lost:
        if (j() != 0) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x084a, code lost:
        if (c.a.q(r2, r3, (j4.o) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).j() == j()) goto L_0x084f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0857, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0858, code lost:
        r2 = r25;
        r3 = r27;
        r0 = r28;
        r1 = a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0866, code lost:
        if (r28.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0868, code lost:
        r0 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0870, code lost:
        if (r0.hasNext() == false) goto L_0x08ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0872, code lost:
        r4 = r3.b((j4.p) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x087e, code lost:
        if ((r4 instanceof j4.h) != false) goto L_0x08b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0880, code lost:
        r5 = (j4.f) r1;
        r6 = r5.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0889, code lost:
        if ((r4 instanceof j4.f) == false) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x088b, code lost:
        r4 = (j4.f) r4;
        r7 = r4.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0895, code lost:
        if (r7.hasNext() == false) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0897, code lost:
        r8 = (java.lang.Integer) r7.next();
        r5.r(r8.intValue() + r6, r4.m(r8.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08ae, code lost:
        r5.r(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08b9, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x080f, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x080f, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x080f, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        return j4.p.f8379i0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        return j4.p.f8378h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0167, code lost:
        r5 = r17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p l(java.lang.String r26, o.c r27, java.util.ArrayList r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "reduceRight"
            java.lang.String r7 = "push"
            java.lang.String r8 = "unshift"
            java.lang.String r9 = "splice"
            java.lang.String r10 = "reduce"
            java.lang.String r11 = "toString"
            java.lang.String r12 = "filter"
            java.lang.String r13 = "forEach"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "map"
            r16 = r4
            java.lang.String r4 = "pop"
            java.lang.String r0 = "join"
            java.lang.String r2 = "some"
            java.lang.String r3 = "sort"
            r17 = r8
            java.lang.String r8 = "every"
            r18 = r11
            java.lang.String r11 = "shift"
            r19 = r9
            java.lang.String r9 = "slice"
            r20 = r3
            java.lang.String r3 = "reverse"
            r21 = r2
            java.lang.String r2 = "indexOf"
            if (r5 != 0) goto L_0x0117
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x0117
            r5 = r21
            boolean r21 = r5.equals(r1)
            if (r21 != 0) goto L_0x0108
            r21 = r0
            r0 = r20
            boolean r20 = r0.equals(r1)
            if (r20 != 0) goto L_0x00fc
            r20 = r0
            r0 = r19
            boolean r19 = r0.equals(r1)
            if (r19 != 0) goto L_0x00ec
            r19 = r5
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d7
            r18 = r5
            r5 = r17
            boolean r17 = r5.equals(r1)
            if (r17 == 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            j4.t r0 = new j4.t
            r0.<init>(r1)
            r1 = r25
            r2 = r27
            r3 = r28
            j4.p r0 = y3.a.J(r1, r0, r2, r3)
            return r0
        L_0x00d7:
            r18 = r5
            r5 = r17
        L_0x00db:
            r17 = r12
            r12 = r21
            r23 = r20
            r20 = r0
            r0 = r23
            r24 = r19
            r19 = r10
            r10 = r24
            goto L_0x0124
        L_0x00ec:
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            r23 = r20
            r20 = r0
            r0 = r23
            goto L_0x0124
        L_0x00fc:
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            goto L_0x0124
        L_0x0108:
            r23 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r23
            goto L_0x0124
        L_0x0117:
            r5 = r17
            r17 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r21
        L_0x0124:
            int r21 = r26.hashCode()
            r22 = -1
            switch(r21) {
                case -1776922004: goto L_0x01ea;
                case -1354795244: goto L_0x01db;
                case -1274492040: goto L_0x01d0;
                case -934873754: goto L_0x01c3;
                case -895859076: goto L_0x01b8;
                case -678635926: goto L_0x01b0;
                case -467511597: goto L_0x01a8;
                case -277637751: goto L_0x019f;
                case 107868: goto L_0x0197;
                case 111185: goto L_0x018e;
                case 3267882: goto L_0x0186;
                case 3452698: goto L_0x017d;
                case 3536116: goto L_0x0174;
                case 3536286: goto L_0x016b;
                case 96891675: goto L_0x015f;
                case 109407362: goto L_0x0155;
                case 109526418: goto L_0x014b;
                case 965561430: goto L_0x0141;
                case 1099846370: goto L_0x0137;
                case 1943291465: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0167
        L_0x012e:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0167
            r1 = 4
            goto L_0x01cd
        L_0x0137:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0167
            r1 = 12
            goto L_0x01cd
        L_0x0141:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0167
            r1 = 11
            goto L_0x01cd
        L_0x014b:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0167
            r1 = 14
            goto L_0x01cd
        L_0x0155:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0167
            r1 = 13
            goto L_0x01cd
        L_0x015f:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0167
            r22 = 1
        L_0x0167:
            r5 = r17
            goto L_0x01e7
        L_0x016b:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0167
            r1 = 16
            goto L_0x01cd
        L_0x0174:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0167
            r1 = 15
            goto L_0x01cd
        L_0x017d:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0167
            r1 = 9
            goto L_0x01cd
        L_0x0186:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0167
            r1 = 5
            goto L_0x01cd
        L_0x018e:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0167
            r1 = 8
            goto L_0x01cd
        L_0x0197:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0167
            r1 = 7
            goto L_0x01cd
        L_0x019f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 19
            goto L_0x01cd
        L_0x01a8:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0167
            r1 = 6
            goto L_0x01cd
        L_0x01b0:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0167
            r1 = 3
            goto L_0x01cd
        L_0x01b8:
            r5 = r20
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 17
            goto L_0x01cd
        L_0x01c3:
            r5 = r19
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 10
        L_0x01cd:
            r22 = r1
            goto L_0x0167
        L_0x01d0:
            r5 = r17
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01e7
            r22 = 2
            goto L_0x01e7
        L_0x01db:
            r6 = r16
            r5 = r17
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01e7
            r22 = 0
        L_0x01e7:
            r6 = r18
            goto L_0x01f6
        L_0x01ea:
            r5 = r17
            r6 = r18
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01f6
            r22 = 18
        L_0x01f6:
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r1 = "Callback should be a method"
            java.lang.String r7 = ","
            r21 = r12
            r18 = r13
            r12 = 0
            switch(r22) {
                case 0: goto L_0x0858;
                case 1: goto L_0x0818;
                case 2: goto L_0x07b2;
                case 3: goto L_0x077e;
                case 4: goto L_0x06eb;
                case 5: goto L_0x06a9;
                case 6: goto L_0x0603;
                case 7: goto L_0x05ce;
                case 8: goto L_0x05b3;
                case 9: goto L_0x057b;
                case 10: goto L_0x056e;
                case 11: goto L_0x0566;
                case 12: goto L_0x052b;
                case 13: goto L_0x051b;
                case 14: goto L_0x0493;
                case 15: goto L_0x041d;
                case 16: goto L_0x03c0;
                case 17: goto L_0x02b7;
                case 18: goto L_0x02a4;
                case 19: goto L_0x020f;
                default: goto L_0x0205;
            }
        L_0x0205:
            r2 = r25
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x020f:
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x0292
            j4.f r0 = new j4.f
            r0.<init>()
            java.util.Iterator r1 = r28.iterator()
        L_0x021e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0244
            java.lang.Object r2 = r1.next()
            j4.p r2 = (j4.p) r2
            r3 = r27
            j4.p r2 = r3.b(r2)
            boolean r4 = r2 instanceof j4.h
            if (r4 != 0) goto L_0x023c
            int r4 = r0.j()
            r0.r(r4, r2)
            goto L_0x021e
        L_0x023c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0244:
            int r1 = r0.j()
            java.util.Iterator r2 = r25.o()
        L_0x024c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x026b
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r8 = r25
            j4.p r3 = r8.m(r3)
            r0.r(r4, r3)
            goto L_0x024c
        L_0x026b:
            r8 = r25
            java.util.TreeMap r1 = r8.f8132a
            r1.clear()
            java.util.Iterator r1 = r0.o()
        L_0x0276:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0294
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            j4.p r2 = r0.m(r2)
            r8.r(r3, r2)
            goto L_0x0276
        L_0x0292:
            r8 = r25
        L_0x0294:
            j4.i r0 = new j4.i
            int r1 = r25.j()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x06a7
        L_0x02a4:
            r8 = r25
            r0 = 0
            r5 = r28
            j4.j4.h(r6, r0, r5)
            j4.t r0 = new j4.t
            java.lang.String r1 = r8.n(r7)
            r0.<init>(r1)
            goto L_0x06a7
        L_0x02b7:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            boolean r1 = r28.isEmpty()
            if (r1 == 0) goto L_0x02cb
            j4.f r0 = new j4.f
            r0.<init>()
            goto L_0x06a7
        L_0x02cb:
            java.lang.Object r1 = r5.get(r0)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r3.b(r1)
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = j4.j4.a(r1)
            int r1 = (int) r1
            if (r1 >= 0) goto L_0x02ee
            int r2 = r25.j()
            int r2 = r2 + r1
            int r1 = java.lang.Math.max(r0, r2)
            goto L_0x02f8
        L_0x02ee:
            int r0 = r25.j()
            if (r1 <= r0) goto L_0x02f8
            int r1 = r25.j()
        L_0x02f8:
            int r0 = r25.j()
            j4.f r2 = new j4.f
            r2.<init>()
            int r4 = r28.size()
            r6 = 1
            if (r4 <= r6) goto L_0x03ac
            java.lang.Object r4 = r5.get(r6)
            j4.p r4 = (j4.p) r4
            j4.p r4 = r3.b(r4)
            java.lang.Double r4 = r4.b()
            double r6 = r4.doubleValue()
            double r6 = j4.j4.a(r6)
            int r4 = (int) r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            if (r4 <= 0) goto L_0x0340
            r6 = r1
        L_0x0327:
            int r7 = r1 + r4
            int r7 = java.lang.Math.min(r0, r7)
            if (r6 >= r7) goto L_0x0340
            j4.p r7 = r8.m(r1)
            int r9 = r2.j()
            r2.r(r9, r7)
            r8.q(r1)
            int r6 = r6 + 1
            goto L_0x0327
        L_0x0340:
            int r0 = r28.size()
            r4 = 2
            if (r0 <= r4) goto L_0x080f
            r0 = 2
        L_0x0348:
            int r4 = r28.size()
            if (r0 >= r4) goto L_0x080f
            java.lang.Object r4 = r5.get(r0)
            j4.p r4 = (j4.p) r4
            j4.p r4 = r3.b(r4)
            boolean r6 = r4 instanceof j4.h
            if (r6 != 0) goto L_0x03a4
            int r6 = r1 + r0
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0398
            int r7 = r25.j()
            if (r6 < r7) goto L_0x0369
            goto L_0x0392
        L_0x0369:
            java.util.TreeMap r7 = r8.f8132a
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0375:
            if (r7 < r6) goto L_0x0392
            java.util.TreeMap r9 = r8.f8132a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r9 = r9.get(r10)
            j4.p r9 = (j4.p) r9
            if (r9 == 0) goto L_0x038f
            int r11 = r7 + 1
            r8.r(r11, r9)
            java.util.TreeMap r9 = r8.f8132a
            r9.remove(r10)
        L_0x038f:
            int r7 = r7 + -1
            goto L_0x0375
        L_0x0392:
            r8.r(r6, r4)
            int r0 = r0 + 1
            goto L_0x0348
        L_0x0398:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid value index: "
            java.lang.String r1 = androidx.activity.e.a(r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x03a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x03ac:
            if (r1 >= r0) goto L_0x080f
            j4.p r3 = r8.m(r1)
            int r4 = r2.j()
            r2.r(r4, r3)
            r3 = 0
            r8.r(r1, r3)
            int r1 = r1 + 1
            goto L_0x03ac
        L_0x03c0:
            r8 = r25
            r3 = r27
            r5 = r28
            r1 = 1
            j4.j4.j(r0, r1, r5)
            int r0 = r25.j()
            r1 = 2
            if (r0 >= r1) goto L_0x03d3
            goto L_0x0562
        L_0x03d3:
            java.util.ArrayList r0 = r25.p()
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x03f7
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r3.b(r1)
            boolean r2 = r1 instanceof j4.j
            if (r2 == 0) goto L_0x03ef
            j4.j r1 = (j4.j) r1
            goto L_0x03f8
        L_0x03ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x03f7:
            r1 = 0
        L_0x03f8:
            j4.a0 r2 = new j4.a0
            r2.<init>(r1, r3)
            java.util.Collections.sort(r0, r2)
            java.util.TreeMap r1 = r8.f8132a
            r1.clear()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x040a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0562
            java.lang.Object r2 = r0.next()
            j4.p r2 = (j4.p) r2
            int r3 = r1 + 1
            r8.r(r1, r2)
            r1 = r3
            goto L_0x040a
        L_0x041d:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            j4.j4.h(r10, r0, r5)
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r2 = r0 instanceof j4.j
            if (r2 == 0) goto L_0x048d
            int r1 = r25.j()
            if (r1 != 0) goto L_0x043d
            goto L_0x0489
        L_0x043d:
            j4.j r0 = (j4.j) r0
            java.util.Iterator r1 = r25.o()
        L_0x0443:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0489
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r8.s(r2)
            if (r4 == 0) goto L_0x0443
            r4 = 3
            j4.p[] r4 = new j4.p[r4]
            j4.p r5 = r8.m(r2)
            r6 = 0
            r4[r6] = r5
            double r5 = (double) r2
            j4.i r2 = new j4.i
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r2.<init>(r5)
            r5 = 1
            r4[r5] = r2
            r2 = 2
            r4[r2] = r8
            java.util.List r2 = java.util.Arrays.asList(r4)
            j4.p r2 = r0.c(r3, r2)
            java.lang.Boolean r2 = r2.k()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0443
            j4.g r0 = j4.p.f8378h0
            goto L_0x06a7
        L_0x0489:
            j4.g r0 = j4.p.f8379i0
            goto L_0x06a7
        L_0x048d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0493:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            j4.j4.j(r9, r0, r5)
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x04a9
            j4.p r0 = r25.a()
            goto L_0x06a7
        L_0x04a9:
            int r0 = r25.j()
            double r0 = (double) r0
            r2 = 0
            java.lang.Object r2 = r5.get(r2)
            j4.p r2 = (j4.p) r2
            j4.p r2 = r3.b(r2)
            java.lang.Double r2 = r2.b()
            double r6 = r2.doubleValue()
            double r6 = j4.j4.a(r6)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x04cf
            double r6 = r6 + r0
            double r6 = java.lang.Math.max(r6, r12)
            goto L_0x04d3
        L_0x04cf:
            double r6 = java.lang.Math.min(r6, r0)
        L_0x04d3:
            int r2 = r28.size()
            r4 = 2
            if (r2 != r4) goto L_0x04ff
            r2 = 1
            java.lang.Object r2 = r5.get(r2)
            j4.p r2 = (j4.p) r2
            j4.p r2 = r3.b(r2)
            java.lang.Double r2 = r2.b()
            double r2 = r2.doubleValue()
            double r2 = j4.j4.a(r2)
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x04fb
            double r0 = r0 + r2
            double r0 = java.lang.Math.max(r0, r12)
            goto L_0x04ff
        L_0x04fb:
            double r0 = java.lang.Math.min(r0, r2)
        L_0x04ff:
            j4.f r2 = new j4.f
            r2.<init>()
            int r3 = (int) r6
        L_0x0505:
            double r4 = (double) r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0518
            j4.p r4 = r8.m(r3)
            int r5 = r2.j()
            r2.r(r5, r4)
            int r3 = r3 + 1
            goto L_0x0505
        L_0x0518:
            r0 = r2
            goto L_0x06a7
        L_0x051b:
            r8 = r25
            r5 = r28
            r0 = 0
            j4.j4.h(r11, r0, r5)
            int r1 = r25.j()
            if (r1 != 0) goto L_0x05c5
            goto L_0x07a8
        L_0x052b:
            r8 = r25
            r5 = r28
            r0 = 0
            j4.j4.h(r3, r0, r5)
            int r0 = r25.j()
            if (r0 == 0) goto L_0x0562
            r1 = 0
        L_0x053a:
            int r2 = r0 / 2
            if (r1 >= r2) goto L_0x0562
            boolean r2 = r8.s(r1)
            if (r2 == 0) goto L_0x055f
            j4.p r2 = r8.m(r1)
            r3 = 0
            r8.r(r1, r3)
            int r3 = r0 + -1
            int r3 = r3 - r1
            boolean r4 = r8.s(r3)
            if (r4 == 0) goto L_0x055c
            j4.p r4 = r8.m(r3)
            r8.r(r1, r4)
        L_0x055c:
            r8.r(r3, r2)
        L_0x055f:
            int r1 = r1 + 1
            goto L_0x053a
        L_0x0562:
            r1 = r8
            r2 = r1
            goto L_0x08ba
        L_0x0566:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            goto L_0x0575
        L_0x056e:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
        L_0x0575:
            j4.p r0 = c.a.s(r8, r3, r5, r0)
            goto L_0x06a7
        L_0x057b:
            r8 = r25
            r3 = r27
            r5 = r28
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x05a3
            java.util.Iterator r0 = r28.iterator()
        L_0x058b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05a3
            java.lang.Object r1 = r0.next()
            j4.p r1 = (j4.p) r1
            j4.p r1 = r3.b(r1)
            int r2 = r25.j()
            r8.r(r2, r1)
            goto L_0x058b
        L_0x05a3:
            j4.i r0 = new j4.i
            int r1 = r25.j()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x06a7
        L_0x05b3:
            r8 = r25
            r5 = r28
            r0 = 0
            j4.j4.h(r4, r0, r5)
            int r0 = r25.j()
            if (r0 != 0) goto L_0x05c3
            goto L_0x07a8
        L_0x05c3:
            int r0 = r0 + -1
        L_0x05c5:
            j4.p r1 = r8.m(r0)
            r8.q(r0)
            goto L_0x06bd
        L_0x05ce:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            r2 = 1
            j4.j4.h(r15, r2, r5)
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r2 = r0 instanceof j4.o
            if (r2 == 0) goto L_0x05fd
            int r1 = r25.j()
            if (r1 != 0) goto L_0x05f4
            j4.f r0 = new j4.f
            r0.<init>()
            goto L_0x06a7
        L_0x05f4:
            j4.o r0 = (j4.o) r0
            r1 = 0
            j4.f r0 = c.a.q(r8, r3, r0, r1, r1)
            goto L_0x06a7
        L_0x05fd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0603:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            j4.j4.j(r14, r0, r5)
            j4.u r0 = j4.p.f8373c0
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x0620
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
        L_0x0620:
            int r1 = r25.j()
            int r1 = r1 + -1
            int r2 = r28.size()
            r4 = 1
            if (r2 <= r4) goto L_0x0664
            java.lang.Object r1 = r5.get(r4)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r3.b(r1)
            java.lang.Double r2 = r1.b()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x064d
            int r1 = r25.j()
            int r1 = r1 + -1
            double r1 = (double) r1
            goto L_0x0659
        L_0x064d:
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = j4.j4.a(r1)
        L_0x0659:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0665
            int r3 = r25.j()
            double r3 = (double) r3
            double r1 = r1 + r3
            goto L_0x0665
        L_0x0664:
            double r1 = (double) r1
        L_0x0665:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0673
            j4.i r0 = new j4.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x06a7
        L_0x0673:
            int r3 = r25.j()
            double r3 = (double) r3
            double r1 = java.lang.Math.min(r3, r1)
            int r1 = (int) r1
        L_0x067d:
            if (r1 < 0) goto L_0x069e
            boolean r2 = r8.s(r1)
            if (r2 == 0) goto L_0x069b
            j4.p r2 = r8.m(r1)
            boolean r2 = j4.j4.l(r2, r0)
            if (r2 == 0) goto L_0x069b
            double r0 = (double) r1
            j4.i r2 = new j4.i
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.<init>(r0)
            goto L_0x080f
        L_0x069b:
            int r1 = r1 + -1
            goto L_0x067d
        L_0x069e:
            j4.i r0 = new j4.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
        L_0x06a7:
            r1 = r0
            goto L_0x06bd
        L_0x06a9:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            r1 = r21
            j4.j4.j(r1, r0, r5)
            int r0 = r25.j()
            if (r0 != 0) goto L_0x06c0
            j4.t r1 = j4.p.f8380j0
        L_0x06bd:
            r2 = r8
            goto L_0x08ba
        L_0x06c0:
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x06e1
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r1 = r0 instanceof j4.n
            if (r1 != 0) goto L_0x06df
            boolean r1 = r0 instanceof j4.u
            if (r1 == 0) goto L_0x06da
            goto L_0x06df
        L_0x06da:
            java.lang.String r7 = r0.zzi()
            goto L_0x06e1
        L_0x06df:
            java.lang.String r7 = ""
        L_0x06e1:
            j4.t r1 = new j4.t
            java.lang.String r0 = r8.n(r7)
            r1.<init>(r0)
            goto L_0x06bd
        L_0x06eb:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            j4.j4.j(r2, r0, r5)
            j4.u r0 = j4.p.f8373c0
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x0708
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
        L_0x0708:
            int r1 = r28.size()
            r2 = 1
            if (r1 <= r2) goto L_0x0745
            java.lang.Object r1 = r5.get(r2)
            j4.p r1 = (j4.p) r1
            j4.p r1 = r3.b(r1)
            java.lang.Double r1 = r1.b()
            double r1 = r1.doubleValue()
            double r1 = j4.j4.a(r1)
            int r3 = r25.j()
            double r3 = (double) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0738
            j4.i r1 = new j4.i
            java.lang.Double r0 = java.lang.Double.valueOf(r16)
            r1.<init>(r0)
            goto L_0x06bd
        L_0x0738:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0744
            int r3 = r25.j()
            double r3 = (double) r3
            double r12 = r3 + r1
            goto L_0x0745
        L_0x0744:
            r12 = r1
        L_0x0745:
            java.util.Iterator r1 = r25.o()
        L_0x0749:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0773
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            double r3 = (double) r2
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0749
            j4.p r2 = r8.m(r2)
            boolean r2 = j4.j4.l(r2, r0)
            if (r2 == 0) goto L_0x0749
            j4.i r1 = new j4.i
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.<init>(r0)
            goto L_0x06bd
        L_0x0773:
            j4.i r1 = new j4.i
            java.lang.Double r0 = java.lang.Double.valueOf(r16)
            r1.<init>(r0)
            goto L_0x06bd
        L_0x077e:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            r2 = r18
            j4.j4.h(r2, r0, r5)
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r2 = r0 instanceof j4.o
            if (r2 == 0) goto L_0x07ac
            java.util.TreeMap r1 = r8.f8132a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x07a2
            goto L_0x07a8
        L_0x07a2:
            j4.o r0 = (j4.o) r0
            r1 = 0
            c.a.q(r8, r3, r0, r1, r1)
        L_0x07a8:
            j4.u r1 = j4.p.f8373c0
            goto L_0x06bd
        L_0x07ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x07b2:
            r8 = r25
            r3 = r27
            r0 = r28
            r2 = 1
            j4.j4.h(r5, r2, r0)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r2 = r0 instanceof j4.o
            if (r2 == 0) goto L_0x0812
            java.util.TreeMap r1 = r8.f8132a
            int r1 = r1.size()
            if (r1 != 0) goto L_0x07da
            j4.f r1 = new j4.f
            r1.<init>()
            goto L_0x06bd
        L_0x07da:
            j4.p r1 = r25.a()
            j4.o r0 = (j4.o) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            j4.f r0 = c.a.q(r8, r3, r0, r4, r2)
            j4.f r2 = new j4.f
            r2.<init>()
            java.util.Iterator r0 = r0.o()
        L_0x07f0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x080f
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            j4.f r4 = (j4.f) r4
            j4.p r3 = r4.m(r3)
            int r4 = r2.j()
            r2.r(r4, r3)
            goto L_0x07f0
        L_0x080f:
            r1 = r2
            goto L_0x06bd
        L_0x0812:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0818:
            r2 = r25
            r3 = r27
            r0 = r28
            r4 = 1
            j4.j4.h(r8, r4, r0)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            j4.p r0 = (j4.p) r0
            j4.p r0 = r3.b(r0)
            boolean r4 = r0 instanceof j4.o
            if (r4 == 0) goto L_0x0852
            int r1 = r25.j()
            if (r1 != 0) goto L_0x0838
            goto L_0x084f
        L_0x0838:
            j4.o r0 = (j4.o) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            j4.f r0 = c.a.q(r2, r3, r0, r1, r4)
            int r0 = r0.j()
            int r1 = r25.j()
            if (r0 == r1) goto L_0x084f
            j4.g r1 = j4.p.f8379i0
            goto L_0x08ba
        L_0x084f:
            j4.g r1 = j4.p.f8378h0
            goto L_0x08ba
        L_0x0852:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0858:
            r2 = r25
            r3 = r27
            r0 = r28
            j4.p r1 = r25.a()
            boolean r4 = r28.isEmpty()
            if (r4 != 0) goto L_0x08ba
            java.util.Iterator r0 = r28.iterator()
        L_0x086c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x08ba
            java.lang.Object r4 = r0.next()
            j4.p r4 = (j4.p) r4
            j4.p r4 = r3.b(r4)
            boolean r5 = r4 instanceof j4.h
            if (r5 != 0) goto L_0x08b2
            r5 = r1
            j4.f r5 = (j4.f) r5
            int r6 = r5.j()
            boolean r7 = r4 instanceof j4.f
            if (r7 == 0) goto L_0x08ae
            j4.f r4 = (j4.f) r4
            java.util.Iterator r7 = r4.o()
        L_0x0891:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x086c
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            int r9 = r9 + r6
            int r8 = r8.intValue()
            j4.p r8 = r4.m(r8)
            r5.r(r9, r8)
            goto L_0x0891
        L_0x08ae:
            r5.r(r6, r4)
            goto L_0x086c
        L_0x08b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x08ba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f.l(java.lang.String, o.c, java.util.ArrayList):j4.p");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (j4.p) r1.f8132a.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j4.p m(int r2) {
        /*
            r1 = this;
            int r0 = r1.j()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.s(r2)
            if (r0 == 0) goto L_0x001b
            java.util.TreeMap r0 = r1.f8132a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            j4.p r2 = (j4.p) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            j4.u r2 = j4.p.f8373c0
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f.m(int):j4.p");
    }

    public final String n(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f8132a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= j()) {
                    break;
                }
                p m2 = m(i10);
                sb.append(str2);
                if (!(m2 instanceof u) && !(m2 instanceof n)) {
                    sb.append(m2.zzi());
                }
                i10++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator o() {
        return this.f8132a.keySet().iterator();
    }

    public final ArrayList p() {
        ArrayList arrayList = new ArrayList(j());
        for (int i10 = 0; i10 < j(); i10++) {
            arrayList.add(m(i10));
        }
        return arrayList;
    }

    public final void q(int i10) {
        int intValue = ((Integer) this.f8132a.lastKey()).intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f8132a.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                TreeMap treeMap = this.f8132a;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!treeMap.containsKey(valueOf) && i11 >= 0) {
                    this.f8132a.put(valueOf, p.f8373c0);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= ((Integer) this.f8132a.lastKey()).intValue()) {
                    TreeMap treeMap2 = this.f8132a;
                    Integer valueOf2 = Integer.valueOf(i10);
                    p pVar = (p) treeMap2.get(valueOf2);
                    if (pVar != null) {
                        this.f8132a.put(Integer.valueOf(i10 - 1), pVar);
                        this.f8132a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void r(int i10, p pVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 < 0) {
            throw new IndexOutOfBoundsException(e.a("Out of bounds index: ", i10));
        } else if (pVar == null) {
            this.f8132a.remove(Integer.valueOf(i10));
        } else {
            this.f8132a.put(Integer.valueOf(i10), pVar);
        }
    }

    public final boolean s(int i10) {
        if (i10 >= 0 && i10 <= ((Integer) this.f8132a.lastKey()).intValue()) {
            return this.f8132a.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(e.a("Out of bounds index: ", i10));
    }

    public final String toString() {
        return n(",");
    }

    public final String zzi() {
        return n(",");
    }
}
