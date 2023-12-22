package i4;

import java.nio.charset.Charset;

public final class u1 {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f7698b = new s1();

    /* renamed from: a  reason: collision with root package name */
    public final t1 f7699a;

    public u1() {
        a2 a2Var;
        a2[] a2VarArr = new a2[2];
        a2VarArr[0] = y0.f7801a;
        try {
            a2Var = (a2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            a2Var = f7698b;
        }
        a2VarArr[1] = a2Var;
        t1 t1Var = new t1(a2VarArr);
        Charset charset = g1.f7324a;
        this.f7699a = t1Var;
    }
}
