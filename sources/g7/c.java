package g7;

import e7.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, i<?>> f6590a;

    public class a implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f6591a;

        public a(i iVar, Type type) {
            this.f6591a = iVar;
        }

        public final T j() {
            return this.f6591a.a();
        }
    }

    public class b implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f6592a;

        public b(i iVar, Type type) {
            this.f6592a = iVar;
        }

        public final T j() {
            return this.f6592a.a();
        }
    }

    public c(Map<Type, i<?>> map) {
        this.f6590a = map;
    }

    public final <T> m<T> a(j7.a<T> aVar) {
        d dVar;
        Type type = aVar.f8777b;
        Class<? super T> cls = aVar.f8776a;
        i iVar = this.f6590a.get(type);
        if (iVar != null) {
            return new a(iVar, type);
        }
        i iVar2 = this.f6590a.get(cls);
        if (iVar2 != null) {
            return new b(iVar2, type);
        }
        f fVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            dVar = new d(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                new e
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR  (r1v35 ? I:g7.e) =  call: g7.e.<init>():void type: CONSTRUCTOR in method: g7.c.a(j7.a):g7.m<T>, dex: classes.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v35 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    java.lang.reflect.Type r0 = r6.f8777b
                    java.lang.Class<? super T> r6 = r6.f8776a
                    java.util.Map<java.lang.reflect.Type, e7.i<?>> r1 = r5.f6590a
                    java.lang.Object r1 = r1.get(r0)
                    e7.i r1 = (e7.i) r1
                    if (r1 == 0) goto L_0x0014
                    g7.c$a r6 = new g7.c$a
                    r6.<init>(r1, r0)
                    return r6
                L_0x0014:
                    java.util.Map<java.lang.reflect.Type, e7.i<?>> r1 = r5.f6590a
                    java.lang.Object r1 = r1.get(r6)
                    e7.i r1 = (e7.i) r1
                    if (r1 == 0) goto L_0x0024
                    g7.c$b r6 = new g7.c$b
                    r6.<init>(r1, r0)
                    return r6
                L_0x0024:
                    r1 = 0
                    r2 = 0
                    java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x003c }
                    java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x003c }
                    boolean r4 = r3.isAccessible()     // Catch:{ NoSuchMethodException -> 0x003c }
                    if (r4 != 0) goto L_0x0036
                    r4 = 1
                    r3.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x003c }
                L_0x0036:
                    g7.d r4 = new g7.d     // Catch:{ NoSuchMethodException -> 0x003c }
                    r4.<init>(r3)     // Catch:{ NoSuchMethodException -> 0x003c }
                    goto L_0x003d
                L_0x003c:
                    r4 = r1
                L_0x003d:
                    if (r4 == 0) goto L_0x0040
                    return r4
                L_0x0040:
                    java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x0089
                    java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0057
                    g7.e r1 = new g7.e
                    r1.<init>()
                    goto L_0x00e9
                L_0x0057:
                    java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0066
                    g7.f r1 = new g7.f
                    r1.<init>(r0)
                    goto L_0x00e9
                L_0x0066:
                    java.lang.Class<java.util.Set> r1 = java.util.Set.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0075
                    g7.g r1 = new g7.g
                    r1.<init>()
                    goto L_0x00e9
                L_0x0075:
                    java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x0083
                    androidx.lifecycle.c0 r1 = new androidx.lifecycle.c0
                    r1.<init>()
                    goto L_0x00e9
                L_0x0083:
                    g7.h r1 = new g7.h
                    r1.<init>()
                    goto L_0x00e9
                L_0x0089:
                    java.lang.Class<java.util.Map> r3 = java.util.Map.class
                    boolean r3 = r3.isAssignableFrom(r6)
                    if (r3 == 0) goto L_0x00e9
                    java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r1 = java.util.concurrent.ConcurrentNavigableMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x009f
                    g7.i r1 = new g7.i
                    r1.<init>()
                    goto L_0x00e9
                L_0x009f:
                    java.lang.Class<java.util.concurrent.ConcurrentMap> r1 = java.util.concurrent.ConcurrentMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00ad
                    c6.b r1 = new c6.b
                    r1.<init>()
                    goto L_0x00e9
                L_0x00ad:
                    java.lang.Class<java.util.SortedMap> r1 = java.util.SortedMap.class
                    boolean r1 = r1.isAssignableFrom(r6)
                    if (r1 == 0) goto L_0x00bb
                    c.a r1 = new c.a
                    r1.<init>()
                    goto L_0x00e9
                L_0x00bb:
                    boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
                    if (r1 == 0) goto L_0x00e4
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r3 = r0
                    java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
                    java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
                    r2 = r3[r2]
                    r2.getClass()
                    java.lang.reflect.Type r2 = g7.a.a(r2)
                    java.lang.Class r3 = g7.a.e(r2)
                    r2.hashCode()
                    boolean r1 = r1.isAssignableFrom(r3)
                    if (r1 != 0) goto L_0x00e4
                    y3.a r1 = new y3.a
                    r1.<init>()
                    goto L_0x00e9
                L_0x00e4:
                    z5.c r1 = new z5.c
                    r1.<init>()
                L_0x00e9:
                    if (r1 == 0) goto L_0x00ec
                    return r1
                L_0x00ec:
                    g7.b r1 = new g7.b
                    r1.<init>(r6, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: g7.c.a(j7.a):g7.m");
            }

            public final String toString() {
                return this.f6590a.toString();
            }
        }
