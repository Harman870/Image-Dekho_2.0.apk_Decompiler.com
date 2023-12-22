package com.ironsource.mediationsdk.adunit.e;

import c9.e;
import com.ironsource.mediationsdk.adunit.d.a.c;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p8.d;

public final class f<Smash extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final com.ironsource.mediationsdk.adunit.c.a.a f4303a;

    public static final class a<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Map f4304a;

        public a(Map map) {
            this.f4304a = map;
        }

        public final int compare(T t10, T t11) {
            com.ironsource.mediationsdk.adunit.a.a aVar = (com.ironsource.mediationsdk.adunit.a.a) this.f4304a.get(((c) t10).n());
            int i10 = Integer.MAX_VALUE;
            Integer valueOf = Integer.valueOf(aVar != null ? aVar.e() : Integer.MAX_VALUE);
            com.ironsource.mediationsdk.adunit.a.a aVar2 = (com.ironsource.mediationsdk.adunit.a.a) this.f4304a.get(((c) t11).n());
            if (aVar2 != null) {
                i10 = aVar2.e();
            }
            Integer valueOf2 = Integer.valueOf(i10);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    public f(com.ironsource.mediationsdk.adunit.c.a.a aVar) {
        x8.f.f(aVar, "managerData");
        this.f4303a = aVar;
    }

    public static List<Smash> a(List<? extends Smash> list, Map<String, ? extends com.ironsource.mediationsdk.adunit.a.a> map) {
        x8.f.f(list, "waterfall");
        x8.f.f(map, "waterfallFromServer");
        a aVar = new a(map);
        if (list.size() <= 1) {
            return d.w(list);
        }
        Object[] array = list.toArray(new Object[0]);
        x8.f.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, aVar);
        }
        return e.Y(array);
    }

    public final boolean a(c<?> cVar, List<Smash> list, Map<String, com.ironsource.mediationsdk.adunit.a.a> map) {
        T t10;
        x8.f.f(cVar, "smash");
        x8.f.f(list, "waterfall");
        x8.f.f(map, "waterfallFromServer");
        Iterator<T> it = a(list, map).iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (!((c) t10).h()) {
                break;
            }
        }
        return x8.f.a(t10, cVar);
    }

    public final Smash b(List<? extends Smash> list, Map<String, ? extends com.ironsource.mediationsdk.adunit.a.a> map) {
        T t10;
        x8.f.f(list, "waterfall");
        x8.f.f(map, "waterfallFromServer");
        Iterator<T> it = a(list, map).iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((c) t10).b_()) {
                break;
            }
        }
        return (c) t10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.ironsource.mediationsdk.adunit.e.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.ironsource.mediationsdk.adunit.e.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.ironsource.mediationsdk.adunit.e.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.ironsource.mediationsdk.adunit.e.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01b4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.adunit.e.g<Smash> c(java.util.List<? extends Smash> r10, java.util.Map<java.lang.String, ? extends com.ironsource.mediationsdk.adunit.a.a> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "waterfall"
            x8.f.f(r10, r0)
            java.lang.String r0 = "waterfallFromServer"
            x8.f.f(r11, r0)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ironsource.mediationsdk.adunit.c.a.a r2 = r9.f4303a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.f4180a
            java.lang.String r2 = r2.name()
            r1.append(r2)
            java.lang.String r2 = " waterfall size: "
            r1.append(r2)
            int r2 = r10.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            com.ironsource.mediationsdk.adunit.c.a.a r0 = r9.f4303a
            boolean r1 = r0.f4183d
            if (r1 == 0) goto L_0x0038
            com.ironsource.mediationsdk.adunit.e.e r1 = com.ironsource.mediationsdk.adunit.e.e.BIDDER_SENSITIVE
            goto L_0x003a
        L_0x0038:
            com.ironsource.mediationsdk.adunit.e.e r1 = com.ironsource.mediationsdk.adunit.e.e.DEFAULT
        L_0x003a:
            com.ironsource.mediationsdk.adunit.e.h$a r2 = com.ironsource.mediationsdk.adunit.e.h.f4306a
            int r4 = r0.f4181b
            java.lang.String r0 = "loadingStrategy"
            x8.f.f(r1, r0)
            int[] r0 = com.ironsource.mediationsdk.adunit.e.h.a.C0049a.f4313a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0063
            r2 = 2
            if (r0 != r2) goto L_0x005d
            com.ironsource.mediationsdk.adunit.e.a r0 = new com.ironsource.mediationsdk.adunit.e.a
            r7 = 0
            r8 = 8
            r3 = r0
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0068
        L_0x005d:
            o8.d r10 = new o8.d
            r10.<init>()
            throw r10
        L_0x0063:
            com.ironsource.mediationsdk.adunit.e.b r0 = new com.ironsource.mediationsdk.adunit.e.b
            r0.<init>(r4, r10, r11)
        L_0x0068:
            java.util.Iterator r10 = r10.iterator()
        L_0x006c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01ba
            java.lang.Object r11 = r10.next()
            com.ironsource.mediationsdk.adunit.d.a.c r11 = (com.ironsource.mediationsdk.adunit.d.a.c) r11
            java.lang.String r2 = "smash"
            x8.f.f(r11, r2)
            boolean r2 = r11.h()
            if (r2 == 0) goto L_0x00ac
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = r11.r()
            java.lang.String r4 = r4.name()
            r3.append(r4)
            java.lang.String r4 = " - smash "
            r3.append(r4)
            java.lang.String r11 = r11.o()
            r3.append(r11)
            java.lang.String r11 = " is failed to load"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            goto L_0x01a7
        L_0x00ac:
            boolean r2 = r11.g()
            java.lang.String r3 = " - Smash "
            if (r2 == 0) goto L_0x00df
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r11.r()
            java.lang.String r5 = r5.name()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r11.o()
            r4.append(r3)
            java.lang.String r3 = " is already loaded"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.verbose(r3)
            java.util.ArrayList r2 = r0.f4311f
            goto L_0x010f
        L_0x00df:
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x0114
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r11.r()
            java.lang.String r5 = r5.name()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r11.o()
            r4.append(r3)
            java.lang.String r3 = " still loading"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.verbose(r3)
            java.util.ArrayList r2 = r0.f4312g
        L_0x010f:
            r2.add(r11)
            goto L_0x01ae
        L_0x0114:
            java.util.List<Smash> r2 = r0.f4308c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x011f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0136
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.ironsource.mediationsdk.adunit.d.a.c r6 = (com.ironsource.mediationsdk.adunit.d.a.c) r6
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x011f
            r4.add(r5)
            goto L_0x011f
        L_0x0136:
            java.util.Iterator r2 = r4.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0142
            r2 = 0
            goto L_0x016d
        L_0x0142:
            java.lang.Object r4 = r2.next()
            com.ironsource.mediationsdk.adunit.d.a.c r4 = (com.ironsource.mediationsdk.adunit.d.a.c) r4
            int r4 = r0.c(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0150:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x016c
            java.lang.Object r5 = r2.next()
            com.ironsource.mediationsdk.adunit.d.a.c r5 = (com.ironsource.mediationsdk.adunit.d.a.c) r5
            int r5 = r0.c(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r4.compareTo(r5)
            if (r6 <= 0) goto L_0x0150
            r4 = r5
            goto L_0x0150
        L_0x016c:
            r2 = r4
        L_0x016d:
            if (r2 == 0) goto L_0x0174
            int r2 = r2.intValue()
            goto L_0x0177
        L_0x0174:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0177:
            int r4 = r0.c(r11)
            if (r2 >= r4) goto L_0x017f
            r2 = r1
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            if (r2 == 0) goto L_0x01ab
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = r11.r()
            java.lang.String r5 = r5.name()
            r4.append(r5)
            r4.append(r3)
            java.lang.String r11 = r11.o()
            r4.append(r11)
            java.lang.String r11 = " is not better than already loaded smashes"
            r4.append(r11)
            java.lang.String r11 = r4.toString()
        L_0x01a7:
            r2.verbose(r11)
            goto L_0x01ae
        L_0x01ab:
            r0.a(r11)
        L_0x01ae:
            boolean r11 = r0.a()
            if (r11 == 0) goto L_0x006c
            com.ironsource.mediationsdk.adunit.e.g r10 = new com.ironsource.mediationsdk.adunit.e.g
            r10.<init>(r0)
            return r10
        L_0x01ba:
            com.ironsource.mediationsdk.adunit.e.g r10 = new com.ironsource.mediationsdk.adunit.e.g
            r10.<init>(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.f.c(java.util.List, java.util.Map):com.ironsource.mediationsdk.adunit.e.g");
    }

    public final boolean a(List<? extends Smash> list) {
        int i10;
        x8.f.f(list, "waterfall");
        if (list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((c) it.next()).g() && (i10 = i10 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (i10 >= this.f4303a.f4181b) {
            return true;
        }
        return false;
    }
}
