package t9;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface g extends y, ReadableByteChannel {
    void D(long j10);

    long H();

    int I(r rVar);

    String J(Charset charset);

    InputStream K();

    h b(long j10);

    @Deprecated
    e d();

    String l();

    boolean p();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    String w(long j10);

    long x(e eVar);
}
