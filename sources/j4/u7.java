package j4;

import java.io.IOException;

public class u7 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8494a = 0;

    public u7(String str) {
        super(str);
    }

    public static u7 a() {
        return new u7("Protocol message had invalid UTF-8.");
    }

    public static u7 b() {
        return new u7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static u7 c() {
        return new u7("Failed to parse the message.");
    }

    public static u7 d() {
        return new u7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
