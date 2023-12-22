package t9;

import java.io.OutputStream;

public final class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12042a;

    public d(e eVar) {
        this.f12042a = eVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f12042a + ".outputStream()";
    }

    public final void write(int i10) {
        this.f12042a.R((byte) i10);
    }

    public final void write(byte[] bArr, int i10, int i11) {
        this.f12042a.write(bArr, i10, i11);
    }
}
