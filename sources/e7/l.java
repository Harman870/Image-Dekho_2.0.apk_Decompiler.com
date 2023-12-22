package e7;

import h7.o;
import java.io.IOException;
import java.io.StringWriter;
import k7.b;

public abstract class l {
    public final p a() {
        if (this instanceof p) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            b bVar = new b(stringWriter);
            bVar.f9137e = true;
            o.A.b(bVar, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
