package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import com.bumptech.glide.f;
import com.bumptech.glide.i;
import com.bumptech.glide.manager.m;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.o;
import j2.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n4.z;
import x1.r;

public final class n implements Handler.Callback {

    /* renamed from: l  reason: collision with root package name */
    public static final a f2630l = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile o f2631a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2632b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f2633c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2634d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2635e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2636f;

    /* renamed from: g  reason: collision with root package name */
    public final m.b<View, androidx.fragment.app.o> f2637g = new m.b<>();

    /* renamed from: h  reason: collision with root package name */
    public final m.b<View, Fragment> f2638h = new m.b<>();

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f2639i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    public final g f2640j;
    public final k k;

    public class a implements b {
    }

    public interface b {
    }

    public n(b bVar, i iVar) {
        f fVar;
        bVar = bVar == null ? f2630l : bVar;
        this.f2635e = bVar;
        this.f2636f = iVar;
        this.f2634d = new Handler(Looper.getMainLooper(), this);
        this.k = new k(bVar);
        if (!r.f12888h || !r.f12887g) {
            new c6.b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r3v4 ? I:c6.b) =  call: c6.b.<init>():void type: CONSTRUCTOR in method: com.bumptech.glide.manager.n.<init>(com.bumptech.glide.manager.n$b, com.bumptech.glide.i):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r2.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.f2632b = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.f2633c = r0
                m.b r0 = new m.b
                r0.<init>()
                r2.f2637g = r0
                m.b r0 = new m.b
                r0.<init>()
                r2.f2638h = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r2.f2639i = r0
                if (r3 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                com.bumptech.glide.manager.n$a r3 = f2630l
            L_0x002b:
                r2.f2635e = r3
                r2.f2636f = r4
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1, r2)
                r2.f2634d = r0
                com.bumptech.glide.manager.k r0 = new com.bumptech.glide.manager.k
                r0.<init>(r3)
                r2.k = r0
                boolean r3 = x1.r.f12888h
                if (r3 == 0) goto L_0x0060
                boolean r3 = x1.r.f12887g
                if (r3 != 0) goto L_0x004a
                goto L_0x0060
            L_0x004a:
                java.lang.Class<com.bumptech.glide.g> r3 = com.bumptech.glide.g.class
                java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = r4.f2563a
                boolean r3 = r4.containsKey(r3)
                if (r3 == 0) goto L_0x005a
                com.bumptech.glide.manager.f r3 = new com.bumptech.glide.manager.f
                r3.<init>()
                goto L_0x0065
            L_0x005a:
                i4.z7 r3 = new i4.z7
                r3.<init>()
                goto L_0x0065
            L_0x0060:
                c6.b r3 = new c6.b
                r3.<init>()
            L_0x0065:
                r2.f2640j = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.n.<init>(com.bumptech.glide.manager.n$b, com.bumptech.glide.i):void");
        }

        public static Activity a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        public static void c(List list, m.b bVar) {
            View view;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.o oVar = (androidx.fragment.app.o) it.next();
                    if (!(oVar == null || (view = oVar.F) == null)) {
                        bVar.put(view, oVar);
                        c(oVar.k().f1649c.h(), bVar);
                    }
                }
            }
        }

        @TargetApi(26)
        @Deprecated
        public final void b(FragmentManager fragmentManager, m.b<View, Fragment> bVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                for (Fragment fragment : fragmentManager.getFragments()) {
                    if (fragment.getView() != null) {
                        bVar.put(fragment.getView(), fragment);
                        b(fragment.getChildFragmentManager(), bVar);
                    }
                }
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                this.f2639i.putInt("key", i10);
                Fragment fragment2 = null;
                try {
                    fragment2 = fragmentManager.getFragment(this.f2639i, "key");
                } catch (Exception unused) {
                }
                if (fragment2 != null) {
                    if (fragment2.getView() != null) {
                        bVar.put(fragment2.getView(), fragment2);
                        b(fragment2.getChildFragmentManager(), bVar);
                    }
                    i10 = i11;
                } else {
                    return;
                }
            }
        }

        @Deprecated
        public final o d(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z9) {
            m h10 = h(fragmentManager, fragment);
            o oVar = h10.f2626d;
            if (oVar != null) {
                return oVar;
            }
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            b bVar = this.f2635e;
            a aVar = h10.f2623a;
            m.a aVar2 = h10.f2624b;
            ((a) bVar).getClass();
            o oVar2 = new o(b10, aVar, aVar2, context);
            if (z9) {
                oVar2.onStart();
            }
            h10.f2626d = oVar2;
            return oVar2;
        }

        @Deprecated
        public final o e(Activity activity) {
            boolean z9;
            if (l.i()) {
                return f(activity.getApplicationContext());
            }
            if (activity instanceof p) {
                return g((p) activity);
            }
            if (!activity.isDestroyed()) {
                this.f2640j.f();
                FragmentManager fragmentManager = activity.getFragmentManager();
                Activity a10 = a(activity);
                if (a10 == null || !a10.isFinishing()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return d(activity, fragmentManager, (Fragment) null, z9);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        public final o f(Context context) {
            boolean z9;
            if (context != null) {
                char[] cArr = l.f8029a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && !(context instanceof Application)) {
                    if (context instanceof p) {
                        return g((p) context);
                    }
                    if (context instanceof Activity) {
                        return e((Activity) context);
                    }
                    if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return f(contextWrapper.getBaseContext());
                        }
                    }
                }
                if (this.f2631a == null) {
                    synchronized (this) {
                        if (this.f2631a == null) {
                            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context.getApplicationContext());
                            b bVar = this.f2635e;
                            c6.b bVar2 = new c6.b(0);
                            z zVar = new z();
                            Context applicationContext = context.getApplicationContext();
                            ((a) bVar).getClass();
                            this.f2631a = new o(b10, bVar2, zVar, applicationContext);
                        }
                    }
                }
                return this.f2631a;
            }
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }

        public final o g(p pVar) {
            boolean z9;
            if (l.i()) {
                return f(pVar.getApplicationContext());
            }
            if (!pVar.isDestroyed()) {
                this.f2640j.f();
                androidx.fragment.app.z w = pVar.w();
                Activity a10 = a(pVar);
                if (a10 == null || !a10.isFinishing()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z10 = z9;
                if (!this.f2636f.f2563a.containsKey(f.class)) {
                    return j(pVar, w, (androidx.fragment.app.o) null, z10);
                }
                Context applicationContext = pVar.getApplicationContext();
                return this.k.a(applicationContext, com.bumptech.glide.b.b(applicationContext), pVar.f230d, pVar.w(), z10);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        public final m h(FragmentManager fragmentManager, Fragment fragment) {
            m mVar = (m) this.f2632b.get(fragmentManager);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = (m) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (mVar2 == null) {
                mVar2 = new m();
                mVar2.f2628f = fragment;
                if (!(fragment == null || fragment.getActivity() == null)) {
                    mVar2.a(fragment.getActivity());
                }
                this.f2632b.put(fragmentManager, mVar2);
                fragmentManager.beginTransaction().add(mVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f2634d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return mVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.app.FragmentManager} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x013c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                int r2 = r1.arg1
                r3 = 1
                r4 = 0
                if (r2 != r3) goto L_0x000c
                r2 = r3
                goto L_0x000d
            L_0x000c:
                r2 = r4
            L_0x000d:
                int r5 = r1.what
                java.lang.String r6 = "We failed to add our Fragment the first time around, trying again..."
                r7 = 3
                java.lang.String r8 = " New: "
                java.lang.String r9 = "We've added two fragments with requests! Old: "
                java.lang.String r10 = "com.bumptech.glide.manager"
                r11 = 5
                java.lang.String r12 = "RMRetriever"
                if (r5 == r3) goto L_0x00bc
                r14 = 2
                if (r5 == r14) goto L_0x0023
                r3 = r4
                goto L_0x0147
            L_0x0023:
                java.lang.Object r1 = r1.obj
                androidx.fragment.app.y r1 = (androidx.fragment.app.y) r1
                java.util.HashMap r5 = r0.f2633c
                java.lang.Object r5 = r5.get(r1)
                com.bumptech.glide.manager.s r5 = (com.bumptech.glide.manager.s) r5
                androidx.fragment.app.o r15 = r1.D(r10)
                com.bumptech.glide.manager.s r15 = (com.bumptech.glide.manager.s) r15
                if (r15 != r5) goto L_0x0039
                goto L_0x00b5
            L_0x0039:
                if (r15 == 0) goto L_0x005b
                com.bumptech.glide.o r13 = r15.X
                if (r13 != 0) goto L_0x0040
                goto L_0x005b
            L_0x0040:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r9)
                r2.append(r15)
                r2.append(r8)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x005b:
                if (r2 != 0) goto L_0x0094
                boolean r2 = r1.B
                if (r2 == 0) goto L_0x0062
                goto L_0x0094
            L_0x0062:
                androidx.fragment.app.a r2 = new androidx.fragment.app.a
                r2.<init>(r1)
                r2.c(r4, r5, r10, r3)
                if (r15 == 0) goto L_0x006f
                r2.i(r15)
            L_0x006f:
                boolean r5 = r2.f1496g
                if (r5 != 0) goto L_0x008c
                androidx.fragment.app.y r5 = r2.f1409p
                r5.z(r2, r3)
                android.os.Handler r2 = r0.f2634d
                android.os.Message r2 = r2.obtainMessage(r14, r3, r4, r1)
                r2.sendToTarget()
                boolean r2 = android.util.Log.isLoggable(r12, r7)
                if (r2 == 0) goto L_0x008a
                android.util.Log.d(r12, r6)
            L_0x008a:
                r2 = r4
                goto L_0x00b6
            L_0x008c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "This transaction is already being added to the back stack"
                r1.<init>(r2)
                throw r1
            L_0x0094:
                boolean r2 = r1.B
                if (r2 == 0) goto L_0x00a4
                boolean r2 = android.util.Log.isLoggable(r12, r11)
                if (r2 == 0) goto L_0x00b0
                java.lang.String r2 = "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"
                android.util.Log.w(r12, r2)
                goto L_0x00b0
            L_0x00a4:
                r2 = 6
                boolean r2 = android.util.Log.isLoggable(r12, r2)
                if (r2 == 0) goto L_0x00b0
                java.lang.String r2 = "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup"
                android.util.Log.e(r12, r2)
            L_0x00b0:
                com.bumptech.glide.manager.a r2 = r5.T
                r2.a()
            L_0x00b5:
                r2 = r3
            L_0x00b6:
                if (r2 == 0) goto L_0x0147
                java.util.HashMap r2 = r0.f2633c
                goto L_0x013e
            L_0x00bc:
                java.lang.Object r1 = r1.obj
                android.app.FragmentManager r1 = (android.app.FragmentManager) r1
                java.util.HashMap r5 = r0.f2632b
                java.lang.Object r5 = r5.get(r1)
                com.bumptech.glide.manager.m r5 = (com.bumptech.glide.manager.m) r5
                android.app.Fragment r13 = r1.findFragmentByTag(r10)
                com.bumptech.glide.manager.m r13 = (com.bumptech.glide.manager.m) r13
                if (r13 != r5) goto L_0x00d1
                goto L_0x0139
            L_0x00d1:
                if (r13 == 0) goto L_0x00f3
                com.bumptech.glide.o r14 = r13.f2626d
                if (r14 != 0) goto L_0x00d8
                goto L_0x00f3
            L_0x00d8:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r9)
                r2.append(r13)
                r2.append(r8)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00f3:
                if (r2 != 0) goto L_0x0120
                boolean r2 = r1.isDestroyed()
                if (r2 == 0) goto L_0x00fc
                goto L_0x0120
            L_0x00fc:
                android.app.FragmentTransaction r2 = r1.beginTransaction()
                android.app.FragmentTransaction r2 = r2.add(r5, r10)
                if (r13 == 0) goto L_0x0109
                r2.remove(r13)
            L_0x0109:
                r2.commitAllowingStateLoss()
                android.os.Handler r2 = r0.f2634d
                android.os.Message r2 = r2.obtainMessage(r3, r3, r4, r1)
                r2.sendToTarget()
                boolean r2 = android.util.Log.isLoggable(r12, r7)
                if (r2 == 0) goto L_0x011e
                android.util.Log.d(r12, r6)
            L_0x011e:
                r2 = r4
                goto L_0x013a
            L_0x0120:
                boolean r2 = android.util.Log.isLoggable(r12, r11)
                if (r2 == 0) goto L_0x0134
                boolean r2 = r1.isDestroyed()
                if (r2 == 0) goto L_0x012f
                java.lang.String r2 = "Parent was destroyed before our Fragment could be added"
                goto L_0x0131
            L_0x012f:
                java.lang.String r2 = "Tried adding Fragment twice and failed twice, giving up!"
            L_0x0131:
                android.util.Log.w(r12, r2)
            L_0x0134:
                com.bumptech.glide.manager.a r2 = r5.f2623a
                r2.a()
            L_0x0139:
                r2 = r3
            L_0x013a:
                if (r2 == 0) goto L_0x0147
                java.util.HashMap r2 = r0.f2632b
            L_0x013e:
                r13 = r1
                java.lang.Object r1 = r2.remove(r13)
                r2 = r13
                r13 = r1
                r1 = r3
                goto L_0x014b
            L_0x0147:
                r1 = r3
                r3 = r4
                r2 = 0
                r13 = 0
            L_0x014b:
                boolean r4 = android.util.Log.isLoggable(r12, r11)
                if (r4 == 0) goto L_0x0169
                if (r3 == 0) goto L_0x0169
                if (r13 != 0) goto L_0x0169
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to remove expected request manager fragment, manager: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.w(r12, r2)
            L_0x0169:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.n.handleMessage(android.os.Message):boolean");
        }

        public final s i(y yVar, androidx.fragment.app.o oVar) {
            s sVar = (s) this.f2633c.get(yVar);
            if (sVar != null) {
                return sVar;
            }
            s sVar2 = (s) yVar.D("com.bumptech.glide.manager");
            if (sVar2 == null) {
                sVar2 = new s();
                sVar2.Y = oVar;
                if (!(oVar == null || oVar.l() == null)) {
                    androidx.fragment.app.o oVar2 = oVar;
                    while (true) {
                        androidx.fragment.app.o oVar3 = oVar2.f1581v;
                        if (oVar3 == null) {
                            break;
                        }
                        oVar2 = oVar3;
                    }
                    y yVar2 = oVar2.f1579s;
                    if (yVar2 != null) {
                        sVar2.b0(oVar.l(), yVar2);
                    }
                }
                this.f2633c.put(yVar, sVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                aVar.c(0, sVar2, "com.bumptech.glide.manager", 1);
                aVar.g(true);
                this.f2634d.obtainMessage(2, yVar).sendToTarget();
            }
            return sVar2;
        }

        public final o j(Context context, y yVar, androidx.fragment.app.o oVar, boolean z9) {
            s i10 = i(yVar, oVar);
            o oVar2 = i10.X;
            if (oVar2 != null) {
                return oVar2;
            }
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            b bVar = this.f2635e;
            a aVar = i10.T;
            s.a aVar2 = i10.U;
            ((a) bVar).getClass();
            o oVar3 = new o(b10, aVar, aVar2, context);
            if (z9) {
                oVar3.onStart();
            }
            i10.X = oVar3;
            return oVar3;
        }
    }
