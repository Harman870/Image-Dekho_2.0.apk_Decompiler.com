package j4;

import j4.i7;
import j4.m7;
import java.io.IOException;

public class i7<MessageType extends m7<MessageType, BuilderType>, BuilderType extends i7<MessageType, BuilderType>> extends e6<MessageType, BuilderType> {

    /* renamed from: a  reason: collision with root package name */
    public final m7 f8237a;

    /* renamed from: b  reason: collision with root package name */
    public m7 f8238b;

    public i7(MessageType messagetype) {
        this.f8237a = messagetype;
        if (!messagetype.r()) {
            this.f8238b = (m7) messagetype.s(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: f */
    public final i7 clone() {
        i7 i7Var = (i7) this.f8237a.s(5);
        i7Var.f8238b = i();
        return i7Var;
    }

    public final void g(byte[] bArr, int i10, y6 y6Var) {
        if (!this.f8238b.r()) {
            m7 m7Var = (m7) this.f8237a.s(4);
            v8.f8521c.a(m7Var.getClass()).c(m7Var, this.f8238b);
            this.f8238b = m7Var;
        }
        try {
            v8.f8521c.a(this.f8238b.getClass()).h(this.f8238b, bArr, 0, i10, new i6(y6Var));
        } catch (u7 e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw u7.d();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r1 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType h() {
        /*
            r3 = this;
            j4.m7 r0 = r3.i()
            r1 = 1
            java.lang.Object r2 = r0.s(r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r1) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            if (r2 == 0) goto L_0x0029
            j4.v8 r1 = j4.v8.f8521c
            java.lang.Class r2 = r0.getClass()
            j4.y8 r1 = r1.a(r2)
            boolean r1 = r1.e(r0)
            r2 = 2
            r0.s(r2)
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            return r0
        L_0x0029:
            e1.c r0 = new e1.c
            r1 = 0
            r0.<init>((int) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.i7.h():j4.m7");
    }

    public final MessageType i() {
        if (!this.f8238b.r()) {
            return this.f8238b;
        }
        m7 m7Var = this.f8238b;
        m7Var.getClass();
        v8.f8521c.a(m7Var.getClass()).a(m7Var);
        m7Var.o();
        return this.f8238b;
    }

    public final void j() {
        if (!this.f8238b.r()) {
            m7 m7Var = (m7) this.f8237a.s(4);
            v8.f8521c.a(m7Var.getClass()).c(m7Var, this.f8238b);
            this.f8238b = m7Var;
        }
    }
}
