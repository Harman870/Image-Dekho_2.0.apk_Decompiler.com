package j4;

import java.nio.charset.Charset;

public final class g8 {

    /* renamed from: b  reason: collision with root package name */
    public static final d8 f8200b = new d8();

    /* renamed from: a  reason: collision with root package name */
    public final e8 f8201a;

    public g8() {
        m8 m8Var;
        m8[] m8VarArr = new m8[2];
        m8VarArr[0] = h7.f8216a;
        try {
            m8Var = (m8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            m8Var = f8200b;
        }
        m8VarArr[1] = m8Var;
        e8 e8Var = new e8(m8VarArr);
        Charset charset = s7.f8462a;
        this.f8201a = e8Var;
    }
}
