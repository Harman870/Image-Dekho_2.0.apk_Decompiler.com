package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.activity.f;
import com.google.firebase.components.ComponentRegistrar;
import g6.b;
import g6.c;
import g6.d;
import j6.a;
import j6.q;
import j6.t;
import j6.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import k6.m;
import k6.n;
import k6.o;
import k6.p;
import k6.r;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    public static final q<ScheduledExecutorService> f3480a = new q<>(new t(1));

    /* renamed from: b  reason: collision with root package name */
    public static final q<ScheduledExecutorService> f3481b = new q<>(new m());

    /* renamed from: c  reason: collision with root package name */
    public static final q<ScheduledExecutorService> f3482c = new q<>(new n());

    /* renamed from: d  reason: collision with root package name */
    public static final q<ScheduledExecutorService> f3483d = new q<>(new o());

    public final List<a<?>> getComponents() {
        a[] aVarArr = new a[4];
        v vVar = new v(g6.a.class, ScheduledExecutorService.class);
        v[] vVarArr = {new v(g6.a.class, ExecutorService.class), new v(g6.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(vVar);
        int length = vVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (vVarArr[i10] != null) {
                i10++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, vVarArr);
        String str = "Null interface";
        aVarArr[0] = new a((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new p(0), hashSet3);
        v vVar2 = new v(b.class, ScheduledExecutorService.class);
        v[] vVarArr2 = {new v(b.class, ExecutorService.class), new v(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(vVar2);
        int length2 = vVarArr2.length;
        int i11 = 0;
        while (i11 < length2) {
            if (vVarArr2[i11] != null) {
                i11++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet4, vVarArr2);
        aVarArr[1] = new a((String) null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new k6.q(0), hashSet6);
        v vVar3 = new v(c.class, ScheduledExecutorService.class);
        v[] vVarArr3 = {new v(c.class, ExecutorService.class), new v(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(vVar3);
        int length3 = vVarArr3.length;
        int i12 = 0;
        while (i12 < length3) {
            if (vVarArr3[i12] != null) {
                i12++;
            } else {
                throw new NullPointerException(str);
            }
        }
        Collections.addAll(hashSet7, vVarArr3);
        aVarArr[2] = new a((String) null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new f(), hashSet9);
        v vVar4 = new v(d.class, Executor.class);
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(vVar4);
        Collections.addAll(hashSet10, new v[0]);
        aVarArr[3] = new a((String) null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new r(), hashSet12);
        return Arrays.asList(aVarArr);
    }
}
