package i4;

import java.io.IOException;

public class i1 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7378a = 0;

    public i1(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public i1(String str) {
        super(str);
    }

    public static h1 a() {
        return new h1();
    }

    public static i1 b() {
        return new i1("Protocol message had invalid UTF-8.");
    }

    public static i1 c() {
        return new i1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static i1 d() {
        return new i1("Failed to parse the message.");
    }

    public static i1 e() {
        return new i1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
