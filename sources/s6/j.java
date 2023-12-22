package s6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f11894a;

    public j(Context context, String str) {
        this.f11894a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j10 = this.f11894a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f11894a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f11894a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f11894a.edit().putStringSet(str2, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f11894a.edit();
        for (Map.Entry next : this.f11894a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized java.util.ArrayList c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r1 = r5.f11894a     // Catch:{ all -> 0x005c }
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x005c }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005c }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x005c }
            boolean r3 = r3 instanceof java.util.Set     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x005c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x005c }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x005c }
            r4.<init>(r2)     // Catch:{ all -> 0x005c }
            s6.a r2 = new s6.a     // Catch:{ all -> 0x005c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005c }
            r0.add(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0014
        L_0x0042:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            monitor-enter(r5)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r3 = r5.f11894a     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "fire-global"
            android.content.SharedPreferences$Editor r1 = r3.putLong(r4, r1)     // Catch:{ all -> 0x0059 }
            r1.commit()     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.j.c():java.util.ArrayList");
    }

    public final synchronized String d(long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j10).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    public final synchronized String e(String str) {
        for (Map.Entry next : this.f11894a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        String e10 = e(str);
        if (e10 != null) {
            HashSet hashSet = new HashSet(this.f11894a.getStringSet(e10, new HashSet()));
            hashSet.remove(str);
            (hashSet.isEmpty() ? this.f11894a.edit().remove(e10) : this.f11894a.edit().putStringSet(e10, hashSet)).commit();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean g(long r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fire-global"
            monitor-enter(r5)
            android.content.SharedPreferences r1 = r5.f11894a     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 == 0) goto L_0x0039
            android.content.SharedPreferences r1 = r5.f11894a     // Catch:{ all -> 0x0048 }
            r3 = -1
            long r3 = r1.getLong(r0, r3)     // Catch:{ all -> 0x0048 }
            monitor-enter(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r5.d(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = r5.d(r6)     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0033
            android.content.SharedPreferences r1 = r5.f11894a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0033:
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0039:
            android.content.SharedPreferences r1 = r5.f11894a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.j.g(long):boolean");
    }

    public final synchronized void h(long j10, String str) {
        String d10 = d(j10);
        if (this.f11894a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 != null) {
                if (!e10.equals(str)) {
                    i(str, d10);
                    return;
                }
                return;
            }
            return;
        }
        long j11 = this.f11894a.getLong("fire-count", 0);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f11894a.getLong("fire-count", 0);
        }
        HashSet hashSet = new HashSet(this.f11894a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f11894a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f11894a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f11894a.edit().putStringSet(str, hashSet).commit();
    }
}
