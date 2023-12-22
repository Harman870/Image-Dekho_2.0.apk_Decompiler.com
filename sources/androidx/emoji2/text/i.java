package androidx.emoji2.text;

import java.nio.ByteBuffer;
import r0.a;
import r0.b;

public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f1366d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1367a;

    /* renamed from: b  reason: collision with root package name */
    public final n f1368b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1369c = 0;

    public i(n nVar, int i10) {
        this.f1368b = nVar;
        this.f1367a = i10;
    }

    public final int a(int i10) {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c10.f11456b;
        int i11 = a10 + c10.f11455a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i10 = a10 + c10.f11455a;
        return c10.f11456b.getInt(c10.f11456b.getInt(i10) + i10);
    }

    public final a c() {
        short s10;
        ThreadLocal<a> threadLocal = f1366d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1368b.f1392a;
        int i10 = this.f1367a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f11455a;
            int i12 = (i10 * 4) + bVar.f11456b.getInt(i11) + i11 + 4;
            int i13 = bVar.f11456b.getInt(i12) + i12;
            ByteBuffer byteBuffer = bVar.f11456b;
            aVar.f11456b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f11455a = i13;
                int i14 = i13 - byteBuffer.getInt(i13);
                aVar.f11457c = i14;
                s10 = aVar.f11456b.getShort(i14);
            } else {
                s10 = 0;
                aVar.f11455a = 0;
                aVar.f11457c = 0;
            }
            aVar.f11458d = s10;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c10 = c();
        int a10 = c10.a(4);
        if (a10 != 0) {
            i10 = c10.f11456b.getInt(a10 + c10.f11455a);
        } else {
            i10 = 0;
        }
        sb.append(Integer.toHexString(i10));
        sb.append(", codepoints:");
        int b10 = b();
        for (int i11 = 0; i11 < b10; i11++) {
            sb.append(Integer.toHexString(a(i11)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
